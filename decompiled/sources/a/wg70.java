package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wg70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public ql5 j;
    public double k;
    public byte l;
    public final /* synthetic */ String m;
    public final /* synthetic */ w46 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg70(w46 w46Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = w46Var;
        this.m = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.m;
        w46 w46Var = this.n;
        switch (b) {
            case 0:
                return new wg70((eh70) w46Var, str, yjeVar, (byte) 0);
            default:
                return new wg70((ji70) w46Var, str, yjeVar, (byte) 1);
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
        return ((wg70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r0 == r13) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016c, code lost:
    
        if (r0 == r13) goto L75;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wg70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
