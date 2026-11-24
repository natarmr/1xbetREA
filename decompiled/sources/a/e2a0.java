package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e2a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7075a;
    public final /* synthetic */ f2a0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e2a0(f2a0 f2a0Var, int i, byte b) {
        this.f7075a = b;
        this.b = f2a0Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7075a;
        int i = this.c;
        f2a0 f2a0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qxw.a(f2a0Var, fetVar, x8x.L(i | 1));
                break;
            default:
                qxw.j(f2a0Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
