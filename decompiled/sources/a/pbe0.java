package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pbe0 implements ir8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ir8 f26702a;
    public final mz3 b;
    public final u12 c;
    public final qge d;

    public pbe0(ir8 ir8Var, mz3 mz3Var, u12 u12Var, qge qgeVar) {
        this.f26702a = ir8Var;
        this.b = mz3Var;
        this.c = u12Var;
        this.d = qgeVar;
    }

    @Override // a.ir8
    public final mm40 a(mm40 mm40Var) {
        return this.f26702a.a(jm40.b);
    }

    @Override // a.ir8
    public final mm40 b(mm40 mm40Var, u12 u12Var) {
        return this.f26702a.b(mm40Var, u12Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pbe0) {
            pbe0 pbe0Var = (pbe0) obj;
            if (this.f26702a.equals(pbe0Var.f26702a) && this.b == pbe0Var.b && Intrinsics.d(this.c, pbe0Var.c) && Intrinsics.d(this.d, pbe0Var.d) && Float.compare(1.0f, 1.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + defpackage.c.a((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f26702a.hashCode() * 31)) * 961)) * 31)) * 31, 1.0f, 961);
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f26702a + ", painter=" + this.b + ", contentDescription=null, alignment=" + this.c + ", contentScale=" + this.d + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
