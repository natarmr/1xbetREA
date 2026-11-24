package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zb5 implements s1r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44098a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public boolean p;
    public ArrayList q;
    public final androidx.fragment.app.e r;
    public boolean s;
    public int t;
    public boolean u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zb5(zb5 zb5Var) {
        this();
        zb5Var.r.S();
        jxq jxqVar = zb5Var.r.x;
        if (jxqVar != null) {
            jxqVar.b.getClassLoader();
        }
        for (h6r h6rVar : zb5Var.f44098a) {
            ArrayList arrayList = this.f44098a;
            h6r h6rVar2 = new h6r();
            h6rVar2.f12542a = h6rVar.f12542a;
            h6rVar2.b = h6rVar.b;
            h6rVar2.c = h6rVar.c;
            h6rVar2.d = h6rVar.d;
            h6rVar2.e = h6rVar.e;
            h6rVar2.f = h6rVar.f;
            h6rVar2.g = h6rVar.g;
            h6rVar2.h = h6rVar.h;
            h6rVar2.i = h6rVar.i;
            arrayList.add(h6rVar2);
        }
        this.b = zb5Var.b;
        this.c = zb5Var.c;
        this.d = zb5Var.d;
        this.e = zb5Var.e;
        this.f = zb5Var.f;
        this.g = zb5Var.g;
        this.h = zb5Var.h;
        this.i = zb5Var.i;
        this.l = zb5Var.l;
        this.m = zb5Var.m;
        this.j = zb5Var.j;
        this.k = zb5Var.k;
        if (zb5Var.n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.n = arrayList2;
            arrayList2.addAll(zb5Var.n);
        }
        if (zb5Var.o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.o = arrayList3;
            arrayList3.addAll(zb5Var.o);
        }
        this.p = zb5Var.p;
        this.t = -1;
        this.u = false;
        this.r = zb5Var.r;
        this.s = zb5Var.s;
        this.t = zb5Var.t;
        this.u = zb5Var.u;
    }

    @Override // a.s1r
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.r.d.add(this);
        return true;
    }

    public final void b(h6r h6rVar) {
        this.f44098a.add(h6rVar);
        h6rVar.d = this.b;
        h6rVar.e = this.c;
        h6rVar.f = this.d;
        h6rVar.g = this.e;
    }

    public final void c(String str) {
        if (!this.h) {
            jf4.n("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.g = true;
            this.i = str;
        }
    }

    public final void d(int i) {
        if (this.g) {
            if (androidx.fragment.app.e.V(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f44098a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                h6r h6rVar = (h6r) arrayList.get(i2);
                Fragment fragment = h6rVar.b;
                if (fragment != null) {
                    fragment.u += i;
                    if (androidx.fragment.app.e.V(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + h6rVar.b + " to " + h6rVar.b.u);
                    }
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f44098a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            h6r h6rVar = (h6r) arrayList.get(size);
            if (h6rVar.c) {
                if (h6rVar.f12542a == 8) {
                    h6rVar.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = h6rVar.b.A;
                    h6rVar.f12542a = 2;
                    h6rVar.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        h6r h6rVar2 = (h6r) arrayList.get(i2);
                        if (h6rVar2.c && h6rVar2.b.A == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void f() {
        g(false, true);
    }

    public final int g(boolean z, boolean z2) {
        if (this.s) {
            jf4.n("commit already called");
            return 0;
        }
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new sv00());
            l("  ", printWriter, true);
            printWriter.close();
        }
        this.s = true;
        boolean z3 = this.g;
        androidx.fragment.app.e eVar = this.r;
        if (z3) {
            this.t = eVar.k.getAndIncrement();
        } else {
            this.t = -1;
        }
        if (z2) {
            eVar.A(this, z);
        }
        return this.t;
    }

    public final void h() {
        if (this.g) {
            jf4.n("This transaction is already being added to the back stack");
        } else {
            this.h = false;
            this.r.D(this, false);
        }
    }

    public final void i() {
        if (this.g) {
            jf4.n("This transaction is already being added to the back stack");
        } else {
            this.h = false;
            this.r.D(this, true);
        }
    }

    public final void j(Fragment fragment) {
        androidx.fragment.app.e eVar = fragment.v;
        if (eVar == null || eVar == this.r) {
            b(new h6r(6, fragment));
        } else {
            jf4.i(fragment, "Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    public final void k(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.s1;
        if (str2 != null) {
            k5r.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.B;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                jf4.n(rw2.o(sb, fragment.B, " now ", str));
                return;
            }
            fragment.B = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.z;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                int i4 = fragment.z;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.z = i;
            fragment.A = i;
        }
        b(new h6r(i2, fragment));
        fragment.v = this.r;
    }

    public final void l(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.f44098a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            h6r h6rVar = (h6r) arrayList.get(i);
            switch (h6rVar.f12542a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + h6rVar.f12542a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(Separators.SP);
            printWriter.println(h6rVar.b);
            if (z) {
                if (h6rVar.d != 0 || h6rVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(h6rVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(h6rVar.e));
                }
                if (h6rVar.f != 0 || h6rVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(h6rVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(h6rVar.g));
                }
            }
        }
    }

    public final void m(Fragment fragment) {
        androidx.fragment.app.e eVar = fragment.v;
        if (eVar == null || eVar == this.r) {
            b(new h6r(4, fragment));
        } else {
            jf4.i(fragment, "Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    public final void n(Fragment fragment) {
        androidx.fragment.app.e eVar = fragment.v;
        if (eVar == null || eVar == this.r) {
            b(new h6r(3, fragment));
        } else {
            jf4.i(fragment, "Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    public final void o(int i, Fragment fragment, String str) {
        if (i != 0) {
            k(i, fragment, str, 2);
        } else {
            jf4.o("Must use non-zero containerViewId");
        }
    }

    public final void p(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final void q(Fragment fragment, lkz lkzVar) {
        androidx.fragment.app.e eVar = fragment.v;
        androidx.fragment.app.e eVar2 = this.r;
        if (eVar != eVar2) {
            e9d0.i(eVar2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return;
        }
        if (lkzVar == lkz.b && fragment.f45370a > -1) {
            ohq.q(lkzVar, " after the Fragment has been created", "Cannot set maximum Lifecycle to ");
            return;
        }
        if (lkzVar == lkz.f20223a) {
            ohq.q(lkzVar, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.", "Cannot set maximum Lifecycle to ");
            return;
        }
        h6r h6rVar = new h6r();
        h6rVar.f12542a = 10;
        h6rVar.b = fragment;
        h6rVar.c = false;
        h6rVar.h = fragment.t1;
        h6rVar.i = lkzVar;
        b(h6rVar);
    }

    public final void r(Fragment fragment) {
        androidx.fragment.app.e eVar = fragment.v;
        if (eVar == null || eVar == this.r) {
            b(new h6r(5, fragment));
        } else {
            jf4.i(fragment, "Cannot show Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(Separators.SP);
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zb5(androidx.fragment.app.e eVar) {
        this();
        eVar.S();
        jxq jxqVar = eVar.x;
        if (jxqVar != null) {
            jxqVar.b.getClassLoader();
        }
        this.t = -1;
        this.u = false;
        this.r = eVar;
    }

    public zb5() {
        this.f44098a = new ArrayList();
        this.h = true;
        this.p = false;
    }
}
