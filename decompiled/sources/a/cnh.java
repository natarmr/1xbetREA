package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cnh implements enh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f4655a;

    public cnh(i4 i4Var) {
        i4Var.getClass();
        this.f4655a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnh) && Intrinsics.d(this.f4655a, ((cnh) obj).f4655a);
    }

    public final int hashCode() {
        return this.f4655a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f4655a, "Content(items=", Separators.RPAREN);
    }
}
