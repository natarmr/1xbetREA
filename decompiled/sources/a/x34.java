package a;

import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sje f40198a;
    public final vqc b;
    public final Object c;
    public final LinkedHashMap d;
    public final CopyOnWriteArrayList e;

    public x34(qcq0 qcq0Var, r1a r1aVar, bby bbyVar) {
        qcq0Var.getClass();
        r1aVar.getClass();
        bbyVar.getClass();
        this.f40198a = d5c.a(kotlin.coroutines.e.c(new kin0(bbyVar), kotlin.coroutines.e.c(qcq0Var.h, new rne("CXCP-AudioRestrictionControllerImpl"))));
        this.b = new vqc((byte) 8);
        this.c = new Object();
        this.d = new LinkedHashMap();
        this.e = new CopyOnWriteArrayList();
        r1aVar.a(p1a.b, new w1((Object) this, (byte) 14));
    }

    public final y34 a() {
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap.containsValue(new y34(3))) {
            return new y34(3);
        }
        synchronized (this.c) {
        }
        if (linkedHashMap.containsValue(new y34(1))) {
            return new y34(1);
        }
        synchronized (this.c) {
        }
        if (linkedHashMap.containsValue(new y34(0))) {
            return new y34(0);
        }
        synchronized (this.c) {
        }
        return null;
    }
}
