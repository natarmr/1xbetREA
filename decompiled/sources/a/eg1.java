package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class eg1 implements gg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tpl f7740a;

    public eg1(tpl tplVar) {
        this.f7740a = tplVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg1) && this.f7740a.equals(((eg1) obj).f7740a);
    }

    public final int hashCode() {
        return this.f7740a.hashCode();
    }

    public final String toString() {
        return "SocialContent(uiModel=" + this.f7740a + Separators.RPAREN;
    }
}
