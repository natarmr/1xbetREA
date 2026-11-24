package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class pyg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cu5 f27800a;

    public pyg0(cu5 cu5Var) {
        cu5Var.getClass();
        this.f27800a = cu5Var;
    }

    public final Object a(int i, zje zjeVar) {
        cu5 cu5Var = this.f27800a;
        if (cu5Var.f.a().getLong("FIRST_SAVE_SEEN_CMS_BANNER_TIMESTAMP", 0L) == 0) {
            cu5Var.f.f("FIRST_SAVE_SEEN_CMS_BANNER_TIMESTAMP", System.currentTimeMillis());
        }
        Object objB = cu5Var.b.b(i, zjeVar);
        wne wneVar = wne.f39444a;
        if (objB != wneVar) {
            objB = Unit.f46060a;
        }
        return objB == wneVar ? objB : Unit.f46060a;
    }
}
