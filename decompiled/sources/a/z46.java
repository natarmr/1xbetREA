package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class z46<R> {
    public static final y46 Companion = new y46();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43753a;
    public final Integer b;

    static {
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.BaseWebSocketResponse", null, 2);
        zna0Var.j(RemoteMessageConst.DATA, true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
    }

    public /* synthetic */ z46(int i, Object obj, Integer num) {
        if ((i & 1) == 0) {
            this.f43753a = null;
        } else {
            this.f43753a = obj;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z46)) {
            return false;
        }
        z46 z46Var = (z46) obj;
        return Intrinsics.d(this.f43753a, z46Var.f43753a) && Intrinsics.d(this.b, z46Var.b);
    }

    public final int hashCode() {
        Object obj = this.f43753a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "BaseWebSocketResponse(data=" + this.f43753a + ", status=" + this.b + Separators.RPAREN;
    }
}
