package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class twc0 implements wwc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34645a;
    public final Map b;

    public twc0(String str, Map map) {
        map.getClass();
        this.f34645a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twc0)) {
            return false;
        }
        twc0 twc0Var = (twc0) obj;
        return this.f34645a.equals(twc0Var.f34645a) && Intrinsics.d(this.b, twc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34645a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadUrlInWebView(url=" + this.f34645a + ", headers=" + this.b + Separators.RPAREN;
    }
}
