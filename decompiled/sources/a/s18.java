package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s18 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31442a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ rz7 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ s18(mm40 mm40Var, rz7 rz7Var, boolean z, int i, byte b) {
        this.f31442a = b;
        this.b = mm40Var;
        this.c = rz7Var;
        this.d = z;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31442a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                t18.b(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                u18.a(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
