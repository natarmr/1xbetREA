package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ht80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13623a;

    public /* synthetic */ ht80(byte b) {
        this.f13623a = b;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02c5 A[PHI: r1
  0x02c5: PHI (r1v44 int) = (r1v43 int), (r1v45 int), (r1v46 int), (r1v47 int), (r1v49 int) binds: [B:88:0x022f, B:90:0x023b, B:92:0x0247, B:94:0x0253, B:98:0x0267] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a5 A[PHI: r1
  0x01a5: PHI (r1v74 int) = 
  (r1v73 int)
  (r1v75 int)
  (r1v76 int)
  (r1v77 int)
  (r1v78 int)
  (r1v79 int)
  (r1v80 int)
  (r1v81 int)
  (r1v82 int)
  (r1v84 int)
  (r1v85 int)
 binds: [B:5:0x002a, B:7:0x0035, B:9:0x0040, B:11:0x004b, B:13:0x0056, B:15:0x0061, B:17:0x006d, B:19:0x0079, B:21:0x0085, B:25:0x009a, B:27:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13623a;
        int i = R.id.ivTeamTwoLogo;
        switch (b) {
            case 0:
                return Unit.f46060a;
            case 1:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new ev80((byte) 7));
                function2.invoke(new i280((byte) 16));
                return Unit.f46060a;
            case 2:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 3:
                return Unit.f46060a;
            case 4:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(766757472);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 5:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(2146638984);
                xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA2;
            case 6:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 7:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 8:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 9:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 10:
                b1j.z((String) obj2, (Throwable) obj);
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
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 14:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 15:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 16:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
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
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 21:
                int iIntValue = ((Integer) obj).intValue();
                a2n a2nVar = (a2n) obj2;
                a2nVar.getClass();
                sgy sgyVarB = sre0.f32672a.b(a2nVar.getClass());
                StringBuilder sb = new StringBuilder();
                sb.append(sgyVarB);
                sb.append(iIntValue);
                return sb.toString();
            case 22:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_card_penalty, viewGroup, false);
                int i2 = R.id.flTeamOneResult;
                FlexboxLayout flexboxLayout = (FlexboxLayout) yum0.f(viewF, R.id.flTeamOneResult);
                if (flexboxLayout != null) {
                    i2 = R.id.flTeamTwoResult;
                    FlexboxLayout flexboxLayout2 = (FlexboxLayout) yum0.f(viewF, R.id.flTeamTwoResult);
                    if (flexboxLayout2 != null) {
                        i2 = R.id.ivFirstTeamFavorite;
                        ImageView imageView = (ImageView) yum0.f(viewF, R.id.ivFirstTeamFavorite);
                        if (imageView != null) {
                            i2 = R.id.ivSecondTeamFavorite;
                            ImageView imageView2 = (ImageView) yum0.f(viewF, R.id.ivSecondTeamFavorite);
                            if (imageView2 == null) {
                                i = i2;
                            } else {
                                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF, R.id.ivTeamOneLogo);
                                if (roundCornerImageView != null) {
                                    i2 = R.id.ivTeamOneLogoContainer;
                                    if (((FrameLayout) yum0.f(viewF, R.id.ivTeamOneLogoContainer)) != null) {
                                        RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewF, R.id.ivTeamTwoLogo);
                                        if (roundCornerImageView2 != null) {
                                            i = R.id.ivTeamTwoLogoContainer;
                                            if (((FrameLayout) yum0.f(viewF, R.id.ivTeamTwoLogoContainer)) != null) {
                                                i = R.id.llShotResults;
                                                if (((ConstraintLayout) yum0.f(viewF, R.id.llShotResults)) != null) {
                                                    i = R.id.svShotResults;
                                                    ScrollView scrollView = (ScrollView) yum0.f(viewF, R.id.svShotResults);
                                                    if (scrollView != null) {
                                                        i = R.id.tvMatchDescription;
                                                        TextView textView = (TextView) yum0.f(viewF, R.id.tvMatchDescription);
                                                        if (textView != null) {
                                                            i = R.id.tvPenaltyName;
                                                            TextView textView2 = (TextView) yum0.f(viewF, R.id.tvPenaltyName);
                                                            if (textView2 != null) {
                                                                i = R.id.tvPenaltyScore;
                                                                TextView textView3 = (TextView) yum0.f(viewF, R.id.tvPenaltyScore);
                                                                if (textView3 != null) {
                                                                    return new tsx((ConstraintLayout) viewF, flexboxLayout, flexboxLayout2, imageView, imageView2, roundCornerImageView, roundCornerImageView2, scrollView, textView, textView2, textView3);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i = i2;
                                    }
                                } else {
                                    i = R.id.ivTeamOneLogo;
                                }
                            }
                        } else {
                            i = i2;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    i = i2;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 23:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup2.getClass();
                return owx.a(layoutInflater, viewGroup2);
            case 24:
                Integer num = (Integer) obj;
                num.intValue();
                ((wd90) obj2).getClass();
                return num;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Integer num2 = (Integer) obj;
                num2.intValue();
                ((xd90) obj2).getClass();
                return num2;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Integer num3 = (Integer) obj;
                num3.intValue();
                ((ae90) obj2).getClass();
                return num3;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Integer num4 = (Integer) obj;
                num4.intValue();
                ((zd90) obj2).getClass();
                return num4;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Integer num5 = (Integer) obj;
                num5.intValue();
                ((yd90) obj2).getClass();
                return num5;
            default:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_card_period, viewGroup3, false);
                int i3 = R.id.bTeamsLogo;
                if (((Barrier) yum0.f(viewF2, R.id.bTeamsLogo)) != null) {
                    i3 = R.id.bTotalScore;
                    if (((Barrier) yum0.f(viewF2, R.id.bTotalScore)) != null) {
                        i3 = R.id.bTotalScoreDividers;
                        if (((Barrier) yum0.f(viewF2, R.id.bTotalScoreDividers)) != null) {
                            i3 = R.id.btvTeamsName;
                            if (((Barrier) yum0.f(viewF2, R.id.btvTeamsName)) != null) {
                                i3 = R.id.clGameScore;
                                if (((ConstraintLayout) yum0.f(viewF2, R.id.clGameScore)) != null) {
                                    i3 = R.id.gLHeader;
                                    if (((Guideline) yum0.f(viewF2, R.id.gLHeader)) != null) {
                                        i3 = R.id.gTvTeamPointsScores;
                                        Group group = (Group) yum0.f(viewF2, R.id.gTvTeamPointsScores);
                                        if (group != null) {
                                            i3 = R.id.gTvTeamScores;
                                            Group group2 = (Group) yum0.f(viewF2, R.id.gTvTeamScores);
                                            if (group2 != null) {
                                                i3 = R.id.ivTeamOneInning;
                                                ImageView imageView3 = (ImageView) yum0.f(viewF2, R.id.ivTeamOneInning);
                                                if (imageView3 == null) {
                                                    i = i3;
                                                } else {
                                                    RoundCornerImageView roundCornerImageView3 = (RoundCornerImageView) yum0.f(viewF2, R.id.ivTeamOneLogo);
                                                    if (roundCornerImageView3 != null) {
                                                        i3 = R.id.ivTeamOneSecondPlayerLogo;
                                                        RoundCornerImageView roundCornerImageView4 = (RoundCornerImageView) yum0.f(viewF2, R.id.ivTeamOneSecondPlayerLogo);
                                                        if (roundCornerImageView4 != null) {
                                                            i3 = R.id.ivTeamTwoInning;
                                                            ImageView imageView4 = (ImageView) yum0.f(viewF2, R.id.ivTeamTwoInning);
                                                            if (imageView4 != null) {
                                                                RoundCornerImageView roundCornerImageView5 = (RoundCornerImageView) yum0.f(viewF2, R.id.ivTeamTwoLogo);
                                                                if (roundCornerImageView5 != null) {
                                                                    i = R.id.ivTeamTwoSecondPlayerLogo;
                                                                    RoundCornerImageView roundCornerImageView6 = (RoundCornerImageView) yum0.f(viewF2, R.id.ivTeamTwoSecondPlayerLogo);
                                                                    if (roundCornerImageView6 != null) {
                                                                        i = R.id.rvPeriods;
                                                                        RecyclerView recyclerView = (RecyclerView) yum0.f(viewF2, R.id.rvPeriods);
                                                                        if (recyclerView != null) {
                                                                            i = R.id.tvPeriodTitle;
                                                                            TextView textView4 = (TextView) yum0.f(viewF2, R.id.tvPeriodTitle);
                                                                            if (textView4 != null) {
                                                                                i = R.id.tvPeriodsName;
                                                                                TextView textView5 = (TextView) yum0.f(viewF2, R.id.tvPeriodsName);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.tvPointsTitle;
                                                                                    TextView textView6 = (TextView) yum0.f(viewF2, R.id.tvPointsTitle);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.tvTeamOneName;
                                                                                        TextView textView7 = (TextView) yum0.f(viewF2, R.id.tvTeamOneName);
                                                                                        if (textView7 != null) {
                                                                                            i = R.id.tvTeamOnePointScore;
                                                                                            TextView textView8 = (TextView) yum0.f(viewF2, R.id.tvTeamOnePointScore);
                                                                                            if (textView8 != null) {
                                                                                                i = R.id.tvTeamOneScore;
                                                                                                TextView textView9 = (TextView) yum0.f(viewF2, R.id.tvTeamOneScore);
                                                                                                if (textView9 != null) {
                                                                                                    i = R.id.tvTeamOneTotalScore;
                                                                                                    TextView textView10 = (TextView) yum0.f(viewF2, R.id.tvTeamOneTotalScore);
                                                                                                    if (textView10 != null) {
                                                                                                        i = R.id.tvTeamTwoName;
                                                                                                        TextView textView11 = (TextView) yum0.f(viewF2, R.id.tvTeamTwoName);
                                                                                                        if (textView11 != null) {
                                                                                                            i = R.id.tvTeamTwoPointScore;
                                                                                                            TextView textView12 = (TextView) yum0.f(viewF2, R.id.tvTeamTwoPointScore);
                                                                                                            if (textView12 != null) {
                                                                                                                i = R.id.tvTeamTwoScore;
                                                                                                                TextView textView13 = (TextView) yum0.f(viewF2, R.id.tvTeamTwoScore);
                                                                                                                if (textView13 != null) {
                                                                                                                    i = R.id.tvTeamTwoTotalScore;
                                                                                                                    TextView textView14 = (TextView) yum0.f(viewF2, R.id.tvTeamTwoTotalScore);
                                                                                                                    if (textView14 != null) {
                                                                                                                        i = R.id.tvTotalScoreName;
                                                                                                                        if (((TextView) yum0.f(viewF2, R.id.tvTotalScoreName)) != null) {
                                                                                                                            i = R.id.vHeaderBackground;
                                                                                                                            View viewF3 = yum0.f(viewF2, R.id.vHeaderBackground);
                                                                                                                            if (viewF3 != null) {
                                                                                                                                i = R.id.vScoreDivider;
                                                                                                                                View viewF4 = yum0.f(viewF2, R.id.vScoreDivider);
                                                                                                                                if (viewF4 != null) {
                                                                                                                                    i = R.id.vTeamOneTotalScoreDivider;
                                                                                                                                    View viewF5 = yum0.f(viewF2, R.id.vTeamOneTotalScoreDivider);
                                                                                                                                    if (viewF5 != null) {
                                                                                                                                        i = R.id.vTeamTwoTotalScoreDivider;
                                                                                                                                        View viewF6 = yum0.f(viewF2, R.id.vTeamTwoTotalScoreDivider);
                                                                                                                                        if (viewF6 != null) {
                                                                                                                                            i = R.id.vTeamsDivider;
                                                                                                                                            View viewF7 = yum0.f(viewF2, R.id.vTeamsDivider);
                                                                                                                                            if (viewF7 != null) {
                                                                                                                                                i = R.id.vTotalScoreNameDivider;
                                                                                                                                                View viewF8 = yum0.f(viewF2, R.id.vTotalScoreNameDivider);
                                                                                                                                                if (viewF8 != null) {
                                                                                                                                                    return new usx((ConstraintLayout) viewF2, group, group2, imageView3, roundCornerImageView3, roundCornerImageView4, imageView4, roundCornerImageView5, roundCornerImageView6, recyclerView, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, viewF3, viewF4, viewF5, viewF6, viewF7, viewF8);
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
                                                            } else {
                                                                i = i3;
                                                            }
                                                        } else {
                                                            i = i3;
                                                        }
                                                    } else {
                                                        i = R.id.ivTeamOneLogo;
                                                    }
                                                }
                                            } else {
                                                i = i3;
                                            }
                                        } else {
                                            i = i3;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                } else {
                                    i = i3;
                                }
                            } else {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                    } else {
                        i = i3;
                    }
                } else {
                    i = i3;
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i)));
                return null;
        }
    }
}
