package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.playerstatistics.kills.TeamKillsStatisticView;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ofo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25179a;

    public /* synthetic */ ofo0(byte b) {
        this.f25179a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25179a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_aggregator_menu_item, viewGroup, false);
                DsMenuCell dsMenuCell = (DsMenuCell) viewF;
                int i = R.id.left;
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF, R.id.left);
                if (dsCellLeftIcon != null) {
                    i = R.id.middle;
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF, R.id.middle);
                    if (dsCellMiddleTitle != null) {
                        return new xrx(dsMenuCell, dsCellLeftIcon, dsCellMiddleTitle);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 1:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 2:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 3:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                hmw0.V(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                hmw0.U(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 6:
                ((Integer) obj).getClass();
                o8w o8wVar = (o8w) obj2;
                o8wVar.getClass();
                return o8wVar.getKey();
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                return rz4.h(iIntValue, p6t0Var.getKey());
            case 8:
                ((Integer) obj2).getClass();
                y0x0.x(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 9:
                ((Integer) obj).getClass();
                o8w o8wVar2 = (o8w) obj2;
                o8wVar2.getClass();
                return o8wVar2.getKey();
            case 10:
                int iIntValue2 = ((Integer) obj).intValue();
                p6t0 p6t0Var2 = (p6t0) obj2;
                p6t0Var2.getClass();
                return rz4.h(iIntValue2, p6t0Var2.getKey());
            case 11:
                ((Integer) obj2).getClass();
                xsm0.d(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                tnq0.a(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                jtm0.c(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 14:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 15:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new meo0((byte) 15));
                function2.invoke(new fno0((byte) 7));
                return Unit.f46060a;
            case 16:
                ((Integer) obj).intValue();
                p6t0 p6t0Var3 = (p6t0) obj2;
                p6t0Var3.getClass();
                return p6t0Var3.getKey();
            case 17:
                z2p0 z2p0Var = (z2p0) obj2;
                ((oyg0) obj).getClass();
                z2p0Var.getClass();
                return z2p0.a(z2p0Var, null, null, true, null, false, false, 23);
            case 18:
                fhl fhlVar = (fhl) obj;
                nu90 nu90Var = (nu90) obj2;
                fhlVar.getClass();
                nu90Var.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(28.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) / 2.0f;
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))) / 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                pz40 pz40Var = s6t0.f31722a;
                long secondary20 = s6t0.b().f33626a.getSecondary20();
                long jD = fhlVar.d();
                float fW1 = fhlVar.w0(16.0f);
                fhl.o0(fhlVar, secondary20, 0L, jD, (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(fW1)) & 4294967295L), null, 242);
                nr nrVarA0 = fhlVar.A0();
                long jP = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    ((fvt0) nrVarA0.b).A(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                    nu90Var.f24139a.e(fhlVar, jFloatToRawIntBits, nu90Var.b, new m78(s6t0.b().f33626a.getSecondary40(), 5));
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVarA0, jP);
                }
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                w7n0.f(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                hp4.A(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 21:
                return Unit.f46060a;
            case 22:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(1745076189);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 23:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(1426416114);
                xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA2;
            case 24:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(-333457391);
                xcz xczVarA3 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA3;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fet fetVar4 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar4.e0(464432039);
                xcz xczVarA4 = ddz.a(0, 0, fetVar4, 0, 3);
                fetVar4.r(false);
                return xczVarA4;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new meo0((byte) 19));
                function4.invoke(new fno0((byte) 24));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.dota_team_kills_statistic_item_view, viewGroup2, false);
                if (viewF2 != null) {
                    TeamKillsStatisticView teamKillsStatisticView = (TeamKillsStatisticView) viewF2;
                    return new cal(teamKillsStatisticView, teamKillsStatisticView);
                }
                hny.u("rootView");
                return null;
            default:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.team_player_item, viewGroup3, false);
                int i2 = R.id.ivLogo;
                ImageView imageView = (ImageView) yum0.f(viewF3, R.id.ivLogo);
                if (imageView != null) {
                    i2 = R.id.ivReplace;
                    ImageView imageView2 = (ImageView) yum0.f(viewF3, R.id.ivReplace);
                    if (imageView2 != null) {
                        i2 = R.id.tvName;
                        TextView textView = (TextView) yum0.f(viewF3, R.id.tvName);
                        if (textView != null) {
                            return new mgp0((LinearLayout) viewF3, imageView, imageView2, textView);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i2)));
                return null;
        }
    }

    public /* synthetic */ ofo0(int i, byte b) {
        this.f25179a = b;
    }
}
