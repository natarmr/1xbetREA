package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yil implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42697a;
    public final /* synthetic */ long b;
    public final /* synthetic */ sd c;
    public final /* synthetic */ rd d;

    public /* synthetic */ yil(long j, sd sdVar, rd rdVar, int i, byte b) {
        this.f42697a = b;
        this.b = j;
        this.c = sdVar;
        this.d = rdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42697a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                jcb.A(this.b, this.c, this.d, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                jcb.C(this.b, this.c, this.d, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                jcb.B(this.b, this.c, this.d, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                jcb.D(this.b, this.c, this.d, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }
}
