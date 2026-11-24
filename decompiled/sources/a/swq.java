package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class swq {
    public static final swq c = new swq("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final twq f32934a;
    public transient swq b;

    public swq(String str) {
        str.getClass();
        this.f32934a = new twq(this, str);
    }

    public final swq a(g950 g950Var) {
        g950Var.getClass();
        return new swq(this.f32934a.a(g950Var), this);
    }

    public final swq b() {
        swq swqVar = this.b;
        if (swqVar != null) {
            return swqVar;
        }
        twq twqVar = this.f32934a;
        if (twqVar.c()) {
            jf4.n("root");
            return null;
        }
        swq swqVar2 = new swq(twqVar.e());
        this.b = swqVar2;
        return swqVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof swq) {
            return Intrinsics.d(this.f32934a, ((swq) obj).f32934a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32934a.f34663a.hashCode();
    }

    public final String toString() {
        return this.f32934a.toString();
    }

    public swq(twq twqVar) {
        twqVar.getClass();
        this.f32934a = twqVar;
    }

    public swq(twq twqVar, swq swqVar) {
        this.f32934a = twqVar;
        this.b = swqVar;
    }
}
