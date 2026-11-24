package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class smf0 implements wmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f32443a;

    public smf0(mdm mdmVar) {
        this.f32443a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof smf0) && this.f32443a.equals(((smf0) obj).f32443a);
    }

    public final int hashCode() {
        return this.f32443a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(config=", this.f32443a, Separators.RPAREN);
    }
}
