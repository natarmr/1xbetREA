package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f44188a = new HashMap();

    public zcz() {
        new HashMap();
    }

    public final xcz a(String str, fet fetVar) {
        fetVar.e0(-1786557240);
        HashMap map = this.f44188a;
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
