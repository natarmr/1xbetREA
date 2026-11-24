package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rlg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30696a;

    public rlg0(boolean z) {
        this.f30696a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlg0) && this.f30696a == ((rlg0) obj).f30696a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30696a);
    }

    public final String toString() {
        return defpackage.c.d("RulesCheckUiModel(checked=", Separators.RPAREN, this.f30696a);
    }
}
