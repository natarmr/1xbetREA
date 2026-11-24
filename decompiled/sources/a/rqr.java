package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rqr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30945a;
    public final /* synthetic */ yaa b;

    public /* synthetic */ rqr(yaa yaaVar, int i, byte b) {
        this.f30945a = b;
        this.b = yaaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30945a;
        yaa yaaVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                unh0.E(yaaVar, fetVar, x8x.L(1));
                break;
            default:
                ags.a(yaaVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
