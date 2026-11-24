package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class heg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12922a;
    public final List b;

    public heg(String str, List list) {
        list.getClass();
        this.f12922a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heg)) {
            return false;
        }
        heg hegVar = (heg) obj;
        return this.f12922a.equals(hegVar.f12922a) && Intrinsics.d(this.b, hegVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12922a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CyberChampTeamModel(name=", this.f12922a, ", images=", this.b, Separators.RPAREN);
    }
}
