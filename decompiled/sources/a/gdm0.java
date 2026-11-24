package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gdm0 implements hdm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11111a;
    public final odm0 b;

    public gdm0(long j, odm0 odm0Var) {
        odm0Var.getClass();
        this.f11111a = j;
        this.b = odm0Var;
    }

    @Override // a.hdm0
    public final long a() {
        return this.f11111a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdm0)) {
            return false;
        }
        gdm0 gdm0Var = (gdm0) obj;
        return this.f11111a == gdm0Var.f11111a && Intrinsics.d(this.b, gdm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f11111a) * 31);
    }

    public final String toString() {
        return "Success(globalChampId=" + this.f11111a + ", statisticHeaderTypeModel=" + this.b + Separators.RPAREN;
    }
}
