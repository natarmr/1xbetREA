package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class o4p0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24651a;
    public final /* synthetic */ q4p0 b;

    public /* synthetic */ o4p0(q4p0 q4p0Var, byte b) {
        this.f24651a = b;
        this.b = q4p0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        bby bbyVar;
        byte b = this.f24651a;
        q4p0 q4p0Var = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                int i = q4p0.D;
                p7m0 p7m0Var = q4p0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    q4p0Var.f.getClass();
                } while (!p7m0Var.m(value, h4p0.a((h4p0) value, false, false, list, 16)));
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue && (((h4p0) q4p0Var.D()).d.isEmpty() || (bbyVar = q4p0Var.C) == null || !bbyVar.isActive())) {
                    q4p0Var.M();
                } else if (!zBooleanValue && ((h4p0) q4p0Var.D()).d.isEmpty()) {
                    p7m0 p7m0Var2 = q4p0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        q4p0Var.f.getClass();
                    } while (!p7m0Var2.m(value2, h4p0.a((h4p0) value2, false, true, null, 26)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
