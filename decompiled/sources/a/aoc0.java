package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aoc0 extends xo implements xdr {
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        gfe gfeVar = (gfe) obj;
        gfe gfeVar2 = (gfe) obj2;
        doc0 doc0Var = (doc0) this.f41192a;
        List list = (List) doc0Var.v.f40549a.getValue();
        lc00 lc00VarW = doc0Var.w();
        ctf0 ctf0Var = doc0Var.k;
        doc0Var.l.j();
        qho qhoVar = doc0Var.o;
        list.getClass();
        ctf0Var.getClass();
        lc00VarW.getClass();
        gfeVar.getClass();
        gfeVar2.getClass();
        qhoVar.getClass();
        if (!q3d.j(gfeVar, gfeVar2).contains(dfe.f5996a)) {
            List listX = fww.x(list, gfeVar, ctf0Var, lc00VarW);
            if (gfeVar2 instanceof afe) {
                for (etc0 etc0Var : (Iterable) ((afe) gfeVar2).f774a) {
                    listX = fww.H(listX, etc0Var.b, g1x.E(etc0Var.d), "", qhoVar);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : listX) {
                    if (!(((p6t0) obj4) instanceof htc0)) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            }
            if (gfeVar2.equals(yee.f42482a)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : listX) {
                    p6t0 p6t0Var = (p6t0) obj5;
                    if (!(p6t0Var instanceof ptc0) && !(p6t0Var instanceof htc0)) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            }
        }
        return lc00VarW;
    }
}
