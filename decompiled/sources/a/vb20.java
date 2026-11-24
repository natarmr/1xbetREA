package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vb20 implements xc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37120a;

    public vb20(ArrayList arrayList) {
        this.f37120a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb20) && this.f37120a.equals(((vb20) obj).f37120a);
    }

    public final int hashCode() {
        return this.f37120a.hashCode();
    }

    public final String toString() {
        return hne.o("ShowBetSystemTypesChangeDialog(couponTypes=", Separators.RPAREN, this.f37120a);
    }
}
