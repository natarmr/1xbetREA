package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class iff implements kff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14684a;

    public iff(ArrayList arrayList) {
        this.f14684a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iff) && this.f14684a.equals(((iff) obj).f14684a);
    }

    public final int hashCode() {
        return this.f14684a.hashCode();
    }

    public final String toString() {
        return hne.o("UpdateField(fieldItems=", Separators.RPAREN, this.f14684a);
    }
}
