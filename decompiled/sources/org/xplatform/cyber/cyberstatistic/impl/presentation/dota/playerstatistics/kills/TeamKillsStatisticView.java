package org.xplatform.cyber.cyberstatistic.impl.presentation.dota.playerstatistics.kills;

import a.boy;
import a.cww;
import a.h5l;
import a.hlp0;
import a.j5d;
import a.n4a0;
import a.pfh;
import a.q3d;
import a.qab;
import a.r3d;
import a.s1g;
import a.u0d;
import a.uea0;
import a.vqd;
import a.xnp0;
import a.ydr;
import a.yep0;
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
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.playerstatistics.kills.TeamKillsStatisticView;

/* JADX INFO: loaded from: classes3.dex */
public final class TeamKillsStatisticView extends FrameLayout {
    public static final /* synthetic */ int B = 0;
    public final TextPaint A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46494a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public int m;
    public z6p0 n;
    public final ArrayList o;
    public s1g p;
    public final LinkedHashMap q;
    public final String r;
    public String s;
    public final LinkedHashMap t;
    public final LinkedHashMap u;
    public final LinkedHashMap v;
    public final int w;
    public final int x;
    public final Rect y;
    public final Rect z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamKillsStatisticView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.size_32);
        this.f46494a = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.size_42);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.space_2);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.c = dimensionPixelSize3;
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.space_6);
        this.d = dimensionPixelSize4;
        this.e = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.space_16);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.size_8);
        float dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.text_10);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.size_20);
        this.i = dimensionPixelSize2;
        this.j = dimensionPixelSize2 + dimensionPixelSize4;
        this.k = dimensionPixelSize + dimensionPixelSize3;
        this.l = getKillsStatisticColumnsWidth();
        this.o = new ArrayList();
        this.q = new LinkedHashMap();
        String string = getResources().getString(R.string.number_of_hero_kills);
        string.getClass();
        this.r = string;
        this.s = "";
        this.t = new LinkedHashMap();
        this.u = new LinkedHashMap();
        this.v = new LinkedHashMap();
        TypedValue typedValue = j5d.f15927a;
        int color = context.getColor(R.color.static_white);
        this.w = color;
        this.x = context.getColor(R.color.static_white_60);
        this.y = new Rect();
        this.z = new Rect();
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(color);
        textPaint.setTextSize(dimensionPixelSize5);
        this.A = textPaint;
        setWillNotDraw(false);
    }

    private final int getKillsStatisticColumnsWidth() {
        return this.j * 5;
    }

    private final int getTotalHeight() {
        return (this.c * 5) + (this.f46494a * 6) + this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        qab qabVar;
        qab qabVar2;
        canvas.getClass();
        s1g s1gVar = this.p;
        if (s1gVar != null) {
            s1gVar.a(canvas);
        }
        z6p0 z6p0Var = this.n;
        if (z6p0Var != null) {
            z6p0Var.a(canvas);
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((hlp0) it.next()).k(canvas);
        }
        int i = this.x;
        TextPaint textPaint = this.A;
        textPaint.setColor(i);
        String str = this.r;
        int length = str.length();
        Rect rect = this.y;
        textPaint.getTextBounds(str, 0, length, rect);
        String str2 = this.s;
        int length2 = str2.length();
        Rect rect2 = this.z;
        textPaint.getTextBounds(str2, 0, length2, rect2);
        int i2 = this.l;
        float f = i2 * 0.5f;
        float fWidth = rect.width() * 0.5f;
        int layoutDirection = getLayoutDirection();
        int i3 = this.c;
        float fWidth2 = layoutDirection == 1 ? (rect2.width() * 0.5f) + (f - fWidth) : (((((getWidth() - i2) + this.d) + f) - fWidth) - i3) - rect2.width();
        float fWidth3 = getLayoutDirection() == 1 ? (fWidth2 - rect2.width()) - i3 : rect.width() + fWidth2 + i3;
        float f2 = i3 + this.f;
        canvas.drawText(str, fWidth2, f2, textPaint);
        textPaint.setColor(this.w);
        canvas.drawText(this.s, fWidth3, f2, textPaint);
        Iterator it2 = this.q.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) ((Map.Entry) it2.next()).getValue()).iterator();
            while (it3.hasNext()) {
                ((s1g) it3.next()).a(canvas);
            }
        }
        for (Map.Entry entry : this.u.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            int i4 = 0;
            for (Object obj : (List) entry.getValue()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                boy boyVar = (boy) obj;
                TypedValue typedValue = j5d.f15927a;
                Context context = getContext();
                context.getClass();
                textPaint.setColor(context.getColor(boyVar.d));
                Integer numValueOf = Integer.valueOf(iIntValue);
                LinkedHashMap linkedHashMap = this.v;
                List list = (List) linkedHashMap.get(numValueOf);
                float f3 = 0.0f;
                float f4 = (list == null || (qabVar2 = (qab) list.get(i4)) == null) ? 0.0f : qabVar2.f28387a;
                List list2 = (List) linkedHashMap.get(Integer.valueOf(iIntValue));
                if (list2 != null && (qabVar = (qab) list2.get(i4)) != null) {
                    f3 = qabVar.b;
                }
                canvas.drawText(boyVar.c, f4, f3, textPaint);
                i4 = i5;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        final TeamKillsStatisticView teamKillsStatisticView = this;
        int width = teamKillsStatisticView.getWidth();
        int i9 = teamKillsStatisticView.l;
        int i10 = width - i9;
        teamKillsStatisticView.m = i10;
        final byte b = 0;
        cww.B(teamKillsStatisticView, 0, 0, i10, teamKillsStatisticView.f46494a, new ydr(teamKillsStatisticView) { // from class: a.xep0
            public final /* synthetic */ TeamKillsStatisticView b;

            {
                this.b = teamKillsStatisticView;
            }

            @Override // a.ydr
            public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                byte b2 = b;
                TeamKillsStatisticView teamKillsStatisticView2 = this.b;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                switch (b2) {
                    case 0:
                        z6p0 z6p0Var = teamKillsStatisticView2.n;
                        if (z6p0Var != null) {
                            z6p0Var.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        }
                        break;
                    default:
                        s1g s1gVar = teamKillsStatisticView2.p;
                        if (s1gVar != null) {
                            s1gVar.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        int width2 = teamKillsStatisticView.getWidth() - i9;
        int i11 = teamKillsStatisticView.d;
        final byte b2 = 1;
        cww.B(teamKillsStatisticView, width2 + i11, 0, teamKillsStatisticView.getWidth(), teamKillsStatisticView.f46494a, new ydr(teamKillsStatisticView) { // from class: a.xep0
            public final /* synthetic */ TeamKillsStatisticView b;

            {
                this.b = teamKillsStatisticView;
            }

            @Override // a.ydr
            public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                byte b3 = b2;
                TeamKillsStatisticView teamKillsStatisticView2 = this.b;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                switch (b3) {
                    case 0:
                        z6p0 z6p0Var = teamKillsStatisticView2.n;
                        if (z6p0Var != null) {
                            z6p0Var.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        }
                        break;
                    default:
                        s1g s1gVar = teamKillsStatisticView2.p;
                        if (s1gVar != null) {
                            s1gVar.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        int i12 = teamKillsStatisticView.f46494a;
        int i13 = teamKillsStatisticView.c;
        int i14 = i12 + i13;
        Iterator it = teamKillsStatisticView.o.iterator();
        int i15 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            Throwable th = null;
            int i16 = teamKillsStatisticView.k;
            if (!zHasNext) {
                Iterator it2 = teamKillsStatisticView.q.entrySet().iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    i5 = teamKillsStatisticView.i;
                    i6 = teamKillsStatisticView.j;
                    if (!zHasNext2) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    int width3 = (teamKillsStatisticView.getWidth() - i9) + i11;
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    Iterator it3 = ((Iterable) entry.getValue()).iterator();
                    int i17 = width3;
                    while (it3.hasNext()) {
                        int i18 = i6;
                        int i19 = (i16 * iIntValue) + i16;
                        cww.B(teamKillsStatisticView, i17, i19, i17 + i5, i19 + i12, new pfh((s1g) it3.next(), (byte) 4));
                        i17 += i18;
                        i6 = i18;
                        i5 = i5;
                        th = th;
                    }
                }
                int i20 = i5;
                Throwable th2 = th;
                Iterator it4 = teamKillsStatisticView.t.entrySet().iterator();
                while (true) {
                    boolean zHasNext3 = it4.hasNext();
                    i7 = teamKillsStatisticView.f;
                    if (!zHasNext3) {
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    int iIntValue2 = ((Number) entry2.getKey()).intValue();
                    int width4 = (teamKillsStatisticView.getWidth() - i9) + i11;
                    int i21 = width4;
                    for (ImageView imageView : (Iterable) entry2.getValue()) {
                        int i22 = teamKillsStatisticView.h;
                        float f2 = i22;
                        int i23 = i21 + i13;
                        float fA = vqd.a(i16, iIntValue2, i16, i7) - (f2 * 0.5f);
                        cww.z(i23, (int) fA, i22 + i23, (int) (f2 + fA), imageView, this);
                        teamKillsStatisticView = this;
                        i21 += i6;
                        iIntValue2 = iIntValue2;
                    }
                }
                Iterator it5 = teamKillsStatisticView.u.entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    int iIntValue3 = ((Number) entry3.getKey()).intValue();
                    List list = (List) entry3.getValue();
                    ArrayList arrayList = new ArrayList();
                    int width5 = teamKillsStatisticView.getLayoutDirection() == b2 ? i9 : teamKillsStatisticView.getWidth() - i9;
                    Iterator it6 = list.iterator();
                    int i24 = 0;
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            q3d.p();
                            throw th2;
                        }
                        boy boyVar = (boy) next;
                        String str = boyVar.c;
                        int length = str.length();
                        Iterator it7 = it5;
                        TextPaint textPaint = teamKillsStatisticView.A;
                        Iterator it8 = it6;
                        Rect rect = teamKillsStatisticView.y;
                        int i26 = iIntValue3;
                        textPaint.getTextBounds(str, 0, length, rect);
                        float fWidth = rect.width() * 0.5f;
                        if (teamKillsStatisticView.getLayoutDirection() == 1) {
                            i8 = i20;
                            f = ((width5 - i8) + i13) - fWidth;
                        } else {
                            i8 = i20;
                            f = ((width5 + i8) - i13) - fWidth;
                        }
                        Context context = teamKillsStatisticView.getContext();
                        context.getClass();
                        textPaint.setColor(context.getColor(boyVar.d));
                        arrayList.add(new qab(f, (i16 * i26) + i14 + i13 + i7));
                        width5 += teamKillsStatisticView.getLayoutDirection() == 1 ? -i6 : i6;
                        it5 = it7;
                        i20 = i8;
                        i24 = i25;
                        iIntValue3 = i26;
                        b2 = 1;
                        it6 = it8;
                    }
                    teamKillsStatisticView.v.put(Integer.valueOf(iIntValue3), arrayList);
                    it5 = it5;
                    b2 = b2;
                }
                return;
            }
            Object next2 = it.next();
            int i27 = i15 + 1;
            if (i15 < 0) {
                q3d.p();
                throw null;
            }
            int i28 = (i16 * i15) + i14;
            cww.B(teamKillsStatisticView, 0, i28, teamKillsStatisticView.m, i28 + i12, new h5l((hlp0) next2, (byte) 2));
            i15 = i27;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int totalHeight = getTotalHeight();
        int i3 = size - this.l;
        z6p0 z6p0Var = this.n;
        if (z6p0Var != null) {
            z6p0Var.c(i3);
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((hlp0) it.next()).b(i3);
        }
        setMeasuredDimension(size, totalHeight);
    }

    public final void setHeader(String str) {
        str.getClass();
        this.s = str;
        if (this.p == null) {
            s1g s1gVar = new s1g(this, R.color.static_black_40);
            s1gVar.c(this.g);
            this.p = s1gVar;
        }
    }

    public final void setPlayersKillsStatistics(List<n4a0> list) {
        boy boyVar;
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (n4a0 n4a0Var : list) {
            arrayList.add(new yep0(n4a0Var.b, n4a0Var.c));
        }
        Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.t;
            LinkedHashMap linkedHashMap2 = this.u;
            if (!zHasNext) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    int i2 = 0;
                    for (Object obj : (Iterable) entry.getValue()) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        ImageView imageView = (ImageView) obj;
                        List list2 = u0d.f34849a;
                        List list3 = (List) linkedHashMap2.get(Integer.valueOf(iIntValue));
                        String str = (list3 == null || (boyVar = (boy) CollectionsKt.W(i2, list3)) == null) ? null : boyVar.b;
                        if (str == null) {
                            str = "";
                        }
                        u0d.j(imageView, str, R.drawable.dota_kill_target_placeholder, 0, null, null, null, 508);
                        if (imageView.getParent() == null) {
                            addView(imageView);
                        }
                        i2 = i3;
                    }
                }
                return;
            }
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            n4a0 n4a0Var2 = (n4a0) next;
            ArrayList arrayList2 = this.o;
            hlp0 uea0Var = (hlp0) CollectionsKt.W(i, arrayList2);
            if (uea0Var == null) {
                uea0Var = new uea0(this);
                arrayList2.add(i, uea0Var);
            }
            uea0Var.c(n4a0Var2.d, n4a0Var2.b, n4a0Var2.c);
            linkedHashMap2.put(Integer.valueOf(i), list.get(i).e);
            if (linkedHashMap.get(Integer.valueOf(i)) == null) {
                Integer numValueOf = Integer.valueOf(i);
                ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                for (n4a0 n4a0Var3 : list) {
                    ImageView imageView2 = new ImageView(getContext());
                    int i5 = this.h;
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
                    int i6 = this.b;
                    imageView2.setPadding(i6, i6, i6, i6);
                    arrayList3.add(imageView2);
                }
                linkedHashMap.put(numValueOf, arrayList3);
            }
            Integer numValueOf2 = Integer.valueOf(i);
            LinkedHashMap linkedHashMap3 = this.q;
            if (linkedHashMap3.get(numValueOf2) == null) {
                Integer numValueOf3 = Integer.valueOf(i);
                ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
                for (n4a0 n4a0Var4 : list) {
                    s1g s1gVar = new s1g(this, R.color.static_black_40);
                    s1gVar.c(this.g);
                    arrayList4.add(s1gVar);
                }
                linkedHashMap3.put(numValueOf3, arrayList4);
            }
            i = i4;
        }
    }

    public final void setTeam(xnp0 xnp0Var) {
        xnp0Var.getClass();
        z6p0 z6p0Var = this.n;
        if (z6p0Var == null) {
            z6p0Var = new z6p0(this, xnp0Var.e);
            this.n = z6p0Var;
        }
        z6p0Var.d(xnp0Var.f41180a, xnp0Var.b, xnp0Var.c, xnp0Var.d, xnp0Var.g);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TeamKillsStatisticView(Context context) {
        this(context, null);
        context.getClass();
    }
}
