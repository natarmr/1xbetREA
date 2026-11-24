package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w890 implements c990 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38712a;
    public final Map b;

    public w890(String str, Map map) {
        str.getClass();
        map.getClass();
        this.f38712a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w890)) {
            return false;
        }
        w890 w890Var = (w890) obj;
        return Intrinsics.d(this.f38712a, w890Var.f38712a) && Intrinsics.d(this.b, w890Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38712a.hashCode() * 31);
    }

    public final String toString() {
        return "RefreshAndLoad(url=" + this.f38712a + ", extraHeaders=" + this.b + Separators.RPAREN;
    }
}
