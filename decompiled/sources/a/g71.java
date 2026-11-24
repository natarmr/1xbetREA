package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class g71 implements h71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10790a;

    public g71(String str) {
        this.f10790a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g71) && this.f10790a.equals(((g71) obj).f10790a);
    }

    public final int hashCode() {
        return this.f10790a.hashCode();
    }

    public final String toString() {
        return kng0.l("SaveNickname(nickName=", this.f10790a, Separators.RPAREN);
    }
}
