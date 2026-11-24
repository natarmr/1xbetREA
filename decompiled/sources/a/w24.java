package a;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w24 implements lin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38432a;
    public final /* synthetic */ Context b;

    public /* synthetic */ w24(Context context, byte b) {
        this.f38432a = b;
        this.b = context;
    }

    @Override // a.lin0
    public final Object get() {
        rsj rsjVar;
        byte b = this.f38432a;
        Context context = this.b;
        switch (b) {
            case 0:
                return b34.g0(context);
            case 1:
                return new pwj(context);
            case 2:
                return new pwj(context);
            case 3:
                return new gwj(new hsj(context), new huj());
            case 4:
                return new syj(context);
            default:
                rcf0 rcf0Var = rsj.p;
                synchronized (rsj.class) {
                    rsjVar = rsj.v;
                    if (rsjVar == null) {
                        Context applicationContext = context == null ? null : context.getApplicationContext();
                        HashMap map = new HashMap(8);
                        map.put(0, 1000000L);
                        map.put(2, -9223372036854775807L);
                        map.put(3, -9223372036854775807L);
                        map.put(4, -9223372036854775807L);
                        map.put(5, -9223372036854775807L);
                        map.put(10, -9223372036854775807L);
                        map.put(9, -9223372036854775807L);
                        map.put(7, -9223372036854775807L);
                        rsjVar = new rsj(applicationContext, map);
                        rsj.v = rsjVar;
                    }
                    break;
                }
                return rsjVar;
        }
    }
}
