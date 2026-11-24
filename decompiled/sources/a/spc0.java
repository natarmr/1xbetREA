package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class spc0 implements vpc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32586a;

    public spc0(String str) {
        this.f32586a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof spc0) && this.f32586a.equals(((spc0) obj).f32586a);
    }

    @Override // a.vpc0
    public final String getTitle() {
        return this.f32586a;
    }

    public final int hashCode() {
        return this.f32586a.hashCode();
    }

    public final String toString() {
        return kng0.l("DataEmpty(title=", this.f32586a, Separators.RPAREN);
    }
}
