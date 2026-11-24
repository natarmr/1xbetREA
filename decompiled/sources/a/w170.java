package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w170 implements y170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38385a;

    public w170(List list) {
        vqm vqmVar = vqm.f37862a;
        list.getClass();
        this.f38385a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w170) || !Intrinsics.d(this.f38385a, ((w170) obj).f38385a)) {
            return false;
        }
        vqm vqmVar = vqm.f37862a;
        return true;
    }

    public final int hashCode() {
        return vqm.f37862a.hashCode() + (this.f38385a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(items=" + this.f38385a + ", style=" + vqm.f37862a + Separators.RPAREN;
    }
}
