package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ojc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25351a;
    public final List b;
    public final boolean c;

    public ojc(String str, lc00 lc00Var, boolean z) {
        lc00Var.getClass();
        this.f25351a = str;
        this.b = lc00Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojc)) {
            return false;
        }
        ojc ojcVar = (ojc) obj;
        return this.f25351a.equals(ojcVar.f25351a) && Intrinsics.d(this.b, ojcVar.b) && this.c == ojcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dw9.a(this.f25351a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(defpackage.c.f("CircuitUiModel(title=", this.f25351a, ", infoItemUiModelList=", this.b, ", collapsed="), this.c, Separators.RPAREN);
    }
}
