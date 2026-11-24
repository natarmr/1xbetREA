package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class o100 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ p100 k;
    public final /* synthetic */ LimitNeGroupEnum l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o100(p100 p100Var, LimitNeGroupEnum limitNeGroupEnum, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = p100Var;
        this.l = limitNeGroupEnum;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        LimitNeGroupEnum limitNeGroupEnum = this.l;
        p100 p100Var = this.k;
        switch (b) {
            case 0:
                return new o100(p100Var, limitNeGroupEnum, yjeVar, (byte) 0);
            default:
                return new o100(p100Var, limitNeGroupEnum, yjeVar, (byte) 1);
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
        return ((o100) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (a.qcc.O(3500, r21) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        if (a.qcc.O(3500, r21) == r1) goto L43;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o100.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
