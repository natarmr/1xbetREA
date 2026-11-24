package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o33 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24562a;

    public /* synthetic */ o33(int i) {
        this.f24562a = (byte) 12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24562a) {
            case 0:
                dwi0.O((e7z) obj).setModifier((mm40) obj2);
                return Unit.f46060a;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                qa5 qa5Var = (qa5) obj2;
                qa5Var.getClass();
                long j = qa5Var.f28378a;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(iIntValue);
                return sb.toString();
            case 2:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_text_scale_version, viewGroup, false);
                if (viewF != null) {
                    TextView textView = (TextView) viewF;
                    return new myx(textView, textView);
                }
                hny.u("rootView");
                return null;
            case 3:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_app_version, viewGroup2, false);
                if (viewF2 != null) {
                    TextView textView2 = (TextView) viewF2;
                    return new asx(textView2, textView2);
                }
                hny.u("rootView");
                return null;
            case 4:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                int i = ApplicationActivity.F1;
                fetVar.e0(1620374810);
                WeakHashMap weakHashMap = djv0.w;
                q33 q33Var = zcm0.i(fetVar).g;
                fetVar.r(false);
                return q33Var;
            case 5:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).getClass();
                int i2 = ApplicationActivity.F1;
                fetVar2.e0(489211573);
                WeakHashMap weakHashMap2 = djv0.w;
                q33 q33Var2 = zcm0.i(fetVar2).g;
                fetVar2.r(false);
                return q33Var2;
            case 6:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 7:
                return Unit.f46060a;
            case 8:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.app_start_arrow_item, viewGroup3, false);
                if (viewF3 != null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) viewF3;
                    return new bg3(appCompatImageView, appCompatImageView);
                }
                hny.u("rootView");
                return null;
            case 9:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.delegate_attached_image, viewGroup4, false);
                int i3 = R.id.imgCancelAttach;
                ImageView imageView = (ImageView) yum0.f(viewF4, R.id.imgCancelAttach);
                if (imageView != null) {
                    i3 = R.id.imgPicture;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewF4, R.id.imgPicture);
                    if (shapeableImageView != null) {
                        return new zzj(imageView, (ConstraintLayout) viewF4, shapeableImageView);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i3)));
                return null;
            case 10:
                oyg0 oyg0Var = (oyg0) obj;
                m54 m54Var = (m54) obj2;
                oyg0Var.getClass();
                m54Var.getClass();
                xn4 xn4Var = m54Var.f21203a;
                xn4 xn4Var2 = xn4.b;
                if (xn4Var == xn4Var2) {
                    xn4Var2 = xn4.f41154a;
                }
                xn4 xn4Var3 = xn4Var2;
                q7x.F(oyg0Var, xn4Var3, "KEY_AUTH_TYPE");
                q7x.F(oyg0Var, Boolean.TRUE, "KEY_ANIMATE_CHANGES");
                return m54.a(m54Var, xn4Var3, true, false, 0L, 60);
            case 11:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_auth_entry_point, viewGroup5, false);
                int i4 = R.id.cellIcon;
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF5, R.id.cellIcon);
                if (dsCellLeftIcon != null) {
                    i4 = R.id.cellTitle;
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF5, R.id.cellTitle);
                    if (dsCellMiddleTitle != null) {
                        i4 = R.id.scAuthEntryPoint;
                        DsSettingsCell dsSettingsCell = (DsSettingsCell) yum0.f(viewF5, R.id.scAuthEntryPoint);
                        if (dsSettingsCell != null) {
                            i4 = R.id.sellSeparator;
                            DsSeparator dsSeparator = (DsSeparator) yum0.f(viewF5, R.id.sellSeparator);
                            if (dsSeparator != null) {
                                return new bsx((LinearLayout) viewF5, dsCellLeftIcon, dsCellMiddleTitle, dsSettingsCell, dsSeparator);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i4)));
                return null;
            case 12:
                ((Integer) obj2).getClass();
                qjj.d(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 13:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 14:
                oyg0 oyg0Var2 = (oyg0) obj;
                mb4 mb4Var = (mb4) obj2;
                oyg0Var2.getClass();
                mb4Var.getClass();
                q7x.F(oyg0Var2, null, "AUTHORIZATION_DATA_ERROR_KEY");
                return mb4.a(mb4Var, false, false, false, null, null, null, 0, false, null, null, false, 14335);
            case 15:
                dpa0 dpa0Var = (dpa0) obj;
                dpa0Var.getClass();
                if (Float.intBitsToFloat((int) (((ne60) obj2).f23370a & 4294967295L)) < 0.0f) {
                    dpa0Var.a();
                }
                return Unit.f46060a;
            case 16:
                oyg0 oyg0Var3 = (oyg0) obj;
                zf4 zf4Var = (zf4) obj2;
                oyg0Var3.getClass();
                zf4Var.getClass();
                q7x.F(oyg0Var3, null, "AUTHORIZATION_DATA_ERROR_KEY");
                return zf4.a(zf4Var, false, false, false, null, null, null, 0, false, null, null, false, false, 30719);
            case 17:
                oyg0 oyg0Var4 = (oyg0) obj;
                tj4 tj4Var = (tj4) obj2;
                oyg0Var4.getClass();
                tj4Var.getClass();
                boolean z = !tj4Var.f34034a;
                q7x.F(oyg0Var4, Boolean.valueOf(z), "KEY_LOGIN_BY_PHONE");
                return tj4.a(tj4Var, z, false, false, null, null, null, 0, false, null, null, false, 65534);
            case 18:
                oyg0 oyg0Var5 = (oyg0) obj;
                tj4 tj4Var2 = (tj4) obj2;
                oyg0Var5.getClass();
                tj4Var2.getClass();
                q7x.F(oyg0Var5, null, "AUTHORIZATION_DATA_ERROR_KEY");
                return tj4.a(tj4Var2, false, false, false, null, null, null, 0, false, null, null, false, 63487);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_accordion_isolated_auth_item, viewGroup6, false);
                DsMenuCell dsMenuCell = (DsMenuCell) viewF6;
                int i5 = R.id.icon;
                DsCellLeftIcon dsCellLeftIcon2 = (DsCellLeftIcon) yum0.f(viewF6, R.id.icon);
                if (dsCellLeftIcon2 != null) {
                    i5 = R.id.title;
                    DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF6, R.id.title);
                    if (dsCellMiddleTitle2 != null) {
                        return new lrx(dsMenuCell, dsCellLeftIcon2, dsCellMiddleTitle2);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF6.getResources().getResourceName(i5)));
                return null;
            case 20:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.item_compact_line_menu_item, viewGroup7, false);
                if (viewF7 != null) {
                    DsMenuCompactCell dsMenuCompactCell = (DsMenuCompactCell) viewF7;
                    return new gtx(dsMenuCompactCell, dsMenuCompactCell);
                }
                hny.u("rootView");
                return null;
            case 21:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup8.getClass();
                return itx.a(layoutInflater, viewGroup8);
            case 22:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup9.getClass();
                return bwx.a(layoutInflater2, viewGroup9);
            case 23:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup10.getClass();
                return zvx.a(layoutInflater3, viewGroup10);
            case 24:
                LayoutInflater layoutInflater4 = (LayoutInflater) obj;
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                layoutInflater4.getClass();
                viewGroup11.getClass();
                return bwx.a(layoutInflater4, viewGroup11);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Integer num = (Integer) obj;
                num.intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                return p6t0Var instanceof t84 ? num : p6t0Var.getKey();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            default:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ o33(byte b) {
        this.f24562a = b;
    }
}
