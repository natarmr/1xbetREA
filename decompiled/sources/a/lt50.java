package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class lt50 implements ot50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20614a;

    public lt50(ArrayList arrayList) {
        this.f20614a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lt50) && this.f20614a.equals(((lt50) obj).f20614a);
    }

    public final int hashCode() {
        return this.f20614a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(list=", Separators.RPAREN, this.f20614a);
    }
}
