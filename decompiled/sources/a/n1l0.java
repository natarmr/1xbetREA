package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n1l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22756a;
    public final /* synthetic */ s1l0 b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ int d;

    public /* synthetic */ n1l0(s1l0 s1l0Var, mm40 mm40Var, int i, byte b) {
        this.f22756a = b;
        this.b = s1l0Var;
        this.c = mm40Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22756a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                g8x.c(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                g8x.q(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
