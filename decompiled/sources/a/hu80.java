package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hu80 implements ku80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f13668a;
    public final a4x b;

    public hu80(lq5 lq5Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f13668a = lq5Var;
        this.b = a4xVar;
    }

    @Override // a.ku80
    public final lq5 a() {
        return this.f13668a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu80)) {
            return false;
        }
        hu80 hu80Var = (hu80) obj;
        return this.f13668a.equals(hu80Var.f13668a) && Intrinsics.d(this.b, hu80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13668a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(style=" + this.f13668a + ", banners=" + this.b + Separators.RPAREN;
    }
}
