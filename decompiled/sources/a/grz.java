package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class grz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11804a;
    public final /* synthetic */ irz b;

    public /* synthetic */ grz(irz irzVar, byte b) {
        this.f11804a = b;
        this.b = irzVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11804a;
        final irz irzVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                final byte b2 = 1;
                irzVar.r.b(th, new Function2() { // from class: a.hrz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        byte b3 = b2;
                        irz irzVar2 = irzVar;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b3) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                irzVar2.G(new crz(str));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = irzVar2.i.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    irzVar2.f.getClass();
                                } while (!p7m0Var.m(value, erz.a((erz) value, null, null, false, true, 3)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                th.getClass();
                final byte b3 = 0;
                irzVar.r.b(th, new Function2() { // from class: a.hrz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        byte b4 = b3;
                        irz irzVar2 = irzVar;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                irzVar2.G(new crz(str));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = irzVar2.i.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    irzVar2.f.getClass();
                                } while (!p7m0Var.m(value, erz.a((erz) value, null, null, false, true, 3)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
        }
        return Unit.f46060a;
    }
}
