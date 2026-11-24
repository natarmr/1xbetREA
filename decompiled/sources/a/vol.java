package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vol implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37773a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ y9q0 e;
    public final /* synthetic */ y9q0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ long j;
    public final /* synthetic */ float k;

    public /* synthetic */ vol(mm40 mm40Var, String str, String str2, y9q0 y9q0Var, y9q0 y9q0Var2, long j, long j2, float f, long j3, float f2, int i, byte b) {
        this.f37773a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = y9q0Var;
        this.f = y9q0Var2;
        this.g = j;
        this.h = j2;
        this.i = f;
        this.j = j3;
        this.k = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37773a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                dyb.l(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                dyb.K(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
