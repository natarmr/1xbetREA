package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class g4v0<T> implements o4v0 {
    public static final f4v0 Companion = new f4v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10687a;
    public final Integer b;
    public final Object c;
    public final Integer d;

    static {
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.WebSocketRequest.ClientRequest", null, 4);
        zna0Var.j("target", true);
        zna0Var.j("invocationId", true);
        zna0Var.j("payload", true);
        zna0Var.j("$type", true);
    }

    public /* synthetic */ g4v0(int i, String str, Integer num, Object obj, Integer num2) {
        if ((i & 1) == 0) {
            this.f10687a = null;
        } else {
            this.f10687a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = obj;
        }
        if ((i & 8) == 0) {
            this.d = 1;
        } else {
            this.d = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4v0)) {
            return false;
        }
        g4v0 g4v0Var = (g4v0) obj;
        return Intrinsics.d(this.f10687a, g4v0Var.f10687a) && Intrinsics.d(this.b, g4v0Var.b) && Intrinsics.d(this.c, g4v0Var.c) && Intrinsics.d(this.d, g4v0Var.d);
    }

    public final int hashCode() {
        String str = this.f10687a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.c;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "ClientRequest(methodName=", this.f10687a, ", invocationId=", ", payload=");
        sbP.append(this.c);
        sbP.append(", type=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }

    public g4v0(String str, Integer num, Object obj) {
        this.f10687a = str;
        this.b = num;
        this.c = obj;
        this.d = 1;
    }
}
