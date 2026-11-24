package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class qyg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rwc f29533a;

    public qyg0(rwc rwcVar) {
        rwcVar.getClass();
        this.f29533a = rwcVar;
    }

    public final Object a(int i, zje zjeVar) {
        rwc rwcVar = this.f29533a;
        if (rwcVar.g.a().getLong("FIRST_SAVE_SEEN_BANNER_TIMESTAMP", 0L) == 0) {
            rwcVar.g.f("FIRST_SAVE_SEEN_BANNER_TIMESTAMP", System.currentTimeMillis());
        }
        Object objA = rwcVar.c.A(i, zjeVar);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }
}
