package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i3f implements c4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14093a;

    public i3f(ArrayList arrayList) {
        this.f14093a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3f) && this.f14093a.equals(((i3f) obj).f14093a);
    }

    public final int hashCode() {
        return this.f14093a.hashCode();
    }

    public final String toString() {
        return hne.o("ShowBetSystemTypesChangeDialog(couponTypes=", Separators.RPAREN, this.f14093a);
    }
}
