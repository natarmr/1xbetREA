package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ewo0 implements hwo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f8537a;
    public final ArrayList b;

    public ewo0(ank0 ank0Var, ArrayList arrayList) {
        this.f8537a = ank0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewo0)) {
            return false;
        }
        ewo0 ewo0Var = (ewo0) obj;
        return this.f8537a.equals(ewo0Var.f8537a) && this.b.equals(ewo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8537a.f1159a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(headerValue=" + this.f8537a + ", taxModels=" + this.b + Separators.RPAREN;
    }
}
