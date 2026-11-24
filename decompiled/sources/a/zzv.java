package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zzv implements a0w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ato0 f45273a;

    public final boolean equals(Object obj) {
        if (obj instanceof zzv) {
            return this.f45273a.equals(((zzv) obj).f45273a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45273a.hashCode();
    }

    public final String toString() {
        return "OnTakeAllModelClick(takeAllModel=" + this.f45273a + Separators.RPAREN;
    }
}
