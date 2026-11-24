package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jm2 implements vm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f16743a;

    public final boolean equals(Object obj) {
        if (obj instanceof jm2) {
            return this.f16743a.equals(((jm2) obj).f16743a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16743a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(value=", this.f16743a, Separators.RPAREN);
    }
}
