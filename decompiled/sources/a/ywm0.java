package a;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.button.MaterialButton;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.lottery.presentation.views.ErasableView;
import org.xplatform.cyber.game.universal.impl.presentation.indianpoker.SyntheticIndianPokerView;
import org.xplatform.cyber.game.universal.impl.presentation.seka.SyntheticSekaView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;
import org.xplatform.cyber.game.universal.impl.presentation.victoryformula.VictoryFormulaView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.SubGamesContainerView;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;
import org.xplatform.ui_core.viewcomponents.views.TimerView;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit.components.timer.DsTimer;

/* JADX INFO: loaded from: classes4.dex */
public final class ywm0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43377a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ywm0(Object obj, Object obj2, byte b) {
        this.f43377a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:245:0x060f A[PHI: r0
  0x060f: PHI (r0v63 int) = 
  (r0v62 int)
  (r0v64 int)
  (r0v65 int)
  (r0v66 int)
  (r0v67 int)
  (r0v68 int)
  (r0v69 int)
  (r0v70 int)
  (r0v71 int)
  (r0v72 int)
  (r0v81 int)
 binds: [B:213:0x0557, B:215:0x0564, B:217:0x0571, B:219:0x057e, B:221:0x058b, B:223:0x0598, B:225:0x05a5, B:227:0x05b2, B:229:0x05bf, B:231:0x05cc, B:241:0x05f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:330:0x0848 A[PHI: r1
  0x0848: PHI (r1v43 int) = (r1v42 int), (r1v44 int), (r1v45 int), (r1v47 int), (r1v50 int) binds: [B:310:0x07dd, B:312:0x07ea, B:314:0x07f7, B:318:0x080e, B:322:0x0823] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:374:0x095e A[PHI: r1
  0x095e: PHI (r1v17 int) = (r1v16 int), (r1v19 int), (r1v21 int), (r1v23 int), (r1v24 int), (r1v25 int), (r1v27 int), (r1v30 int) binds: [B:342:0x08a5, B:346:0x08bf, B:350:0x08d9, B:354:0x08f3, B:356:0x0900, B:358:0x090d, B:362:0x0924, B:366:0x0939] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:377:0x096a A[PHI: r5
  0x096a: PHI (r5v5 int) = (r5v4 int), (r5v7 int), (r5v9 int) binds: [B:344:0x08b2, B:348:0x08cc, B:352:0x08e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f4 A[PHI: r15
  0x01f4: PHI (r15v5 int) = 
  (r15v0 int)
  (r15v6 int)
  (r15v7 int)
  (r15v8 int)
  (r15v9 int)
  (r15v10 int)
  (r15v12 int)
  (r15v13 int)
  (r15v14 int)
  (r15v15 int)
  (r15v16 int)
  (r15v17 int)
  (r15v19 int)
 binds: [B:57:0x0132, B:59:0x013f, B:61:0x014a, B:63:0x0157, B:65:0x0164, B:67:0x0171, B:71:0x0186, B:73:0x0193, B:75:0x019e, B:77:0x01ab, B:79:0x01b8, B:81:0x01c5, B:85:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ff A[PHI: r1
  0x01ff: PHI (r1v104 int) = 
  (r1v103 int)
  (r1v105 int)
  (r1v106 int)
  (r1v107 int)
  (r1v108 int)
  (r1v109 int)
  (r1v110 int)
  (r1v111 int)
  (r1v112 int)
  (r1v113 int)
  (r1v114 int)
  (r1v115 int)
 binds: [B:33:0x00c3, B:35:0x00cc, B:37:0x00d5, B:39:0x00de, B:41:0x00e7, B:43:0x00f0, B:45:0x00fb, B:47:0x0104, B:49:0x010d, B:51:0x0116, B:53:0x011f, B:55:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        miu0 miu0VarN;
        miu0 miu0VarN2;
        miu0 miu0VarN3;
        miu0 miu0VarN4;
        miu0 miu0VarN5;
        miu0 miu0VarN6;
        byte b = this.f43377a;
        int i = R.id.timerView;
        int i2 = R.id.number;
        int i3 = R.id.syntheticTimerView;
        int i4 = R.id.tvWinnerTitle;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(((SubGamesContainerView) obj).getContext());
                layoutInflaterFrom.getClass();
                SubGamesContainerView subGamesContainerView = (SubGamesContainerView) obj2;
                layoutInflaterFrom.inflate(R.layout.view_sub_games_content, subGamesContainerView);
                int i5 = R.id.bettingContainer;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) yum0.f(subGamesContainerView, R.id.bettingContainer);
                if (fragmentContainerView != null) {
                    i5 = R.id.btnTryAgain;
                    if (((MaterialButton) yum0.f(subGamesContainerView, R.id.btnTryAgain)) != null) {
                        i5 = R.id.llErrorContent;
                        if (((LinearLayout) yum0.f(subGamesContainerView, R.id.llErrorContent)) != null) {
                            i5 = R.id.tvErrorText;
                            if (((TextView) yum0.f(subGamesContainerView, R.id.tvErrorText)) != null) {
                                return new klu0(subGamesContainerView, fragmentContainerView);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(subGamesContainerView.getResources().getResourceName(i5)));
                return null;
            case 1:
                ((Function1) obj).invoke(new cen0((aan0) obj2));
                return Unit.f46060a;
            case 2:
                j6m0 j6m0Var = snn0.n2;
                ((k3t0) ((snn0) obj).m2.getValue()).x(((wnn0) obj2).f39458a);
                return Unit.f46060a;
            case 3:
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(((SyntheticIndianPokerView) obj).getContext());
                layoutInflaterFrom2.getClass();
                SyntheticIndianPokerView syntheticIndianPokerView = (SyntheticIndianPokerView) obj2;
                layoutInflaterFrom2.inflate(R.layout.synthetic_indian_poker_view, syntheticIndianPokerView);
                int i6 = R.id.guidelineCenter;
                if (((Guideline) yum0.f(syntheticIndianPokerView, R.id.guidelineCenter)) != null) {
                    int i7 = R.id.ivFirstPlayerBackground;
                    ImageView imageView = (ImageView) yum0.f(syntheticIndianPokerView, R.id.ivFirstPlayerBackground);
                    if (imageView != null) {
                        i6 = R.id.ivFirstPlayerCardOne;
                        ImageView imageView2 = (ImageView) yum0.f(syntheticIndianPokerView, R.id.ivFirstPlayerCardOne);
                        if (imageView2 != null) {
                            i7 = R.id.ivFirstPlayerCardThree;
                            ImageView imageView3 = (ImageView) yum0.f(syntheticIndianPokerView, R.id.ivFirstPlayerCardThree);
                            if (imageView3 != null) {
                                i6 = R.id.ivFirstPlayerCardTwo;
                                ImageView imageView4 = (ImageView) yum0.f(syntheticIndianPokerView, R.id.ivFirstPlayerCardTwo);
                                if (imageView4 != null) {
                                    i7 = R.id.ivSecondPlayerBackground;
                                    ImageView imageView5 = (ImageView) yum0.f(syntheticIndianPokerView, R.id.ivSecondPlayerBackground);
                                    if (imageView5 != null) {
                                        i6 = R.id.ivSecondPlayerCardOne;
                                        ImageView imageView6 = (ImageView) yum0.f(syntheticIndianPokerView, R.id.ivSecondPlayerCardOne);
                                        if (imageView6 != null) {
                                            i6 = R.id.ivSecondPlayerCardThree;
                                            ImageView imageView7 = (ImageView) yum0.f(syntheticIndianPokerView, R.id.ivSecondPlayerCardThree);
                                            if (imageView7 != null) {
                                                i6 = R.id.ivSecondPlayerCardTwo;
                                                ImageView imageView8 = (ImageView) yum0.f(syntheticIndianPokerView, R.id.ivSecondPlayerCardTwo);
                                                if (imageView8 == null) {
                                                    i4 = i6;
                                                } else {
                                                    DsTimer dsTimer = (DsTimer) yum0.f(syntheticIndianPokerView, R.id.timerView);
                                                    if (dsTimer != null) {
                                                        i6 = R.id.tvFirstPlayerCombination;
                                                        TextView textView = (TextView) yum0.f(syntheticIndianPokerView, R.id.tvFirstPlayerCombination);
                                                        if (textView == null) {
                                                            i4 = i6;
                                                        } else if (((TextView) yum0.f(syntheticIndianPokerView, R.id.tvFirstPlayerTitle)) != null) {
                                                            i6 = R.id.tvSecondPlayerCombination;
                                                            TextView textView2 = (TextView) yum0.f(syntheticIndianPokerView, R.id.tvSecondPlayerCombination);
                                                            if (textView2 == null) {
                                                                i4 = i6;
                                                            } else if (((TextView) yum0.f(syntheticIndianPokerView, R.id.tvSecondPlayerTitle)) != null) {
                                                                TextView textView3 = (TextView) yum0.f(syntheticIndianPokerView, R.id.tvWinnerTitle);
                                                                if (textView3 != null) {
                                                                    return new c6o0(syntheticIndianPokerView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, dsTimer, textView, textView2, textView3);
                                                                }
                                                            } else {
                                                                i4 = R.id.tvSecondPlayerTitle;
                                                            }
                                                        } else {
                                                            i4 = R.id.tvFirstPlayerTitle;
                                                        }
                                                    } else {
                                                        i4 = R.id.timerView;
                                                    }
                                                }
                                            } else {
                                                i4 = i6;
                                            }
                                        } else {
                                            i4 = i6;
                                        }
                                    } else {
                                        i4 = i7;
                                    }
                                } else {
                                    i4 = i6;
                                }
                            } else {
                                i4 = i7;
                            }
                        } else {
                            i4 = i6;
                        }
                    } else {
                        i4 = i7;
                    }
                } else {
                    i4 = i6;
                }
                hny.u("Missing required view with ID: ".concat(syntheticIndianPokerView.getResources().getResourceName(i4)));
                return null;
            case 4:
                LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(((SyntheticSekaView) obj).getContext());
                layoutInflaterFrom3.getClass();
                SyntheticSekaView syntheticSekaView = (SyntheticSekaView) obj2;
                layoutInflaterFrom3.inflate(R.layout.synthetic_seka_view, syntheticSekaView);
                if (((Guideline) yum0.f(syntheticSekaView, R.id.guidelineCenter)) == null) {
                    i4 = R.id.guidelineCenter;
                } else if (((ImageView) yum0.f(syntheticSekaView, R.id.ivFirstPlayerBackground)) != null) {
                    ImageView imageView9 = (ImageView) yum0.f(syntheticSekaView, R.id.ivFirstPlayerCardOne);
                    if (imageView9 != null) {
                        ImageView imageView10 = (ImageView) yum0.f(syntheticSekaView, R.id.ivFirstPlayerCardThree);
                        if (imageView10 != null) {
                            ImageView imageView11 = (ImageView) yum0.f(syntheticSekaView, R.id.ivFirstPlayerCardTwo);
                            if (imageView11 == null) {
                                i4 = R.id.ivFirstPlayerCardTwo;
                            } else if (((ImageView) yum0.f(syntheticSekaView, R.id.ivSecondPlayerBackground)) != null) {
                                int i8 = R.id.ivSecondPlayerCardOne;
                                ImageView imageView12 = (ImageView) yum0.f(syntheticSekaView, R.id.ivSecondPlayerCardOne);
                                if (imageView12 != null) {
                                    i8 = R.id.ivSecondPlayerCardThree;
                                    ImageView imageView13 = (ImageView) yum0.f(syntheticSekaView, R.id.ivSecondPlayerCardThree);
                                    if (imageView13 != null) {
                                        i8 = R.id.ivSecondPlayerCardTwo;
                                        ImageView imageView14 = (ImageView) yum0.f(syntheticSekaView, R.id.ivSecondPlayerCardTwo);
                                        if (imageView14 == null) {
                                            i4 = i8;
                                        } else {
                                            SyntheticTimerView syntheticTimerView = (SyntheticTimerView) yum0.f(syntheticSekaView, R.id.syntheticTimerView);
                                            if (syntheticTimerView != null) {
                                                i8 = R.id.tvFirstPlayerCardSum;
                                                TextView textView4 = (TextView) yum0.f(syntheticSekaView, R.id.tvFirstPlayerCardSum);
                                                if (textView4 == null) {
                                                    i4 = i8;
                                                } else if (((TextView) yum0.f(syntheticSekaView, R.id.tvFirstPlayerTitle)) != null) {
                                                    i8 = R.id.tvSecondPlayerCardSum;
                                                    TextView textView5 = (TextView) yum0.f(syntheticSekaView, R.id.tvSecondPlayerCardSum);
                                                    if (textView5 == null) {
                                                        i4 = i8;
                                                    } else if (((TextView) yum0.f(syntheticSekaView, R.id.tvSecondPlayerTitle)) != null) {
                                                        TextView textView6 = (TextView) yum0.f(syntheticSekaView, R.id.tvWinnerTitle);
                                                        if (textView6 != null) {
                                                            return new w7o0(syntheticSekaView, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, syntheticTimerView, textView4, textView5, textView6);
                                                        }
                                                    } else {
                                                        i4 = R.id.tvSecondPlayerTitle;
                                                    }
                                                } else {
                                                    i4 = R.id.tvFirstPlayerTitle;
                                                }
                                            } else {
                                                i4 = R.id.syntheticTimerView;
                                            }
                                        }
                                    } else {
                                        i4 = i8;
                                    }
                                } else {
                                    i4 = i8;
                                }
                            } else {
                                i4 = R.id.ivSecondPlayerBackground;
                            }
                        } else {
                            i4 = R.id.ivFirstPlayerCardThree;
                        }
                    } else {
                        i4 = R.id.ivFirstPlayerCardOne;
                    }
                } else {
                    i4 = R.id.ivFirstPlayerBackground;
                }
                hny.u("Missing required view with ID: ".concat(syntheticSekaView.getResources().getResourceName(i4)));
                return null;
            case 5:
                LayoutInflater layoutInflaterFrom4 = LayoutInflater.from(((SyntheticTimerView) obj).getContext());
                layoutInflaterFrom4.getClass();
                SyntheticTimerView syntheticTimerView2 = (SyntheticTimerView) obj2;
                View viewInflate = layoutInflaterFrom4.inflate(R.layout.synthetic_game_timer_view, (ViewGroup) syntheticTimerView2, false);
                syntheticTimerView2.addView(viewInflate);
                DsTimer dsTimer2 = (DsTimer) yum0.f(viewInflate, R.id.timerView);
                if (dsTimer2 != null) {
                    i = R.id.tvTitle;
                    TextView textView7 = (TextView) yum0.f(viewInflate, R.id.tvTitle);
                    if (textView7 != null) {
                        return new x5o0((LinearLayout) viewInflate, dsTimer2, textView7);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
            case 6:
                riu0 riu0Var = (riu0) ((a8z) obj2).getValue();
                wmv wmvVar = riu0Var instanceof wmv ? (wmv) riu0Var : null;
                return (wmvVar == null || (miu0VarN = wmvVar.n()) == null) ? ((nfo0) obj).n() : miu0VarN;
            case 7:
                LayoutInflater layoutInflaterFrom5 = LayoutInflater.from(((TaxExpandableSpoiler) obj).getContext());
                layoutInflaterFrom5.getClass();
                TaxExpandableSpoiler taxExpandableSpoiler = (TaxExpandableSpoiler) obj2;
                layoutInflaterFrom5.inflate(R.layout.tax_expandable_spoiler, taxExpandableSpoiler);
                int i9 = R.id.accordion;
                DsAccordion dsAccordion = (DsAccordion) yum0.f(taxExpandableSpoiler, R.id.accordion);
                if (dsAccordion != null) {
                    i9 = R.id.ivHeader;
                    ImageView imageView15 = (ImageView) yum0.f(taxExpandableSpoiler, R.id.ivHeader);
                    if (imageView15 != null) {
                        i9 = R.id.llContentContainer;
                        LinearLayout linearLayout = (LinearLayout) yum0.f(taxExpandableSpoiler, R.id.llContentContainer);
                        if (linearLayout != null) {
                            i9 = R.id.llExpandableContent;
                            LinearLayout linearLayout2 = (LinearLayout) yum0.f(taxExpandableSpoiler, R.id.llExpandableContent);
                            if (linearLayout2 != null) {
                                i9 = R.id.llHeader;
                                ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(taxExpandableSpoiler, R.id.llHeader);
                                if (constraintLayout != null) {
                                    i9 = R.id.shimmerTaxBonus;
                                    DsShimmerView dsShimmerView = (DsShimmerView) yum0.f(taxExpandableSpoiler, R.id.shimmerTaxBonus);
                                    if (dsShimmerView != null) {
                                        i9 = R.id.tvDescription;
                                        if (((TextView) yum0.f(taxExpandableSpoiler, R.id.tvDescription)) != null) {
                                            i9 = R.id.tvHeader;
                                            TextView textView8 = (TextView) yum0.f(taxExpandableSpoiler, R.id.tvHeader);
                                            if (textView8 != null) {
                                                i9 = R.id.tvHeaderValue;
                                                TextView textView9 = (TextView) yum0.f(taxExpandableSpoiler, R.id.tvHeaderValue);
                                                if (textView9 != null) {
                                                    return new fvo0(taxExpandableSpoiler, dsAccordion, imageView15, linearLayout, linearLayout2, constraintLayout, dsShimmerView, textView8, textView9);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(taxExpandableSpoiler.getResources().getResourceName(i9)));
                return null;
            case 8:
                ((Function1) obj).invoke(new z3p0(((m3p0) ((n3p0) obj2)).b));
                return Unit.f46060a;
            case 9:
                ((Function1) obj).invoke(Integer.valueOf(((r6p0) ((s6p0) obj2)).f29945a));
                return Unit.f46060a;
            case 10:
                s9m0 s9m0Var = ajp0.r2;
                ((k3t0) ((ajp0) obj).q2.getValue()).x(new cjp0(((kjp0) obj2).f18399a));
                return Unit.f46060a;
            case 11:
                ((Function1) obj).invoke(((etp0) obj2).b);
                return Unit.f46060a;
            case 12:
                LayoutInflater layoutInflaterFrom6 = LayoutInflater.from(((qdq0) obj).getContext());
                layoutInflaterFrom6.getClass();
                qdq0 qdq0Var = (qdq0) obj2;
                View viewInflate2 = layoutInflaterFrom6.inflate(R.layout.view_lottery_multiply_x, (ViewGroup) qdq0Var, false);
                qdq0Var.addView(viewInflate2);
                View viewF = yum0.f(viewInflate2, R.id.disableView);
                if (viewF != null) {
                    int i10 = R.id.erasableContainer;
                    if (((ConstraintLayout) yum0.f(viewInflate2, R.id.erasableContainer)) != null) {
                        i10 = R.id.erasable_view_1;
                        ErasableView erasableView = (ErasableView) yum0.f(viewInflate2, R.id.erasable_view_1);
                        if (erasableView != null) {
                            i10 = R.id.erasable_view_2;
                            ErasableView erasableView2 = (ErasableView) yum0.f(viewInflate2, R.id.erasable_view_2);
                            if (erasableView2 != null) {
                                i10 = R.id.erasable_view_3;
                                ErasableView erasableView3 = (ErasableView) yum0.f(viewInflate2, R.id.erasable_view_3);
                                if (erasableView3 != null) {
                                    i10 = R.id.erasable_view_4;
                                    ErasableView erasableView4 = (ErasableView) yum0.f(viewInflate2, R.id.erasable_view_4);
                                    if (erasableView4 != null) {
                                        i10 = R.id.erasable_view_5;
                                        ErasableView erasableView5 = (ErasableView) yum0.f(viewInflate2, R.id.erasable_view_5);
                                        if (erasableView5 != null) {
                                            i10 = R.id.erasable_view_6;
                                            ErasableView erasableView6 = (ErasableView) yum0.f(viewInflate2, R.id.erasable_view_6);
                                            if (erasableView6 != null) {
                                                i10 = R.id.erasable_view_7;
                                                ErasableView erasableView7 = (ErasableView) yum0.f(viewInflate2, R.id.erasable_view_7);
                                                if (erasableView7 != null) {
                                                    i10 = R.id.erasable_view_8;
                                                    ErasableView erasableView8 = (ErasableView) yum0.f(viewInflate2, R.id.erasable_view_8);
                                                    if (erasableView8 != null) {
                                                        i10 = R.id.erasable_view_9;
                                                        ErasableView erasableView9 = (ErasableView) yum0.f(viewInflate2, R.id.erasable_view_9);
                                                        if (erasableView9 == null) {
                                                            i2 = i10;
                                                        } else if (((Guideline) yum0.f(viewInflate2, R.id.guide_horizontal_1)) == null) {
                                                            i2 = R.id.guide_horizontal_1;
                                                        } else if (((Guideline) yum0.f(viewInflate2, R.id.guide_horizontal_2)) == null) {
                                                            i2 = R.id.guide_horizontal_2;
                                                        } else if (((Guideline) yum0.f(viewInflate2, R.id.guide_vertical_1)) == null) {
                                                            i2 = R.id.guide_vertical_1;
                                                        } else if (((Guideline) yum0.f(viewInflate2, R.id.guide_vertical_2)) != null) {
                                                            i10 = R.id.lotteryTicketIv;
                                                            if (((ImageView) yum0.f(viewInflate2, R.id.lotteryTicketIv)) != null) {
                                                                TextView textView10 = (TextView) yum0.f(viewInflate2, R.id.number);
                                                                if (textView10 != null) {
                                                                    return new whu0((ConstraintLayout) viewInflate2, viewF, erasableView, erasableView2, erasableView3, erasableView4, erasableView5, erasableView6, erasableView7, erasableView8, erasableView9, textView10);
                                                                }
                                                            } else {
                                                                i2 = i10;
                                                            }
                                                        } else {
                                                            i2 = R.id.guide_vertical_2;
                                                        }
                                                    } else {
                                                        i2 = i10;
                                                    }
                                                } else {
                                                    i2 = i10;
                                                }
                                            } else {
                                                i2 = i10;
                                            }
                                        } else {
                                            i2 = i10;
                                        }
                                    } else {
                                        i2 = i10;
                                    }
                                } else {
                                    i2 = i10;
                                }
                            } else {
                                i2 = i10;
                            }
                        } else {
                            i2 = i10;
                        }
                    } else {
                        i2 = i10;
                    }
                } else {
                    i2 = R.id.disableView;
                }
                hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
                return null;
            case 13:
                LayoutInflater layoutInflaterFrom7 = LayoutInflater.from(((rdq0) obj).getContext());
                layoutInflaterFrom7.getClass();
                rdq0 rdq0Var = (rdq0) obj2;
                View viewInflate3 = layoutInflaterFrom7.inflate(R.layout.view_lottery_single_x, (ViewGroup) rdq0Var, false);
                rdq0Var.addView(viewInflate3);
                View viewF2 = yum0.f(viewInflate3, R.id.disableView);
                if (viewF2 != null) {
                    ErasableView erasableView10 = (ErasableView) yum0.f(viewInflate3, R.id.erasable_view);
                    if (erasableView10 == null) {
                        i2 = R.id.erasable_view;
                    } else if (((Guideline) yum0.f(viewInflate3, R.id.guide_horizontal_1)) == null) {
                        i2 = R.id.guide_horizontal_1;
                    } else if (((Guideline) yum0.f(viewInflate3, R.id.guide_horizontal_2)) == null) {
                        i2 = R.id.guide_horizontal_2;
                    } else if (((Guideline) yum0.f(viewInflate3, R.id.guide_vertical_1)) == null) {
                        i2 = R.id.guide_vertical_1;
                    } else if (((Guideline) yum0.f(viewInflate3, R.id.guide_vertical_2)) != null) {
                        TextView textView11 = (TextView) yum0.f(viewInflate3, R.id.number);
                        if (textView11 != null) {
                            i2 = R.id.ticketIv;
                            if (((ImageView) yum0.f(viewInflate3, R.id.ticketIv)) != null) {
                                return new xhu0((ConstraintLayout) viewInflate3, viewF2, erasableView10, textView11);
                            }
                        }
                    } else {
                        i2 = R.id.guide_vertical_2;
                    }
                } else {
                    i2 = R.id.disableView;
                }
                hny.u("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i2)));
                return null;
            case 14:
                LayoutInflater layoutInflaterFrom8 = LayoutInflater.from(((TimerView) obj).getContext());
                layoutInflaterFrom8.getClass();
                TimerView timerView = (TimerView) obj2;
                View viewInflate4 = layoutInflaterFrom8.inflate(R.layout.view_timer_new, (ViewGroup) timerView, false);
                timerView.addView(viewInflate4);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate4;
                int i11 = R.id.days;
                TextView textView12 = (TextView) yum0.f(viewInflate4, R.id.days);
                if (textView12 != null) {
                    i11 = R.id.daysDelimiter;
                    TextView textView13 = (TextView) yum0.f(viewInflate4, R.id.daysDelimiter);
                    if (textView13 != null) {
                        i11 = R.id.daysText;
                        TextView textView14 = (TextView) yum0.f(viewInflate4, R.id.daysText);
                        if (textView14 != null) {
                            i11 = R.id.hours;
                            TextView textView15 = (TextView) yum0.f(viewInflate4, R.id.hours);
                            if (textView15 != null) {
                                i11 = R.id.hoursDelimiter;
                                TextView textView16 = (TextView) yum0.f(viewInflate4, R.id.hoursDelimiter);
                                if (textView16 != null) {
                                    i11 = R.id.hoursText;
                                    TextView textView17 = (TextView) yum0.f(viewInflate4, R.id.hoursText);
                                    if (textView17 != null) {
                                        i11 = R.id.minutes;
                                        TextView textView18 = (TextView) yum0.f(viewInflate4, R.id.minutes);
                                        if (textView18 != null) {
                                            i11 = R.id.minutesDelimiter;
                                            TextView textView19 = (TextView) yum0.f(viewInflate4, R.id.minutesDelimiter);
                                            if (textView19 != null) {
                                                i11 = R.id.minutesText;
                                                TextView textView20 = (TextView) yum0.f(viewInflate4, R.id.minutesText);
                                                if (textView20 != null) {
                                                    i11 = R.id.placeHolder;
                                                    TextView textView21 = (TextView) yum0.f(viewInflate4, R.id.placeHolder);
                                                    if (textView21 != null) {
                                                        i11 = R.id.seconds;
                                                        TextView textView22 = (TextView) yum0.f(viewInflate4, R.id.seconds);
                                                        if (textView22 != null) {
                                                            i11 = R.id.secondsText;
                                                            TextView textView23 = (TextView) yum0.f(viewInflate4, R.id.secondsText);
                                                            if (textView23 != null) {
                                                                return new slu0(constraintLayout2, constraintLayout2, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23);
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
                hny.u("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i11)));
                return null;
            case 15:
                ((Function1) obj).invoke(Long.valueOf(((s8l0) obj2).f31808a));
                return Unit.f46060a;
            case 16:
                riu0 riu0Var2 = (riu0) ((a8z) obj2).getValue();
                wmv wmvVar2 = riu0Var2 instanceof wmv ? (wmv) riu0Var2 : null;
                return (wmvVar2 == null || (miu0VarN2 = wmvVar2.n()) == null) ? ((q7r0) obj).n() : miu0VarN2;
            case 17:
                v9r0 v9r0Var = (v9r0) obj2;
                Application application = (Application) obj;
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(q9r0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof q9r0)) {
                        ze3Var = null;
                    }
                    q9r0 q9r0Var = (q9r0) ze3Var;
                    if (q9r0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(v9r0Var);
                        j6m0 j6m0Var2 = v9r0.O1;
                        Integer numN = v9r0Var.L1.n(v9r0Var, v9r0.P1[0]);
                        i1w0VarF.getClass();
                        oar0 oar0Var = q9r0Var.m;
                        fsd fsdVar = q9r0Var.k;
                        r9u r9uVar = q9r0Var.l;
                        ctf0 ctf0Var = q9r0Var.j;
                        cad cadVar = q9r0Var.f28364a;
                        roi0 roi0Var = q9r0Var.b;
                        gii0 gii0Var = q9r0Var.c;
                        m1e m1eVar = q9r0Var.d;
                        knf0 knf0Var = q9r0Var.e;
                        yo4 yo4Var = q9r0Var.f;
                        d1p d1pVar = q9r0Var.g;
                        ugf0 ugf0Var = q9r0Var.h;
                        k3r0 k3r0Var = q9r0Var.i;
                        d1pVar.getClass();
                        ctf0Var.getClass();
                        fsdVar.getClass();
                        r9uVar.getClass();
                        gii0Var.getClass();
                        m1eVar.getClass();
                        knf0Var.getClass();
                        oar0Var.getClass();
                        k3r0Var.getClass();
                        return new txi(cadVar, roi0Var, d1pVar, ugf0Var, ctf0Var, fsdVar, r9uVar, i1w0VarF, gii0Var, numN, m1eVar, knf0Var, yo4Var, oar0Var, k3r0Var);
                    }
                }
                jf4.n(b1j.i(q9r0.class, "Cannot create dependency "));
                return null;
            case 18:
                ((Function1) obj).invoke(new ikb0(((h1b0) obj2).f12275a));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                upk0 upk0Var = (upk0) obj2;
                ((Function1) obj).invoke(new mkb0(upk0Var.f36070a, upk0Var.b));
                return Unit.f46060a;
            case 20:
                riu0 riu0Var3 = (riu0) ((a8z) obj2).getValue();
                wmv wmvVar3 = riu0Var3 instanceof wmv ? (wmv) riu0Var3 : null;
                return (wmvVar3 == null || (miu0VarN3 = wmvVar3.n()) == null) ? ((udr0) obj).n() : miu0VarN3;
            case 21:
                ((Function1) obj).invoke(Integer.valueOf(((qwr0) obj2).f29448a));
                return Unit.f46060a;
            case 22:
                vxs0 vxs0Var = (vxs0) obj;
                flc flcVar = (flc) obj2;
                eu00 eu00Var = vxs0Var.f1;
                tfk tfkVar = vxs0Var.g1;
                g93 annotations = flcVar.getAnnotations();
                int iL = flcVar.l();
                if (iL == 0) {
                    throw null;
                }
                tfk tfkVar2 = vxs0Var.g1;
                gmk0 gmk0VarB = tfkVar2.b();
                gmk0VarB.getClass();
                vxs0 vxs0Var2 = new vxs0(eu00Var, tfkVar, flcVar, vxs0Var, annotations, iL, gmk0VarB);
                vxs0.i1.getClass();
                xzs0 xzs0VarD = tfkVar2.p1() == null ? null : xzs0.d(tfkVar2.q1());
                if (xzs0VarD == null) {
                    return null;
                }
                c8z c8zVar = flcVar.k;
                c8z c8zVarQ1 = c8zVar != null ? c8zVar.f(xzs0VarD) : null;
                List listW = flcVar.W();
                listW.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(listW, 10));
                Iterator it = listW.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c8z) it.next()).f(xzs0VarD));
                }
                List listM = tfkVar2.M();
                List listZ = vxs0Var.z();
                wsy wsyVar = vxs0Var.h;
                wsyVar.getClass();
                vxs0Var2.t1(null, c8zVarQ1, arrayList, listM, listZ, wsyVar, gm40.b, tfkVar2.g);
                return vxs0Var2;
            case 23:
                g45 g45Var = (g45) ((qgd) obj).b;
                return ((m83) ((f6i) g45Var.f10647a).g).g((a4d0) obj2, (h950) g45Var.b);
            case 24:
                LayoutInflater layoutInflaterFrom9 = LayoutInflater.from(((VictoryFormulaView) obj).getContext());
                layoutInflaterFrom9.getClass();
                VictoryFormulaView victoryFormulaView = (VictoryFormulaView) obj2;
                layoutInflaterFrom9.inflate(R.layout.synthetic_victory_formula_view, victoryFormulaView);
                int i12 = R.id.firstPlayerCenterSeparator;
                View viewF3 = yum0.f(victoryFormulaView, R.id.firstPlayerCenterSeparator);
                if (viewF3 != null) {
                    i12 = R.id.firstPlayerFormulaBg;
                    View viewF4 = yum0.f(victoryFormulaView, R.id.firstPlayerFormulaBg);
                    if (viewF4 != null) {
                        i12 = R.id.firstPlayerFormulaValues;
                        View viewF5 = yum0.f(victoryFormulaView, R.id.firstPlayerFormulaValues);
                        if (viewF5 != null) {
                            i12 = R.id.firstPlayerLeftSeparator;
                            View viewF6 = yum0.f(victoryFormulaView, R.id.firstPlayerLeftSeparator);
                            if (viewF6 != null) {
                                i12 = R.id.firstPlayerRightSeparator;
                                View viewF7 = yum0.f(victoryFormulaView, R.id.firstPlayerRightSeparator);
                                if (viewF7 != null) {
                                    i12 = R.id.guideline;
                                    View viewF8 = yum0.f(victoryFormulaView, R.id.guideline);
                                    if (viewF8 != null) {
                                        i12 = R.id.ivBackground;
                                        if (((ImageView) yum0.f(victoryFormulaView, R.id.ivBackground)) != null) {
                                            i12 = R.id.secondPlayerCenterSeparator;
                                            View viewF9 = yum0.f(victoryFormulaView, R.id.secondPlayerCenterSeparator);
                                            if (viewF9 != null) {
                                                i12 = R.id.secondPlayerFormulaBg;
                                                View viewF10 = yum0.f(victoryFormulaView, R.id.secondPlayerFormulaBg);
                                                if (viewF10 != null) {
                                                    i12 = R.id.secondPlayerFormulaValues;
                                                    View viewF11 = yum0.f(victoryFormulaView, R.id.secondPlayerFormulaValues);
                                                    if (viewF11 != null) {
                                                        i12 = R.id.secondPlayerLeftSeparator;
                                                        View viewF12 = yum0.f(victoryFormulaView, R.id.secondPlayerLeftSeparator);
                                                        if (viewF12 != null) {
                                                            i12 = R.id.secondPlayerRightSeparator;
                                                            View viewF13 = yum0.f(victoryFormulaView, R.id.secondPlayerRightSeparator);
                                                            if (viewF13 != null) {
                                                                SyntheticTimerView syntheticTimerView3 = (SyntheticTimerView) yum0.f(victoryFormulaView, R.id.syntheticTimerView);
                                                                if (syntheticTimerView3 != null) {
                                                                    i3 = R.id.tvFirstFormula;
                                                                    TextView textView24 = (TextView) yum0.f(victoryFormulaView, R.id.tvFirstFormula);
                                                                    if (textView24 != null) {
                                                                        i3 = R.id.tvFirstFormulaTitle;
                                                                        if (((TextView) yum0.f(victoryFormulaView, R.id.tvFirstFormulaTitle)) != null) {
                                                                            i3 = R.id.tvFirstPlayerFirstValue;
                                                                            TextView textView25 = (TextView) yum0.f(victoryFormulaView, R.id.tvFirstPlayerFirstValue);
                                                                            if (textView25 != null) {
                                                                                i3 = R.id.tvFirstPlayerSecondValue;
                                                                                TextView textView26 = (TextView) yum0.f(victoryFormulaView, R.id.tvFirstPlayerSecondValue);
                                                                                if (textView26 != null) {
                                                                                    i3 = R.id.tvFirstPlayerThirdValue;
                                                                                    TextView textView27 = (TextView) yum0.f(victoryFormulaView, R.id.tvFirstPlayerThirdValue);
                                                                                    if (textView27 != null) {
                                                                                        if (((TextView) yum0.f(victoryFormulaView, R.id.tvFirstPlayerTitle)) != null) {
                                                                                            i3 = R.id.tvFirstPlayerTotalScore;
                                                                                            TextView textView28 = (TextView) yum0.f(victoryFormulaView, R.id.tvFirstPlayerTotalScore);
                                                                                            if (textView28 != null) {
                                                                                                i3 = R.id.tvSecondFormula;
                                                                                                TextView textView29 = (TextView) yum0.f(victoryFormulaView, R.id.tvSecondFormula);
                                                                                                if (textView29 != null) {
                                                                                                    i3 = R.id.tvSecondFormulaTitle;
                                                                                                    if (((TextView) yum0.f(victoryFormulaView, R.id.tvSecondFormulaTitle)) != null) {
                                                                                                        i3 = R.id.tvSecondPlayerFirstValue;
                                                                                                        TextView textView30 = (TextView) yum0.f(victoryFormulaView, R.id.tvSecondPlayerFirstValue);
                                                                                                        if (textView30 != null) {
                                                                                                            i3 = R.id.tvSecondPlayerSecondValue;
                                                                                                            TextView textView31 = (TextView) yum0.f(victoryFormulaView, R.id.tvSecondPlayerSecondValue);
                                                                                                            if (textView31 != null) {
                                                                                                                i3 = R.id.tvSecondPlayerThirdValue;
                                                                                                                TextView textView32 = (TextView) yum0.f(victoryFormulaView, R.id.tvSecondPlayerThirdValue);
                                                                                                                if (textView32 != null) {
                                                                                                                    if (((TextView) yum0.f(victoryFormulaView, R.id.tvSecondPlayerTitle)) != null) {
                                                                                                                        i3 = R.id.tvSecondPlayerTotalScore;
                                                                                                                        TextView textView33 = (TextView) yum0.f(victoryFormulaView, R.id.tvSecondPlayerTotalScore);
                                                                                                                        if (textView33 != null) {
                                                                                                                            TextView textView34 = (TextView) yum0.f(victoryFormulaView, R.id.tvWinnerTitle);
                                                                                                                            if (textView34 != null) {
                                                                                                                                return new u8o0(victoryFormulaView, viewF3, viewF4, viewF5, viewF6, viewF7, viewF8, viewF9, viewF10, viewF11, viewF12, viewF13, syntheticTimerView3, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34);
                                                                                                                            }
                                                                                                                            i3 = R.id.tvWinnerTitle;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i3 = R.id.tvSecondPlayerTitle;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i3 = R.id.tvFirstPlayerTitle;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                i3 = i12;
                                                            }
                                                        } else {
                                                            i3 = i12;
                                                        }
                                                    } else {
                                                        i3 = i12;
                                                    }
                                                } else {
                                                    i3 = i12;
                                                }
                                            } else {
                                                i3 = i12;
                                            }
                                        } else {
                                            i3 = i12;
                                        }
                                    } else {
                                        i3 = i12;
                                    }
                                } else {
                                    i3 = i12;
                                }
                            } else {
                                i3 = i12;
                            }
                        } else {
                            i3 = i12;
                        }
                    } else {
                        i3 = i12;
                    }
                } else {
                    i3 = i12;
                }
                hny.u("Missing required view with ID: ".concat(victoryFormulaView.getResources().getResourceName(i3)));
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                riu0 riu0Var4 = (riu0) ((a8z) obj2).getValue();
                wmv wmvVar4 = riu0Var4 instanceof wmv ? (wmv) riu0Var4 : null;
                return (wmvVar4 == null || (miu0VarN4 = wmvVar4.n()) == null) ? ((xru0) obj).n() : miu0VarN4;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                riu0 riu0Var5 = (riu0) ((a8z) obj2).getValue();
                wmv wmvVar5 = riu0Var5 instanceof wmv ? (wmv) riu0Var5 : null;
                return (wmvVar5 == null || (miu0VarN5 = wmvVar5.n()) == null) ? ((hsu0) obj).n() : miu0VarN5;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) obj).invoke(new gzu0((yzu0) obj2));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) obj).invoke((rdv0) obj2);
                return Unit.f46060a;
            default:
                riu0 riu0Var6 = (riu0) ((a8z) obj2).getValue();
                wmv wmvVar6 = riu0Var6 instanceof wmv ? (wmv) riu0Var6 : null;
                return (wmvVar6 == null || (miu0VarN6 = wmvVar6.n()) == null) ? ((cyv0) obj).n() : miu0VarN6;
        }
    }
}
