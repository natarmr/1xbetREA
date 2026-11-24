package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r0i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29631a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ xx7 e;

    public /* synthetic */ r0i(mm40 mm40Var, String str, String str2, xx7 xx7Var, int i, byte b) {
        this.f29631a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = xx7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29631a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(3073);
                ccq0.f(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(3073);
                ohq0.n(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
