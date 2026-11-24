package a;

import a.kuw;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nz5<T, Z extends kuw> {
    public static final jz5 Companion = new jz5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24357a;
    public final mz5 b;

    static {
        zna0 zna0Var = new zna0("org.xplatform.core.data.BaseJsonResponse", null, 2);
        zna0Var.j(RemoteMessageConst.DATA, true);
        zna0Var.j("error", true);
    }

    public /* synthetic */ nz5(int i, Object obj, mz5 mz5Var) {
        if ((i & 1) == 0) {
            this.f24357a = null;
        } else {
            this.f24357a = obj;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = mz5Var;
        }
    }

    public final Object a() throws zhi0 {
        mz5 mz5Var = this.b;
        if (mz5Var != null) {
            String str = mz5Var.b;
            if (str == null) {
                str = "";
            }
            throw new zhi0(str, mz5Var.d, (Integer) null, 12);
        }
        Object obj = this.f24357a;
        if (obj != null) {
            return obj;
        }
        jf4.k(null);
        return null;
    }
}
