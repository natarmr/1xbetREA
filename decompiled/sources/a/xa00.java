package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xa00 implements cb00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40530a;
    public final mdm b;

    public xa00(String str, mdm mdmVar) {
        str.getClass();
        this.f40530a = str;
        this.b = mdmVar;
    }

    @Override // a.cb00
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa00)) {
            return false;
        }
        xa00 xa00Var = (xa00) obj;
        return Intrinsics.d(this.f40530a, xa00Var.f40530a) && this.b.equals(xa00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ua80.b(Boolean.hashCode(false) * 31, 31, this.f40530a);
    }

    public final String toString() {
        return "Error(hasHeader=false, title=" + this.f40530a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
