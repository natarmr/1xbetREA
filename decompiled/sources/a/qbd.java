package a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qbd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28441a;

    public /* synthetic */ qbd(int i) {
        this.f28441a = (byte) 4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28441a;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                return itx.a(layoutInflater, viewGroup);
            case 1:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup2.getClass();
                return itx.a(layoutInflater2, viewGroup2);
            case 2:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup3.getClass();
                return itx.a(layoutInflater3, viewGroup3);
            case 3:
                ((Integer) obj).getClass();
                o8w o8wVar = (o8w) obj2;
                o8wVar.getClass();
                return o8wVar.getKey();
            case 4:
                ((Integer) obj2).getClass();
                ro4.s(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 5:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = xfn.a(fetVar).d;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(s5x0.K(jm40Var, f, 4.0f), 120.0f);
                    zcl zclVar2 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_back, 0, fetVar2), null, o7k0.n(jm40Var, 24.0f), 0L, fetVar2, 56, 8);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar4 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_wallet, 0, fetVar3), null, o7k0.n(jm40Var, 24.0f), 0L, fetVar3, 56, 8);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    eeq.f(0, fetVar4, null);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 9:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 10:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 11:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 12:
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 12.0f), 96.0f);
                    long secondary20 = ((ThemeColors) fetVar8.k(zaq0.b)).getSecondary20();
                    zcl zclVar6 = qmk.e;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    qxw.o(fetVar8, i120.Q(mm40VarS, secondary20, new ugg0(zclVar6, zclVar6, zclVar6, zclVar6)));
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 13:
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
                    long secondary21 = ((ThemeColors) fetVar9.k(zaq0.b)).getSecondary20();
                    zcl zclVar8 = qmk.m;
                    ugg0 ugg0Var3 = vgg0.f37379a;
                    qxw.o(fetVar9, i120.Q(mm40VarN, secondary21, new ugg0(zclVar8, zclVar8, zclVar8, zclVar8)));
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 14:
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    zcl zclVar9 = qmk.f28987a;
                    mm40 mm40VarS2 = o7k0.s(o7k0.e(jm40Var, 16.0f), 160.0f);
                    long secondary22 = ((ThemeColors) fetVar10.k(zaq0.b)).getSecondary20();
                    zcl zclVar10 = qmk.e;
                    ugg0 ugg0Var4 = vgg0.f37379a;
                    qxw.o(fetVar10, i120.Q(mm40VarS2, secondary22, new ugg0(zclVar10, zclVar10, zclVar10, zclVar10)));
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 15:
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 16:
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    zcl zclVar11 = qmk.f28987a;
                    jcb.v(null, 1.0f, ((ThemeColors) fetVar12.k(zaq0.b)).getSeparator60(), fetVar12, 0, 1);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 17:
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    tfx.e(null, udl0.ADVANCED, true, fetVar13, 432, 1);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 18:
                fet fetVar14 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    zcl zclVar12 = qmk.f28987a;
                    qxw.o(fetVar14, o7k0.e(jm40Var, 4.0f));
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar15 = (fet) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    tfx.e(null, udl0.CLASSIC, true, fetVar15, 432, 1);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 20:
                fet fetVar16 = (fet) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    zcl zclVar13 = qmk.f28987a;
                    jcb.v(null, 2.0f, ((ThemeColors) fetVar16.k(zaq0.b)).getBackground(), fetVar16, 0, 1);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 21:
                fet fetVar17 = (fet) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    tfx.e(null, udl0.DASHBOARD, true, fetVar17, 432, 1);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 22:
                fet fetVar18 = (fet) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    zcl zclVar14 = qmk.f28987a;
                    jcb.v(null, 1.0f, ((ThemeColors) fetVar18.k(zaq0.b)).getSeparator(), fetVar18, 0, 1);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 23:
                fet fetVar19 = (fet) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    tfx.e(null, udl0.LITE, true, fetVar19, 432, 1);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case 24:
                fet fetVar20 = (fet) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    zcl zclVar15 = qmk.f28987a;
                    mm40 mm40VarN2 = o7k0.n(jm40Var, 14.0f);
                    zfn zfnVar = zaq0.b;
                    dww.c(a8k0.F(R.drawable.ic_glyph_move_horizontal_small, 0, fetVar20), null, i120.Q(mm40VarN2, ((ThemeColors) fetVar20.k(zfnVar)).getPrimary(), vgg0.f37379a), ((ThemeColors) fetVar20.k(zfnVar)).getPrimaryForeground(), fetVar20, 56, 0);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fet fetVar21 = (fet) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (fetVar21.U(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    zcl zclVar16 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_color_optibet, 0, fetVar21), null, o7k0.n(jm40Var, 14.0f), y3d.g, fetVar21, 3128, 0);
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fet fetVar22 = (fet) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (fetVar22.U(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    zcl zclVar17 = qmk.f28987a;
                    mm40 mm40VarN3 = o7k0.n(jm40Var, 14.0f);
                    zfn zfnVar2 = zaq0.b;
                    dww.c(a8k0.F(R.drawable.ic_glyph_eachway, 0, fetVar22), null, i120.Q(mm40VarN3, ((ThemeColors) fetVar22.k(zfnVar2)).getCommerce(), vgg0.f37379a), ((ThemeColors) fetVar22.k(zfnVar2)).getPrimaryForeground(), fetVar22, 56, 0);
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fet fetVar23 = (fet) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (fetVar23.U(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    vdx.g(0, fetVar23, null);
                } else {
                    fetVar23.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fet fetVar24 = (fet) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (fetVar24.U(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    zcl zclVar18 = qmk.f28987a;
                    mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 0.0f, 8.0f, 1), false, fetVar24, 6, 4);
                } else {
                    fetVar24.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar25 = (fet) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!fetVar25.U(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    fetVar25.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ qbd(byte b) {
        this.f28441a = b;
    }
}
