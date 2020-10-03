1019. Next Greater Node In Linked List

We are given a linked list with `head` as the first node.  Let's number
the nodes in the list: `node_1, node_2, node_3, ...` etc.

Each node may have a *next larger* **value**:
for `node_i`, `next_larger(node_i)` is the `node_j.val` such that `j >
i`, `node_j.val > node_i.val`, and `j` is the smallest possible choice.  If such
a `j` does not exist, the next larger value is `0`.

Return an array of integers `answer`, where `answer[i] =
next_larger(node_{i+1})`.