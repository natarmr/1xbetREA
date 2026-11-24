package a;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class gif extends v46 {
    public static final /* synthetic */ int w = 0;
    public final /* synthetic */ byte u;
    public final yfu0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gif(View view, byte b) {
        super(view);
        this.u = b;
        view.getClass();
        switch (b) {
            case 1:
                super(view);
                int i = R.id.image_prize;
                ImageView imageView = (ImageView) yum0.f(view, R.id.image_prize);
                if (imageView != null) {
                    i = R.id.text_prize_name;
                    TextView textView = (TextView) yum0.f(view, R.id.text_prize_name);
                    if (textView != null) {
                        this.v = new vd7((ConstraintLayout) view, imageView, textView, (byte) 17);
                        return;
                    }
                }
                hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
                throw null;
            case 2:
                super(view);
                int i2 = R.id.cl_daily_winner;
                ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.cl_daily_winner);
                if (constraintLayout != null) {
                    i2 = R.id.guideline_1;
                    if (((Guideline) yum0.f(view, R.id.guideline_1)) != null) {
                        i2 = R.id.guideline_2;
                        if (((Guideline) yum0.f(view, R.id.guideline_2)) != null) {
                            i2 = R.id.guideline_3;
                            if (((Guideline) yum0.f(view, R.id.guideline_3)) != null) {
                                i2 = R.id.number;
                                TextView textView2 = (TextView) yum0.f(view, R.id.number);
                                if (textView2 != null) {
                                    i2 = R.id.user_name;
                                    TextView textView3 = (TextView) yum0.f(view, R.id.user_name);
                                    if (textView3 != null) {
                                        i2 = R.id.user_point;
                                        TextView textView4 = (TextView) yum0.f(view, R.id.user_point);
                                        if (textView4 != null) {
                                            i2 = R.id.user_prize;
                                            TextView textView5 = (TextView) yum0.f(view, R.id.user_prize);
                                            if (textView5 != null) {
                                                this.v = new uk5((LinearLayout) view, constraintLayout, textView2, textView3, textView4, textView5);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
                throw null;
            case 3:
                super(view);
                TextView textView6 = (TextView) view;
                this.v = new dtx(textView6, textView6, (byte) 2);
                return;
            case 4:
                super(view);
                int i3 = R.id.descriptionTextView;
                TextView textView7 = (TextView) yum0.f(view, R.id.descriptionTextView);
                if (textView7 != null) {
                    i3 = R.id.iconImageView;
                    ImageView imageView2 = (ImageView) yum0.f(view, R.id.iconImageView);
                    if (imageView2 != null) {
                        i3 = R.id.ivCroppedIcon;
                        ImageView imageView3 = (ImageView) yum0.f(view, R.id.ivCroppedIcon);
                        if (imageView3 != null) {
                            i3 = R.id.titleTextView;
                            TextView textView8 = (TextView) yum0.f(view, R.id.titleTextView);
                            if (textView8 != null) {
                                i3 = R.id.vRoundedCroppedIcon;
                                View viewF = yum0.f(view, R.id.vRoundedCroppedIcon);
                                if (viewF != null) {
                                    this.v = new uk5((ConstraintLayout) view, textView7, imageView2, imageView3, textView8, viewF);
                                    return;
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
                throw null;
            default:
                int i4 = R.id.comboContainer;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(view, R.id.comboContainer);
                if (constraintLayout2 != null) {
                    i4 = R.id.crystalImage;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.crystalImage);
                    if (appCompatImageView != null) {
                        i4 = R.id.crystalsCount;
                        TextView textView9 = (TextView) yum0.f(view, R.id.crystalsCount);
                        if (textView9 != null) {
                            i4 = R.id.winAmount;
                            TextView textView10 = (TextView) yum0.f(view, R.id.winAmount);
                            if (textView10 != null) {
                                this.v = new jk3((FrameLayout) view, constraintLayout2, appCompatImageView, textView9, textView10, (byte) 4);
                                return;
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
                throw null;
        }
    }

    @Override // a.v46
    public final void t(Object obj) {
        int i;
        int iA;
        byte b = this.u;
        View view = this.f40887a;
        yfu0 yfu0Var = this.v;
        switch (b) {
            case 0:
                bif bifVar = (bif) obj;
                bifVar.getClass();
                jk3 jk3Var = (jk3) yfu0Var;
                AppCompatImageView appCompatImageView = (AppCompatImageView) jk3Var.d;
                switch (bifVar.b) {
                    case WILD_COIN:
                        i = R.drawable.crystal_wild_coin;
                        break;
                    case RED:
                        i = R.drawable.crystal_red;
                        break;
                    case PURPLE:
                        i = R.drawable.crystal_purple;
                        break;
                    case GREEN:
                        i = R.drawable.crystal_green;
                        break;
                    case ORANGE:
                        i = R.drawable.crystal_orange;
                        break;
                    case DIAMOND:
                        i = R.drawable.crystal_diamond;
                        break;
                    case BLUE:
                        i = R.drawable.crystal_blue;
                        break;
                    default:
                        t9f.b();
                        break;
                }
                appCompatImageView.setImageResource(i);
                ((TextView) jk3Var.e).setText(view.getContext().getString(R.string.factor, Double.valueOf(bifVar.f2657a)));
                TextView textView = (TextView) jk3Var.f;
                pn40 pn40Var = pn40.f27267a;
                textView.setText(pn40.c(bifVar.c, p3u0.c));
                ((ConstraintLayout) jk3Var.c).setBackground(epv0.U(c() % 2 == 0 ? R.drawable.transparent : R.drawable.rectangle_rounded_black_15, view.getContext()));
                break;
            case 1:
                wxb0 wxb0Var = (wxb0) obj;
                wxb0Var.getClass();
                vd7 vd7Var = (vd7) yfu0Var;
                ((TextView) vd7Var.d).setText(wxb0Var.f39925a);
                List list = u0d.f34849a;
                u0d.j((ImageView) vd7Var.c, wxb0Var.b, 0, 0, null, null, null, 510);
                break;
            case 2:
                x1s0 x1s0Var = (x1s0) obj;
                uk5 uk5Var = (uk5) yfu0Var;
                x1s0Var.getClass();
                if (d() % 2 == 0) {
                    TypedValue typedValue = j5d.f15927a;
                    Context context = view.getContext();
                    context.getClass();
                    iA = j5d.a(context, R.attr.uikitBackgroundContent, false);
                } else {
                    TypedValue typedValue2 = j5d.f15927a;
                    Context context2 = view.getContext();
                    context2.getClass();
                    iA = j5d.a(context2, R.attr.uikitBackground, false);
                }
                ((ConstraintLayout) uk5Var.b).setBackgroundColor(iA);
                ((TextView) uk5Var.c).setText(String.valueOf(x1s0Var.c));
                ((TextView) uk5Var.d).setText(x1s0Var.f40135a);
                ((TextView) uk5Var.e).setText(String.valueOf(x1s0Var.b));
                ((TextView) uk5Var.g).setText(x1s0Var.d);
                break;
            case 3:
                ykg0 ykg0Var = (ykg0) obj;
                ykg0Var.getClass();
                TextView textView2 = ((dtx) yfu0Var).c;
                String str = ykg0Var.b;
                textView2.setVisibility(str.length() > 0 ? 0 : 8);
                if (str.length() > 0) {
                    Float fValueOf = Float.valueOf(8.0f);
                    Float fValueOf2 = Float.valueOf(16.0f);
                    if (ykg0Var.f42786a) {
                        textView2.setTextAppearance(R.style.TextAppearance_AppTheme_New_H6_Medium);
                        sj3.K0(textView2, fValueOf2, Float.valueOf(24.0f), fValueOf2, Float.valueOf(0.0f));
                    } else if (ykg0Var.c.a()) {
                        textView2.setTextAppearance(R.style.TextAppearance_AppTheme_New_Body1);
                        sj3.K0(textView2, fValueOf2, Float.valueOf(6.0f), fValueOf2, fValueOf);
                    } else {
                        textView2.setTextAppearance(R.style.TextAppearance_AppTheme_New_Body1);
                        sj3.K0(textView2, fValueOf2, fValueOf, fValueOf2, Float.valueOf(2.0f));
                    }
                }
                textView2.setText(str);
                break;
            default:
                yoq0 yoq0Var = (yoq0) obj;
                yoq0Var.getClass();
                uk5 uk5Var2 = (uk5) yfu0Var;
                TextView textView3 = (TextView) uk5Var2.d;
                View view2 = (View) uk5Var2.f;
                ImageView imageView = (ImageView) uk5Var2.e;
                textView3.setText(yoq0Var.f42999a);
                ((TextView) uk5Var2.c).setText(yoq0Var.b);
                String str2 = yoq0Var.c;
                boolean z = yoq0Var.d;
                ImageView imageView2 = (ImageView) uk5Var2.g;
                if (z) {
                    imageView2.setVisibility(4);
                    imageView.setVisibility(0);
                    view2.setVisibility(0);
                } else {
                    imageView2.setVisibility(0);
                    imageView.setVisibility(4);
                    view2.setVisibility(8);
                }
                List list2 = u0d.f34849a;
                u0d.j(z ? imageView : imageView2, str2, R.drawable.onboarding_placeholder, 0, null, null, null, 508);
                break;
        }
    }
}
