package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yoc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f42977a;

    public yoc(pbt pbtVar, byte b) {
        pbtVar.getClass();
        switch (b) {
            case 1:
                this.f42977a = pbtVar;
                break;
            case 2:
                this.f42977a = pbtVar;
                break;
            case 3:
                this.f42977a = pbtVar;
                break;
            default:
                this.f42977a = pbtVar;
                break;
        }
    }

    public long a() {
        uen uenVar = wen.b;
        return Math.max(wen.e(ibc.v0(5, bfn.MINUTES)) - (System.currentTimeMillis() - this.f42977a.c.d), 0L);
    }

    public Object b(List list, yje yjeVar) {
        pbt pbtVar = this.f42977a;
        return qjj.d0(pbtVar.m.b, new fbt(pbtVar, list, null, (byte) 1), yjeVar);
    }
}
