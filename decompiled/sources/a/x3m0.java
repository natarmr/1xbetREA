package a;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class x3m0 implements q6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f40228a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public x3m0(char c) {
        this.f40228a = c;
    }

    @Override // a.q6k
    public final char a() {
        return this.f40228a;
    }

    @Override // a.q6k
    public final void b(e2q0 e2q0Var, e2q0 e2q0Var2, int i) {
        LinkedList<q6k> linkedList = this.c;
        for (q6k q6kVar : linkedList) {
            if (q6kVar.d() <= i) {
                q6kVar.b(e2q0Var, e2q0Var2, i);
            }
        }
        q6kVar = (q6k) linkedList.getFirst();
        q6kVar.b(e2q0Var, e2q0Var2, i);
    }

    @Override // a.q6k
    public final int c(o6k o6kVar, o6k o6kVar2) {
        int i = o6kVar.g;
        LinkedList<q6k> linkedList = this.c;
        for (q6k q6kVar : linkedList) {
            if (q6kVar.d() <= i) {
                return q6kVar.c(o6kVar, o6kVar2);
            }
        }
        q6kVar = (q6k) linkedList.getFirst();
        return q6kVar.c(o6kVar, o6kVar2);
    }

    @Override // a.q6k
    public final int d() {
        return this.b;
    }

    @Override // a.q6k
    public final char e() {
        return this.f40228a;
    }

    public final void f(q6k q6kVar) {
        int iD = q6kVar.d();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iD2 = ((q6k) listIterator.next()).d();
            if (iD > iD2) {
                listIterator.previous();
                listIterator.add(q6kVar);
                return;
            } else if (iD == iD2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f40228a + "' and minimum length " + iD);
            }
        }
        linkedList.add(q6kVar);
        this.b = iD;
    }
}
