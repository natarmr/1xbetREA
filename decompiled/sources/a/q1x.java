package a;

import android.javax.sip.message.Response;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class q1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kuo f27974a = new kuo(iun.f15405a);
    public static final kuo b = new kuo(q7x.r(4096, 4096));
    public static final kuo c = new kuo(Boolean.FALSE);
    public static final kuo d = new kuo(Boolean.TRUE);

    public static final void a(k1x k1xVar) {
        kuo kuoVar = t1x.f33190a;
        k1xVar.b().a(t1x.f33190a, new mef(Response.OK));
    }

    public static final void b(k1x k1xVar, List list) {
        k1xVar.b().a(f27974a, aac.e0(list));
        String strB0 = CollectionsKt.b0(list, null, null, null, new adw(new kie0(), (byte) 9), 31);
        Map map = k1xVar.h;
        if (!Intrinsics.d(map, Boolean.valueOf(k1xVar.g))) {
            if (!(map instanceof Map)) {
                throw new AssertionError();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            k1xVar.h = linkedHashMap;
            k1xVar.g = true;
            map = linkedHashMap;
        }
        map.getClass();
        zys0.c(map).put("coil#transformations", strB0);
    }
}
