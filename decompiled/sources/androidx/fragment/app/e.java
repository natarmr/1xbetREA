package androidx.fragment.app;

import a.axq;
import a.b1j;
import a.ccf;
import a.cge0;
import a.clz;
import a.cxq;
import a.fhj;
import a.glz;
import a.go;
import a.h0q0;
import a.h6r;
import a.hny;
import a.itt0;
import a.jf4;
import a.jg60;
import a.jxq;
import a.k1r;
import a.k4r;
import a.k5r;
import a.kd30;
import a.kng0;
import a.kxq;
import a.l1r;
import a.lkz;
import a.m1r;
import a.mx2;
import a.n1r;
import a.nxj;
import a.o1r;
import a.ohq;
import a.ohs0;
import a.pek;
import a.piu0;
import a.pmi;
import a.q1r;
import a.r1r;
import a.rnk0;
import a.s1r;
import a.sbe;
import a.sgy;
import a.sre0;
import a.sv00;
import a.t1r;
import a.tnk0;
import a.twn;
import a.ua80;
import a.udk;
import a.ufd;
import a.v1r;
import a.v62;
import a.vbc;
import a.vbf;
import a.w0r;
import a.w1r;
import a.x0r;
import a.xn;
import a.yfd;
import a.ywu;
import a.zb5;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.gov.nist.core.LexerCore;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public Fragment A;
    public final m1r B;
    public final pek C;
    public go D;
    public go E;
    public go F;
    public ArrayDeque G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public w1r P;
    public final mx2 Q;
    public boolean b;
    public ArrayList e;
    public jg60 g;
    public final fhj p;
    public final CopyOnWriteArrayList q;
    public final k1r r;
    public final k1r s;
    public final k1r t;
    public final k1r u;
    public final l1r v;
    public int w;
    public jxq x;
    public vbc y;
    public Fragment z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45379a = new ArrayList();
    public final pmi c = new pmi();
    public ArrayList d = new ArrayList();
    public final w0r f = new w0r(this);
    public zb5 h = null;
    public boolean i = false;
    public final v62 j = new v62(this, 10, false);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final Map n = Collections.synchronizedMap(new HashMap());
    public final ArrayList o = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v17, types: [a.k1r] */
    /* JADX WARN: Type inference failed for: r0v18, types: [a.k1r] */
    /* JADX WARN: Type inference failed for: r0v19, types: [a.k1r] */
    /* JADX WARN: Type inference failed for: r0v20, types: [a.k1r] */
    public e() {
        fhj fhjVar = new fhj();
        fhjVar.f9543a = this;
        fhjVar.b = new CopyOnWriteArrayList();
        this.p = fhjVar;
        this.q = new CopyOnWriteArrayList();
        final byte b = 0;
        this.r = new sbe(this) { // from class: a.k1r
            public final /* synthetic */ androidx.fragment.app.e b;

            {
                this.b = this;
            }

            @Override // a.sbe
            public final void accept(Object obj) {
                byte b2 = b;
                androidx.fragment.app.e eVar = this.b;
                switch (b2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (eVar.X()) {
                            eVar.l(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (eVar.X() && num.intValue() == 80) {
                            eVar.p(false);
                            break;
                        }
                        break;
                    case 2:
                        gx40 gx40Var = (gx40) obj;
                        if (eVar.X()) {
                            boolean z = gx40Var.f12060a;
                            eVar.q(false);
                        }
                        break;
                    default:
                        ot90 ot90Var = (ot90) obj;
                        if (eVar.X()) {
                            boolean z2 = ot90Var.f25819a;
                            eVar.v(false);
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.s = new sbe(this) { // from class: a.k1r
            public final /* synthetic */ androidx.fragment.app.e b;

            {
                this.b = this;
            }

            @Override // a.sbe
            public final void accept(Object obj) {
                byte b3 = b2;
                androidx.fragment.app.e eVar = this.b;
                switch (b3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (eVar.X()) {
                            eVar.l(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (eVar.X() && num.intValue() == 80) {
                            eVar.p(false);
                            break;
                        }
                        break;
                    case 2:
                        gx40 gx40Var = (gx40) obj;
                        if (eVar.X()) {
                            boolean z = gx40Var.f12060a;
                            eVar.q(false);
                        }
                        break;
                    default:
                        ot90 ot90Var = (ot90) obj;
                        if (eVar.X()) {
                            boolean z2 = ot90Var.f25819a;
                            eVar.v(false);
                        }
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.t = new sbe(this) { // from class: a.k1r
            public final /* synthetic */ androidx.fragment.app.e b;

            {
                this.b = this;
            }

            @Override // a.sbe
            public final void accept(Object obj) {
                byte b4 = b3;
                androidx.fragment.app.e eVar = this.b;
                switch (b4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (eVar.X()) {
                            eVar.l(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (eVar.X() && num.intValue() == 80) {
                            eVar.p(false);
                            break;
                        }
                        break;
                    case 2:
                        gx40 gx40Var = (gx40) obj;
                        if (eVar.X()) {
                            boolean z = gx40Var.f12060a;
                            eVar.q(false);
                        }
                        break;
                    default:
                        ot90 ot90Var = (ot90) obj;
                        if (eVar.X()) {
                            boolean z2 = ot90Var.f25819a;
                            eVar.v(false);
                        }
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.u = new sbe(this) { // from class: a.k1r
            public final /* synthetic */ androidx.fragment.app.e b;

            {
                this.b = this;
            }

            @Override // a.sbe
            public final void accept(Object obj) {
                byte b5 = b4;
                androidx.fragment.app.e eVar = this.b;
                switch (b5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (eVar.X()) {
                            eVar.l(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (eVar.X() && num.intValue() == 80) {
                            eVar.p(false);
                            break;
                        }
                        break;
                    case 2:
                        gx40 gx40Var = (gx40) obj;
                        if (eVar.X()) {
                            boolean z = gx40Var.f12060a;
                            eVar.q(false);
                        }
                        break;
                    default:
                        ot90 ot90Var = (ot90) obj;
                        if (eVar.X()) {
                            boolean z2 = ot90Var.f25819a;
                            eVar.v(false);
                        }
                        break;
                }
            }
        };
        this.v = new l1r(this);
        this.w = -1;
        this.B = new m1r(this);
        this.C = new pek();
        this.G = new ArrayDeque();
        this.Q = new mx2(this, (byte) 13);
    }

    public static Fragment H(View view) {
        Fragment fragmentL = L(view);
        if (fragmentL != null) {
            return fragmentL;
        }
        udk.d(view, " does not have a Fragment set", "View ");
        return null;
    }

    public static e K(View view) {
        kxq kxqVar;
        Fragment fragmentL = L(view);
        if (fragmentL != null) {
            if (fragmentL.N()) {
                return fragmentL.C();
            }
            throw new IllegalStateException("The Fragment " + fragmentL + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                kxqVar = null;
                break;
            }
            if (context instanceof kxq) {
                kxqVar = (kxq) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (kxqVar != null) {
            return kxqVar.r();
        }
        udk.d(view, " is not within a subclass of FragmentActivity.", "View ");
        return null;
    }

    public static Fragment L(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static HashSet N(zb5 zb5Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < zb5Var.f44098a.size(); i++) {
            Fragment fragment = ((h6r) zb5Var.f44098a.get(i)).b;
            if (fragment != null && zb5Var.g) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean V(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean W(Fragment fragment) {
        if (fragment.h1 && fragment.i1) {
            return true;
        }
        boolean zW = false;
        for (Fragment fragment2 : fragment.x.c.o()) {
            if (fragment2 != null) {
                zW = W(fragment2);
            }
            if (zW) {
                return true;
            }
        }
        return false;
    }

    public static boolean Y(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        if (fragment.i1) {
            return fragment.v == null || Y(fragment.y);
        }
        return false;
    }

    public static boolean Z(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        e eVar = fragment.v;
        return fragment == eVar.A && Z(eVar.z);
    }

    public static void y0(Fragment fragment) {
        if (V(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.Y) {
            fragment.Y = false;
            fragment.p1 = !fragment.p1;
        }
    }

    public final void A(s1r s1rVar, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (this.K) {
                    jf4.n("FragmentManager has been destroyed");
                    return;
                } else {
                    jf4.n("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (a0()) {
                jf4.n("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f45379a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f45379a.add(s1rVar);
                    r0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new sv00());
        jxq jxqVar = this.x;
        if (jxqVar == null) {
            try {
                y("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            jxqVar.e.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void B(boolean z) {
        if (this.b) {
            jf4.n("FragmentManager is already executing transactions");
            return;
        }
        if (this.x == null) {
            if (this.K) {
                jf4.n("FragmentManager has been destroyed");
                return;
            } else {
                jf4.n("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.x.c.getLooper()) {
            jf4.n("Must be called from main thread of fragment host");
            return;
        }
        if (!z && a0()) {
            jf4.n("Can not perform this action after onSaveInstanceState");
        } else if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    public final void B0(q1r q1rVar) {
        fhj fhjVar = this.p;
        fhjVar.getClass();
        q1rVar.getClass();
        synchronized (((CopyOnWriteArrayList) fhjVar.b)) {
            int size = ((CopyOnWriteArrayList) fhjVar.b).size();
            for (int i = 0; i < size; i++) {
                if (((x0r) ((CopyOnWriteArrayList) fhjVar.b).get(i)).f40084a == q1rVar) {
                    ((CopyOnWriteArrayList) fhjVar.b).remove(i);
                    break;
                }
            }
        }
    }

    public final boolean C(boolean z) {
        boolean zA;
        ArrayList arrayList;
        zb5 zb5Var;
        B(z);
        if (!this.i && (zb5Var = this.h) != null) {
            zb5Var.s = false;
            zb5Var.e();
            if (V(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.f45379a);
            }
            this.h.g(false, false);
            this.f45379a.add(0, this.h);
            Iterator it = this.h.f44098a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((h6r) it.next()).b;
                if (fragment != null) {
                    fragment.n = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.M;
            ArrayList arrayList3 = this.N;
            synchronized (this.f45379a) {
                if (this.f45379a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f45379a.size();
                        int i = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.f45379a;
                            if (i >= size) {
                                break;
                            }
                            zA |= ((s1r) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.x.c.removeCallbacks(this.Q);
                    } catch (Throwable th) {
                        this.f45379a.clear();
                        this.x.c.removeCallbacks(this.Q);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            z2 = true;
            this.b = true;
            try {
                m0(this.M, this.N);
                e();
            } catch (Throwable th2) {
                e();
                throw th2;
            }
        }
        C0();
        if (this.L) {
            this.L = false;
            z0();
        }
        ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void C0() {
        synchronized (this.f45379a) {
            try {
                if (!this.f45379a.isEmpty()) {
                    this.j.f(true);
                    if (V(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = P() > 0 && Z(this.z);
                if (V(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.j.f(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D(zb5 zb5Var, boolean z) {
        if (z && (this.x == null || this.K)) {
            return;
        }
        B(z);
        zb5 zb5Var2 = this.h;
        if (zb5Var2 != null) {
            zb5Var2.s = false;
            zb5Var2.e();
            if (V(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execSingleAction for action " + zb5Var);
            }
            this.h.g(false, false);
            this.h.a(this.M, this.N);
            Iterator it = this.h.f44098a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((h6r) it.next()).b;
                if (fragment != null) {
                    fragment.n = false;
                }
            }
            this.h = null;
        }
        zb5Var.a(this.M, this.N);
        this.b = true;
        try {
            m0(this.M, this.N);
            e();
            C0();
            if (this.L) {
                this.L = false;
                z0();
            }
            ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0236 A[PHI: r15
  0x0236: PHI (r15v21 int) = (r15v20 int), (r15v23 int) binds: [B:105:0x0223, B:109:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    public final void E(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        Object objPrevious;
        ArrayList arrayList3;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5 = i;
        pmi pmiVar = this.c;
        ArrayList arrayList4 = this.o;
        boolean z4 = ((zb5) arrayList.get(i5)).p;
        ArrayList arrayList5 = this.O;
        if (arrayList5 == null) {
            this.O = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.O.addAll(pmiVar.p());
        Fragment fragment = this.A;
        int i6 = i5;
        boolean z5 = false;
        while (i6 < i2) {
            zb5 zb5Var = (zb5) arrayList.get(i6);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList6 = this.O;
            if (zBooleanValue) {
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
                int i7 = 1;
                ArrayList arrayList7 = zb5Var.f44098a;
                int size = arrayList7.size() - 1;
                while (size >= 0) {
                    h6r h6rVar = (h6r) arrayList7.get(size);
                    int i8 = h6rVar.f12542a;
                    if (i8 != i7) {
                        if (i8 != 3) {
                            switch (i8) {
                                case 6:
                                    arrayList6.add(h6rVar.b);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = h6rVar.b;
                                    break;
                                case 10:
                                    h6rVar.i = h6rVar.h;
                                    break;
                            }
                        } else {
                            arrayList6.add(h6rVar.b);
                        }
                        size--;
                        i7 = 1;
                    }
                    arrayList6.remove(h6rVar.b);
                    size--;
                    i7 = 1;
                }
            } else {
                ArrayList arrayList8 = zb5Var.f44098a;
                int i9 = 0;
                while (i9 < arrayList8.size()) {
                    h6r h6rVar2 = (h6r) arrayList8.get(i9);
                    boolean z6 = z4;
                    int i10 = h6rVar2.f12542a;
                    int i11 = i6;
                    int i12 = 1;
                    if (i10 != 1) {
                        z3 = z5;
                        if (i10 != 2) {
                            if (i10 == 3 || i10 == 6) {
                                arrayList6.remove(h6rVar2.b);
                                Fragment fragment2 = h6rVar2.b;
                                if (fragment2 == fragment) {
                                    arrayList8.add(i9, new h6r(9, fragment2));
                                    i9++;
                                    fragment = null;
                                }
                            } else if (i10 == 7) {
                                i12 = 1;
                            } else if (i10 == 8) {
                                arrayList8.add(i9, new h6r(9, fragment, 0));
                                h6rVar2.c = true;
                                i9++;
                                fragment = h6rVar2.b;
                            }
                            i12 = 1;
                        } else {
                            Fragment fragment3 = h6rVar2.b;
                            int i13 = fragment3.A;
                            int size2 = arrayList6.size() - 1;
                            boolean z7 = false;
                            while (size2 >= 0) {
                                int i14 = size2;
                                Fragment fragment4 = (Fragment) arrayList6.get(size2);
                                ArrayList arrayList9 = arrayList4;
                                if (fragment4.A != i13) {
                                    i13 = i13;
                                } else if (fragment4 == fragment3) {
                                    i13 = i13;
                                    z7 = true;
                                } else {
                                    if (fragment4 == fragment) {
                                        arrayList8.add(i9, new h6r(9, fragment4, 0));
                                        i9++;
                                        i4 = 0;
                                        fragment = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    h6r h6rVar3 = new h6r(3, fragment4, i4);
                                    h6rVar3.d = h6rVar2.d;
                                    h6rVar3.f = h6rVar2.f;
                                    h6rVar3.e = h6rVar2.e;
                                    h6rVar3.g = h6rVar2.g;
                                    arrayList8.add(i9, h6rVar3);
                                    arrayList6.remove(fragment4);
                                    i9++;
                                    fragment = fragment;
                                }
                                size2 = i14 - 1;
                                i13 = i13;
                                arrayList4 = arrayList9;
                            }
                            arrayList4 = arrayList4;
                            i12 = 1;
                            if (z7) {
                                arrayList8.remove(i9);
                                i9--;
                            } else {
                                h6rVar2.f12542a = 1;
                                h6rVar2.c = true;
                                arrayList6.add(fragment3);
                            }
                        }
                        i9 += i12;
                        z4 = z6;
                        i6 = i11;
                        z5 = z3;
                        arrayList4 = arrayList4;
                    } else {
                        z3 = z5;
                    }
                    arrayList4 = arrayList4;
                    arrayList6.add(h6rVar2.b);
                    i9 += i12;
                    z4 = z6;
                    i6 = i11;
                    z5 = z3;
                    arrayList4 = arrayList4;
                }
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
            }
            z5 = z2 || zb5Var.g;
            i6 = i3 + 1;
            z4 = z;
            arrayList4 = arrayList3;
        }
        ArrayList arrayList10 = arrayList4;
        boolean z8 = z4;
        boolean z9 = z5;
        this.O.clear();
        if (!z8 && this.w >= 1) {
            for (int i15 = i5; i15 < i2; i15++) {
                Iterator it = ((zb5) arrayList.get(i15)).f44098a.iterator();
                while (it.hasNext()) {
                    Fragment fragment5 = ((h6r) it.next()).b;
                    if (fragment5 != null && fragment5.v != null) {
                        pmiVar.C(j(fragment5));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i16 = i5;
        while (i16 < i2) {
            zb5 zb5Var2 = (zb5) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                zb5Var2.d(-1);
                e eVar = zb5Var2.r;
                ArrayList arrayList11 = zb5Var2.f44098a;
                for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                    h6r h6rVar4 = (h6r) arrayList11.get(size3);
                    Fragment fragment6 = h6rVar4.b;
                    if (fragment6 != null) {
                        fragment6.o = zb5Var2.u;
                        if (fragment6.o1 != null) {
                            fragment6.A().f5134a = true;
                        }
                        int i17 = zb5Var2.f;
                        int i18 = 8194;
                        int i19 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                i18 = LexerCore.IPV6;
                                if (i17 != 8197) {
                                    i19 = 4099;
                                    if (i17 != 4099) {
                                        i18 = i17 != 4100 ? 0 : 8197;
                                    } else {
                                        i18 = i19;
                                    }
                                }
                            } else {
                                i18 = i19;
                            }
                        }
                        if (fragment6.o1 != null || i18 != 0) {
                            fragment6.A();
                            fragment6.o1.f = i18;
                        }
                        fragment6.A();
                        fragment6.o1.getClass();
                    }
                    switch (h6rVar4.f12542a) {
                        case 1:
                            fragment6.r0(h6rVar4.d, h6rVar4.e, h6rVar4.f, h6rVar4.g);
                            eVar.s0(fragment6, true);
                            eVar.l0(fragment6);
                            break;
                        case 2:
                        default:
                            ohq.h(h6rVar4.f12542a, str);
                            return;
                        case 3:
                            fragment6.r0(h6rVar4.d, h6rVar4.e, h6rVar4.f, h6rVar4.g);
                            eVar.a(fragment6);
                            break;
                        case 4:
                            fragment6.r0(h6rVar4.d, h6rVar4.e, h6rVar4.f, h6rVar4.g);
                            eVar.getClass();
                            y0(fragment6);
                            break;
                        case 5:
                            fragment6.r0(h6rVar4.d, h6rVar4.e, h6rVar4.f, h6rVar4.g);
                            eVar.s0(fragment6, true);
                            eVar.U(fragment6);
                            break;
                        case 6:
                            fragment6.r0(h6rVar4.d, h6rVar4.e, h6rVar4.f, h6rVar4.g);
                            eVar.c(fragment6);
                            break;
                        case 7:
                            fragment6.r0(h6rVar4.d, h6rVar4.e, h6rVar4.f, h6rVar4.g);
                            eVar.s0(fragment6, true);
                            eVar.k(fragment6);
                            break;
                        case 8:
                            eVar.w0(null);
                            break;
                        case 9:
                            eVar.w0(fragment6);
                            break;
                        case 10:
                            h6rVar4.i = fragment6.t1;
                            eVar.v0(fragment6, h6rVar4.h);
                            break;
                    }
                }
            } else {
                zb5Var2.d(1);
                e eVar2 = zb5Var2.r;
                ArrayList arrayList12 = zb5Var2.f44098a;
                int size4 = arrayList12.size();
                int i20 = 0;
                while (i20 < size4) {
                    h6r h6rVar5 = (h6r) arrayList12.get(i20);
                    Fragment fragment7 = h6rVar5.b;
                    if (fragment7 != null) {
                        fragment7.o = zb5Var2.u;
                        if (fragment7.o1 != null) {
                            fragment7.A().f5134a = false;
                        }
                        int i21 = zb5Var2.f;
                        if (fragment7.o1 != null || i21 != 0) {
                            fragment7.A();
                            fragment7.o1.f = i21;
                        }
                        fragment7.A();
                        fragment7.o1.getClass();
                    }
                    switch (h6rVar5.f12542a) {
                        case 1:
                            fragment7.r0(h6rVar5.d, h6rVar5.e, h6rVar5.f, h6rVar5.g);
                            eVar2.s0(fragment7, false);
                            eVar2.a(fragment7);
                            i20++;
                            str = str;
                            break;
                        case 2:
                        default:
                            ohq.h(h6rVar5.f12542a, str);
                            return;
                        case 3:
                            fragment7.r0(h6rVar5.d, h6rVar5.e, h6rVar5.f, h6rVar5.g);
                            eVar2.l0(fragment7);
                            i20++;
                            str = str;
                            break;
                        case 4:
                            fragment7.r0(h6rVar5.d, h6rVar5.e, h6rVar5.f, h6rVar5.g);
                            eVar2.U(fragment7);
                            i20++;
                            str = str;
                            break;
                        case 5:
                            fragment7.r0(h6rVar5.d, h6rVar5.e, h6rVar5.f, h6rVar5.g);
                            eVar2.s0(fragment7, false);
                            y0(fragment7);
                            i20++;
                            str = str;
                            break;
                        case 6:
                            fragment7.r0(h6rVar5.d, h6rVar5.e, h6rVar5.f, h6rVar5.g);
                            eVar2.k(fragment7);
                            i20++;
                            str = str;
                            break;
                        case 7:
                            fragment7.r0(h6rVar5.d, h6rVar5.e, h6rVar5.f, h6rVar5.g);
                            eVar2.s0(fragment7, false);
                            eVar2.c(fragment7);
                            i20++;
                            str = str;
                            break;
                        case 8:
                            eVar2.w0(fragment7);
                            i20++;
                            str = str;
                            break;
                        case 9:
                            eVar2.w0(null);
                            i20++;
                            str = str;
                            break;
                        case 10:
                            h6rVar5.h = fragment7.t1;
                            eVar2.v0(fragment7, h6rVar5.i);
                            i20++;
                            str = str;
                            break;
                    }
                }
            }
            i16++;
            str = str;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList10.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(N((zb5) it2.next()));
            }
            if (this.h == null) {
                Iterator it3 = arrayList10.iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        hny.b();
                        return;
                    }
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = arrayList10.iterator();
                while (it5.hasNext()) {
                    if (it5.next() != null) {
                        hny.b();
                        return;
                    }
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i22 = i5; i22 < i2; i22++) {
            zb5 zb5Var3 = (zb5) arrayList.get(i22);
            if (zBooleanValue2) {
                for (int size5 = zb5Var3.f44098a.size() - 1; size5 >= 0; size5--) {
                    Fragment fragment8 = ((h6r) zb5Var3.f44098a.get(size5)).b;
                    if (fragment8 != null) {
                        j(fragment8).k();
                    }
                }
            } else {
                Iterator it7 = zb5Var3.f44098a.iterator();
                while (it7.hasNext()) {
                    Fragment fragment9 = ((h6r) it7.next()).b;
                    if (fragment9 != null) {
                        j(fragment9).k();
                    }
                }
            }
        }
        b0(this.w, true);
        for (nxj nxjVar : i(arrayList, i5, i2)) {
            nxjVar.e = zBooleanValue2;
            synchronized (nxjVar.b) {
                try {
                    nxjVar.l();
                    ArrayList arrayList13 = nxjVar.b;
                    ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            rnk0 rnk0Var = (rnk0) objPrevious;
                            cge0 cge0Var = tnk0.f34240a;
                            View view = rnk0Var.c.l1;
                            view.getClass();
                            cge0Var.getClass();
                            tnk0 tnk0VarC = cge0.c(view);
                            tnk0 tnk0Var = rnk0Var.f30792a;
                            tnk0 tnk0Var2 = tnk0.c;
                            if (tnk0Var != tnk0Var2 || tnk0VarC == tnk0Var2) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    nxjVar.f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            nxjVar.e();
        }
        while (i5 < i2) {
            zb5 zb5Var4 = (zb5) arrayList.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue() && zb5Var4.t >= 0) {
                zb5Var4.t = -1;
            }
            if (zb5Var4.q != null) {
                for (int i23 = 0; i23 < zb5Var4.q.size(); i23++) {
                    ((Runnable) zb5Var4.q.get(i23)).run();
                }
                zb5Var4.q = null;
            }
            i5++;
        }
        if (!z9 || arrayList10.size() <= 0) {
            return;
        }
        arrayList10.get(0).getClass();
        hny.b();
    }

    public final void F() {
        C(true);
        M();
    }

    public final int G(String str, int i, boolean z) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            zb5 zb5Var = (zb5) this.d.get(size);
            if ((str != null && str.equals(zb5Var.i)) || (i >= 0 && i == zb5Var.t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            zb5 zb5Var2 = (zb5) this.d.get(size - 1);
            if ((str == null || !str.equals(zb5Var2.i)) && (i < 0 || i != zb5Var2.t)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final Fragment I(int i) {
        pmi pmiVar = this.c;
        ArrayList arrayList = (ArrayList) pmiVar.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.z == i) {
                return fragment;
            }
        }
        for (f fVar : ((HashMap) pmiVar.c).values()) {
            if (fVar != null) {
                Fragment fragment2 = fVar.c;
                if (fragment2.z == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment J(String str) {
        pmi pmiVar = this.c;
        ArrayList arrayList = (ArrayList) pmiVar.b;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.B)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (f fVar : ((HashMap) pmiVar.c).values()) {
            if (fVar != null) {
                Fragment fragment2 = fVar.c;
                if (str.equals(fragment2.B)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void M() {
        for (nxj nxjVar : h()) {
            if (nxjVar.f) {
                if (V(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                nxjVar.f = false;
                nxjVar.e();
            }
        }
    }

    public final zb5 O(int i) {
        if (i != this.d.size()) {
            return (zb5) this.d.get(i);
        }
        zb5 zb5Var = this.h;
        if (zb5Var != null) {
            return zb5Var;
        }
        throw new IndexOutOfBoundsException();
    }

    public final int P() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final Fragment Q(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentJ = this.c.j(string);
        if (fragmentJ != null) {
            return fragmentJ;
        }
        A0(new IllegalStateException(ua80.i("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup R(Fragment fragment) {
        ViewGroup viewGroup = fragment.k1;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.A <= 0 || !this.y.c0()) {
            return null;
        }
        View viewB0 = this.y.b0(fragment.A);
        if (viewB0 instanceof ViewGroup) {
            return (ViewGroup) viewB0;
        }
        return null;
    }

    public final m1r S() {
        Fragment fragment = this.z;
        return fragment != null ? fragment.v.S() : this.B;
    }

    public final pek T() {
        Fragment fragment = this.z;
        return fragment != null ? fragment.v.T() : this.C;
    }

    public final void U(Fragment fragment) {
        if (V(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.Y) {
            return;
        }
        fragment.Y = true;
        fragment.p1 = true ^ fragment.p1;
        x0(fragment);
    }

    public final boolean X() {
        Fragment fragment = this.z;
        if (fragment == null) {
            return true;
        }
        return fragment.N() && this.z.F().X();
    }

    public final f a(Fragment fragment) {
        String str = fragment.s1;
        if (str != null) {
            k5r.d(fragment, str);
        }
        if (V(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        f fVarJ = j(fragment);
        fragment.v = this;
        pmi pmiVar = this.c;
        pmiVar.C(fVarJ);
        if (!fragment.Z) {
            pmiVar.f(fragment);
            fragment.m = false;
            if (fragment.l1 == null) {
                fragment.p1 = false;
            }
            if (W(fragment)) {
                this.H = true;
            }
        }
        return fVarJ;
    }

    public final boolean a0() {
        return this.I || this.J;
    }

    public final void b(jxq jxqVar, vbc vbcVar, Fragment fragment) {
        w1r w1rVar;
        if (this.x != null) {
            jf4.n("Already attached");
            return;
        }
        this.x = jxqVar;
        this.y = vbcVar;
        this.z = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        if (fragment != null) {
            copyOnWriteArrayList.add(new o1r(fragment));
        } else if (jxqVar != null) {
            copyOnWriteArrayList.add(jxqVar);
        }
        if (this.z != null) {
            C0();
        }
        if (jxqVar != null) {
            jg60 jg60VarK = jxqVar.e.k();
            this.g = jg60VarK;
            jg60VarK.a(fragment != null ? fragment : jxqVar, this.j);
        }
        byte b = 0;
        if (fragment != null) {
            w1r w1rVar2 = fragment.v.P;
            HashMap map = w1rVar2.c;
            w1rVar = (w1r) map.get(fragment.f);
            if (w1rVar == null) {
                w1rVar = new w1r(w1rVar2.e);
                map.put(fragment.f, w1rVar);
            }
            this.P = w1rVar;
        } else if (jxqVar != null) {
            piu0 piu0VarG = jxqVar.e.g();
            vbf vbfVar = vbf.b;
            vbfVar.getClass();
            h0q0 h0q0Var = new h0q0(piu0VarG, w1r.h, vbfVar);
            sgy sgyVarB = sre0.f32672a.b(w1r.class);
            String strV = sgyVarB.v();
            if (strV == null) {
                jf4.o("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                w1rVar = (w1r) h0q0Var.t(sgyVarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strV));
                this.P = w1rVar;
            }
        } else {
            w1rVar = new w1r(false);
            this.P = w1rVar;
        }
        w1rVar.g = a0();
        this.c.e = this.P;
        jxq jxqVar2 = this.x;
        if (jxqVar2 != null && fragment == null) {
            kd30 kd30VarH = jxqVar2.h();
            kd30VarH.S("android:support:fragments", new ufd(this, (byte) 3));
            Bundle bundleH = kd30VarH.H("android:support:fragments");
            if (bundleH != null) {
                o0(bundleH);
            }
        }
        jxq jxqVar3 = this.x;
        if (jxqVar3 != null) {
            yfd yfdVar = jxqVar3.e.i;
            String strConcat = "FragmentManager:".concat(fragment != null ? axq.n(new StringBuilder(), fragment.f, Separators.COLON) : "");
            this.D = yfdVar.d(strConcat.concat("StartActivityForResult"), new xn((byte) 4), new c(this, (byte) 1));
            byte b2 = 2;
            this.E = yfdVar.d(strConcat.concat("StartIntentSenderForResult"), new xn((byte) 6), new c(this, b2));
            this.F = yfdVar.d(strConcat.concat("RequestPermissions"), new xn(b2), new c(this, b));
        }
        jxq jxqVar4 = this.x;
        if (jxqVar4 != null) {
            jxqVar4.i(this.r);
        }
        jxq jxqVar5 = this.x;
        if (jxqVar5 != null) {
            kxq kxqVar = jxqVar5.e;
            k1r k1rVar = this.s;
            k1rVar.getClass();
            kxqVar.k.add(k1rVar);
        }
        jxq jxqVar6 = this.x;
        if (jxqVar6 != null) {
            kxq kxqVar2 = jxqVar6.e;
            k1r k1rVar2 = this.t;
            k1rVar2.getClass();
            kxqVar2.m.add(k1rVar2);
        }
        jxq jxqVar7 = this.x;
        if (jxqVar7 != null) {
            kxq kxqVar3 = jxqVar7.e;
            k1r k1rVar3 = this.u;
            k1rVar3.getClass();
            kxqVar3.n.add(k1rVar3);
        }
        jxq jxqVar8 = this.x;
        if (jxqVar8 == null || fragment != null) {
            return;
        }
        kxq kxqVar4 = jxqVar8.e;
        l1r l1rVar = this.v;
        l1rVar.getClass();
        ywu ywuVar = kxqVar4.c;
        ((CopyOnWriteArrayList) ywuVar.c).add(l1rVar);
        ((Runnable) ywuVar.b).run();
    }

    public final void b0(int i, boolean z) {
        jxq jxqVar;
        if (this.x == null && i != -1) {
            jf4.n("No activity");
            return;
        }
        if (z || i != this.w) {
            this.w = i;
            pmi pmiVar = this.c;
            HashMap map = (HashMap) pmiVar.c;
            Iterator it = ((ArrayList) pmiVar.b).iterator();
            while (it.hasNext()) {
                f fVar = (f) map.get(((Fragment) it.next()).f);
                if (fVar != null) {
                    fVar.k();
                }
            }
            for (f fVar2 : map.values()) {
                if (fVar2 != null) {
                    fVar2.k();
                    Fragment fragment = fVar2.c;
                    if (fragment.m && !fragment.P()) {
                        if (fragment.o && !((HashMap) pmiVar.d).containsKey(fragment.f)) {
                            pmiVar.G(fVar2.o(), fragment.f);
                        }
                        pmiVar.D(fVar2);
                    }
                }
            }
            z0();
            if (this.H && (jxqVar = this.x) != null && this.w == 7) {
                jxqVar.e.invalidateOptionsMenu();
                this.H = false;
            }
        }
    }

    public final void c(Fragment fragment) {
        if (V(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.Z) {
            fragment.Z = false;
            if (fragment.l) {
                return;
            }
            this.c.f(fragment);
            if (V(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (W(fragment)) {
                this.H = true;
            }
        }
    }

    public final void c0() {
        if (this.x == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.g = false;
        for (Fragment fragment : this.c.p()) {
            if (fragment != null) {
                fragment.x.c0();
            }
        }
    }

    public final void d() {
        if (V(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.h);
        }
        zb5 zb5Var = this.h;
        if (zb5Var != null) {
            zb5Var.s = false;
            zb5Var.e();
            zb5 zb5Var2 = this.h;
            ccf ccfVar = new ccf((Object) this, (byte) 28);
            ArrayList arrayList = zb5Var2.q;
            if (arrayList == null) {
                arrayList = new ArrayList();
                zb5Var2.q = arrayList;
            }
            arrayList.add(ccfVar);
            this.h.f();
            this.i = true;
            F();
            this.i = false;
            this.h = null;
        }
    }

    public final void d0(FragmentContainerView fragmentContainerView) {
        View view;
        for (f fVar : this.c.m()) {
            Fragment fragment = fVar.c;
            if (fragment.A == fragmentContainerView.getId() && (view = fragment.l1) != null && view.getParent() == null) {
                fragment.k1 = fragmentContainerView;
                fVar.b();
                fVar.k();
            }
        }
    }

    public final void e() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    public final void e0(int i, int i2, boolean z) {
        if (i >= 0) {
            A(new t1r(this, null, i, i2), z);
        } else {
            jf4.o(twn.m(i, "Bad id: "));
        }
    }

    public final void f(String str) {
        this.m.remove(str);
        if (V(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public final void f0(int i, String str) {
        A(new t1r(this, str, -1, i), false);
    }

    public final void g(String str) {
        r1r r1rVar = (r1r) this.n.remove(str);
        if (r1rVar != null) {
            r1rVar.f29695a.f(r1rVar.c);
        }
        if (V(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key ".concat(str));
        }
    }

    public final boolean g0() {
        return h0(-1, 0);
    }

    public final HashSet h() {
        nxj nxjVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.m().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((f) it.next()).c.k1;
            if (viewGroup != null) {
                T().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof nxj) {
                    nxjVar = (nxj) tag;
                } else {
                    nxjVar = new nxj(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, nxjVar);
                }
                hashSet.add(nxjVar);
            }
        }
        return hashSet;
    }

    public final boolean h0(int i, int i2) {
        C(false);
        B(true);
        Fragment fragment = this.A;
        if (fragment != null && i < 0 && fragment.C().g0()) {
            return true;
        }
        boolean zI0 = i0(this.M, this.N, null, i, i2);
        if (zI0) {
            this.b = true;
            try {
                m0(this.M, this.N);
                e();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        C0();
        if (this.L) {
            this.L = false;
            z0();
        }
        ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        return zI0;
    }

    public final HashSet i(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((zb5) arrayList.get(i)).f44098a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((h6r) it.next()).b;
                if (fragment != null && (viewGroup = fragment.k1) != null) {
                    hashSet.add(nxj.i(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final boolean i0(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iG = G(str, i, (i2 & 1) != 0);
        if (iG < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iG; size--) {
            arrayList.add((zb5) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final f j(Fragment fragment) {
        String str = fragment.f;
        pmi pmiVar = this.c;
        f fVar = (f) ((HashMap) pmiVar.c).get(str);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this.p, pmiVar, fragment);
        fVar2.m(this.x.b.getClassLoader());
        fVar2.e = this.w;
        return fVar2;
    }

    public final void j0(Bundle bundle, Fragment fragment, String str) {
        if (fragment.v == this) {
            bundle.putString(str, fragment.f);
        } else {
            A0(new IllegalStateException(axq.k("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void k(Fragment fragment) {
        if (V(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.Z) {
            return;
        }
        fragment.Z = true;
        if (fragment.l) {
            if (V(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            pmi pmiVar = this.c;
            synchronized (((ArrayList) pmiVar.b)) {
                ((ArrayList) pmiVar.b).remove(fragment);
            }
            fragment.l = false;
            if (W(fragment)) {
                this.H = true;
            }
            x0(fragment);
        }
    }

    public final void k0(q1r q1rVar, boolean z) {
        fhj fhjVar = this.p;
        fhjVar.getClass();
        q1rVar.getClass();
        ((CopyOnWriteArrayList) fhjVar.b).add(new x0r(q1rVar, z));
    }

    public final void l(boolean z, Configuration configuration) {
        if (z && this.x != null) {
            A0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                if (z) {
                    fragment.x.l(true, configuration);
                }
            }
        }
    }

    public final void l0(Fragment fragment) {
        if (V(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.u);
        }
        boolean zP = fragment.P();
        if (fragment.Z && zP) {
            return;
        }
        pmi pmiVar = this.c;
        synchronized (((ArrayList) pmiVar.b)) {
            ((ArrayList) pmiVar.b).remove(fragment);
        }
        fragment.l = false;
        if (W(fragment)) {
            this.H = true;
        }
        fragment.m = true;
        x0(fragment);
    }

    public final boolean m() {
        if (this.w >= 1) {
            for (Fragment fragment : this.c.p()) {
                if (fragment != null) {
                    if (!fragment.Y ? fragment.x.m() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void m0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            jf4.n("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((zb5) arrayList.get(i)).p) {
                if (i2 != i) {
                    E(i2, i, arrayList, arrayList2);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((zb5) arrayList.get(i2)).p) {
                        i2++;
                    }
                }
                E(i, i2, arrayList, arrayList2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            E(i2, size, arrayList, arrayList2);
        }
    }

    public final boolean n() {
        if (this.w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.p()) {
            if (fragment != null && Y(fragment)) {
                if (fragment.Y ? false : (fragment.h1 && fragment.i1) | fragment.x.n()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                Fragment fragment2 = (Fragment) this.e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final boolean n0(ArrayList arrayList, ArrayList arrayList2, String str) {
        BackStackState backStackState = (BackStackState) this.l.remove(str);
        boolean z = false;
        if (backStackState == null) {
            return false;
        }
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zb5 zb5Var = (zb5) it.next();
            if (zb5Var.u) {
                Iterator it2 = zb5Var.f44098a.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = ((h6r) it2.next()).b;
                    if (fragment != null) {
                        map.put(fragment.f, fragment);
                    }
                }
            }
        }
        ArrayList<String> arrayList3 = backStackState.f45369a;
        HashMap map2 = new HashMap(arrayList3.size());
        for (String str2 : arrayList3) {
            Fragment fragment2 = (Fragment) map.get(str2);
            if (fragment2 != null) {
                map2.put(fragment2.f, fragment2);
            } else {
                Bundle bundleG = this.c.G(null, str2);
                if (bundleG != null) {
                    ClassLoader classLoader = this.x.b.getClassLoader();
                    Fragment fragmentA = ((FragmentState) bundleG.getParcelable(CommonConstant.ReqAccessTokenParam.STATE_LABEL)).a(S());
                    fragmentA.b = bundleG;
                    if (bundleG.getBundle("savedInstanceState") == null) {
                        fragmentA.b.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = bundleG.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    fragmentA.s0(bundle);
                    map2.put(fragmentA.f, fragmentA);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (BackStackRecordState backStackRecordState : backStackState.b) {
            ArrayList arrayList5 = backStackRecordState.b;
            zb5 zb5Var2 = new zb5(this);
            backStackRecordState.a(zb5Var2);
            for (int i = 0; i < arrayList5.size(); i++) {
                String str3 = (String) arrayList5.get(i);
                if (str3 != null) {
                    Fragment fragment3 = (Fragment) map2.get(str3);
                    if (fragment3 == null) {
                        jf4.n(ua80.m(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.f, " failed due to missing saved state for Fragment (", str3, Separators.RPAREN));
                        return false;
                    }
                    ((h6r) zb5Var2.f44098a.get(i)).b = fragment3;
                }
            }
            arrayList4.add(zb5Var2);
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            ((zb5) it3.next()).a(arrayList, arrayList2);
            z = true;
        }
        return z;
    }

    public final void o() {
        boolean zIsChangingConfigurations = true;
        this.K = true;
        C(true);
        z();
        jxq jxqVar = this.x;
        pmi pmiVar = this.c;
        if (jxqVar != null) {
            zIsChangingConfigurations = ((w1r) pmiVar.e).f;
        } else {
            Context context = jxqVar.b;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f45369a.iterator();
                while (it2.hasNext()) {
                    ((w1r) pmiVar.e).y((String) it2.next(), false);
                }
            }
        }
        x(-1);
        jxq jxqVar2 = this.x;
        if (jxqVar2 != null) {
            kxq kxqVar = jxqVar2.e;
            k1r k1rVar = this.s;
            k1rVar.getClass();
            kxqVar.k.remove(k1rVar);
        }
        jxq jxqVar3 = this.x;
        if (jxqVar3 != null) {
            jxqVar3.e(this.r);
        }
        jxq jxqVar4 = this.x;
        if (jxqVar4 != null) {
            kxq kxqVar2 = jxqVar4.e;
            k1r k1rVar2 = this.t;
            k1rVar2.getClass();
            kxqVar2.m.remove(k1rVar2);
        }
        jxq jxqVar5 = this.x;
        if (jxqVar5 != null) {
            kxq kxqVar3 = jxqVar5.e;
            k1r k1rVar3 = this.u;
            k1rVar3.getClass();
            kxqVar3.n.remove(k1rVar3);
        }
        jxq jxqVar6 = this.x;
        if (jxqVar6 != null && this.z == null) {
            kxq kxqVar4 = jxqVar6.e;
            l1r l1rVar = this.v;
            l1rVar.getClass();
            ywu ywuVar = kxqVar4.c;
            ((CopyOnWriteArrayList) ywuVar.c).remove(l1rVar);
            if (((HashMap) ywuVar.d).remove(l1rVar) == null) {
                ((Runnable) ywuVar.b).run();
            } else {
                hny.b();
            }
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.e();
            this.g = null;
        }
        go goVar = this.D;
        if (goVar != null) {
            goVar.b();
            this.E.b();
            this.F.b();
        }
    }

    public final void o0(Bundle bundle) {
        fhj fhjVar;
        f fVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.x.b.getClassLoader());
                this.m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.x.b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        pmi pmiVar = this.c;
        HashMap map2 = (HashMap) pmiVar.d;
        HashMap map3 = (HashMap) pmiVar.c;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable(CommonConstant.ReqAccessTokenParam.STATE_LABEL);
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        Iterator it = fragmentManagerState.f45374a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fhjVar = this.p;
            if (!zHasNext) {
                break;
            }
            Bundle bundleG = pmiVar.G(null, (String) it.next());
            if (bundleG != null) {
                Fragment fragment = (Fragment) this.P.b.get(((FragmentState) bundleG.getParcelable(CommonConstant.ReqAccessTokenParam.STATE_LABEL)).b);
                if (fragment != null) {
                    if (V(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    fVar = new f(fhjVar, pmiVar, fragment, bundleG);
                } else {
                    fVar = new f(this.p, this.c, this.x.b.getClassLoader(), S(), bundleG);
                }
                Fragment fragment2 = fVar.c;
                fragment2.b = bundleG;
                fragment2.v = this;
                if (V(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.f + "): " + fragment2);
                }
                fVar.m(this.x.b.getClassLoader());
                pmiVar.C(fVar);
                fVar.e = this.w;
            }
        }
        w1r w1rVar = this.P;
        w1rVar.getClass();
        for (Fragment fragment3 : new ArrayList(w1rVar.b.values())) {
            if (map3.get(fragment3.f) == null) {
                if (V(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f45374a);
                }
                this.P.A(fragment3);
                fragment3.v = this;
                f fVar2 = new f(fhjVar, pmiVar, fragment3);
                fVar2.e = 1;
                fVar2.k();
                fragment3.m = true;
                fVar2.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.b;
        ((ArrayList) pmiVar.b).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentJ = pmiVar.j(str3);
                if (fragmentJ == null) {
                    jf4.n(kng0.l("No instantiated fragment for (", str3, Separators.RPAREN));
                    return;
                }
                if (V(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentJ);
                }
                pmiVar.f(fragmentJ);
            }
        }
        if (fragmentManagerState.c != null) {
            this.d = new ArrayList(fragmentManagerState.c.length);
            int i = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
                if (i >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i];
                ArrayList arrayList2 = backStackRecordState.b;
                zb5 zb5Var = new zb5(this);
                backStackRecordState.a(zb5Var);
                zb5Var.t = backStackRecordState.g;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    String str4 = (String) arrayList2.get(i2);
                    if (str4 != null) {
                        ((h6r) zb5Var.f44098a.get(i2)).b = pmiVar.j(str4);
                    }
                }
                zb5Var.d(1);
                if (V(2)) {
                    StringBuilder sbM = b1j.m(i, "restoreAllState: back stack #", " (index ");
                    sbM.append(zb5Var.t);
                    sbM.append("): ");
                    sbM.append(zb5Var);
                    Log.v("FragmentManager", sbM.toString());
                    PrintWriter printWriter = new PrintWriter(new sv00());
                    zb5Var.l("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(zb5Var);
                i++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.k.set(fragmentManagerState.d);
        String str5 = fragmentManagerState.e;
        if (str5 != null) {
            Fragment fragmentJ2 = pmiVar.j(str5);
            this.A = fragmentJ2;
            u(fragmentJ2);
        }
        ArrayList arrayList3 = fragmentManagerState.f;
        if (arrayList3 != null) {
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                this.l.put((String) arrayList3.get(i3), (BackStackState) fragmentManagerState.g.get(i3));
            }
        }
        this.G = new ArrayDeque(fragmentManagerState.h);
    }

    public final void p(boolean z) {
        if (z && this.x != null) {
            A0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null) {
                fragment.j1 = true;
                if (z) {
                    fragment.x.p(true);
                }
            }
        }
    }

    public final Bundle p0() {
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        M();
        z();
        C(true);
        this.I = true;
        this.P.g = true;
        pmi pmiVar = this.c;
        pmiVar.getClass();
        HashMap map = (HashMap) pmiVar.c;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (f fVar : map.values()) {
            if (fVar != null) {
                Fragment fragment = fVar.c;
                pmiVar.G(fVar.o(), fragment.f);
                arrayList2.add(fragment.f);
                if (V(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.b);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.d;
        if (!map2.isEmpty()) {
            pmi pmiVar2 = this.c;
            synchronized (((ArrayList) pmiVar2.b)) {
                try {
                    if (((ArrayList) pmiVar2.b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) pmiVar2.b).size());
                        for (Fragment fragment2 : (ArrayList) pmiVar2.b) {
                            arrayList.add(fragment2.f);
                            if (V(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.f + "): " + fragment2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((zb5) this.d.get(i));
                    if (V(2)) {
                        StringBuilder sbM = b1j.m(i, "saveAllState: adding back stack #", ": ");
                        sbM.append(this.d.get(i));
                        Log.v("FragmentManager", sbM.toString());
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.e = null;
            ArrayList arrayList3 = new ArrayList();
            fragmentManagerState.f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            fragmentManagerState.g = arrayList4;
            fragmentManagerState.f45374a = arrayList2;
            fragmentManagerState.b = arrayList;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.k.get();
            Fragment fragment3 = this.A;
            if (fragment3 != null) {
                fragmentManagerState.e = fragment3.f;
            }
            arrayList3.addAll(this.l.keySet());
            arrayList4.addAll(this.l.values());
            fragmentManagerState.h = new ArrayList(this.G);
            bundle.putParcelable(CommonConstant.ReqAccessTokenParam.STATE_LABEL, fragmentManagerState);
            for (String str : this.m.keySet()) {
                bundle.putBundle(kng0.k("result_", str), (Bundle) this.m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(kng0.k("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (V(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void q(boolean z) {
        if (z && this.x != null) {
            A0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null && z) {
                fragment.x.q(true);
            }
        }
    }

    public final Fragment.SavedState q0(Fragment fragment) {
        Fragment fragment2;
        f fVar = (f) ((HashMap) this.c.c).get(fragment.f);
        if (fVar == null || (fragment2 = fVar.c) != fragment) {
            A0(new IllegalStateException(axq.k("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
        if (fragment2.f45370a > -1) {
            return new Fragment.SavedState(fVar.o());
        }
        return null;
    }

    public final void r() {
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.O();
                fragment.c0();
                fragment.x.r();
            }
        }
    }

    public final void r0() {
        synchronized (this.f45379a) {
            try {
                if (this.f45379a.size() == 1) {
                    this.x.c.removeCallbacks(this.Q);
                    this.x.c.post(this.Q);
                    C0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s() {
        if (this.w >= 1) {
            for (Fragment fragment : this.c.p()) {
                if (fragment != null) {
                    if (!fragment.Y ? fragment.x.s() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void s0(Fragment fragment, boolean z) {
        ViewGroup viewGroupR = R(fragment);
        if (viewGroupR == null || !(viewGroupR instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupR).setDrawDisappearingViewsLast(!z);
    }

    public final void t() {
        if (this.w < 1) {
            return;
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null && !fragment.Y) {
                fragment.x.t();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final void t0(Bundle bundle, String str) {
        r1r r1rVar = (r1r) this.n.get(str);
        if (r1rVar != null) {
            if (r1rVar.f29695a.i.compareTo(lkz.d) >= 0) {
                r1rVar.i(bundle, str);
            } else {
                this.m.put(str, bundle);
            }
        } else {
            this.m.put(str, bundle);
        }
        if (V(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.z;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.z)));
            sb.append("}");
        } else {
            jxq jxqVar = this.x;
            if (jxqVar != null) {
                sb.append(jxqVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(Fragment fragment) {
        if (fragment != null) {
            if (fragment != this.c.j(fragment.f)) {
                return;
            }
            fragment.v.getClass();
            boolean Z = Z(fragment);
            Boolean bool = fragment.k;
            if (bool == null || bool.booleanValue() != Z) {
                fragment.k = Boolean.valueOf(Z);
                v1r v1rVar = fragment.x;
                v1rVar.C0();
                v1rVar.u(v1rVar.A);
            }
        }
    }

    public final void u0(String str, clz clzVar, k4r k4rVar) {
        glz glzVarX = clzVar.x();
        if (glzVarX.i == lkz.f20223a) {
            return;
        }
        n1r n1rVar = new n1r(this, str, k4rVar, glzVarX);
        r1r r1rVar = (r1r) this.n.put(str, new r1r(glzVarX, k4rVar, n1rVar));
        if (r1rVar != null) {
            r1rVar.f29695a.f(r1rVar.c);
        }
        if (V(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + glzVarX + " and listener " + k4rVar);
        }
        glzVarX.a(n1rVar);
    }

    public final void v(boolean z) {
        if (z && this.x != null) {
            A0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.p()) {
            if (fragment != null && z) {
                fragment.x.v(true);
            }
        }
    }

    public final void v0(Fragment fragment, lkz lkzVar) {
        if (fragment == this.c.j(fragment.f) && (fragment.w == null || fragment.v == this)) {
            fragment.t1 = lkzVar;
        } else {
            itt0.l("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final boolean w() {
        if (this.w < 1) {
            return false;
        }
        boolean z = false;
        for (Fragment fragment : this.c.p()) {
            if (fragment != null && Y(fragment)) {
                if (fragment.Y ? false : fragment.x.w() | (fragment.h1 && fragment.i1)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void w0(Fragment fragment) {
        if (fragment != null) {
            if (fragment != this.c.j(fragment.f) || (fragment.w != null && fragment.v != this)) {
                itt0.l("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.A;
        this.A = fragment;
        u(fragment2);
        u(this.A);
    }

    public final void x(int i) {
        try {
            this.b = true;
            for (f fVar : ((HashMap) this.c.c).values()) {
                if (fVar != null) {
                    fVar.e = i;
                }
            }
            b0(i, false);
            Iterator it = h().iterator();
            while (it.hasNext()) {
                ((nxj) it.next()).h();
            }
            this.b = false;
            C(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void x0(Fragment fragment) {
        ViewGroup viewGroupR = R(fragment);
        if (viewGroupR != null) {
            cxq cxqVar = fragment.o1;
            if ((cxqVar == null ? 0 : cxqVar.e) + (cxqVar == null ? 0 : cxqVar.d) + (cxqVar == null ? 0 : cxqVar.c) + (cxqVar == null ? 0 : cxqVar.b) > 0) {
                if (viewGroupR.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupR.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                Fragment fragment2 = (Fragment) viewGroupR.getTag(R.id.visible_removing_fragment_view_tag);
                cxq cxqVar2 = fragment.o1;
                boolean z = cxqVar2 != null ? cxqVar2.f5134a : false;
                if (fragment2.o1 == null) {
                    return;
                }
                fragment2.A().f5134a = z;
            }
        }
    }

    public final void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strN = ohs0.n(str, "    ");
        pmi pmiVar = this.c;
        ArrayList arrayList = (ArrayList) pmiVar.b;
        String strN2 = ohs0.n(str, "    ");
        HashMap map = (HashMap) pmiVar.c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (f fVar : map.values()) {
                printWriter.print(str);
                if (fVar != null) {
                    Fragment fragment = fVar.c;
                    printWriter.println(fragment);
                    fragment.z(strN2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment3 = (Fragment) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                zb5 zb5Var = (zb5) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(zb5Var.toString());
                zb5Var.l(strN, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.f45379a) {
            try {
                int size4 = this.f45379a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (s1r) this.f45379a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void z() {
        Iterator it = h().iterator();
        while (it.hasNext()) {
            ((nxj) it.next()).h();
        }
    }

    public final void z0() {
        for (f fVar : this.c.m()) {
            Fragment fragment = fVar.c;
            if (fragment.m1) {
                if (this.b) {
                    this.L = true;
                } else {
                    fragment.m1 = false;
                    fVar.k();
                }
            }
        }
    }
}
