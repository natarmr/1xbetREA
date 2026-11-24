package a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class nho implements o5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23542a;

    public /* synthetic */ nho(byte b) {
        this.f23542a = b;
    }

    @Override // a.o5d0
    public final Object get() {
        switch (this.f23542a) {
            case 0:
                return Integer.valueOf(v2h0.d);
            case 1:
                return new jxv(Executors.newSingleThreadExecutor());
            default:
                uxs0 uxs0Var = new uxs0((byte) 10);
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    hny.u("Null flags");
                    return null;
                }
                map.put(mwb0.f22496a, new z45(set, 30000L, 86400000L));
                if (set == null) {
                    hny.u("Null flags");
                    return null;
                }
                map.put(mwb0.c, new z45(set, 1000L, 86400000L));
                if (set == null) {
                    hny.u("Null flags");
                    return null;
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(k2h0.b)));
                if (setUnmodifiableSet == null) {
                    hny.u("Null flags");
                    return null;
                }
                map.put(mwb0.b, new z45(setUnmodifiableSet, 86400000L, 86400000L));
                if (map.keySet().size() >= mwb0.values().length) {
                    new HashMap();
                    return new y45(uxs0Var, map);
                }
                jf4.n("Not all priorities have been configured");
                return null;
        }
    }
}
