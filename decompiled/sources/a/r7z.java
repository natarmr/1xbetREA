package a;

import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r7z implements zjd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7z f30000a;
    public nld b;
    public e5n0 c;
    public int d;
    public int e;
    public final hz40 f;
    public final hz40 g;
    public final m7z h;
    public final j7z i;
    public final hz40 j;
    public final d5n0 k;
    public final hz40 l;
    public final xz40 m;
    public int n;
    public int o;
    public final String p;

    public r7z(e7z e7zVar, e5n0 e5n0Var) {
        this.f30000a = e7zVar;
        this.c = e5n0Var;
        long[] jArr = u1h0.f34903a;
        this.f = new hz40();
        this.g = new hz40();
        this.h = new m7z(this);
        this.i = new j7z(this);
        this.j = new hz40();
        this.k = new d5n0();
        this.l = new hz40();
        this.m = new xz40(new Object[16]);
        this.p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void c(k7z k7zVar) {
        iz40 iz40Var;
        h390 h390Var = k7zVar.f;
        if (h390Var != null) {
            h390Var.h.set(j390.b);
            pwi pwiVar = h390Var.k;
            if (((iz40) pwiVar.c).h()) {
                iz40Var = (iz40) pwiVar.c;
                iz40 iz40Var2 = v1h0.f36630a;
                pwiVar.c = new iz40();
                ((xz40) pwiVar.f).g();
            } else {
                iz40Var = null;
            }
            pwiVar.d();
            tld tldVar = h390Var.f12373a;
            tldVar.q = null;
            if (iz40Var != null) {
                tldVar.u.k = iz40Var;
                tldVar.w = (byte) 2;
            }
            k7zVar.f = null;
            tld tldVar2 = k7zVar.c;
            if (tldVar2 != null) {
                tldVar2.a();
            }
            k7zVar.c = null;
        }
    }

    @Override // a.zjd
    public final void a() {
        j(true);
    }

    public final void b(k7z k7zVar, boolean z) {
        h390 h390Var = k7zVar.f;
        if (h390Var != null) {
            rfk0 rfk0VarJ = vdx.J();
            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            try {
                e7z e7zVar = this.f30000a;
                e7zVar.r = true;
                if (z) {
                    while (!h390Var.c()) {
                        try {
                            h390Var.e(new hny((byte) 3));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                h390Var.a();
                k7zVar.f = null;
                e7zVar.r = false;
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            } catch (Throwable th2) {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                throw th2;
            }
        }
    }

    public final a5n0 d(Object obj) {
        return !this.f30000a.I() ? new p7z() : new q7z(this, obj);
    }

    @Override // a.zjd
    public final void e() {
        j(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // a.zjd
    public final void f() {
        tld tldVar;
        e7z e7zVar = this.f30000a;
        e7zVar.r = true;
        hz40 hz40Var = this.f;
        Object[] objArr = hz40Var.c;
        long[] jArr = hz40Var.f13891a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (tldVar = ((k7z) objArr[(i << 3) + i3]).c) != null) {
                            tldVar.a();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        e7zVar.Q();
        e7zVar.r = false;
        hz40Var.a();
        this.g.a();
        this.o = 0;
        this.n = 0;
        this.j.a();
        i();
    }

    public final void g(int i) {
        boolean z;
        boolean z2 = false;
        this.n = 0;
        List listP = this.f30000a.p();
        ty40 ty40Var = (ty40) listP;
        int i2 = (((xz40) ty40Var.b).c - this.o) - 1;
        if (i <= i2) {
            this.k.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.f.g((e7z) ty40Var.get(i3));
                    objG.getClass();
                    ((xy40) this.k.b).a(((k7z) objG).f17847a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.f(this.k);
            rfk0 rfk0VarJ = vdx.J();
            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            z = false;
            while (i2 >= i) {
                try {
                    e7z e7zVar = (e7z) ((ty40) listP).get(i2);
                    Object objG2 = this.f.g(e7zVar);
                    objG2.getClass();
                    k7z k7zVar = (k7z) objG2;
                    Object obj = k7zVar.f17847a;
                    if (((xy40) this.k.b).c(obj)) {
                        this.n++;
                        if (((Boolean) ((hgk0) k7zVar.g).getValue()).booleanValue()) {
                            i7z i7zVar = e7zVar.i1;
                            sj30 sj30Var = i7zVar.p;
                            c7z c7zVar = c7z.c;
                            sj30Var.l = c7zVar;
                            i810 i810Var = i7zVar.q;
                            if (i810Var != null) {
                                i810Var.j = c7zVar;
                            }
                            m(k7zVar, false);
                            if (k7zVar.h) {
                                z = true;
                            }
                        }
                    } else {
                        e7z e7zVar2 = this.f30000a;
                        e7zVar2.r = true;
                        this.f.l(e7zVar);
                        tld tldVar = k7zVar.c;
                        if (tldVar != null) {
                            tldVar.a();
                        }
                        this.f30000a.R(i2, 1);
                        e7zVar2.r = false;
                    }
                    this.g.l(obj);
                    i2--;
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    throw th;
                }
            }
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
        } else {
            z = false;
        }
        if (z) {
            synchronized (xfk0.c) {
                iz40 iz40Var = xfk0.j.h;
                if (iz40Var != null && iz40Var.h()) {
                    z2 = true;
                }
            }
            if (z2) {
                xfk0.c();
            }
        }
        i();
    }

    public final void h(Object obj) {
        i();
        e7z e7zVar = (e7z) this.j.l(obj);
        e7z e7zVar2 = this.f30000a;
        if (e7zVar != null) {
            if (this.o <= 0) {
                xcx.b("No pre-composed items to dispose");
            }
            int i = ((xz40) ((ty40) e7zVar2.p()).b).i(e7zVar);
            if (i < ((xz40) ((ty40) e7zVar2.p()).b).c - this.o) {
                xcx.b("Item is not in pre-composed item range");
            }
            this.n++;
            this.o--;
            k7z k7zVar = (k7z) this.f.g(e7zVar);
            if (k7zVar != null) {
                c(k7zVar);
            }
            int i2 = (((xz40) ((ty40) e7zVar2.p()).b).c - this.o) - this.n;
            k(i, i2);
            g(i2);
        }
        if (this.m.h(obj)) {
            e7z.W(e7zVar2, true, 6);
        }
    }

    public final void i() {
        int i = ((xz40) ((ty40) this.f30000a.p()).b).c;
        int i2 = this.f.e;
        if (i2 != i) {
            xcx.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.n;
        int i4 = this.o;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbT = dw9.t("Incorrect state. Total children ", i, ". Reusable children ", ". Precomposed children ", i3);
            sbT.append(i4);
            xcx.a(sbT.toString());
        }
        int i5 = this.j.e;
        int i6 = this.o;
        if (i5 == i6) {
            return;
        }
        xcx.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void j(boolean z) {
        this.o = 0;
        this.j.a();
        List listP = this.f30000a.p();
        int i = ((xz40) ((ty40) listP).b).c;
        if (this.n != i) {
            this.n = i;
            rfk0 rfk0VarJ = vdx.J();
            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    e7z e7zVar = (e7z) ((ty40) listP).get(i2);
                    k7z k7zVar = (k7z) this.f.g(e7zVar);
                    if (k7zVar != null && ((Boolean) ((hgk0) k7zVar.g).getValue()).booleanValue()) {
                        i7z i7zVar = e7zVar.i1;
                        sj30 sj30Var = i7zVar.p;
                        c7z c7zVar = c7z.c;
                        sj30Var.l = c7zVar;
                        i810 i810Var = i7zVar.q;
                        if (i810Var != null) {
                            i810Var.j = c7zVar;
                        }
                        m(k7zVar, z);
                        k7zVar.f17847a = x4n0.f40275a;
                    }
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    throw th;
                }
            }
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            this.g.a();
        }
        i();
    }

    public final void k(int i, int i2) {
        e7z e7zVar = this.f30000a;
        e7zVar.r = true;
        e7zVar.M(i, i2, 1);
        e7zVar.r = false;
    }

    public final void l(Object obj, Function2 function2, boolean z) {
        e7z e7zVar = this.f30000a;
        if (e7zVar.I()) {
            i();
            if (this.g.c(obj)) {
                return;
            }
            this.l.l(obj);
            hz40 hz40Var = this.j;
            Object objG = hz40Var.g(obj);
            if (objG == null) {
                objG = o(obj);
                if (objG != null) {
                    k(((xz40) ((ty40) e7zVar.p()).b).i(objG), ((xz40) ((ty40) e7zVar.p()).b).c);
                    this.o++;
                } else {
                    int i = ((xz40) ((ty40) e7zVar.p()).b).c;
                    e7z e7zVar2 = new e7z(2);
                    e7zVar.r = true;
                    e7zVar.C(i, e7zVar2);
                    e7zVar.r = false;
                    this.o++;
                    objG = e7zVar2;
                }
                hz40Var.n(obj, objG);
            }
            n((e7z) objG, obj, z, function2);
        }
    }

    public final void m(k7z k7zVar, boolean z) {
        tld tldVar;
        if (z || !k7zVar.h) {
            k7zVar.g = androidx.compose.runtime.e.e(Boolean.FALSE);
        } else {
            ((hgk0) k7zVar.g).setValue(Boolean.FALSE);
        }
        if (k7zVar.f != null) {
            c(k7zVar);
            return;
        }
        if (z) {
            tld tldVar2 = k7zVar.c;
            if (tldVar2 != null) {
                tldVar2.r();
                return;
            }
            return;
        }
        nd80 outOfFrameExecutor = h7z.a(this.f30000a).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            ((AndroidComposeView) outOfFrameExecutor).F(new y2x(k7zVar, (byte) 28));
        } else {
            if (k7zVar.h || (tldVar = k7zVar.c) == null) {
                return;
            }
            tldVar.r();
        }
    }

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
    public final void n(e7z e7zVar, Object obj, boolean z, Function2 function2) {
        boolean z2;
        tld tldVar;
        hz40 hz40Var = this.f;
        Object objG = hz40Var.g(e7zVar);
        Object obj2 = objG;
        if (objG == null) {
            ugd ugdVar = j120.f;
            k7z k7zVar = new k7z();
            k7zVar.f17847a = obj;
            k7zVar.b = ugdVar;
            k7zVar.c = null;
            k7zVar.g = androidx.compose.runtime.e.e(Boolean.TRUE);
            hz40Var.n(e7zVar, k7zVar);
            obj2 = k7zVar;
        }
        k7z k7zVar2 = (k7z) obj2;
        boolean z3 = k7zVar2.b != function2;
        if (k7zVar2.f != null) {
            if (z3) {
                c(k7zVar2);
            } else if (z) {
                return;
            } else {
                b(k7zVar2, true);
            }
        }
        tld tldVar2 = k7zVar2.c;
        if (tldVar2 != null) {
            synchronized (tldVar2.d) {
                z2 = tldVar2.n.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || k7zVar2.d) {
            k7zVar2.b = function2;
            if (k7zVar2.f != null) {
                xcx.a("new subcompose call while paused composition is still active");
            }
            rfk0 rfk0VarJ = vdx.J();
            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            try {
                e7z e7zVar2 = this.f30000a;
                e7zVar2.r = true;
                tld tldVar3 = k7zVar2.c;
                nld nldVar = this.b;
                if (nldVar == null) {
                    xcx.c("parent composition reference not set");
                    throw new rsy();
                }
                if (tldVar3 == null || tldVar3.c()) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = frv0.f10038a;
                        tldVar = new tld(nldVar, new m6t0(e7zVar));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = frv0.f10038a;
                        tldVar = new tld(nldVar, new m6t0(e7zVar));
                    }
                    tldVar3 = tldVar;
                }
                k7zVar2.c = tldVar3;
                Function2 ugdVar2 = k7zVar2.b;
                if (h7z.a(this.f30000a).getOutOfFrameExecutor() != null) {
                    k7zVar2.h = false;
                } else {
                    k7zVar2.h = true;
                    ugdVar2 = new ugd(1524156494, true, new r7y(k7zVar2, ugdVar2, (byte) 7));
                }
                if (z) {
                    if (k7zVar2.e) {
                        tldVar3.o();
                        tldVar3.v();
                        k7zVar2.f = tldVar3.q(true, ugdVar2);
                    } else {
                        k7zVar2.f = tldVar3.q(tldVar3.o(), ugdVar2);
                    }
                } else if (k7zVar2.e) {
                    tldVar3.o();
                    tldVar3.v();
                    fet fetVar = tldVar3.v;
                    fetVar.z = 0;
                    fetVar.y = true;
                    tldVar3.x = ugdVar2;
                    tldVar3.f34137a.a(tldVar3, ugdVar2);
                    if (fetVar.F || fetVar.z != 0) {
                        dsb0.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    fetVar.z = -1;
                    fetVar.y = false;
                } else {
                    tldVar3.d(ugdVar2);
                }
                k7zVar2.e = false;
                e7zVar2.r = false;
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                k7zVar2.d = false;
            } catch (Throwable th) {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                throw th;
            }
        }
    }

    public final e7z o(Object obj) {
        hz40 hz40Var;
        int i;
        if (this.n == 0) {
            return null;
        }
        ty40 ty40Var = (ty40) this.f30000a.p();
        int i2 = ((xz40) ty40Var.b).c - this.o;
        int i3 = i2 - this.n;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            hz40Var = this.f;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = hz40Var.g((e7z) ty40Var.get(i5));
            objG.getClass();
            if (Intrinsics.d(((k7z) objG).f17847a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objG2 = hz40Var.g((e7z) ty40Var.get(i4));
                objG2.getClass();
                k7z k7zVar = (k7z) objG2;
                Object obj2 = k7zVar.f17847a;
                if (obj2 == x4n0.f40275a || this.c.h0(obj, obj2)) {
                    k7zVar.f17847a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            k(i5, i3);
        }
        this.n--;
        e7z e7zVar = (e7z) ty40Var.get(i3);
        Object objG3 = hz40Var.g(e7zVar);
        objG3.getClass();
        k7z k7zVar2 = (k7z) objG3;
        k7zVar2.g = androidx.compose.runtime.e.e(Boolean.TRUE);
        k7zVar2.e = true;
        k7zVar2.d = true;
        return e7zVar;
    }
}
