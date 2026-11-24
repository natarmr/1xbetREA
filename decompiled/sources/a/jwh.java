package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jwh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17250a;
    public final /* synthetic */ lwh b;

    public /* synthetic */ jwh(lwh lwhVar, byte b) {
        this.f17250a = b;
        this.b = lwhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f17250a;
        lwh lwhVar = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                p7m0 p7m0Var = lwhVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    lwhVar.f.getClass();
                } while (!p7m0Var.m(value, dwh.a((dwh) value, false, false, true, false, 0L, null, 49)));
                break;
            case 1:
                th.getClass();
                str.getClass();
                p7m0 p7m0Var2 = lwhVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    lwhVar.f.getClass();
                } while (!p7m0Var2.m(value2, dwh.a((dwh) value2, false, false, true, false, 0L, null, 49)));
                break;
            default:
                th.getClass();
                str.getClass();
                p7m0 p7m0Var3 = lwhVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    lwhVar.f.getClass();
                } while (!p7m0Var3.m(value3, dwh.a((dwh) value3, false, false, true, false, 0L, null, 49)));
                break;
        }
        return Unit.f46060a;
    }
}
