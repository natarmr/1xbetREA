package a;

import com.google.android.gms.common.api.Scope;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u9w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kmx f35303a = new kmx((byte) 1);

    static {
        new Scope(1, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        new Scope(1, "email");
    }
}
