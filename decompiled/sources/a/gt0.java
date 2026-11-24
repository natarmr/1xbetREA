package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gt0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11857a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ nur c;

    public /* synthetic */ gt0(mm40 mm40Var, nur nurVar, int i, byte b) {
        this.f11857a = b;
        this.b = mm40Var;
        this.c = nurVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11857a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                lt0.e(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                tke.h(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
