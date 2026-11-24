package a;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.timepicker.ClockHandView;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import org.xplatform.crystal.presentation.views.CrystalFieldView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.map_movement.Cs2MapMovementView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayerCardsView;
import org.xplatform.cyber.section.impl.championships.regular.presentation.world_cup.tournament_info.ExpandableTextView;
import org.xplatform.domino.presentation.views.DominoTableView;
import org.xplatform.eastern_nights.presentation.views.EasternNightsGameView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoTabsContainerView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.segmented_control.DsSegmentItem;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fd5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9342a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fd5(Object obj, byte b) {
        this.f9342a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0258 A[LOOP:3: B:69:0x0252->B:71:0x0258, LOOP_END] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ArrayList arrayList;
        byte b = this.f9342a;
        Object obj = this.b;
        switch (b) {
            case 0:
                valueAnimator.getClass();
                ((gd5) obj).invalidate();
                break;
            case 1:
                ((y89) obj).l.setAlpha(((Float) w6x.m(valueAnimator)).floatValue());
                break;
            case 2:
                valueAnimator.getClass();
                ((a99) obj).invalidate();
                break;
            case 3:
                int i = ClockHandView.n;
                ((ClockHandView) obj).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                float fFloatValue = ((Float) w6x.m(valueAnimator)).floatValue();
                AppCompatImageView appCompatImageView = ((x4d) obj).j;
                appCompatImageView.setScaleX(fFloatValue);
                appCompatImageView.setScaleY(fFloatValue);
                appCompatImageView.setAlpha(fFloatValue);
                break;
            case 5:
                int i2 = CrystalFieldView.j;
                valueAnimator.getClass();
                for (sef sefVar : (Set) obj) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    animatedValue.getClass();
                    sefVar.setAlpha(((Float) animatedValue).floatValue());
                }
                break;
            case 6:
                LinkedHashMap linkedHashMap = Cs2MapMovementView.A;
                valueAnimator.getClass();
                ImageView imageView = ((Cs2MapMovementView) obj).s;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                imageView.setAlpha(((Float) animatedValue2).floatValue());
                break;
            case 7:
                int i3 = CyberPlayerCardsView.o;
                ((FrameLayout) obj).setY(((Float) w6x.m(valueAnimator)).floatValue());
                break;
            case 8:
                zxj zxjVar = (zxj) obj;
                zxjVar.i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zxjVar.invalidate(zxjVar.f45161a);
                break;
            case 9:
                hgk hgkVar = (hgk) obj;
                hgkVar.p.e = hgkVar.u.getInterpolation(hgkVar.t.getAnimatedFraction());
                break;
            case 10:
                DominoTableView dominoTableView = (DominoTableView) obj;
                int i4 = DominoTableView.r;
                dominoTableView.m = ((Float) w6x.m(valueAnimator)).floatValue();
                dominoTableView.invalidate();
                break;
            case 11:
                ((til) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                rvl rvlVar = (rvl) obj;
                valueAnimator.getClass();
                List list = rvl.z;
                if (list.size() > 1) {
                    ArrayList<Pair> arrayList2 = new ArrayList();
                    Object animatedValue3 = valueAnimator.getAnimatedValue();
                    animatedValue3.getClass();
                    float fFloatValue2 = ((Float) animatedValue3).floatValue();
                    float f = fFloatValue2 / rvlVar.t;
                    int iCeil = fFloatValue2 > 0.0f ? (int) Math.ceil(f) : 1;
                    float f2 = (f - iCeil) + 1.0f;
                    arrayList2.add(list.get(0));
                    arrayList2.add(list.get(1));
                    for (int i5 = 1; i5 < iCeil; i5++) {
                        if (iCeil >= list.size()) {
                            arrayList2.clear();
                            arrayList2.addAll(list);
                            arrayList = new ArrayList(r3d.q(arrayList2, 10));
                            for (Pair pair : arrayList2) {
                                arrayList.add(new Pair(Float.valueOf(((Number) pair.f46059a).floatValue() * rvlVar.u), Float.valueOf(((Number) pair.b).floatValue() * rvlVar.u)));
                            }
                            rvlVar.h(arrayList);
                            rvlVar.f31174a.invalidate();
                        } else {
                            if (i5 == iCeil - 1) {
                                Pair pair2 = (Pair) list.get(i5);
                                Pair pair3 = (Pair) list.get(i5 + 1);
                                Object obj2 = pair2.f46059a;
                                Object obj3 = pair2.b;
                                Number number = (Number) obj2;
                                float fFloatValue3 = number.floatValue();
                                Object obj4 = pair3.f46059a;
                                Number number2 = (Number) obj3;
                                Number number3 = (Number) pair3.b;
                                arrayList2.add(new Pair(Float.valueOf(number.floatValue() + (Math.abs(number.floatValue() - ((Number) pair3.f46059a).floatValue()) * (fFloatValue3 > ((Number) obj4).floatValue() ? -1 : 1) * f2)), Float.valueOf(number2.floatValue() + (Math.abs(number2.floatValue() - number3.floatValue()) * (number2.floatValue() <= number3.floatValue() ? 1 : -1) * f2))));
                            } else {
                                arrayList2.add(list.get(i5 + 1));
                            }
                        }
                        break;
                    }
                    arrayList = new ArrayList(r3d.q(arrayList2, 10));
                    while (r0.hasNext()) {
                        arrayList.add(new Pair(Float.valueOf(((Number) pair.f46059a).floatValue() * rvlVar.u), Float.valueOf(((Number) pair.b).floatValue() * rvlVar.u)));
                    }
                    rvlVar.h(arrayList);
                    rvlVar.f31174a.invalidate();
                    break;
                }
                break;
            case 13:
                ((qvl) obj).invoke((Float) w6x.m(valueAnimator));
                break;
            case 14:
                ((pvl) obj).invoke((Float) w6x.m(valueAnimator));
                break;
            case 15:
                ((qvl) obj).invoke((Float) w6x.m(valueAnimator));
                break;
            case 16:
                int i6 = DsSegmentItem.q;
                valueAnimator.getClass();
                ((DsSegmentItem) obj).invalidate();
                break;
            case 17:
                EasternNightsGameView easternNightsGameView = (EasternNightsGameView) obj;
                int i7 = EasternNightsGameView.u;
                valueAnimator.getClass();
                int i8 = easternNightsGameView.m;
                for (int i9 = 0; i9 < i8; i9++) {
                    Object obj5 = easternNightsGameView.i.get(i9);
                    obj5.getClass();
                    for (sab sabVar : (Iterable) obj5) {
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        sabVar.setTranslationY(((Float) animatedValue4).floatValue());
                    }
                    b0d b0dVar = (b0d) easternNightsGameView.j.get(i9);
                    Object animatedValue5 = valueAnimator.getAnimatedValue();
                    animatedValue5.getClass();
                    b0dVar.setTranslationY(((Float) animatedValue5).floatValue());
                }
                break;
            case 18:
                int i10 = ExpandableTextView.j;
                ((ExpandableTextView) obj).setHeight(((Integer) w6x.m(valueAnimator)).intValue());
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                bb10 bb10Var = (bb10) obj;
                m04 m04Var = bb10Var.m1;
                if (m04Var == null) {
                    m04Var = m04.f20935a;
                }
                if (m04Var == m04.b) {
                    bb10Var.invalidateSelf();
                } else {
                    uld uldVar = bb10Var.o;
                    if (uldVar != null) {
                        uldVar.r(bb10Var.b.a());
                    }
                }
                break;
            case 20:
                int i11 = MakeBetBalanceViewDs.t;
                float fFloatValue4 = ((Float) w6x.m(valueAnimator)).floatValue();
                vd7 vd7Var = ((MakeBetBalanceViewDs) obj).r;
                ((DsButton) vd7Var.c).setScaleX(fFloatValue4);
                ((DsButton) vd7Var.c).setScaleY(fFloatValue4);
                break;
            case 21:
                fb30 fb30Var = (fb30) obj;
                float fFloatValue5 = ((Float) w6x.m(valueAnimator)).floatValue();
                MatchInfoTabsContainerView matchInfoTabsContainerView = fb30Var.f9238a;
                ViewGroup.LayoutParams layoutParams = matchInfoTabsContainerView.getLayoutParams();
                layoutParams.height = (int) (fb30Var.b * fFloatValue5);
                matchInfoTabsContainerView.setLayoutParams(layoutParams);
                matchInfoTabsContainerView.setAlpha(fFloatValue5);
                break;
            case 22:
                fi30 fi30Var = (fi30) obj;
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fi30Var.k.setAlpha((int) (255.0f * fFloatValue6));
                fi30Var.y = fFloatValue6;
                break;
            case 23:
                l8x.U("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((q7h0) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                zdq0 zdq0Var = (zdq0) obj;
                zdq0Var.setScaleX(((Float) w6x.m(valueAnimator)).floatValue());
                Object animatedValue6 = valueAnimator.getAnimatedValue();
                animatedValue6.getClass();
                zdq0Var.setScaleY(((Float) animatedValue6).floatValue());
                break;
        }
    }
}
