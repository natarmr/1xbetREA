package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class rb1 implements wb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30160a;

    public rb1(String str) {
        this.f30160a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb1) && this.f30160a.equals(((rb1) obj).f30160a);
    }

    public final int hashCode() {
        return this.f30160a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowNicknameError(description=", this.f30160a, Separators.RPAREN);
    }
}
