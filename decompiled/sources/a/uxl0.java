package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uxl0 implements xxl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36446a;
    public final mdm b;

    public uxl0(String str, mdm mdmVar) {
        str.getClass();
        this.f36446a = str;
        this.b = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxl0)) {
            return false;
        }
        uxl0 uxl0Var = (uxl0) obj;
        return Intrinsics.d(this.f36446a, uxl0Var.f36446a) && this.b.equals(uxl0Var.b);
    }

    @Override // a.xxl0
    public final String getTitle() {
        return this.f36446a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36446a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(title=" + this.f36446a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
