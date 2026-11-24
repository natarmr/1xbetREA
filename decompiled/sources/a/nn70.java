package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nn70 extends qn70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23807a;

    public nn70(boolean z) {
        this.f23807a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn70) && this.f23807a == ((nn70) obj).f23807a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23807a);
    }

    public final String toString() {
        return defpackage.c.d("ShowEndGameView(show=", Separators.RPAREN, this.f23807a);
    }
}
