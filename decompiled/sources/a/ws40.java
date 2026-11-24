package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ws40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l4e f39674a = new l4e();
    public l4e b = new l4e();
    public r3e c = null;
    public r3e d = null;
    public int e;
    public int f;
    public final /* synthetic */ MotionLayout g;

    public ws40(MotionLayout motionLayout) {
        this.g = motionLayout;
    }

    public static void c(l4e l4eVar, l4e l4eVar2) {
        k4e jvvVar;
        ArrayList<k4e> arrayList = l4eVar.u0;
        HashMap map = new HashMap();
        map.put(l4eVar, l4eVar2);
        l4eVar2.u0.clear();
        l4eVar2.h(l4eVar, map);
        for (k4e k4eVar : arrayList) {
            if (k4eVar instanceof zu5) {
                jvvVar = new zu5();
            } else if (k4eVar instanceof qiv) {
                jvvVar = new qiv();
            } else if (k4eVar instanceof hmq) {
                jvvVar = new hmq();
            } else if (k4eVar instanceof su90) {
                jvvVar = new su90();
            } else {
                jvvVar = k4eVar instanceof jvv ? new jvv() : new k4e();
            }
            l4eVar2.W(jvvVar);
            map.put(k4eVar, jvvVar);
        }
        for (k4e k4eVar2 : arrayList) {
            ((k4e) map.get(k4eVar2)).h(k4eVar2, map);
        }
    }

    public static k4e d(l4e l4eVar, View view) {
        if (l4eVar.h0 == view) {
            return l4eVar;
        }
        ArrayList arrayList = l4eVar.u0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k4e k4eVar = (k4e) arrayList.get(i);
            if (k4eVar.h0 == view) {
                return k4eVar;
            }
        }
        return null;
    }

    public final void a() {
        int i;
        HashMap map;
        SparseArray sparseArray;
        int[] iArr;
        int i2;
        Rect rect;
        Rect rect2;
        Interpolator interpolatorLoadInterpolator;
        MotionLayout motionLayout = this.g;
        int childCount = motionLayout.getChildCount();
        HashMap map2 = motionLayout.A;
        map2.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = motionLayout.getChildAt(i3);
            ds40 ds40Var = new ds40(childAt);
            int id = childAt.getId();
            iArr2[i3] = id;
            sparseArray2.put(id, ds40Var);
            map2.put(childAt, ds40Var);
        }
        int i4 = 0;
        while (i4 < childCount) {
            View childAt2 = motionLayout.getChildAt(i4);
            ds40 ds40Var2 = (ds40) map2.get(childAt2);
            if (ds40Var2 == null) {
                i = childCount;
                map = map2;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i2 = i4;
            } else {
                Rect rect3 = ds40Var2.f6594a;
                pt40 pt40Var = ds40Var2.f;
                if (this.c != null) {
                    k4e k4eVarD = d(this.f39674a, childAt2);
                    if (k4eVarD != null) {
                        Rect rectE = motionLayout.E(k4eVarD);
                        map = map2;
                        r3e r3eVar = this.c;
                        iArr = iArr2;
                        int width = motionLayout.getWidth();
                        i2 = i4;
                        int height = motionLayout.getHeight();
                        sparseArray = sparseArray2;
                        int i5 = r3eVar.d;
                        if (i5 != 0) {
                            ds40.f(rectE, rect3, i5, width, height);
                        }
                        pt40Var.c = 0.0f;
                        pt40Var.d = 0.0f;
                        ds40Var2.e(pt40Var);
                        i = childCount;
                        rect = rect3;
                        pt40Var.d(rectE.left, rectE.top, rectE.width(), rectE.height());
                        m3e m3eVarH = r3eVar.h(ds40Var2.c);
                        pt40Var.a(m3eVarH);
                        o3e o3eVar = m3eVarH.d;
                        ds40Var2.l = o3eVar.g;
                        ds40Var2.h.c(rectE, r3eVar, i5, ds40Var2.c);
                        ds40Var2.C = m3eVarH.f.i;
                        ds40Var2.E = o3eVar.j;
                        ds40Var2.F = o3eVar.i;
                        Context context = ds40Var2.b.getContext();
                        int i6 = o3eVar.l;
                        String str = o3eVar.k;
                        int i7 = o3eVar.m;
                        if (i6 == -2) {
                            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i7);
                        } else if (i6 == -1) {
                            interpolatorLoadInterpolator = new cs40(fhn.f(str), (byte) 0);
                        } else if (i6 == 0) {
                            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                        } else if (i6 == 1) {
                            interpolatorLoadInterpolator = new AccelerateInterpolator();
                        } else if (i6 == 2) {
                            interpolatorLoadInterpolator = new DecelerateInterpolator();
                        } else if (i6 != 4) {
                            interpolatorLoadInterpolator = i6 != 5 ? null : new OvershootInterpolator();
                        } else {
                            interpolatorLoadInterpolator = new BounceInterpolator();
                        }
                        ds40Var2.G = interpolatorLoadInterpolator;
                    } else {
                        i = childCount;
                        map = map2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                        rect = rect3;
                        if (motionLayout.m1 != 0) {
                            Log.e("MotionLayout", ozb.S() + "no widget for  " + ozb.U(childAt2) + " (" + childAt2.getClass().getName() + Separators.RPAREN);
                        }
                    }
                } else {
                    i = childCount;
                    map = map2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i2 = i4;
                    rect = rect3;
                }
                if (this.d != null) {
                    k4e k4eVarD2 = d(this.b, childAt2);
                    if (k4eVarD2 != null) {
                        Rect rectE2 = motionLayout.E(k4eVarD2);
                        r3e r3eVar2 = this.d;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        pt40 pt40Var2 = ds40Var2.g;
                        int i8 = r3eVar2.d;
                        if (i8 != 0) {
                            Rect rect4 = rect;
                            ds40.f(rectE2, rect4, i8, width2, height2);
                            rect2 = rect4;
                        } else {
                            rect2 = rectE2;
                        }
                        pt40Var2.c = 1.0f;
                        pt40Var2.d = 1.0f;
                        ds40Var2.e(pt40Var2);
                        pt40Var2.d(rect2.left, rect2.top, rect2.width(), rect2.height());
                        pt40Var2.a(r3eVar2.h(ds40Var2.c));
                        ds40Var2.i.c(rect2, r3eVar2, i8, ds40Var2.c);
                    } else if (motionLayout.m1 != 0) {
                        Log.e("MotionLayout", ozb.S() + "no widget for  " + ozb.U(childAt2) + " (" + childAt2.getClass().getName() + Separators.RPAREN);
                    }
                }
            }
            i4 = i2 + 1;
            map2 = map;
            iArr2 = iArr;
            sparseArray2 = sparseArray;
            childCount = i;
        }
        SparseArray sparseArray3 = sparseArray2;
        int[] iArr3 = iArr2;
        int i9 = childCount;
        int i10 = 0;
        while (i10 < i9) {
            SparseArray sparseArray4 = sparseArray3;
            ds40 ds40Var3 = (ds40) sparseArray4.get(iArr3[i10]);
            int i11 = ds40Var3.f.k;
            if (i11 != -1) {
                ds40 ds40Var4 = (ds40) sparseArray4.get(i11);
                ds40Var3.f.f(ds40Var4, ds40Var4.f);
                ds40Var3.g.f(ds40Var4, ds40Var4.g);
            }
            i10++;
            sparseArray3 = sparseArray4;
        }
    }

    public final void b(int i, int i2) {
        MotionLayout motionLayout = this.g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.v == motionLayout.getStartState()) {
            l4e l4eVar = this.b;
            r3e r3eVar = this.d;
            motionLayout.s(l4eVar, optimizationLevel, (r3eVar == null || r3eVar.d == 0) ? i : i2, (r3eVar == null || r3eVar.d == 0) ? i2 : i);
            r3e r3eVar2 = this.c;
            if (r3eVar2 != null) {
                l4e l4eVar2 = this.f39674a;
                int i3 = r3eVar2.d;
                int i4 = i3 == 0 ? i : i2;
                if (i3 == 0) {
                    i = i2;
                }
                motionLayout.s(l4eVar2, optimizationLevel, i4, i);
                return;
            }
            return;
        }
        r3e r3eVar3 = this.c;
        if (r3eVar3 != null) {
            l4e l4eVar3 = this.f39674a;
            int i5 = r3eVar3.d;
            motionLayout.s(l4eVar3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
        }
        l4e l4eVar4 = this.b;
        r3e r3eVar4 = this.d;
        int i6 = (r3eVar4 == null || r3eVar4.d == 0) ? i : i2;
        if (r3eVar4 == null || r3eVar4.d == 0) {
            i = i2;
        }
        motionLayout.s(l4eVar4, optimizationLevel, i6, i);
    }

    public final void e(r3e r3eVar, r3e r3eVar2) {
        this.c = r3eVar;
        this.d = r3eVar2;
        this.f39674a = new l4e();
        l4e l4eVar = new l4e();
        this.b = l4eVar;
        l4e l4eVar2 = this.f39674a;
        boolean z = MotionLayout.Y1;
        MotionLayout motionLayout = this.g;
        l4e l4eVar3 = motionLayout.c;
        r96 r96Var = l4eVar3.y0;
        l4eVar2.y0 = r96Var;
        l4eVar2.w0.h = r96Var;
        r96 r96Var2 = l4eVar3.y0;
        l4eVar.y0 = r96Var2;
        l4eVar.w0.h = r96Var2;
        l4eVar2.u0.clear();
        this.b.u0.clear();
        c(l4eVar3, this.f39674a);
        c(l4eVar3, this.b);
        if (motionLayout.h1 > 0.5d) {
            if (r3eVar != null) {
                g(this.f39674a, r3eVar);
            }
            g(this.b, r3eVar2);
        } else {
            g(this.b, r3eVar2);
            if (r3eVar != null) {
                g(this.f39674a, r3eVar);
            }
        }
        this.f39674a.z0 = motionLayout.p();
        l4e l4eVar4 = this.f39674a;
        l4eVar4.v0.z(l4eVar4);
        this.b.z0 = motionLayout.p();
        l4e l4eVar5 = this.b;
        l4eVar5.v0.z(l4eVar5);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.width;
            j4e j4eVar = j4e.b;
            if (i == -2) {
                this.f39674a.P(j4eVar);
                this.b.P(j4eVar);
            }
            if (layoutParams.height == -2) {
                this.f39674a.R(j4eVar);
                this.b.R(j4eVar);
            }
        }
    }

    public final void f() {
        MotionLayout motionLayout = this.g;
        int i = motionLayout.x;
        int i2 = motionLayout.y;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        motionLayout.I1 = mode;
        motionLayout.J1 = mode2;
        b(i, i2);
        int i3 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i, i2);
            motionLayout.E1 = this.f39674a.s();
            motionLayout.F1 = this.f39674a.m();
            motionLayout.G1 = this.b.s();
            int iM = this.b.m();
            motionLayout.H1 = iM;
            motionLayout.D1 = (motionLayout.E1 == motionLayout.G1 && motionLayout.F1 == iM) ? false : true;
        }
        int i4 = motionLayout.E1;
        int i5 = motionLayout.F1;
        int i6 = motionLayout.I1;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((motionLayout.K1 * (motionLayout.G1 - i4)) + i4);
        }
        int i7 = motionLayout.J1;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) ((motionLayout.K1 * (motionLayout.H1 - i5)) + i5);
        }
        l4e l4eVar = this.f39674a;
        motionLayout.r(i, i2, i4, i5, l4eVar.I0 || this.b.I0, l4eVar.J0 || this.b.J0);
        HashMap map = motionLayout.A;
        int childCount = motionLayout.getChildCount();
        motionLayout.S1.a();
        motionLayout.l1 = true;
        SparseArray sparseArray = new SparseArray();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = motionLayout.getChildAt(i8);
            sparseArray.put(childAt.getId(), (ds40) map.get(childAt));
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        vt40 vt40Var = motionLayout.q.c;
        int i9 = vt40Var != null ? vt40Var.p : -1;
        if (i9 != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                ds40 ds40Var = (ds40) map.get(motionLayout.getChildAt(i10));
                if (ds40Var != null) {
                    ds40Var.B = i9;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[map.size()];
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            ds40 ds40Var2 = (ds40) map.get(motionLayout.getChildAt(i12));
            int i13 = ds40Var2.f.k;
            if (i13 != -1) {
                sparseBooleanArray.put(i13, true);
                iArr[i11] = ds40Var2.f.k;
                i11++;
            }
        }
        for (int i14 = 0; i14 < i11; i14++) {
            ds40 ds40Var3 = (ds40) map.get(motionLayout.findViewById(iArr[i14]));
            if (ds40Var3 != null) {
                motionLayout.q.e(ds40Var3);
                ds40Var3.g(width, height, motionLayout.getNanoTime());
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = motionLayout.getChildAt(i15);
            ds40 ds40Var4 = (ds40) map.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && ds40Var4 != null) {
                motionLayout.q.e(ds40Var4);
                ds40Var4.g(width, height, motionLayout.getNanoTime());
            }
        }
        vt40 vt40Var2 = motionLayout.q.c;
        float f = vt40Var2 != null ? vt40Var2.i : 0.0f;
        if (f != 0.0f) {
            boolean z = ((double) f) < 0.0d;
            float fAbs = Math.abs(f);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                ds40 ds40Var5 = (ds40) map.get(motionLayout.getChildAt(i16));
                if (!Float.isNaN(ds40Var5.l)) {
                    for (int i17 = 0; i17 < childCount; i17++) {
                        ds40 ds40Var6 = (ds40) map.get(motionLayout.getChildAt(i17));
                        if (!Float.isNaN(ds40Var6.l)) {
                            fMin = Math.min(fMin, ds40Var6.l);
                            fMax = Math.max(fMax, ds40Var6.l);
                        }
                    }
                    while (i3 < childCount) {
                        ds40 ds40Var7 = (ds40) map.get(motionLayout.getChildAt(i3));
                        if (!Float.isNaN(ds40Var7.l)) {
                            ds40Var7.n = 1.0f / (1.0f - fAbs);
                            float f2 = ds40Var7.l;
                            if (z) {
                                ds40Var7.m = fAbs - (((fMax - f2) / (fMax - fMin)) * fAbs);
                            } else {
                                ds40Var7.m = fAbs - (((f2 - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                pt40 pt40Var = ds40Var5.g;
                float f3 = pt40Var.e;
                float f4 = pt40Var.f;
                float f5 = z ? f4 - f3 : f4 + f3;
                fMin2 = Math.min(fMin2, f5);
                fMax2 = Math.max(fMax2, f5);
            }
            while (i3 < childCount) {
                ds40 ds40Var8 = (ds40) map.get(motionLayout.getChildAt(i3));
                pt40 pt40Var2 = ds40Var8.g;
                float f6 = pt40Var2.e;
                float f7 = pt40Var2.f;
                float f8 = z ? f7 - f6 : f7 + f6;
                ds40Var8.n = 1.0f / (1.0f - fAbs);
                ds40Var8.m = fAbs - (((f8 - fMin2) * fAbs) / (fMax2 - fMin2));
                i3++;
            }
        }
    }

    public final void g(l4e l4eVar, r3e r3eVar) {
        m3e m3eVar;
        m3e m3eVar2;
        SparseArray sparseArray = new SparseArray();
        n4e n4eVar = new n4e(-2, -2);
        sparseArray.clear();
        sparseArray.put(0, l4eVar);
        MotionLayout motionLayout = this.g;
        sparseArray.put(motionLayout.getId(), l4eVar);
        if (r3eVar != null && r3eVar.d != 0) {
            l4e l4eVar2 = this.b;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z = MotionLayout.Y1;
            motionLayout.s(l4eVar2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        for (k4e k4eVar : l4eVar.u0) {
            k4eVar.j0 = true;
            sparseArray.put(((View) k4eVar.h0).getId(), k4eVar);
        }
        for (k4e k4eVar2 : l4eVar.u0) {
            View view = (View) k4eVar2.h0;
            int id = view.getId();
            HashMap map = r3eVar.g;
            if (map.containsKey(Integer.valueOf(id)) && (m3eVar2 = (m3e) map.get(Integer.valueOf(id))) != null) {
                m3eVar2.a(n4eVar);
            }
            k4eVar2.T(r3eVar.h(view.getId()).e.c);
            k4eVar2.O(r3eVar.h(view.getId()).e.d);
            if (view instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) view;
                int id2 = constraintHelper.getId();
                HashMap map2 = r3eVar.g;
                if (map2.containsKey(Integer.valueOf(id2)) && (m3eVar = (m3e) map2.get(Integer.valueOf(id2))) != null && (k4eVar2 instanceof jvv)) {
                    constraintHelper.j(m3eVar, (jvv) k4eVar2, n4eVar, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).m();
                }
            }
            n4eVar.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z2 = MotionLayout.Y1;
            motionLayout.l(false, view, k4eVar2, n4eVar, sparseArray);
            if (r3eVar.h(view.getId()).c.c == 1) {
                k4eVar2.i0 = view.getVisibility();
            } else {
                k4eVar2.i0 = r3eVar.h(view.getId()).c.b;
            }
        }
        for (k4e k4eVar3 : l4eVar.u0) {
            if (k4eVar3 instanceof zru0) {
                ConstraintHelper constraintHelper2 = (ConstraintHelper) k4eVar3.h0;
                jvv jvvVar = (jvv) k4eVar3;
                constraintHelper2.getClass();
                jvvVar.v0 = 0;
                Arrays.fill(jvvVar.u0, (Object) null);
                for (int i = 0; i < constraintHelper2.b; i++) {
                    jvvVar.W((k4e) sparseArray.get(constraintHelper2.f45350a[i]));
                }
                zru0 zru0Var = (zru0) jvvVar;
                for (int i2 = 0; i2 < zru0Var.v0; i2++) {
                    k4e k4eVar4 = zru0Var.u0[i2];
                    if (k4eVar4 != null) {
                        k4eVar4.G = true;
                    }
                }
            }
        }
    }
}
