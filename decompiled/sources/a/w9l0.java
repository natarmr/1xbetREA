package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w9l0 implements x9l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f38786a;

    public /* synthetic */ w9l0(j83 j83Var) {
        this.f38786a = j83Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w9l0) {
            return this.f38786a.equals(((w9l0) obj).f38786a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38786a.hashCode();
    }

    public final String toString() {
        return "Live(value=" + ((Object) this.f38786a) + Separators.RPAREN;
    }
}
