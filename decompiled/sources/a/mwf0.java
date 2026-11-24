package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class mwf0 implements owf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22500a;
    public final swp0 b;

    public mwf0(ArrayList arrayList, swp0 swp0Var) {
        this.f22500a = arrayList;
        this.b = swp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwf0)) {
            return false;
        }
        mwf0 mwf0Var = (mwf0) obj;
        return this.f22500a.equals(mwf0Var.f22500a) && this.b.equals(mwf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22500a.hashCode() * 31);
    }

    public final String toString() {
        return "FilledAccount(fieldsList=" + this.f22500a + ", temporaryToken=" + this.b + Separators.RPAREN;
    }
}
