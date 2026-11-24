package a;

import java.util.ArrayList;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qjr0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28854a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ qjr0(l7m0 l7m0Var, byte b) {
        this.f28854a = b;
        this.b = l7m0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f28854a;
        jm40 jm40Var = jm40.b;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    idm0.g((iIntValue & 14) | 48, fetVar, mm40Var, l7m0Var);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                y5d y5dVar = (y5d) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i = ylr0.m2;
                y5dVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(y5dVar) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 28.0f, 0.0f, 0.0f, 13), ((cmr0) l7m0Var.getValue()).f4621a, 0L, 0, 0L, fetVar2, 0, 28);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                y5d y5dVar2 = (y5d) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i2 = amr0.m2;
                y5dVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(y5dVar2) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    mm40 mm40VarA2 = y5dVar2.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar2 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA2, 0.0f, 28.0f, 0.0f, 0.0f, 13), ((jq8) l7m0Var.getValue()).f16938a, 0L, 0, 0L, fetVar3, 0, 28);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
                    pz40 pz40Var = s6t0.f31722a;
                    long background = s6t0.b().f33626a.getBackground();
                    zcl zclVar4 = qmk.g;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarQ = i120.Q(mm40VarN, background, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4));
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(e7z.u1);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                    dww.b(jpm0.t(((Number) l7m0Var.getValue()).intValue(), 6, fetVar4), null, null, s6t0.b().f33626a.getPrimary(), fetVar4, 48, 4);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                svs0 svs0Var = pwu0.q2;
                ((y5d) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    xnm0.f(0, fetVar5, null, ((twu0) l7m0Var.getValue()).f34668a);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                sxs0 sxs0Var = ywu0.s2;
                ((y5d) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    ipm0.b(0, fetVar6, null, ((vxu0) l7m0Var.getValue()).f38219a);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarA3 = yhg0Var.a(1.0f, s5x0.N(jm40.b, 12.0f, 0.0f, 12.0f, 0.0f, 10), true);
                    String str = (String) l7m0Var.getValue();
                    pz40 pz40Var2 = s6t0.f31722a;
                    v8q0.a(str, mm40VarA3, s6t0.b().f33626a.getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar7, 0, 24960, 110584);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    fetVar8.e0(-1239136793);
                    Iterable iterable = (Iterable) l7m0Var.getValue();
                    ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                    int i3 = 0;
                    for (Object obj4 : iterable) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            q3d.p();
                            throw null;
                        }
                        arrayList.add(u1c.M(-842729875, new n2m(i3, (v6n) obj4), fetVar8));
                        i3 = i4;
                    }
                    fetVar8.r(false);
                    uva.a(jm40Var, arrayList, fetVar8, 6);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    oil oilVarT = ju70.T(a8k0.F(R.drawable.ic_glyph_language, 0, fetVar9), new m78(((ThemeColors) fetVar9.k(zaq0.b)).getSecondary40(), 5), null, 10);
                    zcl zclVar6 = qmk.f28987a;
                    k7x.b((String) l7m0Var.getValue(), null, o7k0.n(jm40Var, 36.0f), oilVarT, oilVarT, oilVarT, null, null, null, null, null, null, fetVar9, 299056, 0, 32704);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarN2 = o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 40.0f);
                    pz40 pz40Var3 = s6t0.f31722a;
                    long background2 = s6t0.b().f33626a.getBackground();
                    zcl zclVar8 = qmk.g;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    x1x.s(s5x0.J(i120.Q(mm40VarN2, background2, new ugg0(zclVar8, zclVar8, zclVar8, zclVar8)), 2.0f), this.b, null, fetVar10, 0, 4);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
        }
    }
}
