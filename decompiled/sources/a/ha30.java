package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.core.presentation.views.ForegroundImageView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.MatchTimerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoTabsContainerView;
import org.xplatform.ui_core.circleindicator.CircleIndicator;
import org.xplatform.ui_core.viewcomponents.layouts.frame.ProgressBarWithSandClockNew;
import org.xplatform.ui_core.viewcomponents.layouts.frame.ProgressBarWithSendClock;
import org.xplatform.ui_core.viewcomponents.views.FrozenRecyclerView;
import org.xplatform.ui_core.viewcomponents.views.NumberItemView;
import org.xplatform.ui_core.viewcomponents.views.NumberKeyboardView;

/* JADX INFO: loaded from: classes5.dex */
public final class ha30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12707a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ha30(Object obj, Object obj2, byte b) {
        this.f12707a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wmv wmvVar;
        miu0 miu0VarN;
        miu0 miu0VarN2;
        miu0 miu0VarN3;
        miu0 miu0VarN4;
        miu0 miu0VarN5;
        miu0 miu0VarN6;
        miu0 miu0VarN7;
        miu0 miu0VarN8;
        miu0 miu0VarN9;
        miu0 miu0VarN10;
        byte b = this.f12707a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(((MatchInfoContainerView) obj2).getContext());
                layoutInflaterFrom.getClass();
                MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) obj;
                layoutInflaterFrom.inflate(R.layout.view_match_info_content, matchInfoContainerView);
                int i = R.id.cVSimulation;
                ComposeView composeView = (ComposeView) yum0.f(matchInfoContainerView, R.id.cVSimulation);
                if (composeView != null) {
                    i = R.id.ciBroadcasting;
                    CircleIndicator circleIndicator = (CircleIndicator) yum0.f(matchInfoContainerView, R.id.ciBroadcasting);
                    if (circleIndicator != null) {
                        i = R.id.ciInformation;
                        CircleIndicator circleIndicator2 = (CircleIndicator) yum0.f(matchInfoContainerView, R.id.ciInformation);
                        if (circleIndicator2 != null) {
                            i = R.id.fCardsContainer;
                            ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(matchInfoContainerView, R.id.fCardsContainer);
                            if (constraintLayout != null) {
                                i = R.id.fTabsContainer;
                                MatchInfoTabsContainerView matchInfoTabsContainerView = (MatchInfoTabsContainerView) yum0.f(matchInfoContainerView, R.id.fTabsContainer);
                                if (matchInfoTabsContainerView != null) {
                                    i = R.id.ivBackground;
                                    ImageView imageView = (ImageView) yum0.f(matchInfoContainerView, R.id.ivBackground);
                                    if (imageView != null) {
                                        i = R.id.rvCompressedCard;
                                        FrozenRecyclerView frozenRecyclerView = (FrozenRecyclerView) yum0.f(matchInfoContainerView, R.id.rvCompressedCard);
                                        if (frozenRecyclerView != null) {
                                            i = R.id.rvMatchInfoCards;
                                            RecyclerView recyclerView = (RecyclerView) yum0.f(matchInfoContainerView, R.id.rvMatchInfoCards);
                                            if (recyclerView != null) {
                                                i = R.id.viewCardsShimmer;
                                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) yum0.f(matchInfoContainerView, R.id.viewCardsShimmer);
                                                if (shimmerFrameLayout != null) {
                                                    i = R.id.vpBroadcasts;
                                                    ViewPager2 viewPager2 = (ViewPager2) yum0.f(matchInfoContainerView, R.id.vpBroadcasts);
                                                    if (viewPager2 != null) {
                                                        return new zhu0(matchInfoContainerView, composeView, circleIndicator, circleIndicator2, constraintLayout, matchInfoTabsContainerView, imageView, frozenRecyclerView, recyclerView, shimmerFrameLayout, viewPager2);
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
                hny.u("Missing required view with ID: ".concat(matchInfoContainerView.getResources().getResourceName(i)));
                return null;
            case 1:
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(((MatchInfoTabsContainerView) obj2).getContext());
                layoutInflaterFrom2.getClass();
                MatchInfoTabsContainerView matchInfoTabsContainerView2 = (MatchInfoTabsContainerView) obj;
                layoutInflaterFrom2.inflate(R.layout.view_match_info_tabs_container, matchInfoTabsContainerView2);
                int i2 = R.id.tvBroadcasting;
                TextView textView = (TextView) yum0.f(matchInfoTabsContainerView2, R.id.tvBroadcasting);
                if (textView != null) {
                    i2 = R.id.tvInformation;
                    TextView textView2 = (TextView) yum0.f(matchInfoTabsContainerView2, R.id.tvInformation);
                    if (textView2 != null) {
                        return new aiu0(matchInfoTabsContainerView2, textView, textView2);
                    }
                }
                hny.u("Missing required view with ID: ".concat(matchInfoTabsContainerView2.getResources().getResourceName(i2)));
                return null;
            case 2:
                LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(((MatchTimerView) obj2).getContext());
                layoutInflaterFrom3.getClass();
                MatchTimerView matchTimerView = (MatchTimerView) obj;
                layoutInflaterFrom3.inflate(R.layout.view_match_timer, matchTimerView);
                int i3 = R.id.fTimer;
                Flow flow = (Flow) yum0.f(matchTimerView, R.id.fTimer);
                if (flow != null) {
                    i3 = R.id.grHors;
                    Group group = (Group) yum0.f(matchTimerView, R.id.grHors);
                    if (group != null) {
                        i3 = R.id.tvColonOne;
                        if (((TextView) yum0.f(matchTimerView, R.id.tvColonOne)) != null) {
                            i3 = R.id.tvColonTwo;
                            if (((TextView) yum0.f(matchTimerView, R.id.tvColonTwo)) != null) {
                                i3 = R.id.tvHours;
                                TextView textView3 = (TextView) yum0.f(matchTimerView, R.id.tvHours);
                                if (textView3 != null) {
                                    i3 = R.id.tvMinutes;
                                    TextView textView4 = (TextView) yum0.f(matchTimerView, R.id.tvMinutes);
                                    if (textView4 != null) {
                                        i3 = R.id.tvSeconds;
                                        TextView textView5 = (TextView) yum0.f(matchTimerView, R.id.tvSeconds);
                                        if (textView5 != null) {
                                            i3 = R.id.tvTimerInfo;
                                            TextView textView6 = (TextView) yum0.f(matchTimerView, R.id.tvTimerInfo);
                                            if (textView6 != null) {
                                                return new biu0(matchTimerView, flow, group, textView3, textView4, textView5, textView6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(matchTimerView.getResources().getResourceName(i3)));
                return null;
            case 3:
                ((Function1) obj2).invoke(new og30(((mg30) obj).f21723a));
                return Unit.f46060a;
            case 4:
                LayoutInflater layoutInflaterFrom4 = LayoutInflater.from(((gt30) obj2).getContext());
                layoutInflaterFrom4.getClass();
                gt30 gt30Var = (gt30) obj;
                View viewInflate = layoutInflaterFrom4.inflate(R.layout.view_memory_slot, (ViewGroup) gt30Var, false);
                gt30Var.addView(viewInflate);
                int i4 = R.id.ivBack;
                ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivBack);
                if (imageView2 != null) {
                    i4 = R.id.ivFace;
                    ForegroundImageView foregroundImageView = (ForegroundImageView) yum0.f(viewInflate, R.id.ivFace);
                    if (foregroundImageView != null) {
                        return new ciu0((FrameLayout) viewInflate, imageView2, foregroundImageView);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                return null;
            case 5:
                ((Function1) obj2).invoke(((q2k0) obj).f28003a);
                return Unit.f46060a;
            case 6:
                ((Function1) obj2).invoke(Long.valueOf(((qa40) obj).f28377a));
                return Unit.f46060a;
            case 7:
                y3r0 y3r0Var = (y3r0) obj;
                ((Function2) obj2).invoke(Integer.valueOf(y3r0Var.f41967a), y3r0Var.b);
                return Unit.f46060a;
            case 8:
                LayoutInflater layoutInflaterFrom5 = LayoutInflater.from(((zv40) obj2).getContext());
                layoutInflaterFrom5.getClass();
                zv40 zv40Var = (zv40) obj;
                View viewInflate2 = layoutInflaterFrom5.inflate(R.layout.view_search_chips, (ViewGroup) zv40Var, false);
                zv40Var.addView(viewInflate2);
                int i5 = R.id.image;
                ImageView imageView3 = (ImageView) yum0.f(viewInflate2, R.id.image);
                if (imageView3 != null) {
                    i5 = R.id.title;
                    TextView textView7 = (TextView) yum0.f(viewInflate2, R.id.title);
                    if (textView7 != null) {
                        return new qku0((FrameLayout) viewInflate2, imageView3, textView7);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i5)));
                return null;
            case 9:
                cty ctyVar = (cty) obj;
                Iterable iterable = (List) ((zl50) obj2).e.getValue();
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((tft0) it.next()).f0(ctyVar));
                }
                return arrayList;
            case 10:
                LayoutInflater layoutInflaterFrom6 = LayoutInflater.from(((NumberItemView) obj2).getContext());
                layoutInflaterFrom6.getClass();
                NumberItemView numberItemView = (NumberItemView) obj;
                View viewInflate3 = layoutInflaterFrom6.inflate(R.layout.number_item_view, (ViewGroup) numberItemView, false);
                numberItemView.addView(viewInflate3);
                int i6 = R.id.digit_item_view;
                TextView textView8 = (TextView) yum0.f(viewInflate3, R.id.digit_item_view);
                if (textView8 != null) {
                    i6 = R.id.letters_item_view;
                    TextView textView9 = (TextView) yum0.f(viewInflate3, R.id.letters_item_view);
                    if (textView9 != null) {
                        return new u860((LinearLayout) viewInflate3, textView8, textView9);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i6)));
                return null;
            case 11:
                LayoutInflater layoutInflaterFrom7 = LayoutInflater.from(((NumberKeyboardView) obj2).getContext());
                layoutInflaterFrom7.getClass();
                NumberKeyboardView numberKeyboardView = (NumberKeyboardView) obj;
                View viewInflate4 = layoutInflaterFrom7.inflate(R.layout.number_keyboard_view, (ViewGroup) numberKeyboardView, false);
                numberKeyboardView.addView(viewInflate4);
                int i7 = R.id.eight_button;
                NumberItemView numberItemView2 = (NumberItemView) yum0.f(viewInflate4, R.id.eight_button);
                if (numberItemView2 != null) {
                    i7 = R.id.erase_button;
                    ImageView imageView4 = (ImageView) yum0.f(viewInflate4, R.id.erase_button);
                    if (imageView4 != null) {
                        i7 = R.id.fingerprint_button;
                        FrameLayout frameLayout = (FrameLayout) yum0.f(viewInflate4, R.id.fingerprint_button);
                        if (frameLayout != null) {
                            i7 = R.id.five_button;
                            NumberItemView numberItemView3 = (NumberItemView) yum0.f(viewInflate4, R.id.five_button);
                            if (numberItemView3 != null) {
                                i7 = R.id.four_button;
                                NumberItemView numberItemView4 = (NumberItemView) yum0.f(viewInflate4, R.id.four_button);
                                if (numberItemView4 != null) {
                                    i7 = R.id.nine_button;
                                    NumberItemView numberItemView5 = (NumberItemView) yum0.f(viewInflate4, R.id.nine_button);
                                    if (numberItemView5 != null) {
                                        i7 = R.id.one_button;
                                        NumberItemView numberItemView6 = (NumberItemView) yum0.f(viewInflate4, R.id.one_button);
                                        if (numberItemView6 != null) {
                                            i7 = R.id.seven_button;
                                            NumberItemView numberItemView7 = (NumberItemView) yum0.f(viewInflate4, R.id.seven_button);
                                            if (numberItemView7 != null) {
                                                i7 = R.id.six_button;
                                                NumberItemView numberItemView8 = (NumberItemView) yum0.f(viewInflate4, R.id.six_button);
                                                if (numberItemView8 != null) {
                                                    i7 = R.id.three_button;
                                                    NumberItemView numberItemView9 = (NumberItemView) yum0.f(viewInflate4, R.id.three_button);
                                                    if (numberItemView9 != null) {
                                                        i7 = R.id.two_button;
                                                        NumberItemView numberItemView10 = (NumberItemView) yum0.f(viewInflate4, R.id.two_button);
                                                        if (numberItemView10 != null) {
                                                            i7 = R.id.zero_button;
                                                            NumberItemView numberItemView11 = (NumberItemView) yum0.f(viewInflate4, R.id.zero_button);
                                                            if (numberItemView11 != null) {
                                                                return new w860((LinearLayout) viewInflate4, numberItemView2, imageView4, frameLayout, numberItemView3, numberItemView4, numberItemView5, numberItemView6, numberItemView7, numberItemView8, numberItemView9, numberItemView10, numberItemView11);
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
                hny.u("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i7)));
                return null;
            case 12:
                riu0 riu0Var = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var instanceof wmv ? (wmv) riu0Var : null;
                return (wmvVar == null || (miu0VarN = wmvVar.n()) == null) ? ((gs60) obj2).n() : miu0VarN;
            case 13:
                riu0 riu0Var2 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var2 instanceof wmv ? (wmv) riu0Var2 : null;
                return (wmvVar == null || (miu0VarN2 = wmvVar.n()) == null) ? ((xt60) obj2).n() : miu0VarN2;
            case 14:
                riu0 riu0Var3 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var3 instanceof wmv ? (wmv) riu0Var3 : null;
                return (wmvVar == null || (miu0VarN3 = wmvVar.n()) == null) ? ((cu60) obj2).n() : miu0VarN3;
            case 15:
                riu0 riu0Var4 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var4 instanceof wmv ? (wmv) riu0Var4 : null;
                return (wmvVar == null || (miu0VarN4 = wmvVar.n()) == null) ? ((gx60) obj2).n() : miu0VarN4;
            case 16:
                riu0 riu0Var5 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var5 instanceof wmv ? (wmv) riu0Var5 : null;
                return (wmvVar == null || (miu0VarN5 = wmvVar.n()) == null) ? ((p170) obj2).n() : miu0VarN5;
            case 17:
                riu0 riu0Var6 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var6 instanceof wmv ? (wmv) riu0Var6 : null;
                return (wmvVar == null || (miu0VarN6 = wmvVar.n()) == null) ? ((kc80) obj2).n() : miu0VarN6;
            case 18:
                riu0 riu0Var7 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var7 instanceof wmv ? (wmv) riu0Var7 : null;
                return (wmvVar == null || (miu0VarN7 = wmvVar.n()) == null) ? ((xc80) obj2).n() : miu0VarN7;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                riu0 riu0Var8 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var8 instanceof wmv ? (wmv) riu0Var8 : null;
                return (wmvVar == null || (miu0VarN8 = wmvVar.n()) == null) ? ((b190) obj2).n() : miu0VarN8;
            case 20:
                ((Function1) obj2).invoke((au90) obj);
                return Unit.f46060a;
            case 21:
                ((Function1) obj2).invoke(new lha0(((jz30) obj).b));
                return Unit.f46060a;
            case 22:
                ((Function1) obj2).invoke(new u1b0(((cvl) obj).f5035a));
                return Unit.f46060a;
            case 23:
                riu0 riu0Var9 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var9 instanceof wmv ? (wmv) riu0Var9 : null;
                return (wmvVar == null || (miu0VarN9 = wmvVar.n()) == null) ? ((w4b0) obj2).n() : miu0VarN9;
            case 24:
                riu0 riu0Var10 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var10 instanceof wmv ? (wmv) riu0Var10 : null;
                return (wmvVar == null || (miu0VarN10 = wmvVar.n()) == null) ? ((org.xplatform.personal.impl.presentation.edit.a) obj2).n() : miu0VarN10;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                LayoutInflater layoutInflaterFrom8 = LayoutInflater.from(((ProgressBarWithSandClockNew) obj2).getContext());
                layoutInflaterFrom8.getClass();
                ProgressBarWithSandClockNew progressBarWithSandClockNew = (ProgressBarWithSandClockNew) obj;
                layoutInflaterFrom8.inflate(R.layout.progress_bar_sand_clock_new, progressBarWithSandClockNew);
                int i8 = R.id.ivProgress;
                ImageView imageView5 = (ImageView) yum0.f(progressBarWithSandClockNew, R.id.ivProgress);
                if (imageView5 != null) {
                    i8 = R.id.ivSandClock;
                    ImageView imageView6 = (ImageView) yum0.f(progressBarWithSandClockNew, R.id.ivSandClock);
                    if (imageView6 != null) {
                        i8 = R.id.loaderWrapper;
                        if (((FrameLayout) yum0.f(progressBarWithSandClockNew, R.id.loaderWrapper)) != null) {
                            return new h3c0(progressBarWithSandClockNew, imageView5, imageView6);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(progressBarWithSandClockNew.getResources().getResourceName(i8)));
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                LayoutInflater layoutInflaterFrom9 = LayoutInflater.from(((ProgressBarWithSendClock) obj2).getContext());
                layoutInflaterFrom9.getClass();
                ProgressBarWithSendClock progressBarWithSendClock = (ProgressBarWithSendClock) obj;
                View viewInflate5 = layoutInflaterFrom9.inflate(R.layout.progressbar_send_clock, (ViewGroup) progressBarWithSendClock, false);
                progressBarWithSendClock.addView(viewInflate5);
                int i9 = R.id.line_1;
                if (((Guideline) yum0.f(viewInflate5, R.id.line_1)) != null) {
                    i9 = R.id.line_2;
                    if (((Guideline) yum0.f(viewInflate5, R.id.line_2)) != null) {
                        i9 = R.id.line_3;
                        if (((Guideline) yum0.f(viewInflate5, R.id.line_3)) != null) {
                            i9 = R.id.line_4;
                            if (((Guideline) yum0.f(viewInflate5, R.id.line_4)) != null) {
                                i9 = R.id.line_5;
                                if (((Guideline) yum0.f(viewInflate5, R.id.line_5)) != null) {
                                    i9 = R.id.line_6;
                                    if (((Guideline) yum0.f(viewInflate5, R.id.line_6)) != null) {
                                        i9 = R.id.line_7;
                                        if (((Guideline) yum0.f(viewInflate5, R.id.line_7)) != null) {
                                            i9 = R.id.line_8;
                                            if (((Guideline) yum0.f(viewInflate5, R.id.line_8)) != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate5;
                                                int i10 = R.id.v_progress;
                                                View viewF = yum0.f(viewInflate5, R.id.v_progress);
                                                if (viewF != null) {
                                                    i10 = R.id.v_send_clock;
                                                    View viewF2 = yum0.f(viewInflate5, R.id.v_send_clock);
                                                    if (viewF2 != null) {
                                                        return new r3c0(constraintLayout2, constraintLayout2, viewF, viewF2);
                                                    }
                                                }
                                                i9 = i10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(i9)));
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) obj2).invoke(new amc0((rnc0) obj));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) obj2).invoke(new gpc0((yrc0) obj));
                return Unit.f46060a;
            default:
                ((Function1) obj2).invoke(((h6i0) obj).f12531a);
                return Unit.f46060a;
        }
    }
}
