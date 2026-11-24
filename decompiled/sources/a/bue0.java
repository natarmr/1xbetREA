package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.resident.presentation.views.ResidentDoorLineView;
import org.xplatform.resident.presentation.views.ResidentSafeLineView;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bue0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3227a;

    public /* synthetic */ bue0(byte b) {
        this.f3227a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3227a) {
            case 0:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 1:
                d8f0 d8f0Var = (d8f0) obj;
                d8f0Var.getClass();
                return d8f0Var.f5645a;
            case 2:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 3:
                j2q j2qVar = (j2q) obj;
                j2qVar.getClass();
                return Boolean.valueOf(j2qVar instanceof u1q);
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 5:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 6:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar, StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 7:
                j2q j2qVar2 = (j2q) obj;
                j2qVar2.getClass();
                return Boolean.valueOf(j2qVar2 instanceof u1q);
            case 8:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 9:
                gle0 gle0Var = m6f0.f2;
                ((eg60) obj).getClass();
                return Unit.f46060a;
            case 10:
                fhl fhlVar2 = (fhl) obj;
                gle0 gle0Var2 = m6f0.f2;
                fhlVar2.getClass();
                pz40 pz40Var2 = s6t0.f31722a;
                fhl.u(fhlVar2, StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 11:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                yai0.j(abi0Var);
                return Unit.f46060a;
            case 12:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                pz40 pz40Var3 = s6t0.f31722a;
                fhl.u(fhlVar3, s6t0.b().f33626a.getCommerceTint(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 13:
                int iIntValue = ((Integer) obj).intValue();
                bzu bzuVar = new bzu((byte) 23);
                bzuVar.g("static");
                bzuVar.g("img");
                bzuVar.g("android");
                bzuVar.g("actions");
                bzuVar.g("alt_design");
                bzuVar.g("registration");
                bzuVar.g("visual_style");
                bzuVar.g("background_picture");
                bzuVar.g(iIntValue + ".svg");
                return ((StringBuilder) bzuVar.b).toString();
            case 14:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 15:
                j2q j2qVar3 = (j2q) obj;
                j2qVar3.getClass();
                return Boolean.valueOf(j2qVar3 instanceof u1q);
            case 16:
                a2n a2nVar = (a2n) obj;
                a2nVar.getClass();
                return a2nVar.getKey();
            case 17:
                a2n a2nVar2 = (a2n) obj;
                a2nVar2.getClass();
                return sre0.f32672a.b(a2nVar2.getClass());
            case 18:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                mcy mcyVar = (mcy) obj;
                mcyVar.getClass();
                return kcx.Z(mcyVar);
            case 20:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 21:
                ((gkf0) obj).getClass();
                return Boolean.TRUE;
            case 22:
                Pair pair = (Pair) obj;
                pair.getClass();
                return b1j.k(Separators.DOUBLE_QUOTE, (String) pair.f46059a, "\":\"", (String) pair.b, Separators.DOUBLE_QUOTE);
            case 23:
                ((Integer) obj).getClass();
                int i = ResidentDoorLineView.e;
                return Unit.f46060a;
            case 24:
                iiy[] iiyVarArr = vof0.O1;
                ((mrf0) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj).getClass();
                int i2 = ResidentSafeLineView.m;
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i3 = ResidentSafeLineView.m;
                ((mrf0) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((mrf0) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                d3w0 d3w0Var = (d3w0) obj;
                d3w0Var.getClass();
                y190 y190Var = zsf0.f;
                return Boolean.valueOf(vvw.z(d3w0Var.f5425a));
            default:
                ((cp) obj).getClass();
                return Unit.f46060a;
        }
    }
}
