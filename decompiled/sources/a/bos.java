package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bos {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2950a;
    public final List b;

    public bos(String str, List list) {
        str.getClass();
        list.getClass();
        this.f2950a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bos)) {
            return false;
        }
        bos bosVar = (bos) obj;
        return Intrinsics.d(this.f2950a, bosVar.f2950a) && Intrinsics.d(this.b, bosVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2950a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("GamePeriodEventsModel(periodTitle=", this.f2950a, ", events=", this.b, Separators.RPAREN);
    }
}
