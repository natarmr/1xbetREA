package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ovv implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25943a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ uvv c;
    public final /* synthetic */ float d;

    public /* synthetic */ ovv(mm40 mm40Var, uvv uvvVar, float f, int i, byte b) {
        this.f25943a = b;
        this.b = mm40Var;
        this.c = uvvVar;
        this.d = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25943a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                hmw0.E(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                hmw0.D(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
