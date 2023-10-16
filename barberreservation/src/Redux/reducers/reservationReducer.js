import { reservation, reservations } from "../initials/reservationInitials";
import {
  GET_LIST,
  GET_BY_ID,
  ADD,
  DELETE,
  UPDATE,
} from "../actions/reservationActions";

const initialvales = {
  reservation,
  reservations,
};
export default function reservationReducer(
  state = initialvales,
  { type, payload }
) {
  switch (type) {
    case GET_LIST:
      return {
        ...state,
        reservations: payload,
      };
    case GET_BY_ID:
      return {
        ...state,
        reservation: payload,
      };
    case ADD:
      return {
        ...state,
        reservations: [...state.reservations, payload],
      };
    case UPDATE:
      return {
        ...state,
        reservations: [
          ...state.reservations.filter((x) => x.id !== payload.id),
          payload,
        ],
      };
    case DELETE:
      return {
        ...state,
        reservations: [...state.reservations.filter((x) => x.id !== payload)],
      };
    default:
      return {
        ...state,
      };
  }
}