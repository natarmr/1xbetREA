package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t09 implements y09 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33108a;

    public t09(String str) {
        this.f33108a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t09) && this.f33108a.equals(((t09) obj).f33108a);
    }

    public final int hashCode() {
        return this.f33108a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChanged(query=", this.f33108a, Separators.RPAREN);
    }
}
