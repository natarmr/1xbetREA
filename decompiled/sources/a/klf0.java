package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class klf0 implements mlf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18484a;
    public final ArrayList b;

    public klf0(String str, ArrayList arrayList) {
        this.f18484a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klf0)) {
            return false;
        }
        klf0 klf0Var = (klf0) obj;
        return this.f18484a.equals(klf0Var.f18484a) && this.b.equals(klf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18484a.hashCode() * 31);
    }

    public final String toString() {
        return "ImagesMessage(text=" + this.f18484a + ", imageInfoList=" + this.b + Separators.RPAREN;
    }
}
