package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qls implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28950a;
    public final /* synthetic */ sls b;

    public /* synthetic */ qls(sls slsVar, int i, byte b) {
        this.f28950a = b;
        this.b = slsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28950a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                vic.m(this.b, fetVar, x8x.L(1));
                break;
            case 1:
                vic.q(this.b, fetVar, x8x.L(1));
                break;
            default:
                vic.c(this.b, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
