package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ef10 implements ff10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjm f7702a;

    public ef10(jjm jjmVar) {
        this.f7702a = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef10) && this.f7702a.equals(((ef10) obj).f7702a);
    }

    public final int hashCode() {
        return this.f7702a.hashCode();
    }

    public final String toString() {
        return "Header(model=" + this.f7702a + Separators.RPAREN;
    }
}
