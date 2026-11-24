package a;

import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ft0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10087a;
    public final /* synthetic */ mm40 b;

    public /* synthetic */ ft0(mm40 mm40Var, byte b) {
        this.f10087a = b;
        this.b = mm40Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f10087a;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                lr8 lr8Var = (lr8) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(lr8Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    zq8.a(0, fetVar, o7k0.e(mm40Var, (lr8Var.d() / 1.6666666f) + 68.0f));
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                int i = 4;
                String str = (String) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                str.getClass();
                if ((iIntValue2 & 6) == 0) {
                    if (!fetVar2.g(str)) {
                        i = 2;
                    }
                    iIntValue2 |= i;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    ntb.w(((iIntValue2 << 3) & 112) | 6, ((StaticColors) fetVar2.k(m8m0.f21378a)).m131getWhite800d7_KjU(), fetVar2, this.b, g1t0.e(), str);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                int i2 = 4;
                String str2 = (String) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                str2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    if (!fetVar3.g(str2)) {
                        i2 = 2;
                    }
                    iIntValue3 |= i2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40Var, 18.0f);
                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                    sj3.u((iIntValue3 << 3) & 112, ((StaticColors) fetVar3.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar3, mm40VarE, g1t0.g(), str2);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                String str3 = (String) obj;
                int i3 = 4;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                str3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    if (!fetVar4.g(str3)) {
                        i3 = 2;
                    }
                    iIntValue4 |= i3;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(mm40Var, 18.0f);
                    ((g1t0) fetVar4.k(j1t0.e)).getClass();
                    sj3.u((iIntValue4 << 3) & 112, ((StaticColors) fetVar4.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar4, mm40VarE2, g1t0.g(), str3);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                mz3 mz3Var = (mz3) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                mz3Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(mz3Var) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    j0x.b(mz3Var, "", this.b, null, null, 0.0f, null, fetVar5, (iIntValue5 & 14) | 48, 120);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                mz3 mz3Var2 = (mz3) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                mz3Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar6.g(mz3Var2) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    j0x.b(mz3Var2, "", this.b, null, null, 0.0f, null, fetVar6, (iIntValue6 & 14) | 48, 120);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    j0x.b(iom0.r(jpm0.t(R.drawable.insight_indicator, 6, fetVar7), fetVar7), null, o7k0.n(s5x0.N(this.b, 6.0f, 0.0f, 16.0f, 0.0f, 10), 6.0f), null, null, 0.0f, null, fetVar7, 56, 120);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                int i4 = 2;
                String str4 = (String) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                str4.getClass();
                if ((iIntValue8 & 6) == 0) {
                    if (fetVar8.g(str4)) {
                        i4 = 4;
                    }
                    iIntValue8 |= i4;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarE3 = o7k0.e(mm40Var, 22.0f);
                    ((g1t0) fetVar8.k(j1t0.e)).getClass();
                    sj3.u((iIntValue8 << 3) & 112, ((StaticColors) fetVar8.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar8, mm40VarE3, g1t0.g(), str4);
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                long jLongValue = ((Long) obj).longValue();
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.f(jLongValue) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    long jW0 = ibc.w0(jLongValue, bfn.SECONDS);
                    uen uenVar = wen.b;
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1732718262, new hzh(this.b, wen.l(jW0, bfn.MINUTES), jLongValue % 60), fetVar9), fetVar9, 56);
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                String str5 = (String) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                str5.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar10.g(str5) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    dtb.t(((iIntValue10 << 3) & 112) | 6, fetVar10, mm40Var, str5);
                } else {
                    fetVar10.X();
                }
                break;
            case 10:
                int i5 = 2;
                String str6 = (String) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                str6.getClass();
                if ((iIntValue11 & 6) == 0) {
                    if (fetVar11.g(str6)) {
                        i5 = 4;
                    }
                    iIntValue11 |= i5;
                }
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarE4 = o7k0.e(mm40Var, 22.0f);
                    ((g1t0) fetVar11.k(j1t0.e)).getClass();
                    sj3.u((iIntValue11 << 3) & 112, ((StaticColors) fetVar11.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar11, mm40VarE4, g1t0.g(), str6);
                } else {
                    fetVar11.X();
                }
                break;
            case 11:
                String str7 = (String) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                str7.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar12.g(str7) ? 4 : 2;
                }
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    f7k.n(((iIntValue12 << 3) & 112) | 6, fetVar12, mm40Var, str7);
                } else {
                    fetVar12.X();
                }
                break;
            case 12:
                String str8 = (String) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                str8.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar13.g(str8) ? 4 : 2;
                }
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    kpb.n(((iIntValue13 << 3) & 112) | 6, ((ThemeColors) fetVar13.k(zaq0.b)).getSecondary(), fetVar13, this.b, str8);
                } else {
                    fetVar13.X();
                }
                break;
            default:
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    zcl zclVar6 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_optionbet_glyph, 0, fetVar14), null, o7k0.n(mm40Var, 20.0f), y3d.g, fetVar14, 3128, 0);
                } else {
                    fetVar14.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
