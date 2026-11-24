package org.xplatform.crystal.presentation.views;

import a.aif;
import a.azw;
import a.bif;
import a.bkx;
import a.cff;
import a.dhf;
import a.e1e0;
import a.f1e0;
import a.fd5;
import a.jf4;
import a.jwd;
import a.kkx;
import a.l1e0;
import a.mr0;
import a.ohf;
import a.q3d;
import a.qo8;
import a.r3d;
import a.s7n0;
import a.sef;
import a.sre0;
import a.uef;
import a.unh0;
import a.vef;
import a.w3d;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CrystalFieldView extends FrameLayout {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public aif f46475a;
    public final byte b;
    public final ArrayList c;
    public final LinkedHashMap d;
    public int e;
    public int f;
    public qo8 g;
    public AnimatorSet h;
    public ValueAnimator i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrystalFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.b = (byte) 7;
        this.c = new ArrayList();
        this.d = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            ArrayList arrayList2 = new ArrayList(7);
            for (int i2 = 0; i2 < 7; i2++) {
                Enum[] enumArr = (Enum[]) azw.G(sre0.f32672a.b(ohf.class)).getEnumConstants();
                if (enumArr == null) {
                    jf4.o("Enum random values == null");
                    throw null;
                }
                e1e0 e1e0Var = f1e0.f8761a;
                int length = enumArr.length;
                e1e0Var.getClass();
                Enum r4 = enumArr[f1e0.b.f(length)];
                r4.getClass();
                arrayList2.add((ohf) r4);
            }
            arrayList.add(arrayList2);
        }
        setupPreviewField(arrayList);
    }

    public static final Unit d(CrystalFieldView crystalFieldView, LinkedHashMap linkedHashMap) {
        crystalFieldView.setupShiftAnimator(linkedHashMap);
        AnimatorSet animatorSet = crystalFieldView.h;
        if (animatorSet != null) {
            animatorSet.start();
        }
        return Unit.f46060a;
    }

    public static final Unit e(CrystalFieldView crystalFieldView) {
        qo8 qo8Var = crystalFieldView.g;
        if (qo8Var != null) {
            List list = (List) qo8Var.d;
            if (qo8Var.b + 1 < q3d.i(list)) {
                int i = qo8Var.b + 1;
                qo8Var.b = i;
                crystalFieldView.setupRound((dhf) list.get(i));
            } else {
                aif aifVar = crystalFieldView.f46475a;
                if (aifVar != null) {
                    ((cff) aifVar).H0();
                }
            }
        }
        return Unit.f46060a;
    }

    private final void setupCrystals(List<? extends List<? extends ohf>> list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            int i3 = 0;
            for (Object obj2 : (List) obj) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                Context context = getContext();
                context.getClass();
                sef sefVar = new sef(context, (ohf) obj2);
                sefVar.setX(i3);
                sefVar.setY(i);
                sefVar.setAlpha(0.0f);
                addView(sefVar);
                this.c.add(sefVar);
                i3 = i4;
            }
            i = i2;
        }
    }

    private final void setupNewCrystals(Map<Integer, ? extends List<? extends ohf>> map) {
        for (Map.Entry<Integer, ? extends List<? extends ohf>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            List<? extends ohf> value = entry.getValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            ArrayList arrayList = new ArrayList(r3d.q(value, 10));
            int i = 0;
            for (Object obj : value) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                Context context = getContext();
                context.getClass();
                sef sefVar = new sef(context, (ohf) obj);
                sefVar.setX(iIntValue);
                sefVar.setY(-i2);
                addView(sefVar);
                arrayList.add(sefVar);
                i = i2;
            }
            this.d.put(numValueOf, arrayList);
        }
    }

    private final void setupPreviewField(List<? extends List<? extends ohf>> list) {
        setupCrystals(list);
        c();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0190 A[EDGE_INSN: B:108:0x0190->B:62:0x0190 BREAK  A[LOOP:10: B:52:0x0165->B:60:0x0188], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x016b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0179  */
    /* JADX WARN: Code duplicated, block: B:59:0x0186  */
    /* JADX WARN: Code duplicated, block: B:65:0x0196 A[LOOP:8: B:41:0x0140->B:65:0x0196, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x01b1 A[EDGE_INSN: B:98:0x01b1->B:68:0x01b1 BREAK  A[LOOP:8: B:41:0x0140->B:65:0x0196], SYNTHETIC] */
    private final void setupRound(dhf dhfVar) {
        Set set;
        Iterator it;
        Object next;
        sef sefVar;
        sef sefVar2;
        int x;
        ArrayList<sef> arrayList = this.c;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.d;
        linkedHashMap.clear();
        removeAllViews();
        setupCrystals(dhfVar.f6087a);
        setupNewCrystals(dhfVar.c);
        List list = dhfVar.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ArrayList<Pair> arrayList3 = ((bif) it2.next()).d;
            ArrayList arrayList4 = new ArrayList();
            for (Pair pair : arrayList3) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj : arrayList) {
                    sef sefVar3 = (sef) obj;
                    if (Intrinsics.d(pair, new Pair(Integer.valueOf(sefVar3.getX()), Integer.valueOf(sefVar3.getY())))) {
                        arrayList5.add(obj);
                    }
                }
                w3d.u(arrayList4, arrayList5);
            }
            w3d.u(arrayList2, arrayList4);
        }
        Set setP0 = CollectionsKt.P0(arrayList2);
        ArrayList arrayList6 = new ArrayList();
        arrayList6.addAll(setP0);
        ArrayList arrayList7 = new ArrayList();
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (it3.hasNext()) {
            w3d.u(arrayList7, (List) ((Map.Entry) it3.next()).getValue());
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(arrayList, arrayList7);
        Set set2 = setP0;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        byte b = this.b;
        boolean z = false;
        Iterator it4 = l1e0.i(b - 1, 0).iterator();
        while (((kkx) it4).c) {
            int iNextInt = ((bkx) it4).nextInt();
            ArrayList<sef> arrayList8 = new ArrayList();
            for (Object obj2 : arrayList6) {
                if (((sef) obj2).getY() == iNextInt) {
                    arrayList8.add(obj2);
                }
            }
            for (sef sefVar4 : arrayList8) {
                ArrayList arrayList9 = new ArrayList();
                for (Object obj3 : arrayList6) {
                    boolean z2 = z;
                    if (((sef) obj3).getX() == sefVar4.getX()) {
                        arrayList9.add(obj3);
                    }
                    z = z2;
                }
                boolean z3 = z;
                int y = sefVar4.getY();
                int i = -b;
                if (i <= y) {
                    while (true) {
                        if (!arrayList9.isEmpty()) {
                            Iterator it5 = arrayList9.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    it = arrayListQ0.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            set = set2;
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        sefVar2 = (sef) next;
                                        if (sefVar2.getY() == y) {
                                            x = sefVar2.getX();
                                            set = set2;
                                            if (x == sefVar4.getX()) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            set = set2;
                                        }
                                        set2 = set;
                                    }
                                    sefVar = (sef) next;
                                    if (sefVar == null) {
                                        linkedHashMap2.put(sefVar, Integer.valueOf(sefVar4.getY()));
                                        arrayList6.add(sefVar);
                                        arrayList6.remove(sefVar4);
                                        break;
                                        break;
                                    }
                                } else if (((sef) it5.next()).getY() == y) {
                                    set = set2;
                                }
                                if (y != i) {
                                    break;
                                    break;
                                } else {
                                    y--;
                                    set2 = set;
                                }
                            }
                        } else {
                            it = arrayListQ0.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    set = set2;
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                sefVar2 = (sef) next;
                                if (sefVar2.getY() == y) {
                                    x = sefVar2.getX();
                                    set = set2;
                                    if (x == sefVar4.getX()) {
                                        break;
                                    }
                                } else {
                                    set = set2;
                                }
                                set2 = set;
                            }
                            sefVar = (sef) next;
                            if (sefVar == null) {
                                linkedHashMap2.put(sefVar, Integer.valueOf(sefVar4.getY()));
                                arrayList6.add(sefVar);
                                arrayList6.remove(sefVar4);
                                break;
                            } else {
                                if (y != i) {
                                    break;
                                }
                                y--;
                                set2 = set;
                            }
                        }
                    }
                } else {
                    set = set2;
                }
                z = z3;
                set2 = set;
            }
        }
        Set set3 = set2;
        boolean z4 = z;
        qo8 qo8Var = this.g;
        if (qo8Var == null || qo8Var.b != 0) {
            c();
            f(dhfVar, set3, linkedHashMap2);
            return;
        }
        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList, 10));
        for (sef sefVar5 : arrayList) {
            sefVar5.setAlpha(1.0f);
            float[] fArr = new float[2];
            fArr[z4 ? 1 : 0] = -this.f;
            fArr[1] = 0.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            valueAnimatorOfFloat.addUpdateListener(new uef(sefVar5, (byte) 1));
            valueAnimatorOfFloat.setDuration((((long) (b - sefVar5.getX())) * 100) + 300);
            arrayList10.add(valueAnimatorOfFloat);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList10);
        animatorSet.addListener(unh0.h0(s7n0.l(this), null, new mr0(this, dhfVar, set3, linkedHashMap2, (byte) 7), 11));
        this.h = animatorSet;
        animatorSet.start();
    }

    private final void setupShiftAnimator(Map<sef, Integer> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<sef, Integer> entry : map.entrySet()) {
            sef key = entry.getKey();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (entry.getValue().intValue() - key.getY()) * this.e);
            valueAnimatorOfFloat.addUpdateListener(new uef(key, (byte) 0));
            valueAnimatorOfFloat.setDuration(400L);
            arrayList.add(valueAnimatorOfFloat);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(unh0.h0(s7n0.l(this), null, new jwd(this, (byte) 17), 11));
        this.h = animatorSet;
    }

    public final void a(List list) {
        list.getClass();
        qo8 qo8Var = new qo8(list);
        this.g = qo8Var;
        setupRound((dhf) qo8Var.e);
    }

    public final void b(List list, boolean z) {
        aif aifVar;
        list.getClass();
        this.c.clear();
        this.d.clear();
        removeAllViews();
        setupCrystals(((dhf) CollectionsKt.d0(list)).f6087a);
        c();
        if (!z || (aifVar = this.f46475a) == null) {
            return;
        }
        ((cff) aifVar).H0();
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((sef) it.next()).setAlpha(1.0f);
        }
    }

    public final void f(dhf dhfVar, Set set, LinkedHashMap linkedHashMap) {
        aif aifVar = this.f46475a;
        if (aifVar != null) {
            ((cff) aifVar).G0().c.a(dhfVar.b);
        }
        qo8 qo8Var = this.g;
        if (qo8Var == null || !qo8Var.c) {
            aif aifVar2 = this.f46475a;
            if (aifVar2 != null) {
                ((cff) aifVar2).H0();
                return;
            }
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new fd5(set, (byte) 5));
        valueAnimatorOfFloat.addListener(unh0.h0(s7n0.l(this), null, new vef(this, linkedHashMap, (byte) 0), 11));
        valueAnimatorOfFloat.setRepeatCount(2);
        valueAnimatorOfFloat.setDuration(1000L);
        this.i = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = (getMeasuredWidth() - this.f) / 2;
        int measuredHeight = (getMeasuredHeight() - this.f) / 2;
        byte b = this.b;
        Iterator it = l1e0.o(0, b).iterator();
        int i5 = measuredHeight;
        int i6 = 0;
        while (((kkx) it).c) {
            ((bkx) it).nextInt();
            Iterator it2 = l1e0.o(0, b).iterator();
            int i7 = measuredWidth;
            while (((kkx) it2).c) {
                ((bkx) it2).nextInt();
                sef sefVar = (sef) this.c.get(i6);
                int i8 = this.e;
                sefVar.layout(i7, i5, i7 + i8, i8 + i5);
                i7 += this.e;
                i6++;
            }
            i5 += this.e;
        }
        ArrayList<sef> arrayList = new ArrayList();
        Iterator it3 = this.d.entrySet().iterator();
        while (it3.hasNext()) {
            w3d.u(arrayList, (List) ((Map.Entry) it3.next()).getValue());
        }
        for (sef sefVar2 : arrayList) {
            sefVar2.getClass();
            int x = (sefVar2.getX() * this.e) + measuredWidth;
            sefVar2.getClass();
            int y = (sefVar2.getY() * this.e) + measuredHeight;
            sefVar2.getClass();
            int x2 = (sefVar2.getX() * this.e) + measuredWidth + this.e;
            sefVar2.getClass();
            sefVar2.layout(x, y, x2, (sefVar2.getY() * this.e) + measuredHeight + this.e);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredWidth() > getMeasuredHeight() ? getMeasuredHeight() : getMeasuredWidth();
        this.f = measuredHeight;
        int i3 = measuredHeight / this.b;
        this.e = i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((sef) it.next()).measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        Iterator it2 = this.d.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) ((Map.Entry) it2.next()).getValue()).iterator();
            while (it3.hasNext()) {
                ((sef) it3.next()).measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
        }
    }

    public final void setUpdateInterface(aif aifVar) {
        this.f46475a = aifVar;
    }
}
