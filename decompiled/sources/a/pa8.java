package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class pa8 implements qa8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26642a;

    public final boolean equals(Object obj) {
        if (obj instanceof pa8) {
            return this.f26642a.equals(((pa8) obj).f26642a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26642a.hashCode();
    }

    public final String toString() {
        return kng0.l("BlockName(value=", this.f26642a, Separators.RPAREN);
    }
}
