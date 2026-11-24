package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class luo {
    public static final luo b = new luo(aac.f0(new LinkedHashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20682a;

    public luo(Map map) {
        this.f20682a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof luo) && Intrinsics.d(this.f20682a, ((luo) obj).f20682a);
    }

    public final int hashCode() {
        return this.f20682a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.f20682a + Separators.RPAREN;
    }
}
