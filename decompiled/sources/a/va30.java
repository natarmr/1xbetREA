package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class va30 implements xa30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37066a;

    public final boolean equals(Object obj) {
        if (obj instanceof va30) {
            return this.f37066a == ((va30) obj).f37066a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37066a);
    }

    public final String toString() {
        return defpackage.c.d("RecallFavoriteClickIfReEntrance(firstTeam=", Separators.RPAREN, this.f37066a);
    }
}
