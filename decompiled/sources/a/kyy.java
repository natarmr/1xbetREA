package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kyy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19128a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ kyy(xcz xczVar, l7m0 l7m0Var, Function1 function1, int i) {
        this.f19128a = (byte) 0;
        this.c = xczVar;
        this.b = l7m0Var;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19128a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                qjj.z(x8x.L(this.e | 1), fetVar, this.c, this.b, this.d);
                break;
            case 1:
                zgc.E(x8x.L(this.e | 1), fetVar, this.c, this.b, this.d);
                break;
            case 2:
                ay3.C(x8x.L(this.e | 1), fetVar, this.c, this.b, this.d);
                break;
            default:
                cjx.F(x8x.L(this.e | 1), fetVar, this.c, this.b, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ kyy(l7m0 l7m0Var, xcz xczVar, Function1 function1, int i, byte b) {
        this.f19128a = b;
        this.b = l7m0Var;
        this.c = xczVar;
        this.d = function1;
        this.e = i;
    }
}
