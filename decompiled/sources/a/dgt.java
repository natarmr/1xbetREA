package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dgt implements x0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6056a;
    public final fyl b;
    public final boolean c;

    public dgt(String str, fyl fylVar, boolean z) {
        u0f0 u0f0Var = u0f0.f34852a;
        str.getClass();
        this.f6056a = str;
        this.b = fylVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgt)) {
            return false;
        }
        dgt dgtVar = (dgt) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return Intrinsics.d(this.f6056a, dgtVar.f6056a) && this.b.equals(dgtVar.b) && this.c == dgtVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ua80.b(u0f0.r.hashCode() * 31, 31, this.f6056a)) * 31);
    }

    @Override // a.x0f0
    public final u0f0 q() {
        return u0f0.r;
    }

    public final String toString() {
        return "GenderFieldUiModel(registrationFieldType=" + u0f0.r + ", title=" + this.f6056a + ", dsChipUiModel=" + this.b + ", isError=" + this.c + Separators.RPAREN;
    }
}
