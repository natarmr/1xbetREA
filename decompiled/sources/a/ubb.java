package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ubb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35371a;
    public final String b;

    public ubb(List list, String str) {
        list.getClass();
        str.getClass();
        this.f35371a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubb)) {
            return false;
        }
        ubb ubbVar = (ubb) obj;
        return Intrinsics.d(this.f35371a, ubbVar.f35371a) && Intrinsics.d(this.b, ubbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35371a.hashCode() * 31);
    }

    public final String toString() {
        return "ChampEventModel(games=" + this.f35371a + ", champImage=" + this.b + Separators.RPAREN;
    }
}
