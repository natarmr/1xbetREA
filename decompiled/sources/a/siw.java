package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class siw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32281a;
    public final riw b;
    public final eiw c;
    public final q4t0 d;

    public siw(String str, riw riwVar, eiw eiwVar, q4t0 q4t0Var) {
        str.getClass();
        this.f32281a = str;
        this.b = riwVar;
        this.c = eiwVar;
        this.d = q4t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof siw)) {
            return false;
        }
        siw siwVar = (siw) obj;
        return Intrinsics.d(this.f32281a, siwVar.f32281a) && Intrinsics.d(this.b, siwVar.b) && this.c.equals(siwVar.c) && this.d.equals(siwVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f32281a;
    }

    public final int hashCode() {
        int iHashCode = this.f32281a.hashCode() * 31;
        riw riwVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (riwVar == null ? 0 : riwVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "HomeGameCardUiModel(key=" + this.f32281a + ", largeHeader=" + this.b + ", champHeader=" + this.c + ", peekingGameCardUiModel=" + this.d + Separators.RPAREN;
    }
}
