package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class yp00 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public final /* synthetic */ Object l;
    public boolean m;
    public boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp00(bq00 bq00Var, String str, boolean z, boolean z2, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = bq00Var;
        this.l = str;
        this.m = z;
        this.n = z2;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.l;
        switch (b) {
            case 0:
                return new yp00((bq00) this.k, (String) obj, this.m, this.n, yjeVar, (byte) 0);
            case 1:
                return new yp00((bq00) this.k, (String) obj, this.m, this.n, yjeVar, (byte) 1);
            default:
                return new yp00((on20) obj, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((yp00) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x011a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ca  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r0 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016b, code lost:
    
        if (r0 == r8) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f5, code lost:
    
        if (r0 == r8) goto L91;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yp00.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp00(on20 on20Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 2;
        this.l = on20Var;
    }
}
