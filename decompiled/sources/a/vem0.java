package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vem0 implements wem0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37293a;
    public final fko0 b;

    public vem0(String str, fko0 fko0Var) {
        str.getClass();
        this.f37293a = str;
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
        if (!(obj instanceof vem0)) {
            return false;
        }
        vem0 vem0Var = (vem0) obj;
        return Intrinsics.d(this.f37293a, vem0Var.f37293a) && this.b.equals(vem0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37293a.hashCode() * 31);
    }

    public final String toString() {
        return "Square(title=" + this.f37293a + ", tableItemTypeColored=" + this.b + Separators.RPAREN;
    }
}
