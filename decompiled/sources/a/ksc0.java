package a;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.statistic.rating.impl.rating_statistic.domain.model.SelectorOptionModel;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ksc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18807a;

    public /* synthetic */ ksc0(byte b) {
        this.f18807a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18807a) {
            case 0:
                ((Integer) obj2).getClass();
                hmw0.z(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 1:
                ((Integer) obj).intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 2:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.delegate_promo_simple_shimmer_item, viewGroup, false);
                if (viewF != null) {
                    return new y2k((FrameLayout) viewF);
                }
                hny.u("rootView");
                return null;
            case 3:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.delegate_promo_simple_item, viewGroup2, false);
                int i = R.id.cellLeftIcon;
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF2, R.id.cellLeftIcon);
                if (dsCellLeftIcon != null) {
                    i = R.id.cellMiddleTitle;
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF2, R.id.cellMiddleTitle);
                    if (dsCellMiddleTitle != null) {
                        i = R.id.cellRightBanner;
                        DsCellRightBanner dsCellRightBanner = (DsCellRightBanner) yum0.f(viewF2, R.id.cellRightBanner);
                        if (dsCellRightBanner != null) {
                            i = R.id.menuCell;
                            DsMenuCell dsMenuCell = (DsMenuCell) yum0.f(viewF2, R.id.menuCell);
                            if (dsMenuCell != null) {
                                return new x2k((FrameLayout) viewF2, dsCellLeftIcon, dsCellMiddleTitle, dsCellRightBanner, dsMenuCell);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i)));
                return null;
            case 4:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.delegate_promo_space_item, viewGroup3, false);
                if (viewF3 != null) {
                    return new z2k(viewF3, viewF3);
                }
                hny.u("rootView");
                return null;
            case 5:
                ((Drawable) obj).getClass();
                ((kuc0) obj2).getClass();
                return Boolean.FALSE;
            case 6:
                ((Integer) obj2).getClass();
                m0x0.x(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 7:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 8:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                y0x0.q(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 10:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 11:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 12:
                return (Float) ((d9d0) obj2).f5695a.d();
            case 13:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 14:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                cfx0.o(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 16:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(525822805);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 17:
                ((Integer) obj2).getClass();
                wb.B(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 18:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                qyd0 qyd0Var = (qyd0) obj2;
                ((oyg0) obj).getClass();
                qyd0Var.getClass();
                ixd0 ixd0Var = qyd0Var.j;
                return qyd0.a(qyd0Var, null, null, null, null, null, null, false, ixd0.a(ixd0Var, null, 0L, 0L, 0L, !ixd0Var.e, 15), null, null, false, null, false, false, null, null, 134217215);
            case 20:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new bod0((byte) 11));
                function2.invoke(new etd0((byte) 19));
                return Unit.f46060a;
            case 21:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new bod0((byte) 12));
                function4.invoke(new etd0((byte) 20));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                dwi0.s(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 23:
                ((Integer) obj).intValue();
                SelectorOptionModel selectorOptionModel = (SelectorOptionModel) obj2;
                fl70 fl70Var = l4e0.n2;
                selectorOptionModel.getClass();
                return selectorOptionModel.b;
            case 24:
                ((Integer) obj2).getClass();
                xf0.w(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                xf0.x(x8x.L(7), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((oyg0) obj).getClass();
                ((v5e0) obj2).getClass();
                iun iunVar = iun.f15405a;
                iunVar.getClass();
                return new v5e0(iunVar, false, false);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                v5e0 v5e0Var = (v5e0) obj2;
                ((oyg0) obj).getClass();
                v5e0Var.getClass();
                return v5e0.a(v5e0Var, false, 4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                b34.A(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            default:
                ((Integer) obj).intValue();
                ((IntRange) obj2).getClass();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ksc0(int i, byte b) {
        this.f18807a = b;
    }
}
