package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xxw<T> {
    public static final vxw Companion = new vxw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41678a;
    public final Object b;

    static {
        zna0 zna0Var = new zna0("org.xplatform.promotions.loyalty.impl.presentation.models.IframeMessageWrapper", null, 2);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j(RemoteMessageConst.DATA, true);
    }

    public /* synthetic */ xxw(int i, String str, Object obj) {
        if ((i & 1) == 0) {
            this.f41678a = null;
        } else {
            this.f41678a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = obj;
        }
    }
}
