package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gwm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12033a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ bwm c;
    public final /* synthetic */ int d;

    public /* synthetic */ gwm(mm40 mm40Var, bwm bwmVar, int i, byte b) {
        this.f12033a = b;
        this.b = mm40Var;
        this.c = bwmVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f12033a;
        int i = this.d;
        bwm bwmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qzb.q(mm40Var, bwmVar, fetVar, x8x.L(i | 1));
                break;
            default:
                qzb.b(mm40Var, bwmVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
