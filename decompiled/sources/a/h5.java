package a;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneCellGameView;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneGameView;
import org.xplatform.core.presentation.bet_settings.ChipView;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.CrystalFieldInfoView;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackChoiceView;
import org.xplatform.rules.impl.util.ContactsWebView;
import org.xplatform.statistic.tennis.impl.summary.presentation.chose_filter.ChoseFilterUiModel;
import org.xplatform.ui_core.viewcomponents.layouts.frame.CircleBorderImageView;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes2.dex */
public final class h5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12457a;
    public final Object b;
    public final Object c;

    public /* synthetic */ h5(t5 t5Var, Object obj, byte b) {
        this.f12457a = b;
        this.c = t5Var;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0430 A[PHI: r1
  0x0430: PHI (r1v24 int) = (r1v23 int), (r1v25 int), (r1v26 int) binds: [B:130:0x03f8, B:132:0x0404, B:134:0x0410] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x055d A[PHI: r0
  0x055d: PHI (r0v18 int) = (r0v17 int), (r0v22 int), (r0v23 int), (r0v24 int) binds: [B:173:0x0520, B:175:0x052b, B:177:0x0537, B:179:0x0543] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wmv wmvVar;
        miu0 miu0VarN;
        miu0 miu0VarN2;
        miu0 miu0VarN3;
        miu0 miu0VarN4;
        byte b = this.f12457a;
        int i = R.id.guideline;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                q8a q8aVar = (q8a) obj2;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    aty atyVarC0 = q8aVar.c0((aty) it.next());
                    if (atyVarC0 != null) {
                        arrayList.add(atyVarC0);
                    }
                }
                return arrayList;
            case 1:
                return new s5((t5) obj2, (eu00) obj);
            case 2:
                ays0.b.getClass();
                ays0 ays0Var = ays0.c;
                iys0 iys0VarH = ((t5) obj2).h();
                List list = Collections.EMPTY_LIST;
                o5 o5Var = new o5(this, (byte) 2);
                wt00 wt00Var = eu00.e;
                wt00Var.getClass();
                return ucx.h0(new mdz(wt00Var, o5Var), ays0Var, iys0VarH, list, false);
            case 3:
                riu0 riu0Var = (riu0) ((a8z) obj2).getValue();
                wmvVar = riu0Var instanceof wmv ? (wmv) riu0Var : null;
                return (wmvVar == null || (miu0VarN = wmvVar.n()) == null) ? ((q21) obj).n() : miu0VarN;
            case 4:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj).getCanonicalName());
                CollectionsKt.a0(((Map) obj2).entrySet(), sb, ", ", Separators.LPAREN, Separators.RPAREN, i13.c, 48);
                return sb.toString();
            case 5:
                ((Function1) obj).invoke(new l93(((qa5) obj2).f28378a));
                return Unit.f46060a;
            case 6:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(((AppleFortuneCellGameView) obj).getContext());
                layoutInflaterFrom.getClass();
                AppleFortuneCellGameView appleFortuneCellGameView = (AppleFortuneCellGameView) obj2;
                layoutInflaterFrom.inflate(R.layout.apple_fortune_cell_game, appleFortuneCellGameView);
                int i2 = R.id.appleFortuneGameField;
                AppleFortuneGameView appleFortuneGameView = (AppleFortuneGameView) yum0.f(appleFortuneCellGameView, R.id.appleFortuneGameField);
                if (appleFortuneGameView != null) {
                    i2 = R.id.bottomImageBackground;
                    if (((AppCompatTextView) yum0.f(appleFortuneCellGameView, R.id.bottomImageBackground)) != null) {
                        i2 = R.id.currentMoney;
                        TextView textView = (TextView) yum0.f(appleFortuneCellGameView, R.id.currentMoney);
                        if (textView != null) {
                            i2 = R.id.getMoney;
                            Button button = (Button) yum0.f(appleFortuneCellGameView, R.id.getMoney);
                            if (button == null) {
                                i = i2;
                            } else if (((Guideline) yum0.f(appleFortuneCellGameView, R.id.guideline)) != null) {
                                i = R.id.shimmer;
                                View viewF = yum0.f(appleFortuneCellGameView, R.id.shimmer);
                                if (viewF != null) {
                                    return new lp3(appleFortuneCellGameView, appleFortuneGameView, textView, button, viewF);
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
                hny.u("Missing required view with ID: ".concat(appleFortuneCellGameView.getResources().getResourceName(i)));
                return null;
            case 7:
                qek0 qek0Var = ze4.g2;
                ((ze4) obj).K0().x(new od4(((af4) obj2).b));
                return Unit.f46060a;
            case 8:
                riu0 riu0Var2 = (riu0) ((a8z) obj2).getValue();
                wmvVar = riu0Var2 instanceof wmv ? (wmv) riu0Var2 : null;
                return (wmvVar == null || (miu0VarN2 = wmvVar.n()) == null) ? ((rw4) obj).n() : miu0VarN2;
            case 9:
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(((ad6) obj).getContext());
                layoutInflaterFrom2.getClass();
                ad6 ad6Var = (ad6) obj2;
                layoutInflaterFrom2.inflate(R.layout.bet_accuracy_view, ad6Var);
                int i3 = R.id.tvExtra;
                TextView textView2 = (TextView) yum0.f(ad6Var, R.id.tvExtra);
                if (textView2 != null) {
                    i3 = R.id.tvTitle;
                    TextView textView3 = (TextView) yum0.f(ad6Var, R.id.tvTitle);
                    if (textView3 != null) {
                        return new bd6(ad6Var, textView2, textView3);
                    }
                }
                hny.u("Missing required view with ID: ".concat(ad6Var.getResources().getResourceName(i3)));
                return null;
            case 10:
                ((Function1) obj).invoke(new s2f0(((bh8) obj2).f2593a));
                return Unit.f46060a;
            case 11:
                Function1 function1 = (Function1) obj2;
                wv8 wv8Var = (wv8) ((zv8) obj);
                if (wv8Var.f39828a.equals("SORTING_SETTING_CELL_ID")) {
                    function1.invoke(jv8.f17196a);
                }
                if (wv8Var.f39828a.equals("LANGUAGES_SETTING_CELL_ID")) {
                    function1.invoke(iv8.f15434a);
                }
                return Unit.f46060a;
            case 12:
                ((Function1) obj).invoke(new oz8(((vz8) obj2).f38287a));
                return Unit.f46060a;
            case 13:
                LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(((CashbackChoiceView) obj).getContext());
                layoutInflaterFrom3.getClass();
                CashbackChoiceView cashbackChoiceView = (CashbackChoiceView) obj2;
                View viewInflate = layoutInflaterFrom3.inflate(R.layout.view_cashback_choice, (ViewGroup) cashbackChoiceView, false);
                cashbackChoiceView.addView(viewInflate);
                int i4 = R.id.btn_cancel;
                MaterialButton materialButton = (MaterialButton) yum0.f(viewInflate, R.id.btn_cancel);
                if (materialButton != null) {
                    i4 = R.id.btn_choice;
                    MaterialCardView materialCardView = (MaterialCardView) yum0.f(viewInflate, R.id.btn_choice);
                    if (materialCardView != null) {
                        i4 = R.id.btn_save;
                        MaterialButton materialButton2 = (MaterialButton) yum0.f(viewInflate, R.id.btn_save);
                        if (materialButton2 == null) {
                            i = i4;
                        } else if (((Guideline) yum0.f(viewInflate, R.id.guideline)) != null) {
                            i = R.id.tv_save;
                            TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tv_save);
                            if (textView4 != null) {
                                return new bgu0((ConstraintLayout) viewInflate, materialButton, materialCardView, materialButton2, textView4);
                            }
                        }
                    } else {
                        i = i4;
                    }
                } else {
                    i = i4;
                }
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
            case 14:
                LayoutInflater layoutInflaterFrom4 = LayoutInflater.from(((sab) obj).getContext());
                layoutInflaterFrom4.getClass();
                sab sabVar = (sab) obj2;
                layoutInflaterFrom4.inflate(R.layout.view_base_cell, sabVar);
                ImageView imageView = (ImageView) yum0.f(sabVar, R.id.cellImageBackground);
                if (imageView != null) {
                    return new wfu0(sabVar, imageView);
                }
                hny.u("Missing required view with ID: ".concat(sabVar.getResources().getResourceName(R.id.cellImageBackground)));
                return null;
            case 15:
                LayoutInflater layoutInflaterFrom5 = LayoutInflater.from(((ChipView) obj).getContext());
                layoutInflaterFrom5.getClass();
                ChipView chipView = (ChipView) obj2;
                View viewInflate2 = layoutInflaterFrom5.inflate(R.layout.view_chip_xgames, (ViewGroup) chipView, false);
                chipView.addView(viewInflate2);
                int i5 = R.id.chip_image;
                ImageView imageView2 = (ImageView) yum0.f(viewInflate2, R.id.chip_image);
                if (imageView2 != null) {
                    FrameLayout frameLayout = (FrameLayout) viewInflate2;
                    TextView textView5 = (TextView) yum0.f(viewInflate2, R.id.chip_name);
                    if (textView5 != null) {
                        return new dgu0(frameLayout, imageView2, frameLayout, textView5);
                    }
                    i5 = R.id.chip_name;
                }
                hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i5)));
                return null;
            case 16:
                e1q0 e1q0Var = (e1q0) obj2;
                e1q0Var.getClass();
                ((Function1) obj).invoke(new yec(e1q0Var));
                return Unit.f46060a;
            case 17:
                oic oicVar = (oic) obj;
                yk5 yk5Var = oic.l2;
                String str = oicVar.P0().f47099a;
                Bundle bundle = new Bundle();
                bundle.putString("RESULT_ON_CHOSE_FILTER_LISTENER_KEY", ((ChoseFilterUiModel) obj2).b);
                vcc.f0(bundle, oicVar, str);
                if (!oicVar.R()) {
                    oicVar.y0();
                }
                return Unit.f46060a;
            case 18:
                LayoutInflater layoutInflaterFrom6 = LayoutInflater.from(((CircleBorderImageView) obj).getContext());
                layoutInflaterFrom6.getClass();
                CircleBorderImageView circleBorderImageView = (CircleBorderImageView) obj2;
                layoutInflaterFrom6.inflate(R.layout.image_view_circle_border, circleBorderImageView);
                int i6 = R.id.external_circle;
                View viewF2 = yum0.f(circleBorderImageView, R.id.external_circle);
                if (viewF2 != null) {
                    i6 = R.id.image;
                    ImageView imageView3 = (ImageView) yum0.f(circleBorderImageView, R.id.image);
                    if (imageView3 != null) {
                        i6 = R.id.internal_circle;
                        View viewF3 = yum0.f(circleBorderImageView, R.id.internal_circle);
                        if (viewF3 != null) {
                            return new v2x(circleBorderImageView, viewF2, imageView3, viewF3);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(circleBorderImageView.getResources().getResourceName(i6)));
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i7 = esc.m2;
                ((k3t0) ((esc) obj).l2.getValue()).x(new dsc(((csc) obj2).f4881a));
                return Unit.f46060a;
            case 20:
                LayoutInflater layoutInflaterFrom7 = LayoutInflater.from(((b0d) obj).getContext());
                layoutInflaterFrom7.getClass();
                b0d b0dVar = (b0d) obj2;
                layoutInflaterFrom7.inflate(R.layout.view_base_coefficient_cell, b0dVar);
                AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(b0dVar, R.id.coefficientCellText);
                if (appCompatTextView != null) {
                    return new xfu0(b0dVar, appCompatTextView);
                }
                hny.u("Missing required view with ID: ".concat(b0dVar.getResources().getResourceName(R.id.coefficientCellText)));
                return null;
            case 21:
                riu0 riu0Var3 = (riu0) ((a8z) obj2).getValue();
                wmvVar = riu0Var3 instanceof wmv ? (wmv) riu0Var3 : null;
                return (wmvVar == null || (miu0VarN3 = wmvVar.n()) == null) ? ((dbe) obj).n() : miu0VarN3;
            case 22:
                LayoutInflater layoutInflaterFrom8 = LayoutInflater.from(((ContactsWebView) obj).getContext());
                layoutInflaterFrom8.getClass();
                ContactsWebView contactsWebView = (ContactsWebView) obj2;
                View viewInflate3 = layoutInflaterFrom8.inflate(R.layout.contacts_webview, (ViewGroup) contactsWebView, false);
                contactsWebView.addView(viewInflate3);
                FrameLayout frameLayout2 = (FrameLayout) viewInflate3;
                FixedWebView fixedWebView = (FixedWebView) yum0.f(viewInflate3, R.id.webView);
                if (fixedWebView != null) {
                    return new rce(frameLayout2, fixedWebView);
                }
                hny.u("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(R.id.webView)));
                return null;
            case 23:
                f7u f7uVar = (f7u) obj;
                g93 annotations = ((vlc) obj2).getAnnotations();
                f7uVar.getClass();
                annotations.getClass();
                return u0.b((a93) ((v7i) f7uVar.b).l, (jay) ((a8z) f7uVar.d).getValue(), annotations);
            case 24:
                f7u f7uVar2 = (f7u) obj;
                g93 g93Var = (g93) obj2;
                f7uVar2.getClass();
                g93Var.getClass();
                return u0.b((a93) ((v7i) f7uVar2.b).l, (jay) ((a8z) f7uVar2.d).getValue(), g93Var);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fqy fqyVar = (fqy) obj;
                ClassLoader classLoader = (ClassLoader) obj2;
                fqyVar.getClass();
                ArrayList arrayList2 = j0x.w(fqyVar).b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    swq swqVarA = jwb.V(((voy) obj3).f37787a).a();
                    swq swqVar = cey.f4235a;
                    swqVarA.getClass();
                    if (!swqVarA.equals(bey.q) && !swqVarA.b().equals(e4m0.f)) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(jwb.S((voy) it2.next(), classLoader));
                }
                return arrayList4;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) obj).invoke((pi90) obj2);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                riu0 riu0Var4 = (riu0) ((a8z) obj2).getValue();
                wmvVar = riu0Var4 instanceof wmv ? (wmv) riu0Var4 : null;
                return (wmvVar == null || (miu0VarN4 = wmvVar.n()) == null) ? ((bqe) obj).n() : miu0VarN4;
            default:
                LayoutInflater layoutInflaterFrom9 = LayoutInflater.from(((CrystalFieldInfoView) obj).getContext());
                layoutInflaterFrom9.getClass();
                CrystalFieldInfoView crystalFieldInfoView = (CrystalFieldInfoView) obj2;
                layoutInflaterFrom9.inflate(R.layout.cyber_crystal_field_info_view, crystalFieldInfoView);
                int i8 = R.id.guideline1;
                if (((Guideline) yum0.f(crystalFieldInfoView, R.id.guideline1)) != null) {
                    i8 = R.id.guideline2;
                    if (((Guideline) yum0.f(crystalFieldInfoView, R.id.guideline2)) != null) {
                        i8 = R.id.guideline3;
                        if (((Guideline) yum0.f(crystalFieldInfoView, R.id.guideline3)) != null) {
                            i8 = R.id.ivFirstPlayerFirstCrystal;
                            ImageView imageView4 = (ImageView) yum0.f(crystalFieldInfoView, R.id.ivFirstPlayerFirstCrystal);
                            if (imageView4 != null) {
                                i8 = R.id.ivFirstPlayerSecondCrystal;
                                ImageView imageView5 = (ImageView) yum0.f(crystalFieldInfoView, R.id.ivFirstPlayerSecondCrystal);
                                if (imageView5 != null) {
                                    i8 = R.id.ivFirstPlayerThirdCrystal;
                                    ImageView imageView6 = (ImageView) yum0.f(crystalFieldInfoView, R.id.ivFirstPlayerThirdCrystal);
                                    if (imageView6 != null) {
                                        i8 = R.id.ivFirstRoundClock;
                                        ImageView imageView7 = (ImageView) yum0.f(crystalFieldInfoView, R.id.ivFirstRoundClock);
                                        if (imageView7 != null) {
                                            i8 = R.id.ivSecondPlayerFirstCrystal;
                                            ImageView imageView8 = (ImageView) yum0.f(crystalFieldInfoView, R.id.ivSecondPlayerFirstCrystal);
                                            if (imageView8 != null) {
                                                i8 = R.id.ivSecondPlayerSecondCrystal;
                                                ImageView imageView9 = (ImageView) yum0.f(crystalFieldInfoView, R.id.ivSecondPlayerSecondCrystal);
                                                if (imageView9 != null) {
                                                    i8 = R.id.ivSecondPlayerThirdCrystal;
                                                    ImageView imageView10 = (ImageView) yum0.f(crystalFieldInfoView, R.id.ivSecondPlayerThirdCrystal);
                                                    if (imageView10 != null) {
                                                        i8 = R.id.ivSecondRoundClock;
                                                        ImageView imageView11 = (ImageView) yum0.f(crystalFieldInfoView, R.id.ivSecondRoundClock);
                                                        if (imageView11 != null) {
                                                            i8 = R.id.tvFirstPlayerFirstRound;
                                                            TextView textView6 = (TextView) yum0.f(crystalFieldInfoView, R.id.tvFirstPlayerFirstRound);
                                                            if (textView6 != null) {
                                                                i8 = R.id.tvFirstPlayerName;
                                                                TextView textView7 = (TextView) yum0.f(crystalFieldInfoView, R.id.tvFirstPlayerName);
                                                                if (textView7 != null) {
                                                                    i8 = R.id.tvFirstPlayerResult;
                                                                    TextView textView8 = (TextView) yum0.f(crystalFieldInfoView, R.id.tvFirstPlayerResult);
                                                                    if (textView8 != null) {
                                                                        i8 = R.id.tvFirstPlayerSecondRound;
                                                                        TextView textView9 = (TextView) yum0.f(crystalFieldInfoView, R.id.tvFirstPlayerSecondRound);
                                                                        if (textView9 != null) {
                                                                            i8 = R.id.tvFirstRound;
                                                                            if (((TextView) yum0.f(crystalFieldInfoView, R.id.tvFirstRound)) != null) {
                                                                                i8 = R.id.tvResult;
                                                                                if (((TextView) yum0.f(crystalFieldInfoView, R.id.tvResult)) != null) {
                                                                                    i8 = R.id.tvSecondPlayerFirstRound;
                                                                                    TextView textView10 = (TextView) yum0.f(crystalFieldInfoView, R.id.tvSecondPlayerFirstRound);
                                                                                    if (textView10 != null) {
                                                                                        i8 = R.id.tvSecondPlayerName;
                                                                                        TextView textView11 = (TextView) yum0.f(crystalFieldInfoView, R.id.tvSecondPlayerName);
                                                                                        if (textView11 != null) {
                                                                                            i8 = R.id.tvSecondPlayerResult;
                                                                                            TextView textView12 = (TextView) yum0.f(crystalFieldInfoView, R.id.tvSecondPlayerResult);
                                                                                            if (textView12 != null) {
                                                                                                i8 = R.id.tvSecondPlayerSecondRound;
                                                                                                TextView textView13 = (TextView) yum0.f(crystalFieldInfoView, R.id.tvSecondPlayerSecondRound);
                                                                                                if (textView13 != null) {
                                                                                                    i8 = R.id.tvSecondRound;
                                                                                                    if (((TextView) yum0.f(crystalFieldInfoView, R.id.tvSecondRound)) != null) {
                                                                                                        return new okg(crystalFieldInfoView, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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
                hny.u("Missing required view with ID: ".concat(crystalFieldInfoView.getResources().getResourceName(i8)));
                return null;
        }
    }

    public /* synthetic */ h5(Object obj, Object obj2, byte b) {
        this.f12457a = b;
        this.b = obj;
        this.c = obj2;
    }
}
