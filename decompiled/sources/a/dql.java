package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dql implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6521a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;

    public /* synthetic */ dql(mm40 mm40Var, float f, int i, byte b) {
        this.f6521a = b;
        this.b = mm40Var;
        this.c = f;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6521a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                aac.h(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                ju70.m(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                ebc.V(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 3:
                q7x.q(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 4:
                tke.J(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 5:
                x8f.P(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 6:
                saj.N(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 7:
                qjj.H(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                eeq.J(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
