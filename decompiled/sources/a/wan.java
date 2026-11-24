package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wan implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38837a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;

    public /* synthetic */ wan(Integer num, long j, long j2, float f, int i, byte b) {
        this.f38837a = b;
        this.b = num;
        this.c = j;
        this.d = j2;
        this.e = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38837a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(24577);
                epv0.M(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(24577);
                mrv.b0(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
