package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pri0 implements rri0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27467a;
    public final List b;

    public pri0(List list, boolean z) {
        list.getClass();
        this.f27467a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pri0)) {
            return false;
        }
        pri0 pri0Var = (pri0) obj;
        return this.f27467a == pri0Var.f27467a && Intrinsics.d(this.b, pri0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f27467a) * 31);
    }

    public final String toString() {
        return "Loaded(passwordRequirementsVisible=" + this.f27467a + ", passwordRequirements=" + this.b + Separators.RPAREN;
    }
}
