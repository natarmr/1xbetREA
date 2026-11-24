package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jdl0 implements kdl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16334a;
    public final jkm b;

    public jdl0(jkm jkmVar, boolean z) {
        this.f16334a = z;
        this.b = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdl0)) {
            return false;
        }
        jdl0 jdl0Var = (jdl0) obj;
        return this.f16334a == jdl0Var.f16334a && this.b.equals(jdl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f16334a) * 31);
    }

    public final String toString() {
        return "NothingFound(hasMenuDiscardBtnEnabled=" + this.f16334a + ", config=" + this.b + Separators.RPAREN;
    }
}
