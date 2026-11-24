package a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import org.xbet.client1.R;
import org.xplatform.domino.presentation.views.DominoHandView;
import org.xplatform.domino.presentation.views.DominoTableView;
import org.xplatform.ui_core.AnimatedCoefficientView;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes4.dex */
public final class e0f implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6986a = 1;
    public final TextView b;
    public final TextView c;
    public final LinearLayout d;
    public final ViewGroup e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;
    public final View n;

    public e0f(FrameLayout frameLayout, Button button, TextView textView, ImageView imageView, TextView textView2, DominoHandView dominoHandView, ImageView imageView2, Button button2, DominoTableView dominoTableView, Button button3, LinearLayout linearLayout, LinearLayout linearLayout2, DominoHandView dominoHandView2) {
        this.e = frameLayout;
        this.f = button;
        this.b = textView;
        this.g = imageView;
        this.c = textView2;
        this.h = dominoHandView;
        this.i = imageView2;
        this.j = button2;
        this.k = dominoTableView;
        this.l = button3;
        this.d = linearLayout;
        this.m = linearLayout2;
        this.n = dominoHandView2;
    }

    public static e0f a(View view) {
        int i = R.id.coefBackground;
        if (((ConstraintLayout) yum0.f(view, R.id.coefBackground)) != null) {
            i = R.id.coefView;
            AnimatedCoefficientView animatedCoefficientView = (AnimatedCoefficientView) yum0.f(view, R.id.coefView);
            if (animatedCoefficientView != null) {
                i = R.id.coefficientContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.coefficientContainer);
                if (constraintLayout != null) {
                    i = R.id.ivAutoSub;
                    if (((ImageView) yum0.f(view, R.id.ivAutoSub)) != null) {
                        i = R.id.ivEvents;
                        if (((ImageView) yum0.f(view, R.id.ivEvents)) != null) {
                            i = R.id.llAutoSub;
                            LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.llAutoSub);
                            if (linearLayout != null) {
                                i = R.id.maxCoefView;
                                AnimatedCoefficientView animatedCoefficientView2 = (AnimatedCoefficientView) yum0.f(view, R.id.maxCoefView);
                                if (animatedCoefficientView2 != null) {
                                    i = R.id.maxShimmerCoef;
                                    DsShimmerView dsShimmerView = (DsShimmerView) yum0.f(view, R.id.maxShimmerCoef);
                                    if (dsShimmerView != null) {
                                        i = R.id.optiCoefBackground;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(view, R.id.optiCoefBackground);
                                        if (constraintLayout2 != null) {
                                            i = R.id.optiCoefView;
                                            AnimatedCoefficientView animatedCoefficientView3 = (AnimatedCoefficientView) yum0.f(view, R.id.optiCoefView);
                                            if (animatedCoefficientView3 != null) {
                                                i = R.id.optiGroup;
                                                Group group = (Group) yum0.f(view, R.id.optiGroup);
                                                if (group != null) {
                                                    i = R.id.optiShimmerCoef;
                                                    DsShimmerView dsShimmerView2 = (DsShimmerView) yum0.f(view, R.id.optiShimmerCoef);
                                                    if (dsShimmerView2 != null) {
                                                        i = R.id.shimmerCoef;
                                                        DsShimmerView dsShimmerView3 = (DsShimmerView) yum0.f(view, R.id.shimmerCoef);
                                                        if (dsShimmerView3 != null) {
                                                            i = R.id.space;
                                                            if (((Space) yum0.f(view, R.id.space)) != null) {
                                                                i = R.id.tvAutoSub;
                                                                if (((TextView) yum0.f(view, R.id.tvAutoSub)) != null) {
                                                                    i = R.id.tvCoefficientTitle;
                                                                    TextView textView = (TextView) yum0.f(view, R.id.tvCoefficientTitle);
                                                                    if (textView != null) {
                                                                        i = R.id.tvEvents;
                                                                        if (((TextView) yum0.f(view, R.id.tvEvents)) != null) {
                                                                            i = R.id.tvEventsCount;
                                                                            TextView textView2 = (TextView) yum0.f(view, R.id.tvEventsCount);
                                                                            if (textView2 != null) {
                                                                                i = R.id.tvMaxCoefTitle;
                                                                                if (((TextView) yum0.f(view, R.id.tvMaxCoefTitle)) != null) {
                                                                                    i = R.id.tvOptiCoefTitle;
                                                                                    if (((TextView) yum0.f(view, R.id.tvOptiCoefTitle)) != null) {
                                                                                        return new e0f((ConstraintLayout) view, animatedCoefficientView, constraintLayout, linearLayout, animatedCoefficientView2, dsShimmerView, constraintLayout2, animatedCoefficientView3, group, dsShimmerView2, dsShimmerView3, textView, textView2);
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
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f6986a;
        ViewGroup viewGroup = this.e;
        switch (b) {
            case 0:
                return (ConstraintLayout) viewGroup;
            default:
                return (FrameLayout) viewGroup;
        }
    }

    public e0f(ConstraintLayout constraintLayout, AnimatedCoefficientView animatedCoefficientView, ConstraintLayout constraintLayout2, LinearLayout linearLayout, AnimatedCoefficientView animatedCoefficientView2, DsShimmerView dsShimmerView, ConstraintLayout constraintLayout3, AnimatedCoefficientView animatedCoefficientView3, Group group, DsShimmerView dsShimmerView2, DsShimmerView dsShimmerView3, TextView textView, TextView textView2) {
        this.e = constraintLayout;
        this.h = animatedCoefficientView;
        this.f = constraintLayout2;
        this.d = linearLayout;
        this.i = animatedCoefficientView2;
        this.k = dsShimmerView;
        this.g = constraintLayout3;
        this.j = animatedCoefficientView3;
        this.n = group;
        this.l = dsShimmerView2;
        this.m = dsShimmerView3;
        this.b = textView;
        this.c = textView2;
    }
}
