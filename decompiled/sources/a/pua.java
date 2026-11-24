package a;

import android.gov.nist.core.Separators;
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
import org.xplatform.feature.fin_bet.impl.presentation.view.CarriageContainer;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pua implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27605a;

    public /* synthetic */ pua(byte b) {
        this.f27605a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27605a;
        int i = R.id.cellMiddleTitle;
        byte b2 = 3;
        switch (b) {
            case 0:
                ((Integer) obj).getClass();
                cja cjaVar = (cja) obj2;
                cjaVar.getClass();
                return cjaVar.getType();
            case 1:
                ((Integer) obj).intValue();
                int i2 = CarriageContainer.f;
                ((qic) obj2).getClass();
                return Unit.f46060a;
            case 2:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                ro4.r(x8x.L(7), (fet) obj);
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                fre0.r(x8x.L(7), (fet) obj);
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                ccq0.j(x8x.L(7), (fet) obj);
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                ohq0.u(x8x.L(7), (fet) obj);
                return Unit.f46060a;
            case 7:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 8:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 9:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 10:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 11:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 12:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 13:
                ((Integer) obj).getClass();
                y2b y2bVar = (y2b) obj2;
                y2bVar.getClass();
                return y2bVar.getKey();
            case 14:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new m1b(b2));
                function2.invoke(new e0b((byte) 4));
                return Unit.f46060a;
            case 15:
                return r6b.a((r6b) obj2, null, null, iun.f15405a, null, null, null, null, null, null, null, null, null, null, null, false, false, 524283);
            case 16:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.popular_classic_header, viewGroup, false);
                SportCellLeftView sportCellLeftView = (SportCellLeftView) yum0.f(viewF, R.id.cellLeftIcon);
                if (sportCellLeftView != null) {
                    SportCellMiddleView sportCellMiddleView = (SportCellMiddleView) yum0.f(viewF, R.id.cellMiddleTitle);
                    if (sportCellMiddleView != null) {
                        i = R.id.cellRightAccordion;
                        SportCellRightView sportCellRightView = (SportCellRightView) yum0.f(viewF, R.id.cellRightAccordion);
                        if (sportCellRightView != null) {
                            return new o7b0((DsSportCell) viewF, sportCellLeftView, sportCellMiddleView, sportCellRightView);
                        }
                    }
                } else {
                    i = R.id.cellLeftIcon;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 17:
                int iIntValue = ((Integer) obj).intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                if (p6t0Var instanceof plp) {
                    return kng0.k("-1 ", ((plp) p6t0Var).b);
                }
                if (p6t0Var instanceof ilp) {
                    ilp ilpVar = (ilp) p6t0Var;
                    return ilpVar.f14991a + Separators.SP + ilpVar.b + Separators.SP + ilpVar.c + Separators.SP + ilpVar.f;
                }
                if (p6t0Var instanceof xkp) {
                    xkp xkpVar = (xkp) p6t0Var;
                    return xkpVar.f41039a + Separators.SP + xkpVar.b + Separators.SP + xkpVar.c + Separators.SP + xkpVar.e;
                }
                if (p6t0Var instanceof alp) {
                    return kng0.l("-2 ", ((alp) p6t0Var).f1079a, " 0");
                }
                if (!(p6t0Var instanceof olp)) {
                    if (!(p6t0Var instanceof clp)) {
                        return String.valueOf(iIntValue);
                    }
                    clp clpVar = (clp) p6t0Var;
                    return "-2 " + clpVar.f4571a + Separators.SP + clpVar.b;
                }
                olp olpVar = (olp) p6t0Var;
                return olpVar.f25467a + Separators.SP + olpVar.b + Separators.SP + olpVar.c + Separators.SP + olpVar.e;
            case 18:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.popular_classic_champ, viewGroup2, false);
                SportCellLeftView sportCellLeftView2 = (SportCellLeftView) yum0.f(viewF2, R.id.cellLeftIcon);
                if (sportCellLeftView2 != null) {
                    SportCellMiddleView sportCellMiddleView2 = (SportCellMiddleView) yum0.f(viewF2, R.id.cellMiddleTitle);
                    if (sportCellMiddleView2 != null) {
                        i = R.id.cellRightCounter;
                        SportCellRightView sportCellRightView2 = (SportCellRightView) yum0.f(viewF2, R.id.cellRightCounter);
                        if (sportCellRightView2 != null) {
                            return new z3b0((DsSportCell) viewF2, sportCellLeftView2, sportCellMiddleView2, sportCellRightView2);
                        }
                    }
                } else {
                    i = R.id.cellLeftIcon;
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i)));
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                qjj.A(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 20:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 21:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(-1701309700);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 22:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new m1b((byte) 24));
                function4.invoke(new e0b((byte) 19));
                return Unit.f46060a;
            case 23:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new m1b((byte) 25));
                function6.invoke(new e0b((byte) 20));
                return Unit.f46060a;
            case 24:
                int iIntValue2 = ((Integer) obj).intValue();
                ql5 ql5Var = (ql5) obj2;
                kj5 kj5Var = xnb.w2;
                ql5Var.getClass();
                return iIntValue2 + BundleUtil.UNDERLINE_TAG + ql5Var.f28916a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue3 = ((Integer) obj).intValue();
                ql5 ql5Var2 = (ql5) obj2;
                kj5 kj5Var2 = xnb.w2;
                ql5Var2.getClass();
                return "bonus" + iIntValue3 + BundleUtil.UNDERLINE_TAG + ql5Var2.f28916a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.vh_header_chip, viewGroup3, false);
                if (viewF3 != null) {
                    DsChip dsChip = (DsChip) viewF3;
                    return new xcu0(dsChip, dsChip);
                }
                hny.u("rootView");
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                cjx.t(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            default:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ pua(int i, byte b) {
        this.f27605a = b;
    }
}
