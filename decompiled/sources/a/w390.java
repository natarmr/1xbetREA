package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w390 implements z390 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38491a;

    public w390(String str) {
        this.f38491a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w390) && this.f38491a.equals(((w390) obj).f38491a);
    }

    public final int hashCode() {
        return this.f38491a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSchemeLink(link=", this.f38491a, Separators.RPAREN);
    }
}
