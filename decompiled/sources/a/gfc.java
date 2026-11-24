package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gfc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f11202a;
    public final a4x b;

    public gfc(imm immVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f11202a = immVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfc)) {
            return false;
        }
        gfc gfcVar = (gfc) obj;
        return this.f11202a.equals(gfcVar.f11202a) && Intrinsics.d(this.b, gfcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11202a.hashCode() * 31);
    }

    public final String toString() {
        return "ChooseCredsUiState(navigationBar=" + this.f11202a + ", creds=" + this.b + Separators.RPAREN;
    }
}
