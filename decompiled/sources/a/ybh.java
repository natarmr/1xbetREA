package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.core.betting.domain.model.RelatedParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ybh extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public sff0 j;
    public byte k;
    public final /* synthetic */ dch l;
    public final /* synthetic */ RelatedParams m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ybh(dch dchVar, RelatedParams relatedParams, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = dchVar;
        this.m = relatedParams;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        RelatedParams relatedParams = this.m;
        dch dchVar = this.l;
        switch (b) {
            case 0:
                return new ybh(dchVar, relatedParams, yjeVar, (byte) 0);
            default:
                return new ybh(dchVar, relatedParams, yjeVar, (byte) 1);
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
        return ((ybh) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x014e, code lost:
    
        if (r2.c(r0, r33) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0252, code lost:
    
        if (r2.c(r0, r33) == r15) goto L54;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ybh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
