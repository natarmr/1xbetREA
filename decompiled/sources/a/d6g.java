package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d6g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5547a;
    public final /* synthetic */ h6g b;

    public /* synthetic */ d6g(h6g h6gVar, byte b) {
        this.f5547a = b;
        this.b = h6gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5547a;
        final h6g h6gVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                h6gVar.k.b(th, new jyf((byte) 6));
                break;
            case 1:
                th.getClass();
                final byte b2 = 0;
                h6gVar.k.b(th, new Function2() { // from class: a.e6g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b3 = b2;
                        h6g h6gVar2 = h6gVar;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b3) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                h6gVar2.x();
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                h6gVar2.x();
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                th.getClass();
                final byte b3 = 1;
                h6gVar.k.b(th, new Function2() { // from class: a.e6g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b3;
                        h6g h6gVar2 = h6gVar;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                h6gVar2.x();
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                h6gVar2.x();
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
