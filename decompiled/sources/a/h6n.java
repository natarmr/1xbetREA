package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h6n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12538a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ mm40 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ h6n(long j, long j2, mm40 mm40Var, int i, int i2, int i3, byte b) {
        this.f12538a = b;
        this.b = j;
        this.c = j2;
        this.d = mm40Var;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12538a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(this.g | 1);
                j6n.u(this.e, this.f, iL, this.b, this.c, (fet) obj, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(this.g | 1);
                j6n.r(this.e, this.f, iL2, this.b, this.c, (fet) obj, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(this.g | 1);
                j6n.t(this.e, this.f, iL3, this.b, this.c, (fet) obj, this.d);
                break;
        }
        return Unit.f46060a;
    }
}
