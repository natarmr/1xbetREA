package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l680 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19494a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ i680 c;

    public /* synthetic */ l680(mm40 mm40Var, i680 i680Var, int i, byte b) {
        this.f19494a = b;
        this.b = mm40Var;
        this.c = i680Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19494a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                tfx.i(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                ufx.k(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
