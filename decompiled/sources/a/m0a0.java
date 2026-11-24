package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m0a0 implements p0a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20944a;
    public final mdm b;

    public m0a0(String str, mdm mdmVar) {
        str.getClass();
        this.f20944a = str;
        this.b = mdmVar;
    }

    @Override // a.p0a0
    public final String a() {
        return this.f20944a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0a0)) {
            return false;
        }
        m0a0 m0a0Var = (m0a0) obj;
        return Intrinsics.d(this.f20944a, m0a0Var.f20944a) && this.b.equals(m0a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20944a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(screenTitle=" + this.f20944a + ", config=" + this.b + Separators.RPAREN;
    }
}
