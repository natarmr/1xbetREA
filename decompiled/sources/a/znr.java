package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.related.impl.navigation.RelatedScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class znr implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44688a;
    public final /* synthetic */ spr b;

    public /* synthetic */ znr(spr sprVar, byte b) {
        this.f44688a = b;
        this.b = sprVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44688a;
        spr sprVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new yip(sprVar, (byte) 23))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 1:
                sprVar.G(new knr(((Integer) obj).intValue()));
                break;
            case 2:
                zie0 zie0Var = sprVar.M;
                qnr qnrVar = (qnr) sprVar.D();
                long j = qnrVar.f29044a;
                boolean z = qnrVar.d;
                long jLongValue = qnrVar.h.longValue();
                tef0 tef0Var = tef0.c;
                xuz xuzVar = pb10.c;
                RelatedParams relatedParams = new RelatedParams(z, j, qnrVar.e, -1L, jLongValue, tef0Var);
                zie0Var.getClass();
                ((k0w0) obj).k(new RelatedScreenFactoryImpl$getScreen$1(zie0Var, relatedParams));
                break;
            default:
                yfm0 yfm0Var = sprVar.L;
                zfm0 zfm0Var = (zfm0) yfm0Var;
                ((k0w0) obj).k(zfm0Var.a(((qnr) sprVar.D()).e, String.valueOf(((qnr) sprVar.D()).f29044a)));
                break;
        }
        return Unit.f46060a;
    }
}
