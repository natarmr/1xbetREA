package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kwy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19025a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ n6w c;
    public final /* synthetic */ int d;

    public /* synthetic */ kwy(mm40 mm40Var, n6w n6wVar, int i, byte b) {
        this.f19025a = b;
        this.b = mm40Var;
        this.c = n6wVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19025a;
        int i = this.d;
        n6w n6wVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                tke.I(mm40Var, n6wVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                hp4.u(mm40Var, n6wVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                jd8.R(mm40Var, n6wVar, fetVar, x8x.L(i | 1));
                break;
            default:
                kc5.x0(mm40Var, n6wVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
