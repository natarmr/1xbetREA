package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class esk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f8333a;
    public final List b;

    public esk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f8333a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esk0)) {
            return false;
        }
        esk0 esk0Var = (esk0) obj;
        return this.f8333a.equals(esk0Var.f8333a) && Intrinsics.d(this.b, esk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8333a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("Live(status=", this.f8333a, ", content=", this.b, Separators.RPAREN);
    }
}
