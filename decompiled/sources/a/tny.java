package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tny {
    public static final tny c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f34258a;
    public final String b;

    static {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        c = new tny("event", lunVar);
    }

    public tny(String str, Map map) {
        map.getClass();
        this.f34258a = map;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tny)) {
            return false;
        }
        tny tnyVar = (tny) obj;
        return Intrinsics.d(this.f34258a, tnyVar.f34258a) && Intrinsics.d(this.b, tnyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34258a.hashCode() * 31);
    }

    public final String toString() {
        return "KibanaParameters(values=" + this.f34258a + ", logType=" + this.b + Separators.RPAREN;
    }
}
