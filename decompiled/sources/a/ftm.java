package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ftm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10119a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ a4x d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ftm(mm40 mm40Var, String str, a4x a4xVar, boolean z, int i, byte b) {
        this.f10119a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = a4xVar;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10119a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(3073);
                hkb.v(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(3073);
                xkb.x(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(3073);
                slb.B(this.b, this.c, this.d, this.e, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(3073);
                tlb.x(this.b, this.c, this.d, this.e, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }
}
