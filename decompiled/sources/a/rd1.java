package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rd1 implements ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bpl f30268a;

    public rd1(bpl bplVar) {
        this.f30268a = bplVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd1) && this.f30268a.equals(((rd1) obj).f30268a);
    }

    public final int hashCode() {
        return this.f30268a.hashCode();
    }

    public final String toString() {
        return "OnSocialItemClick(social=" + this.f30268a + Separators.RPAREN;
    }
}
