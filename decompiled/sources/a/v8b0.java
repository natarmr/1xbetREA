package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v8b0 implements x8b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36973a;

    public v8b0(boolean z) {
        this.f36973a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v8b0) && this.f36973a == ((v8b0) obj).f36973a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36973a);
    }

    public final String toString() {
        return defpackage.c.d("Progress(loading=", Separators.RPAREN, this.f36973a);
    }
}
