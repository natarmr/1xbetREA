package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e1n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7043a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ u6n d;
    public final /* synthetic */ u12 e;

    public /* synthetic */ e1n(mm40 mm40Var, String str, u6n u6nVar, u12 u12Var, int i, byte b) {
        this.f7043a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = u6nVar;
        this.e = u12Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7043a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                v3c.C(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                v3c.D(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
