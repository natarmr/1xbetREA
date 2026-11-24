package a;

import android.animation.AnimatorSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.lottery.presentation.views.LotteryView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class q810 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ r810 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q810(r810 r810Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = r810Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r810 r810Var = this.k;
        switch (b) {
            case 0:
                q810 q810Var = new q810(r810Var, yjeVar, (byte) 0);
                q810Var.j = obj;
                return q810Var;
            default:
                q810 q810Var2 = new q810(r810Var, yjeVar, (byte) 1);
                q810Var2.j = obj;
                return q810Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((q810) create((x810) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((q810) create((b910) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0219 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x021b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0248  */
    /* JADX WARN: Code duplicated, block: B:125:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x024e  */
    /* JADX WARN: Code duplicated, block: B:128:0x027e  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ii iiVar;
        byte b = this.i;
        r810 r810Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                x810 x810Var = (x810) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (x810Var != null) {
                    if (x810Var instanceof w810) {
                        iiy[] iiyVarArr = r810.P1;
                        LotteryView lotteryView = r810Var.H0().b;
                        Object[] objArr = lotteryView.f46440a;
                        n910 n910Var = lotteryView.f;
                        n910 n910Var2 = n910.b;
                        if (n910Var != n910Var2) {
                            AnimatorSet animatorSet = lotteryView.d;
                            if (animatorSet != null && animatorSet.isRunning()) {
                                animatorSet.cancel();
                            }
                            lotteryView.f = n910Var2;
                            ArrayList<Object> arrayList = new ArrayList();
                            for (Object obj3 : objArr) {
                                if (obj3 != lotteryView.b) {
                                    arrayList.add(obj3);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                            for (Object obj4 : arrayList) {
                                obj4.getClass();
                                arrayList2.add((View) obj4);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj5 : arrayList2) {
                                View view = (View) obj5;
                                if (view.getVisibility() == 4 && view != lotteryView.b) {
                                    arrayList3.add(obj5);
                                }
                            }
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                ((View) it.next()).setVisibility(0);
                            }
                            sdq0 sdq0Var = lotteryView.b;
                            if (sdq0Var == null || sdq0Var.g()) {
                                int i = lotteryView.c + 1;
                                lotteryView.c = i;
                                sdq0 sdq0Var2 = lotteryView.b;
                                if (i == 8) {
                                    if (sdq0Var2 != null) {
                                        sdq0Var2.reset();
                                    }
                                    lotteryView.b = null;
                                    lotteryView.c = 0;
                                    for (Object obj6 : objArr) {
                                        obj6.getClass();
                                        ((View) obj6).setVisibility(0);
                                    }
                                    for (int i2 = 0; i2 < 8; i2++) {
                                        Object obj7 = objArr[i2];
                                        obj7.getClass();
                                        View view2 = (View) obj7;
                                        if (view2 != lotteryView.b) {
                                            lotteryView.a(view2, i2);
                                        }
                                    }
                                } else if (sdq0Var2 != null && sdq0Var2.g()) {
                                    Object obj8 = lotteryView.b;
                                    obj8.getClass();
                                    ((View) obj8).setVisibility(8);
                                }
                            } else {
                                sdq0 sdq0Var3 = lotteryView.b;
                                if (sdq0Var3 != null) {
                                    sdq0Var3.reset();
                                }
                                for (int i3 = 0; i3 < 8; i3++) {
                                    Object obj9 = lotteryView.b;
                                    if (obj9 == objArr[i3]) {
                                        obj9.getClass();
                                        lotteryView.a((View) obj9, i3);
                                        lotteryView.b = null;
                                    }
                                }
                            }
                            sdq0 sdq0Var4 = lotteryView.b;
                            if (sdq0Var4 != null) {
                                sdq0Var4.reset();
                            }
                            lotteryView.b = null;
                            ArrayList<sdq0> arrayList4 = new ArrayList();
                            for (Object obj10 : objArr) {
                                if (obj10 != lotteryView.b) {
                                    arrayList4.add(obj10);
                                }
                            }
                            for (sdq0 sdq0Var5 : arrayList4) {
                                if (sdq0Var5 != null) {
                                    sdq0Var5.b();
                                }
                            }
                        }
                    } else if (x810Var instanceof u810) {
                        boolean z2 = ((u810) x810Var).f35214a;
                        iiy[] iiyVarArr2 = r810.P1;
                        r810Var.G0(z2);
                    } else if (x810Var instanceof v810) {
                        iiy[] iiyVarArr3 = r810.P1;
                        sdq0 sdq0Var6 = r810Var.H0().b.b;
                        if (sdq0Var6 != null ? sdq0Var6.g() : true) {
                            sdq0[] sdq0VarArr = r810Var.H0().b.f46440a;
                            int length = sdq0VarArr.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    i1w0 i1w0Var = r810Var.I0().h;
                                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                                    while (true) {
                                        paw pawVar = (paw) listIteratorP;
                                        if (pawVar.hasNext()) {
                                            i1w0Var.a((oe50) pawVar.next());
                                        }
                                    }
                                } else {
                                    sdq0 sdq0Var7 = sdq0VarArr[i4];
                                    if (sdq0Var7 == null || !sdq0Var7.g()) {
                                        i4++;
                                    }
                                }
                            }
                            z = r810Var.H0().b.b instanceof rdq0;
                            iiVar = r810Var.M1;
                            if (z) {
                                if (iiVar != null) {
                                    Intrinsics.h("actionDialogManager");
                                    throw null;
                                }
                                String strH = r810Var.H(R.string.game_lottery_dialog_title);
                                String strH2 = r810Var.H(R.string.scratch_off_lottery_ticket);
                                String strH3 = r810Var.H(R.string.ok_new);
                                strH3.getClass();
                                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                                androidx.fragment.app.e eVarC = r810Var.C();
                                eVarC.getClass();
                                iiVar.d(dialogFields, eVarC);
                            } else {
                                if (iiVar != null) {
                                    Intrinsics.h("actionDialogManager");
                                    throw null;
                                }
                                String strH4 = r810Var.H(R.string.game_lottery_dialog_title);
                                String strH5 = r810Var.H(R.string.scratch_off_lottery_elements);
                                String strH6 = r810Var.H(R.string.ok_new);
                                strH6.getClass();
                                DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                                androidx.fragment.app.e eVarC2 = r810Var.C();
                                eVarC2.getClass();
                                iiVar.d(dialogFields2, eVarC2);
                            }
                        } else {
                            z = r810Var.H0().b.b instanceof rdq0;
                            iiVar = r810Var.M1;
                            if (z) {
                                if (iiVar != null) {
                                    Intrinsics.h("actionDialogManager");
                                    throw null;
                                }
                                String strH7 = r810Var.H(R.string.game_lottery_dialog_title);
                                String strH8 = r810Var.H(R.string.scratch_off_lottery_ticket);
                                String strH9 = r810Var.H(R.string.ok_new);
                                strH9.getClass();
                                DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                                androidx.fragment.app.e eVarC3 = r810Var.C();
                                eVarC3.getClass();
                                iiVar.d(dialogFields3, eVarC3);
                            } else {
                                if (iiVar != null) {
                                    Intrinsics.h("actionDialogManager");
                                    throw null;
                                }
                                String strH10 = r810Var.H(R.string.game_lottery_dialog_title);
                                String strH11 = r810Var.H(R.string.scratch_off_lottery_elements);
                                String strH12 = r810Var.H(R.string.ok_new);
                                strH12.getClass();
                                DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                                androidx.fragment.app.e eVarC4 = r810Var.C();
                                eVarC4.getClass();
                                iiVar.d(dialogFields4, eVarC4);
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                b910 b910Var = (b910) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (b910Var == null) {
                    iiy[] iiyVarArr4 = r810.P1;
                    r810Var.G0(false);
                } else if (b910Var instanceof y810) {
                    gx90 gx90Var = ((y810) b910Var).f42174a;
                    iiy[] iiyVarArr5 = r810.P1;
                    LotteryView lotteryView2 = r810Var.H0().b;
                    List list = gx90Var.e;
                    t010 t010Var = new t010((byte) 22);
                    list.getClass();
                    sdq0 sdq0Var8 = lotteryView2.b;
                    if (sdq0Var8 != null) {
                        sdq0Var8.c(list, new t010(t010Var));
                    }
                } else if (b910Var instanceof a910) {
                    iiy[] iiyVarArr6 = r810.P1;
                    r810Var.G0(true);
                } else {
                    iiy[] iiyVarArr7 = r810.P1;
                    r810Var.G0(false);
                }
                return Unit.f46060a;
        }
    }
}
