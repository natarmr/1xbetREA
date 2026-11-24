package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class msk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f22325a;
    public final List b;

    public msk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f22325a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msk0)) {
            return false;
        }
        msk0 msk0Var = (msk0) obj;
        return this.f22325a.equals(msk0Var.f22325a) && Intrinsics.d(this.b, msk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22325a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("SocialNets(status=", this.f22325a, ", content=", this.b, Separators.RPAREN);
    }
}
