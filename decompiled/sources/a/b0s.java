package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface b0s extends p6t0 {
    long a();

    void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2);

    @Override // a.p6t0
    default boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof b0s) && (p6t0Var2 instanceof b0s)) {
            return ((b0s) p6t0Var).a() == ((b0s) p6t0Var2).a();
        }
        return super.g(p6t0Var, p6t0Var2);
    }

    dur getHeader();

    @Override // a.p6t0
    default boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    @Override // a.p6t0
    default List o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof b0s) || !(p6t0Var2 instanceof b0s)) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        b0s b0sVar = (b0s) p6t0Var;
        dur header = b0sVar.getHeader();
        dur header2 = b0sVar.getHeader();
        b0s b0sVar2 = (b0s) p6t0Var2;
        dur header3 = b0sVar2.getHeader();
        header.getClass();
        header2.getClass();
        header3.getClass();
        k9x.G(arrayList, header2.g, header3.g);
        k9x.G(arrayList, new ttr(header2.h), new ttr(header3.h));
        k9x.G(arrayList, new aur(header2.i), new aur(header3.i));
        k9x.G(arrayList, new bur(header2.j), new bur(header3.j));
        k9x.G(arrayList, new utr(header2.k), new utr(header3.k));
        k9x.G(arrayList, new vtr(header2.l), new vtr(header3.l));
        k9x.G(arrayList, new rtr(header2.m), new rtr(header3.m));
        k9x.G(arrayList, new str(header2.n), new str(header3.n));
        qtr qtrVarW0 = b0sVar.w0();
        qtr qtrVarW1 = b0sVar.w0();
        qtr qtrVarW2 = b0sVar2.w0();
        qtrVarW0.getClass();
        qtrVarW1.getClass();
        qtrVarW2.getClass();
        k9x.G(arrayList, qtrVarW1.d, qtrVarW2.d);
        d(arrayList, p6t0Var, p6t0Var2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    qtr w0();
}
