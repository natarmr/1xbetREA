package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class bdz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2423a = new HashMap();
    public final HashMap b = new HashMap();

    public final d9z a(String str, fet fetVar) {
        fetVar.e0(274918241);
        HashMap map = this.b;
        Object objA = map.get(str);
        if (objA == null) {
            objA = f9z.a(fetVar);
            map.put(str, objA);
        }
        d9z d9zVar = (d9z) objA;
        fetVar.r(false);
        return d9zVar;
    }

    public final xcz b(String str, fet fetVar) {
        fetVar.e0(-1457748895);
        HashMap map = this.f2423a;
        Object objA = map.get(str);
        if (objA == null) {
            objA = ddz.a(0, 0, fetVar, 0, 3);
            map.put(str, objA);
        }
        xcz xczVar = (xcz) objA;
        fetVar.r(false);
        return xczVar;
    }
}
