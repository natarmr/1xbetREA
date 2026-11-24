package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class i350 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mqv f14081a;

    public i350(mqv mqvVar) {
        this.f14081a = mqvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i350) && this.f14081a.equals(((i350) obj).f14081a);
    }

    public final int hashCode() {
        return this.f14081a.hashCode();
    }

    public final String toString() {
        return "OnClickAll(type=" + this.f14081a + Separators.RPAREN;
    }
}
