package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.related.impl.navigation.RelatedScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hbl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12775a;
    public final /* synthetic */ ncl0 b;

    public /* synthetic */ hbl0(ncl0 ncl0Var, byte b) {
        this.f12775a = b;
        this.b = ncl0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12775a;
        ncl0 ncl0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                p7m0 p7m0Var = ncl0Var.R;
                wal0 wal0Var = new wal0(iIntValue);
                p7m0Var.getClass();
                p7m0Var.o(null, wal0Var);
                break;
            case 1:
                zie0 zie0Var = ncl0Var.l;
                boolean z = ((zqs) ((p7m0) ncl0Var.w()).getValue()).f;
                long j = ((zqs) ((p7m0) ncl0Var.w()).getValue()).b;
                long j2 = ((zqs) ((p7m0) ncl0Var.w()).getValue()).d;
                long j3 = ((zqs) ((p7m0) ncl0Var.w()).getValue()).c;
                tef0 tef0Var = tef0.c;
                xuz xuzVar = pb10.c;
                RelatedParams relatedParams = new RelatedParams(z, j, j3, -1L, j2, tef0Var);
                zie0Var.getClass();
                ((k0w0) obj).k(new RelatedScreenFactoryImpl$getScreen$1(zie0Var, relatedParams));
                break;
            default:
                yfm0 yfm0Var = ncl0Var.k;
                zfm0 zfm0Var = (zfm0) yfm0Var;
                ((k0w0) obj).k(zfm0Var.a(((zqs) ((p7m0) ncl0Var.w()).getValue()).c, String.valueOf(((zqs) ((p7m0) ncl0Var.w()).getValue()).b)));
                break;
        }
        return Unit.f46060a;
    }
}
