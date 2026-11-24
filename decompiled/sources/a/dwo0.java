package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class dwo0 implements gwo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f6810a;
    public final ArrayList b;

    public dwo0(ank0 ank0Var, ArrayList arrayList) {
        this.f6810a = ank0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwo0)) {
            return false;
        }
        dwo0 dwo0Var = (dwo0) obj;
        return this.f6810a.equals(dwo0Var.f6810a) && this.b.equals(dwo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6810a.f1159a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(headerValue=" + this.f6810a + ", taxUiModels=" + this.b + Separators.RPAREN;
    }
}
