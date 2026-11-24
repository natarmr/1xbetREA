package a;

import java.util.List;
import kotlin.Unit;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
public final class gx implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12052a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public gx(List list, rwl0 rwl0Var, boolean z) {
        this.f12052a = (byte) 3;
        this.b = list;
        this.d = rwl0Var;
        this.c = z;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        fet fetVar;
        byte b = this.f12052a;
        jm40 jm40Var = jm40.b;
        boolean z = this.c;
        List list = this.b;
        Object obj5 = this.d;
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
                    ex exVar = (ex) list.get(iIntValue);
                    fetVar2.e0(976219845);
                    vbw0.a(null, exVar, this.c, ((zy) obj5).b, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            case 1:
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
                    fuf fufVar = (fuf) list.get(iIntValue3);
                    fetVar3.e0(1873972037);
                    String str = fufVar.f10159a;
                    gkb.H(null, str, z && str.equals((String) obj5), u1c.M(-2071965275, new f42(fufVar, (byte) 4), fetVar3), fetVar3, 3072);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                break;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = (fetVar4.g(g9zVar3) ? 4 : 2) | iIntValue6;
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar4.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar4.U(i3 & 1, (i3 & 147) != 146)) {
                    bkg0 bkg0Var = (bkg0) list.get(iIntValue5);
                    fetVar4.e0(604252200);
                    j120.C(g9z.b(g9zVar3, jm40Var, ro4.g0(0.75f, 200.0f, null, 4), 5), String.valueOf(iIntValue5), z && iIntValue5 >= ((a4x) obj5).size() - 1, u1c.M(-840373281, new f42(bkg0Var, (byte) 12), fetVar4), fetVar4, 3072);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                a4x a4xVar = ((rwl0) obj5).b;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar5.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar5.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar5.U(i4 & 1, (i4 & 147) != 146)) {
                    a9x a9xVar = (a9x) list.get(iIntValue7);
                    fetVar5.e0(297943196);
                    boolean z2 = iIntValue7 == 0;
                    boolean z3 = iIntValue7 == q3d.i(a4xVar);
                    if (!z2 || z) {
                        zcl zclVar = qmk.f28987a;
                        f = 0.0f;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        f = 12.0f;
                    }
                    float f2 = z3 ? 12.0f : 0.0f;
                    mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar5.k(zaq0.b)).getBackgroundContent(), vgg0.b(f, f, f2, f2));
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(e7z.u1);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                    z1x.c(a9xVar, fetVar5, 0);
                    if (iIntValue7 < q3d.i(a4xVar)) {
                        fetVar5.e0(-1212842082);
                        mbc.o(zfi0.f44303a, s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar5, 6, 4);
                        fetVar = fetVar5;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar5;
                        fetVar.e0(-1212582054);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ gx(List list, boolean z, Object obj, byte b) {
        this.f12052a = b;
        this.b = list;
        this.c = z;
        this.d = obj;
    }
}
