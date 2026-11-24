package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p9d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26600a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ p9d(mm40 mm40Var, boolean z, int i) {
        this.f26600a = (byte) 2;
        this.b = mm40Var;
        this.d = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26600a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                int iL = x8x.L(this.c | 1);
                boolean z = this.d;
                lmc.d(iL, z ? 1 : 0, fetVar, this.b);
                break;
            case 1:
                int iL2 = x8x.L(this.c | 1);
                boolean z2 = this.d;
                tlb.f(iL2, z2 ? 1 : 0, fetVar, this.b);
                break;
            default:
                xbc.H(x8x.L(this.c | 1), fetVar, this.b, this.d);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p9d(mm40 mm40Var, int i, int i2, byte b) {
        this.f26600a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = i2;
    }
}
