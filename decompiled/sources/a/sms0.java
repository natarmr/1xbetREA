package a;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sms0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gms0 f32463a;
    public ViewGroup b;

    /* JADX WARN: Code duplicated, block: B:100:0x0209  */
    /* JADX WARN: Code duplicated, block: B:102:0x0217  */
    /* JADX WARN: Code duplicated, block: B:103:0x0223  */
    /* JADX WARN: Code duplicated, block: B:107:0x0235  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e1 A[EDGE_INSN: B:134:0x01e1->B:90:0x01e1 BREAK  A[LOOP:1: B:19:0x0085->B:89:0x01da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:15:0x0050->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x014f  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f6  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        n660 n660Var;
        n660 n660Var2;
        gx3 gx3Var;
        gx3 gx3Var2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        gx3 gx3VarX;
        int i5;
        Animator animator;
        tls0 tls0Var;
        mns0 mns0Var;
        mns0 mns0Var2;
        int i6;
        boolean z2;
        int i7;
        View view;
        mns0 mns0Var3;
        gx3 gx3Var3;
        int i8;
        int i9;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i10;
        View view4;
        View view5;
        u710 u710Var;
        int iH;
        int i11;
        View view6;
        boolean z3;
        Iterator it;
        gms0 gms0Var = this.f32463a;
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z4 = true;
        if (!tms0.c.remove(viewGroup)) {
            return true;
        }
        gx3 gx3VarB = tms0.b();
        ArrayList arrayList2 = (ArrayList) gx3VarB.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(gms0Var);
            gms0Var.a(new jsb(this, gx3VarB));
            i = 0;
            gms0Var.j(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((gms0) it.next()).J(viewGroup);
                }
            }
            gms0Var.p = new ArrayList();
            gms0Var.q = new ArrayList();
            n660Var = gms0Var.l;
            n660Var2 = gms0Var.m;
            gx3Var = new gx3((gx3) n660Var.f22981a);
            gx3Var2 = new gx3((gx3) n660Var2.f22981a);
            i2 = 0;
            while (true) {
                iArr = gms0Var.o;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z4) {
                    z2 = z4;
                    for (i7 = gx3Var.c - 1; i7 >= 0; i7--) {
                        view = (View) gx3Var.f(i7);
                        if (view == null && gms0Var.D(view) && (mns0Var3 = (mns0) gx3Var2.remove(view)) != null && gms0Var.D(mns0Var3.b)) {
                            gms0Var.p.add((mns0) gx3Var.g(i7));
                            gms0Var.q.add(mns0Var3);
                        }
                    }
                } else if (i6 != 2) {
                    z2 = z4;
                    gx3Var3 = (gx3) n660Var.d;
                    gx3 gx3Var4 = (gx3) n660Var2.d;
                    i8 = gx3Var3.c;
                    for (i9 = 0; i9 < i8; i9++) {
                        view2 = (View) gx3Var3.j(i9);
                        if (view2 == null && gms0Var.D(view2) && (view3 = (View) gx3Var4.get(gx3Var3.f(i9))) != null && gms0Var.D(view3)) {
                            mns0 mns0Var4 = (mns0) gx3Var.get(view2);
                            mns0 mns0Var5 = (mns0) gx3Var2.get(view3);
                            if (mns0Var4 != null && mns0Var5 != null) {
                                gms0Var.p.add(mns0Var4);
                                gms0Var.q.add(mns0Var5);
                                gx3Var.remove(view2);
                                gx3Var2.remove(view3);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        u710Var = (u710) n660Var.c;
                        u710 u710Var2 = (u710) n660Var2.c;
                        iH = u710Var.h();
                        i11 = i;
                        while (i11 < iH) {
                            view6 = (View) u710Var.i(i11);
                            if (view6 == null && gms0Var.D(view6)) {
                                boolean z5 = z4;
                                View view7 = (View) u710Var2.b(u710Var.e(i11));
                                if (view7 == null || !gms0Var.D(view7)) {
                                    z3 = z5;
                                } else {
                                    mns0 mns0Var6 = (mns0) gx3Var.get(view6);
                                    mns0 mns0Var7 = (mns0) gx3Var2.get(view7);
                                    if (mns0Var6 == null || mns0Var7 == null) {
                                        z3 = z5;
                                    } else {
                                        z3 = z5;
                                        gms0Var.p.add(mns0Var6);
                                        gms0Var.q.add(mns0Var7);
                                        gx3Var.remove(view6);
                                        gx3Var2.remove(view7);
                                    }
                                }
                            } else {
                                z3 = z4;
                            }
                            i11++;
                            z4 = z3;
                        }
                    }
                    z2 = z4;
                } else {
                    z2 = z4;
                    sparseArray = (SparseArray) n660Var.b;
                    SparseArray sparseArray2 = (SparseArray) n660Var2.b;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view4 = (View) sparseArray.valueAt(i10);
                        if (view4 == null && gms0Var.D(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && gms0Var.D(view5)) {
                            mns0 mns0Var8 = (mns0) gx3Var.get(view4);
                            mns0 mns0Var9 = (mns0) gx3Var2.get(view5);
                            if (mns0Var8 != null && mns0Var9 != null) {
                                gms0Var.p.add(mns0Var8);
                                gms0Var.q.add(mns0Var9);
                                gx3Var.remove(view4);
                                gx3Var2.remove(view5);
                            }
                        }
                    }
                }
                i2++;
                z4 = z2;
                i = 0;
            }
            z = z4;
            for (i3 = 0; i3 < gx3Var.c; i3++) {
                mns0Var2 = (mns0) gx3Var.j(i3);
                if (gms0Var.D(mns0Var2.b)) {
                    gms0Var.p.add(mns0Var2);
                    gms0Var.q.add(null);
                }
            }
            for (i4 = 0; i4 < gx3Var2.c; i4++) {
                mns0Var = (mns0) gx3Var2.j(i4);
                if (gms0Var.D(mns0Var.b)) {
                    gms0Var.q.add(mns0Var);
                    gms0Var.p.add(null);
                }
            }
            gx3VarX = gms0.x();
            int i12 = gx3VarX.c;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i12 - 1;
            while (i5 >= 0) {
                animator = (Animator) gx3VarX.f(i5);
                if (animator == null && (tls0Var = (tls0) gx3VarX.get(animator)) != null) {
                    gms0 gms0Var2 = tls0Var.e;
                    View view8 = tls0Var.f34163a;
                    if (view8 != null && windowId.equals(tls0Var.d)) {
                        mns0 mns0Var10 = tls0Var.c;
                        boolean z6 = z;
                        mns0 mns0VarA = gms0Var.A(view8, z6);
                        mns0 mns0VarV = gms0Var.v(view8, z6);
                        if (mns0VarA == null && mns0VarV == null) {
                            mns0VarV = (mns0) ((gx3) gms0Var.m.f22981a).get(view8);
                        }
                        if ((mns0VarA != null || mns0VarV != null) && gms0Var2.C(mns0Var10, mns0VarV)) {
                            gms0Var2.w().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                gx3VarX.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            gms0Var.p(viewGroup, gms0Var.l, gms0Var.m, gms0Var.p, gms0Var.q);
            gms0Var.K();
            return true;
        }
        arrayList2 = new ArrayList();
        gx3VarB.put(viewGroup, arrayList2);
        arrayList2.add(gms0Var);
        gms0Var.a(new jsb(this, gx3VarB));
        i = 0;
        gms0Var.j(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((gms0) it.next()).J(viewGroup);
            }
        }
        gms0Var.p = new ArrayList();
        gms0Var.q = new ArrayList();
        n660Var = gms0Var.l;
        n660Var2 = gms0Var.m;
        gx3Var = new gx3((gx3) n660Var.f22981a);
        gx3Var2 = new gx3((gx3) n660Var2.f22981a);
        i2 = 0;
        while (true) {
            iArr = gms0Var.o;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z4) {
                z2 = z4;
                while (i7 >= 0) {
                    view = (View) gx3Var.f(i7);
                    if (view == null) {
                    }
                }
            } else if (i6 != 2) {
                z2 = z4;
                gx3Var3 = (gx3) n660Var.d;
                gx3 gx3Var5 = (gx3) n660Var2.d;
                i8 = gx3Var3.c;
                while (i9 < i8) {
                    view2 = (View) gx3Var3.j(i9);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 3) {
                if (i6 == 4) {
                    u710Var = (u710) n660Var.c;
                    u710 u710Var3 = (u710) n660Var2.c;
                    iH = u710Var.h();
                    i11 = i;
                    while (i11 < iH) {
                        view6 = (View) u710Var.i(i11);
                        if (view6 == null) {
                            z3 = z4;
                        } else {
                            z3 = z4;
                        }
                        i11++;
                        z4 = z3;
                    }
                }
                z2 = z4;
            } else {
                z2 = z4;
                sparseArray = (SparseArray) n660Var.b;
                SparseArray sparseArray3 = (SparseArray) n660Var2.b;
                size = sparseArray.size();
                while (i10 < size) {
                    view4 = (View) sparseArray.valueAt(i10);
                    if (view4 == null) {
                    }
                }
            }
            i2++;
            z4 = z2;
            i = 0;
        }
        z = z4;
        while (i3 < gx3Var.c) {
            mns0Var2 = (mns0) gx3Var.j(i3);
            if (gms0Var.D(mns0Var2.b)) {
                gms0Var.p.add(mns0Var2);
                gms0Var.q.add(null);
            }
        }
        while (i4 < gx3Var2.c) {
            mns0Var = (mns0) gx3Var2.j(i4);
            if (gms0Var.D(mns0Var.b)) {
                gms0Var.q.add(mns0Var);
                gms0Var.p.add(null);
            }
        }
        gx3VarX = gms0.x();
        int i13 = gx3VarX.c;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i13 - 1;
        while (i5 >= 0) {
            animator = (Animator) gx3VarX.f(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        gms0Var.p(viewGroup, gms0Var.l, gms0Var.m, gms0Var.p, gms0Var.q);
        gms0Var.K();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        tms0.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) tms0.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((gms0) it.next()).J(viewGroup);
            }
        }
        this.f32463a.m(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
