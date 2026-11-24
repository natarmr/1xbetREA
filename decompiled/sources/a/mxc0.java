package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mxc0 implements pxc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22547a;
    public final Map b;

    public mxc0(String str, Map map) {
        map.getClass();
        this.f22547a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxc0)) {
            return false;
        }
        mxc0 mxc0Var = (mxc0) obj;
        return this.f22547a.equals(mxc0Var.f22547a) && Intrinsics.d(this.b, mxc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22547a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadUrlInWebView(url=" + this.f22547a + ", headers=" + this.b + Separators.RPAREN;
    }
}
