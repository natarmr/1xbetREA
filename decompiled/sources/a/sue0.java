package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.roulette.gamefield.RouletteView;
import org.xplatform.cyber.game.universal.impl.presentation.settoemezzo.combination.SettoeMezzoCombinationView;
import org.xplatform.cyber.game.universal.impl.presentation.settoemezzo.costrule.SettoeMezzoRuleView;
import org.xplatform.related.api.presentation.RelatedContainerView;
import org.xplatform.resident.presentation.views.ResidentPersonView;
import org.xplatform.resident.presentation.views.ResidentTagView;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinButton;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinChoiceView;
import org.xplatform.statistic.champ_statistic.presentation.models.ChampSubMenuItem;
import org.xplatform.statistic.grand_prix.presentation.model.SeasonItemUIModel;
import org.xplatform.ui_core.viewcomponents.views.date.ScrollableSquaredDateView;
import org.xplatform.uikit.components.loader.DsLoader;

/* JADX INFO: loaded from: classes5.dex */
public final class sue0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32815a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sue0(Object obj, Object obj2, byte b) {
        this.f32815a = b;
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
        byte b = this.f32815a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((Function1) obj2).invoke(((d8f0) obj).f5645a);
                return Unit.f46060a;
            case 1:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(((RelatedContainerView) obj2).getContext());
                layoutInflaterFrom.getClass();
                RelatedContainerView relatedContainerView = (RelatedContainerView) obj;
                layoutInflaterFrom.inflate(R.layout.view_related_content, relatedContainerView);
                int i = R.id.loader;
                if (((DsLoader) yum0.f(relatedContainerView, R.id.loader)) != null) {
                    i = R.id.relatedGamesList;
                    ComposeView composeView = (ComposeView) yum0.f(relatedContainerView, R.id.relatedGamesList);
                    if (composeView != null) {
                        i = R.id.relatedHintStateContainer;
                        if (((ConstraintLayout) yum0.f(relatedContainerView, R.id.relatedHintStateContainer)) != null) {
                            i = R.id.timerMessageGroup;
                            Group group = (Group) yum0.f(relatedContainerView, R.id.timerMessageGroup);
                            if (group != null) {
                                i = R.id.tvMessage;
                                TextView textView = (TextView) yum0.f(relatedContainerView, R.id.tvMessage);
                                if (textView != null) {
                                    i = R.id.tvTimer;
                                    TextView textView2 = (TextView) yum0.f(relatedContainerView, R.id.tvTimer);
                                    if (textView2 != null) {
                                        i = R.id.tvTimerMessage;
                                        if (((TextView) yum0.f(relatedContainerView, R.id.tvTimerMessage)) != null) {
                                            return new hku0(relatedContainerView, composeView, group, textView, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(relatedContainerView.getResources().getResourceName(i)));
                return null;
            case 2:
                ((Function1) obj2).invoke(new egf0(((tsd) obj).f34456a));
                return Unit.f46060a;
            case 3:
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(((mof0) obj2).getContext());
                layoutInflaterFrom2.getClass();
                mof0 mof0Var = (mof0) obj;
                View viewInflate = layoutInflaterFrom2.inflate(R.layout.view_resident_door, (ViewGroup) mof0Var, false);
                mof0Var.addView(viewInflate);
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                int i2 = R.id.guideline2;
                if (((Guideline) yum0.f(viewInflate, R.id.guideline2)) != null) {
                    i2 = R.id.guideline3;
                    if (((Guideline) yum0.f(viewInflate, R.id.guideline3)) != null) {
                        i2 = R.id.guideline8;
                        if (((Guideline) yum0.f(viewInflate, R.id.guideline8)) != null) {
                            i2 = R.id.ivAnimatedDoor;
                            ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivAnimatedDoor);
                            if (imageView != null) {
                                i2 = R.id.ivDoor;
                                ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivDoor);
                                if (imageView2 != null) {
                                    return new jku0(constraintLayout, imageView, imageView2);
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                return null;
            case 4:
                LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(((ResidentPersonView) obj2).getContext());
                layoutInflaterFrom3.getClass();
                ResidentPersonView residentPersonView = (ResidentPersonView) obj;
                View viewInflate2 = layoutInflaterFrom3.inflate(R.layout.view_resident_person, (ViewGroup) residentPersonView, false);
                residentPersonView.addView(viewInflate2);
                int i3 = R.id.guideExtinguisherStart;
                if (((Guideline) yum0.f(viewInflate2, R.id.guideExtinguisherStart)) != null) {
                    i3 = R.id.guideExtinguisherTop;
                    if (((Guideline) yum0.f(viewInflate2, R.id.guideExtinguisherTop)) != null) {
                        i3 = R.id.ivExtinguisher;
                        ImageView imageView3 = (ImageView) yum0.f(viewInflate2, R.id.ivExtinguisher);
                        if (imageView3 != null) {
                            i3 = R.id.ivPerson;
                            ImageView imageView4 = (ImageView) yum0.f(viewInflate2, R.id.ivPerson);
                            if (imageView4 != null) {
                                return new kku0((ConstraintLayout) viewInflate2, imageView3, imageView4);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i3)));
                return null;
            case 5:
                LayoutInflater layoutInflaterFrom4 = LayoutInflater.from(((srf0) obj2).getContext());
                layoutInflaterFrom4.getClass();
                srf0 srf0Var = (srf0) obj;
                View viewInflate3 = layoutInflaterFrom4.inflate(R.layout.view_resident_safe, (ViewGroup) srf0Var, false);
                srf0Var.addView(viewInflate3);
                int i4 = R.id.ivSafe;
                ImageView imageView5 = (ImageView) yum0.f(viewInflate3, R.id.ivSafe);
                if (imageView5 != null) {
                    i4 = R.id.tvScore;
                    TextView textView3 = (TextView) yum0.f(viewInflate3, R.id.tvScore);
                    if (textView3 != null) {
                        return new lku0((FrameLayout) viewInflate3, imageView5, textView3);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i4)));
                return null;
            case 6:
                LayoutInflater layoutInflaterFrom5 = LayoutInflater.from(((ResidentTagView) obj2).getContext());
                layoutInflaterFrom5.getClass();
                ResidentTagView residentTagView = (ResidentTagView) obj;
                View viewInflate4 = layoutInflaterFrom5.inflate(R.layout.view_resident_tag, (ViewGroup) residentTagView, false);
                residentTagView.addView(viewInflate4);
                int i5 = R.id.guidelineTextBottom;
                if (((Guideline) yum0.f(viewInflate4, R.id.guidelineTextBottom)) != null) {
                    i5 = R.id.guidelineTextEnd;
                    if (((Guideline) yum0.f(viewInflate4, R.id.guidelineTextEnd)) != null) {
                        i5 = R.id.guidelineTextStart;
                        if (((Guideline) yum0.f(viewInflate4, R.id.guidelineTextStart)) != null) {
                            i5 = R.id.guidelineTextTop;
                            if (((Guideline) yum0.f(viewInflate4, R.id.guidelineTextTop)) != null) {
                                i5 = R.id.ivTag;
                                if (((ImageView) yum0.f(viewInflate4, R.id.ivTag)) != null) {
                                    i5 = R.id.tvPrice;
                                    TextView textView4 = (TextView) yum0.f(viewInflate4, R.id.tvPrice);
                                    if (textView4 != null) {
                                        return new mku0((ConstraintLayout) viewInflate4, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i5)));
                return null;
            case 7:
                riu0 riu0Var = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var instanceof wmv ? (wmv) riu0Var : null;
                return (wmvVar == null || (miu0VarN = wmvVar.n()) == null) ? ((hxf0) obj2).n() : miu0VarN;
            case 8:
                riu0 riu0Var2 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var2 instanceof wmv ? (wmv) riu0Var2 : null;
                return (wmvVar == null || (miu0VarN2 = wmvVar.n()) == null) ? ((ayf0) obj2).n() : miu0VarN2;
            case 9:
                LayoutInflater layoutInflaterFrom6 = LayoutInflater.from(((RouletteView) obj2).getContext());
                layoutInflaterFrom6.getClass();
                RouletteView rouletteView = (RouletteView) obj;
                layoutInflaterFrom6.inflate(R.layout.synthetic_roulette_view, rouletteView);
                int i6 = R.id.rouletteArrowIv;
                if (((ImageView) yum0.f(rouletteView, R.id.rouletteArrowIv)) != null) {
                    i6 = R.id.rouletteFieldIv;
                    if (((ImageView) yum0.f(rouletteView, R.id.rouletteFieldIv)) != null) {
                        i6 = R.id.rouletteIv;
                        ImageView imageView6 = (ImageView) yum0.f(rouletteView, R.id.rouletteIv);
                        if (imageView6 != null) {
                            i6 = R.id.rouletteValueTv;
                            TextView textView5 = (TextView) yum0.f(rouletteView, R.id.rouletteValueTv);
                            if (textView5 != null) {
                                return new q7o0(rouletteView, imageView6, textView5);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(rouletteView.getResources().getResourceName(i6)));
                return null;
            case 10:
                LayoutInflater layoutInflaterFrom7 = LayoutInflater.from(((htg0) obj2).getContext());
                layoutInflaterFrom7.getClass();
                htg0 htg0Var = (htg0) obj;
                View viewInflate5 = layoutInflaterFrom7.inflate(R.layout.view_safe, (ViewGroup) htg0Var, false);
                htg0Var.addView(viewInflate5);
                int i7 = R.id.doorIv;
                AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewInflate5, R.id.doorIv);
                if (appCompatImageView != null) {
                    i7 = R.id.safeIv;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) yum0.f(viewInflate5, R.id.safeIv);
                    if (appCompatImageView2 != null) {
                        return new nku0((ConstraintLayout) viewInflate5, appCompatImageView, appCompatImageView2);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(i7)));
                return null;
            case 11:
                riu0 riu0Var3 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var3 instanceof wmv ? (wmv) riu0Var3 : null;
                return (wmvVar == null || (miu0VarN3 = wmvVar.n()) == null) ? ((Fragment) obj2).n() : miu0VarN3;
            case 12:
                LayoutInflater layoutInflaterFrom8 = LayoutInflater.from(((ScrollableSquaredDateView) obj2).getContext());
                layoutInflaterFrom8.getClass();
                View viewInflate6 = layoutInflaterFrom8.inflate(R.layout.view_scrollable_square_date, (ViewGroup) obj, false);
                if (viewInflate6 != null) {
                    return new pku0((RecyclerView) viewInflate6);
                }
                hny.u("rootView");
                return null;
            case 13:
                ljh0 ljh0Var = (ljh0) obj2;
                lme0 lme0Var = ljh0.m2;
                vcc.f0(i120.V(new Pair("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", (SeasonItemUIModel) obj)), ljh0Var, ljh0Var.l2.n(ljh0Var, ljh0.n2[1]));
                ljh0Var.x0();
                return Unit.f46060a;
            case 14:
                ((Function1) obj2).invoke(new gjh0(((ejh0) obj).f7910a));
                return Unit.f46060a;
            case 15:
                ((Function1) obj2).invoke(new fec(((dre) obj).f6555a));
                return Unit.f46060a;
            case 16:
                ((Function1) obj2).invoke(new zzi0(((pzc) obj).f27837a));
                return Unit.f46060a;
            case 17:
                LayoutInflater layoutInflaterFrom9 = LayoutInflater.from(((SettoeMezzoCombinationView) obj2).getContext());
                layoutInflaterFrom9.getClass();
                SettoeMezzoCombinationView settoeMezzoCombinationView = (SettoeMezzoCombinationView) obj;
                layoutInflaterFrom9.inflate(R.layout.settoe_mezzo_combination_view, settoeMezzoCombinationView);
                int i8 = R.id.imgFirstCard;
                ImageView imageView7 = (ImageView) yum0.f(settoeMezzoCombinationView, R.id.imgFirstCard);
                if (imageView7 != null) {
                    i8 = R.id.imgSecondCard;
                    ImageView imageView8 = (ImageView) yum0.f(settoeMezzoCombinationView, R.id.imgSecondCard);
                    if (imageView8 != null) {
                        i8 = R.id.imgThirdCard;
                        ImageView imageView9 = (ImageView) yum0.f(settoeMezzoCombinationView, R.id.imgThirdCard);
                        if (imageView9 != null) {
                            i8 = R.id.tvDescription;
                            TextView textView6 = (TextView) yum0.f(settoeMezzoCombinationView, R.id.tvDescription);
                            if (textView6 != null) {
                                i8 = R.id.tvTitle;
                                TextView textView7 = (TextView) yum0.f(settoeMezzoCombinationView, R.id.tvTitle);
                                if (textView7 != null) {
                                    i8 = R.id.tvVs;
                                    TextView textView8 = (TextView) yum0.f(settoeMezzoCombinationView, R.id.tvVs);
                                    if (textView8 != null) {
                                        return new jij0(settoeMezzoCombinationView, imageView7, imageView8, imageView9, textView6, textView7, textView8);
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(settoeMezzoCombinationView.getResources().getResourceName(i8)));
                return null;
            case 18:
                LayoutInflater layoutInflaterFrom10 = LayoutInflater.from(((SettoeMezzoRuleView) obj2).getContext());
                layoutInflaterFrom10.getClass();
                SettoeMezzoRuleView settoeMezzoRuleView = (SettoeMezzoRuleView) obj;
                layoutInflaterFrom10.inflate(R.layout.settoe_mezzo_rule_view, settoeMezzoRuleView);
                int i9 = R.id.imgCard;
                ImageView imageView10 = (ImageView) yum0.f(settoeMezzoRuleView, R.id.imgCard);
                if (imageView10 != null) {
                    i9 = R.id.tvCost;
                    TextView textView9 = (TextView) yum0.f(settoeMezzoRuleView, R.id.tvCost);
                    if (textView9 != null) {
                        return new sij0(settoeMezzoRuleView, imageView10, textView9);
                    }
                }
                hny.u("Missing required view with ID: ".concat(settoeMezzoRuleView.getResources().getResourceName(i9)));
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                LayoutInflater layoutInflaterFrom11 = LayoutInflater.from(((usj0) obj2).getContext());
                layoutInflaterFrom11.getClass();
                usj0 usj0Var = (usj0) obj;
                View viewInflate7 = layoutInflaterFrom11.inflate(R.layout.showcase_item_holder_layout, (ViewGroup) usj0Var, false);
                usj0Var.addView(viewInflate7);
                if (viewInflate7 != null) {
                    ImageView imageView11 = (ImageView) viewInflate7;
                    return new vsj0(imageView11, imageView11);
                }
                hny.u("rootView");
                return null;
            case 20:
                riu0 riu0Var4 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var4 instanceof wmv ? (wmv) riu0Var4 : null;
                return (wmvVar == null || (miu0VarN4 = wmvVar.n()) == null) ? ((jvj0) obj2).n() : miu0VarN4;
            case 21:
                LayoutInflater layoutInflaterFrom12 = LayoutInflater.from(((SpinAndWinButton) obj2).getContext());
                layoutInflaterFrom12.getClass();
                SpinAndWinButton spinAndWinButton = (SpinAndWinButton) obj;
                View viewInflate8 = layoutInflaterFrom12.inflate(R.layout.bet_button_spin_and_win, (ViewGroup) spinAndWinButton, false);
                spinAndWinButton.addView(viewInflate8);
                int i10 = R.id.btn_image;
                ImageView imageView12 = (ImageView) yum0.f(viewInflate8, R.id.btn_image);
                if (imageView12 != null) {
                    i10 = R.id.btn_text;
                    TextView textView10 = (TextView) yum0.f(viewInflate8, R.id.btn_text);
                    if (textView10 != null) {
                        i10 = R.id.btn_up_image;
                        ImageView imageView13 = (ImageView) yum0.f(viewInflate8, R.id.btn_up_image);
                        if (imageView13 != null) {
                            i10 = R.id.coefficent;
                            TextView textView11 = (TextView) yum0.f(viewInflate8, R.id.coefficent);
                            if (textView11 != null) {
                                i10 = R.id.guideline_v;
                                Guideline guideline = (Guideline) yum0.f(viewInflate8, R.id.guideline_v);
                                if (guideline != null) {
                                    return new wm6((ConstraintLayout) viewInflate8, imageView12, textView10, imageView13, textView11, guideline);
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate8.getResources().getResourceName(i10)));
                return null;
            case 22:
                LayoutInflater layoutInflaterFrom13 = LayoutInflater.from(((SpinAndWinChoiceView) obj2).getContext());
                layoutInflaterFrom13.getClass();
                SpinAndWinChoiceView spinAndWinChoiceView = (SpinAndWinChoiceView) obj;
                View viewInflate9 = layoutInflaterFrom13.inflate(R.layout.choose_view_spin_and_win, (ViewGroup) spinAndWinChoiceView, false);
                spinAndWinChoiceView.addView(viewInflate9);
                GridLayout gridLayout = (GridLayout) viewInflate9;
                int i11 = R.id.x10Btn;
                SpinAndWinButton spinAndWinButton2 = (SpinAndWinButton) yum0.f(viewInflate9, R.id.x10Btn);
                if (spinAndWinButton2 != null) {
                    i11 = R.id.x20Btn;
                    SpinAndWinButton spinAndWinButton3 = (SpinAndWinButton) yum0.f(viewInflate9, R.id.x20Btn);
                    if (spinAndWinButton3 != null) {
                        i11 = R.id.x2Btn;
                        SpinAndWinButton spinAndWinButton4 = (SpinAndWinButton) yum0.f(viewInflate9, R.id.x2Btn);
                        if (spinAndWinButton4 != null) {
                            i11 = R.id.x4Btn;
                            SpinAndWinButton spinAndWinButton5 = (SpinAndWinButton) yum0.f(viewInflate9, R.id.x4Btn);
                            if (spinAndWinButton5 != null) {
                                i11 = R.id.x5Btn;
                                SpinAndWinButton spinAndWinButton6 = (SpinAndWinButton) yum0.f(viewInflate9, R.id.x5Btn);
                                if (spinAndWinButton6 != null) {
                                    i11 = R.id.x7Btn;
                                    SpinAndWinButton spinAndWinButton7 = (SpinAndWinButton) yum0.f(viewInflate9, R.id.x7Btn);
                                    if (spinAndWinButton7 != null) {
                                        return new mic(gridLayout, gridLayout, spinAndWinButton2, spinAndWinButton3, spinAndWinButton4, spinAndWinButton5, spinAndWinButton6, spinAndWinButton7);
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate9.getResources().getResourceName(i11)));
                return null;
            case 23:
                ((Function1) obj2).invoke(new vxq0(new w4l0(((ger0) obj).c.f19243a)));
                return Unit.f46060a;
            case 24:
                riu0 riu0Var5 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var5 instanceof wmv ? (wmv) riu0Var5 : null;
                return (wmvVar == null || (miu0VarN5 = wmvVar.n()) == null) ? ((ysl0) obj2).n() : miu0VarN5;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                riu0 riu0Var6 = (riu0) ((a8z) obj).getValue();
                wmvVar = riu0Var6 instanceof wmv ? (wmv) riu0Var6 : null;
                return (wmvVar == null || (miu0VarN6 = wmvVar.n()) == null) ? ((mtl0) obj2).n() : miu0VarN6;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kvl0 kvl0Var = (kvl0) obj;
                ((Function2) obj2).invoke(Long.valueOf(kvl0Var.f18961a), kvl0Var.b);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ComponentCallbacks2 componentCallbacks2 = (Application) obj2;
                af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(zzl0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof zzl0)) {
                        ze3Var = null;
                    }
                    zzl0 zzl0Var = (zzl0) ze3Var;
                    if (zzl0Var != null) {
                        long j = ((d0m0) obj).b;
                        cad cadVar = zzl0Var.f45261a;
                        roi0 roi0Var = zzl0Var.d;
                        ctf0 ctf0Var = zzl0Var.b;
                        r9u r9uVar = zzl0Var.c;
                        a0m0 a0m0Var = zzl0Var.f;
                        kki kkiVarA = ((daf) roi0Var.f30839a).j().a(zzl0Var.e.c());
                        ctf0Var.getClass();
                        r9uVar.getClass();
                        a0m0Var.getClass();
                        return new vui(cadVar, ctf0Var, r9uVar, Long.valueOf(j), a0m0Var, kkiVarA);
                    }
                }
                jf4.n(b1j.i(zzl0.class, "Cannot create dependency "));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) obj2).invoke((tdb) obj);
                return Unit.f46060a;
            default:
                fcm0 fcm0Var = (fcm0) obj2;
                j6m0 j6m0Var = fcm0.n2;
                vcc.f0(i120.V(new Pair("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", (ChampSubMenuItem) obj)), fcm0Var, fcm0Var.m2.n(fcm0Var, fcm0.o2[2]));
                fcm0Var.x0();
                return Unit.f46060a;
        }
    }
}
