package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ujv0 {
    public static final List c;
    public static final List d;
    public static final List e;
    public static final Set f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35801a;
    public final int b;

    static {
        List listJ = q3d.j(0, Integer.valueOf(Response.BUSY_EVERYWHERE), 840);
        c = listJ;
        ArrayList arrayListQ0 = CollectionsKt.q0(listJ, q3d.j(1200, 1600));
        List listJ2 = q3d.j(0, Integer.valueOf(Response.TEMPORARILY_UNAVAILABLE), 900);
        d = listJ2;
        e = listJ2;
        f = cem0.q(listJ, listJ2);
        cem0.q(arrayListQ0, listJ2);
    }

    public ujv0(int i, int i2) {
        this.f35801a = i;
        this.b = i2;
        if (i < 0) {
            c99.s(brm0.l("Expected minWidthDp to be at least 0, minWidthDp: ", i, '.'));
            throw null;
        }
        if (i2 >= 0) {
            return;
        }
        c99.s(brm0.l("Expected minHeightDp to be at least 0, minHeightDp: ", i2, '.'));
        throw null;
    }

    public final boolean a(int i) {
        return this.f35801a >= i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ujv0.class != obj.getClass()) {
            return false;
        }
        ujv0 ujv0Var = (ujv0) obj;
        return this.f35801a == ujv0Var.f35801a && this.b == ujv0Var.b;
    }

    public final int hashCode() {
        return (this.f35801a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb.append(this.f35801a);
        sb.append(", minHeightDp=");
        return brm0.n(sb, this.b, ')');
    }

    public ujv0(float f2, float f3) {
        this((int) f2, (int) f3);
    }
}
