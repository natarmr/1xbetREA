package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lsk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f20584a;
    public final List b;

    public lsk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f20584a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsk0)) {
            return false;
        }
        lsk0 lsk0Var = (lsk0) obj;
        return this.f20584a.equals(lsk0Var.f20584a) && Intrinsics.d(this.b, lsk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20584a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("Rankings(status=", this.f20584a, ", content=", this.b, Separators.RPAREN);
    }
}
