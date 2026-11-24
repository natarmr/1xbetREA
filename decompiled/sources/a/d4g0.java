package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class d4g0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5454a;
    public final /* synthetic */ k4g0 b;

    public /* synthetic */ d4g0(k4g0 k4g0Var, byte b) {
        this.f5454a = b;
        this.b = k4g0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        byte b = this.f5454a;
        k4g0 k4g0Var = this.b;
        switch (b) {
            case 0:
                k2g0 k2g0Var = (k2g0) obj;
                k4g0Var.o.e("EXPANDED_IDS_KEY", k2g0Var.d);
                p7m0 p7m0Var = k4g0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    k4g0Var.f.getClass();
                } while (!p7m0Var.m(value, y3g0.a((y3g0) value, false, null, false, null, null, null, null, k2g0Var.d, false, false, 15359)));
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i = k4g0.F;
                p7m0 p7m0Var2 = k4g0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    k4g0Var.f.getClass();
                } while (!p7m0Var2.m(value2, y3g0.a((y3g0) value2, false, null, false, null, null, null, null, null, false, zBooleanValue, 8191)));
                break;
        }
        return Unit.f46060a;
    }
}
