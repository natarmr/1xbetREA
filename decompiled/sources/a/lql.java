package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lql implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20491a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ wql c;
    public final /* synthetic */ int d;

    public /* synthetic */ lql(mm40 mm40Var, wql wqlVar, int i, byte b) {
        this.f20491a = b;
        this.b = mm40Var;
        this.c = wqlVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20491a;
        int i = this.d;
        wql wqlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ahy.p(mm40Var, wqlVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                i120.s(mm40Var, wqlVar, fetVar, x8x.L(i | 1));
                break;
            default:
                j120.o(mm40Var, wqlVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
