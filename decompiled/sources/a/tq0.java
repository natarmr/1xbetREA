package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tq0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public kmq j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jr0 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ int p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tq0(jr0 jr0Var, long j, boolean z, int i, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = jr0Var;
        this.n = j;
        this.o = z;
        this.p = i;
        this.q = str;
        this.r = str2;
        this.s = str3;
        this.t = z2;
        this.u = z3;
        this.v = z4;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                tq0 tq0Var = new tq0(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, yjeVar, (byte) 0);
                tq0Var.l = obj;
                return tq0Var;
            default:
                tq0 tq0Var2 = new tq0(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, yjeVar, (byte) 1);
                tq0Var2.l = obj;
                return tq0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((tq0) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (r15.a(r0, r11) == r13) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        if (r12.a(r0, r11) == r13) goto L32;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
