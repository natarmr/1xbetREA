package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yok implements hpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42990a;

    public yok(String str) {
        this.f42990a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yok) && this.f42990a.equals(((yok) obj).f42990a);
    }

    public final int hashCode() {
        return this.f42990a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnItemWithKeyClick(idKey=", this.f42990a, Separators.RPAREN);
    }
}
