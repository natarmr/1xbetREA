package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cbf implements ebf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4059a;
    public final List b;

    public cbf(List list, boolean z) {
        list.getClass();
        this.f4059a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbf)) {
            return false;
        }
        cbf cbfVar = (cbf) obj;
        return this.f4059a == cbfVar.f4059a && Intrinsics.d(this.b, cbfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f4059a) * 31);
    }

    public final String toString() {
        return "Loaded(passwordRequirementsVisible=" + this.f4059a + ", passwordRequirements=" + this.b + Separators.RPAREN;
    }
}
