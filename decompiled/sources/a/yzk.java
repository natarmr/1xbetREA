package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yzk implements b0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0l f43517a;

    public yzk(n0l n0lVar) {
        this.f43517a = n0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yzk) && this.f43517a.equals(((yzk) obj).f43517a);
    }

    public final int hashCode() {
        return this.f43517a.hashCode();
    }

    public final String toString() {
        return "SetStateAfterCreateGame(dominoModel=" + this.f43517a + Separators.RPAREN;
    }
}
