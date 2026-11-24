package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x06 extends i16 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40056a;

    public x06(boolean z) {
        this.f40056a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x06) && this.f40056a == ((x06) obj).f40056a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40056a);
    }

    public final String toString() {
        return defpackage.c.d("ErrorCommand(closeGame=", Separators.RPAREN, this.f40056a);
    }
}
