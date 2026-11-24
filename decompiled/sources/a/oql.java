package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oql implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25694a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ brl c;
    public final /* synthetic */ int d;

    public /* synthetic */ oql(mm40 mm40Var, brl brlVar, int i, byte b) {
        this.f25694a = b;
        this.b = mm40Var;
        this.c = brlVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25694a;
        int i = this.d;
        brl brlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                obc.l(mm40Var, brlVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                vbc.s(mm40Var, brlVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                qcc.f(mm40Var, brlVar, fetVar, x8x.L(i | 1));
                break;
            default:
                tdc.d(mm40Var, brlVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
