package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class voy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37787a;
    public final Map b;

    public voy(String str, Map map) {
        str.getClass();
        map.getClass();
        this.f37787a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voy)) {
            return false;
        }
        voy voyVar = (voy) obj;
        return Intrinsics.d(this.f37787a, voyVar.f37787a) && Intrinsics.d(this.b, voyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37787a.hashCode() * 31);
    }

    public final String toString() {
        return Separators.AT + this.f37787a + '(' + CollectionsKt.b0(zp20.q(this.b), null, null, null, j9x.s, 31) + ')';
    }
}
