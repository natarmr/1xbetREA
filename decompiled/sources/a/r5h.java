package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r5h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29884a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r5h(mm40 mm40Var, String str, String str2, int i, int i2, byte b) {
        this.f29884a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29884a) {
            case 0:
                ((Integer) obj2).getClass();
                uzb.k(x8x.L(this.e | 1), this.f, (fet) obj, this.b, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                l8x.u(x8x.L(this.e | 1), this.f, (fet) obj, this.b, this.c, this.d);
                break;
        }
        return Unit.f46060a;
    }
}
