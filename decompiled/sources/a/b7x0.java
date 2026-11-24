package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b7x0 {
    public static final icw0 b = icw0.a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2129a;

    public b7x0(HashMap map) {
        this.f2129a = map;
    }

    public final Iterable a(byte[] bArr) {
        List list;
        icw0 icw0Var = b;
        HashMap map = this.f2129a;
        List list2 = (List) map.get(icw0Var);
        if (bArr.length >= 5) {
            list = (List) map.get(new icw0(bArr, 5 > bArr.length ? bArr.length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new d0l0(this, list, list2);
    }
}
