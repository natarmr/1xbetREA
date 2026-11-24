package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class nyo0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24338a;
    public final /* synthetic */ pyo0 b;

    public /* synthetic */ nyo0(pyo0 pyo0Var, byte b) {
        this.f24338a = b;
        this.b = pyo0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        byte b = this.f24338a;
        pyo0 pyo0Var = this.b;
        switch (b) {
            case 0:
                boolean zY = axq.y(pyo0Var.p.f46640a, (List) obj);
                p7m0 p7m0Var = pyo0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    pyo0Var.f.getClass();
                } while (!p7m0Var.m(value, kyo0.a((kyo0) value, null, null, null, false, zY, 63)));
                break;
            default:
                boolean zY2 = axq.y(pyo0Var.p.f46640a, (List) obj);
                p7m0 p7m0Var2 = pyo0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    pyo0Var.f.getClass();
                } while (!p7m0Var2.m(value2, kyo0.a((kyo0) value2, null, null, null, zY2, false, 95)));
                break;
        }
        return Unit.f46060a;
    }
}
