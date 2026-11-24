package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class e0d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vjj f6984a;
    public gm40 b;
    public tek c;
    public int e;
    public final c8z h;
    public final g950 i;
    public final wsy j;
    public final /* synthetic */ f0d0 k;
    public d0d0 d = null;
    public vzs0 f = vzs0.f38313a;
    public boolean g = true;

    public e0d0(f0d0 f0d0Var) {
        this.k = f0d0Var;
        this.f6984a = f0d0Var.j();
        this.b = f0d0Var.m();
        this.c = f0d0Var.getVisibility();
        this.e = f0d0Var.l();
        this.h = f0d0Var.u;
        this.i = f0d0Var.getName();
        this.j = f0d0Var.getType();
    }

    public final f0d0 a() {
        c8z c8zVar;
        c8z c8zVar2;
        g0d0 g0d0Var;
        n0d0 n0d0Var;
        xzs0 xzs0Var;
        Function0 function0;
        c8z c8zVar3;
        c8z c8zVar4;
        vjj vjjVar = this.f6984a;
        gm40 gm40Var = this.b;
        tek tekVar = this.c;
        d0d0 d0d0Var = this.d;
        int i = this.e;
        g950 g950Var = this.i;
        f0d0 f0d0Var = this.k;
        f0d0 f0d0VarR1 = f0d0Var.r1(vjjVar, gm40Var, tekVar, d0d0Var, i, g950Var);
        List typeParameters = f0d0Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        xzs0 xzs0VarK0 = vdb.k0(typeParameters, this.f, f0d0VarR1, arrayList);
        t3u0 t3u0Var = t3u0.e;
        wsy wsyVar = this.j;
        wsy wsyVarH = xzs0VarK0.h(wsyVar, t3u0Var);
        if (wsyVarH != null) {
            t3u0 t3u0Var2 = t3u0.d;
            wsy wsyVarH2 = xzs0VarK0.h(wsyVar, t3u0Var2);
            if (wsyVarH2 != null) {
                f0d0VarR1.v1(wsyVarH2);
            }
            c8z c8zVar5 = this.h;
            if (c8zVar5 != null) {
                c8z c8zVarF = c8zVar5.f(xzs0VarK0);
                c8zVar = c8zVarF != null ? c8zVarF : null;
            }
            c8z c8zVar6 = f0d0Var.v;
            if (c8zVar6 != null) {
                wsy wsyVarH3 = xzs0VarK0.h(c8zVar6.getType(), t3u0Var2);
                if (wsyVarH3 == null) {
                    c8zVar4 = null;
                } else {
                    c8zVar6.p1();
                    c8zVar4 = new c8z(f0d0VarR1, new lso(f0d0VarR1, wsyVarH3), c8zVar6.getAnnotations());
                }
                c8zVar2 = c8zVar4;
            } else {
                c8zVar2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (c8z c8zVar7 : f0d0Var.t) {
                wsy wsyVarH4 = xzs0VarK0.h(c8zVar7.getType(), t3u0.d);
                if (wsyVarH4 == null) {
                    c8zVar3 = null;
                } else {
                    g950 g950VarN1 = ((mje) c8zVar7.p1()).n1();
                    c8zVar7.p1();
                    c8zVar3 = new c8z(f0d0VarR1, new mje(f0d0VarR1, wsyVarH4, g950VarN1), c8zVar7.getAnnotations());
                }
                if (c8zVar3 != null) {
                    arrayList2.add(c8zVar3);
                }
            }
            f0d0VarR1.w1(wsyVarH, arrayList, c8zVar, c8zVar2, arrayList2);
            g0d0 g0d0Var2 = f0d0Var.x;
            gne0 gne0Var = gmk0.x0;
            if (g0d0Var2 == null) {
                g0d0Var = null;
            } else {
                g93 annotations = g0d0Var2.getAnnotations();
                gm40 gm40Var2 = this.b;
                tek visibility = f0d0Var.x.getVisibility();
                if (this.e == 2 && uek.e(uek.f(visibility.f33825a.m()))) {
                    visibility = uek.h;
                }
                tek tekVar2 = visibility;
                g0d0 g0d0Var3 = f0d0Var.x;
                boolean z = g0d0Var3.f;
                boolean z2 = g0d0Var3.g;
                boolean z3 = g0d0Var3.j;
                int i2 = this.e;
                d0d0 d0d0Var2 = this.d;
                g0d0Var = new g0d0(f0d0VarR1, annotations, gm40Var2, tekVar2, z, z2, z3, i2, d0d0Var2 == null ? null : d0d0Var2.d(), gne0Var);
            }
            if (g0d0Var != null) {
                g0d0 g0d0Var4 = f0d0Var.x;
                wsy wsyVar2 = g0d0Var4.n;
                g0d0Var.m = f0d0.s1(xzs0VarK0, g0d0Var4);
                g0d0Var.s1(wsyVar2 != null ? xzs0VarK0.h(wsyVar2, t3u0.e) : null);
            }
            n0d0 n0d0Var2 = f0d0Var.y;
            if (n0d0Var2 == null) {
                n0d0Var = null;
            } else {
                g93 annotations2 = n0d0Var2.getAnnotations();
                gm40 gm40Var3 = this.b;
                tek visibility2 = f0d0Var.y.getVisibility();
                if (this.e == 2 && uek.e(uek.f(visibility2.f33825a.m()))) {
                    visibility2 = uek.h;
                }
                tek tekVar3 = visibility2;
                n0d0 n0d0Var3 = f0d0Var.y;
                boolean z4 = n0d0Var3.f;
                boolean z5 = n0d0Var3.g;
                boolean z6 = n0d0Var3.j;
                int i3 = this.e;
                d0d0 d0d0Var3 = this.d;
                n0d0Var = new n0d0(f0d0VarR1, annotations2, gm40Var3, tekVar3, z4, z5, z6, i3, d0d0Var3 == null ? null : d0d0Var3.e(), gne0Var);
            }
            if (n0d0Var != null) {
                xzs0Var = xzs0VarK0;
                List listS1 = oer.s1(n0d0Var, f0d0Var.y.z(), xzs0Var, false, false, null);
                if (listS1 == null) {
                    listS1 = Collections.singletonList(n0d0.r1(n0d0Var, rek.e(this.f6984a).o(), ((k3u0) f0d0Var.y.z().get(0)).getAnnotations()));
                }
                if (listS1.size() != 1) {
                    v4i0.e();
                    return null;
                }
                n0d0Var.m = f0d0.s1(xzs0Var, f0d0Var.y);
                k3u0 k3u0Var = (k3u0) listS1.get(0);
                if (k3u0Var == null) {
                    n0d0.k0(6);
                    throw null;
                }
                n0d0Var.n = k3u0Var;
            } else {
                xzs0Var = xzs0VarK0;
            }
            tqp tqpVar = f0d0Var.z;
            tqp tqpVar2 = tqpVar == null ? null : new tqp(tqpVar.getAnnotations(), f0d0VarR1);
            tqp tqpVar3 = f0d0Var.A;
            f0d0VarR1.t1(g0d0Var, n0d0Var, tqpVar2, tqpVar3 != null ? new tqp(tqpVar3.getAnnotations(), f0d0VarR1) : null);
            if (this.g) {
                nbk0 nbk0Var = new nbk0();
                Iterator it = f0d0Var.k().iterator();
                while (it.hasNext()) {
                    nbk0Var.add(((d0d0) it.next()).f(xzs0Var));
                }
                f0d0VarR1.l = nbk0Var;
            }
            if (f0d0Var.N() && (function0 = f0d0Var.i) != null) {
                f0d0VarR1.u1(f0d0Var.h, function0);
            }
            return f0d0VarR1;
        }
        return null;
    }
}
