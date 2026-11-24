package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.MeasuredImageView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cr60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4828a;

    public /* synthetic */ cr60(byte b) {
        this.f4828a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = 1;
        switch (this.f4828a) {
            case 0:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new wk60(b));
                function2.invoke(new fq60((byte) 3));
                return Unit.f46060a;
            case 1:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                jiq0.w(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                jiq0.a0(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 4:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 5:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 6:
                ru60 ru60Var = (ru60) obj2;
                ((oyg0) obj).getClass();
                ru60Var.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                uen uenVar = wen.b;
                return ru60.a(ru60Var, null, false, false, false, 0L, null, null, null, null, null, null, wen.e(ibc.w0(3L, bfn.SECONDS)) + jCurrentTimeMillis, 4095);
            case 7:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.one_x_games_holder_layout_fg, viewGroup, false);
                int i = R.id.card;
                if (((MaterialCardView) yum0.f(viewF, R.id.card)) != null) {
                    i = R.id.check;
                    CheckBox checkBox = (CheckBox) yum0.f(viewF, R.id.check);
                    if (checkBox != null) {
                        i = R.id.checkable_layout;
                        FrameLayout frameLayout = (FrameLayout) yum0.f(viewF, R.id.checkable_layout);
                        if (frameLayout != null) {
                            i = R.id.favorite;
                            ImageView imageView = (ImageView) yum0.f(viewF, R.id.favorite);
                            if (imageView != null) {
                                i = R.id.flChip;
                                FrameLayout frameLayout2 = (FrameLayout) yum0.f(viewF, R.id.flChip);
                                if (frameLayout2 != null) {
                                    i = R.id.fl_chip_container;
                                    FrameLayout frameLayout3 = (FrameLayout) yum0.f(viewF, R.id.fl_chip_container);
                                    if (frameLayout3 != null) {
                                        i = R.id.fl_demo_chip_container;
                                        if (((FrameLayout) yum0.f(viewF, R.id.fl_demo_chip_container)) != null) {
                                            i = R.id.flTechnicalWorks;
                                            FrameLayout frameLayout4 = (FrameLayout) yum0.f(viewF, R.id.flTechnicalWorks);
                                            if (frameLayout4 != null) {
                                                i = R.id.game_id;
                                                if (((TextView) yum0.f(viewF, R.id.game_id)) != null) {
                                                    i = R.id.image;
                                                    MeasuredImageView measuredImageView = (MeasuredImageView) yum0.f(viewF, R.id.image);
                                                    if (measuredImageView != null) {
                                                        i = R.id.imageTitle;
                                                        TextView textView = (TextView) yum0.f(viewF, R.id.imageTitle);
                                                        if (textView != null) {
                                                            i = R.id.title;
                                                            TextView textView2 = (TextView) yum0.f(viewF, R.id.title);
                                                            if (textView2 != null) {
                                                                i = R.id.tv_chip;
                                                                TextView textView3 = (TextView) yum0.f(viewF, R.id.tv_chip);
                                                                if (textView3 != null) {
                                                                    i = R.id.tv_demo_chip;
                                                                    TextView textView4 = (TextView) yum0.f(viewF, R.id.tv_demo_chip);
                                                                    if (textView4 != null) {
                                                                        return new fz60((ConstraintLayout) viewF, checkBox, frameLayout, imageView, frameLayout2, frameLayout3, frameLayout4, measuredImageView, textView, textView2, textView3, textView4);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 8:
                i8z i8zVar = (i8z) obj;
                ((Integer) obj2).getClass();
                i8zVar.getClass();
                uzb.U(i8zVar, new gtr(true), null, null, null, 14);
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                jar0.I(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 10:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new wk60((byte) 4));
                function4.invoke(new fq60((byte) 9));
                return Unit.f46060a;
            case 11:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 12:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 13:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 14:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 15:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 16:
                i8z i8zVar2 = (i8z) obj;
                ((Integer) obj2).getClass();
                i8zVar2.getClass();
                uzb.U(i8zVar2, new gtr(true), null, null, null, 14);
                return Unit.f46060a;
            case 17:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 18:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 20:
                xb70 xb70Var = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var.getClass();
                return xb70.a(xb70Var, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var.o, false, false, false, 0.0d, true, false, false, 13), null, null, 114687);
            case 21:
                xb70 xb70Var2 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var2.getClass();
                return xb70.a(xb70Var2, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var2.o, false, false, false, 0.0d, true, false, false, 13), null, null, 114687);
            case 22:
                xb70 xb70Var3 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var3.getClass();
                return xb70.a(xb70Var3, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var3.o, false, false, true, 0.0d, false, false, false, 123), null, null, 114687);
            case 23:
                xb70 xb70Var4 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var4.getClass();
                return xb70.a(xb70Var4, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var4.o, false, false, false, 0.0d, false, false, false, 29), null, null, 114687);
            case 24:
                xb70 xb70Var5 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var5.getClass();
                return xb70.a(xb70Var5, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var5.o, false, false, false, 0.0d, false, false, false, 29), null, null, 114687);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                xb70 xb70Var6 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var6.getClass();
                return xb70.a(xb70Var6, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var6.o, false, false, false, 0.0d, false, false, false, 93), null, z870.a(xb70Var6.q, 0, null, false, false, null, false, 31), 49151);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                xb70 xb70Var7 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var7.getClass();
                return xb70.a(xb70Var7, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var7.o, false, false, false, 0.0d, false, false, false, 95), null, null, 114687);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                xb70 xb70Var8 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var8.getClass();
                return xb70.a(xb70Var8, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var8.o, false, true, false, 0.0d, false, false, false, 125), null, null, 114687);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                xb70 xb70Var9 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var9.getClass();
                return xb70.a(xb70Var9, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var9.o, false, false, false, 0.0d, false, true, false, 95), null, null, 114687);
            default:
                xb70 xb70Var10 = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var10.getClass();
                return xb70.a(xb70Var10, null, null, null, false, false, false, false, false, null, false, false, 0, false, fa70.a(xb70Var10.n, false, true, false, false, 0L, false, false, false, 253), null, null, null, 122879);
        }
    }

    public /* synthetic */ cr60(int i, byte b) {
        this.f4828a = b;
    }
}
