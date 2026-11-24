package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wz6 extends xz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40008a;

    public wz6(ArrayList arrayList) {
        this.f40008a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wz6) && this.f40008a.equals(((wz6) obj).f40008a);
    }

    public final int hashCode() {
        return this.f40008a.hashCode();
    }

    public final String toString() {
        return hne.o("UpdateRotations(info=", Separators.RPAREN, this.f40008a);
    }
}
