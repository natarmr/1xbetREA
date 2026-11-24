package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pm00 implements tm00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27209a;

    public pm00(boolean z) {
        this.f27209a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm00) && this.f27209a == ((pm00) obj).f27209a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27209a);
    }

    public final String toString() {
        return defpackage.c.d("Content(loadAvailable=", Separators.RPAREN, this.f27209a);
    }
}
