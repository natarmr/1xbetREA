package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class urn0 implements fsn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36173a;

    public urn0(boolean z) {
        this.f36173a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof urn0) && this.f36173a == ((urn0) obj).f36173a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36173a);
    }

    public final String toString() {
        return defpackage.c.d("OnCardRemoved(lastCard=", Separators.RPAREN, this.f36173a);
    }
}
