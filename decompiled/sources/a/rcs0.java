package a;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class rcs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30255a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public boolean g = true;
    public boolean h = true;
    public b4x i;
    public b4x j;
    public b4x k;
    public b4x l;
    public b4x m;
    public int n;
    public int o;
    public b4x p;
    public qcs0 q;
    public b4x r;
    public boolean s;
    public b4x t;
    public int u;
    public boolean v;
    public HashMap w;
    public HashSet x;

    public rcs0() {
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        this.i = rcf0Var;
        this.j = rcf0Var;
        this.k = rcf0Var;
        this.l = rcf0Var;
        this.m = rcf0Var;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
        this.p = rcf0Var;
        this.q = qcs0.f28498a;
        this.r = rcf0Var;
        this.s = true;
        this.t = rcf0Var;
        this.u = 0;
        this.v = false;
        this.w = new HashMap();
        this.x = new HashSet();
    }

    public scs0 a() {
        return new scs0(this);
    }

    public rcs0 b(int i) {
        Iterator it = this.w.values().iterator();
        while (it.hasNext()) {
            if (((pcs0) it.next()).f26775a.c == i) {
                it.remove();
            }
        }
        return this;
    }

    public final void c(scs0 scs0Var) {
        this.f30255a = scs0Var.f32003a;
        this.b = scs0Var.b;
        this.c = scs0Var.c;
        this.d = scs0Var.d;
        this.e = scs0Var.e;
        this.f = scs0Var.f;
        this.g = scs0Var.g;
        this.h = scs0Var.h;
        this.j = scs0Var.j;
        this.i = scs0Var.i;
        this.k = scs0Var.k;
        this.l = scs0Var.l;
        this.m = scs0Var.m;
        this.n = scs0Var.n;
        this.o = scs0Var.o;
        this.p = scs0Var.p;
        this.q = scs0Var.q;
        this.r = scs0Var.r;
        this.s = scs0Var.t;
        this.t = scs0Var.s;
        this.u = scs0Var.u;
        this.v = scs0Var.v;
        this.x = new HashSet(scs0Var.x);
        this.w = new HashMap(scs0Var.w);
    }

    public rcs0 d() {
        this.u = -3;
        return this;
    }

    public rcs0 e(pcs0 pcs0Var) {
        ccs0 ccs0Var = pcs0Var.f26775a;
        b(ccs0Var.c);
        this.w.put(ccs0Var, pcs0Var);
        return this;
    }

    public rcs0 f() {
        return g(new String[0]);
    }

    public rcs0 g(String... strArr) {
        u3x u3xVarL = b4x.l();
        for (String str : strArr) {
            str.getClass();
            u3xVarL.b(vtt0.N(str));
        }
        this.r = u3xVarL.g();
        this.s = false;
        return this;
    }

    public rcs0 h() {
        this.s = false;
        return this;
    }

    public rcs0 i(int i, boolean z) {
        HashSet hashSet = this.x;
        if (z) {
            hashSet.add(Integer.valueOf(i));
            return this;
        }
        hashSet.remove(Integer.valueOf(i));
        return this;
    }
}
