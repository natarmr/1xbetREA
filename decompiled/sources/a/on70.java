package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class on70 extends qn70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25534a;

    public on70(String str) {
        this.f25534a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof on70) && this.f25534a.equals(((on70) obj).f25534a);
    }

    public final int hashCode() {
        return this.f25534a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f25534a, Separators.RPAREN);
    }
}
