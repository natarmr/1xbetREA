package a;

import android.gov.nist.core.Separators;
import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.games_mania.presentation.views.GamesManiaDice;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vls implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37643a;

    public /* synthetic */ vls(byte b) {
        this.f37643a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 6;
        boolean z = false;
        switch (this.f37643a) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new xg(new mie0(), cpVar, (Function1) new kgh(cpVar, (byte) 20), b));
                return Unit.f46060a;
            case 1:
                ((FrameLayout) obj).getClass();
                return Unit.f46060a;
            case 2:
                ((fee) obj).getClass();
                return ram.f30142a;
            case 3:
                String str = (String) obj;
                str.getClass();
                return "\u2066" + str + "\u2069";
            case 4:
                ((wws) obj).getClass();
                return Unit.f46060a;
            case 5:
                wus wusVar = (wus) obj;
                wusVar.getClass();
                return new rrs(wusVar);
            case 6:
                xa30 xa30Var = (xa30) obj;
                xa30Var.getClass();
                return new qrs(xa30Var);
            case 7:
                ((p0t) obj).getClass();
                return Unit.f46060a;
            case 8:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 9:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 10:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new kgh(cpVar2, (byte) 21));
                cpVar2.x(new bb(cpVar2, b));
                cpVar2.y(new bb(cpVar2, (byte) 7));
                return Unit.f46060a;
            case 11:
                int i = GamesManiaDice.e;
                ((List) obj).getClass();
                return Unit.f46060a;
            case 12:
                List list = GamesManiaMapView.z1;
                ((List) obj).getClass();
                return Unit.f46060a;
            case 13:
                l4i0 l4i0Var = (l4i0) obj;
                List list2 = GamesManiaMapView.z1;
                l4i0Var.getClass();
                return Boolean.valueOf(!l4i0Var.f);
            case 14:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.o0(fhlVar, s6t0.b().f33626a.getBackground(), 0L, 0L, 0L, null, 254);
                return Unit.f46060a;
            case 15:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar2.w0(16.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                pz40 pz40Var2 = s6t0.f31722a;
                fhl.o0(fhlVar2, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, jFloatToRawIntBits, null, 246);
                return Unit.f46060a;
            case 16:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                pz40 pz40Var3 = s6t0.f31722a;
                fhl.o0(fhlVar3, StaticColors.INSTANCE.m75getBlack600d7_KjU(), 0L, 0L, 0L, null, 254);
                return Unit.f46060a;
            case 17:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                return ((zo80) feeVar.c()).b;
            case 18:
                fee feeVar2 = (fee) obj;
                feeVar2.getClass();
                return ((zo80) feeVar2.c()).c;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fee feeVar3 = (fee) obj;
                feeVar3.getClass();
                return ((zo80) feeVar3.c()).c;
            case 20:
                fee feeVar4 = (fee) obj;
                feeVar4.getClass();
                return ((zo80) feeVar4.c()).d.f46470a;
            case 21:
                fee feeVar5 = (fee) obj;
                feeVar5.getClass();
                return ((zo80) feeVar5.c()).e.f46470a;
            case 22:
                fee feeVar6 = (fee) obj;
                feeVar6.getClass();
                return Boolean.valueOf(!((bdq) feeVar6.c()).f2411a.isEmpty());
            case 23:
                l7m0 l7m0Var = (l7m0) obj;
                l7m0Var.getClass();
                List<cdq> list3 = ((bdq) l7m0Var.getValue()).f2411a;
                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                for (cdq cdqVar : list3) {
                    opn opnVar = opn.f25650a;
                    cdqVar.getClass();
                    int i2 = cdqVar.f4173a;
                    String str2 = cdqVar.b;
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String strB = n2x.B(i2);
                    if (strB.length() == 0) {
                        sb.setLength(0);
                    } else if (StringsKt.O(strB, ujn.h, false) || kotlin.text.c.x(strB, "https://", false)) {
                        sb.setLength(0);
                        sb.append(strB);
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0(strB, '/'));
                    }
                    arrayList.add(new gdq(i2, str2, sb.toString()));
                }
                return arrayList;
            case 24:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                okt0 okt0VarA = k0w0Var.a(n0w0.f22721a);
                t44 t44VarC = okt0VarA.c();
                t44VarC.getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new ho4(new q0w0(null), y7d.f42146a));
                t44VarC.b = arrayList2;
                ((c8d) okt0VarA.f25422a).f3908a = okt0VarA.c().a();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gis gisVar = (gis) obj;
                gisVar.getClass();
                String str3 = gisVar.b;
                nek nekVar = y4t.c;
                return Boolean.valueOf(Intrinsics.d(str3, "160291"));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gis gisVar2 = (gis) obj;
                gisVar2.getClass();
                String str4 = gisVar2.b;
                nek nekVar2 = y4t.c;
                return Boolean.valueOf(Intrinsics.d(str4, "158983"));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sbq sbqVar = (sbq) obj;
                sbqVar.getClass();
                return new quo(sbqVar.b, sbqVar.c, sbqVar.f31947a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if ((th2 instanceof zhi0) && ((zhi0) th2).c == i2o.IncorrectDataError) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                if ((th3 instanceof zhi0) && ((zhi0) th3).c == i2o.IncorrectDataError) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
