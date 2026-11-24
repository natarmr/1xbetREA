package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class few {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jwb f9425a;

    public few(jwb jwbVar) {
        this.f9425a = jwbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof few) && this.f9425a.equals(((few) obj).f9425a);
    }

    public final int hashCode() {
        return this.f9425a.hashCode();
    }

    public final String toString() {
        return "HltvAwardsScreenStateUiModel(contentState=" + this.f9425a + Separators.RPAREN;
    }
}
