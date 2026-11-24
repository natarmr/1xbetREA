package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dx5<T> {
    public static final cx5 Companion = new cx5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uhi0 f6831a;
    public final Object b;

    static {
        zna0 zna0Var = new zna0("org.xplatform.onexcore.data.model.BaseDataResponse", null, 2);
        zna0Var.j("error", true);
        zna0Var.j(RemoteMessageConst.DATA, true);
    }

    public /* synthetic */ dx5(int i, uhi0 uhi0Var, Object obj) {
        if ((i & 1) == 0) {
            this.f6831a = null;
        } else {
            this.f6831a = uhi0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = obj;
        }
    }

    public final Object a() throws zhi0 {
        uhi0 uhi0Var = this.f6831a;
        if (uhi0Var != null) {
            throw new zhi0(uhi0Var);
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        jf4.k(null);
        return null;
    }
}
