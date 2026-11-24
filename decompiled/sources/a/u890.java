package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u890 implements c990 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35223a;
    public final Map b;

    public u890(String str, Map map) {
        str.getClass();
        map.getClass();
        this.f35223a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u890)) {
            return false;
        }
        u890 u890Var = (u890) obj;
        return Intrinsics.d(this.f35223a, u890Var.f35223a) && Intrinsics.d(this.b, u890Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35223a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPayInUrlLoaded(url=" + this.f35223a + ", extraHeaders=" + this.b + Separators.RPAREN;
    }
}
