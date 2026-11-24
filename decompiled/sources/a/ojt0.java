package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ojt0 implements sjt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25377a;

    public ojt0(boolean z) {
        this.f25377a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ojt0) && this.f25377a == ((ojt0) obj).f25377a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25377a);
    }

    public final String toString() {
        return defpackage.c.d("Added(subscribe=", Separators.RPAREN, this.f25377a);
    }
}
