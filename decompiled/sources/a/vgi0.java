package a;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vgi0 implements ugi0, vj9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugi0 f37382a;
    public final String b;
    public final Set c;

    public vgi0(ugi0 ugi0Var) {
        ugi0Var.getClass();
        this.f37382a = ugi0Var;
        this.b = ugi0Var.h() + '?';
        this.c = j2e.J(ugi0Var);
    }

    @Override // a.vj9
    public final Set a() {
        return this.c;
    }

    @Override // a.ugi0
    public final boolean b() {
        return true;
    }

    @Override // a.ugi0
    public final int c(String str) {
        str.getClass();
        return this.f37382a.c(str);
    }

    @Override // a.ugi0
    public final int d() {
        return this.f37382a.d();
    }

    @Override // a.ugi0
    public final String e(int i) {
        return this.f37382a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vgi0) {
            return Intrinsics.d(this.f37382a, ((vgi0) obj).f37382a);
        }
        return false;
    }

    @Override // a.ugi0
    public final List f(int i) {
        return this.f37382a.f(i);
    }

    @Override // a.ugi0
    public final ugi0 g(int i) {
        return this.f37382a.g(i);
    }

    @Override // a.ugi0
    public final List getAnnotations() {
        return this.f37382a.getAnnotations();
    }

    @Override // a.ugi0
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return this.f37382a.hashCode() * 31;
    }

    @Override // a.ugi0
    public final boolean i(int i) {
        return this.f37382a.i(i);
    }

    @Override // a.ugi0
    public final boolean isInline() {
        return this.f37382a.isInline();
    }

    @Override // a.ugi0
    public final c3x l() {
        return this.f37382a.l();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f37382a);
        sb.append('?');
        return sb.toString();
    }
}
