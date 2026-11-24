package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d61 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5530a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ p3w c;

    public /* synthetic */ d61(mm40 mm40Var, p3w p3wVar, int i, byte b) {
        this.f5530a = b;
        this.b = mm40Var;
        this.c = p3wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5530a;
        p3w p3wVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                m0x0.b(mm40Var, p3wVar, fetVar, x8x.L(1));
                break;
            default:
                r8x.n(mm40Var, p3wVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
