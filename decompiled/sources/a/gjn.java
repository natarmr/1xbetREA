package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gjn implements sbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11407a;
    public Object b;

    public /* synthetic */ gjn(Object obj, byte b) {
        this.f11407a = b;
        this.b = obj;
    }

    @Override // a.sbe
    public final void accept(Object obj) {
        switch (this.f11407a) {
            case 0:
                ((sbe) this.b).getClass();
                ((sbe) this.b).accept(obj);
                return;
            case 1:
                bsq bsqVar = (bsq) obj;
                if (bsqVar == null) {
                    bsqVar = new bsq(-3);
                }
                ((xr) this.b).q(bsqVar);
                return;
            default:
                bsq bsqVar2 = (bsq) obj;
                synchronized (csq.c) {
                    try {
                        nuj0 nuj0Var = csq.d;
                        ArrayList arrayList = (ArrayList) nuj0Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        nuj0Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((sbe) arrayList.get(i)).accept(bsqVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    public /* synthetic */ gjn() {
        this.f11407a = (byte) 0;
    }
}
