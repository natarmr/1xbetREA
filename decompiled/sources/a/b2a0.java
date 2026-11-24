package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b2a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1845a;
    public final /* synthetic */ q2a0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ b2a0(q2a0 q2a0Var, int i, byte b) {
        this.f1845a = b;
        this.b = q2a0Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1845a;
        int i = this.c;
        q2a0 q2a0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                xww.k(q2a0Var, fetVar, x8x.L(i | 1));
                break;
            default:
                xww.j(q2a0Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
