package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class btk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3186a;
    public final String b;

    public btk(List list, String str) {
        list.getClass();
        str.getClass();
        this.f3186a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btk)) {
            return false;
        }
        btk btkVar = (btk) obj;
        return Intrinsics.d(this.f3186a, btkVar.f3186a) && Intrinsics.d(this.b, btkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3186a.hashCode() * 31);
    }

    public final String toString() {
        return "DisciplineEventsModel(games=" + this.f3186a + ", sportImageUrl=" + this.b + Separators.RPAREN;
    }
}
