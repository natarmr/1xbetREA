package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.related.impl.navigation.RelatedScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b8s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2172a;
    public final /* synthetic */ g9s b;

    public /* synthetic */ b8s(g9s g9sVar, byte b) {
        this.f2172a = b;
        this.b = g9sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2172a;
        g9s g9sVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new yip(g9sVar, (byte) 27))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 1:
                g9sVar.G(new m7s(((Integer) obj).intValue()));
                break;
            case 2:
                k0w0 k0w0Var2 = (k0w0) obj;
                zie0 zie0Var = g9sVar.O;
                r7s r7sVar = (r7s) g9sVar.D();
                long j = r7sVar.f29992a;
                boolean z = r7sVar.d;
                Long l = r7sVar.g;
                long jLongValue = l != null ? l.longValue() : -1L;
                tef0 tef0Var = tef0.c;
                xuz xuzVar = pb10.c;
                RelatedParams relatedParams = new RelatedParams(z, j, r7sVar.e, -1L, jLongValue, tef0Var);
                zie0Var.getClass();
                k0w0Var2.k(new RelatedScreenFactoryImpl$getScreen$1(zie0Var, relatedParams));
                break;
            default:
                ((k0w0) obj).k(((zfm0) g9sVar.N).a(((r7s) g9sVar.D()).e, String.valueOf(((r7s) g9sVar.D()).f29992a)));
                break;
        }
        return Unit.f46060a;
    }
}
