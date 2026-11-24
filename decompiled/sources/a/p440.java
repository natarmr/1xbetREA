package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p440 implements t440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j540 f26333a;

    public p440(j540 j540Var) {
        this.f26333a = j540Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p440) && this.f26333a == ((p440) obj).f26333a;
    }

    public final int hashCode() {
        return this.f26333a.hashCode();
    }

    public final String toString() {
        return "MainSection(sectionType=" + this.f26333a + Separators.RPAREN;
    }
}
