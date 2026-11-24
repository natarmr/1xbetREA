package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class kno0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ kwj k;
    public final /* synthetic */ int l;
    public final /* synthetic */ pz40 m;
    public final /* synthetic */ l7m0 n;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ zno0 p;
    public final /* synthetic */ bch0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kno0(kwj kwjVar, int i, pz40 pz40Var, zno0 zno0Var, l7m0 l7m0Var, bch0 bch0Var, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kwjVar;
        this.l = i;
        this.m = pz40Var;
        this.p = zno0Var;
        this.n = l7m0Var;
        this.q = bch0Var;
        this.o = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bch0 bch0Var = this.q;
        zno0 zno0Var = this.p;
        switch (b) {
            case 0:
                return new kno0(this.k, this.l, this.m, (xno0) zno0Var, this.n, (d9z) bch0Var, this.o, yjeVar, (byte) 0);
            default:
                return new kno0(this.k, this.l, this.m, (yno0) zno0Var, this.n, (xcz) bch0Var, this.o, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((kno0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r12.v(0, 0.0f, r16) == r8) goto L29;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kno0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
