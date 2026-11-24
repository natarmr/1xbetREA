package a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xfx extends oyc implements Runnable, zf60, View.OnAttachStateChangeListener {
    public boolean c;
    public int d;
    public xiv0 e;
    public final hz40 f;
    public final cgk0 g;
    public final vy40 h;
    public final SnapshotStateList i;

    public xfx() {
        super(1);
        hz40 hz40Var = new hz40(9);
        gjv0.f11419a.getClass();
        hz40Var.n(fjv0.b, new vjv0("caption bar"));
        hz40Var.n(fjv0.c, new vjv0("display cutout"));
        hz40Var.n(fjv0.d, new vjv0("ime"));
        hz40Var.n(fjv0.e, new vjv0("mandatory system gestures"));
        hz40Var.n(fjv0.f, new vjv0("navigation bars"));
        hz40Var.n(fjv0.g, new vjv0("status bars"));
        hz40Var.n(fjv0.h, new vjv0("system gestures"));
        hz40Var.n(fjv0.i, new vjv0("tappable element"));
        hz40Var.n(fjv0.j, new vjv0("waterfall"));
        this.f = hz40Var;
        this.g = androidx.compose.runtime.e.b(0);
        this.h = new vy40(4);
        this.i = new SnapshotStateList();
    }

    public final void I(xiv0 xiv0Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        ey40 ey40Var = ijv0.f14897a;
        int[] iArr2 = ey40Var.b;
        Object[] objArr3 = ey40Var.c;
        long[] jArr2 = ey40Var.f11466a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            gjv0 gjv0Var = (gjv0) objArr3[i6];
                            pfx pfxVarI = xiv0Var.f40966a.i(i7);
                            long j3 = (((long) pfxVarI.f26926a) << 48) | (((long) pfxVarI.b) << 32) | (((long) pfxVarI.c) << 16) | ((long) pfxVarI.d);
                            Object objG = this.f.g(gjv0Var);
                            objG.getClass();
                            vjv0 vjv0Var = (vjv0) objG;
                            if (!knm0.k(j3, vjv0Var.h)) {
                                vjv0Var.h = j3;
                                z2 = true;
                                if (!knm0.k(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                pfx pfxVarJ = xiv0Var.f40966a.j(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) pfxVarJ.b) << 32) | (((long) pfxVarJ.f26926a) << 48) | (((long) pfxVarJ.c) << 16) | ((long) pfxVarJ.d);
                                if (!knm0.k(vjv0Var.i, j4)) {
                                    vjv0Var.i = j4;
                                    z2 = true;
                                    if (!knm0.k(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            ((hgk0) vjv0Var.f37550a).setValue(Boolean.valueOf(xiv0Var.f40966a.u(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        vvk vvkVarH = xiv0Var.f40966a.h();
        if (vvkVarH == null) {
            j = 0;
        } else {
            pfx pfxVarA = vvkVarH.a();
            j = (((long) pfxVarA.f26926a) << c3) | (((long) pfxVarA.b) << c2) | (((long) pfxVarA.c) << c) | ((long) pfxVarA.d);
        }
        hz40 hz40Var = this.f;
        gjv0.f11419a.getClass();
        Object objG2 = hz40Var.g(fjv0.j);
        objG2.getClass();
        vjv0 vjv0Var2 = (vjv0) objG2;
        ((hgk0) vjv0Var2.f37550a).setValue(Boolean.valueOf(!knm0.k(j, 0L)));
        if (!knm0.k(vjv0Var2.h, j)) {
            vjv0Var2.h = j;
            vjv0Var2.i = j;
            z2 = z;
            if (!knm0.k(j, 0L)) {
                z3 = z2;
            }
        }
        if (vvkVarH == null) {
            vy40 vy40Var = this.h;
            if (vy40Var.b > 0) {
                vy40Var.d();
                this.i.clear();
                z2 = z;
            }
        } else {
            List listI = Build.VERSION.SDK_INT >= 28 ? ia3.i(vvkVarH.f38104a) : Collections.EMPTY_LIST;
            int size = listI.size();
            vy40 vy40Var2 = this.h;
            if (size < vy40Var2.b) {
                vy40Var2.m(listI.size(), this.h.b);
                this.i.k(listI.size(), this.i.size());
                z2 = z;
            } else {
                int size2 = listI.size() - this.h.b;
                int i8 = 0;
                while (i8 < size2) {
                    vy40 vy40Var3 = this.h;
                    vy40Var3.a(androidx.compose.runtime.e.e(listI.get(vy40Var3.b)));
                    this.i.add(new tdx(twn.m(this.h.b, "display cutout rect ")));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listI.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listI.get(i9);
                pz40 pz40Var = (pz40) this.h.g(i9);
                if (!Intrinsics.d(pz40Var.getValue(), rect)) {
                    pz40Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listI.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.g.l() != 0) && z2) {
            cgk0 cgk0Var = this.g;
            cgk0Var.m(cgk0Var.l() + 1);
            synchronized (xfk0.c) {
                iz40 iz40Var = xfk0.j.h;
                z4 = (iz40Var == null || iz40Var.h() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                xfk0.c();
            }
        }
    }

    @Override // a.oyc
    public final void f(div0 div0Var) {
        boolean z = false;
        this.c = false;
        int iD = div0Var.f6156a.d();
        this.d &= ~iD;
        this.e = null;
        gjv0 gjv0Var = (gjv0) ijv0.f14897a.b(iD);
        if (gjv0Var != null) {
            Object objG = this.f.g(gjv0Var);
            objG.getClass();
            vjv0 vjv0Var = (vjv0) objG;
            vjv0Var.c.m(0.0f);
            vjv0Var.e.m(1.0f);
            vjv0Var.d.m(0L);
            vjv0Var.c.m(0.0f);
            ((hgk0) vjv0Var.b).setValue(Boolean.FALSE);
            vjv0Var.j = -1L;
            vjv0Var.k = -1L;
            cgk0 cgk0Var = this.g;
            cgk0Var.m(cgk0Var.l() + 1);
            synchronized (xfk0.c) {
                iz40 iz40Var = xfk0.j.h;
                if (iz40Var != null && iz40Var.h()) {
                    z = true;
                }
            }
            if (z) {
                xfk0.c();
            }
        }
    }

    @Override // a.oyc
    public final void g(div0 div0Var) {
        this.c = true;
    }

    @Override // a.oyc
    public final xiv0 h(xiv0 xiv0Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            div0 div0Var = (div0) list.get(i);
            gjv0 gjv0Var = (gjv0) ijv0.f14897a.b(div0Var.f6156a.d());
            if (gjv0Var != null) {
                Object objG = this.f.g(gjv0Var);
                objG.getClass();
                vjv0 vjv0Var = (vjv0) objG;
                if (((Boolean) ((hgk0) vjv0Var.b).getValue()).booleanValue()) {
                    civ0 civ0Var = div0Var.f6156a;
                    vjv0Var.c.m(civ0Var.c());
                    vjv0Var.e.m(civ0Var.a());
                    vjv0Var.d.m(civ0Var.b());
                }
            }
        }
        I(xiv0Var);
        return xiv0Var;
    }

    @Override // a.oyc
    public final hcp0 i(div0 div0Var, hcp0 hcp0Var) {
        xiv0 xiv0Var = this.e;
        boolean z = false;
        this.c = false;
        this.e = null;
        if (div0Var.f6156a.b() > 0 && xiv0Var != null) {
            int iD = div0Var.f6156a.d();
            this.d |= iD;
            gjv0 gjv0Var = (gjv0) ijv0.f14897a.b(iD);
            if (gjv0Var != null) {
                Object objG = this.f.g(gjv0Var);
                objG.getClass();
                vjv0 vjv0Var = (vjv0) objG;
                pfx pfxVarI = xiv0Var.f40966a.i(iD);
                long j = (((long) pfxVarI.f26926a) << 48) | (((long) pfxVarI.b) << 32) | (((long) pfxVarI.c) << 16) | ((long) pfxVarI.d);
                long j2 = vjv0Var.h;
                if (!knm0.k(j, j2)) {
                    vjv0Var.j = j2;
                    vjv0Var.k = j;
                    ((hgk0) vjv0Var.b).setValue(Boolean.TRUE);
                    civ0 civ0Var = div0Var.f6156a;
                    vjv0Var.c.m(civ0Var.c());
                    vjv0Var.e.m(civ0Var.a());
                    vjv0Var.d.m(civ0Var.b());
                    cgk0 cgk0Var = this.g;
                    cgk0Var.m(cgk0Var.l() + 1);
                    synchronized (xfk0.c) {
                        iz40 iz40Var = xfk0.j.h;
                        if (iz40Var != null && iz40Var.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        xfk0.c();
                        return hcp0Var;
                    }
                }
            }
        }
        return hcp0Var;
    }

    @Override // a.zf60
    public final xiv0 l(View view, xiv0 xiv0Var) {
        if (this.c) {
            this.e = xiv0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return xiv0Var;
            }
        } else if (this.d == 0) {
            I(xiv0Var);
        }
        return xiv0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(view, this);
        div0.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(view, null);
        div0.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            this.d = 0;
            this.c = false;
            xiv0 xiv0Var = this.e;
            if (xiv0Var != null) {
                I(xiv0Var);
                this.e = null;
            }
        }
    }
}
