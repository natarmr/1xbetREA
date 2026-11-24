package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u5n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35103a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ mm40 e;
    public final /* synthetic */ int f;

    public /* synthetic */ u5n(long j, int i, int i2, mm40 mm40Var, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = mm40Var;
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35103a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(this.f | 1);
                z5n.f(this.c, this.d, iL, this.b, (fet) obj, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(this.f | 1);
                t9x.p(this.c, this.d, iL2, this.b, (fet) obj, this.e);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ u5n(mm40 mm40Var, long j, int i, int i2, int i3) {
        this.e = mm40Var;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.f = i3;
    }
}
