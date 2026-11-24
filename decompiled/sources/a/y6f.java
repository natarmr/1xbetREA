package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y6f extends bnn0 implements Function2 {
    public List i;
    public vv6 j;
    public List k;
    public j9c l;
    public long m;
    public long n;
    public byte o;
    public byte p;
    public byte q;
    public final /* synthetic */ r7f r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6f(r7f r7fVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.r = r7fVar;
        this.s = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new y6f(this.r, this.s, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y6f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:43:0x0165  */
    /* JADX WARN: Code duplicated, block: B:44:0x017d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0189  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a0  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0159, code lost:
    
        if (r2 == r5) goto L39;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y6f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
