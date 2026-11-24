package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class egt implements y0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7777a;
    public final fyl b;
    public final boolean c;

    public egt(String str, fyl fylVar, boolean z) {
        u0f0 u0f0Var = u0f0.f34852a;
        str.getClass();
        this.f7777a = str;
        this.b = fylVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egt)) {
            return false;
        }
        egt egtVar = (egt) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return Intrinsics.d(this.f7777a, egtVar.f7777a) && this.b.equals(egtVar.b) && this.c == egtVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ua80.b(u0f0.r.hashCode() * 31, 31, this.f7777a)) * 31);
    }

    @Override // a.y0f0
    public final u0f0 q() {
        return u0f0.r;
    }

    public final String toString() {
        return "GenderFieldUiModel(registrationFieldType=" + u0f0.r + ", title=" + this.f7777a + ", dsChipUiModel=" + this.b + ", isError=" + this.c + Separators.RPAREN;
    }
}
