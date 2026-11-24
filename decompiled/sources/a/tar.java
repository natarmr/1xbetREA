package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tar implements xar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sar f33627a;

    public tar(sar sarVar) {
        this.f33627a = sarVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tar) && this.f33627a.equals(((tar) obj).f33627a);
    }

    public final int hashCode() {
        return this.f33627a.f31897a.hashCode();
    }

    public final String toString() {
        return "Content(fullDescriptionUiModel=" + this.f33627a + Separators.RPAREN;
    }
}
