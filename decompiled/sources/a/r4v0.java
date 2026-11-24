package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class r4v0<T> {
    public static final q4v0 Companion = new q4v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29857a;
    public final String b;
    public final Integer c;
    public final int d;

    static {
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.WebSocketServerMessageResponse", null, 4);
        zna0Var.j("result", true);
        zna0Var.j("error", true);
        zna0Var.j("invocationId", true);
        zna0Var.j("$type", true);
    }

    public /* synthetic */ r4v0(int i, Object obj, String str, Integer num, int i2) {
        if ((i & 1) == 0) {
            this.f29857a = null;
        } else {
            this.f29857a = obj;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = 3;
        } else {
            this.d = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4v0)) {
            return false;
        }
        r4v0 r4v0Var = (r4v0) obj;
        return Intrinsics.d(this.f29857a, r4v0Var.f29857a) && Intrinsics.d(this.b, r4v0Var.b) && Intrinsics.d(this.c, r4v0Var.c) && this.d == r4v0Var.d;
    }

    public final int hashCode() {
        Object obj = this.f29857a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return Integer.hashCode(this.d) + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "WebSocketServerMessageResponse(result=" + this.f29857a + ", error=" + this.b + ", invocationId=" + this.c + ", type=" + this.d + Separators.RPAREN;
    }
}
