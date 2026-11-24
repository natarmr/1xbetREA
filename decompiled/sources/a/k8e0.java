package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k8e0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17868a;

    public /* synthetic */ k8e0(byte b) {
        this.f17868a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17868a) {
            case 0:
                ((Integer) obj2).getClass();
                hp4.v(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 1:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 2:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 3:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 4:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 5:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 6:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new bod0((byte) 22));
                function2.invoke(new o6e0((byte) 8));
                return Unit.f46060a;
            case 7:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case 8:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.game_collection_rectangle_shimmer, viewGroup, false);
                if (((DsShimmerView) yum0.f(viewF, R.id.shimmerContent)) != null) {
                    return new auh((FrameLayout) viewF, (byte) 4);
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(R.id.shimmerContent)));
                return null;
            case 9:
                ((Integer) obj2).getClass();
                dj8.O(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                rq8.o(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                uc9.D(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 12:
                return Unit.f46060a;
            case 13:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 14:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.layout_referral_item, viewGroup2, false);
                int i = R.id.buttonDelete;
                ImageView imageView = (ImageView) yum0.f(viewF2, R.id.buttonDelete);
                if (imageView != null) {
                    i = R.id.networkCount;
                    TextView textView = (TextView) yum0.f(viewF2, R.id.networkCount);
                    if (textView != null) {
                        i = R.id.networkLevel;
                        TextView textView2 = (TextView) yum0.f(viewF2, R.id.networkLevel);
                        if (textView2 != null) {
                            i = R.id.profit;
                            TextView textView3 = (TextView) yum0.f(viewF2, R.id.profit);
                            if (textView3 != null) {
                                i = R.id.referralIcon;
                                if (((ImageView) yum0.f(viewF2, R.id.referralIcon)) != null) {
                                    i = R.id.referralId;
                                    TextView textView4 = (TextView) yum0.f(viewF2, R.id.referralId);
                                    if (textView4 != null) {
                                        i = R.id.registrationDate;
                                        TextView textView5 = (TextView) yum0.f(viewF2, R.id.registrationDate);
                                        if (textView5 != null) {
                                            i = R.id.titlesContainer;
                                            if (((LinearLayoutCompat) yum0.f(viewF2, R.id.titlesContainer)) != null) {
                                                i = R.id.valuesContainer;
                                                if (((LinearLayoutCompat) yum0.f(viewF2, R.id.valuesContainer)) != null) {
                                                    return new t7z((FrameLayout) viewF2, imageView, textView, textView2, textView3, textView4, textView5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i)));
                return null;
            case 15:
                ((Integer) obj).intValue();
                y0f0 y0f0Var = (y0f0) obj2;
                y0f0Var.getClass();
                return y0f0Var.getKey();
            case 16:
                aye0 aye0Var = (aye0) obj2;
                ((oyg0) obj).getClass();
                aye0Var.getClass();
                return aye0.a(aye0Var, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147467263);
            case 17:
                aye0 aye0Var2 = (aye0) obj2;
                ((oyg0) obj).getClass();
                aye0Var2.getClass();
                return aye0.a(aye0Var2, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483646);
            case 18:
                ((Integer) obj).intValue();
                z0f0 z0f0Var = (z0f0) obj2;
                z0f0Var.getClass();
                return z0f0Var.getKey();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj).intValue();
                x0f0 x0f0Var = (x0f0) obj2;
                x0f0Var.getClass();
                return x0f0Var.getKey();
            case 20:
                mbf0 mbf0Var = (mbf0) obj2;
                ((oyg0) obj).getClass();
                mbf0Var.getClass();
                return mbf0.a(mbf0Var, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741822);
            case 21:
                mbf0 mbf0Var2 = (mbf0) obj2;
                ((oyg0) obj).getClass();
                mbf0Var2.getClass();
                return mbf0.a(mbf0Var2, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741822);
            case 22:
                mbf0 mbf0Var3 = (mbf0) obj2;
                ((oyg0) obj).getClass();
                mbf0Var3.getClass();
                return mbf0.a(mbf0Var3, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073725439);
            case 23:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(gef0.f11154a);
                function4.invoke(new b4f0((byte) 4));
                return Unit.f46060a;
            case 24:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.remove_team_menu_item, viewGroup3, false);
                LinearLayout linearLayout = (LinearLayout) viewF3;
                if (((TextView) yum0.f(viewF3, R.id.tvRemoveTeam)) != null) {
                    return new mif0(linearLayout);
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(R.id.tvRemoveTeam)));
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                jge0 jge0Var = (jge0) obj;
                jge0 jge0Var2 = (jge0) obj2;
                jge0Var.getClass();
                jge0Var2.getClass();
                float f = jge0Var.b;
                float f2 = jge0Var.d;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jge0Var2.e() & 4294967295L));
                return Boolean.valueOf(fIntBitsToFloat >= f && fIntBitsToFloat < f2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                jge0 jge0Var3 = (jge0) obj;
                jge0 jge0Var4 = (jge0) obj2;
                jge0Var3.getClass();
                jge0Var4.getClass();
                float f3 = jge0Var3.f16474a;
                float f4 = jge0Var3.c;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jge0Var4.e() >> 32));
                return Boolean.valueOf(fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_responsible_button, viewGroup4, false);
                int i2 = R.id.iconItem;
                AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewF4, R.id.iconItem);
                if (appCompatImageView != null) {
                    i2 = R.id.titleItem;
                    TextView textView6 = (TextView) yum0.f(viewF4, R.id.titleItem);
                    if (textView6 != null) {
                        return new axx((LinearLayout) viewF4, appCompatImageView, textView6);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i2)));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_responsible_contact, viewGroup5, false);
                int i3 = R.id.tvDescription;
                TextView textView7 = (TextView) yum0.f(viewF5, R.id.tvDescription);
                if (textView7 != null) {
                    i3 = R.id.tvLinkTitle;
                    TextView textView8 = (TextView) yum0.f(viewF5, R.id.tvLinkTitle);
                    if (textView8 != null) {
                        return new bxx((LinearLayout) viewF5, textView7, textView8);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i3)));
                return null;
            default:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_responsible_divider, viewGroup6, false);
                if (viewF6 != null) {
                    return new mzq(viewF6, (byte) 4);
                }
                hny.u("rootView");
                return null;
        }
    }

    public /* synthetic */ k8e0(int i, byte b) {
        this.f17868a = b;
    }
}
