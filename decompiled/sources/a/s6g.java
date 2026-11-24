package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s6g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31699a;
    public final /* synthetic */ w6g b;

    public /* synthetic */ s6g(w6g w6gVar, byte b) {
        this.f31699a = b;
        this.b = w6gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31699a;
        final w6g w6gVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                w6gVar.k.b(th, new jyf((byte) 7));
                break;
            case 1:
                th.getClass();
                final byte b2 = 0;
                w6gVar.k.b(th, new Function2() { // from class: a.t6g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b3 = b2;
                        w6g w6gVar2 = w6gVar;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b3) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                w6gVar2.w();
                                break;
                            case 1:
                                th2.getClass();
                                str.getClass();
                                w6gVar2.w();
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                w6gVar2.w();
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 2:
                th.getClass();
                final byte b3 = 1;
                w6gVar.k.b(th, new Function2() { // from class: a.t6g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b3;
                        w6g w6gVar2 = w6gVar;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                w6gVar2.w();
                                break;
                            case 1:
                                th2.getClass();
                                str.getClass();
                                w6gVar2.w();
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                w6gVar2.w();
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                th.getClass();
                final byte b4 = 2;
                w6gVar.k.b(th, new Function2() { // from class: a.t6g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b5 = b4;
                        w6g w6gVar2 = w6gVar;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b5) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                w6gVar2.w();
                                break;
                            case 1:
                                th2.getClass();
                                str.getClass();
                                w6gVar2.w();
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                w6gVar2.w();
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
