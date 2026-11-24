package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jnb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knb f16804a;
    public final List b;

    public jnb(knb knbVar, List list) {
        list.getClass();
        this.f16804a = knbVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnb)) {
            return false;
        }
        jnb jnbVar = (jnb) obj;
        return this.f16804a.equals(jnbVar.f16804a) && Intrinsics.d(this.b, jnbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16804a.hashCode() * 31);
    }

    public final String toString() {
        return "ChampsWithLiveExpressTabsModel(champsWithTabsModel=" + this.f16804a + ", liveExpressTabs=" + this.b + Separators.RPAREN;
    }
}
