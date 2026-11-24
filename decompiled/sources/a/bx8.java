package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bx8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3364a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ mdm c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ byte f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ bx8(mm40 mm40Var, mdm mdmVar, boolean z, Function0 function0, int i, int i2, byte b) {
        this.f3364a = b;
        this.b = mm40Var;
        this.c = mdmVar;
        this.d = z;
        this.e = function0;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3364a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                hmw0.k(this.b, this.c, this.d, this.e, (fet) obj, iL, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                nnw0.h(this.b, this.c, this.d, this.e, (fet) obj, iL2, this.f);
                break;
        }
        return Unit.f46060a;
    }
}
