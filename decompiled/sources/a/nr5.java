package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nr5 implements or5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr5 f23986a;

    public nr5(kr5 kr5Var) {
        kr5Var.getClass();
        this.f23986a = kr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nr5) && Intrinsics.d(this.f23986a, ((nr5) obj).f23986a);
    }

    public final int hashCode() {
        return this.f23986a.hashCode();
    }

    public final String toString() {
        return "Legacy(model=" + this.f23986a + Separators.RPAREN;
    }
}
