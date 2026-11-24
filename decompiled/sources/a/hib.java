package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hib implements jib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13105a;
    public final Map b;

    public hib(String str, Map map) {
        map.getClass();
        this.f13105a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hib)) {
            return false;
        }
        hib hibVar = (hib) obj;
        return this.f13105a.equals(hibVar.f13105a) && Intrinsics.d(this.b, hibVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13105a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadUrlInWebView(url=" + this.f13105a + ", headers=" + this.b + Separators.RPAREN;
    }
}
