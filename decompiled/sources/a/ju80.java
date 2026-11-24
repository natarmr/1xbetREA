package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ju80 implements ku80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f17141a;

    public ju80(lq5 lq5Var) {
        this.f17141a = lq5Var;
    }

    @Override // a.ku80
    public final lq5 a() {
        return this.f17141a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju80) && this.f17141a.equals(((ju80) obj).f17141a);
    }

    public final int hashCode() {
        return this.f17141a.hashCode();
    }

    public final String toString() {
        return "Shimmers(style=" + this.f17141a + Separators.RPAREN;
    }
}
