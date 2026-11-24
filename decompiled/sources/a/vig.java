package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class vig implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37476a;
    public final /* synthetic */ xig b;

    public /* synthetic */ vig(xig xigVar, byte b) {
        this.f37476a = b;
        this.b = xigVar;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        byte b = this.f37476a;
        xig xigVar = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i = xig.J;
                p7m0 p7m0Var = xigVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    xigVar.f.getClass();
                } while (!p7m0Var.m(value, sig.a((sig) value, false, null, null, null, null, zBooleanValue, null, 3071)));
                break;
            default:
                List list = (List) obj;
                int i2 = xig.J;
                p7m0 p7m0Var2 = xigVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    xigVar.f.getClass();
                } while (!p7m0Var2.m(value2, sig.a((sig) value2, false, null, null, null, null, false, list, 2047)));
                break;
        }
        return Unit.f46060a;
    }
}
