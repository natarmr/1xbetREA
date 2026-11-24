package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sss0 implements uss0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32742a;

    public sss0(String str) {
        this.f32742a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sss0) && this.f32742a.equals(((sss0) obj).f32742a);
    }

    public final int hashCode() {
        return this.f32742a.hashCode();
    }

    public final String toString() {
        return kng0.l("Content(label=", this.f32742a, Separators.RPAREN);
    }
}
