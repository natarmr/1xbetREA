package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class wa1 implements ya1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38806a;

    public wa1(String str) {
        this.f38806a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa1) && this.f38806a.equals(((wa1) obj).f38806a);
    }

    public final int hashCode() {
        return this.f38806a.hashCode();
    }

    public final String toString() {
        return kng0.l("SaveNickname(nickName=", this.f38806a, Separators.RPAREN);
    }
}
