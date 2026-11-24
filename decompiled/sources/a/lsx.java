package a;

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
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.MatchTimerView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes.dex */
public final class lsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f20602a;
    public final RoundCornerImageView b;
    public final RoundCornerImageView c;
    public final ImageView d;
    public final RoundCornerImageView e;
    public final ImageView f;
    public final ImageView g;
    public final ImageView h;
    public final ImageView i;
    public final RoundCornerImageView j;
    public final RoundCornerImageView k;
    public final ImageView l;
    public final RoundCornerImageView m;
    public final ConstraintLayout n;
    public final ConstraintLayout o;
    public final AppCompatTextView p;
    public final TextView q;
    public final TextView r;
    public final AppCompatTextView s;
    public final AppCompatTextView t;
    public final AppCompatTextView u;
    public final TextView v;
    public final MatchTimerView w;

    public lsx(ConstraintLayout constraintLayout, RoundCornerImageView roundCornerImageView, RoundCornerImageView roundCornerImageView2, ImageView imageView, RoundCornerImageView roundCornerImageView3, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, RoundCornerImageView roundCornerImageView4, RoundCornerImageView roundCornerImageView5, ImageView imageView6, RoundCornerImageView roundCornerImageView6, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatTextView appCompatTextView, TextView textView, TextView textView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, TextView textView3, MatchTimerView matchTimerView) {
        this.f20602a = constraintLayout;
        this.b = roundCornerImageView;
        this.c = roundCornerImageView2;
        this.d = imageView;
        this.e = roundCornerImageView3;
        this.f = imageView2;
        this.g = imageView3;
        this.h = imageView4;
        this.i = imageView5;
        this.j = roundCornerImageView4;
        this.k = roundCornerImageView5;
        this.l = imageView6;
        this.m = roundCornerImageView6;
        this.n = constraintLayout2;
        this.o = constraintLayout3;
        this.p = appCompatTextView;
        this.q = textView;
        this.r = textView2;
        this.s = appCompatTextView2;
        this.t = appCompatTextView3;
        this.u = appCompatTextView4;
        this.v = textView3;
        this.w = matchTimerView;
    }

    public static lsx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_card_common, viewGroup, false);
        int i = R.id.bTeamImagesBottom;
        if (((Barrier) yum0.f(viewInflate, R.id.bTeamImagesBottom)) != null) {
            i = R.id.bTeamImagesTop;
            if (((Barrier) yum0.f(viewInflate, R.id.bTeamImagesTop)) != null) {
                i = R.id.bTeamNamesBottom;
                if (((Barrier) yum0.f(viewInflate, R.id.bTeamNamesBottom)) != null) {
                    i = R.id.bTeamNamesTop;
                    if (((Barrier) yum0.f(viewInflate, R.id.bTeamNamesTop)) != null) {
                        i = R.id.flFirstTeamInfo;
                        if (((FrameLayout) yum0.f(viewInflate, R.id.flFirstTeamInfo)) != null) {
                            i = R.id.flSecondTeamInfo;
                            if (((FrameLayout) yum0.f(viewInflate, R.id.flSecondTeamInfo)) != null) {
                                i = R.id.ivFirstPlayerOneTeamImage;
                                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivFirstPlayerOneTeamImage);
                                if (roundCornerImageView != null) {
                                    i = R.id.ivFirstPlayerTwoTeamImage;
                                    RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivFirstPlayerTwoTeamImage);
                                    if (roundCornerImageView2 != null) {
                                        i = R.id.ivFirstTeamFavorite;
                                        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivFirstTeamFavorite);
                                        if (imageView != null) {
                                            i = R.id.ivFirstTeamImage;
                                            RoundCornerImageView roundCornerImageView3 = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivFirstTeamImage);
                                            if (roundCornerImageView3 != null) {
                                                i = R.id.ivPairTeamFirstPlayerOneTeamFavorite;
                                                ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivPairTeamFirstPlayerOneTeamFavorite);
                                                if (imageView2 != null) {
                                                    i = R.id.ivPairTeamFirstPlayerTwoTeamFavorite;
                                                    ImageView imageView3 = (ImageView) yum0.f(viewInflate, R.id.ivPairTeamFirstPlayerTwoTeamFavorite);
                                                    if (imageView3 != null) {
                                                        i = R.id.ivPairTeamSecondPlayerOneTeamFavorite;
                                                        ImageView imageView4 = (ImageView) yum0.f(viewInflate, R.id.ivPairTeamSecondPlayerOneTeamFavorite);
                                                        if (imageView4 != null) {
                                                            i = R.id.ivPairTeamSecondPlayerTwoTeamFavorite;
                                                            ImageView imageView5 = (ImageView) yum0.f(viewInflate, R.id.ivPairTeamSecondPlayerTwoTeamFavorite);
                                                            if (imageView5 != null) {
                                                                i = R.id.ivSecondPlayerOneTeamImage;
                                                                RoundCornerImageView roundCornerImageView4 = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivSecondPlayerOneTeamImage);
                                                                if (roundCornerImageView4 != null) {
                                                                    i = R.id.ivSecondPlayerTwoTeamImage;
                                                                    RoundCornerImageView roundCornerImageView5 = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivSecondPlayerTwoTeamImage);
                                                                    if (roundCornerImageView5 != null) {
                                                                        i = R.id.ivSecondTeamFavorite;
                                                                        ImageView imageView6 = (ImageView) yum0.f(viewInflate, R.id.ivSecondTeamFavorite);
                                                                        if (imageView6 != null) {
                                                                            i = R.id.ivSecondTeamImage;
                                                                            RoundCornerImageView roundCornerImageView6 = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivSecondTeamImage);
                                                                            if (roundCornerImageView6 != null) {
                                                                                i = R.id.llOneTeamPairContainerImages;
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewInflate, R.id.llOneTeamPairContainerImages);
                                                                                if (constraintLayout != null) {
                                                                                    i = R.id.llTwoTeamPairContainerImages;
                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(viewInflate, R.id.llTwoTeamPairContainerImages);
                                                                                    if (constraintLayout2 != null) {
                                                                                        i = R.id.tvFirstTeamName;
                                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(viewInflate, R.id.tvFirstTeamName);
                                                                                        if (appCompatTextView != null) {
                                                                                            i = R.id.tvFirstTeamRedCards;
                                                                                            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvFirstTeamRedCards);
                                                                                            if (textView != null) {
                                                                                                i = R.id.tvMatchDescription;
                                                                                                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvMatchDescription);
                                                                                                if (textView2 != null) {
                                                                                                    i = R.id.tvMatchPeriodInfo;
                                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) yum0.f(viewInflate, R.id.tvMatchPeriodInfo);
                                                                                                    if (appCompatTextView2 != null) {
                                                                                                        i = R.id.tvScore;
                                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) yum0.f(viewInflate, R.id.tvScore);
                                                                                                        if (appCompatTextView3 != null) {
                                                                                                            i = R.id.tvSecondTeamName;
                                                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) yum0.f(viewInflate, R.id.tvSecondTeamName);
                                                                                                            if (appCompatTextView4 != null) {
                                                                                                                i = R.id.tvSecondTeamRedCards;
                                                                                                                TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvSecondTeamRedCards);
                                                                                                                if (textView3 != null) {
                                                                                                                    i = R.id.vMatchTimer;
                                                                                                                    MatchTimerView matchTimerView = (MatchTimerView) yum0.f(viewInflate, R.id.vMatchTimer);
                                                                                                                    if (matchTimerView != null) {
                                                                                                                        return new lsx((ConstraintLayout) viewInflate, roundCornerImageView, roundCornerImageView2, imageView, roundCornerImageView3, imageView2, imageView3, imageView4, imageView5, roundCornerImageView4, roundCornerImageView5, imageView6, roundCornerImageView6, constraintLayout, constraintLayout2, appCompatTextView, textView, textView2, appCompatTextView2, appCompatTextView3, appCompatTextView4, textView3, matchTimerView);
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20602a;
    }
}
