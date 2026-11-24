package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l0a0 implements p0a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19190a;
    public final mdm b;

    public l0a0(String str, mdm mdmVar) {
        str.getClass();
        this.f19190a = str;
        this.b = mdmVar;
    }

    @Override // a.p0a0
    public final String a() {
        return this.f19190a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0a0)) {
            return false;
        }
        l0a0 l0a0Var = (l0a0) obj;
        return Intrinsics.d(this.f19190a, l0a0Var.f19190a) && this.b.equals(l0a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19190a.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(screenTitle=" + this.f19190a + ", config=" + this.b + Separators.RPAREN;
    }
}
