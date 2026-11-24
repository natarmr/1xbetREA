package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sru0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32696a;

    public sru0(String str) {
        this.f32696a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sru0) && this.f32696a.equals(((sru0) obj).f32696a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f32696a;
    }

    public final int hashCode() {
        return this.f32696a.hashCode();
    }

    public final String toString() {
        return kng0.l("VirtualGamesCategoryShimmerUiModel(key=", this.f32696a, Separators.RPAREN);
    }
}
