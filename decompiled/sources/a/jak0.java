package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.chip.Chip;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jak0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16194a;

    public /* synthetic */ jak0(byte b) {
        this.f16194a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ixb0 ixb0Var = null;
        switch (this.f16194a) {
            case 0:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(1212962792);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 1:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(2124905224);
                xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA2;
            case 2:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(-170238392);
                xcz xczVarA3 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA3;
            case 3:
                tcz tczVar = (tcz) obj;
                ucz uczVar = (ucz) obj2;
                tczVar.getClass();
                uczVar.getClass();
                mcz mczVarJ = tczVar.f33739a.j();
                return Integer.valueOf(((mczVarJ.n - mczVarJ.r) - uczVar.f35454a.q) / 2);
            case 4:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 5:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 6:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_special_event, viewGroup, false);
                int i = R.id.cmTitle;
                if (((DsCellMiddleTitle) yum0.f(viewF, R.id.cmTitle)) != null) {
                    i = R.id.crSwitch;
                    DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(viewF, R.id.crSwitch);
                    if (dsCellRightSwitch != null) {
                        i = R.id.scToggleCell;
                        if (((DsSettingsCell) yum0.f(viewF, R.id.scToggleCell)) != null) {
                            return new vxx((LinearLayout) viewF, dsCellRightSwitch);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 7:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.special_events_shimmer_delegate, viewGroup2, false);
                if (((DsShimmerView) yum0.f(viewF2, R.id.emptyOneXGamesTape)) != null) {
                    FrameLayout frameLayout = (FrameLayout) viewF2;
                    return new exk0(frameLayout, frameLayout);
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(R.id.emptyOneXGamesTape)));
                return null;
            case 8:
                dvk0 dvk0Var = (dvk0) obj2;
                ((oyg0) obj).getClass();
                dvk0Var.getClass();
                qtk0 qtk0Var = dvk0Var.u;
                ixb0 ixb0Var2 = qtk0Var.b;
                if (ixb0Var2 != null) {
                    boolean z = !ixb0Var2.b;
                    List list = ixb0Var2.f15535a;
                    list.getClass();
                    ixb0Var = new ixb0(list, z);
                }
                btk0 btk0Var = qtk0Var.f29303a;
                btk0Var.getClass();
                return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new qtk0(btk0Var, ixb0Var), null, null, null, null, null, null, null, 1072693247);
            case 9:
                dvk0 dvk0Var2 = (dvk0) obj2;
                ((oyg0) obj).getClass();
                dvk0Var2.getClass();
                iun iunVar = iun.f15405a;
                atk0 atk0Var = atk0.f1436a;
                fvk0 fvk0Var = new fvk0(atk0Var, iunVar, iunVar, iunVar);
                bvk0 bvk0Var = new bvk0(atk0Var, iunVar, iunVar);
                evk0 evk0Var = new evk0(atk0Var, iunVar);
                xun xunVar = xun.f41520a;
                xunVar.getClass();
                return dvk0.a(dvk0Var2, false, null, null, null, null, null, null, evk0Var, new lpp0(new wpp0(atk0Var, iunVar), new vpp0(atk0Var, iunVar), new opp0(atk0Var, iunVar, xunVar)), new pvk0(atk0Var, iunVar, iunVar), new rtk0(atk0Var, iunVar), fvk0Var, bvk0Var, new otk0(atk0Var, iunVar), new jwk0(atk0Var, iunVar, 0), new gqk0(atk0Var, null), new gtk0(atk0Var, iunVar), new ltk0(atk0Var, iunVar), new etk0(atk0Var, iunVar), new qtk0(atk0Var, null), new ntk0(atk0Var, iunVar), new dtk0(atk0Var, iunVar), new avk0(atk0Var, iunVar), new ctk0(atk0Var, iunVar, 0), new stk0(atk0Var, iunVar), null, null, 1006632991);
            case 10:
                dvk0 dvk0Var3 = (dvk0) obj2;
                ((oyg0) obj).getClass();
                dvk0Var3.getClass();
                gqk0 gqk0Var = dvk0Var3.q;
                o0 o0Var = gqk0Var.b;
                if (!(o0Var instanceof n0)) {
                    return dvk0Var3;
                }
                n0 n0Var = (n0) o0Var;
                n0 n0Var2 = new n0(n0Var.f22676a, n0Var.b, n0Var.c, n0Var.d, n0Var.e, n0Var.f, !n0Var.g);
                btk0 btk0Var2 = gqk0Var.f11738a;
                btk0Var2.getClass();
                return dvk0.a(dvk0Var3, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new gqk0(btk0Var2, n0Var2), null, null, null, null, null, null, null, null, null, null, null, 1073676287);
            case 11:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 12:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(cwk0.f5085a);
                function2.invoke(new pdk0((byte) 24));
                return Unit.f46060a;
            case 13:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(dwk0.f6804a);
                function4.invoke(new pdk0((byte) 25));
                return Unit.f46060a;
            case 14:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(ewk0.f8532a);
                function6.invoke(new pdk0((byte) 26));
                return Unit.f46060a;
            case 15:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.special_event_item_delegate, viewGroup3, false);
                int i2 = R.id.banner;
                DsCellRightBanner dsCellRightBanner = (DsCellRightBanner) yum0.f(viewF3, R.id.banner);
                if (dsCellRightBanner != null) {
                    i2 = R.id.icon;
                    DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF3, R.id.icon);
                    if (dsCellLeftIcon != null) {
                        i2 = R.id.texts;
                        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF3, R.id.texts);
                        if (dsCellMiddleTitle != null) {
                            return new rok0((DsMenuCell) viewF3, dsCellRightBanner, dsCellLeftIcon, dsCellMiddleTitle);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i2)));
                return null;
            case 16:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup4.getClass();
                return wxx.a(layoutInflater, viewGroup4);
            case 17:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.bet_constructor_item_sport_chip, viewGroup5, false);
                if (viewF4 != null) {
                    Chip chip = (Chip) viewF4;
                    return new ds6(chip, chip);
                }
                hny.u("rootView");
                return null;
            case 18:
                ((Integer) obj).intValue();
                dsm dsmVar = (dsm) obj2;
                dsmVar.getClass();
                return dsmVar.getKey();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj).intValue();
                dsm dsmVar2 = (dsm) obj2;
                dsmVar2.getClass();
                return dsmVar2.getKey();
            case 20:
                ((Integer) obj).intValue();
                dsm dsmVar3 = (dsm) obj2;
                dsmVar3.getClass();
                return dsmVar3.getKey();
            case 21:
                ((Integer) obj).intValue();
                dsm dsmVar4 = (dsm) obj2;
                dsmVar4.getClass();
                return dsmVar4.getKey();
            case 22:
                ((Integer) obj).intValue();
                usm usmVar = (usm) obj2;
                usmVar.getClass();
                return Integer.valueOf(usmVar.f36218a);
            case 23:
                ((Integer) obj).intValue();
                v2n v2nVar = (v2n) obj2;
                v2nVar.getClass();
                return v2nVar.f36693a;
            case 24:
                ((Integer) obj).intValue();
                v2n v2nVar2 = (v2n) obj2;
                v2nVar2.getClass();
                return v2nVar2.f36693a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj).intValue();
                v2n v2nVar3 = (v2n) obj2;
                v2nVar3.getClass();
                return v2nVar3.f36693a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return Unit.f46060a;
        }
    }
}
