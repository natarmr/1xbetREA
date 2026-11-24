package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class yg2 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42565a;
    public final /* synthetic */ hh2 b;

    public /* synthetic */ yg2(hh2 hh2Var, byte b) {
        this.f42565a = b;
        this.b = hh2Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        byte b = this.f42565a;
        hh2 hh2Var = this.b;
        switch (b) {
            case 0:
                k2g0 k2g0Var = (k2g0) obj;
                hh2Var.o.e("EXPANDED_IDS_KEY", k2g0Var.d);
                p7m0 p7m0Var = hh2Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    hh2Var.f.getClass();
                } while (!p7m0Var.m(value, ug2.a((ug2) value, null, false, null, false, false, false, false, k2g0Var.d, null, null, false, 1919)));
                break;
            default:
                hat hatVar = (hat) obj;
                boolean z = !((ug2) hh2Var.D()).c.getClass().equals(hatVar.getClass());
                p7m0 p7m0Var2 = hh2Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    hh2Var.f.getClass();
                } while (!p7m0Var2.m(value2, ug2.a((ug2) value2, null, false, hatVar, z, false, false, false, null, null, null, false, 2019)));
                break;
        }
        return Unit.f46060a;
    }
}
