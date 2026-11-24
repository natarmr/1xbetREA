package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w640 implements x640 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38609a;
    public final boolean b;

    public w640(String str, boolean z) {
        str.getClass();
        this.f38609a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w640)) {
            return false;
        }
        w640 w640Var = (w640) obj;
        return Intrinsics.d(this.f38609a, w640Var.f38609a) && this.b == w640Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f38609a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("Unsent(key=", this.f38609a, ", sendError=", this.b, Separators.RPAREN);
    }
}
