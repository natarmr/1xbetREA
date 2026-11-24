package a;

import kotlin.Unit;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vod implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37760a;
    public final /* synthetic */ String b;

    public /* synthetic */ vod(String str, byte b) {
        this.f37760a = b;
        this.b = str;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f37760a) {
            case 0:
                mm40 mm40Var = (mm40) obj2;
                fet fetVar = (fet) obj3;
                int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
                if ((iD & 48) == 0) {
                    iD |= fetVar.g(mm40Var) ? 32 : 16;
                }
                if (fetVar.U(iD & 1, (iD & 145) != 144)) {
                    wdx.k((iD >> 3) & 14, fetVar, mm40Var, this.b);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar2 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                if ((iD2 & 48) == 0) {
                    iD2 |= fetVar2.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar2.U(iD2 & 1, (iD2 & 145) != 144)) {
                    zx7 zx7Var = gqw0.e;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(s5x0.L(mm40Var2, 0.0f, 14.0f, 1), 28.0f);
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    v8q0.a(this.b, mm40VarD, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.m(), fetVar2, 48, 24960, 109560);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                mm40 mm40Var3 = (mm40) obj2;
                fet fetVar3 = (fet) obj3;
                int iD3 = dw9.d((Integer) obj4, (y5d) obj, mm40Var3);
                if ((iD3 & 48) == 0) {
                    iD3 |= fetVar3.g(mm40Var3) ? 32 : 16;
                }
                if (fetVar3.U(iD3 & 1, (iD3 & 145) != 144)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40Var3, 8.0f, 0.0f, 2);
                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                    v8q0.a(this.b, mm40VarL, ((StaticColors) fetVar3.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 4, 0, null, g1t0.m(), fetVar3, 0, 24960, 109560);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
