package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yrk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f43126a;
    public final List b;

    public yrk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f43126a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrk0)) {
            return false;
        }
        yrk0 yrk0Var = (yrk0) obj;
        return this.f43126a.equals(yrk0Var.f43126a) && Intrinsics.d(this.b, yrk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43126a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("CyberGroupsSection(status=", this.f43126a, ", content=", this.b, Separators.RPAREN);
    }
}
