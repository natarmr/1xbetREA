package a;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final class ui8 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35718a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ui8(ArrayList arrayList, ArrayList arrayList2, byte b) {
        this.f35718a = b;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        int i2;
        byte b = this.f35718a;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    Pair pair = (Pair) arrayList2.get(iIntValue);
                    fetVar2.e0(-2143297342);
                    pan panVar = (pan) pair.b;
                    zcl zclVar = qmk.f28987a;
                    f1t0.q(s5x0.L(jm40.b, 16.0f, 0.0f, 2), panVar, fetVar2, 0);
                    if (iIntValue != arrayList.size() - 1) {
                        fetVar2.e0(-2143110909);
                        wvb.o(null, 6.0f, 0L, fetVar2, 0, 5);
                        vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar2, 432, 9);
                        wvb.o(null, 6.0f, 0L, fetVar2, 0, 5);
                        fetVar = fetVar2;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar2;
                        fetVar.e0(-2142795701);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar3.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar3.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
                    gta0 gta0Var = (gta0) arrayList2.get(iIntValue3);
                    fetVar3.e0(-673758320);
                    zcl zclVar2 = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 16.0f, 5);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarN);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(e7z.u1);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    v8q0.a(gta0Var.b, s5x0.L(jm40Var, 16.0f, 0.0f, 2), ((ThemeColors) fetVar3.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar3, 0, 384, 126968);
                    kkb.m(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), gta0Var.c, null, 5, 0L, 0L, fetVar3, 0, 52);
                    fetVar3.r(true);
                    if (iIntValue3 < arrayList.size() - 1) {
                        fetVar3.e0(-672989521);
                        vtb.t(s5x0.N(jm40Var, 0.0f, 32.0f, 0.0f, 0.0f, 13), qqm.f29173a, zfi0.f44303a, 0L, fetVar3, 432, 8);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-672688728);
                        fetVar3.r(false);
                    }
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
