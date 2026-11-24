package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ge8 implements x0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11140a;
    public final String b;
    public final rqm c;

    public ge8(boolean z, String str, rqm rqmVar) {
        u0f0 u0f0Var = u0f0.f34852a;
        str.getClass();
        this.f11140a = z;
        this.b = str;
        this.c = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge8)) {
            return false;
        }
        ge8 ge8Var = (ge8) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f11140a == ge8Var.f11140a && Intrinsics.d(this.b, ge8Var.b) && this.c.equals(ge8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(brm0.e(u0f0.v.hashCode() * 31, 31, this.f11140a), 31, this.b);
    }

    @Override // a.x0f0
    public final u0f0 q() {
        return u0f0.v;
    }

    public final String toString() {
        return "BonusFieldUiModel(registrationFieldType=" + u0f0.v + ", isEnable=" + this.f11140a + ", hint=" + this.b + ", cellStyle=" + this.c + Separators.RPAREN;
    }
}
