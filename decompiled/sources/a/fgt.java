package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fgt implements z0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9508a;
    public final fyl b;
    public final boolean c;

    public fgt(String str, fyl fylVar, boolean z) {
        u0f0 u0f0Var = u0f0.f34852a;
        str.getClass();
        this.f9508a = str;
        this.b = fylVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgt)) {
            return false;
        }
        fgt fgtVar = (fgt) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return Intrinsics.d(this.f9508a, fgtVar.f9508a) && this.b.equals(fgtVar.b) && this.c == fgtVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ua80.b(u0f0.r.hashCode() * 31, 31, this.f9508a)) * 31);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return u0f0.r;
    }

    public final String toString() {
        return "GenderFieldUiModel(registrationFieldType=" + u0f0.r + ", title=" + this.f9508a + ", dsChipUiModel=" + this.b + ", isError=" + this.c + Separators.RPAREN;
    }
}
