package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m2d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21051a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ m2d(mm40 mm40Var, long j, h2m h2mVar, r7n r7nVar, boolean z, Function0 function0, int i) {
        this.e = mm40Var;
        this.b = j;
        this.f = h2mVar;
        this.g = r7nVar;
        this.c = z;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21051a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1769857);
                qzb.e(this.c, (Function0) obj6, (nyq0) obj5, this.b, (xdr) obj4, (ugd) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(385);
                rcb.x((mm40) obj5, this.b, (h2m) obj4, (r7n) obj3, this.c, (Function0) obj6, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(24961);
                wvb.p((mm40) obj6, (m7m) obj5, this.c, this.b, (Function2) obj4, (Function2) obj3, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ m2d(mm40 mm40Var, m7m m7mVar, boolean z, long j, Function2 function2, Function2 function3, int i) {
        this.d = mm40Var;
        this.e = m7mVar;
        this.c = z;
        this.b = j;
        this.f = function2;
        this.g = function3;
    }

    public /* synthetic */ m2d(boolean z, Function0 function0, nyq0 nyq0Var, long j, xdr xdrVar, ugd ugdVar, int i) {
        this.c = z;
        this.d = function0;
        this.e = nyq0Var;
        this.b = j;
        this.f = xdrVar;
        this.g = ugdVar;
    }
}
