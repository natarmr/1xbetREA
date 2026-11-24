package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class plw implements rlw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27204a;

    public plw(ArrayList arrayList) {
        this.f27204a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof plw) && this.f27204a.equals(((plw) obj).f27204a);
    }

    public final int hashCode() {
        return this.f27204a.hashCode();
    }

    public final String toString() {
        return hne.o("Filter(items=", Separators.RPAREN, this.f27204a);
    }
}
