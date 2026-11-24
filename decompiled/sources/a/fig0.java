package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class fig0 {
    public static final eig0 Companion = new eig0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new j6g0(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9586a;
    public final Map b;

    public /* synthetic */ fig0(int i, String str, Map map) {
        if ((i & 1) == 0) {
            this.f9586a = null;
        } else {
            this.f9586a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fig0)) {
            return false;
        }
        fig0 fig0Var = (fig0) obj;
        return Intrinsics.d(this.f9586a, fig0Var.f9586a) && Intrinsics.d(this.b, fig0Var.b);
    }

    public final int hashCode() {
        String str = this.f9586a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "RpcProps(id=" + this.f9586a + ", props=" + this.b + Separators.RPAREN;
    }

    public fig0(String str, Map map) {
        this.f9586a = str;
        this.b = map;
    }
}
