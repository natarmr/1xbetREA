package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.related.impl.navigation.RelatedScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vjs implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37545a;
    public final /* synthetic */ yks b;

    public /* synthetic */ vjs(yks yksVar, byte b) {
        this.f37545a = b;
        this.b = yksVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37545a;
        yks yksVar = this.b;
        switch (b) {
            case 0:
                yksVar.G(new ijs(((Integer) obj).intValue()));
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new jcs(yksVar, (byte) 3))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 2:
                k0w0 k0w0Var2 = (k0w0) obj;
                zie0 zie0Var = yksVar.O;
                njs njsVar = (njs) yksVar.D();
                long j = njsVar.f23650a;
                boolean z = njsVar.d;
                Long l = njsVar.g;
                long jLongValue = l != null ? l.longValue() : -1L;
                tef0 tef0Var = tef0.c;
                xuz xuzVar = pb10.c;
                RelatedParams relatedParams = new RelatedParams(z, j, njsVar.e, -1L, jLongValue, tef0Var);
                zie0Var.getClass();
                k0w0Var2.k(new RelatedScreenFactoryImpl$getScreen$1(zie0Var, relatedParams));
                break;
            default:
                ((k0w0) obj).k(((zfm0) yksVar.N).a(((njs) yksVar.D()).e, String.valueOf(((njs) yksVar.D()).f23650a)));
                break;
        }
        return Unit.f46060a;
    }
}
