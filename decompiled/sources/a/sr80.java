package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sr80 implements tr80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f32663a;

    public sr80(lq5 lq5Var) {
        this.f32663a = lq5Var;
    }

    @Override // a.tr80
    public final lq5 a() {
        return this.f32663a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sr80) && this.f32663a.equals(((sr80) obj).f32663a);
    }

    public final int hashCode() {
        return this.f32663a.hashCode();
    }

    public final String toString() {
        return "Shimmers(style=" + this.f32663a + Separators.RPAREN;
    }
}
