package a;

import com.vk.dto.common.id.UserId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41528a;
    public final String b;
    public final int c;
    public final long d;
    public final UserId e;

    public xut0(int i, long j, UserId userId, String str, String str2) {
        str.getClass();
        userId.getClass();
        this.f41528a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xut0)) {
            return false;
        }
        xut0 xut0Var = (xut0) obj;
        return Intrinsics.d(this.f41528a, xut0Var.f41528a) && Intrinsics.d(this.b, xut0Var.b) && this.c == xut0Var.c && this.d == xut0Var.d && Intrinsics.d(this.e, xut0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f41528a.hashCode() * 31;
        String str = this.b;
        return Long.hashCode(this.e.f46053a) + rw2.b(twn.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "VKApiCredentials(accessToken=" + this.f41528a + ", secret=" + this.b + ", expiresInSec=" + this.c + ", createdMs=" + this.d + ", userId=" + this.e + ')';
    }
}
