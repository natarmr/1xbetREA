package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gmv implements nwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11559a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gmv(Object obj, Object obj2, byte b) {
        this.f11559a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // a.nwk
    public final void a() {
        switch (this.f11559a) {
            case 0:
                hmv hmvVar = (hmv) this.b;
                hmvVar.c.removeCallbacks((Runnable) this.c);
                return;
            default:
                String str = (String) this.b;
                rw40 rw40Var = (rw40) this.c;
                synchronized (ix40.b) {
                    LinkedHashMap linkedHashMap = ix40.c;
                    ix40 ix40Var = (ix40) linkedHashMap.get(str);
                    if (ix40Var != null) {
                        ix40Var.f15524a.remove(rw40Var);
                        if (ix40Var.f15524a.isEmpty()) {
                            linkedHashMap.remove(str);
                            ix40Var.stopWatching();
                        }
                    }
                    break;
                }
                return;
        }
    }
}
