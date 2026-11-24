package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12207a;
    public final /* synthetic */ String b;

    public /* synthetic */ h0(String str, byte b) {
        this.f12207a = b;
        this.b = str;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f12207a;
        String str = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    v8q0.a(this.b, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131066);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    v8q0.a(this.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar2, 0, 0, 131070);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    int length = str.length();
                    jm40 jm40Var = jm40.b;
                    if (length > 0) {
                        fetVar3.e0(1927668391);
                        pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_arrow_right, 0, fetVar3);
                        zcl zclVar = qmk.f28987a;
                        dww.c(pm80VarF, null, o7k0.n(s5x0.L(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 4.0f, 0.0f, 2), 10.0f), ((ThemeColors) fetVar3.k(zaq0.b)).getCommerce(), fetVar3, 56, 0);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(1928084814);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14);
                        ((g1t0) fetVar3.k(j1t0.e)).getClass();
                        v8q0.a("-", mm40VarN, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(g1t0.a(), fetVar3), fetVar3, 6, 0, 131068);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                mm40 mm40Var = (mm40) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kl5 kl5Var = j79.O1;
                mm40Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(mm40Var) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    uc9.g(iIntValue4 & 14, fetVar4, mm40Var, str);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                long jLongValue = ((Long) obj).longValue();
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.f(jLongValue) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    long jB = new znq0(jLongValue).b();
                    long j = jB / 60;
                    thb.o(6, ((StaticColors) fetVar5.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar5, o2e.e0(jm40.b, "LINE_TIMER_TEXT"), w6x.q(str, Separators.SP, String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((j / 60) % 24), Long.valueOf(j % 60), Long.valueOf(jB % 60)}, 3))));
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    xvw.j(str, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    bww.m(str, fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    ((g1t0) fetVar8.k(j1t0.e)).getClass();
                    v8q0.a(this.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.m(), fetVar8, 0, 0, 131070);
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    v8q0.a(this.b, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((StaticColors) fetVar9.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar9, 0, 0, 131064);
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    zcl zclVar4 = qmk.f28987a;
                    v8q0.a(this.b, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((StaticColors) fetVar10.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar10, 0, 0, 131064);
                } else {
                    fetVar10.X();
                }
                break;
            default:
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (!fetVar11.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    fetVar11.X();
                } else if (str.length() > 0) {
                    fetVar11.e0(1234115471);
                    bcm0.e(str, fetVar11, 0);
                    fetVar11.r(false);
                } else {
                    fetVar11.e0(1234210610);
                    fetVar11.r(false);
                }
                break;
        }
        return Unit.f46060a;
    }
}
