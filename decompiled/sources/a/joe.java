package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class joe extends bnn0 implements Function2 {
    public int i;
    public int j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ long m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ List o;
    public final /* synthetic */ int p;
    public final /* synthetic */ String q;
    public final /* synthetic */ long r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joe(long j, Function2 function2, List list, int i, String str, long j2, long j3, yje yjeVar) {
        super(2, yjeVar);
        this.m = j;
        this.n = function2;
        this.o = list;
        this.p = i;
        this.q = str;
        this.r = j2;
        this.s = j3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        joe joeVar = new joe(this.m, this.n, this.o, this.p, this.q, this.r, this.s, yjeVar);
        joeVar.l = obj;
        return joeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((joe) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (a.qcc.O(r11, r16) == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        if (a.qcc.O(r12, r16) == r3) goto L57;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00d9 -> B:24:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00eb -> B:58:0x00ee). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.joe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
