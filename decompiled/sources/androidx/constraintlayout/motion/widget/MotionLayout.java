package androidx.constraintlayout.motion.widget;

import a.as40;
import a.aw3;
import a.axq;
import a.b1j;
import a.ds40;
import a.e46;
import a.eju0;
import a.f140;
import a.f8m0;
import a.fhn;
import a.fqd0;
import a.fwr0;
import a.g8m0;
import a.gly;
import a.h03;
import a.h3e;
import a.h8m0;
import a.i3e;
import a.k4e;
import a.kk50;
import a.kng0;
import a.kpb;
import a.l4e;
import a.mx2;
import a.oul0;
import a.ozb;
import a.p8l;
import a.ps40;
import a.pt40;
import a.qaq0;
import a.r3e;
import a.s9m0;
import a.tqm0;
import a.twn;
import a.ulu0;
import a.us40;
import a.ut40;
import a.vjy;
import a.vkr0;
import a.vlu0;
import a.vqm0;
import a.vs40;
import a.vt40;
import a.ws40;
import a.wt40;
import a.x23;
import a.xs40;
import a.ys40;
import a.zfk;
import a.zs40;
import a.zzk0;
import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements kk50 {
    public static boolean Y1;
    public HashMap A;
    public int A1;
    public long B;
    public long B1;
    public float C1;
    public boolean D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public float K1;
    public vjy L1;
    public boolean M1;
    public xs40 N1;
    public qaq0 O1;
    public Rect P1;
    public boolean Q1;
    public zs40 R1;
    public ws40 S1;
    public boolean U1;
    public RectF V1;
    public View W1;
    public Matrix X1;
    public float f1;
    public float g1;
    public float h1;
    public long i1;
    public float j1;
    public boolean k1;
    public boolean l1;
    public int m1;
    public p8l n1;
    public boolean o1;
    public tqm0 p1;
    public wt40 q;
    public vs40 q1;
    public ps40 r;
    public zfk r1;
    public Interpolator s;
    public int s1;
    public float t;
    public int t1;
    public int u;
    public boolean u1;
    public int v;
    public float v1;
    public int w;
    public float w1;
    public int x;
    public long x1;
    public int y;
    public float y1;
    public boolean z;
    public boolean z1;

    public MotionLayout(Context context) {
        super(context);
        this.s = null;
        this.t = 0.0f;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = new HashMap();
        this.B = 0L;
        this.f1 = 1.0f;
        this.g1 = 0.0f;
        this.h1 = 0.0f;
        this.j1 = 0.0f;
        this.l1 = false;
        this.m1 = 0;
        this.o1 = false;
        this.p1 = new tqm0();
        this.q1 = new vs40(this);
        this.u1 = false;
        this.z1 = false;
        this.A1 = 0;
        this.B1 = -1L;
        this.C1 = 0.0f;
        this.D1 = false;
        this.L1 = new vjy((byte) 0);
        this.M1 = false;
        this.O1 = null;
        new HashMap();
        this.P1 = new Rect();
        this.Q1 = false;
        this.R1 = zs40.f44890a;
        this.S1 = new ws40(this);
        this.U1 = false;
        this.V1 = new RectF();
        this.W1 = null;
        this.X1 = null;
        new ArrayList();
        z(null);
    }

    public final void A() {
        vt40 vt40Var;
        fwr0 fwr0Var;
        View viewFindViewById;
        wt40 wt40Var = this.q;
        if (wt40Var == null) {
            return;
        }
        if (wt40Var.a(this.v, this)) {
            requestLayout();
            return;
        }
        int i = this.v;
        if (i != -1) {
            wt40 wt40Var2 = this.q;
            ArrayList<vt40> arrayList = wt40Var2.f;
            ArrayList<vt40> arrayList2 = wt40Var2.d;
            for (vt40 vt40Var2 : arrayList2) {
                if (vt40Var2.m.size() > 0) {
                    Iterator it = vt40Var2.m.iterator();
                    while (it.hasNext()) {
                        ((ut40) it.next()).b(this);
                    }
                }
            }
            for (vt40 vt40Var3 : arrayList) {
                if (vt40Var3.m.size() > 0) {
                    Iterator it2 = vt40Var3.m.iterator();
                    while (it2.hasNext()) {
                        ((ut40) it2.next()).b(this);
                    }
                }
            }
            for (vt40 vt40Var4 : arrayList2) {
                if (vt40Var4.m.size() > 0) {
                    Iterator it3 = vt40Var4.m.iterator();
                    while (it3.hasNext()) {
                        ((ut40) it3.next()).a(this, i, vt40Var4);
                    }
                }
            }
            for (vt40 vt40Var5 : arrayList) {
                if (vt40Var5.m.size() > 0) {
                    Iterator it4 = vt40Var5.m.iterator();
                    while (it4.hasNext()) {
                        ((ut40) it4.next()).a(this, i, vt40Var5);
                    }
                }
            }
        }
        if (!this.q.n() || (vt40Var = this.q.c) == null || (fwr0Var = vt40Var.l) == null) {
            return;
        }
        MotionLayout motionLayout = fwr0Var.r;
        int i2 = fwr0Var.d;
        if (i2 != -1) {
            viewFindViewById = motionLayout.findViewById(i2);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + ozb.T(fwr0Var.d, motionLayout.getContext()));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new e46((byte) 2));
            nestedScrollView.setOnScrollChangeListener(new s9m0());
        }
    }

    public final void B() {
        this.S1.f();
        invalidate();
    }

    public final void C(int i) throws Throwable {
        setState(zs40.b);
        this.v = i;
        this.u = -1;
        this.w = -1;
        x23 x23Var = this.k;
        if (x23Var == null) {
            wt40 wt40Var = this.q;
            if (wt40Var != null) {
                wt40Var.b(i).b(this);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) x23Var.c;
        SparseArray sparseArray = (SparseArray) x23Var.d;
        int i2 = x23Var.f40148a;
        int i3 = 0;
        if (i2 != i) {
            x23Var.f40148a = i;
            h3e h3eVar = (h3e) sparseArray.get(i);
            ArrayList arrayList = h3eVar.b;
            while (true) {
                if (i3 >= arrayList.size()) {
                    i3 = -1;
                    break;
                } else if (((i3e) arrayList.get(i3)).a(-1.0f, -1.0f)) {
                    break;
                } else {
                    i3++;
                }
            }
            ArrayList arrayList2 = h3eVar.b;
            r3e r3eVar = i3 == -1 ? h3eVar.d : ((i3e) arrayList2.get(i3)).f;
            if (i3 != -1) {
                int i4 = ((i3e) arrayList2.get(i3)).e;
            }
            if (r3eVar != null) {
                x23Var.b = i3;
                r3eVar.b(constraintLayout);
                return;
            } else {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =-1.0, -1.0");
                return;
            }
        }
        h3e h3eVar2 = i == -1 ? (h3e) sparseArray.valueAt(0) : (h3e) sparseArray.get(i2);
        int i5 = x23Var.b;
        if (i5 == -1 || !((i3e) h3eVar2.b.get(i5)).a(-1.0f, -1.0f)) {
            ArrayList arrayList3 = h3eVar2.b;
            while (true) {
                if (i3 >= arrayList3.size()) {
                    i3 = -1;
                    break;
                } else if (((i3e) arrayList3.get(i3)).a(-1.0f, -1.0f)) {
                    break;
                } else {
                    i3++;
                }
            }
            ArrayList arrayList4 = h3eVar2.b;
            if (x23Var.b == i3) {
                return;
            }
            r3e r3eVar2 = i3 == -1 ? null : ((i3e) arrayList4.get(i3)).f;
            if (i3 != -1) {
                int i6 = ((i3e) arrayList4.get(i3)).e;
            }
            if (r3eVar2 == null) {
                return;
            }
            x23Var.b = i3;
            r3eVar2.b(constraintLayout);
        }
    }

    public final void D(int i, int i2) {
        if (!isAttachedToWindow()) {
            xs40 xs40Var = this.N1;
            if (xs40Var == null) {
                xs40Var = new xs40(this);
                this.N1 = xs40Var;
            }
            xs40Var.c = i;
            xs40Var.d = i2;
            return;
        }
        wt40 wt40Var = this.q;
        if (wt40Var != null) {
            this.u = i;
            this.w = i2;
            wt40Var.m(i, i2);
            this.S1.e(this.q.b(i), this.q.b(i2));
            B();
            this.h1 = 0.0f;
            u(0.0f);
        }
    }

    public final Rect E(k4e k4eVar) {
        Rect rect = this.P1;
        rect.top = k4eVar.u();
        rect.left = k4eVar.t();
        rect.right = k4eVar.s() + rect.left;
        rect.bottom = k4eVar.m() + rect.top;
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    public final void F(float f, float f2, int i) {
        float f3;
        float f4;
        boolean z;
        fwr0 fwr0Var;
        fwr0 fwr0Var2;
        fwr0 fwr0Var3;
        fwr0 fwr0Var4;
        fwr0 fwr0Var5;
        boolean z2;
        fwr0 fwr0Var6;
        fwr0 fwr0Var7;
        float f5;
        float f6;
        float f7;
        vt40 vt40Var;
        float f8;
        vqm0 vqm0Var;
        fwr0 fwr0Var8;
        tqm0 tqm0Var = this.p1;
        vs40 vs40Var = this.q1;
        if (this.q == null || this.h1 == f) {
            return;
        }
        this.o1 = true;
        this.B = getNanoTime();
        wt40 wt40Var = this.q;
        vt40 vt40Var2 = wt40Var.c;
        float f9 = (vt40Var2 != null ? vt40Var2.h : wt40Var.j) / 1000.0f;
        this.f1 = f9;
        this.j1 = f;
        this.l1 = true;
        float f10 = 0.0f;
        if (i != 0 && i != 1 && i != 2) {
            f3 = 1.0f;
            if (i == 4) {
                float f11 = this.h1;
                float f12 = wt40Var.f();
                vs40Var.f37932a = f2;
                vs40Var.b = f11;
                vs40Var.c = f12;
                this.r = vs40Var;
            } else {
                if (i != 5) {
                    if (i == 6 || i == 7) {
                    }
                    this.k1 = z;
                    this.B = getNanoTime();
                    invalidate();
                }
                float f13 = this.h1;
                float f14 = wt40Var.f();
                if (f2 > 0.0f) {
                    float f15 = f2 / f14;
                    if (((f2 * f15) - (((f14 * f15) * f15) / 2.0f)) + f13 > 1.0f) {
                        float f16 = this.h1;
                        float f17 = this.q.f();
                        vs40Var.f37932a = f2;
                        vs40Var.b = f16;
                        vs40Var.c = f17;
                        this.r = vs40Var;
                    } else {
                        f5 = this.h1;
                        f6 = this.f1;
                        f7 = this.q.f();
                        vt40Var = this.q.c;
                        if (vt40Var != null || (fwr0Var8 = vt40Var.l) == null) {
                            f8 = 0.0f;
                        } else {
                            f8 = fwr0Var8.s;
                        }
                        vqm0Var = tqm0Var.f34388a;
                        tqm0Var.c = vqm0Var;
                        vqm0Var.l = f5;
                        z2 = f5 > f;
                        vqm0Var.k = z2;
                        if (z2) {
                            vqm0Var.d(-f2, f5 - f, f7, f8, f6);
                        } else {
                            vqm0Var.d(f2, f - f5, f7, f8, f6);
                        }
                        this.t = 0.0f;
                        int i2 = this.v;
                        this.j1 = f;
                        this.v = i2;
                        this.r = tqm0Var;
                    }
                } else {
                    float f18 = (-f2) / f14;
                    if ((((f14 * f18) * f18) / 2.0f) + (f2 * f18) + f13 < 0.0f) {
                        float f19 = this.h1;
                        float f110 = this.q.f();
                        vs40Var.f37932a = f2;
                        vs40Var.b = f19;
                        vs40Var.c = f110;
                        this.r = vs40Var;
                    } else {
                        f5 = this.h1;
                        f6 = this.f1;
                        f7 = this.q.f();
                        vt40Var = this.q.c;
                        if (vt40Var != null) {
                            f8 = 0.0f;
                        } else {
                            f8 = 0.0f;
                        }
                        vqm0Var = tqm0Var.f34388a;
                        tqm0Var.c = vqm0Var;
                        vqm0Var.l = f5;
                        if (f5 > f) {
                        }
                        vqm0Var.k = z2;
                        if (z2) {
                            vqm0Var.d(-f2, f5 - f, f7, f8, f6);
                        } else {
                            vqm0Var.d(f2, f - f5, f7, f8, f6);
                        }
                        this.t = 0.0f;
                        int i3 = this.v;
                        this.j1 = f;
                        this.v = i3;
                        this.r = tqm0Var;
                    }
                }
            }
            z = false;
            this.k1 = z;
            this.B = getNanoTime();
            invalidate();
        }
        f3 = 1.0f;
        if (i == 1 || i == 7) {
            f4 = 0.0f;
        } else {
            f4 = (i == 2 || i == 6) ? f3 : f;
        }
        int i4 = (vt40Var2 == null || (fwr0Var7 = vt40Var2.l) == null) ? 0 : fwr0Var7.D;
        float f20 = this.h1;
        if (i4 == 0) {
            float f21 = wt40Var.f();
            vt40 vt40Var3 = this.q.c;
            if (vt40Var3 != null && (fwr0Var6 = vt40Var3.l) != null) {
                f10 = fwr0Var6.s;
            }
            vqm0 vqm0Var2 = tqm0Var.f34388a;
            tqm0Var.c = vqm0Var2;
            vqm0Var2.l = f20;
            z2 = f20 > f4;
            vqm0Var2.k = z2;
            if (z2) {
                z = false;
                vqm0Var2.d(-f2, f20 - f4, f21, f10, f9);
            } else {
                z = false;
                vqm0Var2.d(f2, f4 - f20, f21, f10, f9);
            }
        } else {
            z = false;
            float f22 = (vt40Var2 == null || (fwr0Var5 = vt40Var2.l) == null) ? 0.0f : fwr0Var5.z;
            float f23 = (vt40Var2 == null || (fwr0Var4 = vt40Var2.l) == null) ? 0.0f : fwr0Var4.A;
            float f24 = (vt40Var2 == null || (fwr0Var3 = vt40Var2.l) == null) ? 0.0f : fwr0Var3.y;
            float f25 = (vt40Var2 == null || (fwr0Var2 = vt40Var2.l) == null) ? 0.0f : fwr0Var2.B;
            int i5 = (vt40Var2 == null || (fwr0Var = vt40Var2.l) == null) ? 0 : fwr0Var.C;
            oul0 oul0Var = tqm0Var.b;
            if (oul0Var == null) {
                oul0Var = new oul0();
                tqm0Var.b = oul0Var;
            }
            tqm0Var.c = oul0Var;
            oul0Var.c = f4;
            oul0Var.f25883a = f24;
            oul0Var.e = f20;
            oul0Var.b = f23;
            oul0Var.g = f22;
            oul0Var.h = f25;
            oul0Var.i = i5;
            oul0Var.d = 0.0f;
        }
        int i6 = this.v;
        this.j1 = f4;
        this.v = i6;
        this.r = tqm0Var;
        this.k1 = z;
        this.B = getNanoTime();
        invalidate();
    }

    public final void G(int i) {
        h8m0 h8m0Var;
        if (!isAttachedToWindow()) {
            xs40 xs40Var = this.N1;
            if (xs40Var == null) {
                xs40Var = new xs40(this);
                this.N1 = xs40Var;
            }
            xs40Var.d = i;
            return;
        }
        ws40 ws40Var = this.S1;
        HashMap map = this.A;
        wt40 wt40Var = this.q;
        if (wt40Var != null && (h8m0Var = wt40Var.b) != null) {
            int i2 = this.v;
            f8m0 f8m0Var = (f8m0) h8m0Var.f12634a.get(i);
            if (f8m0Var != null) {
                ArrayList arrayList = f8m0Var.b;
                int i3 = f8m0Var.c;
                if (i3 != i2) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            i2 = i3;
                            break;
                        }
                    } while (i2 != ((g8m0) it.next()).e);
                }
            } else {
                i2 = i;
            }
            if (i2 != -1) {
                i = i2;
            }
        }
        int i4 = this.v;
        if (i4 == i) {
            return;
        }
        if (this.u == i) {
            u(0.0f);
            return;
        }
        if (this.w == i) {
            u(1.0f);
            return;
        }
        this.w = i;
        if (i4 != -1) {
            D(i4, i);
            u(1.0f);
            this.h1 = 0.0f;
            u(1.0f);
            this.O1 = null;
            return;
        }
        this.o1 = false;
        this.j1 = 1.0f;
        this.g1 = 0.0f;
        this.h1 = 0.0f;
        this.i1 = getNanoTime();
        this.B = getNanoTime();
        this.k1 = false;
        this.r = null;
        wt40 wt40Var2 = this.q;
        vt40 vt40Var = wt40Var2.c;
        this.f1 = (vt40Var != null ? vt40Var.h : wt40Var2.j) / 1000.0f;
        this.u = -1;
        wt40Var2.m(-1, this.w);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        map.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            map.put(childAt, new ds40(childAt));
            sparseArray.put(childAt.getId(), (ds40) map.get(childAt));
        }
        this.l1 = true;
        ws40Var.e(null, this.q.b(i));
        B();
        ws40Var.a();
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            ds40 ds40Var = (ds40) map.get(childAt2);
            if (ds40Var != null) {
                pt40 pt40Var = ds40Var.f;
                pt40Var.c = 0.0f;
                pt40Var.d = 0.0f;
                pt40Var.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                as40 as40Var = ds40Var.h;
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                as40Var.c = childAt2.getVisibility();
                as40Var.e = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                as40Var.f = childAt2.getElevation();
                as40Var.g = childAt2.getRotation();
                as40Var.h = childAt2.getRotationX();
                as40Var.f1376a = childAt2.getRotationY();
                as40Var.i = childAt2.getScaleX();
                as40Var.j = childAt2.getScaleY();
                as40Var.k = childAt2.getPivotX();
                as40Var.l = childAt2.getPivotY();
                as40Var.m = childAt2.getTranslationX();
                as40Var.n = childAt2.getTranslationY();
                as40Var.o = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i7 = 0; i7 < childCount; i7++) {
            ds40 ds40Var2 = (ds40) map.get(getChildAt(i7));
            if (ds40Var2 != null) {
                this.q.e(ds40Var2);
                ds40Var2.g(width, height, getNanoTime());
            }
        }
        vt40 vt40Var2 = this.q.c;
        float f = vt40Var2 != null ? vt40Var2.i : 0.0f;
        if (f != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i8 = 0; i8 < childCount; i8++) {
                pt40 pt40Var2 = ((ds40) map.get(getChildAt(i8))).g;
                float f2 = pt40Var2.f + pt40Var2.e;
                fMin = Math.min(fMin, f2);
                fMax = Math.max(fMax, f2);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                ds40 ds40Var3 = (ds40) map.get(getChildAt(i9));
                pt40 pt40Var3 = ds40Var3.g;
                float f3 = pt40Var3.e;
                float f4 = pt40Var3.f;
                ds40Var3.n = 1.0f / (1.0f - f);
                ds40Var3.m = f - ((((f3 + f4) - fMin) * f) / (fMax - fMin));
            }
        }
        this.g1 = 0.0f;
        this.h1 = 0.0f;
        this.l1 = true;
        invalidate();
    }

    public final void H(int i, r3e r3eVar) {
        wt40 wt40Var = this.q;
        if (wt40Var != null) {
            wt40Var.g.put(i, r3eVar);
        }
        this.S1.e(this.q.b(this.u), this.q.b(this.w));
        B();
        if (this.v == i) {
            r3eVar.b(this);
        }
    }

    public final void I(int i, View... viewArr) {
        wt40 wt40Var = this.q;
        if (wt40Var == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        vkr0 vkr0Var = wt40Var.q;
        vkr0Var.getClass();
        MotionLayout motionLayout = (MotionLayout) vkr0Var.b;
        ArrayList arrayList = new ArrayList();
        vlu0 vlu0Var = null;
        for (vlu0 vlu0Var2 : (ArrayList) vkr0Var.c) {
            if (vlu0Var2.f37646a == i) {
                for (View view : viewArr) {
                    if (vlu0Var2.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    vlu0Var = vlu0Var2;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    vlu0Var = vlu0Var2;
                    int currentState = motionLayout.getCurrentState();
                    if (vlu0Var.e == 2) {
                        vlu0Var.a(vkr0Var, motionLayout, currentState, null, viewArr2);
                    } else if (currentState == -1) {
                        Log.w("ViewTransitionController", "No support for ViewTransition within transition yet. Currently: ".concat(motionLayout.toString()));
                    } else {
                        wt40 wt40Var2 = motionLayout.q;
                        r3e r3eVarB = wt40Var2 == null ? null : wt40Var2.b(currentState);
                        if (r3eVarB != null) {
                            vlu0Var.a(vkr0Var, motionLayout, currentState, r3eVarB, viewArr2);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        if (vlu0Var == null) {
            Log.e("ViewTransitionController", " Could not find ViewTransition");
        }
    }

    @Override // a.jk50
    public final void b(View view, View view2, int i, int i2) {
        this.x1 = getNanoTime();
        this.y1 = 0.0f;
        this.v1 = 0.0f;
        this.w1 = 0.0f;
    }

    @Override // a.jk50
    public final void c(View view, int i) {
        fwr0 fwr0Var;
        int i2;
        wt40 wt40Var = this.q;
        if (wt40Var != null) {
            float f = this.y1;
            if (f == 0.0f) {
                return;
            }
            float f2 = this.v1 / f;
            float f3 = this.w1 / f;
            vt40 vt40Var = wt40Var.c;
            if (vt40Var == null || (fwr0Var = vt40Var.l) == null) {
                return;
            }
            float[] fArr = fwr0Var.n;
            fwr0Var.m = false;
            MotionLayout motionLayout = fwr0Var.r;
            float progress = motionLayout.getProgress();
            fwr0Var.r.x(fwr0Var.d, progress, fwr0Var.h, fwr0Var.g, fArr);
            float f4 = fwr0Var.k;
            float f5 = f4 != 0.0f ? (f2 * f4) / fArr[0] : (f3 * fwr0Var.l) / fArr[1];
            if (!Float.isNaN(f5)) {
                progress += f5 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i2 = fwr0Var.c) == 3) {
                return;
            }
            motionLayout.F(((double) progress) >= 0.5d ? 1.0f : 0.0f, f5, i2);
        }
    }

    @Override // a.jk50
    public final void d(View view, int i, int i2, int[] iArr, int i3) throws Throwable {
        vt40 vt40Var;
        boolean z;
        float f;
        fwr0 fwr0Var;
        float f2;
        fwr0 fwr0Var2;
        fwr0 fwr0Var3;
        fwr0 fwr0Var4;
        int i4;
        wt40 wt40Var = this.q;
        if (wt40Var == null || (vt40Var = wt40Var.c) == null || (z = vt40Var.o)) {
            return;
        }
        int i5 = -1;
        if (z || (fwr0Var4 = vt40Var.l) == null || (i4 = fwr0Var4.e) == -1 || view.getId() == i4) {
            vt40 vt40Var2 = wt40Var.c;
            if ((vt40Var2 == null || (fwr0Var3 = vt40Var2.l) == null) ? false : fwr0Var3.u) {
                fwr0 fwr0Var5 = vt40Var.l;
                if (fwr0Var5 != null && (fwr0Var5.w & 4) != 0) {
                    i5 = i2;
                }
                float f3 = this.g1;
                if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            fwr0 fwr0Var6 = vt40Var.l;
            if (fwr0Var6 == null || (fwr0Var6.w & 1) == 0) {
                f = 0.0f;
            } else {
                float f4 = i;
                float f5 = i2;
                vt40 vt40Var3 = wt40Var.c;
                if (vt40Var3 == null || (fwr0Var2 = vt40Var3.l) == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    float[] fArr = fwr0Var2.n;
                    f = 0.0f;
                    fwr0Var2.r.x(fwr0Var2.d, fwr0Var2.r.getProgress(), fwr0Var2.h, fwr0Var2.g, fArr);
                    float f6 = fwr0Var2.k;
                    if (f6 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f2 = (f4 * f6) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f2 = (f5 * fwr0Var2.l) / fArr[1];
                    }
                }
                float f7 = this.h1;
                if ((f7 <= f && f2 < f) || (f7 >= 1.0f && f2 > f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new us40(view, (byte) 0));
                    return;
                }
            }
            float f8 = this.g1;
            long nanoTime = getNanoTime();
            float f9 = i;
            this.v1 = f9;
            float f10 = i2;
            this.w1 = f10;
            this.y1 = (float) ((nanoTime - this.x1) * 1.0E-9d);
            this.x1 = nanoTime;
            vt40 vt40Var4 = wt40Var.c;
            if (vt40Var4 != null && (fwr0Var = vt40Var4.l) != null) {
                float[] fArr2 = fwr0Var.n;
                MotionLayout motionLayout = fwr0Var.r;
                float progress = motionLayout.getProgress();
                if (!fwr0Var.m) {
                    fwr0Var.m = true;
                    motionLayout.setProgress(progress);
                }
                fwr0Var.r.x(fwr0Var.d, progress, fwr0Var.h, fwr0Var.g, fArr2);
                if (Math.abs((fwr0Var.l * fArr2[1]) + (fwr0Var.k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f11 = fwr0Var.k;
                float fMax = Math.max(Math.min(progress + (f11 != f ? (f9 * f11) / fArr2[0] : (f10 * fwr0Var.l) / fArr2[1]), 1.0f), f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f8 != this.g1) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            w(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.u1 = true;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws Throwable {
        boolean z;
        Iterator it;
        int i;
        Paint paint;
        int i2;
        Paint paint2;
        float fMin;
        double d;
        pt40 pt40Var;
        String resourceEntryName;
        vkr0 vkr0Var;
        Canvas canvas2 = canvas;
        w(false);
        wt40 wt40Var = this.q;
        if (wt40Var != null && (vkr0Var = wt40Var.q) != null) {
            ArrayList arrayList = (ArrayList) vkr0Var.f;
            ArrayList arrayList2 = (ArrayList) vkr0Var.e;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((ulu0) it2.next()).a();
                }
                ((ArrayList) vkr0Var.e).removeAll(arrayList);
                arrayList.clear();
                if (((ArrayList) vkr0Var.e).isEmpty()) {
                    vkr0Var.e = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.q == null) {
            return;
        }
        if ((this.m1 & 1) == 1 && !isInEditMode()) {
            this.A1++;
            long nanoTime = getNanoTime();
            long j = this.B1;
            if (j != -1) {
                long j2 = nanoTime - j;
                if (j2 > 200000000) {
                    this.C1 = ((int) ((this.A1 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.A1 = 0;
                    this.B1 = nanoTime;
                }
            } else {
                this.B1 = nanoTime;
            }
            Paint paint3 = new Paint();
            paint3.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.C1);
            sb.append(" fps ");
            int i3 = this.u;
            StringBuilder sb2 = new StringBuilder(axq.n(sb, i3 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i3), " -> "));
            int i4 = this.w;
            sb2.append(i4 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i4));
            sb2.append(" (progress: ");
            sb2.append(progress);
            sb2.append(" ) state=");
            int i5 = this.v;
            if (i5 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i5 != -1 ? getContext().getResources().getResourceEntryName(i5) : "UNDEFINED";
            }
            sb2.append(resourceEntryName);
            String string = sb2.toString();
            paint3.setColor(-16777216);
            canvas2.drawText(string, 11.0f, getHeight() - 29, paint3);
            paint3.setColor(-7864184);
            canvas2.drawText(string, 10.0f, getHeight() - 30, paint3);
        }
        if (this.m1 > 1) {
            p8l p8lVar = this.n1;
            if (p8lVar == null) {
                p8lVar = new p8l(this);
                this.n1 = p8lVar;
            }
            HashMap map = this.A;
            wt40 wt40Var2 = this.q;
            vt40 vt40Var = wt40Var2.c;
            int i6 = vt40Var != null ? vt40Var.h : wt40Var2.j;
            int i7 = this.m1;
            Paint paint4 = (Paint) p8lVar.i;
            Paint paint5 = (Paint) p8lVar.h;
            Paint paint6 = (Paint) p8lVar.k;
            Paint paint7 = (Paint) p8lVar.g;
            MotionLayout motionLayout = (MotionLayout) p8lVar.m;
            if (map == null || map.size() == 0) {
                return;
            }
            canvas2.save();
            if (!motionLayout.isInEditMode() && (i7 & 1) == 2) {
                String str = motionLayout.getContext().getResources().getResourceName(motionLayout.w) + Separators.COLON + motionLayout.getProgress();
                canvas2.drawText(str, 10.0f, motionLayout.getHeight() - 30, (Paint) p8lVar.j);
                canvas2.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint7);
            }
            Iterator it3 = map.values().iterator();
            while (it3.hasNext()) {
                ds40 ds40Var = (ds40) it3.next();
                pt40 pt40Var2 = ds40Var.f;
                pt40 pt40Var3 = ds40Var.f;
                ArrayList arrayList3 = ds40Var.u;
                int iMax = pt40Var2.b;
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    iMax = Math.max(iMax, ((pt40) it4.next()).b);
                }
                int iMax2 = Math.max(iMax, ds40Var.g.b);
                if (i7 > 0 && iMax2 == 0) {
                    iMax2 = 1;
                }
                if (iMax2 != 0) {
                    float[] fArr = (float[]) p8lVar.e;
                    int[] iArr = (int[]) p8lVar.d;
                    double[] dArrY = ds40Var.j[0].Y();
                    Iterator it5 = arrayList3.iterator();
                    int i8 = 0;
                    while (it5.hasNext()) {
                        iArr[i8] = ((pt40) it5.next()).o;
                        i8++;
                        i7 = i7;
                    }
                    int i9 = i7;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < dArrY.length) {
                        pt40 pt40Var4 = pt40Var3;
                        int i12 = i10;
                        ds40Var.j[0].P(dArrY[i10], ds40Var.p);
                        pt40Var4.c(dArrY[i12], ds40Var.o, ds40Var.p, fArr, i11);
                        i11 += 2;
                        i10 = i12 + 1;
                        pt40Var3 = pt40Var4;
                        arrayList3 = arrayList3;
                    }
                    pt40 pt40Var5 = pt40Var3;
                    ArrayList arrayList4 = arrayList3;
                    p8lVar.f26560a = i11 / 2;
                    if (iMax2 >= 1) {
                        int i13 = i6 / 16;
                        float[] fArr2 = (float[]) p8lVar.c;
                        if (fArr2 == null || fArr2.length != i13 * 2) {
                            p8lVar.c = new float[i13 * 2];
                            p8lVar.f = new Path();
                        }
                        canvas2.translate(1.0f, 1.0f);
                        paint7.setColor(1996488704);
                        paint6.setColor(1996488704);
                        paint5.setColor(1996488704);
                        paint4.setColor(1996488704);
                        float[] fArr3 = (float[]) p8lVar.c;
                        float f = 1.0f / (i13 - 1);
                        HashMap map2 = ds40Var.y;
                        zzk0 zzk0Var = map2 == null ? null : (zzk0) map2.get("translationX");
                        float f2 = 1.0f;
                        HashMap map3 = ds40Var.y;
                        it = it3;
                        zzk0 zzk0Var2 = map3 == null ? null : (zzk0) map3.get("translationY");
                        HashMap map4 = ds40Var.z;
                        eju0 eju0Var = map4 == null ? null : (eju0) map4.get("translationX");
                        HashMap map5 = ds40Var.z;
                        eju0 eju0Var2 = map5 == null ? null : (eju0) map5.get("translationY");
                        int i14 = 0;
                        while (true) {
                            float f3 = Float.NaN;
                            float f4 = 0.0f;
                            if (i14 >= i13) {
                                break;
                            }
                            int i15 = i13;
                            float f5 = i14 * f;
                            float f6 = ds40Var.n;
                            if (f6 != f2) {
                                float f7 = ds40Var.m;
                                fMin = f5 < f7 ? 0.0f : f5;
                                i2 = i6;
                                paint2 = paint4;
                                if (fMin > f7 && fMin < 1.0d) {
                                    fMin = Math.min((fMin - f7) * f6, f2);
                                }
                            } else {
                                i2 = i6;
                                paint2 = paint4;
                                fMin = f5;
                            }
                            double d2 = fMin;
                            fhn fhnVar = pt40Var2.f27547a;
                            Iterator it6 = arrayList4.iterator();
                            while (it6.hasNext()) {
                                Iterator it7 = it6;
                                pt40 pt40Var6 = (pt40) it6.next();
                                int i16 = i14;
                                fhn fhnVar2 = pt40Var6.f27547a;
                                if (fhnVar2 != null) {
                                    float f8 = pt40Var6.c;
                                    if (f8 < fMin) {
                                        f4 = f8;
                                        fhnVar = fhnVar2;
                                    } else if (Float.isNaN(f3)) {
                                        f3 = pt40Var6.c;
                                    }
                                }
                                it6 = it7;
                                i14 = i16;
                            }
                            int i17 = i14;
                            if (fhnVar != null) {
                                if (Float.isNaN(f3)) {
                                    f3 = 1.0f;
                                }
                                float f9 = f3 - f4;
                                d = (((float) fhnVar.d((fMin - f4) / f9)) * f9) + f4;
                            } else {
                                d = d2;
                            }
                            Paint paint8 = paint5;
                            ds40Var.j[0].P(d, ds40Var.p);
                            aw3 aw3Var = ds40Var.k;
                            if (aw3Var != null) {
                                double[] dArr = ds40Var.p;
                                pt40Var = pt40Var2;
                                if (dArr.length > 0) {
                                    aw3Var.P(d, dArr);
                                }
                            } else {
                                pt40Var = pt40Var2;
                            }
                            int i18 = i17 * 2;
                            pt40Var5.c(d, ds40Var.o, ds40Var.p, fArr3, i18);
                            if (eju0Var != null) {
                                fArr3[i18] = eju0Var.a(fMin) + fArr3[i18];
                            } else if (zzk0Var != null) {
                                fArr3[i18] = zzk0Var.a(fMin) + fArr3[i18];
                            }
                            if (eju0Var2 != null) {
                                int i19 = i18 + 1;
                                fArr3[i19] = eju0Var2.a(fMin) + fArr3[i19];
                            } else if (zzk0Var2 != null) {
                                int i20 = i18 + 1;
                                fArr3[i20] = zzk0Var2.a(fMin) + fArr3[i20];
                            }
                            i14 = i17 + 1;
                            i13 = i15;
                            i6 = i2;
                            paint4 = paint2;
                            paint5 = paint8;
                            pt40Var2 = pt40Var;
                            f2 = 1.0f;
                        }
                        pt40 pt40Var7 = pt40Var2;
                        i = i6;
                        p8lVar.e(canvas2, iMax2, p8lVar.f26560a, ds40Var);
                        paint7.setColor(-21965);
                        paint = paint5;
                        paint.setColor(-2067046);
                        paint6.setColor(-2067046);
                        paint4.setColor(-13391360);
                        canvas2.translate(-1.0f, -1.0f);
                        p8lVar.e(canvas2, iMax2, p8lVar.f26560a, ds40Var);
                        char c = 5;
                        if (iMax2 == 5) {
                            float[] fArr4 = (float[]) p8lVar.l;
                            ((Path) p8lVar.f).reset();
                            int i21 = 0;
                            while (i21 <= 50) {
                                char c2 = c;
                                ds40Var.j[0].P(ds40Var.a(i21 / 50.0f, null), ds40Var.p);
                                int[] iArr2 = ds40Var.o;
                                double[] dArr2 = ds40Var.p;
                                pt40 pt40Var8 = pt40Var7;
                                float fSin = pt40Var8.e;
                                float fCos = pt40Var8.f;
                                float f10 = pt40Var8.g;
                                float f11 = pt40Var8.h;
                                int i22 = 0;
                                while (true) {
                                    int[] iArr3 = iArr2;
                                    if (i22 >= iArr2.length) {
                                        break;
                                    }
                                    float f12 = (float) dArr2[i22];
                                    int i23 = iArr3[i22];
                                    if (i23 == 1) {
                                        fSin = f12;
                                    } else if (i23 == 2) {
                                        fCos = f12;
                                    } else if (i23 == 3) {
                                        f10 = f12;
                                    } else if (i23 == 4) {
                                        f11 = f12;
                                    }
                                    i22++;
                                    iArr2 = iArr3;
                                }
                                if (pt40Var8.m != null) {
                                    double d3 = fSin;
                                    double d4 = fCos;
                                    fSin = (float) (((Math.sin(d4) * d3) + 0.0d) - ((double) (f10 / 2.0f)));
                                    fCos = (float) ((0.0d - (Math.cos(d4) * d3)) - ((double) (f11 / 2.0f)));
                                }
                                float f13 = f10 + fSin;
                                float f14 = f11 + fCos;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f15 = fSin + 0.0f;
                                float f16 = fCos + 0.0f;
                                float f17 = f13 + 0.0f;
                                float f18 = f14 + 0.0f;
                                fArr4[0] = f15;
                                fArr4[1] = f16;
                                fArr4[2] = f17;
                                fArr4[3] = f16;
                                fArr4[4] = f17;
                                fArr4[c2] = f18;
                                fArr4[6] = f15;
                                fArr4[7] = f18;
                                ((Path) p8lVar.f).moveTo(f15, f16);
                                ((Path) p8lVar.f).lineTo(fArr4[2], fArr4[3]);
                                ((Path) p8lVar.f).lineTo(fArr4[4], fArr4[c2]);
                                ((Path) p8lVar.f).lineTo(fArr4[6], fArr4[7]);
                                ((Path) p8lVar.f).close();
                                i21++;
                                pt40Var7 = pt40Var8;
                                c = c2;
                            }
                            z = true;
                            paint7.setColor(1140850688);
                            canvas2 = canvas;
                            canvas2.translate(2.0f, 2.0f);
                            canvas2.drawPath((Path) p8lVar.f, paint7);
                            canvas2.translate(-2.0f, -2.0f);
                            paint7.setColor(-65536);
                            canvas2.drawPath((Path) p8lVar.f, paint7);
                        } else {
                            z = true;
                        }
                    } else {
                        z = true;
                        it = it3;
                        i = i6;
                        paint = paint5;
                    }
                    paint5 = paint;
                    i7 = i9;
                    it3 = it;
                    i6 = i;
                }
            }
            canvas2.restore();
        }
    }

    @Override // a.kk50
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.u1 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.u1 = false;
    }

    public int[] getConstraintSetIds() {
        wt40 wt40Var = this.q;
        if (wt40Var == null) {
            return null;
        }
        SparseArray sparseArray = wt40Var.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.v;
    }

    public ArrayList<vt40> getDefinedTransitions() {
        wt40 wt40Var = this.q;
        if (wt40Var == null) {
            return null;
        }
        return wt40Var.d;
    }

    public zfk getDesignTool() {
        zfk zfkVar = this.r1;
        if (zfkVar != null) {
            return zfkVar;
        }
        zfk zfkVar2 = new zfk();
        this.r1 = zfkVar2;
        return zfkVar2;
    }

    public int getEndState() {
        return this.w;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.h1;
    }

    public wt40 getScene() {
        return this.q;
    }

    public int getStartState() {
        return this.u;
    }

    public float getTargetPosition() {
        return this.j1;
    }

    public Bundle getTransitionState() {
        xs40 xs40Var = this.N1;
        if (xs40Var == null) {
            xs40Var = new xs40(this);
            this.N1 = xs40Var;
        }
        MotionLayout motionLayout = xs40Var.e;
        xs40Var.d = motionLayout.w;
        xs40Var.c = motionLayout.u;
        xs40Var.b = motionLayout.getVelocity();
        xs40Var.f41398a = motionLayout.getProgress();
        xs40 xs40Var2 = this.N1;
        xs40Var2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", xs40Var2.f41398a);
        bundle.putFloat("motion.velocity", xs40Var2.b);
        bundle.putInt("motion.StartState", xs40Var2.c);
        bundle.putInt("motion.EndState", xs40Var2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        wt40 wt40Var = this.q;
        if (wt40Var != null) {
            vt40 vt40Var = wt40Var.c;
            this.f1 = (vt40Var != null ? vt40Var.h : wt40Var.j) / 1000.0f;
        }
        return (long) (this.f1 * 1000.0f);
    }

    public float getVelocity() {
        return this.t;
    }

    @Override // a.jk50
    public final void h(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // a.jk50
    public final boolean i(View view, View view2, int i, int i2) {
        vt40 vt40Var;
        fwr0 fwr0Var;
        wt40 wt40Var = this.q;
        return (wt40Var == null || (vt40Var = wt40Var.c) == null || (fwr0Var = vt40Var.l) == null || (fwr0Var.w & 2) != 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        vt40 vt40Var;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        wt40 wt40Var = this.q;
        if (wt40Var != null && (i = this.v) != -1) {
            r3e r3eVarB = wt40Var.b(i);
            wt40 wt40Var2 = this.q;
            SparseArray sparseArray = wt40Var2.g;
            loop0: for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                SparseIntArray sparseIntArray = wt40Var2.i;
                int i3 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (true) {
                    if (i3 > 0) {
                        if (i3 != iKeyAt) {
                            int i4 = size - 1;
                            if (size >= 0) {
                                i3 = sparseIntArray.get(i3);
                                size = i4;
                            }
                        }
                        Log.e("MotionScene", "Cannot be derived from yourself");
                        break loop0;
                    }
                    wt40Var2.l(iKeyAt, this);
                }
            }
            if (r3eVarB != null) {
                r3eVarB.b(this);
            }
            this.u = this.v;
        }
        A();
        xs40 xs40Var = this.N1;
        if (xs40Var != null) {
            if (this.Q1) {
                post(new mx2(this, (byte) 23));
                return;
            } else {
                xs40Var.a();
                return;
            }
        }
        wt40 wt40Var3 = this.q;
        if (wt40Var3 == null || (vt40Var = wt40Var3.c) == null || vt40Var.n != 4) {
            return;
        }
        u(1.0f);
        this.O1 = null;
        setState(zs40.b);
        setState(zs40.c);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x0134  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        fwr0 fwr0Var;
        int i;
        RectF rectFB;
        r3e r3eVar;
        int i2;
        RectF rectF = this.V1;
        wt40 wt40Var = this.q;
        if (wt40Var == null || !this.z) {
            return false;
        }
        vkr0 vkr0Var = wt40Var.q;
        if (vkr0Var != null) {
            MotionLayout motionLayout = (MotionLayout) vkr0Var.b;
            ArrayList<vlu0> arrayList = (ArrayList) vkr0Var.c;
            int currentState = motionLayout.getCurrentState();
            if (currentState == -1) {
                z = false;
            } else {
                if (((HashSet) vkr0Var.d) == null) {
                    vkr0Var.d = new HashSet();
                    for (vlu0 vlu0Var : arrayList) {
                        int childCount = motionLayout.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = motionLayout.getChildAt(i3);
                            if (vlu0Var.c(childAt)) {
                                childAt.getId();
                                ((HashSet) vkr0Var.d).add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList arrayList2 = (ArrayList) vkr0Var.e;
                int i4 = 2;
                int i5 = 1;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    for (ulu0 ulu0Var : (ArrayList) vkr0Var.e) {
                        Rect rect2 = ulu0Var.l;
                        if (action != 1) {
                            if (action == i4) {
                                ulu0Var.c.b.getHitRect(rect2);
                                if (!rect2.contains((int) x, (int) y) && !ulu0Var.h) {
                                    ulu0Var.b();
                                }
                            }
                        } else if (!ulu0Var.h) {
                            ulu0Var.b();
                        }
                        i4 = 2;
                    }
                }
                z = false;
                if (action == 0 || action == 1) {
                    wt40 wt40Var2 = motionLayout.q;
                    r3e r3eVarB = wt40Var2 == null ? null : wt40Var2.b(currentState);
                    for (vlu0 vlu0Var2 : arrayList) {
                        int i6 = vlu0Var2.b;
                        if (i6 == i5) {
                            if (action == 0) {
                                for (View view : (HashSet) vkr0Var.d) {
                                    if (vlu0Var2.c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            r3eVar = r3eVarB;
                                            i2 = 1;
                                            vlu0Var2.a(vkr0Var, motionLayout, currentState, r3eVar, view);
                                        } else {
                                            r3eVar = r3eVarB;
                                            i2 = 1;
                                        }
                                        r3eVarB = r3eVar;
                                        i5 = i2;
                                    }
                                }
                            }
                        } else if (i6 == 2) {
                            if (action == i5) {
                                while (r4.hasNext()) {
                                    if (vlu0Var2.c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            r3eVar = r3eVarB;
                                            i2 = 1;
                                            vlu0Var2.a(vkr0Var, motionLayout, currentState, r3eVar, view);
                                        } else {
                                            r3eVar = r3eVarB;
                                            i2 = 1;
                                        }
                                        r3eVarB = r3eVar;
                                        i5 = i2;
                                    }
                                }
                            }
                        } else if (i6 == 3 && action == 0) {
                            while (r4.hasNext()) {
                                if (vlu0Var2.c(view)) {
                                    view.getHitRect(rect);
                                    if (rect.contains((int) x, (int) y)) {
                                        r3eVar = r3eVarB;
                                        i2 = 1;
                                        vlu0Var2.a(vkr0Var, motionLayout, currentState, r3eVar, view);
                                    } else {
                                        r3eVar = r3eVarB;
                                        i2 = 1;
                                    }
                                    r3eVarB = r3eVar;
                                    i5 = i2;
                                }
                            }
                        }
                        r3eVarB = r3eVarB;
                        i5 = i5;
                    }
                }
            }
        } else {
            z = false;
        }
        vt40 vt40Var = this.q.c;
        if (vt40Var == null || vt40Var.o || (fwr0Var = vt40Var.l) == null) {
            return z;
        }
        if ((motionEvent.getAction() == 0 && (rectFB = fwr0Var.b(this, new RectF())) != null && !rectFB.contains(motionEvent.getX(), motionEvent.getY())) || (i = fwr0Var.e) == -1) {
            return z;
        }
        View view2 = this.W1;
        if (view2 == null || view2.getId() != i) {
            this.W1 = findViewById(i);
        }
        View view3 = this.W1;
        if (view3 == null) {
            return z;
        }
        rectF.set(view3.getLeft(), this.W1.getTop(), this.W1.getRight(), this.W1.getBottom());
        return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || y((float) this.W1.getLeft(), (float) this.W1.getTop(), this.W1, motionEvent)) ? z : onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.M1 = true;
        try {
            if (this.q == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.s1 != i5 || this.t1 != i6) {
                B();
                w(true);
            }
            this.s1 = i5;
            this.t1 = i6;
        } finally {
            this.M1 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fb A[PHI: r11
  0x00fb: PHI (r11v4 float) = (r11v1 float), (r11v5 float) binds: [B:62:0x0105, B:56:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0101  */
    /* JADX WARN: Code duplicated, block: B:76:0x012a  */
    /* JADX WARN: Code duplicated, block: B:78:0x012e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0134  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        float f;
        float f2;
        ws40 ws40Var = this.S1;
        if (this.q == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.x == i && this.y == i2) ? false : true;
        if (this.U1) {
            this.U1 = false;
            A();
            z3 = true;
        }
        if (this.h) {
            z3 = true;
        }
        this.x = i;
        this.y = i2;
        int iG = this.q.g();
        vt40 vt40Var = this.q.c;
        int i3 = vt40Var == null ? -1 : vt40Var.c;
        if ((!z3 && iG == ws40Var.e && i3 == ws40Var.f) || this.u == -1) {
            if (z3) {
                super.onMeasure(i, i2);
            }
            z = true;
        } else {
            super.onMeasure(i, i2);
            ws40Var.e(this.q.b(iG), this.q.b(i3));
            ws40Var.f();
            ws40Var.e = iG;
            ws40Var.f = i3;
            z = false;
        }
        if (this.D1 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            l4e l4eVar = this.c;
            int iS = l4eVar.s() + paddingRight;
            int iM = l4eVar.m() + paddingBottom;
            int i4 = this.I1;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.E1;
                iS = (int) ((this.K1 * (this.G1 - i5)) + i5);
                requestLayout();
            }
            int i6 = this.J1;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.F1;
                iM = (int) ((this.K1 * (this.H1 - i7)) + i7);
                requestLayout();
            }
            setMeasuredDimension(iS, iM);
        }
        float fSignum = Math.signum(this.j1 - this.h1);
        long nanoTime = getNanoTime();
        ps40 ps40Var = this.r;
        float interpolation = this.h1 + (!(ps40Var instanceof tqm0) ? (((nanoTime - this.i1) * fSignum) * 1.0E-9f) / this.f1 : 0.0f);
        if (this.k1) {
            interpolation = this.j1;
        }
        if (fSignum > 0.0f) {
            f = this.j1;
            if (interpolation < f) {
                if (fSignum <= 0.0f) {
                    f = this.j1;
                    if (interpolation <= f) {
                        interpolation = f;
                    }
                }
                z2 = false;
            } else {
                interpolation = f;
            }
        } else {
            if (fSignum <= 0.0f) {
                f = this.j1;
                if (interpolation <= f) {
                    interpolation = f;
                }
            }
            z2 = false;
        }
        if (ps40Var != null && !z2) {
            interpolation = this.o1 ? ps40Var.getInterpolation((nanoTime - this.B) * 1.0E-9f) : ps40Var.getInterpolation(interpolation);
        }
        if (fSignum > 0.0f) {
            float f3 = this.j1;
            if (interpolation >= f3) {
                interpolation = f3;
            } else if (fSignum <= 0.0f) {
                f2 = this.j1;
                if (interpolation <= f2) {
                    interpolation = f2;
                }
            }
        } else if (fSignum <= 0.0f) {
            f2 = this.j1;
            if (interpolation <= f2) {
                interpolation = f2;
            }
        }
        this.K1 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.s;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f4 = interpolation;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            ds40 ds40Var = (ds40) this.A.get(childAt);
            if (ds40Var != null) {
                ds40Var.d(f4, nanoTime2, this.L1, childAt);
            }
        }
        if (this.D1) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        fwr0 fwr0Var;
        wt40 wt40Var = this.q;
        if (wt40Var != null) {
            boolean zP = p();
            wt40Var.p = zP;
            vt40 vt40Var = wt40Var.c;
            if (vt40Var == null || (fwr0Var = vt40Var.l) == null) {
                return;
            }
            fwr0Var.c(zP);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x021e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0224  */
    /* JADX WARN: Code duplicated, block: B:115:0x0228  */
    /* JADX WARN: Code duplicated, block: B:119:0x0232  */
    /* JADX WARN: Code duplicated, block: B:121:0x0245  */
    /* JADX WARN: Code duplicated, block: B:123:0x024d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0256  */
    /* JADX WARN: Code duplicated, block: B:128:0x025d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0262  */
    /* JADX WARN: Code duplicated, block: B:133:0x027b  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:139:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:142:0x0331  */
    /* JADX WARN: Code duplicated, block: B:144:0x0336  */
    /* JADX WARN: Code duplicated, block: B:146:0x033c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0348  */
    /* JADX WARN: Code duplicated, block: B:151:0x034c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0354  */
    /* JADX WARN: Code duplicated, block: B:154:0x035b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0361  */
    /* JADX WARN: Code duplicated, block: B:158:0x037b  */
    /* JADX WARN: Code duplicated, block: B:161:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:163:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:165:0x03a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:171:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:179:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:181:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:183:0x0406  */
    /* JADX WARN: Code duplicated, block: B:185:0x040f  */
    /* JADX WARN: Code duplicated, block: B:188:0x041a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0420  */
    /* JADX WARN: Code duplicated, block: B:192:0x0427  */
    /* JADX WARN: Code duplicated, block: B:194:0x042e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0449  */
    /* JADX WARN: Code duplicated, block: B:199:0x0476  */
    /* JADX WARN: Code duplicated, block: B:201:0x047b  */
    /* JADX WARN: Code duplicated, block: B:202:0x04b2 A[PHI: r7 r13
  0x04b2: PHI (r7v20 float) = (r7v15 float), (r7v26 float) binds: [B:200:0x0479, B:198:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x04b2: PHI (r13v12 float) = (r13v7 float), (r13v17 float) binds: [B:200:0x0479, B:198:0x046f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:204:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:205:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:208:0x050f  */
    /* JADX WARN: Code duplicated, block: B:210:0x051e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0525  */
    /* JADX WARN: Code duplicated, block: B:237:0x057d  */
    /* JADX WARN: Code duplicated, block: B:239:0x0585  */
    /* JADX WARN: Code duplicated, block: B:241:0x058b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0590  */
    /* JADX WARN: Code duplicated, block: B:243:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:245:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:248:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:250:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:253:0x05be  */
    /* JADX WARN: Code duplicated, block: B:255:0x05df  */
    /* JADX WARN: Code duplicated, block: B:257:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:259:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:262:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:263:0x0604  */
    /* JADX WARN: Code duplicated, block: B:266:0x063b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0646  */
    /* JADX WARN: Code duplicated, block: B:270:0x064a  */
    /* JADX WARN: Code duplicated, block: B:273:0x065d  */
    /* JADX WARN: Code duplicated, block: B:276:0x0666  */
    /* JADX WARN: Code duplicated, block: B:279:0x0675  */
    /* JADX WARN: Code duplicated, block: B:281:0x067b  */
    /* JADX WARN: Code duplicated, block: B:283:0x0681 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:284:0x0683  */
    /* JADX WARN: Code duplicated, block: B:285:0x0685  */
    /* JADX WARN: Code duplicated, block: B:289:0x0692  */
    /* JADX WARN: Code duplicated, block: B:292:0x069b  */
    /* JADX WARN: Code duplicated, block: B:293:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:296:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:297:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:300:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:301:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:303:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:305:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:307:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:310:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:311:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:314:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:315:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:318:0x0705  */
    /* JADX WARN: Code duplicated, block: B:319:0x0711  */
    /* JADX WARN: Code duplicated, block: B:322:0x0738  */
    /* JADX WARN: Code duplicated, block: B:323:0x073a  */
    /* JADX WARN: Code duplicated, block: B:326:0x0742  */
    /* JADX WARN: Code duplicated, block: B:328:0x0748  */
    /* JADX WARN: Code duplicated, block: B:331:0x074e  */
    /* JADX WARN: Code duplicated, block: B:355:0x0799  */
    /* JADX WARN: Code duplicated, block: B:357:0x079f  */
    /* JADX WARN: Code duplicated, block: B:359:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:360:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:363:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:367:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:368:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:371:0x07e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) throws Throwable {
        vt40 vt40Var;
        h03 h03Var;
        VelocityTracker velocityTracker;
        h03 h03Var2;
        int i;
        fwr0 fwr0Var;
        float[] fArr;
        h03 h03Var3;
        MotionLayout motionLayout;
        boolean z;
        zs40 zs40Var;
        VelocityTracker velocityTracker2;
        int action;
        VelocityTracker velocityTracker3;
        VelocityTracker velocityTracker4;
        float xVelocity;
        VelocityTracker velocityTracker5;
        float yVelocity;
        float progress;
        int i2;
        MotionLayout motionLayout2;
        char c;
        char c2;
        float f;
        float f2;
        float f3;
        float fAbs;
        float f4;
        int i3;
        float rawY;
        float rawX;
        float progress2;
        int i4;
        MotionLayout motionLayout3;
        char c3;
        char c4;
        float f5;
        float fMax;
        float progress3;
        boolean z2;
        VelocityTracker velocityTracker6;
        VelocityTracker velocityTracker7;
        float xVelocity2;
        VelocityTracker velocityTracker8;
        float yVelocity2;
        float f6;
        int[] iArr;
        VelocityTracker velocityTracker9;
        int action2;
        VelocityTracker velocityTracker10;
        VelocityTracker velocityTracker11;
        float xVelocity3;
        VelocityTracker velocityTracker12;
        float yVelocity3;
        float progress4;
        float width;
        int i5;
        int i6;
        float f7;
        int top;
        int bottom;
        int i7;
        zs40 zs40Var2;
        int i8;
        float degrees;
        float f8;
        zs40 zs40Var3;
        int i9;
        float width2;
        float height;
        int i10;
        int i11;
        View viewFindViewById;
        float rawX2;
        float rawY2;
        double dAtan2;
        float fAtan2;
        float f9;
        float progress5;
        boolean z3;
        int i12;
        int i13;
        ?? r18;
        float fMax2;
        float progress6;
        boolean z4;
        VelocityTracker velocityTracker13;
        VelocityTracker velocityTracker14;
        float xVelocity4;
        VelocityTracker velocityTracker15;
        float yVelocity4;
        MotionEvent motionEvent2;
        vt40 vt40Var2;
        int iC;
        Iterator it;
        wt40 wt40Var = this.q;
        if (wt40Var == null || !this.z || !wt40Var.n()) {
            return super.onTouchEvent(motionEvent);
        }
        wt40 wt40Var2 = this.q;
        vt40 vt40Var3 = wt40Var2.c;
        if (vt40Var3 != null && vt40Var3.o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        MotionLayout motionLayout4 = wt40Var2.f39722a;
        RectF rectF = new RectF();
        h03 h03Var4 = wt40Var2.o;
        if (h03Var4 == null) {
            motionLayout4.getClass();
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            h03 h03Var5 = h03.c;
            h03Var5.b = velocityTrackerObtain;
            wt40Var2.o = h03Var5;
            h03Var4 = h03Var5;
        }
        VelocityTracker velocityTracker16 = (VelocityTracker) h03Var4.b;
        if (velocityTracker16 != null) {
            velocityTracker16.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action3 = motionEvent.getAction();
            if (action3 == 0) {
                wt40Var2.r = motionEvent.getRawX();
                wt40Var2.s = motionEvent.getRawY();
                wt40Var2.l = motionEvent;
                wt40Var2.m = false;
                fwr0 fwr0Var2 = wt40Var2.c.l;
                if (fwr0Var2 != null) {
                    RectF rectFA = fwr0Var2.a(motionLayout4, rectF);
                    if (rectFA == null || rectFA.contains(wt40Var2.l.getX(), wt40Var2.l.getY())) {
                        RectF rectFB = wt40Var2.c.l.b(motionLayout4, rectF);
                        if (rectFB == null || rectFB.contains(wt40Var2.l.getX(), wt40Var2.l.getY())) {
                            wt40Var2.n = false;
                        } else {
                            wt40Var2.n = true;
                        }
                        fwr0 fwr0Var3 = wt40Var2.c.l;
                        float f10 = wt40Var2.r;
                        float f11 = wt40Var2.s;
                        fwr0Var3.p = f10;
                        fwr0Var3.q = f11;
                    } else {
                        wt40Var2.l = null;
                        wt40Var2.m = true;
                    }
                }
            } else if (action3 == 2 && !wt40Var2.m) {
                float rawY3 = motionEvent.getRawY() - wt40Var2.s;
                float rawX3 = motionEvent.getRawX() - wt40Var2.r;
                if ((rawX3 != 0.0d || rawY3 != 0.0d) && (motionEvent2 = wt40Var2.l) != null) {
                    if (currentState != -1) {
                        h8m0 h8m0Var = wt40Var2.b;
                        if (h8m0Var == null || (iC = h8m0Var.c(currentState)) == -1) {
                            iC = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (vt40 vt40Var4 : wt40Var2.d) {
                            if (vt40Var4.d == iC || vt40Var4.c == iC) {
                                arrayList.add(vt40Var4);
                            }
                        }
                        RectF rectF2 = new RectF();
                        Iterator it2 = arrayList.iterator();
                        float f12 = 0.0f;
                        vt40Var2 = null;
                        while (it2.hasNext()) {
                            vt40 vt40Var5 = (vt40) it2.next();
                            if (vt40Var5.o) {
                                it = it2;
                            } else {
                                fwr0 fwr0Var4 = vt40Var5.l;
                                if (fwr0Var4 != null) {
                                    fwr0Var4.c(wt40Var2.p);
                                    RectF rectFB2 = vt40Var5.l.b(motionLayout4, rectF2);
                                    if (rectFB2 != null) {
                                        it = it2;
                                        if (!rectFB2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        }
                                    } else {
                                        it = it2;
                                    }
                                    RectF rectFA2 = vt40Var5.l.a(motionLayout4, rectF2);
                                    if (rectFA2 == null || rectFA2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        fwr0 fwr0Var5 = vt40Var5.l;
                                        float fAtan3 = (fwr0Var5.l * rawY3) + (fwr0Var5.k * rawX3);
                                        if (fwr0Var5.j) {
                                            float x = motionEvent2.getX();
                                            vt40Var5.l.getClass();
                                            float f13 = x - 0.5f;
                                            float y = motionEvent2.getY();
                                            vt40Var5.l.getClass();
                                            float f14 = y - 0.5f;
                                            fAtan3 = ((float) (Math.atan2(rawY3 + f14, rawX3 + f13) - Math.atan2(f13, f14))) * 10.0f;
                                        }
                                        float f15 = fAtan3 * (vt40Var5.c == currentState ? -1.0f : 1.1f);
                                        if (f15 > f12) {
                                            f12 = f15;
                                            vt40Var2 = vt40Var5;
                                        }
                                        it2 = it;
                                        rectF2 = rectF2;
                                    }
                                } else {
                                    it = it2;
                                    rectF2 = rectF2;
                                    f12 = f12;
                                    vt40Var2 = vt40Var2;
                                }
                                f12 = f12;
                                vt40Var2 = vt40Var2;
                                it2 = it;
                                rectF2 = rectF2;
                            }
                            it2 = it;
                        }
                    } else {
                        vt40Var2 = wt40Var2.c;
                    }
                    if (vt40Var2 != null) {
                        setTransition(vt40Var2);
                        RectF rectFB3 = wt40Var2.c.l.b(motionLayout4, rectF);
                        wt40Var2.n = (rectFB3 == null || rectFB3.contains(wt40Var2.l.getX(), wt40Var2.l.getY())) ? false : true;
                        fwr0 fwr0Var6 = wt40Var2.c.l;
                        float f16 = wt40Var2.r;
                        float f17 = wt40Var2.s;
                        fwr0Var6.p = f16;
                        fwr0Var6.q = f17;
                        fwr0Var6.m = false;
                    }
                    if (!wt40Var2.m) {
                        vt40Var = wt40Var2.c;
                        if (vt40Var != null) {
                            fArr = fwr0Var.n;
                            if (!wt40Var2.n) {
                                h03Var3 = wt40Var2.o;
                                motionLayout = fwr0Var.r;
                                z = fwr0Var.j;
                                zs40Var = zs40.d;
                                if (z) {
                                    iArr = fwr0Var.o;
                                    velocityTracker9 = (VelocityTracker) h03Var3.b;
                                    if (velocityTracker9 != null) {
                                        velocityTracker9.addMovement(motionEvent);
                                    }
                                    action2 = motionEvent.getAction();
                                    if (action2 == 0) {
                                        fwr0Var.p = motionEvent.getRawX();
                                        fwr0Var.q = motionEvent.getRawY();
                                        fwr0Var.m = false;
                                    } else if (action2 == 1) {
                                        fwr0Var.m = false;
                                        velocityTracker10 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker10 != null) {
                                            velocityTracker10.computeCurrentVelocity(16);
                                        }
                                        velocityTracker11 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker11 != null) {
                                            xVelocity3 = velocityTracker11.getXVelocity();
                                        } else {
                                            xVelocity3 = 0.0f;
                                        }
                                        velocityTracker12 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker12 != null) {
                                            yVelocity3 = velocityTracker12.getYVelocity();
                                        } else {
                                            yVelocity3 = 0.0f;
                                        }
                                        progress4 = motionLayout.getProgress();
                                        width = motionLayout.getWidth() / 2.0f;
                                        float height2 = motionLayout.getHeight() / 2.0f;
                                        i5 = fwr0Var.i;
                                        if (i5 != -1) {
                                            View viewFindViewById2 = motionLayout.findViewById(i5);
                                            motionLayout.getLocationOnScreen(iArr);
                                            width = iArr[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                            f7 = iArr[1];
                                            top = viewFindViewById2.getTop();
                                            bottom = viewFindViewById2.getBottom();
                                        } else {
                                            i6 = fwr0Var.d;
                                            if (i6 != -1) {
                                                View viewFindViewById3 = motionLayout.findViewById(((ds40) motionLayout.A.get(motionLayout.findViewById(i6))).f.k);
                                                motionLayout.getLocationOnScreen(iArr);
                                                width = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                                f7 = iArr[1];
                                                top = viewFindViewById3.getTop();
                                                bottom = viewFindViewById3.getBottom();
                                            } else {
                                                float rawX4 = motionEvent.getRawX() - width;
                                                float rawY4 = motionEvent.getRawY() - height2;
                                                double degrees2 = Math.toDegrees(Math.atan2(rawY4, rawX4));
                                                i7 = fwr0Var.d;
                                                if (i7 != -1) {
                                                    zs40Var2 = zs40Var;
                                                    i8 = 6;
                                                    fwr0Var.r.x(i7, progress4, fwr0Var.h, fwr0Var.g, fArr);
                                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                                } else {
                                                    zs40Var2 = zs40Var;
                                                    i8 = 6;
                                                    fArr[1] = 360.0f;
                                                }
                                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY4, xVelocity3 + rawX4)) - degrees2)) * 62.5f;
                                                if (Float.isNaN(degrees)) {
                                                    f8 = progress4;
                                                } else {
                                                    f8 = (((degrees * 3.0f) * fwr0Var.v) / fArr[1]) + progress4;
                                                }
                                                if (f8 != 0.0f) {
                                                    zs40Var3 = zs40Var2;
                                                    if (0.0f < f8) {
                                                        motionLayout.setState(zs40Var3);
                                                    } else {
                                                        motionLayout.setState(zs40Var3);
                                                    }
                                                } else {
                                                    zs40Var3 = zs40Var2;
                                                    if (0.0f < f8) {
                                                        motionLayout.setState(zs40Var3);
                                                    } else {
                                                        motionLayout.setState(zs40Var3);
                                                    }
                                                }
                                            }
                                        }
                                        height2 = ((bottom + top) / 2.0f) + f7;
                                        float rawX5 = motionEvent.getRawX() - width;
                                        float rawY5 = motionEvent.getRawY() - height2;
                                        double degrees3 = Math.toDegrees(Math.atan2(rawY5, rawX5));
                                        i7 = fwr0Var.d;
                                        if (i7 != -1) {
                                            zs40Var2 = zs40Var;
                                            i8 = 6;
                                            fwr0Var.r.x(i7, progress4, fwr0Var.h, fwr0Var.g, fArr);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            zs40Var2 = zs40Var;
                                            i8 = 6;
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY5, xVelocity3 + rawX5)) - degrees3)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f8 = (((degrees * 3.0f) * fwr0Var.v) / fArr[1]) + progress4;
                                        } else {
                                            f8 = progress4;
                                        }
                                        if (f8 != 0.0f) {
                                            zs40Var3 = zs40Var2;
                                            if (0.0f < f8) {
                                                motionLayout.setState(zs40Var3);
                                            } else {
                                                motionLayout.setState(zs40Var3);
                                            }
                                        } else {
                                            zs40Var3 = zs40Var2;
                                            if (0.0f < f8) {
                                                motionLayout.setState(zs40Var3);
                                            } else {
                                                motionLayout.setState(zs40Var3);
                                            }
                                        }
                                    } else if (action2 == 2) {
                                        motionEvent.getRawY();
                                        motionEvent.getRawX();
                                        width2 = motionLayout.getWidth() / 2.0f;
                                        height = motionLayout.getHeight() / 2.0f;
                                        i10 = fwr0Var.i;
                                        if (i10 != -1) {
                                            View viewFindViewById4 = motionLayout.findViewById(i10);
                                            motionLayout.getLocationOnScreen(iArr);
                                            float right = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                            float bottom2 = iArr[1] + ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f);
                                            width2 = right;
                                            height = bottom2;
                                        } else {
                                            i11 = fwr0Var.d;
                                            if (i11 != -1) {
                                                viewFindViewById = motionLayout.findViewById(((ds40) motionLayout.A.get(motionLayout.findViewById(i11))).f.k);
                                                if (viewFindViewById == null) {
                                                    Log.e("TouchResponse", "could not find view to animate to");
                                                } else {
                                                    motionLayout.getLocationOnScreen(iArr);
                                                    width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                                    height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                                }
                                            }
                                        }
                                        rawX2 = motionEvent.getRawX() - width2;
                                        rawY2 = motionEvent.getRawY() - height;
                                        dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                                        fAtan2 = (float) (((dAtan2 - Math.atan2(fwr0Var.q - height, fwr0Var.p - width2)) * 180.0d) / 3.141592653589793d);
                                        if (fAtan2 > 330.0f) {
                                            fAtan2 -= 360.0f;
                                        } else if (fAtan2 < -330.0f) {
                                            fAtan2 += 360.0f;
                                        }
                                        f9 = fAtan2;
                                        if (Math.abs(f9) <= 0.01d) {
                                            progress5 = motionLayout.getProgress();
                                            if (fwr0Var.m) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                                fwr0Var.m = true;
                                                motionLayout.setProgress(progress5);
                                            }
                                            i12 = fwr0Var.d;
                                            if (i12 != -1) {
                                                boolean z5 = z3;
                                                i13 = 1000;
                                                fwr0Var.r.x(i12, progress5, fwr0Var.h, fwr0Var.g, fArr);
                                                fArr[z5 ? 1 : 0] = (float) Math.toDegrees(fArr[z5 ? 1 : 0]);
                                                r18 = z5;
                                            } else {
                                                boolean z6 = z3;
                                                i13 = 1000;
                                                fArr[z6 ? 1 : 0] = 360.0f;
                                                r18 = z6;
                                            }
                                            fMax2 = Math.max(Math.min(((f9 * fwr0Var.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.v(z4);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.v(z4);
                                                }
                                                motionLayout.setProgress(fMax2);
                                                velocityTracker13 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker13 != null) {
                                                    velocityTracker13.computeCurrentVelocity(i13);
                                                }
                                                velocityTracker14 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker14 != null) {
                                                    xVelocity4 = velocityTracker14.getXVelocity();
                                                } else {
                                                    xVelocity4 = 0.0f;
                                                }
                                                velocityTracker15 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker15 != null) {
                                                    yVelocity4 = velocityTracker15.getYVelocity();
                                                } else {
                                                    yVelocity4 = 0.0f;
                                                }
                                                double d = yVelocity4;
                                                double d2 = xVelocity4;
                                                motionLayout.t = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d, d2) - dAtan2) * Math.hypot(d, d2)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.t = 0.0f;
                                            }
                                            fwr0Var.p = motionEvent.getRawX();
                                            fwr0Var.q = motionEvent.getRawY();
                                        } else {
                                            progress5 = motionLayout.getProgress();
                                            if (fwr0Var.m) {
                                                z3 = true;
                                                fwr0Var.m = true;
                                                motionLayout.setProgress(progress5);
                                            } else {
                                                z3 = true;
                                            }
                                            i12 = fwr0Var.d;
                                            if (i12 != -1) {
                                                boolean z7 = z3;
                                                i13 = 1000;
                                                fwr0Var.r.x(i12, progress5, fwr0Var.h, fwr0Var.g, fArr);
                                                fArr[z7 ? 1 : 0] = (float) Math.toDegrees(fArr[z7 ? 1 : 0]);
                                                r18 = z7;
                                            } else {
                                                boolean z8 = z3;
                                                i13 = 1000;
                                                fArr[z8 ? 1 : 0] = 360.0f;
                                                r18 = z8;
                                            }
                                            fMax2 = Math.max(Math.min(((f9 * fwr0Var.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.v(z4);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.v(z4);
                                                }
                                                motionLayout.setProgress(fMax2);
                                                velocityTracker13 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker13 != null) {
                                                    velocityTracker13.computeCurrentVelocity(i13);
                                                }
                                                velocityTracker14 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker14 != null) {
                                                    xVelocity4 = velocityTracker14.getXVelocity();
                                                } else {
                                                    xVelocity4 = 0.0f;
                                                }
                                                velocityTracker15 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker15 != null) {
                                                    yVelocity4 = velocityTracker15.getYVelocity();
                                                } else {
                                                    yVelocity4 = 0.0f;
                                                }
                                                double d3 = yVelocity4;
                                                double d4 = xVelocity4;
                                                motionLayout.t = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d3, d4) - dAtan2) * Math.hypot(d3, d4)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.t = 0.0f;
                                            }
                                            fwr0Var.p = motionEvent.getRawX();
                                            fwr0Var.q = motionEvent.getRawY();
                                        }
                                    }
                                } else {
                                    velocityTracker2 = (VelocityTracker) h03Var3.b;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    action = motionEvent.getAction();
                                    if (action == 0) {
                                        fwr0Var.p = motionEvent.getRawX();
                                        fwr0Var.q = motionEvent.getRawY();
                                        fwr0Var.m = false;
                                    } else if (action == 1) {
                                        fwr0Var.m = false;
                                        velocityTracker3 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker3 != null) {
                                            velocityTracker3.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker4 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker4 != null) {
                                            xVelocity = velocityTracker4.getXVelocity();
                                        } else {
                                            xVelocity = 0.0f;
                                        }
                                        velocityTracker5 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker5 != null) {
                                            yVelocity = velocityTracker5.getYVelocity();
                                        } else {
                                            yVelocity = 0.0f;
                                        }
                                        progress = motionLayout.getProgress();
                                        i2 = fwr0Var.d;
                                        motionLayout2 = fwr0Var.r;
                                        if (i2 != -1) {
                                            motionLayout2.x(i2, progress, fwr0Var.h, fwr0Var.g, fArr);
                                            c = 1;
                                            c2 = 0;
                                        } else {
                                            float fMin = Math.min(motionLayout2.getWidth(), motionLayout.getHeight());
                                            c = 1;
                                            fArr[1] = fwr0Var.l * fMin;
                                            c2 = 0;
                                            fArr[0] = fMin * fwr0Var.k;
                                        }
                                        f = fwr0Var.k;
                                        f2 = fArr[c2];
                                        f3 = fArr[c];
                                        if (f != 0.0f) {
                                            fAbs = xVelocity / f2;
                                        } else {
                                            fAbs = yVelocity / f3;
                                        }
                                        if (Float.isNaN(fAbs)) {
                                            f4 = progress;
                                        } else {
                                            f4 = (fAbs / 3.0f) + progress;
                                        }
                                        if (f4 == 0.0f) {
                                            if (0.0f < f4) {
                                                motionLayout.setState(zs40Var);
                                            } else {
                                                motionLayout.setState(zs40Var);
                                            }
                                        } else if (0.0f < f4) {
                                            motionLayout.setState(zs40Var);
                                        } else {
                                            motionLayout.setState(zs40Var);
                                        }
                                    } else if (action == 2) {
                                        rawY = motionEvent.getRawY() - fwr0Var.q;
                                        rawX = motionEvent.getRawX() - fwr0Var.p;
                                        if (Math.abs((fwr0Var.l * rawY) + (fwr0Var.k * rawX)) <= fwr0Var.x) {
                                            progress2 = motionLayout.getProgress();
                                            if (!fwr0Var.m) {
                                                fwr0Var.m = true;
                                                motionLayout.setProgress(progress2);
                                            }
                                            i4 = fwr0Var.d;
                                            motionLayout3 = fwr0Var.r;
                                            if (i4 != -1) {
                                                motionLayout3.x(i4, progress2, fwr0Var.h, fwr0Var.g, fArr);
                                                c3 = 1;
                                                c4 = 0;
                                            } else {
                                                float fMin2 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
                                                c3 = 1;
                                                fArr[1] = fwr0Var.l * fMin2;
                                                c4 = 0;
                                                fArr[0] = fMin2 * fwr0Var.k;
                                            }
                                            if (Math.abs(((fwr0Var.l * fArr[c3]) + (fwr0Var.k * fArr[c4])) * fwr0Var.v) < 0.01d) {
                                                fArr[0] = 0.01f;
                                                fArr[c3] = 0.01f;
                                            }
                                            if (fwr0Var.k != 0.0f) {
                                                f5 = rawX / fArr[0];
                                            } else {
                                                f5 = rawY / fArr[c3];
                                            }
                                            fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                            if (fwr0Var.c == 6) {
                                                fMax = Math.max(fMax, 0.01f);
                                            }
                                            if (fwr0Var.c == 7) {
                                                fMax = Math.min(fMax, 0.99f);
                                            }
                                            progress3 = motionLayout.getProgress();
                                            if (fMax != progress3) {
                                                if (progress3 != 0.0f) {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.v(z2);
                                                } else {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.v(z2);
                                                }
                                                motionLayout.setProgress(fMax);
                                                velocityTracker6 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker6 != null) {
                                                    velocityTracker6.computeCurrentVelocity(1000);
                                                }
                                                velocityTracker7 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker7 != null) {
                                                    xVelocity2 = velocityTracker7.getXVelocity();
                                                } else {
                                                    xVelocity2 = 0.0f;
                                                }
                                                velocityTracker8 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker8 != null) {
                                                    yVelocity2 = velocityTracker8.getYVelocity();
                                                } else {
                                                    yVelocity2 = 0.0f;
                                                }
                                                if (fwr0Var.k != 0.0f) {
                                                    f6 = xVelocity2 / fArr[0];
                                                } else {
                                                    f6 = yVelocity2 / fArr[1];
                                                }
                                                motionLayout.t = f6;
                                            } else {
                                                motionLayout.t = 0.0f;
                                            }
                                            fwr0Var.p = motionEvent.getRawX();
                                            fwr0Var.q = motionEvent.getRawY();
                                        } else {
                                            progress2 = motionLayout.getProgress();
                                            if (!fwr0Var.m) {
                                                fwr0Var.m = true;
                                                motionLayout.setProgress(progress2);
                                            }
                                            i4 = fwr0Var.d;
                                            motionLayout3 = fwr0Var.r;
                                            if (i4 != -1) {
                                                motionLayout3.x(i4, progress2, fwr0Var.h, fwr0Var.g, fArr);
                                                c3 = 1;
                                                c4 = 0;
                                            } else {
                                                float fMin3 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
                                                c3 = 1;
                                                fArr[1] = fwr0Var.l * fMin3;
                                                c4 = 0;
                                                fArr[0] = fMin3 * fwr0Var.k;
                                            }
                                            if (Math.abs(((fwr0Var.l * fArr[c3]) + (fwr0Var.k * fArr[c4])) * fwr0Var.v) < 0.01d) {
                                                fArr[0] = 0.01f;
                                                fArr[c3] = 0.01f;
                                            }
                                            if (fwr0Var.k != 0.0f) {
                                                f5 = rawX / fArr[0];
                                            } else {
                                                f5 = rawY / fArr[c3];
                                            }
                                            fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                            if (fwr0Var.c == 6) {
                                                fMax = Math.max(fMax, 0.01f);
                                            }
                                            if (fwr0Var.c == 7) {
                                                fMax = Math.min(fMax, 0.99f);
                                            }
                                            progress3 = motionLayout.getProgress();
                                            if (fMax != progress3) {
                                                if (progress3 != 0.0f) {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.v(z2);
                                                } else {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.v(z2);
                                                }
                                                motionLayout.setProgress(fMax);
                                                velocityTracker6 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker6 != null) {
                                                    velocityTracker6.computeCurrentVelocity(1000);
                                                }
                                                velocityTracker7 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker7 != null) {
                                                    xVelocity2 = velocityTracker7.getXVelocity();
                                                } else {
                                                    xVelocity2 = 0.0f;
                                                }
                                                velocityTracker8 = (VelocityTracker) h03Var3.b;
                                                if (velocityTracker8 != null) {
                                                    yVelocity2 = velocityTracker8.getYVelocity();
                                                } else {
                                                    yVelocity2 = 0.0f;
                                                }
                                                if (fwr0Var.k != 0.0f) {
                                                    f6 = xVelocity2 / fArr[0];
                                                } else {
                                                    f6 = yVelocity2 / fArr[1];
                                                }
                                                motionLayout.t = f6;
                                            } else {
                                                motionLayout.t = 0.0f;
                                            }
                                            fwr0Var.p = motionEvent.getRawX();
                                            fwr0Var.q = motionEvent.getRawY();
                                        }
                                    }
                                }
                            }
                        }
                        wt40Var2.r = motionEvent.getRawX();
                        wt40Var2.s = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            velocityTracker = (VelocityTracker) h03Var.b;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                h03Var2 = null;
                                h03Var.b = null;
                            } else {
                                h03Var2 = null;
                            }
                            wt40Var2.o = h03Var2;
                            i = this.v;
                            if (i != -1) {
                                wt40Var2.a(i, this);
                            }
                        }
                    }
                }
            } else if (!wt40Var2.m) {
                vt40Var = wt40Var2.c;
                if (vt40Var != null) {
                    fArr = fwr0Var.n;
                    if (!wt40Var2.n) {
                        h03Var3 = wt40Var2.o;
                        motionLayout = fwr0Var.r;
                        z = fwr0Var.j;
                        zs40Var = zs40.d;
                        if (z) {
                            iArr = fwr0Var.o;
                            velocityTracker9 = (VelocityTracker) h03Var3.b;
                            if (velocityTracker9 != null) {
                                velocityTracker9.addMovement(motionEvent);
                            }
                            action2 = motionEvent.getAction();
                            if (action2 == 0) {
                                fwr0Var.p = motionEvent.getRawX();
                                fwr0Var.q = motionEvent.getRawY();
                                fwr0Var.m = false;
                            } else if (action2 == 1) {
                                fwr0Var.m = false;
                                velocityTracker10 = (VelocityTracker) h03Var3.b;
                                if (velocityTracker10 != null) {
                                    velocityTracker10.computeCurrentVelocity(16);
                                }
                                velocityTracker11 = (VelocityTracker) h03Var3.b;
                                if (velocityTracker11 != null) {
                                    xVelocity3 = velocityTracker11.getXVelocity();
                                } else {
                                    xVelocity3 = 0.0f;
                                }
                                velocityTracker12 = (VelocityTracker) h03Var3.b;
                                if (velocityTracker12 != null) {
                                    yVelocity3 = velocityTracker12.getYVelocity();
                                } else {
                                    yVelocity3 = 0.0f;
                                }
                                progress4 = motionLayout.getProgress();
                                width = motionLayout.getWidth() / 2.0f;
                                float height3 = motionLayout.getHeight() / 2.0f;
                                i5 = fwr0Var.i;
                                if (i5 != -1) {
                                    View viewFindViewById5 = motionLayout.findViewById(i5);
                                    motionLayout.getLocationOnScreen(iArr);
                                    width = iArr[0] + ((viewFindViewById5.getRight() + viewFindViewById5.getLeft()) / 2.0f);
                                    f7 = iArr[1];
                                    top = viewFindViewById5.getTop();
                                    bottom = viewFindViewById5.getBottom();
                                } else {
                                    i6 = fwr0Var.d;
                                    if (i6 != -1) {
                                        View viewFindViewById6 = motionLayout.findViewById(((ds40) motionLayout.A.get(motionLayout.findViewById(i6))).f.k);
                                        motionLayout.getLocationOnScreen(iArr);
                                        width = iArr[0] + ((viewFindViewById6.getRight() + viewFindViewById6.getLeft()) / 2.0f);
                                        f7 = iArr[1];
                                        top = viewFindViewById6.getTop();
                                        bottom = viewFindViewById6.getBottom();
                                    } else {
                                        float rawX6 = motionEvent.getRawX() - width;
                                        float rawY6 = motionEvent.getRawY() - height3;
                                        double degrees4 = Math.toDegrees(Math.atan2(rawY6, rawX6));
                                        i7 = fwr0Var.d;
                                        if (i7 != -1) {
                                            zs40Var2 = zs40Var;
                                            i8 = 6;
                                            fwr0Var.r.x(i7, progress4, fwr0Var.h, fwr0Var.g, fArr);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            zs40Var2 = zs40Var;
                                            i8 = 6;
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY6, xVelocity3 + rawX6)) - degrees4)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f8 = (((degrees * 3.0f) * fwr0Var.v) / fArr[1]) + progress4;
                                        } else {
                                            f8 = progress4;
                                        }
                                        if (f8 != 0.0f) {
                                            zs40Var3 = zs40Var2;
                                            if (0.0f < f8) {
                                                motionLayout.setState(zs40Var3);
                                            } else {
                                                motionLayout.setState(zs40Var3);
                                            }
                                        } else {
                                            zs40Var3 = zs40Var2;
                                            if (0.0f < f8) {
                                                motionLayout.setState(zs40Var3);
                                            } else {
                                                motionLayout.setState(zs40Var3);
                                            }
                                        }
                                    }
                                }
                                height3 = ((bottom + top) / 2.0f) + f7;
                                float rawX7 = motionEvent.getRawX() - width;
                                float rawY7 = motionEvent.getRawY() - height3;
                                double degrees5 = Math.toDegrees(Math.atan2(rawY7, rawX7));
                                i7 = fwr0Var.d;
                                if (i7 != -1) {
                                    zs40Var2 = zs40Var;
                                    i8 = 6;
                                    fwr0Var.r.x(i7, progress4, fwr0Var.h, fwr0Var.g, fArr);
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    zs40Var2 = zs40Var;
                                    i8 = 6;
                                    fArr[1] = 360.0f;
                                }
                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY7, xVelocity3 + rawX7)) - degrees5)) * 62.5f;
                                if (Float.isNaN(degrees)) {
                                    f8 = (((degrees * 3.0f) * fwr0Var.v) / fArr[1]) + progress4;
                                } else {
                                    f8 = progress4;
                                }
                                if (f8 != 0.0f) {
                                    zs40Var3 = zs40Var2;
                                    if (0.0f < f8) {
                                        motionLayout.setState(zs40Var3);
                                    } else {
                                        motionLayout.setState(zs40Var3);
                                    }
                                } else {
                                    zs40Var3 = zs40Var2;
                                    if (0.0f < f8) {
                                        motionLayout.setState(zs40Var3);
                                    } else {
                                        motionLayout.setState(zs40Var3);
                                    }
                                }
                            } else if (action2 == 2) {
                                motionEvent.getRawY();
                                motionEvent.getRawX();
                                width2 = motionLayout.getWidth() / 2.0f;
                                height = motionLayout.getHeight() / 2.0f;
                                i10 = fwr0Var.i;
                                if (i10 != -1) {
                                    View viewFindViewById7 = motionLayout.findViewById(i10);
                                    motionLayout.getLocationOnScreen(iArr);
                                    float right2 = iArr[0] + ((viewFindViewById7.getRight() + viewFindViewById7.getLeft()) / 2.0f);
                                    float bottom3 = iArr[1] + ((viewFindViewById7.getBottom() + viewFindViewById7.getTop()) / 2.0f);
                                    width2 = right2;
                                    height = bottom3;
                                } else {
                                    i11 = fwr0Var.d;
                                    if (i11 != -1) {
                                        viewFindViewById = motionLayout.findViewById(((ds40) motionLayout.A.get(motionLayout.findViewById(i11))).f.k);
                                        if (viewFindViewById == null) {
                                            Log.e("TouchResponse", "could not find view to animate to");
                                        } else {
                                            motionLayout.getLocationOnScreen(iArr);
                                            width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                            height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                        }
                                    }
                                }
                                rawX2 = motionEvent.getRawX() - width2;
                                rawY2 = motionEvent.getRawY() - height;
                                dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                                fAtan2 = (float) (((dAtan2 - Math.atan2(fwr0Var.q - height, fwr0Var.p - width2)) * 180.0d) / 3.141592653589793d);
                                if (fAtan2 > 330.0f) {
                                    fAtan2 -= 360.0f;
                                } else if (fAtan2 < -330.0f) {
                                    fAtan2 += 360.0f;
                                }
                                f9 = fAtan2;
                                if (Math.abs(f9) <= 0.01d) {
                                    progress5 = motionLayout.getProgress();
                                    if (fwr0Var.m) {
                                        z3 = true;
                                        fwr0Var.m = true;
                                        motionLayout.setProgress(progress5);
                                    } else {
                                        z3 = true;
                                    }
                                    i12 = fwr0Var.d;
                                    if (i12 != -1) {
                                        boolean z9 = z3;
                                        i13 = 1000;
                                        fwr0Var.r.x(i12, progress5, fwr0Var.h, fwr0Var.g, fArr);
                                        fArr[z9 ? 1 : 0] = (float) Math.toDegrees(fArr[z9 ? 1 : 0]);
                                        r18 = z9;
                                    } else {
                                        boolean z10 = z3;
                                        i13 = 1000;
                                        fArr[z10 ? 1 : 0] = 360.0f;
                                        r18 = z10;
                                    }
                                    fMax2 = Math.max(Math.min(((f9 * fwr0Var.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.v(z4);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.v(z4);
                                        }
                                        motionLayout.setProgress(fMax2);
                                        velocityTracker13 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker13 != null) {
                                            velocityTracker13.computeCurrentVelocity(i13);
                                        }
                                        velocityTracker14 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker14 != null) {
                                            xVelocity4 = velocityTracker14.getXVelocity();
                                        } else {
                                            xVelocity4 = 0.0f;
                                        }
                                        velocityTracker15 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker15 != null) {
                                            yVelocity4 = velocityTracker15.getYVelocity();
                                        } else {
                                            yVelocity4 = 0.0f;
                                        }
                                        double d5 = yVelocity4;
                                        double d6 = xVelocity4;
                                        motionLayout.t = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d5, d6) - dAtan2) * Math.hypot(d5, d6)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.t = 0.0f;
                                    }
                                    fwr0Var.p = motionEvent.getRawX();
                                    fwr0Var.q = motionEvent.getRawY();
                                } else {
                                    progress5 = motionLayout.getProgress();
                                    if (fwr0Var.m) {
                                        z3 = true;
                                        fwr0Var.m = true;
                                        motionLayout.setProgress(progress5);
                                    } else {
                                        z3 = true;
                                    }
                                    i12 = fwr0Var.d;
                                    if (i12 != -1) {
                                        boolean z11 = z3;
                                        i13 = 1000;
                                        fwr0Var.r.x(i12, progress5, fwr0Var.h, fwr0Var.g, fArr);
                                        fArr[z11 ? 1 : 0] = (float) Math.toDegrees(fArr[z11 ? 1 : 0]);
                                        r18 = z11;
                                    } else {
                                        boolean z12 = z3;
                                        i13 = 1000;
                                        fArr[z12 ? 1 : 0] = 360.0f;
                                        r18 = z12;
                                    }
                                    fMax2 = Math.max(Math.min(((f9 * fwr0Var.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.v(z4);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.v(z4);
                                        }
                                        motionLayout.setProgress(fMax2);
                                        velocityTracker13 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker13 != null) {
                                            velocityTracker13.computeCurrentVelocity(i13);
                                        }
                                        velocityTracker14 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker14 != null) {
                                            xVelocity4 = velocityTracker14.getXVelocity();
                                        } else {
                                            xVelocity4 = 0.0f;
                                        }
                                        velocityTracker15 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker15 != null) {
                                            yVelocity4 = velocityTracker15.getYVelocity();
                                        } else {
                                            yVelocity4 = 0.0f;
                                        }
                                        double d7 = yVelocity4;
                                        double d8 = xVelocity4;
                                        motionLayout.t = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d7, d8) - dAtan2) * Math.hypot(d7, d8)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.t = 0.0f;
                                    }
                                    fwr0Var.p = motionEvent.getRawX();
                                    fwr0Var.q = motionEvent.getRawY();
                                }
                            }
                        } else {
                            velocityTracker2 = (VelocityTracker) h03Var3.b;
                            if (velocityTracker2 != null) {
                                velocityTracker2.addMovement(motionEvent);
                            }
                            action = motionEvent.getAction();
                            if (action == 0) {
                                fwr0Var.p = motionEvent.getRawX();
                                fwr0Var.q = motionEvent.getRawY();
                                fwr0Var.m = false;
                            } else if (action == 1) {
                                fwr0Var.m = false;
                                velocityTracker3 = (VelocityTracker) h03Var3.b;
                                if (velocityTracker3 != null) {
                                    velocityTracker3.computeCurrentVelocity(1000);
                                }
                                velocityTracker4 = (VelocityTracker) h03Var3.b;
                                if (velocityTracker4 != null) {
                                    xVelocity = velocityTracker4.getXVelocity();
                                } else {
                                    xVelocity = 0.0f;
                                }
                                velocityTracker5 = (VelocityTracker) h03Var3.b;
                                if (velocityTracker5 != null) {
                                    yVelocity = velocityTracker5.getYVelocity();
                                } else {
                                    yVelocity = 0.0f;
                                }
                                progress = motionLayout.getProgress();
                                i2 = fwr0Var.d;
                                motionLayout2 = fwr0Var.r;
                                if (i2 != -1) {
                                    motionLayout2.x(i2, progress, fwr0Var.h, fwr0Var.g, fArr);
                                    c = 1;
                                    c2 = 0;
                                } else {
                                    float fMin4 = Math.min(motionLayout2.getWidth(), motionLayout.getHeight());
                                    c = 1;
                                    fArr[1] = fwr0Var.l * fMin4;
                                    c2 = 0;
                                    fArr[0] = fMin4 * fwr0Var.k;
                                }
                                f = fwr0Var.k;
                                f2 = fArr[c2];
                                f3 = fArr[c];
                                if (f != 0.0f) {
                                    fAbs = xVelocity / f2;
                                } else {
                                    fAbs = yVelocity / f3;
                                }
                                if (Float.isNaN(fAbs)) {
                                    f4 = (fAbs / 3.0f) + progress;
                                } else {
                                    f4 = progress;
                                }
                                if (f4 == 0.0f) {
                                    if (0.0f < f4) {
                                        motionLayout.setState(zs40Var);
                                    } else {
                                        motionLayout.setState(zs40Var);
                                    }
                                } else if (0.0f < f4) {
                                    motionLayout.setState(zs40Var);
                                } else {
                                    motionLayout.setState(zs40Var);
                                }
                            } else if (action == 2) {
                                rawY = motionEvent.getRawY() - fwr0Var.q;
                                rawX = motionEvent.getRawX() - fwr0Var.p;
                                if (Math.abs((fwr0Var.l * rawY) + (fwr0Var.k * rawX)) <= fwr0Var.x) {
                                    progress2 = motionLayout.getProgress();
                                    if (!fwr0Var.m) {
                                        fwr0Var.m = true;
                                        motionLayout.setProgress(progress2);
                                    }
                                    i4 = fwr0Var.d;
                                    motionLayout3 = fwr0Var.r;
                                    if (i4 != -1) {
                                        motionLayout3.x(i4, progress2, fwr0Var.h, fwr0Var.g, fArr);
                                        c3 = 1;
                                        c4 = 0;
                                    } else {
                                        float fMin5 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
                                        c3 = 1;
                                        fArr[1] = fwr0Var.l * fMin5;
                                        c4 = 0;
                                        fArr[0] = fMin5 * fwr0Var.k;
                                    }
                                    if (Math.abs(((fwr0Var.l * fArr[c3]) + (fwr0Var.k * fArr[c4])) * fwr0Var.v) < 0.01d) {
                                        fArr[0] = 0.01f;
                                        fArr[c3] = 0.01f;
                                    }
                                    if (fwr0Var.k != 0.0f) {
                                        f5 = rawX / fArr[0];
                                    } else {
                                        f5 = rawY / fArr[c3];
                                    }
                                    fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                    if (fwr0Var.c == 6) {
                                        fMax = Math.max(fMax, 0.01f);
                                    }
                                    if (fwr0Var.c == 7) {
                                        fMax = Math.min(fMax, 0.99f);
                                    }
                                    progress3 = motionLayout.getProgress();
                                    if (fMax != progress3) {
                                        if (progress3 != 0.0f) {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.v(z2);
                                        } else {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.v(z2);
                                        }
                                        motionLayout.setProgress(fMax);
                                        velocityTracker6 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker6 != null) {
                                            velocityTracker6.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker7 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker7 != null) {
                                            xVelocity2 = velocityTracker7.getXVelocity();
                                        } else {
                                            xVelocity2 = 0.0f;
                                        }
                                        velocityTracker8 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker8 != null) {
                                            yVelocity2 = velocityTracker8.getYVelocity();
                                        } else {
                                            yVelocity2 = 0.0f;
                                        }
                                        if (fwr0Var.k != 0.0f) {
                                            f6 = xVelocity2 / fArr[0];
                                        } else {
                                            f6 = yVelocity2 / fArr[1];
                                        }
                                        motionLayout.t = f6;
                                    } else {
                                        motionLayout.t = 0.0f;
                                    }
                                    fwr0Var.p = motionEvent.getRawX();
                                    fwr0Var.q = motionEvent.getRawY();
                                } else {
                                    progress2 = motionLayout.getProgress();
                                    if (!fwr0Var.m) {
                                        fwr0Var.m = true;
                                        motionLayout.setProgress(progress2);
                                    }
                                    i4 = fwr0Var.d;
                                    motionLayout3 = fwr0Var.r;
                                    if (i4 != -1) {
                                        motionLayout3.x(i4, progress2, fwr0Var.h, fwr0Var.g, fArr);
                                        c3 = 1;
                                        c4 = 0;
                                    } else {
                                        float fMin6 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
                                        c3 = 1;
                                        fArr[1] = fwr0Var.l * fMin6;
                                        c4 = 0;
                                        fArr[0] = fMin6 * fwr0Var.k;
                                    }
                                    if (Math.abs(((fwr0Var.l * fArr[c3]) + (fwr0Var.k * fArr[c4])) * fwr0Var.v) < 0.01d) {
                                        fArr[0] = 0.01f;
                                        fArr[c3] = 0.01f;
                                    }
                                    if (fwr0Var.k != 0.0f) {
                                        f5 = rawX / fArr[0];
                                    } else {
                                        f5 = rawY / fArr[c3];
                                    }
                                    fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                    if (fwr0Var.c == 6) {
                                        fMax = Math.max(fMax, 0.01f);
                                    }
                                    if (fwr0Var.c == 7) {
                                        fMax = Math.min(fMax, 0.99f);
                                    }
                                    progress3 = motionLayout.getProgress();
                                    if (fMax != progress3) {
                                        if (progress3 != 0.0f) {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.v(z2);
                                        } else {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.v(z2);
                                        }
                                        motionLayout.setProgress(fMax);
                                        velocityTracker6 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker6 != null) {
                                            velocityTracker6.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker7 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker7 != null) {
                                            xVelocity2 = velocityTracker7.getXVelocity();
                                        } else {
                                            xVelocity2 = 0.0f;
                                        }
                                        velocityTracker8 = (VelocityTracker) h03Var3.b;
                                        if (velocityTracker8 != null) {
                                            yVelocity2 = velocityTracker8.getYVelocity();
                                        } else {
                                            yVelocity2 = 0.0f;
                                        }
                                        if (fwr0Var.k != 0.0f) {
                                            f6 = xVelocity2 / fArr[0];
                                        } else {
                                            f6 = yVelocity2 / fArr[1];
                                        }
                                        motionLayout.t = f6;
                                    } else {
                                        motionLayout.t = 0.0f;
                                    }
                                    fwr0Var.p = motionEvent.getRawX();
                                    fwr0Var.q = motionEvent.getRawY();
                                }
                            }
                        }
                    }
                }
                wt40Var2.r = motionEvent.getRawX();
                wt40Var2.s = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    velocityTracker = (VelocityTracker) h03Var.b;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        h03Var2 = null;
                        h03Var.b = null;
                    } else {
                        h03Var2 = null;
                    }
                    wt40Var2.o = h03Var2;
                    i = this.v;
                    if (i != -1) {
                        wt40Var2.a(i, this);
                    }
                }
            }
        } else if (!wt40Var2.m) {
            vt40Var = wt40Var2.c;
            if (vt40Var != null && (fwr0Var = vt40Var.l) != null) {
                fArr = fwr0Var.n;
                if (!wt40Var2.n) {
                    h03Var3 = wt40Var2.o;
                    motionLayout = fwr0Var.r;
                    z = fwr0Var.j;
                    zs40Var = zs40.d;
                    if (z) {
                        iArr = fwr0Var.o;
                        velocityTracker9 = (VelocityTracker) h03Var3.b;
                        if (velocityTracker9 != null) {
                            velocityTracker9.addMovement(motionEvent);
                        }
                        action2 = motionEvent.getAction();
                        if (action2 == 0) {
                            fwr0Var.p = motionEvent.getRawX();
                            fwr0Var.q = motionEvent.getRawY();
                            fwr0Var.m = false;
                        } else if (action2 == 1) {
                            fwr0Var.m = false;
                            velocityTracker10 = (VelocityTracker) h03Var3.b;
                            if (velocityTracker10 != null) {
                                velocityTracker10.computeCurrentVelocity(16);
                            }
                            velocityTracker11 = (VelocityTracker) h03Var3.b;
                            if (velocityTracker11 != null) {
                                xVelocity3 = velocityTracker11.getXVelocity();
                            } else {
                                xVelocity3 = 0.0f;
                            }
                            velocityTracker12 = (VelocityTracker) h03Var3.b;
                            if (velocityTracker12 != null) {
                                yVelocity3 = velocityTracker12.getYVelocity();
                            } else {
                                yVelocity3 = 0.0f;
                            }
                            progress4 = motionLayout.getProgress();
                            width = motionLayout.getWidth() / 2.0f;
                            float height4 = motionLayout.getHeight() / 2.0f;
                            i5 = fwr0Var.i;
                            if (i5 != -1) {
                                View viewFindViewById8 = motionLayout.findViewById(i5);
                                motionLayout.getLocationOnScreen(iArr);
                                width = iArr[0] + ((viewFindViewById8.getRight() + viewFindViewById8.getLeft()) / 2.0f);
                                f7 = iArr[1];
                                top = viewFindViewById8.getTop();
                                bottom = viewFindViewById8.getBottom();
                            } else {
                                i6 = fwr0Var.d;
                                if (i6 != -1) {
                                    View viewFindViewById9 = motionLayout.findViewById(((ds40) motionLayout.A.get(motionLayout.findViewById(i6))).f.k);
                                    motionLayout.getLocationOnScreen(iArr);
                                    width = iArr[0] + ((viewFindViewById9.getRight() + viewFindViewById9.getLeft()) / 2.0f);
                                    f7 = iArr[1];
                                    top = viewFindViewById9.getTop();
                                    bottom = viewFindViewById9.getBottom();
                                } else {
                                    float rawX8 = motionEvent.getRawX() - width;
                                    float rawY8 = motionEvent.getRawY() - height4;
                                    double degrees6 = Math.toDegrees(Math.atan2(rawY8, rawX8));
                                    i7 = fwr0Var.d;
                                    if (i7 != -1) {
                                        zs40Var2 = zs40Var;
                                        i8 = 6;
                                        fwr0Var.r.x(i7, progress4, fwr0Var.h, fwr0Var.g, fArr);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        zs40Var2 = zs40Var;
                                        i8 = 6;
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY8, xVelocity3 + rawX8)) - degrees6)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f8 = (((degrees * 3.0f) * fwr0Var.v) / fArr[1]) + progress4;
                                    } else {
                                        f8 = progress4;
                                    }
                                    if (f8 != 0.0f || f8 == 1.0f || (i9 = fwr0Var.c) == 3) {
                                        zs40Var3 = zs40Var2;
                                        if (0.0f < f8 || 1.0f <= f8) {
                                            motionLayout.setState(zs40Var3);
                                        }
                                    } else {
                                        float fAbs2 = (degrees * fwr0Var.v) / fArr[1];
                                        float f18 = ((double) f8) < 0.5d ? 0.0f : 1.0f;
                                        if (i9 == i8) {
                                            if (progress4 + fAbs2 < 0.0f) {
                                                fAbs2 = Math.abs(fAbs2);
                                            }
                                            f18 = 1.0f;
                                        }
                                        if (fwr0Var.c == 7) {
                                            if (progress4 + fAbs2 > 1.0f) {
                                                fAbs2 = -Math.abs(fAbs2);
                                            }
                                            f18 = 0.0f;
                                        }
                                        motionLayout.F(f18, fAbs2 * 3.0f, fwr0Var.c);
                                        if (0.0f >= progress4 || 1.0f <= progress4) {
                                            motionLayout.setState(zs40Var2);
                                        }
                                    }
                                }
                            }
                            height4 = ((bottom + top) / 2.0f) + f7;
                            float rawX9 = motionEvent.getRawX() - width;
                            float rawY9 = motionEvent.getRawY() - height4;
                            double degrees7 = Math.toDegrees(Math.atan2(rawY9, rawX9));
                            i7 = fwr0Var.d;
                            if (i7 != -1) {
                                zs40Var2 = zs40Var;
                                i8 = 6;
                                fwr0Var.r.x(i7, progress4, fwr0Var.h, fwr0Var.g, fArr);
                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                            } else {
                                zs40Var2 = zs40Var;
                                i8 = 6;
                                fArr[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY9, xVelocity3 + rawX9)) - degrees7)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f8 = (((degrees * 3.0f) * fwr0Var.v) / fArr[1]) + progress4;
                            } else {
                                f8 = progress4;
                            }
                            if (f8 != 0.0f) {
                                zs40Var3 = zs40Var2;
                                if (0.0f < f8) {
                                    motionLayout.setState(zs40Var3);
                                } else {
                                    motionLayout.setState(zs40Var3);
                                }
                            } else {
                                zs40Var3 = zs40Var2;
                                if (0.0f < f8) {
                                    motionLayout.setState(zs40Var3);
                                } else {
                                    motionLayout.setState(zs40Var3);
                                }
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            width2 = motionLayout.getWidth() / 2.0f;
                            height = motionLayout.getHeight() / 2.0f;
                            i10 = fwr0Var.i;
                            if (i10 != -1) {
                                View viewFindViewById10 = motionLayout.findViewById(i10);
                                motionLayout.getLocationOnScreen(iArr);
                                float right3 = iArr[0] + ((viewFindViewById10.getRight() + viewFindViewById10.getLeft()) / 2.0f);
                                float bottom4 = iArr[1] + ((viewFindViewById10.getBottom() + viewFindViewById10.getTop()) / 2.0f);
                                width2 = right3;
                                height = bottom4;
                            } else {
                                i11 = fwr0Var.d;
                                if (i11 != -1) {
                                    viewFindViewById = motionLayout.findViewById(((ds40) motionLayout.A.get(motionLayout.findViewById(i11))).f.k);
                                    if (viewFindViewById == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        motionLayout.getLocationOnScreen(iArr);
                                        width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                        height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                    }
                                }
                            }
                            rawX2 = motionEvent.getRawX() - width2;
                            rawY2 = motionEvent.getRawY() - height;
                            dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                            fAtan2 = (float) (((dAtan2 - Math.atan2(fwr0Var.q - height, fwr0Var.p - width2)) * 180.0d) / 3.141592653589793d);
                            if (fAtan2 > 330.0f) {
                                fAtan2 -= 360.0f;
                            } else if (fAtan2 < -330.0f) {
                                fAtan2 += 360.0f;
                            }
                            f9 = fAtan2;
                            if (Math.abs(f9) <= 0.01d || fwr0Var.m) {
                                progress5 = motionLayout.getProgress();
                                if (fwr0Var.m) {
                                    z3 = true;
                                    fwr0Var.m = true;
                                    motionLayout.setProgress(progress5);
                                } else {
                                    z3 = true;
                                }
                                i12 = fwr0Var.d;
                                if (i12 != -1) {
                                    boolean z13 = z3;
                                    i13 = 1000;
                                    fwr0Var.r.x(i12, progress5, fwr0Var.h, fwr0Var.g, fArr);
                                    fArr[z13 ? 1 : 0] = (float) Math.toDegrees(fArr[z13 ? 1 : 0]);
                                    r18 = z13;
                                } else {
                                    boolean z14 = z3;
                                    i13 = 1000;
                                    fArr[z14 ? 1 : 0] = 360.0f;
                                    r18 = z14;
                                }
                                fMax2 = Math.max(Math.min(((f9 * fwr0Var.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                progress6 = motionLayout.getProgress();
                                if (fMax2 != progress6) {
                                    if (progress6 != 0.0f || progress6 == 1.0f) {
                                        if (progress6 == 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        motionLayout.v(z4);
                                    }
                                    motionLayout.setProgress(fMax2);
                                    velocityTracker13 = (VelocityTracker) h03Var3.b;
                                    if (velocityTracker13 != null) {
                                        velocityTracker13.computeCurrentVelocity(i13);
                                    }
                                    velocityTracker14 = (VelocityTracker) h03Var3.b;
                                    if (velocityTracker14 != null) {
                                        xVelocity4 = velocityTracker14.getXVelocity();
                                    } else {
                                        xVelocity4 = 0.0f;
                                    }
                                    velocityTracker15 = (VelocityTracker) h03Var3.b;
                                    if (velocityTracker15 != null) {
                                        yVelocity4 = velocityTracker15.getYVelocity();
                                    } else {
                                        yVelocity4 = 0.0f;
                                    }
                                    double d9 = yVelocity4;
                                    double d10 = xVelocity4;
                                    motionLayout.t = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d9, d10) - dAtan2) * Math.hypot(d9, d10)) / Math.hypot(rawX2, rawY2)));
                                } else {
                                    motionLayout.t = 0.0f;
                                }
                                fwr0Var.p = motionEvent.getRawX();
                                fwr0Var.q = motionEvent.getRawY();
                            }
                        }
                    } else {
                        velocityTracker2 = (VelocityTracker) h03Var3.b;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        action = motionEvent.getAction();
                        if (action == 0) {
                            fwr0Var.p = motionEvent.getRawX();
                            fwr0Var.q = motionEvent.getRawY();
                            fwr0Var.m = false;
                        } else if (action == 1) {
                            fwr0Var.m = false;
                            velocityTracker3 = (VelocityTracker) h03Var3.b;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(1000);
                            }
                            velocityTracker4 = (VelocityTracker) h03Var3.b;
                            if (velocityTracker4 != null) {
                                xVelocity = velocityTracker4.getXVelocity();
                            } else {
                                xVelocity = 0.0f;
                            }
                            velocityTracker5 = (VelocityTracker) h03Var3.b;
                            if (velocityTracker5 != null) {
                                yVelocity = velocityTracker5.getYVelocity();
                            } else {
                                yVelocity = 0.0f;
                            }
                            progress = motionLayout.getProgress();
                            i2 = fwr0Var.d;
                            motionLayout2 = fwr0Var.r;
                            if (i2 != -1) {
                                motionLayout2.x(i2, progress, fwr0Var.h, fwr0Var.g, fArr);
                                c = 1;
                                c2 = 0;
                            } else {
                                float fMin7 = Math.min(motionLayout2.getWidth(), motionLayout.getHeight());
                                c = 1;
                                fArr[1] = fwr0Var.l * fMin7;
                                c2 = 0;
                                fArr[0] = fMin7 * fwr0Var.k;
                            }
                            f = fwr0Var.k;
                            f2 = fArr[c2];
                            f3 = fArr[c];
                            if (f != 0.0f) {
                                fAbs = xVelocity / f2;
                            } else {
                                fAbs = yVelocity / f3;
                            }
                            if (Float.isNaN(fAbs)) {
                                f4 = (fAbs / 3.0f) + progress;
                            } else {
                                f4 = progress;
                            }
                            if (f4 == 0.0f && f4 != 1.0f && (i3 = fwr0Var.c) != 3) {
                                float f19 = ((double) f4) < 0.5d ? 0.0f : 1.0f;
                                if (i3 == 6) {
                                    if (progress + fAbs < 0.0f) {
                                        fAbs = Math.abs(fAbs);
                                    }
                                    f19 = 1.0f;
                                }
                                if (fwr0Var.c == 7) {
                                    if (progress + fAbs > 1.0f) {
                                        fAbs = -Math.abs(fAbs);
                                    }
                                    f19 = 0.0f;
                                }
                                motionLayout.F(f19, fAbs, fwr0Var.c);
                                if (0.0f >= progress || 1.0f <= progress) {
                                    motionLayout.setState(zs40Var);
                                }
                            } else if (0.0f < f4 || 1.0f <= f4) {
                                motionLayout.setState(zs40Var);
                            }
                        } else if (action == 2) {
                            rawY = motionEvent.getRawY() - fwr0Var.q;
                            rawX = motionEvent.getRawX() - fwr0Var.p;
                            if (Math.abs((fwr0Var.l * rawY) + (fwr0Var.k * rawX)) <= fwr0Var.x || fwr0Var.m) {
                                progress2 = motionLayout.getProgress();
                                if (!fwr0Var.m) {
                                    fwr0Var.m = true;
                                    motionLayout.setProgress(progress2);
                                }
                                i4 = fwr0Var.d;
                                motionLayout3 = fwr0Var.r;
                                if (i4 != -1) {
                                    motionLayout3.x(i4, progress2, fwr0Var.h, fwr0Var.g, fArr);
                                    c3 = 1;
                                    c4 = 0;
                                } else {
                                    float fMin8 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
                                    c3 = 1;
                                    fArr[1] = fwr0Var.l * fMin8;
                                    c4 = 0;
                                    fArr[0] = fMin8 * fwr0Var.k;
                                }
                                if (Math.abs(((fwr0Var.l * fArr[c3]) + (fwr0Var.k * fArr[c4])) * fwr0Var.v) < 0.01d) {
                                    fArr[0] = 0.01f;
                                    fArr[c3] = 0.01f;
                                }
                                if (fwr0Var.k != 0.0f) {
                                    f5 = rawX / fArr[0];
                                } else {
                                    f5 = rawY / fArr[c3];
                                }
                                fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                if (fwr0Var.c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (fwr0Var.c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = motionLayout.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != 0.0f || progress3 == 1.0f) {
                                        if (progress3 == 0.0f) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        motionLayout.v(z2);
                                    }
                                    motionLayout.setProgress(fMax);
                                    velocityTracker6 = (VelocityTracker) h03Var3.b;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(1000);
                                    }
                                    velocityTracker7 = (VelocityTracker) h03Var3.b;
                                    if (velocityTracker7 != null) {
                                        xVelocity2 = velocityTracker7.getXVelocity();
                                    } else {
                                        xVelocity2 = 0.0f;
                                    }
                                    velocityTracker8 = (VelocityTracker) h03Var3.b;
                                    if (velocityTracker8 != null) {
                                        yVelocity2 = velocityTracker8.getYVelocity();
                                    } else {
                                        yVelocity2 = 0.0f;
                                    }
                                    if (fwr0Var.k != 0.0f) {
                                        f6 = xVelocity2 / fArr[0];
                                    } else {
                                        f6 = yVelocity2 / fArr[1];
                                    }
                                    motionLayout.t = f6;
                                } else {
                                    motionLayout.t = 0.0f;
                                }
                                fwr0Var.p = motionEvent.getRawX();
                                fwr0Var.q = motionEvent.getRawY();
                            }
                        }
                    }
                }
            }
            wt40Var2.r = motionEvent.getRawX();
            wt40Var2.s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (h03Var = wt40Var2.o) != null) {
                velocityTracker = (VelocityTracker) h03Var.b;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    h03Var2 = null;
                    h03Var.b = null;
                } else {
                    h03Var2 = null;
                }
                wt40Var2.o = h03Var2;
                i = this.v;
                if (i != -1) {
                    wt40Var2.a(i, this);
                }
            }
        }
        vt40 vt40Var6 = this.q.c;
        if ((vt40Var6.r & 4) != 0) {
            return vt40Var6.l.m;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void q(int i) {
        this.k = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        wt40 wt40Var;
        vt40 vt40Var;
        if (!this.D1 && this.v == -1 && (wt40Var = this.q) != null && (vt40Var = wt40Var.c) != null) {
            int i = vt40Var.q;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ((ds40) this.A.get(getChildAt(i2))).d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        this.m1 = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.Q1 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.z = z;
    }

    public void setInterpolatedProgress(float f) throws Throwable {
        if (this.q != null) {
            setState(zs40.c);
            Interpolator interpolatorD = this.q.d();
            if (interpolatorD != null) {
                setProgress(interpolatorD.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
    }

    public void setOnShow(float f) {
    }

    public void setProgress(float f) {
        if (f < 0.0f || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            xs40 xs40Var = this.N1;
            if (xs40Var == null) {
                xs40Var = new xs40(this);
                this.N1 = xs40Var;
            }
            xs40Var.f41398a = f;
            return;
        }
        zs40 zs40Var = zs40.d;
        zs40 zs40Var2 = zs40.c;
        if (f <= 0.0f) {
            if (this.h1 == 1.0f && this.v == this.w) {
                setState(zs40Var2);
            }
            this.v = this.u;
            if (this.h1 == 0.0f) {
                setState(zs40Var);
            }
        } else if (f >= 1.0f) {
            if (this.h1 == 0.0f && this.v == this.u) {
                setState(zs40Var2);
            }
            this.v = this.w;
            if (this.h1 == 1.0f) {
                setState(zs40Var);
            }
        } else {
            this.v = -1;
            setState(zs40Var2);
        }
        if (this.q == null) {
            return;
        }
        this.k1 = true;
        this.j1 = f;
        this.g1 = f;
        this.i1 = -1L;
        this.B = -1L;
        this.r = null;
        this.l1 = true;
        invalidate();
    }

    public void setScene(wt40 wt40Var) {
        fwr0 fwr0Var;
        this.q = wt40Var;
        boolean zP = p();
        wt40Var.p = zP;
        vt40 vt40Var = wt40Var.c;
        if (vt40Var != null && (fwr0Var = vt40Var.l) != null) {
            fwr0Var.c(zP);
        }
        B();
    }

    public void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.v = i;
            return;
        }
        xs40 xs40Var = this.N1;
        if (xs40Var == null) {
            xs40Var = new xs40(this);
            this.N1 = xs40Var;
        }
        xs40Var.c = i;
        xs40Var.d = i;
    }

    public void setState(zs40 zs40Var) throws Throwable {
        qaq0 qaq0Var;
        qaq0 qaq0Var2;
        zs40 zs40Var2 = zs40.d;
        if (zs40Var == zs40Var2 && this.v == -1) {
            return;
        }
        zs40 zs40Var3 = this.R1;
        this.R1 = zs40Var;
        int iOrdinal = zs40Var3.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (zs40Var != zs40Var2 || (qaq0Var = this.O1) == null) {
                return;
            }
            qaq0Var.run();
            this.O1 = null;
            return;
        }
        if (iOrdinal == 2 && zs40Var == zs40Var2 && (qaq0Var2 = this.O1) != null) {
            qaq0Var2.run();
            this.O1 = null;
        }
    }

    public void setTransition(int i) {
        vt40 vt40Var;
        float f;
        wt40 wt40Var = this.q;
        if (wt40Var != null) {
            Iterator it = wt40Var.d.iterator();
            do {
                if (!it.hasNext()) {
                    vt40Var = null;
                    break;
                }
                vt40Var = (vt40) it.next();
            } while (vt40Var.f37985a != i);
            this.u = vt40Var.d;
            this.w = vt40Var.c;
            if (!isAttachedToWindow()) {
                xs40 xs40Var = this.N1;
                if (xs40Var == null) {
                    xs40Var = new xs40(this);
                    this.N1 = xs40Var;
                }
                xs40Var.c = this.u;
                xs40Var.d = this.w;
                return;
            }
            int i2 = this.v;
            if (i2 == this.u) {
                f = 0.0f;
            } else {
                f = i2 == this.w ? 1.0f : Float.NaN;
            }
            wt40 wt40Var2 = this.q;
            wt40Var2.c = vt40Var;
            fwr0 fwr0Var = vt40Var.l;
            if (fwr0Var != null) {
                fwr0Var.c(wt40Var2.p);
            }
            this.S1.e(this.q.b(this.u), this.q.b(this.w));
            B();
            if (this.h1 != f) {
                if (f == 0.0f) {
                    v(true);
                    this.q.b(this.u).b(this);
                } else if (f == 1.0f) {
                    v(false);
                    this.q.b(this.w).b(this);
                }
            }
            this.h1 = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
            } else {
                Log.v("MotionLayout", ozb.S().concat(" transitionToStart "));
                u(0.0f);
            }
        }
    }

    public void setTransitionDuration(int i) {
        wt40 wt40Var = this.q;
        if (wt40Var == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        vt40 vt40Var = wt40Var.c;
        if (vt40Var != null) {
            vt40Var.h = Math.max(i, 8);
        } else {
            wt40Var.j = i;
        }
    }

    public void setTransitionState(Bundle bundle) {
        xs40 xs40Var = this.N1;
        if (xs40Var == null) {
            xs40Var = new xs40(this);
            this.N1 = xs40Var;
        }
        xs40Var.getClass();
        xs40Var.f41398a = bundle.getFloat("motion.progress");
        xs40Var.b = bundle.getFloat("motion.velocity");
        xs40Var.c = bundle.getInt("motion.StartState");
        xs40Var.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.N1.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return ozb.T(this.u, context) + "->" + ozb.T(this.w, context) + " (pos:" + this.h1 + " Dpos/Dt:" + this.t;
    }

    public final void u(float f) {
        wt40 wt40Var = this.q;
        if (wt40Var == null) {
            return;
        }
        float f2 = this.h1;
        float f3 = this.g1;
        if (f2 != f3 && this.k1) {
            this.h1 = f3;
            f2 = f3;
        }
        if (f2 == f) {
            return;
        }
        this.o1 = false;
        this.j1 = f;
        vt40 vt40Var = wt40Var.c;
        this.f1 = (vt40Var != null ? vt40Var.h : wt40Var.j) / 1000.0f;
        setProgress(f);
        this.r = null;
        this.s = this.q.d();
        this.k1 = false;
        this.B = getNanoTime();
        this.l1 = true;
        this.g1 = f2;
        this.h1 = f2;
        invalidate();
    }

    public final void v(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ds40 ds40Var = (ds40) this.A.get(getChildAt(i));
            if (ds40Var != null && "button".equals(ozb.U(ds40Var.b)) && ds40Var.A != null) {
                int i2 = 0;
                while (true) {
                    gly[] glyVarArr = ds40Var.A;
                    if (i2 < glyVarArr.length) {
                        glyVarArr[i2].g(ds40Var.b, z ? -100.0f : 100.0f);
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0156  */
    /* JADX WARN: Code duplicated, block: B:105:0x016d  */
    /* JADX WARN: Code duplicated, block: B:107:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x018e  */
    /* JADX WARN: Code duplicated, block: B:128:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:154:0x0218  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[PHI: r14
  0x0069: PHI (r14v7 float) = (r14v2 float), (r14v9 float) binds: [B:35:0x0073, B:29:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2 A[PHI: r3
  0x00e2: PHI (r3v13 float) = (r3v12 float), (r3v14 float), (r3v14 float) binds: [B:52:0x00b0, B:63:0x00d6, B:65:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x010d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0118  */
    /* JADX WARN: Code duplicated, block: B:84:0x011f A[PHI: r8
  0x011f: PHI (r8v11 float) = (r8v8 float), (r8v12 float) binds: [B:88:0x0129, B:82:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    /* JADX WARN: Code duplicated, block: B:87:0x0125  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136  */
    /* JADX WARN: Code duplicated, block: B:98:0x014b  */
    /* JADX WARN: Code duplicated, block: B:99:0x014d  */
    public final void w(boolean z) throws Throwable {
        boolean z2;
        float f;
        char c;
        zs40 zs40Var;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i;
        float f2;
        int i2;
        int i3;
        int i4;
        View childAt;
        ds40 ds40Var;
        float f3;
        boolean z3;
        if (this.i1 == -1) {
            this.i1 = getNanoTime();
        }
        float f4 = this.h1;
        float f5 = 0.0f;
        if (f4 > 0.0f && f4 < 1.0f) {
            this.v = -1;
        }
        boolean z4 = false;
        if (this.z1 || (this.l1 && (z || this.j1 != f4))) {
            float fSignum = Math.signum(this.j1 - f4);
            long nanoTime2 = getNanoTime();
            ps40 ps40Var = this.r;
            float f6 = ps40Var == null ? (((nanoTime2 - this.i1) * fSignum) * 1.0E-9f) / this.f1 : 0.0f;
            float f7 = this.h1 + f6;
            if (this.k1) {
                f7 = this.j1;
            }
            if (fSignum > 0.0f) {
                f = this.j1;
                if (f7 < f) {
                    if (fSignum <= 0.0f) {
                        f = this.j1;
                        if (f7 <= f) {
                            f7 = f;
                            this.l1 = false;
                            z2 = true;
                        }
                    }
                    z2 = false;
                } else {
                    f7 = f;
                    this.l1 = false;
                    z2 = true;
                }
            } else {
                if (fSignum <= 0.0f) {
                    f = this.j1;
                    if (f7 <= f) {
                        f7 = f;
                        this.l1 = false;
                        z2 = true;
                    }
                }
                z2 = false;
            }
            this.h1 = f7;
            this.g1 = f7;
            this.i1 = nanoTime2;
            if (ps40Var == null || z2) {
                this.t = f6;
            } else {
                if (this.o1) {
                    float interpolation2 = ps40Var.getInterpolation((nanoTime2 - this.B) * 1.0E-9f);
                    ps40 ps40Var2 = this.r;
                    tqm0 tqm0Var = this.p1;
                    if (ps40Var2 == tqm0Var) {
                        c = tqm0Var.c.b() ? (char) 2 : (char) 1;
                    } else {
                        c = 0;
                    }
                    this.h1 = interpolation2;
                    this.i1 = nanoTime2;
                    ps40 ps40Var3 = this.r;
                    if (ps40Var3 != null) {
                        float fA = ps40Var3.a();
                        this.t = fA;
                        if (Math.abs(fA) * this.f1 <= 1.0E-5f && c == 2) {
                            this.l1 = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.h1 = 1.0f;
                            this.l1 = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f7 = interpolation2;
                        } else {
                            this.h1 = 0.0f;
                            this.l1 = false;
                            f7 = 0.0f;
                        }
                    } else {
                        f7 = interpolation2;
                    }
                } else {
                    float interpolation3 = ps40Var.getInterpolation(f7);
                    ps40 ps40Var4 = this.r;
                    if (ps40Var4 != null) {
                        this.t = ps40Var4.a();
                    } else {
                        this.t = ((ps40Var4.getInterpolation(f7 + f6) - interpolation3) * fSignum) / f6;
                    }
                    f7 = interpolation3;
                }
                if (Math.abs(this.t) > 1.0E-5f) {
                    setState(zs40.c);
                }
                zs40Var = zs40.d;
                if (c != 1) {
                    if (fSignum > 0.0f) {
                        f3 = this.j1;
                        if (f7 < f3) {
                            f7 = f3;
                            this.l1 = false;
                        } else if (fSignum <= 0.0f) {
                            f3 = this.j1;
                            if (f7 <= f3) {
                                f7 = f3;
                                this.l1 = false;
                            }
                        }
                    } else if (fSignum <= 0.0f) {
                        f3 = this.j1;
                        if (f7 <= f3) {
                            f7 = f3;
                            this.l1 = false;
                        }
                    }
                    if (f7 < 1.0f || f7 <= 0.0f) {
                        this.l1 = false;
                        setState(zs40Var);
                    }
                }
                childCount = getChildCount();
                this.z1 = false;
                nanoTime = getNanoTime();
                this.K1 = f7;
                interpolator = this.s;
                if (interpolator == null) {
                    interpolation = f7;
                } else {
                    interpolation = interpolator.getInterpolation(f7);
                }
                interpolator2 = this.s;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f1) + f7);
                    this.t = interpolation4;
                    this.t = interpolation4 - this.s.getInterpolation(f7);
                }
                i = 0;
                while (i < childCount) {
                    childAt = getChildAt(i);
                    ds40Var = (ds40) this.A.get(childAt);
                    if (ds40Var != null) {
                        this.z1 = ds40Var.d(interpolation, nanoTime, this.L1, childAt) | this.z1;
                    }
                    i++;
                    f5 = f5;
                }
                f2 = f5;
                boolean z5 = (fSignum <= 0.0f && f7 >= this.j1) || (fSignum <= f2 && f7 <= this.j1);
                if (!this.z1 && !this.l1 && z5) {
                    setState(zs40Var);
                }
                if (this.D1) {
                    requestLayout();
                }
                this.z1 = (!z5) | this.z1;
                if (f7 <= f2 && (i4 = this.u) != -1 && this.v != i4) {
                    this.v = i4;
                    this.q.b(i4).a(this);
                    setState(zs40Var);
                    z4 = true;
                }
                if (f7 >= 1.0d) {
                    i2 = this.v;
                    i3 = this.w;
                    if (i2 != i3) {
                        this.v = i3;
                        this.q.b(i3).a(this);
                        setState(zs40Var);
                        z4 = true;
                    }
                }
                if (!this.z1 || this.l1) {
                    invalidate();
                } else if ((fSignum > 0.0f && f7 == 1.0f) || (fSignum < f2 && f7 == f2)) {
                    setState(zs40Var);
                }
                if (!this.z1 && !this.l1 && ((fSignum > 0.0f && f7 == 1.0f) || (fSignum < f2 && f7 == f2))) {
                    A();
                }
            }
            c = 0;
            if (Math.abs(this.t) > 1.0E-5f) {
                setState(zs40.c);
            }
            zs40Var = zs40.d;
            if (c != 1) {
                if (fSignum > 0.0f) {
                    f3 = this.j1;
                    if (f7 < f3) {
                        f7 = f3;
                        this.l1 = false;
                    } else if (fSignum <= 0.0f) {
                        f3 = this.j1;
                        if (f7 <= f3) {
                            f7 = f3;
                            this.l1 = false;
                        }
                    }
                } else if (fSignum <= 0.0f) {
                    f3 = this.j1;
                    if (f7 <= f3) {
                        f7 = f3;
                        this.l1 = false;
                    }
                }
                if (f7 < 1.0f) {
                    this.l1 = false;
                    setState(zs40Var);
                } else {
                    this.l1 = false;
                    setState(zs40Var);
                }
            }
            childCount = getChildCount();
            this.z1 = false;
            nanoTime = getNanoTime();
            this.K1 = f7;
            interpolator = this.s;
            if (interpolator == null) {
                interpolation = f7;
            } else {
                interpolation = interpolator.getInterpolation(f7);
            }
            interpolator2 = this.s;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f1) + f7);
                this.t = interpolation5;
                this.t = interpolation5 - this.s.getInterpolation(f7);
            }
            i = 0;
            while (i < childCount) {
                childAt = getChildAt(i);
                ds40Var = (ds40) this.A.get(childAt);
                if (ds40Var != null) {
                    this.z1 = ds40Var.d(interpolation, nanoTime, this.L1, childAt) | this.z1;
                }
                i++;
                f5 = f5;
            }
            f2 = f5;
            if (fSignum <= 0.0f) {
            }
            if (!this.z1) {
                setState(zs40Var);
            }
            if (this.D1) {
                requestLayout();
            }
            this.z1 = (!z5) | this.z1;
            if (f7 <= f2) {
                this.v = i4;
                this.q.b(i4).a(this);
                setState(zs40Var);
                z4 = true;
            }
            if (f7 >= 1.0d) {
                i2 = this.v;
                i3 = this.w;
                if (i2 != i3) {
                    this.v = i3;
                    this.q.b(i3).a(this);
                    setState(zs40Var);
                    z4 = true;
                }
            }
            if (this.z1) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.z1) {
                A();
            }
        } else {
            f2 = 0.0f;
        }
        float f8 = this.h1;
        if (f8 < 1.0f) {
            if (f8 <= f2) {
                int i5 = this.v;
                int i6 = this.u;
                z3 = i5 == i6 ? z4 : true;
                this.v = i6;
            }
            this.U1 |= z4;
            if (z4 && !this.M1) {
                requestLayout();
            }
            this.g1 = this.h1;
        }
        int i7 = this.v;
        int i8 = this.w;
        z3 = i7 == i8 ? z4 : true;
        this.v = i8;
        z4 = z3;
        this.U1 |= z4;
        if (z4) {
            requestLayout();
        }
        this.g1 = this.h1;
    }

    public final void x(int i, float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        HashMap map = this.A;
        View viewM = m(i);
        ds40 ds40Var = (ds40) map.get(viewM);
        if (ds40Var == null) {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewM == null ? twn.m(i, "") : viewM.getContext().getResources().getResourceName(i)));
            return;
        }
        float[] fArr2 = ds40Var.v;
        float fA = ds40Var.a(f, fArr2);
        kpb[] kpbVarArr = ds40Var.j;
        int i2 = 0;
        if (kpbVarArr != null) {
            double d = fA;
            kpbVarArr[0].W(d, ds40Var.q);
            ds40Var.j[0].P(d, ds40Var.p);
            float f4 = fArr2[0];
            while (true) {
                dArr = ds40Var.q;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * ((double) f4);
                i2++;
            }
            aw3 aw3Var = ds40Var.k;
            if (aw3Var != null) {
                double[] dArr2 = ds40Var.p;
                if (dArr2.length > 0) {
                    aw3Var.P(d, dArr2);
                    ds40Var.k.W(d, ds40Var.q);
                    pt40.e(f2, f3, fArr, ds40Var.o, ds40Var.q, ds40Var.p);
                }
            } else {
                pt40.e(f2, f3, fArr, ds40Var.o, dArr, ds40Var.p);
            }
        } else {
            pt40 pt40Var = ds40Var.g;
            float f5 = pt40Var.e;
            pt40 pt40Var2 = ds40Var.f;
            float f6 = f5 - pt40Var2.e;
            float f7 = pt40Var.f - pt40Var2.f;
            float f8 = pt40Var.g - pt40Var2.g;
            float f9 = (pt40Var.h - pt40Var2.h) + f7;
            fArr[0] = ((f8 + f6) * f2) + ((1.0f - f2) * f6);
            fArr[1] = (f9 * f3) + ((1.0f - f3) * f7);
        }
        viewM.getY();
    }

    public final boolean y(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        RectF rectF = this.V1;
        if (!(view instanceof ViewGroup)) {
            z = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (y((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), childAt, motionEvent)) {
                z = true;
                break;
            }
            childCount--;
        }
        if (!z) {
            rectF.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f3, f4);
                    Matrix matrix2 = this.X1;
                    if (matrix2 == null) {
                        matrix2 = new Matrix();
                        this.X1 = matrix2;
                    }
                    matrix.invert(matrix2);
                    motionEventObtain.transform(this.X1);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    public final void z(AttributeSet attributeSet) {
        wt40 wt40Var;
        Y1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, fqd0.m);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.q = new wt40(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.v = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.j1 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.l1 = true;
                } else if (index == 0) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.m1 == 0) {
                        this.m1 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.m1 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.q == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.q = null;
            }
        }
        if (this.m1 != 0) {
            wt40 wt40Var2 = this.q;
            if (wt40Var2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iG = wt40Var2.g();
                wt40 wt40Var3 = this.q;
                r3e r3eVarB = wt40Var3.b(wt40Var3.g());
                String strT = ozb.T(iG, getContext());
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder sbT = kng0.t("CHECK: ", strT, " ALL VIEWS SHOULD HAVE ID's ");
                        sbT.append(childAt.getClass().getName());
                        sbT.append(" does not!");
                        Log.w("MotionLayout", sbT.toString());
                    }
                    if (r3eVarB.i(id) == null) {
                        StringBuilder sbT2 = kng0.t("CHECK: ", strT, " NO CONSTRAINTS for ");
                        sbT2.append(ozb.U(childAt));
                        Log.w("MotionLayout", sbT2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) r3eVarB.g.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = numArr[i3].intValue();
                }
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr[i4];
                    String strT2 = ozb.T(i5, getContext());
                    if (findViewById(iArr[i4]) == null) {
                        Log.w("MotionLayout", "CHECK: " + strT + " NO View matches id " + strT2);
                    }
                    if (r3eVarB.h(i5).e.d == -1) {
                        Log.w("MotionLayout", b1j.k("CHECK: ", strT, Separators.LPAREN, strT2, ") no LAYOUT_HEIGHT"));
                    }
                    if (r3eVarB.h(i5).e.c == -1) {
                        Log.w("MotionLayout", b1j.k("CHECK: ", strT, Separators.LPAREN, strT2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (vt40 vt40Var : this.q.d) {
                    if (vt40Var == this.q.c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (vt40Var.d == vt40Var.c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i6 = vt40Var.d;
                    int i7 = vt40Var.c;
                    String strT3 = ozb.T(i6, getContext());
                    String strT4 = ozb.T(i7, getContext());
                    if (sparseIntArray.get(i6) == i7) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strT3 + "->" + strT4);
                    }
                    if (sparseIntArray2.get(i7) == i6) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strT3 + "->" + strT4);
                    }
                    sparseIntArray.put(i6, i7);
                    sparseIntArray2.put(i7, i6);
                    if (this.q.b(i6) == null) {
                        f140.r(" no such constraintSetStart ", strT3, "MotionLayout");
                    }
                    if (this.q.b(i7) == null) {
                        f140.r(" no such constraintSetEnd ", strT3, "MotionLayout");
                    }
                }
            }
        }
        if (this.v != -1 || (wt40Var = this.q) == null) {
            return;
        }
        this.v = wt40Var.g();
        this.u = this.q.g();
        vt40 vt40Var2 = this.q.c;
        this.w = vt40Var2 != null ? vt40Var2.c : -1;
    }

    public void setTransitionListener(ys40 ys40Var) {
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = null;
        this.t = 0.0f;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = new HashMap();
        this.B = 0L;
        this.f1 = 1.0f;
        this.g1 = 0.0f;
        this.h1 = 0.0f;
        this.j1 = 0.0f;
        this.l1 = false;
        this.m1 = 0;
        this.o1 = false;
        this.p1 = new tqm0();
        this.q1 = new vs40(this);
        this.u1 = false;
        this.z1 = false;
        this.A1 = 0;
        this.B1 = -1L;
        this.C1 = 0.0f;
        this.D1 = false;
        this.L1 = new vjy((byte) 0);
        this.M1 = false;
        this.O1 = null;
        new HashMap();
        this.P1 = new Rect();
        this.Q1 = false;
        this.R1 = zs40.f44890a;
        this.S1 = new ws40(this);
        this.U1 = false;
        this.V1 = new RectF();
        this.W1 = null;
        this.X1 = null;
        new ArrayList();
        z(attributeSet);
    }

    public void setTransition(vt40 vt40Var) throws Throwable {
        fwr0 fwr0Var;
        ws40 ws40Var = this.S1;
        wt40 wt40Var = this.q;
        wt40Var.c = vt40Var;
        if (vt40Var != null && (fwr0Var = vt40Var.l) != null) {
            fwr0Var.c(wt40Var.p);
        }
        setState(zs40.b);
        int i = this.v;
        vt40 vt40Var2 = this.q.c;
        if (i == (vt40Var2 == null ? -1 : vt40Var2.c)) {
            this.h1 = 1.0f;
            this.g1 = 1.0f;
            this.j1 = 1.0f;
        } else {
            this.h1 = 0.0f;
            this.g1 = 0.0f;
            this.j1 = 0.0f;
        }
        this.i1 = (vt40Var.r & 1) != 0 ? -1L : getNanoTime();
        int iG = this.q.g();
        wt40 wt40Var2 = this.q;
        vt40 vt40Var3 = wt40Var2.c;
        int i2 = vt40Var3 != null ? vt40Var3.c : -1;
        if (iG == this.u && i2 == this.w) {
            return;
        }
        this.u = iG;
        this.w = i2;
        wt40Var2.m(iG, i2);
        ws40Var.e(this.q.b(this.u), this.q.b(this.w));
        int i3 = this.u;
        int i4 = this.w;
        ws40Var.e = i3;
        ws40Var.f = i4;
        ws40Var.f();
        B();
    }
}
