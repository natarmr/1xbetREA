package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class j4v0<T> implements o4v0 {
    public static final i4v0 Companion = new i4v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15903a;
    public final Object b;
    public final Integer c;

    static {
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.WebSocketRequest.ClientRequestWithoutResponse", null, 3);
        zna0Var.j("target", true);
        zna0Var.j("payload", true);
        zna0Var.j("$type", true);
    }

    public /* synthetic */ j4v0(int i, String str, Object obj, Integer num) {
        if ((i & 1) == 0) {
            this.f15903a = null;
        } else {
            this.f15903a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = obj;
        }
        if ((i & 4) == 0) {
            this.c = 1;
        } else {
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4v0)) {
            return false;
        }
        j4v0 j4v0Var = (j4v0) obj;
        return Intrinsics.d(this.f15903a, j4v0Var.f15903a) && Intrinsics.d(this.b, j4v0Var.b) && Intrinsics.d(this.c, j4v0Var.c);
    }

    public final int hashCode() {
        String str = this.f15903a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientRequestWithoutResponse(methodName=");
        sb.append(this.f15903a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append(", type=");
        return dw9.q(sb, this.c, Separators.RPAREN);
    }

    public j4v0(edy edyVar, String str) {
        this.f15903a = str;
        this.b = edyVar;
        this.c = 1;
    }
}
