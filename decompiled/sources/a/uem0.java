package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uem0 implements wem0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35537a;
    public final fko0 b;

    public uem0(String str, fko0 fko0Var) {
        str.getClass();
        this.f35537a = str;
        this.b = fko0Var;
    }

    @Override // a.wem0
    public final fko0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uem0)) {
            return false;
        }
        uem0 uem0Var = (uem0) obj;
        return Intrinsics.d(this.f35537a, uem0Var.f35537a) && this.b.equals(uem0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35537a.hashCode() * 31);
    }

    public final String toString() {
        return "Rectangle(title=" + this.f35537a + ", tableItemTypeColored=" + this.b + Separators.RPAREN;
    }
}
