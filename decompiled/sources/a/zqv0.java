package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zqv0 implements ugi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44827a;
    public final ugi0 b;

    public zqv0(String str, ugi0 ugi0Var) {
        ugi0Var.getClass();
        this.f44827a = str;
        this.b = ugi0Var;
    }

    @Override // a.ugi0
    public final boolean b() {
        return this.b.b();
    }

    @Override // a.ugi0
    public final int c(String str) {
        str.getClass();
        return this.b.c(str);
    }

    @Override // a.ugi0
    public final int d() {
        return this.b.d();
    }

    @Override // a.ugi0
    public final String e(int i) {
        return this.b.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqv0)) {
            return false;
        }
        zqv0 zqv0Var = (zqv0) obj;
        return this.f44827a.equals(zqv0Var.f44827a) && Intrinsics.d(this.b, zqv0Var.b);
    }

    @Override // a.ugi0
    public final List f(int i) {
        return this.b.f(i);
    }

    @Override // a.ugi0
    public final ugi0 g(int i) {
        return this.b.g(i);
    }

    @Override // a.ugi0
    public final List getAnnotations() {
        return this.b.getAnnotations();
    }

    @Override // a.ugi0
    public final String h() {
        return this.f44827a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44827a.hashCode() * 31);
    }

    @Override // a.ugi0
    public final boolean i(int i) {
        return this.b.i(i);
    }

    @Override // a.ugi0
    public final boolean isInline() {
        return this.b.isInline();
    }

    @Override // a.ugi0
    public final c3x l() {
        return this.b.l();
    }

    public final String toString() {
        return n2x.R(this);
    }
}
