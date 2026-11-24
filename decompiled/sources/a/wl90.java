package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wl90 implements y0f0, sqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hnm f39343a;
    public final j3x b;
    public final boolean c;

    public wl90(hnm hnmVar, j3x j3xVar, boolean z) {
        u0f0 u0f0Var = u0f0.f34852a;
        this.f39343a = hnmVar;
        this.b = j3xVar;
        this.c = z;
    }

    @Override // a.sqq
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl90)) {
            return false;
        }
        wl90 wl90Var = (wl90) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f39343a.equals(wl90Var.f39343a) && Intrinsics.d(this.b, wl90Var.b) && this.c == wl90Var.c;
    }

    public final int hashCode() {
        int iHashCode = (this.f39343a.hashCode() + (u0f0.h.hashCode() * 31)) * 31;
        j3x j3xVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (j3xVar == null ? 0 : Integer.hashCode(j3xVar.f15856a))) * 31);
    }

    @Override // a.y0f0
    public final u0f0 q() {
        return u0f0.h;
    }

    public final String toString() {
        return "PhoneFieldUiModel(registrationFieldType=" + u0f0.h + ", dsPhoneTextFieldUiModel=" + this.f39343a + ", imeAction=" + this.b + ", isFocus=" + this.c + Separators.RPAREN;
    }
}
