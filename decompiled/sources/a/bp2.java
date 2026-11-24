package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class bp2 implements ep2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2958a;

    public bp2(ArrayList arrayList) {
        this.f2958a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp2) && this.f2958a.equals(((bp2) obj).f2958a);
    }

    public final int hashCode() {
        return this.f2958a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(alternativeInfoList=", Separators.RPAREN, this.f2958a);
    }
}
