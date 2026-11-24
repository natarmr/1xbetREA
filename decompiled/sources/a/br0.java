package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class br0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public kmq j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jr0 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(jr0 jr0Var, long j, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        switch (b) {
            case 1:
                this.m = jr0Var;
                this.n = j;
                this.o = z;
                super(2, yjeVar);
                break;
            default:
                uzb0 uzb0Var = uzb0.f36529a;
                this.m = jr0Var;
                this.n = j;
                this.o = z;
                break;
        }
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                uzb0 uzb0Var = uzb0.f36529a;
                br0 br0Var = new br0(this.m, this.n, this.o, yjeVar, (byte) 0);
                br0Var.l = obj;
                return br0Var;
            default:
                br0 br0Var2 = new br0(this.m, this.n, this.o, yjeVar, (byte) 1);
                br0Var2.l = obj;
                return br0Var2;
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
        return ((br0) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (r14.a(r0, r9) == r15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fa, code lost:
    
        if (r10.a(r0, r9) == r11) goto L39;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.br0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
