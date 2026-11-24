package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class z0s0 implements d1s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43585a;

    public z0s0(ArrayList arrayList) {
        this.f43585a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0s0) && this.f43585a.equals(((z0s0) obj).f43585a);
    }

    public final int hashCode() {
        return this.f43585a.hashCode();
    }

    public final String toString() {
        return hne.o("CsModel(statistic=", Separators.RPAREN, this.f43585a);
    }
}
