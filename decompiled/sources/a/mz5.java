package a;

import a.kuw;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class mz5<Z extends kuw> {
    public static final lz5 Companion = new lz5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22636a;
    public final String b;
    public final Integer c;
    public final kuw d;

    static {
        zna0 zna0Var = new zna0("org.xplatform.core.data.BaseJsonResponse.Error", null, 4);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("title", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("errorCode", true);
    }

    public /* synthetic */ mz5(int i, String str, String str2, Integer num, kuw kuwVar) {
        if ((i & 1) == 0) {
            this.f22636a = null;
        } else {
            this.f22636a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = kuwVar;
        }
    }
}
