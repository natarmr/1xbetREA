package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tgd {
    public static final sgd Companion = new sgd();
    public static final a8z[] c = {maz.a(wez.f39042a, new a7d(11)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f33904a;
    public final Long b;

    public /* synthetic */ tgd(int i, Map map, Long l) {
        if ((i & 1) == 0) {
            this.f33904a = null;
        } else {
            this.f33904a = map;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgd)) {
            return false;
        }
        tgd tgdVar = (tgd) obj;
        return Intrinsics.d(this.f33904a, tgdVar.f33904a) && Intrinsics.d(this.b, tgdVar.b);
    }

    public final int hashCode() {
        Map map = this.f33904a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "ComponentsDataInfoModel(componentsData=" + this.f33904a + ", timestamp=" + this.b + Separators.RPAREN;
    }

    public tgd(Map map, Long l) {
        this.f33904a = map;
        this.b = l;
    }
}
