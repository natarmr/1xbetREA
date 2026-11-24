package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class koh implements moh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final joh f18629a;

    public final boolean equals(Object obj) {
        if (obj instanceof koh) {
            return this.f18629a.equals(((koh) obj).f18629a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18629a.hashCode();
    }

    public final String toString() {
        return "Content(value=" + this.f18629a + Separators.RPAREN;
    }
}
