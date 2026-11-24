package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s6m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31711a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;

    public /* synthetic */ s6m(byte b, float f, int i, mm40 mm40Var, String str, boolean z) {
        this.f31711a = b;
        switch (b) {
            case 1:
                break;
            default:
                u6m u6mVar = u6m.f35142a;
                break;
        }
        this.b = mm40Var;
        this.c = str;
        this.d = z;
        this.e = f;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31711a;
        int i = this.f;
        switch (b) {
            case 0:
                u6m u6mVar = u6m.f35142a;
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                oja0.B(this.e, iL, (fet) obj, this.b, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                mbc.J(this.e, iL2, (fet) obj, this.b, this.c, this.d);
                break;
        }
        return Unit.f46060a;
    }
}
