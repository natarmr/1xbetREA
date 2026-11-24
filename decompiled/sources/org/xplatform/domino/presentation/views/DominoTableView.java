package org.xplatform.domino.presentation.views;

import a.aqd0;
import a.epv0;
import a.nbe;
import a.qb8;
import a.uu40;
import a.vbk;
import a.vu40;
import a.z0l;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class DominoTableView extends View {
    public static final /* synthetic */ int r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f46627a;
    public List b;
    public final int c;
    public final int d;
    public float e;
    public float f;
    public final vu40 g;
    public int h;
    public int i;
    public final int j;
    public final Rect k;
    public qb8 l;
    public float m;
    public boolean n;
    public final int o;
    public ValueAnimator p;
    public Function1 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public DominoTableView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        Drawable drawableU = epv0.U(R.drawable.domino_face, context);
        drawableU = drawableU == null ? new ColorDrawable() : drawableU;
        this.f46627a = drawableU;
        this.b = new ArrayList();
        this.e = 1.0f;
        this.f = 1.0f;
        vu40 vu40Var = new vu40();
        vu40Var.f38034a = uu40.d;
        uu40 uu40Var = uu40.f36284a;
        vu40Var.b = uu40Var;
        vu40Var.c = uu40Var;
        vu40Var.d = uu40Var;
        vu40Var.u = -1;
        vu40Var.v = -1;
        this.g = vu40Var;
        this.j = 30;
        this.k = new Rect();
        this.m = 1.0f;
        this.q = new vbk((byte) 26);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, aqd0.h, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, Response.OK);
            this.c = dimensionPixelSize;
            this.d = (int) ((dimensionPixelSize * drawableU.getIntrinsicWidth()) / drawableU.getIntrinsicHeight());
            typedArrayObtainStyledAttributes.recycle();
            this.j = (int) Math.ceil(context.getResources().getDisplayMetrics().density * 72.0f);
            setLayerType(2, null);
            this.o = -((int) Math.ceil(context.getResources().getDisplayMetrics().density * 30.0f));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(DominoHandView dominoHandView, qb8 qb8Var, boolean z, int i) {
        qb8Var.getClass();
        vu40 vu40Var = this.g;
        if (i == -1 && qb8Var.a(vu40Var.u) && qb8Var.a(vu40Var.v)) {
            qb8Var.c = this.l == vu40Var.b();
        } else if (i == -1) {
            qb8Var.c = !qb8Var.a(vu40Var.v);
        } else {
            qb8Var.c = i == 0;
        }
        qb8Var.s = true;
        this.b.add(qb8Var);
        if (z) {
            Function1 function1 = this.q;
            boolean z2 = qb8Var.c;
            int i2 = z2 ? vu40Var.u : vu40Var.v;
            nbe nbeVar = new nbe();
            nbeVar.f23235a = i2;
            nbeVar.b = z2;
            function1.invoke(new Pair(qb8Var, nbeVar));
        }
        float f = this.f;
        if (f != 1.0f) {
            qb8Var.r = 1.0f / f;
        }
        Rect rect = this.k;
        vu40Var.d(dominoHandView, qb8Var, rect, true);
        AnimatorSet animatorSetD = qb8Var.d(this, rect, this.h, this.i);
        if (animatorSetD != null) {
            animatorSetD.start();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.h, (int) (this.f * ((getMeasuredWidth() - ((vu40Var.m - vu40Var.k) - vu40Var.f)) >> 1)));
        valueAnimatorOfInt.addUpdateListener(new z0l(this, valueAnimatorOfInt, (byte) 2));
        valueAnimatorOfInt.start();
        valueAnimatorOfInt.setDuration(600L);
        c((int) (this.f * ((getMeasuredHeight() - (vu40Var.n - vu40Var.l)) >> 1)));
    }

    public final void b() {
        int size = this.b.size();
        Rect[] rectArr = new Rect[size];
        int i = 0;
        while (true) {
            vu40 vu40Var = this.g;
            if (i >= size) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.h, (int) (this.f * ((getMeasuredWidth() - ((vu40Var.m - vu40Var.k) - vu40Var.f)) >> 1)));
                valueAnimatorOfInt.addUpdateListener(new z0l(this, valueAnimatorOfInt, (byte) 2));
                valueAnimatorOfInt.start();
                valueAnimatorOfInt.setDuration(600L);
                c((int) (this.f * ((getMeasuredHeight() - (vu40Var.n - vu40Var.l)) >> 1)));
                return;
            }
            qb8 qb8Var = (qb8) this.b.get(i);
            Rect rect = this.k;
            vu40Var.d(this, qb8Var, rect, false);
            rectArr[i] = new Rect(rect);
            qb8 qb8Var2 = (qb8) this.b.get(i);
            Rect rect2 = rectArr[i];
            if (rect2 == null) {
                qb8Var2.getClass();
            } else {
                qb8Var2.f28435a.set(rect2);
            }
            i++;
        }
    }

    public final void c(int i) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.i, i + this.o);
        valueAnimatorOfInt.addUpdateListener(new z0l(this, valueAnimatorOfInt, (byte) 0));
        valueAnimatorOfInt.start();
        valueAnimatorOfInt.setDuration(600L);
    }

    public final void d(List list, List list2) {
        this.b.clear();
        this.g.a();
        if (list == null) {
            invalidate();
            return;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            List list3 = (List) it.next();
            if (list2 != null && ((Number) list2.get(0)).intValue() == ((Number) list3.get(0)).intValue() && ((Number) list2.get(1)).intValue() == ((Number) list3.get(1)).intValue()) {
                z = false;
            }
            Context context = getContext();
            context.getClass();
            qb8 qb8Var = new qb8(context, this.f46627a, ((Number) list3.get(0)).intValue(), ((Number) list3.get(1)).intValue());
            qb8Var.c = z;
            if (z) {
                linkedList.add(qb8Var);
            } else {
                this.b.add(qb8Var);
            }
        }
        Collections.reverse(linkedList);
        this.b.addAll(linkedList);
        b();
        invalidate();
    }

    public final int getBoneSize() {
        return this.b.size();
    }

    public final List<qb8> getBones() {
        return this.b;
    }

    public final int getHeadValue() {
        return this.g.u;
    }

    public final int getTailValue() {
        return this.g.v;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        canvas.translate(this.h, this.i);
        float f = this.e;
        canvas.scale(f, f, getMeasuredWidth() >> 1, getMeasuredHeight() >> 1);
        for (qb8 qb8Var : this.b) {
            qb8Var.g = this.m;
            qb8Var.e(canvas, getMeasuredWidth() >> 1, getMeasuredHeight() >> 1);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.h = getMeasuredWidth() >> 1;
        this.i = getMeasuredWidth() >> 1;
        int measuredWidth = ((int) (getMeasuredWidth() / 0.75f)) - this.j;
        getMeasuredHeight();
        vu40 vu40Var = this.g;
        vu40Var.e = measuredWidth;
        vu40Var.f = this.d;
        vu40Var.g = this.c;
        vu40Var.a();
        b();
        float f = this.e;
        if (f == 0.75f) {
            return;
        }
        this.f = 0.75f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.75f);
        valueAnimatorOfFloat.addUpdateListener(new z0l(this, valueAnimatorOfFloat, (byte) 1));
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat.setDuration(600L);
    }

    public final void setBones(List<qb8> list) {
        list.getClass();
        this.b = list;
    }

    public final void setPutOnTableListener(Function1<? super Pair<qb8, nbe>, Unit> function1) {
        function1.getClass();
        this.q = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DominoTableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DominoTableView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
