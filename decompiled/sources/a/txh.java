package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class txh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34699a;
    public final /* synthetic */ wxh b;

    public /* synthetic */ txh(wxh wxhVar, byte b) {
        this.f34699a = b;
        this.b = wxhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34699a;
        final wxh wxhVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                final byte b2 = 0;
                wxhVar.t.b(th, new Function2() { // from class: a.uxh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        Object value2;
                        byte b3 = b2;
                        wxh wxhVar2 = wxhVar;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b3) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = wxhVar2.i.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    wxhVar2.f.getClass();
                                } while (!p7m0Var.m(value, oxh.a((oxh) value, false, true, false, null, 0L, 24)));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var2 = wxhVar2.i.f25029a;
                                do {
                                    value2 = p7m0Var2.getValue();
                                    value2.getClass();
                                    wxhVar2.f.getClass();
                                } while (!p7m0Var2.m(value2, oxh.a((oxh) value2, false, true, false, null, 0L, 24)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                th.getClass();
                final byte b3 = 1;
                wxhVar.t.b(th, new Function2() { // from class: a.uxh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        Object value2;
                        byte b4 = b3;
                        wxh wxhVar2 = wxhVar;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = wxhVar2.i.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    wxhVar2.f.getClass();
                                } while (!p7m0Var.m(value, oxh.a((oxh) value, false, true, false, null, 0L, 24)));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var2 = wxhVar2.i.f25029a;
                                do {
                                    value2 = p7m0Var2.getValue();
                                    value2.getClass();
                                    wxhVar2.f.getClass();
                                } while (!p7m0Var2.m(value2, oxh.a((oxh) value2, false, true, false, null, 0L, 24)));
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
