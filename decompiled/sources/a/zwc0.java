package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zwc0 implements bxc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd50 f45099a;
    public final mdm b;

    public zwc0(hd50 hd50Var, mdm mdmVar) {
        hd50Var.getClass();
        this.f45099a = hd50Var;
        this.b = mdmVar;
    }

    @Override // a.bxc0
    public final hd50 a() {
        return this.f45099a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwc0)) {
            return false;
        }
        zwc0 zwc0Var = (zwc0) obj;
        return Intrinsics.d(this.f45099a, zwc0Var.f45099a) && this.b.equals(zwc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f45099a.f12854a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navigationBarUiState=" + this.f45099a + ", config=" + this.b + Separators.RPAREN;
    }
}
