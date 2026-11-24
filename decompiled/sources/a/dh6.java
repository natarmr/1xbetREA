package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class dh6 implements eh6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6078a;

    public dh6(ArrayList arrayList) {
        this.f6078a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh6) && this.f6078a.equals(((dh6) obj).f6078a);
    }

    public final int hashCode() {
        return this.f6078a.hashCode();
    }

    public final String toString() {
        return hne.o("Success(items=", Separators.RPAREN, this.f6078a);
    }
}
