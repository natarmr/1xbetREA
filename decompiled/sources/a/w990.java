package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w990 implements ea90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38769a;
    public final Map b;

    public w990(String str, Map map) {
        str.getClass();
        map.getClass();
        this.f38769a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w990)) {
            return false;
        }
        w990 w990Var = (w990) obj;
        return Intrinsics.d(this.f38769a, w990Var.f38769a) && Intrinsics.d(this.b, w990Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38769a.hashCode() * 31);
    }

    public final String toString() {
        return "ReloadWebView(url=" + this.f38769a + ", extraHeaders=" + this.b + Separators.RPAREN;
    }
}
