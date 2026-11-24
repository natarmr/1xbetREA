package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ruq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31138a;

    public ruq0(boolean z) {
        this.f31138a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ruq0) && this.f31138a == ((ruq0) obj).f31138a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31138a);
    }

    public final String toString() {
        return defpackage.c.d("TestServerStageModel(enable=", Separators.RPAREN, this.f31138a);
    }
}
