package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mp2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22157a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ np2 c;

    public /* synthetic */ mp2(mm40 mm40Var, np2 np2Var, int i, byte b) {
        this.f22157a = b;
        this.b = mm40Var;
        this.c = np2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22157a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                b34.c(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                b34.b(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
