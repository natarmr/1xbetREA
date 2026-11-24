package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ewb0 implements ugi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8515a;
    public final zvb0 b;

    public ewb0(String str, zvb0 zvb0Var) {
        zvb0Var.getClass();
        this.f8515a = str;
        this.b = zvb0Var;
    }

    public final void a() {
        throw new IllegalStateException(axq.n(new StringBuilder("Primitive descriptor "), this.f8515a, " does not have elements"));
    }

    @Override // a.ugi0
    public final int c(String str) {
        str.getClass();
        a();
        throw null;
    }

    @Override // a.ugi0
    public final int d() {
        return 0;
    }

    @Override // a.ugi0
    public final String e(int i) {
        a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewb0)) {
            return false;
        }
        ewb0 ewb0Var = (ewb0) obj;
        return this.f8515a.equals(ewb0Var.f8515a) && Intrinsics.d(this.b, ewb0Var.b);
    }

    @Override // a.ugi0
    public final List f(int i) {
        a();
        throw null;
    }

    @Override // a.ugi0
    public final ugi0 g(int i) {
        a();
        throw null;
    }

    @Override // a.ugi0
    public final String h() {
        return this.f8515a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.f8515a.hashCode();
    }

    @Override // a.ugi0
    public final boolean i(int i) {
        a();
        throw null;
    }

    @Override // a.ugi0
    public final c3x l() {
        return this.b;
    }

    public final String toString() {
        return axq.m(new StringBuilder("PrimitiveDescriptor("), this.f8515a, ')');
    }
}
