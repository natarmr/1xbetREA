package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.ui_core.AnimatedCoefficientView;

/* JADX INFO: loaded from: classes4.dex */
public final class s6q extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jk3 f31715a;

    public s6q(Context context) {
        super(context, null, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.fin_bet_make_bet_header_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.coefView;
        AnimatedCoefficientView animatedCoefficientView = (AnimatedCoefficientView) yum0.f(viewInflate, R.id.coefView);
        if (animatedCoefficientView != null) {
            i = R.id.ivLevelArrow;
            ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivLevelArrow);
            if (imageView != null) {
                i = R.id.leftSideBarrier;
                if (((Barrier) yum0.f(viewInflate, R.id.leftSideBarrier)) != null) {
                    i = R.id.tvDash;
                    if (((TextView) yum0.f(viewInflate, R.id.tvDash)) != null) {
                        i = R.id.tvInstrumentName;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(viewInflate, R.id.tvInstrumentName);
                        if (appCompatTextView != null) {
                            i = R.id.tvLevel;
                            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvLevel);
                            if (textView != null) {
                                i = R.id.tvLevelTitle;
                                if (((TextView) yum0.f(viewInflate, R.id.tvLevelTitle)) != null) {
                                    this.f31715a = new jk3((ConstraintLayout) viewInflate, animatedCoefficientView, imageView, appCompatTextView, textView, (byte) 6);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(String str, String str2, l0d l0dVar) {
        str.getClass();
        str2.getClass();
        ((AnimatedCoefficientView) this.f31715a.c).i(str, str2, l0dVar);
    }

    public final void setInstrumentName(String str) {
        str.getClass();
        ((AppCompatTextView) this.f31715a.e).setText(str);
    }

    public final void setPriceLevel(CharSequence charSequence) {
        ((TextView) this.f31715a.f).setText(charSequence);
    }

    public final void setPriceLevelState(boolean z) {
        int iB;
        Drawable drawableU;
        jk3 jk3Var = this.f31715a;
        TextView textView = (TextView) jk3Var.f;
        if (z) {
            Context context = getContext();
            context.getClass();
            iB = m5d.b(R.attr.uikitCoefHigher, context);
        } else {
            Context context2 = getContext();
            context2.getClass();
            iB = m5d.b(R.attr.uikitCoefLower, context2);
        }
        textView.setTextColor(iB);
        ImageView imageView = (ImageView) jk3Var.d;
        if (z) {
            drawableU = epv0.U(R.drawable.ic_glyph_arrow_up, getContext());
            Context context3 = getContext();
            context3.getClass();
            vcc.c0(drawableU, context3, R.attr.uikitCoefHigher);
        } else {
            drawableU = epv0.U(R.drawable.ic_glyph_arrow_down, getContext());
            Context context4 = getContext();
            context4.getClass();
            vcc.c0(drawableU, context4, R.attr.uikitCoefLower);
        }
        imageView.setImageDrawable(drawableU);
    }
}
