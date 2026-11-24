package org.xplatform.cyber.cyberstatistic.impl.presentation.stagetable.view;

import a.bkx;
import a.cww;
import a.j5d;
import a.kfh;
import a.kkx;
import a.pfh;
import a.q3d;
import a.qab;
import a.r3d;
import a.r7x;
import a.s1g;
import a.u0d;
import a.vqd;
import a.xdx;
import a.ydr;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
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
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.cyber.cyberstatistic.impl.presentation.stagetable.view.CyberStageView;

/* JADX INFO: loaded from: classes3.dex */
public final class CyberStageView extends FrameLayout {
    public static final /* synthetic */ int l1 = 0;
    public int A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46495a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int f1;
    public final int g;
    public int g1;
    public final int h;
    public final Rect h1;
    public final int i;
    public final Rect i1;
    public final int j;
    public final TextPaint j1;
    public final ArrayList k;
    public final TextPaint k1;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final LinkedHashMap o;
    public final s1g p;
    public final s1g q;
    public final ArrayList r;
    public final ArrayList s;
    public final ArrayList t;
    public final LinkedHashMap u;
    public final ArrayList v;
    public final ArrayList w;
    public final LinkedHashMap x;
    public final ArrayList y;
    public final int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CyberStageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f46495a = context.getResources().getConfiguration().getLayoutDirection() == 1;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.space_2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.c = dimensionPixelSize;
        this.d = context.getResources().getDimensionPixelSize(R.dimen.space_6);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.size_16);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.size_26);
        this.g = dimensionPixelSize2;
        this.h = context.getResources().getDimensionPixelSize(R.dimen.size_36);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.size_78);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.corner_radius_8);
        this.j = dimensionPixelSize3;
        float dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.text_10);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new LinkedHashMap();
        s1g s1gVar = new s1g(this, R.color.static_white_20);
        float f = dimensionPixelSize3;
        s1gVar.c(f);
        this.p = s1gVar;
        s1g s1gVar2 = new s1g(this, R.color.static_white_20);
        s1gVar2.c(f);
        this.q = s1gVar2;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new LinkedHashMap();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = dimensionPixelSize2 + dimensionPixelSize;
        this.h1 = new Rect();
        this.i1 = new Rect();
        TextPaint textPaint = new TextPaint();
        r7x.r(textPaint, context, R.style.TextStyle_Caption_Medium_L);
        textPaint.setAntiAlias(true);
        TypedValue typedValue = j5d.f15927a;
        textPaint.setColor(context.getColor(R.color.static_white));
        textPaint.setTextSize(dimensionPixelSize4);
        Paint.Style style = Paint.Style.FILL;
        textPaint.setStyle(style);
        this.j1 = textPaint;
        TextPaint textPaint2 = new TextPaint();
        r7x.r(textPaint2, context, R.style.TextStyle_Caption_Medium_L);
        textPaint2.setAntiAlias(true);
        textPaint2.setColor(context.getColor(R.color.static_white));
        textPaint2.setTextSize(dimensionPixelSize4);
        textPaint2.setStyle(style);
        this.k1 = textPaint2;
        setWillNotDraw(false);
    }

    private final int getTotalHeight() {
        int i = this.f1;
        int i2 = (i + 1) * this.g;
        int i3 = this.c;
        return vqd.a(i3, i, i3, i2);
    }

    public final void a(String str, int i, float f, float f2, Canvas canvas) {
        int length = str.length();
        TextPaint textPaint = this.j1;
        Rect rect = this.h1;
        textPaint.getTextBounds(str, 0, length, rect);
        int iWidth = rect.width();
        canvas.drawText(str, this.f46495a ? (f - iWidth) - ((i - iWidth) / 2) : f + ((i - rect.width()) / 2), f2 + (this.g / 2) + (rect.height() / 2), textPaint);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        canvas2.getClass();
        super.onDraw(canvas);
        Float fValueOf = Float.valueOf(0.0f);
        this.p.a(canvas2);
        boolean z = this.f46495a;
        Number numberValueOf = z ? Integer.valueOf(getWidth()) : fValueOf;
        String string = getResources().getString(R.string.number);
        string.getClass();
        a(string, this.g, numberValueOf.floatValue(), 0.0f, canvas2);
        canvas2.save();
        int i = this.e;
        int i2 = this.g;
        int i3 = this.d;
        canvas2.translate(z ? (getWidth() - ((i2 + i3) + i)) - this.h1.width() : i2 + i3 + i, i3);
        Layout.Alignment alignment = getLayoutDirection() == 0 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        String string2 = getResources().getString(R.string.team);
        string2.getClass();
        xdx.I(string2, this.j1, getWidth(), 1, TextUtils.TruncateAt.END, 0, alignment, 1520).draw(canvas2);
        canvas2.restore();
        this.q.a(canvas2);
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((s1g) it.next()).a(canvas2);
        }
        Iterator it2 = this.k.iterator();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            ArrayList arrayList = this.y;
            if (!zHasNext) {
                Iterator it3 = this.u.entrySet().iterator();
                while (it3.hasNext()) {
                    Iterator it4 = ((List) ((Map.Entry) it3.next()).getValue()).iterator();
                    while (it4.hasNext()) {
                        ((s1g) it4.next()).a(canvas2);
                    }
                }
                Iterator it5 = this.s.iterator();
                while (it5.hasNext()) {
                    ((s1g) it5.next()).a(canvas2);
                }
                Iterator it6 = this.t.iterator();
                while (it6.hasNext()) {
                    ((s1g) it6.next()).a(canvas2);
                }
                int i6 = 0;
                for (Object obj : this.l) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        q3d.p();
                        throw null;
                    }
                    String str = (String) obj;
                    Number numberValueOf2 = z ? Integer.valueOf(getWidth()) : fValueOf;
                    int i8 = this.c;
                    int i9 = this.g;
                    a(str, i9, numberValueOf2.floatValue(), ((i8 + i9) * i6) + this.z, canvas2);
                    canvas2 = canvas;
                    i6 = i7;
                }
                for (Map.Entry entry : this.o.entrySet()) {
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    int i10 = 0;
                    for (Object obj2 : (List) entry.getValue()) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            q3d.p();
                            throw null;
                        }
                        String str2 = (String) obj2;
                        int iIntValue2 = ((Number) arrayList.get(i10)).intValue();
                        List list = (List) this.x.get(Integer.valueOf(iIntValue));
                        qab qabVar = list != null ? (qab) list.get(i10) : null;
                        float f5 = qabVar != null ? qabVar.f28387a : 0.0f;
                        if (qabVar != null) {
                            float f6 = f5;
                            f2 = qabVar.b;
                            f = f6;
                        } else {
                            f = f5;
                            f2 = 0.0f;
                        }
                        a(str2, iIntValue2, f, f2, canvas);
                        i10 = i11;
                    }
                }
                for (Object obj3 : this.n) {
                    int i12 = i4 + 1;
                    if (i4 < 0) {
                        q3d.p();
                        throw null;
                    }
                    float f7 = this.A;
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    TextPaint textPaint = this.k1;
                    String string3 = TextUtils.ellipsize((String) obj3, textPaint, f7, truncateAt).toString();
                    qab qabVar2 = (qab) CollectionsKt.W(i4, this.w);
                    canvas.drawText(string3, qabVar2 != null ? qabVar2.f28387a : 0.0f, qabVar2 != null ? qabVar2.b : 0.0f, textPaint);
                    i4 = i12;
                }
                return;
            }
            Object next = it2.next();
            int i13 = i5 + 1;
            if (i5 < 0) {
                q3d.p();
                throw null;
            }
            String str3 = (String) next;
            int iIntValue3 = ((Number) arrayList.get(i5)).intValue();
            qab qabVar3 = (qab) CollectionsKt.W(i5, this.v);
            float f8 = qabVar3 != null ? qabVar3.f28387a : 0.0f;
            if (qabVar3 != null) {
                float f9 = f8;
                f4 = qabVar3.b;
                f3 = f9;
            } else {
                f3 = f8;
                f4 = 0.0f;
            }
            a(str3, iIntValue3, f3, f4, canvas2);
            i5 = i13;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        final CyberStageView cyberStageView = this;
        int width = cyberStageView.getWidth() - cyberStageView.B;
        final byte b = 0;
        ydr ydrVar = new ydr(cyberStageView) { // from class: a.qfh
            public final /* synthetic */ CyberStageView b;

            {
                this.b = cyberStageView;
            }

            @Override // a.ydr
            public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                byte b2 = b;
                CyberStageView cyberStageView2 = this.b;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                switch (b2) {
                    case 0:
                        cyberStageView2.p.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        break;
                    default:
                        cyberStageView2.q.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        break;
                }
                return Unit.f46060a;
            }
        };
        int i5 = cyberStageView.g;
        cww.B(cyberStageView, 0, 0, i5, i5, ydrVar);
        int i6 = cyberStageView.g;
        int i7 = cyberStageView.d;
        int i8 = i6 + i7;
        final byte b2 = 1;
        cww.B(cyberStageView, i8, 0, (cyberStageView.getWidth() - cyberStageView.B) - i7, cyberStageView.g, new ydr(cyberStageView) { // from class: a.qfh
            public final /* synthetic */ CyberStageView b;

            {
                this.b = cyberStageView;
            }

            @Override // a.ydr
            public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                byte b3 = b2;
                CyberStageView cyberStageView2 = this.b;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                switch (b3) {
                    case 0:
                        cyberStageView2.p.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        break;
                    default:
                        cyberStageView2.q.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        break;
                }
                return Unit.f46060a;
            }
        });
        Iterator it = cyberStageView.r.iterator();
        int i9 = width;
        int i10 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            Throwable th = null;
            boolean z2 = cyberStageView.f46495a;
            ArrayList arrayList = cyberStageView.y;
            if (zHasNext) {
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    q3d.p();
                    throw null;
                }
                s1g s1gVar = (s1g) next;
                int iIntValue = ((Number) arrayList.get(i10)).intValue();
                int i12 = i9 + iIntValue;
                cyberStageView.v.add(new qab(z2 ? cyberStageView.getMeasuredWidth() - i9 : i9, 0.0f));
                cww.B(cyberStageView, i9, 0, i12, cyberStageView.g, new pfh(s1gVar, (byte) 2));
                i9 += iIntValue + i7;
                i10 = i11;
            } else {
                Iterator it2 = cyberStageView.t.iterator();
                int i13 = 0;
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    int i14 = cyberStageView.c;
                    int i15 = cyberStageView.z;
                    if (!zHasNext2) {
                        int i16 = i15;
                        int i17 = i16 + i14;
                        int i18 = 0;
                        for (Object obj : cyberStageView.m) {
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                q3d.p();
                                throw null;
                            }
                            ImageView imageView = (ImageView) obj;
                            int i20 = i8 + i7;
                            int i21 = ((i6 + i14) * i18) + i17;
                            int i22 = cyberStageView.f;
                            int i23 = i20 + i22;
                            int i24 = i22 + i21;
                            CyberStageView cyberStageView2 = cyberStageView;
                            cww.z(i20, i21, i23, i24, imageView, cyberStageView2);
                            cyberStageView = cyberStageView2;
                            i18 = i19;
                            i16 = i16;
                        }
                        int i25 = i16;
                        int i26 = 0;
                        for (Object obj2 : cyberStageView.s) {
                            int i27 = i26 + 1;
                            if (i26 < 0) {
                                q3d.p();
                                throw null;
                            }
                            int i28 = ((i6 + i14) * i26) + i25;
                            cww.B(cyberStageView, i8, i28, (cyberStageView.getWidth() - cyberStageView.B) - i7, i28 + i6, new pfh((s1g) obj2, (byte) 1));
                            i26 = i27;
                        }
                        for (Map.Entry entry : cyberStageView.u.entrySet()) {
                            ArrayList arrayList2 = new ArrayList();
                            int width2 = cyberStageView.getWidth() - cyberStageView.B;
                            int iIntValue2 = ((Number) entry.getKey()).intValue();
                            int i29 = width2;
                            int i30 = b;
                            for (Object obj3 : (Iterable) entry.getValue()) {
                                int i31 = i30 + 1;
                                if (i30 < 0) {
                                    Throwable th2 = th;
                                    q3d.p();
                                    throw th2;
                                }
                                s1g s1gVar2 = (s1g) obj3;
                                int iIntValue3 = ((Number) arrayList.get(i30)).intValue();
                                int i32 = i29 + iIntValue3;
                                int i33 = ((i6 + i14) * iIntValue2) + i25;
                                int i34 = i33 + i6;
                                Throwable th3 = th;
                                arrayList2.add(new qab(z2 ? cyberStageView.getMeasuredWidth() - i29 : i29, i33));
                                cyberStageView = this;
                                cww.B(cyberStageView, i29, i33, i32, i34, new pfh(s1gVar2, (byte) 3));
                                i29 = iIntValue3 + i7 + i29;
                                th = th3;
                                i30 = i31;
                            }
                            cyberStageView.x.put(Integer.valueOf(iIntValue2), arrayList2);
                            b = 0;
                        }
                        return;
                    }
                    Object next2 = it2.next();
                    int i35 = i13 + 1;
                    if (i13 < 0) {
                        q3d.p();
                        throw null;
                    }
                    int i36 = cyberStageView.g;
                    int i37 = ((i14 + i36) * i13) + i15;
                    cww.B(cyberStageView, 0, i37, i36, i37 + i36, new pfh((s1g) next2, (byte) 0));
                    i13 = i35;
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int totalHeight = getTotalHeight();
        ArrayList arrayList = this.w;
        arrayList.clear();
        ArrayList arrayList2 = this.n;
        String str = (String) arrayList2.get(0);
        int length = str.length();
        TextPaint textPaint = this.k1;
        Rect rect = this.i1;
        textPaint.getTextBounds(str, 0, length, rect);
        int iHeight = rect.height();
        this.A = size - (this.i + this.B);
        int i4 = 0;
        for (Object obj : arrayList2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                q3d.p();
                throw null;
            }
            String str2 = (String) obj;
            textPaint.getTextBounds(str2, 0, str2.length(), rect);
            int iWidth = rect.width();
            int i6 = this.f;
            int i7 = this.d;
            boolean z = this.f46495a;
            int i8 = this.g;
            if (z) {
                int i9 = this.e;
                i3 = (size - ((((i7 + i8) + i9) + i6) + i9)) - iWidth;
            } else {
                i3 = i8 + i7 + i7 + i6 + i7;
            }
            arrayList.add(new qab(i3, ((i8 - iHeight) / 2) + ((this.c + i8) * i4) + this.b + i8 + iHeight));
            i4 = i5;
        }
        setMeasuredDimension(size, totalHeight);
    }

    public final void setHeaders(List<String> list) {
        list.getClass();
        this.B = 0;
        ArrayList arrayList = this.k;
        arrayList.clear();
        ArrayList arrayList2 = this.r;
        arrayList2.clear();
        this.g1 = list.size();
        for (String str : list) {
            arrayList.add(str.length() > 3 ? this.f46495a ? "...".concat(str.substring(0, 3)) : str.substring(0, 3).concat("...") : str);
            s1g s1gVar = new s1g(this, R.color.static_white_20);
            s1gVar.c(this.j);
            arrayList2.add(s1gVar);
            int i = str.length() < 3 ? this.g : this.h;
            this.y.add(Integer.valueOf(i));
            this.B += i;
        }
        this.B = ((this.g1 - 1) * this.d) + this.B;
    }

    public final void setTeams(List<kfh> list) {
        int i;
        list.getClass();
        this.f1 = list.size();
        ArrayList arrayList = this.m;
        int i2 = 10;
        if (arrayList.isEmpty()) {
            IntRange intRange = new IntRange(0, this.f1, 1);
            ArrayList arrayList2 = new ArrayList(r3d.q(intRange, 10));
            Iterator it = intRange.iterator();
            while (((kkx) it).c) {
                ((bkx) it).nextInt();
                arrayList2.add(new ImageView(getContext()));
            }
            arrayList.addAll(arrayList2);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                addView((ImageView) it2.next());
            }
        }
        LinkedHashMap linkedHashMap = this.o;
        linkedHashMap.clear();
        LinkedHashMap linkedHashMap2 = this.u;
        linkedHashMap2.clear();
        ArrayList arrayList3 = this.s;
        arrayList3.clear();
        ArrayList arrayList4 = this.t;
        arrayList4.clear();
        ArrayList arrayList5 = this.n;
        arrayList5.clear();
        ArrayList arrayList6 = this.l;
        arrayList6.clear();
        Iterator it3 = list.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            kfh kfhVar = (kfh) next;
            Integer numValueOf = Integer.valueOf(i3);
            ArrayList arrayList7 = kfhVar.e;
            Iterator it4 = it3;
            ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, i2));
            Iterator it5 = arrayList7.iterator();
            while (true) {
                boolean zHasNext = it5.hasNext();
                i = this.j;
                if (!zHasNext) {
                    break;
                }
                s1g s1gVar = new s1g(this, R.color.static_black_40);
                s1gVar.c(i);
                arrayList8.add(s1gVar);
                it5 = it5;
            }
            linkedHashMap2.put(numValueOf, arrayList8);
            s1g s1gVar2 = new s1g(this, R.color.static_black_40);
            float f = i;
            s1gVar2.c(f);
            arrayList3.add(s1gVar2);
            s1g s1gVar3 = new s1g(this, R.color.static_black_40);
            s1gVar3.c(f);
            arrayList4.add(s1gVar3);
            List list2 = u0d.f34849a;
            u0d.j((ImageView) arrayList.get(i3), kfhVar.c, R.drawable.icon_globe_empty, 0, null, null, null, 508);
            arrayList6.add(kfhVar.b);
            arrayList5.add(kfhVar.d);
            ArrayList arrayList9 = kfhVar.e;
            ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
            Iterator it6 = arrayList9.iterator();
            int i5 = 0;
            while (it6.hasNext()) {
                Object next2 = it6.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    q3d.p();
                    throw null;
                }
                String strConcat = (String) next2;
                TextPaint textPaint = this.j1;
                textPaint.measureText(strConcat);
                ArrayList arrayList11 = arrayList;
                Iterator it7 = it6;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                if (strConcat.length() > 3) {
                    if (this.f46495a) {
                        "...".concat(strConcat.substring(0, 3));
                    } else {
                        strConcat.substring(0, 3).concat("...");
                    }
                }
                float fIntValue = ((Number) this.y.get(i5)).intValue() - this.c;
                if (textPaint.measureText(strConcat) > fIntValue) {
                    strConcat = strConcat.substring(0, textPaint.breakText(strConcat, true, fIntValue - textPaint.measureText("..."), null)).concat("...");
                }
                arrayList10.add(strConcat);
                i5 = i6;
                arrayList = arrayList11;
                it6 = it7;
                linkedHashMap2 = linkedHashMap3;
            }
            linkedHashMap.put(Integer.valueOf(i3), arrayList10);
            i3 = i4;
            it3 = it4;
            arrayList = arrayList;
            linkedHashMap2 = linkedHashMap2;
            i2 = 10;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberStageView(Context context) {
        this(context, null);
        context.getClass();
    }
}
