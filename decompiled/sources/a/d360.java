package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class d360 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5388a;
    public final /* synthetic */ v360 b;

    public /* synthetic */ d360(v360 v360Var, byte b) {
        this.f5388a = b;
        this.b = v360Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        byte b = this.f5388a;
        v360 v360Var = this.b;
        switch (b) {
            case 0:
                tz50 tz50Var = (tz50) obj;
                int i = v360.x0;
                p7m0 p7m0Var = v360Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    v360Var.f.getClass();
                } while (!p7m0Var.m(value, c260.a((c260) value, null, false, false, false, null, false, null, tz50Var, null, null, 259575)));
                break;
            default:
                om5 om5Var = (om5) obj;
                int i2 = v360.x0;
                p7m0 p7m0Var2 = v360Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    v360Var.f.getClass();
                } while (!p7m0Var2.m(value2, c260.a((c260) value2, null, false, false, false, om5Var, false, null, null, null, null, 262015)));
                break;
        }
        return Unit.f46060a;
    }
}
