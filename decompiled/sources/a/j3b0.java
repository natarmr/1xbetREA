package a;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.promo.impl.settings.presentation.components.PromoAdditionalCardCollection;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j3b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15823a;

    public /* synthetic */ j3b0(byte b) {
        this.f15823a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15823a;
        int i = R.id.promoAdditionalCollection;
        switch (b) {
            case 0:
                u2b0 u2b0Var = (u2b0) obj2;
                List<Object> list = u2b0Var.l;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (Object ve40Var : list) {
                    if (ve40Var instanceof ve40) {
                        ve40Var = new ve40(eyx.f8647a);
                    }
                    arrayList.add(ve40Var);
                }
                return u2b0.a(u2b0Var, false, false, false, false, null, null, arrayList, 2047);
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.delegate_popular_classic_express_header, viewGroup, false);
                if (viewF != null) {
                    DsHeader dsHeader = (DsHeader) viewF;
                    return new i2k(dsHeader, dsHeader);
                }
                hny.u("rootView");
                return null;
            case 2:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(h6b0.f12523a);
                function2.invoke(new npa0((byte) 9));
                return Unit.f46060a;
            case 3:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.popular_classic_item_banner, viewGroup2, false);
                int i2 = R.id.backgroundImage;
                ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewF2, R.id.backgroundImage);
                if (shapeableImageView != null) {
                    i2 = R.id.flTechnicalWorks;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(viewF2, R.id.flTechnicalWorks);
                    if (frameLayout != null) {
                        i2 = R.id.tvSubtitle;
                        TextView textView = (TextView) yum0.f(viewF2, R.id.tvSubtitle);
                        if (textView != null) {
                            i2 = R.id.tvTitle;
                            TextView textView2 = (TextView) yum0.f(viewF2, R.id.tvTitle);
                            if (textView2 != null) {
                                return new p7b0((ConstraintLayout) viewF2, shapeableImageView, frameLayout, textView, textView2);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i2)));
                return null;
            case 4:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 5:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 6:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 7:
                return Unit.f46060a;
            case 8:
                Integer num = (Integer) obj;
                num.intValue();
                oza0 oza0Var = (oza0) obj2;
                oza0Var.getClass();
                return new Pair(oza0Var.getClass(), num);
            case 9:
                ((Integer) obj2).getClass();
                oja0.K(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                ffb0.A(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 11:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 12:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 13:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new peb0((byte) 17));
                function4.invoke(new npa0((byte) 17));
                return Unit.f46060a;
            case 14:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 15:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 16:
                return Unit.f46060a;
            case 17:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 18:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_profile_edit_text_field_clickable, viewGroup3, false);
                if (viewF3 != null) {
                    DsTextField dsTextField = (DsTextField) viewF3;
                    return new wwx(dsTextField, dsTextField);
                }
                hny.u("rootView");
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_profile_edit_text_field, viewGroup4, false);
                if (viewF4 != null) {
                    DsTextField dsTextField2 = (DsTextField) viewF4;
                    return new vwx(dsTextField2, dsTextField2);
                }
                hny.u("rootView");
                return null;
            case 20:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_profile_edit_title, viewGroup5, false);
                if (viewF5 != null) {
                    TextView textView3 = (TextView) viewF5;
                    return new xwx(textView3, textView3);
                }
                hny.u("rootView");
                return null;
            case 21:
                ((Integer) obj2).getClass();
                e1c0.c(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 22:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
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
                ((Integer) obj2).getClass();
                bsr0.t(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                rsr0.z(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.delegate_promo_additional_horizontal_shimmer_item, viewGroup6, false);
                PromoAdditionalCardCollection promoAdditionalCardCollection = (PromoAdditionalCardCollection) yum0.f(viewF6, R.id.promoAdditionalCollection);
                if (promoAdditionalCardCollection != null) {
                    return new k2k((CardView) viewF6, promoAdditionalCardCollection);
                }
                hny.u("Missing required view with ID: ".concat(viewF6.getResources().getResourceName(R.id.promoAdditionalCollection)));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.delegate_promo_additional_horizontal_item, viewGroup7, false);
                if (((DsHeader) yum0.f(viewF7, R.id.header)) != null) {
                    PromoAdditionalCardCollection promoAdditionalCardCollection2 = (PromoAdditionalCardCollection) yum0.f(viewF7, R.id.promoAdditionalCollection);
                    if (promoAdditionalCardCollection2 != null) {
                        return new j2k((CardView) viewF7, promoAdditionalCardCollection2);
                    }
                } else {
                    i = R.id.header;
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i)));
                return null;
            default:
                ((Drawable) obj).getClass();
                ((m4c0) obj2).getClass();
                return Boolean.FALSE;
        }
    }

    public /* synthetic */ j3b0(int i, byte b) {
        this.f15823a = b;
    }
}
