package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class bfm0 extends bnn0 implements Function2 {
    public Map i;
    public ywu j;
    public Throwable k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public byte q;
    public final /* synthetic */ ywu r;
    public final /* synthetic */ String s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfm0(ywu ywuVar, String str, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.r = ywuVar;
        this.s = str;
        this.t = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new bfm0(this.r, this.s, this.t, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bfm0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:163|22|(1:25)|67) */
    /* JADX WARN: Code duplicated, block: B:101:0x023d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0250  */
    /* JADX WARN: Code duplicated, block: B:106:0x025d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0262  */
    /* JADX WARN: Code duplicated, block: B:112:0x0275  */
    /* JADX WARN: Code duplicated, block: B:114:0x0284  */
    /* JADX WARN: Code duplicated, block: B:117:0x028b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0292  */
    /* JADX WARN: Code duplicated, block: B:122:0x0298  */
    /* JADX WARN: Code duplicated, block: B:123:0x029d  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:132:0x02be  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:140:0x02df  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:145:0x0303  */
    /* JADX WARN: Code duplicated, block: B:148:0x0309  */
    /* JADX WARN: Code duplicated, block: B:151:0x030f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0318  */
    /* JADX WARN: Code duplicated, block: B:155:0x031d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0332  */
    /* JADX WARN: Code duplicated, block: B:163:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0101  */
    /* JADX WARN: Code duplicated, block: B:34:0x010a  */
    /* JADX WARN: Code duplicated, block: B:36:0x010f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0111  */
    /* JADX WARN: Code duplicated, block: B:40:0x0116  */
    /* JADX WARN: Code duplicated, block: B:44:0x0136  */
    /* JADX WARN: Code duplicated, block: B:46:0x013e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x014c  */
    /* JADX WARN: Code duplicated, block: B:51:0x014e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0153  */
    /* JADX WARN: Code duplicated, block: B:58:0x0174  */
    /* JADX WARN: Code duplicated, block: B:59:0x017c  */
    /* JADX WARN: Code duplicated, block: B:60:0x017e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cb A[LOOP:0: B:72:0x01c5->B:74:0x01cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f5 A[LOOP:1: B:81:0x01ef->B:83:0x01f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x0203  */
    /* JADX WARN: Code duplicated, block: B:86:0x0206  */
    /* JADX WARN: Code duplicated, block: B:89:0x020c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0211  */
    /* JADX WARN: Code duplicated, block: B:93:0x0216  */
    /* JADX WARN: Code duplicated, block: B:96:0x0229  */
    /* JADX WARN: Code duplicated, block: B:98:0x0238  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0130, code lost:
    
        if (a.qcc.P(r9, r24) == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a7, code lost:
    
        if (r0 == r3) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:4:0x0015, B:18:0x009b], limit reached: 177 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0101 -> B:33:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017e -> B:33:0x0108). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bfm0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
