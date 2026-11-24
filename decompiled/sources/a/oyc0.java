package a;

import java.util.Arrays;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oyc0 extends xo implements zdr {
    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gfe gfeVar = (gfe) obj;
        gfe gfeVar2 = (gfe) obj2;
        gfe gfeVar3 = (gfe) obj3;
        gfe gfeVar4 = (gfe) obj4;
        qyc0 qyc0Var = (qyc0) this.f41192a;
        List list = (List) qyc0Var.B.f40549a.getValue();
        String strA = qyc0Var.p.a().Z1;
        if (strA.length() == 0) {
            strA = qyc0Var.l.b.a(R.string.one_x_club, Arrays.copyOf(new Object[0], 0));
        }
        String str = strA;
        zuc0 zuc0Var = qyc0Var.u;
        lc00 lc00VarW = qyc0Var.w();
        ctf0 ctf0Var = qyc0Var.l;
        qyc0Var.n.j();
        return fww.w(list, zuc0Var, ctf0Var, lc00VarW, gfeVar, null, gfeVar2, gfeVar3, gfeVar4, null, qyc0Var.r, str, 784);
    }
}
