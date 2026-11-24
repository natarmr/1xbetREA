package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class im10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15004a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ im10(sd sdVar, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, Function0 function1, Function0 function2, int i) {
        this.f = sdVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.g = function0;
        this.h = function1;
        this.i = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15004a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                km10.g((sd) obj6, this.b, this.c, this.d, this.e, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, iL);
                return Unit.f46060a;
            default:
                return w6r0.a((w6r0) obj2, false, false, null, (h8l0) obj6, (g8l0) obj5, (v5l0) obj4, (wcb) obj3, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), null, false, false, null, null, null, false, false, this.e, 6287439);
        }
    }

    public /* synthetic */ im10(h8l0 h8l0Var, g8l0 g8l0Var, v5l0 v5l0Var, wcb wcbVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f = h8l0Var;
        this.g = g8l0Var;
        this.h = v5l0Var;
        this.i = wcbVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }
}
