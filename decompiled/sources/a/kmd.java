package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kmd extends lmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18533a;

    public kmd(String str) {
        this.f18533a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmd) && this.f18533a.equals(((kmd) obj).f18533a);
    }

    public final int hashCode() {
        return this.f18533a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoSecondPlayerLogoChanged(id=", this.f18533a, Separators.RPAREN);
    }
}
