package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class puq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27630a;

    public puq0(boolean z) {
        this.f27630a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof puq0) && this.f27630a == ((puq0) obj).f27630a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27630a);
    }

    public final String toString() {
        return defpackage.c.d("TestDomainEnabledModel(enable=", Separators.RPAREN, this.f27630a);
    }
}
