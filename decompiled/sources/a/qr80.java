package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qr80 implements tr80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f29197a;
    public final a4x b;

    public qr80(lq5 lq5Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f29197a = lq5Var;
        this.b = a4xVar;
    }

    @Override // a.tr80
    public final lq5 a() {
        return this.f29197a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr80)) {
            return false;
        }
        qr80 qr80Var = (qr80) obj;
        return this.f29197a.equals(qr80Var.f29197a) && Intrinsics.d(this.b, qr80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29197a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(style=" + this.f29197a + ", banners=" + this.b + Separators.RPAREN;
    }
}
