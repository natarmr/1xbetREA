package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class y5p0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42060a;
    public final /* synthetic */ List b;
    public final /* synthetic */ a4x c;

    public /* synthetic */ y5p0(List list, a4x a4xVar, byte b) {
        this.f42060a = b;
        this.b = list;
        this.c = a4xVar;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        byte b = this.f42060a;
        a4x a4xVar = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    d6p0 d6p0Var = (d6p0) list.get(iIntValue);
                    fetVar.e0(904292412);
                    int i3 = q3d.i(a4xVar);
                    mm40 mm40VarN = jm40.b;
                    if (iIntValue == i3) {
                        zcl zclVar = qmk.f28987a;
                        mm40VarN = s5x0.N(mm40VarN, 0.0f, 0.0f, 0.0f, 28.0f, 7);
                    }
                    if (d6p0Var != null) {
                        if (d6p0Var instanceof b6p0) {
                            fetVar.e0(904580649);
                            b34.P(mm40VarN, (b6p0) d6p0Var, fetVar, 0);
                            fetVar.r(false);
                        } else if (d6p0Var instanceof c6p0) {
                            fetVar.e0(904868453);
                            kc5.C0(mm40VarN, (c6p0) d6p0Var, fetVar, 0);
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    }
                    throw b1j.f(167724472, fetVar, false);
                }
                fetVar.X();
                return Unit.f46060a;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    zhs0 zhs0Var = (zhs0) list.get(iIntValue3);
                    fetVar2.e0(1301221576);
                    zcl zclVar2 = qmk.f28987a;
                    iom0.d(s5x0.M(jm40.b, xfn.a(fetVar2).d, 12.0f, xfn.a(fetVar2).d, iIntValue3 == q3d.i(a4xVar) ? 24.0f : 0.0f), zhs0Var, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }
}
