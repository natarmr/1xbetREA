package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yqk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43080a;

    public yqk0(String str) {
        this.f43080a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqk0) && this.f43080a.equals(((yqk0) obj).f43080a);
    }

    public final int hashCode() {
        return this.f43080a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPlayerClick(playerId=", this.f43080a, Separators.RPAREN);
    }
}
