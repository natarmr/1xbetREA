package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ox5<T> {
    public static final kx5 Companion = new kx5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx5 f25994a;

    static {
        new zna0("org.xplatform.app_start.impl.data.model.response.BaseDictionaryResponse", null, 1).j(RemoteMessageConst.DATA, true);
    }

    public /* synthetic */ ox5(int i, nx5 nx5Var) {
        if ((i & 1) == 0) {
            this.f25994a = null;
        } else {
            this.f25994a = nx5Var;
        }
    }

    public final Pair a() {
        Object obj;
        nx5 nx5Var = this.f25994a;
        edy edyVar = nx5Var != null ? nx5Var.c : null;
        if (nx5Var == null || (obj = nx5Var.b) == null) {
            obj = iun.f15405a;
        }
        if (nx5Var == null) {
            jf4.k(null);
            return null;
        }
        if (edyVar != null) {
            throw new zhi0();
        }
        Long l = nx5Var.f24265a;
        return new Pair(obj, Long.valueOf(l != null ? l.longValue() : 0L));
    }
}
