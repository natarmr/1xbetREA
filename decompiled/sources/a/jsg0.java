package a;

import android.javax.sip.message.Response;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class jsg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f17050a;

    static {
        HashMap map = new HashMap(13);
        f17050a = map;
        Integer numValueOf = Integer.valueOf(Response.BAD_REQUEST);
        map.put("normal", numValueOf);
        map.put("bold", 700);
        kng0.x(1, map, "bolder", -1, "lighter");
        kng0.x(100, map, "100", Response.OK, "200");
        map.put("300", 300);
        map.put("400", numValueOf);
        kng0.x(500, map, "500", Response.BUSY_EVERYWHERE, "600");
        dw9.B(map, "700", 700, 800, "800");
        map.put("900", 900);
    }
}
