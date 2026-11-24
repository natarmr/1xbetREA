package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wxw<T> {
    public static final uxw Companion = new uxw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39949a;
    public final Object b;

    static {
        zna0 zna0Var = new zna0("org.xplatform.promotions.web_view.webview_messages.IframeMessageWrapper", null, 2);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j(RemoteMessageConst.DATA, true);
    }

    public /* synthetic */ wxw(int i, String str, Object obj) {
        if ((i & 1) == 0) {
            this.f39949a = null;
        } else {
            this.f39949a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = obj;
        }
    }
}
