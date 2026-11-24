package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zrk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f44859a;
    public final List b;

    public zrk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f44859a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrk0)) {
            return false;
        }
        zrk0 zrk0Var = (zrk0) obj;
        return this.f44859a.equals(zrk0Var.f44859a) && Intrinsics.d(this.b, zrk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44859a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("CyberTeamsSection(status=", this.f44859a, ", content=", this.b, Separators.RPAREN);
    }
}
