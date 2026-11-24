package org.xplatform.cyber.game.universal.impl.presentation.durak.view;

import a.akc;
import a.fd5;
import a.fng;
import a.hah;
import a.hxm0;
import a.iah;
import a.iun;
import a.p1o0;
import a.twn;
import a.una0;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CyberPlayerCardsView extends FrameLayout {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46531a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public List n;

    /* JADX WARN: Illegal instructions before constructor call */
    public CyberPlayerCardsView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46531a = context.getResources().getDimensionPixelSize(R.dimen.size_134);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.size_28);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.size_38);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.size_14);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.size_18);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.space_1);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.space_6);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.j = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.k = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.l = new LinkedHashMap();
        this.m = new ArrayList();
        this.n = iun.f15405a;
    }

    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: android.widget.FrameLayout
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: android.widget.FrameLayout
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v11 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v12 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: java.lang.Number
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v11 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v13 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v12 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: android.view.View
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void a(java.util.List r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayerCardsView.a(java.util.List, boolean):void");
    }

    public final void b(hah hahVar, ArrayList arrayList, boolean z) {
        float width;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        int x = 0;
        if (hahVar != hah.c) {
            p1o0 p1o0Var = (p1o0) CollectionsKt.firstOrNull(arrayList);
            int x2 = (p1o0Var == null || (frameLayout2 = p1o0Var.f26214a) == null) ? 0 : (int) frameLayout2.getX();
            p1o0 p1o0Var2 = (p1o0) CollectionsKt.f0(arrayList);
            if (p1o0Var2 != null && (frameLayout = p1o0Var2.f26214a) != null) {
                x = (int) frameLayout.getX();
            }
            width = (this.f46531a - ((x + this.c) - x2)) / 2;
        } else if (z) {
            Iterator it = CollectionsKt.D0(arrayList, (arrayList.size() % 2) + (arrayList.size() / 2)).iterator();
            while (it.hasNext()) {
                x += ((p1o0) it.next()).f26214a.getWidth();
            }
            width = (getWidth() - x) - this.j;
        } else {
            width = 0.0f;
        }
        setX(width);
    }

    public final void c(List list, ArrayList arrayList, boolean z) {
        ValueAnimator valueAnimatorOfFloat;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        ArrayList arrayListU = twn.u(list);
        LinkedHashMap linkedHashMap = this.l;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (((Number) entry.getKey()).intValue() != ((una0) it.next()).f35951a);
            }
            arrayListU.add(entry.getKey());
        }
        if (arrayListU.isEmpty()) {
            a(list, z);
        } else {
            Set setP0 = CollectionsKt.P0(CollectionsKt.q0(this.n, list));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayListU) {
                int iIntValue = ((Number) obj).intValue();
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        fng fngVar = (fng) it2.next();
                        if (fngVar.b == iIntValue || fngVar.f9835a == iIntValue) {
                            arrayList2.add(obj);
                            break;
                        }
                    }
                }
            }
            Set set = setP0;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : set) {
                int i = ((una0) obj2).f35951a;
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((una0) it3.next()).f35951a == i) {
                            }
                        }
                    }
                }
                if (!arrayList2.contains(Integer.valueOf(i))) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                int i2 = ((una0) it4.next()).f35951a;
                p1o0 p1o0Var = (p1o0) linkedHashMap.get(Integer.valueOf(i2));
                if (p1o0Var != null && (frameLayout2 = p1o0Var.f26214a) != null) {
                    hxm0.v(frameLayout2);
                }
                linkedHashMap.remove(Integer.valueOf(i2));
            }
            a(CollectionsKt.n0(CollectionsKt.L0(set), CollectionsKt.P0(arrayList3)), z);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList2) {
                int iIntValue2 = ((Number) obj3).intValue();
                if (!arrayList.isEmpty()) {
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        fng fngVar2 = (fng) it5.next();
                        if (fngVar2.b == iIntValue2 || fngVar2.f9835a == iIntValue2) {
                            arrayList4.add(obj3);
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                p1o0 p1o0Var2 = (p1o0) linkedHashMap.get(Integer.valueOf(((Number) it6.next()).intValue()));
                if (p1o0Var2 == null || (frameLayout = p1o0Var2.f26214a) == null) {
                    valueAnimatorOfFloat = null;
                } else {
                    valueAnimatorOfFloat = ValueAnimator.ofFloat(frameLayout.getY(), (float) (((double) frameLayout.getY()) - (((double) frameLayout.getHeight()) * 0.2d)));
                    valueAnimatorOfFloat.addUpdateListener(new fd5(frameLayout, (byte) 7));
                    valueAnimatorOfFloat.setDuration(1000L);
                }
                if (valueAnimatorOfFloat != null) {
                    arrayList5.add(valueAnimatorOfFloat);
                }
            }
            if (!arrayList5.isEmpty()) {
                animatorSet.addListener(new akc(arrayList2, this, (byte) 3));
                animatorSet.addListener(new iah(arrayList2, this, list, z));
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(2000L);
                animatorSet.playTogether(CollectionsKt.r0(arrayList5, valueAnimatorOfFloat2));
                animatorSet.start();
            }
        }
        this.n = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberPlayerCardsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberPlayerCardsView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
