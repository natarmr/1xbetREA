package org.xplatform.domino.presentation.views;

import a.aqd0;
import a.epv0;
import a.fd5;
import a.nb8;
import a.qb8;
import a.vbk;
import a.vu40;
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
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class DominoHandView extends View {
    public static final /* synthetic */ int v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46626a;
    public Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final ArrayList e;
    public qb8 f;
    public final int g;
    public final int h;
    public boolean i;
    public final byte j;
    public DominoTableView k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public AnimatorSet p;
    public final boolean q;
    public int r;
    public Function1 s;
    public long t;
    public int u;

    /* JADX WARN: Illegal instructions before constructor call */
    public DominoHandView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.e = new ArrayList();
        this.j = (byte) 20;
        this.n = true;
        this.s = new vbk((byte) 25);
        this.t = System.currentTimeMillis();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, aqd0.h, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        Drawable drawableU = epv0.U(R.drawable.domino_face, context);
        drawableU = drawableU == null ? new ColorDrawable() : drawableU;
        this.c = drawableU;
        Drawable drawableU2 = epv0.U(R.drawable.domino_back, context);
        drawableU2 = drawableU2 == null ? new ColorDrawable() : drawableU2;
        this.d = drawableU2;
        try {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
            this.q = z;
            if (!z) {
                drawableU = drawableU2;
            }
            this.b = drawableU;
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, Response.OK);
            this.g = dimensionPixelSize;
            this.h = (int) ((dimensionPixelSize * this.b.getIntrinsicWidth()) / this.b.getIntrinsicHeight());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a(int i, boolean z) {
        int measuredWidth;
        int i2;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i3 = this.h;
        byte b = this.j;
        int i4 = i3 + b;
        int i5 = i4 * size;
        if (i5 < getMeasuredWidth()) {
            measuredWidth = (getMeasuredWidth() - i5) / 2;
            this.l = false;
            this.m = false;
            this.o = 0;
            this.s.invoke(Boolean.FALSE);
        } else {
            measuredWidth = b + this.o;
            this.l = true;
            this.m = true;
            this.s.invoke(Boolean.TRUE);
        }
        int paddingTop = getPaddingTop() - getPaddingBottom();
        boolean z2 = this.q;
        int i6 = this.g;
        int measuredHeight = paddingTop + (z2 ? getMeasuredHeight() - i6 : this.u);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = null;
        int i7 = 0;
        while (i7 < size) {
            int i8 = (i7 * i4) + measuredWidth;
            if (z) {
                i2 = size;
                AnimatorSet animatorSetD = ((qb8) arrayList.get(i7)).d(this, new Rect(i8, measuredHeight, i8 + i3, measuredHeight + i6), 0, 0);
                if (animatorSetD != null && (builderPlay == null || builderPlay.with(animatorSetD) == null)) {
                    builderPlay = animatorSet.play(animatorSetD);
                }
            } else {
                i2 = size;
                ((qb8) arrayList.get(i7)).f28435a.set(i8, measuredHeight, i8 + i3, measuredHeight + i6);
            }
            i7++;
            size = i2;
        }
        if (builderPlay != null) {
            AnimatorSet animatorSet2 = this.p;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.p;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            this.p = animatorSet;
            animatorSet.setDuration(i);
            animatorSet.start();
        }
    }

    public final void b(List list) {
        list.getClass();
        int i = 0;
        while (i < 2) {
            List list2 = (List) (i == 0 ? list.get(0) : list.get(list.size() - 1));
            DominoTableView dominoTableView = this.k;
            if (dominoTableView == null) {
                Intrinsics.h("tableView");
                throw null;
            }
            Iterator<qb8> it = dominoTableView.getBones().iterator();
            while (true) {
                if (!it.hasNext()) {
                    Random random = new Random();
                    ArrayList arrayList = this.e;
                    qb8 qb8Var = arrayList.size() == 1 ? (qb8) arrayList.remove(0) : (qb8) arrayList.remove(random.nextInt(arrayList.size() - 1));
                    Context context = getContext();
                    context.getClass();
                    nb8 nb8Var = new nb8(context, this.c, ((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
                    qb8Var.getClass();
                    qb8Var.b = nb8Var;
                    int iIntValue = ((Number) list2.get(0)).intValue();
                    int iIntValue2 = ((Number) list2.get(1)).intValue();
                    qb8Var.p = iIntValue;
                    qb8Var.q = iIntValue2;
                    qb8Var.d = iIntValue == iIntValue2;
                    qb8Var.n = false;
                    DominoTableView dominoTableView2 = this.k;
                    if (dominoTableView2 == null) {
                        Intrinsics.h("tableView");
                        throw null;
                    }
                    dominoTableView2.a(this, qb8Var, this.q, i != 0 ? 1 : 0);
                    a(Response.OK, true);
                    return;
                }
                qb8 next = it.next();
                if (((Number) list2.get(0)).intValue() != next.p || ((Number) list2.get(1)).intValue() != next.q) {
                }
            }
            i++;
        }
    }

    public final void c() {
        Context context = getContext();
        context.getClass();
        qb8 qb8Var = new qb8(context, this.d);
        qb8Var.n = this.q;
        int i = this.g >> 1;
        qb8Var.f28435a.set(-this.h, (getMeasuredWidth() >> 1) - i, 0, (getMeasuredWidth() >> 1) + i);
        this.e.add(qb8Var);
        a(700, true);
    }

    public final int getCenterYFromBottom() {
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop() - getPaddingBottom();
        boolean z = this.q;
        int i = this.g;
        return measuredHeight - ((paddingTop + (z ? getMeasuredHeight() - i : 0)) + (i >> 1));
    }

    public final int getStartYFromBottom() {
        return getMeasuredHeight() - ((getPaddingTop() - getPaddingBottom()) + (this.q ? getMeasuredHeight() - this.g : 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((qb8) it.next()).e(canvas, getMeasuredWidth() >> 1, getMeasuredHeight() >> 1);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a(Response.OK, false);
        this.f46626a = (int) (getMeasuredHeight() - (this.g * 1.4f));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qb8 qb8Var;
        qb8 qb8Var2;
        Rect rect;
        Rect rect2;
        DominoTableView dominoTableView;
        boolean z;
        int i;
        int i2;
        DominoTableView dominoTableView2;
        motionEvent.getClass();
        int action = motionEvent.getAction();
        boolean z2 = this.q;
        if (z2 && this.n && (action != 0 || System.currentTimeMillis() - this.t > 1000)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            ArrayList<qb8> arrayList = this.e;
            qb8 qb8Var3 = null;
            if (action != 0) {
                boolean z3 = this.i;
                if (action != 2) {
                    if (z3 && (qb8Var2 = this.f) != null) {
                        if (y > this.f46626a || !this.n) {
                            AnimatorSet animatorSetC = qb8Var2.c(this);
                            if (animatorSetC != null) {
                                animatorSetC.start();
                            }
                        } else {
                            DominoTableView dominoTableView3 = this.k;
                            if (dominoTableView3 == null) {
                                Intrinsics.h("tableView");
                                throw null;
                            }
                            int headValue = dominoTableView3.getHeadValue();
                            DominoTableView dominoTableView4 = this.k;
                            if (dominoTableView4 == null) {
                                Intrinsics.h("tableView");
                                throw null;
                            }
                            boolean zB = qb8Var2.b(headValue, dominoTableView4.getTailValue());
                            Rect rect3 = qb8Var2.f28435a;
                            if (zB) {
                                rect = new Rect();
                                rect2 = new Rect();
                                getGlobalVisibleRect(rect2);
                                dominoTableView = this.k;
                                if (dominoTableView != null) {
                                    Intrinsics.h("tableView");
                                    throw null;
                                }
                                dominoTableView.getGlobalVisibleRect(rect);
                                z = qb8Var2.k;
                                i = rect2.left;
                                i2 = rect.left;
                                if (z) {
                                    rect3.offset(((i - i2) + ((int) qb8Var2.i)) - rect3.centerX(), ((rect2.top - rect.top) + ((int) qb8Var2.j)) - rect3.centerY());
                                } else {
                                    rect3.offset(i - i2, rect2.top - rect.top);
                                }
                                qb8Var2.k = false;
                                dominoTableView2 = this.k;
                                if (dominoTableView2 != null) {
                                    Intrinsics.h("tableView");
                                    throw null;
                                }
                                dominoTableView2.a(this, qb8Var2, z2, -1);
                                arrayList.remove(qb8Var2);
                                a(Response.OK, true);
                                invalidate();
                            } else {
                                DominoTableView dominoTableView5 = this.k;
                                if (dominoTableView5 == null) {
                                    Intrinsics.h("tableView");
                                    throw null;
                                }
                                if (dominoTableView5.getTailValue() != -1) {
                                    AnimatorSet animatorSetC2 = qb8Var2.c(this);
                                    if (animatorSetC2 != null) {
                                        animatorSetC2.start();
                                    }
                                } else {
                                    rect = new Rect();
                                    rect2 = new Rect();
                                    getGlobalVisibleRect(rect2);
                                    dominoTableView = this.k;
                                    if (dominoTableView != null) {
                                        Intrinsics.h("tableView");
                                        throw null;
                                    }
                                    dominoTableView.getGlobalVisibleRect(rect);
                                    z = qb8Var2.k;
                                    i = rect2.left;
                                    i2 = rect.left;
                                    if (z) {
                                        rect3.offset(((i - i2) + ((int) qb8Var2.i)) - rect3.centerX(), ((rect2.top - rect.top) + ((int) qb8Var2.j)) - rect3.centerY());
                                    } else {
                                        rect3.offset(i - i2, rect2.top - rect.top);
                                    }
                                    qb8Var2.k = false;
                                    dominoTableView2 = this.k;
                                    if (dominoTableView2 != null) {
                                        Intrinsics.h("tableView");
                                        throw null;
                                    }
                                    dominoTableView2.a(this, qb8Var2, z2, -1);
                                    arrayList.remove(qb8Var2);
                                    a(Response.OK, true);
                                    invalidate();
                                }
                            }
                        }
                    }
                    DominoTableView dominoTableView6 = this.k;
                    if (dominoTableView6 == null) {
                        Intrinsics.h("tableView");
                        throw null;
                    }
                    dominoTableView6.l = null;
                    ValueAnimator valueAnimator = dominoTableView6.p;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    dominoTableView6.n = false;
                    dominoTableView6.m = 1.0f;
                    dominoTableView6.invalidate();
                    this.i = false;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((qb8) it.next()).k = false;
                    }
                    postInvalidate();
                    return false;
                }
                if (z3 && (qb8Var = this.f) != null) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    qb8Var.k = true;
                    qb8Var.i = x2;
                    qb8Var.j = y2;
                    DominoTableView dominoTableView7 = this.k;
                    if (dominoTableView7 == null) {
                        Intrinsics.h("tableView");
                        throw null;
                    }
                    vu40 vu40Var = dominoTableView7.g;
                    if (dominoTableView7.b.size() > 1) {
                        if (qb8Var.a(vu40Var.u) && qb8Var.a(vu40Var.v)) {
                            float f = x - dominoTableView7.h;
                            float f2 = y - dominoTableView7.i;
                            qb8 qb8VarC = vu40Var.c();
                            int iPow = (int) (Math.pow((qb8VarC != null ? qb8VarC.f28435a.centerY() : 0) - f2, 2.0d) + Math.pow((qb8VarC != null ? qb8VarC.f28435a.centerX() : 0) - f, 2.0d));
                            qb8 qb8VarB = vu40Var.b();
                            int iPow2 = (int) (Math.pow((qb8VarB != null ? qb8VarB.f28435a.centerY() : 0) - f2, 2.0d) + Math.pow((qb8VarB != null ? qb8VarB.f28435a.centerX() : 0) - f, 2.0d));
                            if (qb8VarB != null) {
                                qb8VarB.f = false;
                            }
                            if (qb8VarC != null) {
                                qb8VarC.f = false;
                            }
                            if (iPow > iPow2) {
                                qb8VarC = qb8VarB;
                            }
                            dominoTableView7.l = qb8VarC;
                            if (qb8VarC != null) {
                                qb8VarC.f = true;
                            }
                            dominoTableView7.invalidate();
                        } else if (qb8Var.a(vu40Var.v)) {
                            dominoTableView7.l = vu40Var.c();
                        } else if (qb8Var.a(vu40Var.u)) {
                            dominoTableView7.l = vu40Var.b();
                        }
                        if (true != dominoTableView7.n) {
                            ValueAnimator valueAnimator2 = dominoTableView7.p;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            for (qb8 qb8Var4 : dominoTableView7.b) {
                                if (qb8Var4 != dominoTableView7.l) {
                                    qb8Var4.f = false;
                                } else {
                                    qb8Var4.f = true;
                                }
                            }
                            dominoTableView7.n = true;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(dominoTableView7.m, 0.3f);
                            dominoTableView7.p = valueAnimatorOfFloat;
                            if (valueAnimatorOfFloat != null) {
                                valueAnimatorOfFloat.addUpdateListener(new fd5(dominoTableView7, (byte) 10));
                            }
                            ValueAnimator valueAnimator3 = dominoTableView7.p;
                            if (valueAnimator3 != null) {
                                valueAnimator3.start();
                            }
                        }
                    }
                    invalidate();
                    return true;
                }
            } else if (y > this.f46626a) {
                this.t = System.currentTimeMillis();
                for (qb8 qb8Var5 : arrayList) {
                    Rect rect4 = qb8Var5.f28435a;
                    if (x > rect4.left && x < rect4.right) {
                        if (!qb8Var5.s) {
                            break;
                        }
                        qb8Var3 = qb8Var5;
                        break;
                    }
                }
                this.f = qb8Var3;
                if (qb8Var3 != null) {
                    this.i = true;
                    return true;
                }
            }
        }
        return false;
    }

    public final void setBones(List<? extends List<Integer>> list) {
        list.getClass();
        ArrayList arrayList = this.e;
        arrayList.clear();
        for (List<Integer> list2 : list) {
            Context context = getContext();
            context.getClass();
            qb8 qb8Var = new qb8(context, this.b, list2.get(0).intValue(), list2.get(1).intValue());
            qb8Var.n = this.q;
            arrayList.add(qb8Var);
        }
        a(Response.OK, false);
        invalidate();
    }

    public final void setBonesOverflowListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.s = function1;
    }

    public final void setOpponentBones(List<? extends List<Integer>> list) {
        list.getClass();
        this.b = this.c;
        this.u = (int) (((double) this.g) * 0.55d);
        if (list.isEmpty()) {
            return;
        }
        setBones(list);
    }

    public final void setTable(DominoTableView dominoTableView) {
        dominoTableView.getClass();
        this.k = dominoTableView;
    }

    public final void setBones(int i) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        for (int i2 = 0; i2 < i; i2++) {
            Context context = getContext();
            context.getClass();
            qb8 qb8Var = new qb8(context, this.b);
            qb8Var.n = this.q;
            arrayList.add(qb8Var);
        }
        a(Response.OK, false);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DominoHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DominoHandView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
