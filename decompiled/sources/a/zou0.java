package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zou0 implements cpu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44732a;

    public zou0(String str) {
        this.f44732a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zou0) && this.f44732a.equals(((zou0) obj).f44732a);
    }

    public final int hashCode() {
        return this.f44732a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnItemWithKeyClick(idKey=", this.f44732a, Separators.RPAREN);
    }
}
