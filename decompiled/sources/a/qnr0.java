package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qnr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29045a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ y9q0 f;
    public final /* synthetic */ y9q0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ qnr0(mm40 mm40Var, String str, String str2, int i, y9q0 y9q0Var, y9q0 y9q0Var2, int i2, byte b) {
        this.f29045a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = y9q0Var;
        this.g = y9q0Var2;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29045a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                j5n0.l(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                k5n0.i(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
