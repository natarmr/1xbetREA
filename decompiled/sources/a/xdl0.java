package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xdl0 implements ydl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40699a;

    public xdl0(String str) {
        this.f40699a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdl0) && this.f40699a.equals(((xdl0) obj).f40699a);
    }

    public final int hashCode() {
        return this.f40699a.hashCode();
    }

    public final String toString() {
        return kng0.l("Url(url=", this.f40699a, Separators.RPAREN);
    }
}
