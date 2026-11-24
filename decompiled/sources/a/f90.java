package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f90 extends h90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9132a;

    public f90(ArrayList arrayList) {
        this.f9132a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f90) && this.f9132a.equals(((f90) obj).f9132a);
    }

    public final int hashCode() {
        return this.f9132a.hashCode();
    }

    public final String toString() {
        return hne.o("ShowChips(betTypeList=", Separators.RPAREN, this.f9132a);
    }
}
