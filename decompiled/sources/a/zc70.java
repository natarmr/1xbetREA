package a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.presentation.models.PromotedCategoryUiModel;
import org.xplatform.uikit.components.views.AppCompatView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zc70 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44154a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44154a) {
            case 0:
                xb70 xb70Var = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var.getClass();
                return xb70.a(xb70Var, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var.o, false, false, false, 0.0d, false, true, false, 95), null, null, 114687);
            case 1:
                xb70 xb70Var2 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var2.getClass();
                return xb70.a(xb70Var2, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var2.o, false, false, false, 0.0d, false, false, false, 95), null, null, 114687);
            case 2:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 3:
                xb70 xb70Var3 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var3.getClass();
                return xb70.a(xb70Var3, null, null, null, false, false, false, false, false, null, false, false, 0, false, fa70.a(xb70Var3.n, false, false, true, false, 0L, false, false, false, 251), null, null, null, 122879);
            case 4:
                xb70 xb70Var4 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var4.getClass();
                return xb70.a(xb70Var4, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var4.o, false, true, false, 0.0d, false, false, false, 125), null, null, 114687);
            case 5:
                xb70 xb70Var5 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var5.getClass();
                return xb70.a(xb70Var5, null, null, null, false, false, false, false, false, null, false, false, 0, true, null, null, null, null, 126975);
            case 6:
                xb70 xb70Var6 = (xb70) obj2;
                return xb70.a(xb70Var6, null, null, null, false, false, false, false, false, null, false, false, 0, false, fa70.a(xb70Var6.n, false, false, false, false, 0L, false, true, false, 57), f970.a(xb70Var6.o, false, false, false, 0.0d, false, false, false, 1), null, null, 106495);
            case 7:
                ((Integer) obj2).getClass();
                m7x.e(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 8:
                int iIntValue = ((Integer) obj).intValue();
                ka00 ka00Var = (ka00) obj2;
                ka00Var.getClass();
                if (ka00Var instanceof ia00) {
                    return ((ia00) ka00Var).f14414a + BundleUtil.UNDERLINE_TAG + iIntValue;
                }
                if (!(ka00Var instanceof ja00)) {
                    t9f.b();
                    return null;
                }
                return ((ja00) ka00Var).f16165a + BundleUtil.UNDERLINE_TAG + iIntValue;
            case 9:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(s580.f31643a);
                function2.invoke(new i280((byte) 7));
                return Unit.f46060a;
            case 10:
                xi70 xi70Var = z880.U1;
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                return Unit.f46060a;
            case 11:
                Integer num = (Integer) obj;
                int iIntValue2 = num.intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                if (p6t0Var instanceof nt0) {
                    return ((nt0) p6t0Var).getKey();
                }
                if (p6t0Var instanceof rt0) {
                    return ((rt0) p6t0Var).getKey();
                }
                if (p6t0Var instanceof rfp) {
                    return p6t0Var.getKey();
                }
                if (p6t0Var instanceof sfp) {
                    return p6t0Var.getKey();
                }
                if (p6t0Var instanceof wde0) {
                    return ((wde0) p6t0Var).b;
                }
                return p6t0Var instanceof rc80 ? twn.m(iIntValue2, String.valueOf(((rc80) p6t0Var).f30225a)) : num;
            case 12:
                Integer num2 = (Integer) obj;
                int iIntValue3 = num2.intValue();
                p6t0 p6t0Var2 = (p6t0) obj2;
                p6t0Var2.getClass();
                if (p6t0Var2 instanceof dee0) {
                    return ((dee0) p6t0Var2).f5948a.getKey();
                }
                if (p6t0Var2 instanceof bc80) {
                    return ((bc80) p6t0Var2).b;
                }
                return p6t0Var2 instanceof rc80 ? twn.m(iIntValue3, String.valueOf(((rc80) p6t0Var2).f30225a)) : num2;
            case 13:
                Integer num3 = (Integer) obj;
                num3.getClass();
                fdp fdpVar = (fdp) obj2;
                fdpVar.getClass();
                return fdpVar instanceof edp ? ((edp) fdpVar).b : num3;
            case 14:
                ((Integer) obj).getClass();
                zhr0 zhr0Var = (zhr0) obj2;
                zhr0Var.getClass();
                return zhr0Var.a();
            case 15:
                ((Integer) obj2).getClass();
                nnw0.j(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 16:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.page_indicator_delegate, viewGroup, false);
                if (viewF != null) {
                    return new vi80((AppCompatView) viewF);
                }
                hny.u("rootView");
                return null;
            case 17:
                ((Integer) obj2).getClass();
                m7x.g(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 18:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case 20:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case 21:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case 22:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 23:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 24:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                rs80 rs80Var = (rs80) obj2;
                ((oyg0) obj).getClass();
                rs80Var.getClass();
                return rs80.a(rs80Var, false, false, false, false, false, false, false, null, null, null, rs80Var.r, null, null, null, null, null, null, false, null, 134086655);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new r580((byte) 27));
                function4.invoke(new i280((byte) 15));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rs80 rs80Var2 = (rs80) obj2;
                return rs80.a(rs80Var2, false, false, false, false, false, rs80Var2.w.equals(new ur80(kotlin.collections.a.c(new PromotedCategoryUiModel("0", "ALL_FILTER_DEFAULT_CHIP", null, true)))), false, null, null, null, null, null, null, null, null, null, null, false, null, 134217695);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            default:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ zc70(int i, byte b) {
        this.f44154a = b;
    }

    public /* synthetic */ zc70(byte b) {
        this.f44154a = b;
    }
}
