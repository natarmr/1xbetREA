package a;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class djc implements jwb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final djc f6178a = new djc();

    @Override // a.jwb0
    public final Class a() {
        return cjc.class;
    }

    @Override // a.jwb0
    public final Class b() {
        return cjc.class;
    }

    @Override // a.jwb0
    public final Object c(gxu gxuVar) throws GeneralSecurityException {
        if (((fwb0) gxuVar.b) == null) {
            hny.o("no primary in primitive set");
            return null;
        }
        Iterator it = ((ConcurrentMap) gxuVar.f12096a).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new cjc();
    }
}
