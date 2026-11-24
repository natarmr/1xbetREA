package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gvo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11985a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ uvo0 c;

    public /* synthetic */ gvo0(mm40 mm40Var, uvo0 uvo0Var, int i, byte b) {
        this.f11985a = b;
        this.b = mm40Var;
        this.c = uvo0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11985a;
        uvo0 uvo0Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                nsm0.c(mm40Var, uvo0Var, fetVar, x8x.L(1));
                break;
            default:
                nsm0.b(mm40Var, uvo0Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
