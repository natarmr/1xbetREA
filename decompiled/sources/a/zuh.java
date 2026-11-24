package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.feature.dayexpress.impl.presentation.view.ExpressCardBottomView;
import org.xplatform.feature.dayexpress.impl.presentation.view.ExpressCardMiddleView;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zuh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45009a;

    public /* synthetic */ zuh(f9n f9nVar) {
        this.f45009a = (byte) 8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45009a) {
            case 0:
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                y860.B(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                ju70.v(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                jiq0.V(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                d5c.i(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                sac.i(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                ebc.o(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                fbc.q(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 8:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_favourite_inactive, 0, fetVar), null, o7k0.n(jm40.b, 20.0f), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), fetVar, 56, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 9:
                return Unit.f46060a;
            case 10:
                Integer num = (Integer) obj;
                num.intValue();
                ((k5j) obj2).getClass();
                return num;
            case 11:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 12:
                u340 u340Var = (u340) obj;
                Throwable cancellationException = (Throwable) obj2;
                u340Var.getClass();
                odd oddVar = u340Var.b;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                oddVar.b0(cancellationException);
                return Unit.f46060a;
            case 13:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.express_footer_item_with_separator, viewGroup, false);
                int i = R.id.expressCardBottomView;
                ExpressCardBottomView expressCardBottomView = (ExpressCardBottomView) yum0.f(viewF, R.id.expressCardBottomView);
                if (expressCardBottomView != null) {
                    i = R.id.separator;
                    if (((DsSeparator) yum0.f(viewF, R.id.separator)) != null) {
                        return new wqo((LinearLayout) viewF, expressCardBottomView);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 14:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.express_item_child, viewGroup2, false);
                if (viewF2 != null) {
                    return new uro((ExpressCardMiddleView) viewF2);
                }
                hny.u("rootView");
                return null;
            case 15:
                int iIntValue2 = ((Integer) obj).intValue();
                String str = (String) obj2;
                str.getClass();
                return w6x.n(iIntValue2, str.hashCode(), "-");
            case 16:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup3.getClass();
                return zvx.a(layoutInflater, viewGroup3);
            case 17:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup4.getClass();
                return wtx.a(layoutInflater2, viewGroup4);
            case 18:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_decorated_tint_small_icon_item, viewGroup5, false);
                DsMenuCell dsMenuCell = (DsMenuCell) viewF3;
                int i2 = R.id.decorIcon;
                DsCellRightBanner dsCellRightBanner = (DsCellRightBanner) yum0.f(viewF3, R.id.decorIcon);
                if (dsCellRightBanner != null) {
                    i2 = R.id.icon;
                    DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF3, R.id.icon);
                    if (dsCellLeftIcon != null) {
                        i2 = R.id.title;
                        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF3, R.id.title);
                        if (dsCellMiddleTitle != null) {
                            return new ytx(dsMenuCell, dsMenuCell, dsCellRightBanner, dsCellLeftIcon, dsCellMiddleTitle);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i2)));
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 20:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(-198435187);
                xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA;
            case 21:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 22:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(1463518062);
                xcz xczVarA2 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA2;
            case 23:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                return Unit.f46060a;
            case 24:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                return Unit.f46060a;
            default:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ zuh(int i, byte b) {
        this.f45009a = b;
    }

    public /* synthetic */ zuh(byte b) {
        this.f45009a = b;
    }
}
