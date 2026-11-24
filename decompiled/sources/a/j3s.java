package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.related.impl.navigation.RelatedScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j3s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15851a;
    public final /* synthetic */ k4s b;

    public /* synthetic */ j3s(k4s k4sVar, byte b) {
        this.f15851a = b;
        this.b = k4sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15851a;
        k4s k4sVar = this.b;
        switch (b) {
            case 0:
                k4sVar.G(new r2s(((Integer) obj).intValue()));
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new yip(k4sVar, (byte) 26))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 2:
                zie0 zie0Var = k4sVar.t;
                z2s z2sVar = (z2s) k4sVar.D();
                long j = z2sVar.f43686a;
                boolean z = z2sVar.d;
                long jLongValue = z2sVar.h.longValue();
                tef0 tef0Var = tef0.c;
                xuz xuzVar = pb10.c;
                RelatedParams relatedParams = new RelatedParams(z, j, z2sVar.e, -1L, jLongValue, tef0Var);
                zie0Var.getClass();
                ((k0w0) obj).k(new RelatedScreenFactoryImpl$getScreen$1(zie0Var, relatedParams));
                break;
            default:
                yfm0 yfm0Var = k4sVar.s;
                zfm0 zfm0Var = (zfm0) yfm0Var;
                ((k0w0) obj).k(zfm0Var.a(((z2s) k4sVar.D()).e, String.valueOf(((z2s) k4sVar.D()).f43686a)));
                break;
        }
        return Unit.f46060a;
    }
}
