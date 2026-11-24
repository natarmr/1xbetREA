package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zil implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44444a;
    public final /* synthetic */ sd b;
    public final /* synthetic */ rd c;

    public /* synthetic */ zil(sd sdVar, rd rdVar, int i, byte b) {
        this.f44444a = b;
        this.b = sdVar;
        this.c = rdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44444a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jcb.E(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                jcb.F(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
