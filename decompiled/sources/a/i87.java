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
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.ui_core.viewcomponents.views.TicketDividerWithShadowLayout;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i87 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14325a;

    public /* synthetic */ i87(byte b) {
        this.f14325a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14325a) {
            case 0:
                i77 i77Var = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var.getClass();
                return i77.a(i77Var, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -9, 2047);
            case 1:
                return i77.a((i77) obj2, false, false, true, null, null, null, null, false, null, null, false, false, false, null, new ArrayList(), null, null, false, null, true, false, false, null, null, new HashMap(), null, null, -21512198, 2045);
            case 2:
                return Unit.f46060a;
            case 3:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.bet_info_item_new, viewGroup, false);
                int i = R.id.additionalInfoTopBarrier;
                if (((Barrier) yum0.f(viewF, R.id.additionalInfoTopBarrier)) != null) {
                    i = R.id.alternativeInfoContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewF, R.id.alternativeInfoContainer);
                    if (constraintLayout != null) {
                        i = R.id.autoSubLayout;
                        LinearLayout linearLayout = (LinearLayout) yum0.f(viewF, R.id.autoSubLayout);
                        if (linearLayout != null) {
                            i = R.id.betTitleImage;
                            ImageView imageView = (ImageView) yum0.f(viewF, R.id.betTitleImage);
                            if (imageView != null) {
                                i = R.id.blockContainer;
                                LinearLayout linearLayout2 = (LinearLayout) yum0.f(viewF, R.id.blockContainer);
                                if (linearLayout2 != null) {
                                    i = R.id.cardView;
                                    MaterialCardView materialCardView = (MaterialCardView) yum0.f(viewF, R.id.cardView);
                                    if (materialCardView != null) {
                                        i = R.id.center;
                                        if (((Guideline) yum0.f(viewF, R.id.center)) != null) {
                                            i = R.id.dateAndTagsFlow;
                                            if (((Flow) yum0.f(viewF, R.id.dateAndTagsFlow)) != null) {
                                                i = R.id.groupAdditionalInfo;
                                                Group group = (Group) yum0.f(viewF, R.id.groupAdditionalInfo);
                                                if (group != null) {
                                                    i = R.id.imageBetStatus;
                                                    ImageView imageView2 = (ImageView) yum0.f(viewF, R.id.imageBetStatus);
                                                    if (imageView2 != null) {
                                                        i = R.id.ivArrowForward;
                                                        ImageView imageView3 = (ImageView) yum0.f(viewF, R.id.ivArrowForward);
                                                        if (imageView3 != null) {
                                                            i = R.id.llLive;
                                                            LinearLayout linearLayout3 = (LinearLayout) yum0.f(viewF, R.id.llLive);
                                                            if (linearLayout3 != null) {
                                                                i = R.id.reasonGroup;
                                                                Group group2 = (Group) yum0.f(viewF, R.id.reasonGroup);
                                                                if (group2 != null) {
                                                                    i = R.id.scoreGroup;
                                                                    Group group3 = (Group) yum0.f(viewF, R.id.scoreGroup);
                                                                    if (group3 != null) {
                                                                        i = R.id.statusGroup;
                                                                        Group group4 = (Group) yum0.f(viewF, R.id.statusGroup);
                                                                        if (group4 != null) {
                                                                            i = R.id.statusGroupContainer;
                                                                            if (((LinearLayout) yum0.f(viewF, R.id.statusGroupContainer)) != null) {
                                                                                i = R.id.teamFirstImageContainer;
                                                                                if (((ConstraintLayout) yum0.f(viewF, R.id.teamFirstImageContainer)) != null) {
                                                                                    i = R.id.teamFirstLogo;
                                                                                    RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF, R.id.teamFirstLogo);
                                                                                    if (roundCornerImageView != null) {
                                                                                        i = R.id.teamFirstLogoMultiIcons;
                                                                                        Group group5 = (Group) yum0.f(viewF, R.id.teamFirstLogoMultiIcons);
                                                                                        if (group5 != null) {
                                                                                            i = R.id.teamFirstLogoOne;
                                                                                            RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewF, R.id.teamFirstLogoOne);
                                                                                            if (roundCornerImageView2 != null) {
                                                                                                i = R.id.teamFirstLogoTwo;
                                                                                                RoundCornerImageView roundCornerImageView3 = (RoundCornerImageView) yum0.f(viewF, R.id.teamFirstLogoTwo);
                                                                                                if (roundCornerImageView3 != null) {
                                                                                                    i = R.id.teamFirstName;
                                                                                                    TextView textView = (TextView) yum0.f(viewF, R.id.teamFirstName);
                                                                                                    if (textView != null) {
                                                                                                        i = R.id.teamGroup;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(viewF, R.id.teamGroup);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i = R.id.teamSecondImageContainer;
                                                                                                            if (((ConstraintLayout) yum0.f(viewF, R.id.teamSecondImageContainer)) != null) {
                                                                                                                i = R.id.teamSecondLogo;
                                                                                                                RoundCornerImageView roundCornerImageView4 = (RoundCornerImageView) yum0.f(viewF, R.id.teamSecondLogo);
                                                                                                                if (roundCornerImageView4 != null) {
                                                                                                                    i = R.id.teamSecondLogoMultiIcons;
                                                                                                                    Group group6 = (Group) yum0.f(viewF, R.id.teamSecondLogoMultiIcons);
                                                                                                                    if (group6 != null) {
                                                                                                                        i = R.id.teamSecondLogoOne;
                                                                                                                        RoundCornerImageView roundCornerImageView5 = (RoundCornerImageView) yum0.f(viewF, R.id.teamSecondLogoOne);
                                                                                                                        if (roundCornerImageView5 != null) {
                                                                                                                            i = R.id.teamSecondLogoTwo;
                                                                                                                            RoundCornerImageView roundCornerImageView6 = (RoundCornerImageView) yum0.f(viewF, R.id.teamSecondLogoTwo);
                                                                                                                            if (roundCornerImageView6 != null) {
                                                                                                                                i = R.id.teamSecondName;
                                                                                                                                TextView textView2 = (TextView) yum0.f(viewF, R.id.teamSecondName);
                                                                                                                                if (textView2 != null) {
                                                                                                                                    i = R.id.ticketBlockDivider;
                                                                                                                                    TicketDividerWithShadowLayout ticketDividerWithShadowLayout = (TicketDividerWithShadowLayout) yum0.f(viewF, R.id.ticketBlockDivider);
                                                                                                                                    if (ticketDividerWithShadowLayout != null) {
                                                                                                                                        i = R.id.ticketDivider;
                                                                                                                                        if (((TicketDividerWithShadowLayout) yum0.f(viewF, R.id.ticketDivider)) != null) {
                                                                                                                                            i = R.id.tvAdditionalInfo;
                                                                                                                                            TextView textView3 = (TextView) yum0.f(viewF, R.id.tvAdditionalInfo);
                                                                                                                                            if (textView3 != null) {
                                                                                                                                                i = R.id.tvAdditionalInfoTitle;
                                                                                                                                                if (((TextView) yum0.f(viewF, R.id.tvAdditionalInfoTitle)) != null) {
                                                                                                                                                    i = R.id.tvBetCoef;
                                                                                                                                                    TextView textView4 = (TextView) yum0.f(viewF, R.id.tvBetCoef);
                                                                                                                                                    if (textView4 != null) {
                                                                                                                                                        i = R.id.tvBetCoefTitle;
                                                                                                                                                        TextView textView5 = (TextView) yum0.f(viewF, R.id.tvBetCoefTitle);
                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                            i = R.id.tvBetEvent;
                                                                                                                                                            TextView textView6 = (TextView) yum0.f(viewF, R.id.tvBetEvent);
                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                i = R.id.tvBetEventChampName;
                                                                                                                                                                TextView textView7 = (TextView) yum0.f(viewF, R.id.tvBetEventChampName);
                                                                                                                                                                if (textView7 != null) {
                                                                                                                                                                    i = R.id.tvBetScore;
                                                                                                                                                                    TextView textView8 = (TextView) yum0.f(viewF, R.id.tvBetScore);
                                                                                                                                                                    if (textView8 != null) {
                                                                                                                                                                        i = R.id.tvBetScoreTitle;
                                                                                                                                                                        if (((TextView) yum0.f(viewF, R.id.tvBetScoreTitle)) != null) {
                                                                                                                                                                            i = R.id.tvBetStatus;
                                                                                                                                                                            TextView textView9 = (TextView) yum0.f(viewF, R.id.tvBetStatus);
                                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                                i = R.id.tvBetStatusTitle;
                                                                                                                                                                                if (((TextView) yum0.f(viewF, R.id.tvBetStatusTitle)) != null) {
                                                                                                                                                                                    i = R.id.tvBetTitle;
                                                                                                                                                                                    TextView textView10 = (TextView) yum0.f(viewF, R.id.tvBetTitle);
                                                                                                                                                                                    if (textView10 != null) {
                                                                                                                                                                                        i = R.id.tvBlockTitle;
                                                                                                                                                                                        TextView textView11 = (TextView) yum0.f(viewF, R.id.tvBlockTitle);
                                                                                                                                                                                        if (textView11 != null) {
                                                                                                                                                                                            i = R.id.tvBlockValue;
                                                                                                                                                                                            TextView textView12 = (TextView) yum0.f(viewF, R.id.tvBlockValue);
                                                                                                                                                                                            if (textView12 != null) {
                                                                                                                                                                                                i = R.id.tvDate;
                                                                                                                                                                                                TextView textView13 = (TextView) yum0.f(viewF, R.id.tvDate);
                                                                                                                                                                                                if (textView13 != null) {
                                                                                                                                                                                                    i = R.id.tvEachWay;
                                                                                                                                                                                                    TextView textView14 = (TextView) yum0.f(viewF, R.id.tvEachWay);
                                                                                                                                                                                                    if (textView14 != null) {
                                                                                                                                                                                                        i = R.id.tvEventTag;
                                                                                                                                                                                                        TextView textView15 = (TextView) yum0.f(viewF, R.id.tvEventTag);
                                                                                                                                                                                                        if (textView15 != null) {
                                                                                                                                                                                                            i = R.id.tvLiveTitle;
                                                                                                                                                                                                            TextView textView16 = (TextView) yum0.f(viewF, R.id.tvLiveTitle);
                                                                                                                                                                                                            if (textView16 != null) {
                                                                                                                                                                                                                i = R.id.tvLiveValue;
                                                                                                                                                                                                                TextView textView17 = (TextView) yum0.f(viewF, R.id.tvLiveValue);
                                                                                                                                                                                                                if (textView17 != null) {
                                                                                                                                                                                                                    i = R.id.tvOptionBet;
                                                                                                                                                                                                                    TextView textView18 = (TextView) yum0.f(viewF, R.id.tvOptionBet);
                                                                                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                                                                                        i = R.id.tvPeriodDescription;
                                                                                                                                                                                                                        TextView textView19 = (TextView) yum0.f(viewF, R.id.tvPeriodDescription);
                                                                                                                                                                                                                        if (textView19 != null) {
                                                                                                                                                                                                                            i = R.id.tvReason;
                                                                                                                                                                                                                            TextView textView20 = (TextView) yum0.f(viewF, R.id.tvReason);
                                                                                                                                                                                                                            if (textView20 != null) {
                                                                                                                                                                                                                                i = R.id.tvReasonTitle;
                                                                                                                                                                                                                                if (((TextView) yum0.f(viewF, R.id.tvReasonTitle)) != null) {
                                                                                                                                                                                                                                    i = R.id.tvScore;
                                                                                                                                                                                                                                    TextView textView21 = (TextView) yum0.f(viewF, R.id.tvScore);
                                                                                                                                                                                                                                    if (textView21 != null) {
                                                                                                                                                                                                                                        return new lb7((FrameLayout) viewF, constraintLayout, linearLayout, imageView, linearLayout2, materialCardView, group, imageView2, imageView3, linearLayout3, group2, group3, group4, roundCornerImageView, group5, roundCornerImageView2, roundCornerImageView3, textView, constraintLayout2, roundCornerImageView4, group6, roundCornerImageView5, roundCornerImageView6, textView2, ticketDividerWithShadowLayout, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21);
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
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 4:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 5:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 6:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.bet_constructor_item_bet, viewGroup2, false);
                ComposeView composeView = (ComposeView) yum0.f(viewF2, R.id.composeView);
                if (composeView != null) {
                    return new bs6((FrameLayout) viewF2, composeView);
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(R.id.composeView)));
                return null;
            case 7:
                ((Integer) obj2).getClass();
                nia0.M(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                ntr.G(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 9:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 10:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
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
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                i120.L(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 15:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.vh_bets_on_favorite_events_item, viewGroup3, false);
                if (viewF3 != null) {
                    ComposeView composeView2 = (ComposeView) viewF3;
                    return new qcu0(composeView2, composeView2);
                }
                hny.u("rootView");
                return null;
            case 16:
                ((Integer) obj2).getClass();
                ro4.j(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                epv0.x(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                d18.d(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                unh0.e(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                unh0.f(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 21:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 22:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 23:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 24:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj).intValue();
                bh8 bh8Var = (bh8) obj2;
                bh8Var.getClass();
                return Integer.valueOf(bh8Var.f2593a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj).intValue();
                Pair pair = (Pair) obj2;
                pair.getClass();
                return pair.f46059a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            default:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ i87(int i, byte b) {
        this.f14325a = b;
    }
}
