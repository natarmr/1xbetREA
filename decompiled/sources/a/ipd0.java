package a;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ipd0 {
    public static final hpd0 b = new hpd0(true, null, null);
    public static final ipd0 c = new ipd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hng f15158a;

    public ipd0() {
        hng hngVar = new hng();
        hngVar.c = new Object();
        hngVar.f13350a = 0;
        hngVar.b = false;
        hngVar.e = new HashMap();
        hngVar.f = new CopyOnWriteArraySet();
        hngVar.d = new AtomicReference(b);
        this.f15158a = hngVar;
    }
}
