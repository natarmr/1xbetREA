package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class kb60 extends bnn0 implements Function2 {
    public kmq i;
    public w5z j;
    public String k;
    public kmq l;
    public int m;
    public int n;
    public boolean o;
    public byte p;
    public /* synthetic */ Object q;
    public final /* synthetic */ w5z r;
    public final /* synthetic */ String s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb60(w5z w5zVar, String str, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.r = w5zVar;
        this.s = str;
        this.t = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        kb60 kb60Var = new kb60(this.r, this.s, this.t, yjeVar);
        kb60Var.q = obj;
        return kb60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kb60) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:23|73|24|(1:27)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:7|66|75|20|(4:23|73|24|(1:27))|64) */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        r14 = r3;
        r3 = r10;
        r10 = r11;
        r11 = r9;
        r9 = r12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0128 -> B:66:0x012d). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kb60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
