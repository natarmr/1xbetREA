package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class m250 implements n250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f21040a;

    public m250(mdm mdmVar) {
        this.f21040a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m250) && this.f21040a.equals(((m250) obj).f21040a);
    }

    public final int hashCode() {
        return this.f21040a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f21040a, Separators.RPAREN);
    }
}
