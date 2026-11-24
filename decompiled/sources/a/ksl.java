package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ksl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18819a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;

    public /* synthetic */ ksl(mm40 mm40Var, long j, long j2, float f, float f2, int i, byte b) {
        this.f18819a = b;
        this.b = mm40Var;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = f2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18819a) {
            case 0:
                ((Integer) obj2).getClass();
                lgb.a(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                lgb.C(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
        }
        return Unit.f46060a;
    }
}
