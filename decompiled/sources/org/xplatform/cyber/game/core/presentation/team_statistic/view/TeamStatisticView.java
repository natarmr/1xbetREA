package org.xplatform.cyber.game.core.presentation.team_statistic.view;

import a.a9b;
import a.amp0;
import a.b9b;
import a.c9b;
import a.csw;
import a.cww;
import a.d9b;
import a.e9b;
import a.fba0;
import a.h5l;
import a.hlp0;
import a.hne;
import a.hrf0;
import a.j5d;
import a.jlp0;
import a.lvv;
import a.maz;
import a.n0o0;
import a.pfh;
import a.q3d;
import a.r3d;
import a.s1g;
import a.t9f;
import a.u0d;
import a.u9b;
import a.uea0;
import a.v9b;
import a.vqd;
import a.w9b;
import a.x9b;
import a.xnp0;
import a.z6p0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class TeamStatisticView extends FrameLayout {
    public static final /* synthetic */ int x = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46510a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public int h;
    public final int i;
    public int j;
    public z6p0 k;
    public final ArrayList l;
    public final ArrayList m;
    public final LinkedHashMap n;
    public jlp0 o;
    public final n0o0 p;
    public final ArrayList q;
    public final LinkedHashMap r;
    public int s;
    public final LinkedHashSet t;
    public final ArrayList u;
    public final Rect v;
    public final TextPaint w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamStatisticView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f46510a = context.getResources().getConfiguration().getLayoutDirection() == 1;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.size_32);
        this.b = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.c = dimensionPixelSize2;
        this.d = context.getResources().getDimensionPixelSize(R.dimen.space_6);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.size_8);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.size_136);
        float dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.text_10);
        this.i = dimensionPixelSize + dimensionPixelSize2;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new LinkedHashMap();
        this.o = jlp0.f16729a;
        this.p = maz.b(new hrf0(context, (byte) 23));
        this.q = new ArrayList();
        this.r = new LinkedHashMap();
        this.t = new LinkedHashSet();
        this.u = new ArrayList();
        this.v = new Rect();
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        TypedValue typedValue = j5d.f15927a;
        textPaint.setColor(context.getColor(R.color.static_white));
        textPaint.setTextSize(dimensionPixelSize3);
        this.w = textPaint;
        setWillNotDraw(false);
    }

    private final List<ImageView> getStatisticImages() {
        return (List) this.p.getValue();
    }

    private final int getTotalHeight() {
        return (this.c * 5) + (this.b * 6) + this.e;
    }

    public final void a(Canvas canvas, int i, int i2, List list) {
        boolean z = this.f46510a;
        int width = z ? this.h : getWidth() - this.h;
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            x9b x9bVar = (x9b) obj;
            Integer num = (Integer) CollectionsKt.W(i3, this.u);
            int iIntValue = num != null ? num.intValue() : 0;
            int i5 = (this.i * i) + i2;
            if ((x9bVar instanceof w9b ? (w9b) x9bVar : null) != null) {
                w9b w9bVar = (w9b) x9bVar;
                int iC = c(w9bVar.b);
                String str = w9bVar.f38770a;
                float f = width;
                float f2 = i5;
                int length = str.length();
                TextPaint textPaint = this.w;
                Rect rect = this.v;
                textPaint.getTextBounds(str, 0, length, rect);
                int iWidth = rect.width();
                canvas.drawText(str, z ? (f - iWidth) - ((iC - iWidth) / 2) : f + ((iC - rect.width()) / 2), f2 + (this.b / 2) + (rect.height() / 2), textPaint);
            }
            int i6 = this.d;
            width = z ? width - (iIntValue + i6) : width + iIntValue + i6;
            i3 = i4;
        }
    }

    public final float b(e9b e9bVar) {
        if (Intrinsics.d(e9bVar, b9b.f2200a) || Intrinsics.d(e9bVar, c9b.f3954a)) {
            return this.g;
        }
        if ((e9bVar instanceof a9b) || (e9bVar instanceof d9b)) {
            return this.f;
        }
        t9f.b();
        return 0.0f;
    }

    public final int c(e9b e9bVar) {
        if (Intrinsics.d(e9bVar, b9b.f2200a) || Intrinsics.d(e9bVar, c9b.f3954a)) {
            return this.b;
        }
        if (e9bVar instanceof a9b) {
            return getResources().getDimensionPixelSize(R.dimen.size_36);
        }
        if (e9bVar instanceof d9b) {
            return getResources().getDimensionPixelSize(R.dimen.size_32);
        }
        t9f.b();
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((s1g) it.next()).a(canvas);
        }
        Iterator it2 = this.n.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) ((Map.Entry) it2.next()).getValue()).iterator();
            while (it3.hasNext()) {
                ((s1g) it3.next()).a(canvas);
            }
        }
        a(canvas, 0, 0, this.q);
        Iterator it4 = this.l.iterator();
        while (it4.hasNext()) {
            ((hlp0) it4.next()).k(canvas);
        }
        z6p0 z6p0Var = this.k;
        if (z6p0Var != null) {
            z6p0Var.a(canvas);
        }
        for (Map.Entry entry : this.r.entrySet()) {
            a(canvas, ((Number) entry.getKey()).intValue(), this.i, (List) entry.getValue());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        boolean z2;
        TeamStatisticView teamStatisticView = this;
        int width = teamStatisticView.getWidth() - teamStatisticView.h;
        int i5 = teamStatisticView.d;
        int i6 = width - i5;
        teamStatisticView.j = i6;
        cww.B(teamStatisticView, 0, 0, i6, teamStatisticView.b, new csw((Object) teamStatisticView, (byte) 17));
        int width2 = teamStatisticView.getWidth() - teamStatisticView.h;
        Iterator it = teamStatisticView.m.iterator();
        int iIntValue = 0;
        int i7 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = teamStatisticView.u;
            Throwable th = null;
            if (zHasNext) {
                Object next = it.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    q3d.p();
                    throw null;
                }
                s1g s1gVar = (s1g) next;
                Integer num = (Integer) CollectionsKt.W(i7, arrayList);
                int iIntValue2 = num != null ? num.intValue() : 0;
                cww.B(teamStatisticView, width2, 0, width2 + iIntValue2, teamStatisticView.b, new pfh(s1gVar, (byte) 6));
                width2 += iIntValue2 + i5;
                i7 = i8;
            } else {
                int i9 = teamStatisticView.c;
                int i10 = teamStatisticView.b;
                int i11 = i10 + i9;
                Iterator it2 = teamStatisticView.l.iterator();
                int i12 = 0;
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    int i13 = teamStatisticView.i;
                    if (!zHasNext2) {
                        for (Map.Entry entry : teamStatisticView.n.entrySet()) {
                            int width3 = teamStatisticView.getWidth() - teamStatisticView.h;
                            int iIntValue3 = ((Number) entry.getKey()).intValue();
                            int i14 = width3;
                            int i15 = iIntValue;
                            for (Object obj : (Iterable) entry.getValue()) {
                                int i16 = i15 + 1;
                                if (i15 < 0) {
                                    Throwable th2 = th;
                                    q3d.p();
                                    throw th2;
                                }
                                s1g s1gVar2 = (s1g) obj;
                                List list = (List) teamStatisticView.r.get(Integer.valueOf(iIntValue3));
                                Object obj2 = list != null ? (x9b) list.get(i15) : th;
                                Integer num2 = (Integer) CollectionsKt.W(i15, arrayList);
                                int iIntValue4 = num2 != null ? num2.intValue() : iIntValue;
                                int i17 = i14 + iIntValue4;
                                int i18 = (i13 * iIntValue3) + i13;
                                int i19 = i18 + i10;
                                if (obj2 != null && (((z2 = obj2 instanceof v9b)) || (obj2 instanceof u9b))) {
                                    boolean z3 = obj2 instanceof u9b;
                                    int dimensionPixelSize = (z3 || z2) ? teamStatisticView.getResources().getDimensionPixelSize(R.dimen.size_14) : iIntValue;
                                    int dimensionPixelSize2 = (z3 || z2) ? teamStatisticView.getResources().getDimensionPixelSize(R.dimen.size_14) : iIntValue;
                                    int width4 = teamStatisticView.getWidth() - teamStatisticView.h;
                                    int i20 = iIntValue;
                                    for (Object obj3 : teamStatisticView.getStatisticImages()) {
                                        int i21 = i20 + 1;
                                        if (i20 < 0) {
                                            Throwable th3 = th;
                                            q3d.p();
                                            throw th3;
                                        }
                                        ImageView imageView = (ImageView) obj3;
                                        Throwable th4 = th;
                                        Iterator it3 = teamStatisticView.t.iterator();
                                        while (it3.hasNext()) {
                                            int iIntValue5 = ((Number) it3.next()).intValue();
                                            List listSubList = arrayList.subList(iIntValue, iIntValue5);
                                            Integer num3 = (Integer) CollectionsKt.W(iIntValue5, arrayList);
                                            if (num3 != null) {
                                                iIntValue = num3.intValue();
                                            }
                                            s1g s1gVar3 = s1gVar2;
                                            int iD = hne.d(iIntValue, dimensionPixelSize, 2, vqd.a(iIntValue5, i5, CollectionsKt.C0(listSubList), width4));
                                            int iD2 = hne.d(i10, dimensionPixelSize2, 2, (i20 * i13) + i13);
                                            cww.B(this, iD, iD2, iD + dimensionPixelSize, iD2 + dimensionPixelSize2, new csw((Object) imageView, (byte) 18));
                                            s1gVar2 = s1gVar3;
                                            dimensionPixelSize2 = dimensionPixelSize2;
                                            dimensionPixelSize = dimensionPixelSize;
                                            width4 = width4;
                                            imageView = imageView;
                                            iIntValue = 0;
                                        }
                                        teamStatisticView = this;
                                        th = th4;
                                        i20 = i21;
                                        iIntValue = 0;
                                    }
                                }
                                teamStatisticView = this;
                                int i22 = i14;
                                cww.B(teamStatisticView, i22, i18, i17, i19, new pfh(s1gVar2, (byte) 5));
                                i14 = iIntValue4 + i5 + i22;
                                th = th;
                                i15 = i16;
                                iIntValue = 0;
                            }
                            teamStatisticView = this;
                        }
                        return;
                    }
                    Object next2 = it2.next();
                    int i23 = i12 + 1;
                    if (i12 < 0) {
                        q3d.p();
                        throw null;
                    }
                    int i24 = (i13 * i12) + i11;
                    cww.B(teamStatisticView, 0, i24, teamStatisticView.j, i24 + i10, new h5l((hlp0) next2, (byte) 3));
                    i12 = i23;
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int totalHeight = getTotalHeight();
        int i3 = (size - this.h) - this.d;
        z6p0 z6p0Var = this.k;
        if (z6p0Var != null) {
            z6p0Var.c(i3);
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((hlp0) it.next()).b(size - this.h);
        }
        setMeasuredDimension(size, totalHeight);
    }

    public final void setCellHeaders(List<? extends x9b> list) {
        list.getClass();
        this.s = list.size();
        ArrayList arrayList = this.q;
        arrayList.clear();
        ArrayList arrayList2 = this.m;
        arrayList2.clear();
        arrayList.addAll(list);
        ArrayList arrayList3 = this.u;
        arrayList3.clear();
        this.h = 0;
        if (arrayList2.isEmpty()) {
            for (x9b x9bVar : list) {
                s1g s1gVar = new s1g(this, x9bVar.a());
                s1gVar.c(b(x9bVar.getType()));
                arrayList2.add(s1gVar);
                int iC = c(x9bVar.getType());
                arrayList3.add(Integer.valueOf(iC));
                this.h += iC;
            }
            this.h = ((this.s - 1) * this.d) + this.h;
        }
        requestLayout();
        invalidate();
    }

    public final void setPlayerStatistics(List<fba0> list) {
        list.getClass();
        LinkedHashMap linkedHashMap = this.r;
        linkedHashMap.clear();
        LinkedHashMap linkedHashMap2 = this.n;
        linkedHashMap2.clear();
        LinkedHashSet linkedHashSet = this.t;
        linkedHashSet.clear();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (fba0 fba0Var : list) {
            String str = fba0Var.b;
            String upperCase = fba0Var.c.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            arrayList.add(new amp0(str, upperCase));
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            fba0 fba0Var2 = (fba0) obj;
            ArrayList arrayList3 = this.l;
            hlp0 lvvVar = (hlp0) CollectionsKt.W(i, arrayList3);
            if (lvvVar == null) {
                int iOrdinal = this.o.ordinal();
                if (iOrdinal == 0) {
                    lvvVar = new lvv(this);
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    lvvVar = new uea0(this);
                }
                arrayList3.add(i, lvvVar);
            }
            String str2 = fba0Var2.d;
            String str3 = fba0Var2.b;
            String upperCase2 = fba0Var2.c.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            lvvVar.c(str2, str3, upperCase2);
            List<x9b> list2 = fba0Var2.e;
            linkedHashMap.put(Integer.valueOf(i), list2);
            Integer numValueOf = Integer.valueOf(i);
            ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
            for (x9b x9bVar : list2) {
                s1g s1gVar = new s1g(this, R.color.static_black_40);
                s1gVar.c(b(x9bVar.getType()));
                arrayList4.add(s1gVar);
            }
            linkedHashMap2.put(numValueOf, arrayList4);
            int i3 = 0;
            for (Object obj2 : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                x9b x9bVar2 = (x9b) obj2;
                if (x9bVar2 != null && ((x9bVar2 instanceof u9b) || (x9bVar2 instanceof v9b))) {
                    linkedHashSet.add(Integer.valueOf(i3));
                    arrayList2.add(x9bVar2);
                }
                i3 = i4;
            }
            i = i2;
        }
        if (linkedHashSet.isEmpty()) {
            Iterator<T> it = getStatisticImages().iterator();
            while (it.hasNext()) {
                ((ImageView) it.next()).setVisibility(8);
            }
        } else {
            int i5 = 0;
            for (Object obj3 : getStatisticImages()) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    q3d.p();
                    throw null;
                }
                ImageView imageView = (ImageView) obj3;
                if (imageView.getParent() == null) {
                    addView(imageView);
                }
                imageView.setVisibility(0);
                x9b x9bVar3 = (x9b) CollectionsKt.W(i5, arrayList2);
                if (x9bVar3 != null) {
                    if (x9bVar3 instanceof u9b) {
                        List list3 = u0d.f34849a;
                        u0d.i(imageView, ((u9b) x9bVar3).f35275a);
                    } else if (x9bVar3 instanceof v9b) {
                        List list4 = u0d.f34849a;
                        u0d.j(imageView, ((v9b) x9bVar3).f37026a, R.drawable.valorant_agent_placeholder, 0, null, null, null, 508);
                    }
                }
                i5 = i6;
            }
        }
        requestLayout();
        invalidate();
    }

    public final void setTeam(xnp0 xnp0Var) {
        xnp0Var.getClass();
        this.o = xnp0Var.f;
        z6p0 z6p0Var = this.k;
        if (z6p0Var == null) {
            z6p0Var = new z6p0(this, xnp0Var.e);
            this.k = z6p0Var;
        }
        z6p0Var.d(xnp0Var.f41180a, xnp0Var.b, xnp0Var.c, xnp0Var.d, xnp0Var.g);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TeamStatisticView(Context context) {
        this(context, null);
        context.getClass();
    }
}
