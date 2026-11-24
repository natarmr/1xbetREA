package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hjk0 implements z0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13164a;
    public final boolean b;
    public final int c;

    public hjk0(lc00 lc00Var, boolean z, int i) {
        u0f0 u0f0Var = u0f0.f34852a;
        lc00Var.getClass();
        this.f13164a = lc00Var;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjk0)) {
            return false;
        }
        hjk0 hjk0Var = (hjk0) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return Intrinsics.d(this.f13164a, hjk0Var.f13164a) && this.b == hjk0Var.b && this.c == hjk0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(dw9.a(u0f0.j.hashCode() * 31, 31, this.f13164a), 31, this.b);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return u0f0.j;
    }

    public final String toString() {
        return "SocialSectionUiModel(registrationFieldType=" + u0f0.j + ", socials=" + this.f13164a + ", isError=" + this.b + ", columnCount=" + this.c + Separators.RPAREN;
    }
}
