package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lkc0 implements mkc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20195a;

    public lkc0(boolean z) {
        this.f20195a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkc0) && this.f20195a == ((lkc0) obj).f20195a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20195a);
    }

    public final String toString() {
        return defpackage.c.d("StartGameInfo(gameAvailable=", Separators.RPAREN, this.f20195a);
    }
}
