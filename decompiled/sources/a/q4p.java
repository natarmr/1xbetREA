package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q4p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28110a;
    public final /* synthetic */ org.xplatform.favorites.impl.presentation.category.a b;

    public /* synthetic */ q4p(org.xplatform.favorites.impl.presentation.category.a aVar, byte b) {
        this.f28110a = b;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        byte b = this.f28110a;
        org.xplatform.favorites.impl.presentation.category.a aVar = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = aVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    aVar.f.getClass();
                } while (!p7m0Var.m(value, x4p.a((x4p) value, null, null, null, f4p.b, null, null, false, false, false, false, null, false, false, 16119)));
                break;
            default:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var2 = aVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    aVar.f.getClass();
                } while (!p7m0Var2.m(value2, x4p.a((x4p) value2, null, null, null, f4p.b, null, null, false, false, false, false, null, false, false, 16119)));
                break;
        }
        return Unit.f46060a;
    }
}
