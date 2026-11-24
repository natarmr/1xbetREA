package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p7m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26513a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ int e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p7m(mm40 mm40Var, String str, int i, int i2, byte b) {
        this.f26513a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26513a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jwb.k(this.d, x8x.L(this.e | 1), fetVar, this.b, this.c);
                break;
            default:
                vdx.c(this.d, x8x.L(this.e | 1), fetVar, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }
}
