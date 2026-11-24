package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pl3 implements ql3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27162a;
    public final ml3 b;

    public pl3(String str, ml3 ml3Var) {
        str.getClass();
        this.f27162a = str;
        this.b = ml3Var;
    }

    @Override // a.ql3
    public final ml3 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl3)) {
            return false;
        }
        pl3 pl3Var = (pl3) obj;
        return Intrinsics.d(this.f27162a, pl3Var.f27162a) && this.b.equals(pl3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27162a.hashCode() * 31);
    }

    public final String toString() {
        return "FloatingButtonsStyle(label=" + this.f27162a + ", barStyle=" + this.b + Separators.RPAREN;
    }
}
