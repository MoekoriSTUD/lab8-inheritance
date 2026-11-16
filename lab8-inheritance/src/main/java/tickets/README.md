A constructor inside a parent "Ticket" initialises the common fields. And a constructor inside a "StudentTicket"
initialises studentId.

Design question:
A student wants a VIP ticket and qualifies for the student discount. Does the current hierarchy support both
behaviours easily? What limitation does this reveal about inheritance?
No, the current hierarchy does not support both behaviours, as we would need the object to be an instance of both classes
at the same time which isn't an option. We need either a separate class that is going to support both behaviours, or
one class to inherit two other classes at the same time which isn't an option.