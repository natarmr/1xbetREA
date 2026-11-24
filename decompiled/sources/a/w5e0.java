package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w5e0 implements z5e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38580a;
    public final mdm b;

    public w5e0(String str, mdm mdmVar) {
        str.getClass();
        this.f38580a = str;
        this.b = mdmVar;
    }

    @Override // a.z5e0
    public final String a() {
        return this.f38580a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5e0)) {
            return false;
        }
        w5e0 w5e0Var = (w5e0) obj;
        return Intrinsics.d(this.f38580a, w5e0Var.f38580a) && this.b.equals(w5e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38580a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(screenTitle=" + this.f38580a + ", config=" + this.b + Separators.RPAREN;
    }
}
