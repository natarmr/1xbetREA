package a;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class vyx extends fhe0 implements ihe0 {
    public long A;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final syx m;
    public int o;
    public RecyclerView q;
    public VelocityTracker s;
    public ArrayList t;
    public ArrayList u;
    public GestureDetector w;
    public tyx x;
    public Rect z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38271a = new ArrayList();
    public final float[] b = new float[2];
    public xhe0 c = null;
    public int l = -1;
    public byte n = 0;
    public final ArrayList p = new ArrayList();
    public final mx2 r = new mx2(this, 17);
    public View v = null;
    public final pyx y = new pyx(this);

    public vyx(syx syxVar) {
        this.m = syxVar;
    }

    public static boolean p(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // a.ihe0
    public final void b(View view) {
        if (view == this.v) {
            this.v = null;
        }
        xhe0 xhe0VarW = this.q.W(view);
        if (xhe0VarW == null) {
            return;
        }
        xhe0 xhe0Var = this.c;
        if (xhe0Var != null && xhe0VarW == xhe0Var) {
            r(null, 0);
            return;
        }
        m(xhe0VarW, false);
        if (this.f38271a.remove(xhe0VarW.f40887a)) {
            this.m.getClass();
            syx.d(xhe0VarW);
        }
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        rect.setEmpty();
    }

    @Override // a.fhe0
    public final void g(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        xhe0 xhe0Var = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qyx qyxVar = (qyx) arrayList.get(i);
            xhe0 xhe0Var2 = qyxVar.e;
            float f3 = qyxVar.f29555a;
            float f4 = qyxVar.c;
            if (f3 == f4) {
                qyxVar.i = xhe0Var2.f40887a.getTranslationX();
            } else {
                qyxVar.i = rw2.a(f4, f3, qyxVar.m, f3);
            }
            float f5 = qyxVar.b;
            float f6 = qyxVar.d;
            if (f5 == f6) {
                qyxVar.j = xhe0Var2.f40887a.getTranslationY();
            } else {
                qyxVar.j = rw2.a(f6, f5, qyxVar.m, f5);
            }
            int iSave = canvas.save();
            syx.r(recyclerView, qyxVar.e, qyxVar.i, qyxVar.j, false);
            canvas.restoreToCount(iSave);
        }
        if (xhe0Var != null) {
            int iSave2 = canvas.save();
            syx.r(recyclerView, xhe0Var, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // a.fhe0
    public final void h(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        xhe0 xhe0Var = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qyx qyxVar = (qyx) arrayList.get(i);
            int iSave = canvas.save();
            View view = qyxVar.e.f40887a;
            canvas.restoreToCount(iSave);
        }
        if (xhe0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            qyx qyxVar2 = (qyx) arrayList.get(i2);
            boolean z2 = qyxVar2.l;
            if (z2 && !qyxVar2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.q;
        if (recyclerView2 == recyclerView) {
            return;
        }
        pyx pyxVar = this.y;
        if (recyclerView2 != null) {
            recyclerView2.s0(this);
            RecyclerView recyclerView3 = this.q;
            recyclerView3.q.remove(pyxVar);
            if (recyclerView3.r == pyxVar) {
                recyclerView3.r = null;
            }
            ArrayList arrayList = this.q.f1;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                qyx qyxVar = (qyx) arrayList2.get(0);
                qyxVar.g.cancel();
                xhe0 xhe0Var = qyxVar.e;
                this.m.getClass();
                syx.d(xhe0Var);
            }
            arrayList2.clear();
            this.v = null;
            VelocityTracker velocityTracker = this.s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.s = null;
            }
            tyx tyxVar = this.x;
            if (tyxVar != null) {
                tyxVar.f34778a = false;
                this.x = null;
            }
            if (this.w != null) {
                this.w = null;
            }
        }
        this.q = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            ViewConfiguration.get(this.q.getContext()).getScaledTouchSlop();
            this.q.m(this);
            this.q.n(pyxVar);
            RecyclerView recyclerView4 = this.q;
            ArrayList arrayList3 = recyclerView4.f1;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                recyclerView4.f1 = arrayList3;
            }
            arrayList3.add(this);
            this.x = new tyx(this);
            this.w = new GestureDetector(this.q.getContext(), this.x);
        }
    }

    public final int j(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.s;
        syx syxVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            syxVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.s.getXVelocity(this.l);
            float yVelocity = this.s.getYVelocity(this.l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.q.getWidth();
        syxVar.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.h) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void k(int i, int i2, MotionEvent motionEvent) {
        if (this.c == null && i == 2 && this.n != 2) {
            this.m.getClass();
        }
    }

    public final int l(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.s;
        syx syxVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            syxVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.s.getXVelocity(this.l);
            float yVelocity = this.s.getYVelocity(this.l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.q.getHeight();
        syxVar.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.i) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void m(xhe0 xhe0Var, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qyx qyxVar = (qyx) arrayList.get(size);
            if (qyxVar.e == xhe0Var) {
                qyxVar.k |= z;
                if (!qyxVar.l) {
                    qyxVar.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        xhe0 xhe0Var = this.c;
        if (xhe0Var != null) {
            View view = xhe0Var.f40887a;
            if (p(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qyx qyxVar = (qyx) arrayList.get(size);
            View view2 = qyxVar.e.f40887a;
            if (p(view2, x, y, qyxVar.i, qyxVar.j)) {
                return view2;
            }
        }
        return this.q.J(x, y);
    }

    public final void o(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.f40887a.getLeft();
        } else {
            fArr[0] = this.c.f40887a.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.f40887a.getTop();
        } else {
            fArr[1] = this.c.f40887a.getTranslationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(xhe0 xhe0Var) {
        ArrayList arrayList;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        int i2;
        int i3;
        if (!this.q.isLayoutRequested() && this.n == 2) {
            syx syxVar = this.m;
            syxVar.getClass();
            int i4 = (int) (this.j + this.h);
            int i5 = (int) (this.k + this.i);
            View view = xhe0Var.f40887a;
            if (Math.abs(i5 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i4 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.t;
                if (arrayList2 == null) {
                    this.t = new ArrayList();
                    this.u = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.u.clear();
                }
                int iRound = Math.round(this.j + this.h);
                int iRound2 = Math.round(this.k + this.i);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i6 = (iRound + width) / 2;
                int i7 = (iRound2 + height) / 2;
                androidx.recyclerview.widget.b layoutManager = this.q.getLayoutManager();
                int I = layoutManager.I();
                int i8 = 0;
                while (i8 < I) {
                    View viewH = layoutManager.H(i8);
                    if (viewH == view) {
                        i = i8;
                    } else {
                        i = i8;
                        if (viewH.getBottom() >= iRound2 && viewH.getTop() <= height && viewH.getRight() >= iRound && viewH.getLeft() <= width) {
                            xhe0 xhe0VarW = this.q.W(viewH);
                            i2 = i4;
                            i3 = i5;
                            if (syxVar.c(this.q, this.c, xhe0VarW)) {
                                int iAbs5 = Math.abs(i6 - ((viewH.getRight() + viewH.getLeft()) / 2));
                                int iAbs6 = Math.abs(i7 - ((viewH.getBottom() + viewH.getTop()) / 2));
                                int i9 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                                int size = this.t.size();
                                int i10 = 0;
                                int i11 = 0;
                                while (i11 < size) {
                                    int i12 = size;
                                    if (i9 <= ((Integer) this.u.get(i11)).intValue()) {
                                        break;
                                    }
                                    i10++;
                                    i11++;
                                    size = i12;
                                }
                                this.t.add(i10, xhe0VarW);
                                this.u.add(i10, Integer.valueOf(i9));
                            }
                            i8 = i + 1;
                            i4 = i2;
                            i5 = i3;
                            iRound = iRound;
                        }
                        i8 = i + 1;
                        i4 = i2;
                        i5 = i3;
                        iRound = iRound;
                    }
                    i2 = i4;
                    i3 = i5;
                    i8 = i + 1;
                    i4 = i2;
                    i5 = i3;
                    iRound = iRound;
                }
                int i13 = i4;
                int i14 = i5;
                ArrayList arrayList3 = this.t;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i13;
                int height2 = view.getHeight() + i14;
                int left2 = i13 - view.getLeft();
                int top2 = i14 - view.getTop();
                int size2 = arrayList3.size();
                xhe0 xhe0Var2 = null;
                int i15 = -1;
                int i16 = 0;
                while (i16 < size2) {
                    xhe0 xhe0Var3 = (xhe0) arrayList3.get(i16);
                    if (left2 <= 0 || (right = xhe0Var3.f40887a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (xhe0Var3.f40887a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i15) {
                            i15 = iAbs4;
                            xhe0Var2 = xhe0Var3;
                        }
                    }
                    if (left2 < 0 && (left = xhe0Var3.f40887a.getLeft() - i13) > 0 && xhe0Var3.f40887a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i15) {
                        i15 = iAbs3;
                        xhe0Var2 = xhe0Var3;
                    }
                    if (top2 < 0 && (top = xhe0Var3.f40887a.getTop() - i14) > 0 && xhe0Var3.f40887a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i15) {
                        i15 = iAbs2;
                        xhe0Var2 = xhe0Var3;
                    }
                    if (top2 > 0 && (bottom = xhe0Var3.f40887a.getBottom() - height2) < 0 && xhe0Var3.f40887a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i15) {
                        i15 = iAbs;
                        xhe0Var2 = xhe0Var3;
                    }
                    i16++;
                    arrayList3 = arrayList;
                }
                if (xhe0Var2 == null) {
                    this.t.clear();
                    this.u.clear();
                    return;
                }
                View view2 = xhe0Var2.f40887a;
                int iC = xhe0Var2.c();
                xhe0Var.c();
                if (syxVar.s(this.q, xhe0Var, xhe0Var2)) {
                    RecyclerView recyclerView = this.q;
                    androidx.recyclerview.widget.b layoutManager2 = recyclerView.getLayoutManager();
                    if (!(layoutManager2 instanceof uyx)) {
                        if (layoutManager2.q()) {
                            if (androidx.recyclerview.widget.b.N(view2) <= recyclerView.getPaddingLeft()) {
                                recyclerView.y0(iC);
                            }
                            if (androidx.recyclerview.widget.b.Q(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.y0(iC);
                            }
                        }
                        if (layoutManager2.r()) {
                            if (androidx.recyclerview.widget.b.R(view2) <= recyclerView.getPaddingTop()) {
                                recyclerView.y0(iC);
                            }
                            if (androidx.recyclerview.widget.b.L(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.y0(iC);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((uyx) layoutManager2);
                    linearLayoutManager.n("Cannot drop a view during a scroll or layout calculation");
                    linearLayoutManager.a1();
                    linearLayoutManager.u1();
                    int iT = androidx.recyclerview.widget.b.T(view);
                    int iT2 = androidx.recyclerview.widget.b.T(view2);
                    byte b = iT < iT2 ? (byte) 1 : (byte) -1;
                    boolean z = linearLayoutManager.u;
                    pa80 pa80Var = linearLayoutManager.r;
                    if (z) {
                        if (b == 1) {
                            linearLayoutManager.w1(iT2, pa80Var.i() - (linearLayoutManager.r.e(view) + linearLayoutManager.r.g(view2)));
                            return;
                        } else {
                            linearLayoutManager.w1(iT2, pa80Var.i() - linearLayoutManager.r.d(view2));
                            return;
                        }
                    }
                    if (b == -1) {
                        linearLayoutManager.w1(iT2, pa80Var.g(view2));
                    } else {
                        linearLayoutManager.w1(iT2, pa80Var.d(view2) - linearLayoutManager.r.e(view));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [a.syx] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r23v0, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.xhe0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [a.syx] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.syx] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r(xhe0 xhe0Var, int i) {
        ?? r18;
        ?? r12;
        boolean z;
        ?? r3;
        ?? r13;
        xhe0 xhe0Var2;
        boolean z2;
        ?? r19;
        int iL;
        char c;
        float fSignum;
        Object obj;
        long j;
        if (xhe0Var == this.c && i == this.n) {
            return;
        }
        this.A = Long.MIN_VALUE;
        byte b = this.n;
        m(xhe0Var, true);
        this.n = i;
        if (i == 2) {
            if (xhe0Var == null) {
                jf4.o("Must pass a ViewHolder when dragging");
                return;
            }
            this.v = xhe0Var.f40887a;
        }
        int i2 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.c;
        ?? r0 = this.m;
        if (r2 != 0) {
            View view = r2.f40887a;
            if (view.getParent() != null) {
                if (b == 2 || this.n == 2) {
                    iL = 0;
                } else {
                    int iN = r0.n(this.q, r2);
                    int iF = (syx.f(iN, this.q.getLayoutDirection()) & 65280) >> 8;
                    if (iF == 0) {
                        iL = 0;
                    } else {
                        int i3 = (iN & 65280) >> 8;
                        if (Math.abs(this.h) > Math.abs(this.i)) {
                            iL = j(iF);
                            if (iL <= 0) {
                                iL = l(iF);
                                if (iL <= 0) {
                                    iL = 0;
                                }
                            } else if ((i3 & iL) == 0) {
                                iL = syx.i(iL, this.q.getLayoutDirection());
                            }
                        } else {
                            iL = l(iF);
                            if (iL <= 0) {
                                iL = j(iF);
                                if (iL <= 0) {
                                    iL = 0;
                                } else if ((i3 & iL) == 0) {
                                    iL = syx.i(iL, this.q.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.s;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.s = null;
                }
                char c2 = 4;
                float fSignum2 = 0.0f;
                if (iL == 1 || iL == 2) {
                    c = 0;
                    fSignum = Math.signum(this.i) * this.q.getHeight();
                    obj = null;
                } else if (iL == 4 || iL == 8 || iL == 16 || iL == 32) {
                    c = 0;
                    obj = null;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.h) * this.q.getWidth();
                } else {
                    obj = null;
                    c = 0;
                    fSignum = 0.0f;
                }
                if (b == 2) {
                    c2 = '\b';
                } else if (iL > 0) {
                    c2 = 2;
                }
                float[] fArr = this.b;
                o(fArr);
                ?? r110 = r0;
                char c3 = c2;
                ?? r14 = c;
                qyx qyxVar = new qyx(this, r2, b, fArr[c], fArr[1], fSignum2, fSignum, iL, r2);
                RecyclerView recyclerView = this.q;
                r110.getClass();
                ehe0 itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator == null) {
                    j = c3 == '\b' ? 200L : 250L;
                } else {
                    j = c3 == '\b' ? itemAnimator.e : itemAnimator.d;
                }
                ValueAnimator valueAnimator = qyxVar.g;
                valueAnimator.setDuration(j);
                this.p.add(qyxVar);
                r2.q(r14);
                valueAnimator.start();
                z2 = true;
                xhe0Var2 = null;
                r13 = r14;
                r19 = r110;
            } else {
                ?? r111 = r0;
                r13 = 0;
                if (view == this.v) {
                    xhe0Var2 = null;
                    this.v = null;
                } else {
                    xhe0Var2 = null;
                }
                r111.getClass();
                syx.d(r2);
                z2 = false;
                r19 = r111;
            }
            this.c = xhe0Var2;
            z = z2;
            r12 = r13;
            r18 = r19;
        } else {
            r18 = r0;
            r12 = 0;
            z = false;
        }
        if (xhe0Var != null) {
            View view2 = xhe0Var.f40887a;
            RecyclerView recyclerView2 = this.q;
            ?? r4 = r18;
            this.o = (syx.f(r4.n(recyclerView2, xhe0Var), recyclerView2.getLayoutDirection()) & i2) >> (this.n * 8);
            this.j = view2.getLeft();
            this.k = view2.getTop();
            this.c = xhe0Var;
            r3 = r4;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
                r3 = r4;
            }
        } else {
            r3 = r18;
        }
        ?? parent = this.q.getParent();
        if (parent != 0) {
            ?? r15 = r12;
            if (this.c != null) {
                r15 = 1;
            }
            parent.requestDisallowInterceptTouchEvent(r15);
        }
        if (!z) {
            this.q.getLayoutManager().f = true;
        }
        r3.t(this.c, this.n);
        this.q.invalidate();
    }

    public final void s(xhe0 xhe0Var) {
        RecyclerView recyclerView = this.q;
        if ((syx.f(this.m.n(recyclerView, xhe0Var), recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (xhe0Var.f40887a.getParent() != this.q) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.s = VelocityTracker.obtain();
        this.i = 0.0f;
        this.h = 0.0f;
        r(xhe0Var, 2);
    }

    public final void t(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.d;
        this.h = fMax;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.h = fMax;
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override // a.ihe0
    public final void d(View view) {
    }
}
