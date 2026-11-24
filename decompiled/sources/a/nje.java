package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class nje implements ugi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wgi0 f23630a;
    public final sgy b;
    public final String c;

    public nje(wgi0 wgi0Var, sgy sgyVar) {
        sgyVar.getClass();
        this.f23630a = wgi0Var;
        this.b = sgyVar;
        this.c = wgi0Var.f39119a + '<' + sgyVar.J() + '>';
    }

    @Override // a.ugi0
    public final boolean b() {
        return false;
    }

    @Override // a.ugi0
    public final int c(String str) {
        str.getClass();
        return this.f23630a.c(str);
    }

    @Override // a.ugi0
    public final int d() {
        return this.f23630a.c;
    }

    @Override // a.ugi0
    public final String e(int i) {
        return this.f23630a.f[i];
    }

    public final boolean equals(Object obj) {
        nje njeVar = obj instanceof nje ? (nje) obj : null;
        return njeVar != null && this.f23630a.equals(njeVar.f23630a) && Intrinsics.d(njeVar.b, this.b);
    }

    @Override // a.ugi0
    public final List f(int i) {
        return this.f23630a.h[i];
    }

    @Override // a.ugi0
    public final ugi0 g(int i) {
        return this.f23630a.g[i];
    }

    @Override // a.ugi0
    public final List getAnnotations() {
        return this.f23630a.d;
    }

    @Override // a.ugi0
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // a.ugi0
    public final boolean i(int i) {
        return this.f23630a.i[i];
    }

    @Override // a.ugi0
    public final boolean isInline() {
        return false;
    }

    @Override // a.ugi0
    public final c3x l() {
        return this.f23630a.b;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.f23630a + ')';
    }
}
