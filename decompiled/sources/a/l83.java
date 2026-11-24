package a;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class l83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pair f19590a;

    static {
        iun iunVar = iun.f15405a;
        f19590a = new Pair(iunVar, iunVar);
    }

    public static final void a(j83 j83Var, List list, fet fetVar, int i) {
        fetVar.g0(-1794596951);
        int i2 = (i & 6) == 0 ? (fetVar.g(j83Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.i(list) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i83 i83Var = (i83) list.get(i3);
                xdr xdrVar = (xdr) i83Var.f14321a;
                int i4 = i83Var.b;
                int i5 = i83Var.c;
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = r71.e;
                    fetVar.o0(objP);
                }
                tj30 tj30Var = (tj30) objP;
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30Var, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                xdrVar.F(j83Var.subSequence(i4, i5).b, fetVar, 0);
                fetVar.r(true);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) j83Var, (Object) list, i, (byte) 17);
        }
    }
}
