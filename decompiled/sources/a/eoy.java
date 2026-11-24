package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class eoy implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8159a;
    public final ArrayList b;

    public eoy(ArrayList arrayList, List list) {
        list.getClass();
        this.f8159a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoy)) {
            return false;
        }
        eoy eoyVar = (eoy) obj;
        return Intrinsics.d(this.f8159a, eoyVar.f8159a) && this.b.equals(eoyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8159a.hashCode() * 31);
    }

    public final String toString() {
        return "KillerJokerModel(cards=" + this.f8159a + ", allCards=" + this.b + Separators.RPAREN;
    }
}
