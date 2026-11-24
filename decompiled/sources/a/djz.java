package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class djz {
    public final pz40 A;
    public final pz40 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hhk f6209a;
    public final yfe0 b;
    public final pkk0 c;
    public final hsj d;
    public r8q0 e;
    public final pz40 f;
    public final pz40 g;
    public j6z h;
    public final pz40 i;
    public j83 j;
    public final pz40 k;
    public final pz40 l;
    public final pz40 m;
    public final pz40 n;
    public final pz40 o;
    public boolean p;
    public final pz40 q;
    public final jly r;
    public final pz40 s;
    public final pz40 t;
    public Function1 u;
    public final ome v;
    public final ome w;
    public final ome x;
    public final ucs0 y;
    public long z;

    public djz(hhk hhkVar, yfe0 yfe0Var, pkk0 pkk0Var) {
        this.f6209a = hhkVar;
        this.b = yfe0Var;
        this.c = pkk0Var;
        hsj hsjVar = new hsj();
        j83 j83Var = k83.f17854a;
        long j = o9q0.b;
        a8q0 a8q0Var = new a8q0(j83Var, j, (o9q0) null);
        hsjVar.f13586a = a8q0Var;
        hsjVar.b = new z55(j83Var, a8q0Var.b);
        this.d = hsjVar;
        Boolean bool = Boolean.FALSE;
        this.f = androidx.compose.runtime.e.e(bool);
        this.g = androidx.compose.runtime.e.e(new ycl(0.0f));
        this.i = androidx.compose.runtime.e.e(null);
        this.k = androidx.compose.runtime.e.e(dmv.f6336a);
        this.l = androidx.compose.runtime.e.e(bool);
        this.m = androidx.compose.runtime.e.e(bool);
        this.n = androidx.compose.runtime.e.e(bool);
        this.o = androidx.compose.runtime.e.e(bool);
        this.p = true;
        this.q = androidx.compose.runtime.e.e(Boolean.TRUE);
        this.r = new jly(pkk0Var);
        this.s = androidx.compose.runtime.e.e(bool);
        this.t = androidx.compose.runtime.e.e(bool);
        this.u = new z8z((byte) 11);
        this.v = new ome(this, (byte) 1);
        this.w = new ome(this, (byte) 2);
        this.x = new ome(this, (byte) 3);
        this.y = saj.D();
        this.z = y3d.g;
        this.A = androidx.compose.runtime.e.e(new o9q0(j));
        this.B = androidx.compose.runtime.e.e(new o9q0(j));
    }

    public final dmv a() {
        return (dmv) ((hgk0) this.k).getValue();
    }

    public final boolean b() {
        return ((Boolean) ((hgk0) this.f).getValue()).booleanValue();
    }

    public final j6z c() {
        j6z j6zVar = this.h;
        if (j6zVar == null || !j6zVar.h()) {
            return null;
        }
        return j6zVar;
    }

    public final b9q0 d() {
        return (b9q0) ((hgk0) this.i).getValue();
    }

    public final void e(long j) {
        ((hgk0) this.B).setValue(new o9q0(j));
    }

    public final void f(long j) {
        ((hgk0) this.A).setValue(new o9q0(j));
    }
}
