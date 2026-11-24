package org.xplatform.cyber.game.universal.impl.presentation.crystal.view;

import a.akc;
import a.bgf;
import a.bkx;
import a.cgf;
import a.egf;
import a.gff;
import a.hff;
import a.iff;
import a.jff;
import a.kff;
import a.kkx;
import a.l1e0;
import a.lc0;
import a.nhf;
import a.q3d;
import a.r3d;
import a.t9f;
import a.vk8;
import a.vt5;
import a.wef;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CrystalFieldView extends FrameLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46525a;
    public final ArrayList b;
    public int c;
    public int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public CrystalFieldView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46525a = new ArrayList();
        this.b = new ArrayList();
        Iterator it = l1e0.o(0, 7).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            Iterator it2 = l1e0.o(0, 7).iterator();
            while (((kkx) it2).c) {
                int iNextInt2 = ((bkx) it2).nextInt();
                Context context2 = getContext();
                context2.getClass();
                egf egfVar = new egf(context2);
                egfVar.setCrystal(new cgf(iNextInt2, iNextInt, nhf.UNKNOWN, bgf.b));
                this.f46525a.add(egfVar);
                addView(egfVar);
            }
        }
    }

    public static void a(egf egfVar, long j, Function0 function0) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(egfVar, (Property<egf, Float>) FrameLayout.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setStartDelay(j);
        objectAnimatorOfFloat.addListener(new wef(function0, (byte) 0));
        objectAnimatorOfFloat.start();
    }

    public static List b(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cgf cgfVar = (cgf) it.next();
            if (cgfVar.f4309a == i) {
                arrayList2.add(cgfVar);
            }
        }
        return CollectionsKt.A0(arrayList2, new vt5((byte) 12));
    }

    public static void c(egf egfVar, float f, cgf cgfVar, long j) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(egfVar, (Property<egf, Float>) FrameLayout.TRANSLATION_Y, -f, 0.0f);
        objectAnimatorOfFloat.setDuration(1000 - (((long) cgfVar.b) * 75));
        objectAnimatorOfFloat.setStartDelay(j);
        objectAnimatorOfFloat.addListener(new akc(egfVar, cgfVar, (byte) 1));
        objectAnimatorOfFloat.start();
    }

    private final void setNewField(List<cgf> list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (cgf cgfVar : list) {
            arrayList.add(cgf.a(cgfVar, cgfVar.b + 7));
        }
        ArrayList arrayList2 = this.b;
        if (Intrinsics.d(arrayList2, arrayList)) {
            return;
        }
        int i = 0;
        for (Object obj : this.f46525a) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            egf egfVar = (egf) obj;
            a(egfVar, 0L, new vk8(this, egfVar, arrayList, i));
            i = i2;
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    private final void setWinCombination(jff jffVar) {
        Object next;
        CrystalFieldView crystalFieldView;
        d(jffVar.b);
        Iterator it = jffVar.f16423a.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ArrayList arrayList = new ArrayList();
            List listB = b(iIntValue, jffVar.b);
            List<cgf> listB2 = b(iIntValue, jffVar.c);
            Iterator it2 = l1e0.i(q3d.i(listB), 0).iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (((cgf) listB.get(((bkx) it2).nextInt())).d == bgf.d) {
                    i++;
                } else {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (cgf cgfVar : listB2) {
                arrayList.add(Integer.valueOf(i));
            }
            Collections.reverse(arrayList);
            ArrayList arrayListQ0 = CollectionsKt.q0(listB, listB2);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayListQ0) {
                if (((cgf) obj).d != bgf.d) {
                    arrayList2.add(obj);
                }
            }
            List listA0 = CollectionsKt.A0(arrayList2, new vt5((byte) 13));
            ArrayList arrayList3 = new ArrayList(r3d.q(listA0, 10));
            int i2 = 0;
            for (Object obj2 : listA0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                arrayList3.add(cgf.a((cgf) obj2, i2));
                i2 = i3;
            }
            int i4 = 0;
            for (Object obj3 : arrayList3) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                cgf cgfVar2 = (cgf) obj3;
                int i6 = cgfVar2.b;
                int i7 = cgfVar2.f4309a;
                Iterator it3 = this.f46525a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    egf egfVar = (egf) next;
                    if (egfVar.getRow() == i6 && egfVar.getColumn() == i7) {
                        break;
                    }
                }
                egf egfVar2 = (egf) next;
                if (egfVar2 == null) {
                    crystalFieldView = this;
                } else if (egfVar2.getStatus() == bgf.d) {
                    crystalFieldView = this;
                    a(egfVar2, 3000L, new lc0(crystalFieldView, egfVar2, arrayList, i4, cgfVar2));
                } else {
                    crystalFieldView = this;
                    c(egfVar2, ((Number) arrayList.get(i4)).intValue() * crystalFieldView.c, cgfVar2, 3500L);
                }
                this = crystalFieldView;
                i4 = i5;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cgf cgfVar = (cgf) it.next();
            Iterator it2 = this.f46525a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                egf egfVar = (egf) next;
                if (egfVar.getRow() == cgfVar.b && egfVar.getColumn() == cgfVar.f4309a) {
                    break;
                }
            }
            egf egfVar2 = (egf) next;
            if (egfVar2 != null) {
                egfVar2.setCrystal(cgfVar);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = (getMeasuredWidth() - this.d) / 2;
        int measuredHeight = (getMeasuredHeight() - this.d) / 2;
        Iterator it = l1e0.o(0, 7).iterator();
        int i5 = 0;
        while (((kkx) it).c) {
            ((bkx) it).nextInt();
            Iterator it2 = l1e0.o(0, 7).iterator();
            int i6 = measuredWidth;
            while (((kkx) it2).c) {
                ((bkx) it2).nextInt();
                egf egfVar = (egf) this.f46525a.get(i5);
                int i7 = this.c;
                egfVar.layout(i6, measuredHeight, i6 + i7, i7 + measuredHeight);
                i6 += this.c;
                i5++;
            }
            measuredHeight += this.c;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredWidth() > getMeasuredHeight() ? getMeasuredHeight() : getMeasuredWidth();
        this.d = measuredHeight;
        int i3 = measuredHeight / 7;
        this.c = i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        Iterator it = this.f46525a.iterator();
        while (it.hasNext()) {
            ((egf) it.next()).measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
    }

    public final void setCrystalGameState(kff kffVar) {
        kffVar.getClass();
        if (kffVar instanceof jff) {
            setWinCombination((jff) kffVar);
            return;
        }
        if (kffVar instanceof hff) {
            setNewField(((hff) kffVar).f12970a);
            return;
        }
        if (kffVar instanceof gff) {
            Iterator it = this.f46525a.iterator();
            while (it.hasNext()) {
                ((egf) it.next()).b();
            }
        } else if (kffVar instanceof iff) {
            d(((iff) kffVar).f14684a);
        } else {
            t9f.b();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrystalFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrystalFieldView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
