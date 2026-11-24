package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mlo0 implements nlo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22002a;
    public final fko0 b;
    public final slo0 c;

    public mlo0(String str, fko0 fko0Var, slo0 slo0Var) {
        str.getClass();
        this.f22002a = str;
        this.b = fko0Var;
        this.c = slo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlo0)) {
            return false;
        }
        mlo0 mlo0Var = (mlo0) obj;
        return Intrinsics.d(this.f22002a, mlo0Var.f22002a) && this.b.equals(mlo0Var.b) && this.c.equals(mlo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f22002a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Title(title=" + this.f22002a + ", tableItemTypeColored=" + this.b + ", viewType=" + this.c + Separators.RPAREN;
    }
}
