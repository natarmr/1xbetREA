package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nro implements pro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3w f24012a;

    public nro(i3w i3wVar) {
        this.f24012a = i3wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nro) && this.f24012a.equals(((nro) obj).f24012a);
    }

    public final int hashCode() {
        return this.f24012a.hashCode();
    }

    public final String toString() {
        return "Express(historyItemEventsTextUiModel=" + this.f24012a + Separators.RPAREN;
    }
}
