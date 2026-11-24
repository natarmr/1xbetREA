package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wij extends zzf0 implements Function2 {
    public final /* synthetic */ byte j;
    public byte k;
    public /* synthetic */ Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wij(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.j = b;
        this.m = obj;
        this.n = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.j;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                wij wijVar = new wij((xij) obj2, yjeVar, (byte) 0);
                wijVar.l = obj;
                return wijVar;
            case 1:
                wij wijVar2 = new wij((CoroutineContext) this.m, (Function2) obj2, yjeVar, (byte) 1);
                wijVar2.l = obj;
                return wijVar2;
            case 2:
                wij wijVar3 = new wij((p5q0) obj2, yjeVar, (byte) 2);
                wijVar3.l = obj;
                return wijVar3;
            default:
                wij wijVar4 = new wij((xoa0) this.m, (mie0) obj2, yjeVar, (byte) 3);
                wijVar4.l = obj;
                return wijVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        inn0 inn0Var = (inn0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.j) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((wij) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01fd A[PHI: r2 r3 r4 r5 r6 r7 r8
  0x01fd: PHI (r2v1 int) = (r2v2 int), (r2v0 int) binds: [B:110:0x01fa, B:107:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01fd: PHI (r3v1 byte) = (r3v2 byte), (r3v0 byte) binds: [B:110:0x01fa, B:107:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01fd: PHI (r4v1 java.lang.Object) = (r4v4 java.lang.Object), (r4v7 java.lang.Object) binds: [B:110:0x01fa, B:107:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01fd: PHI (r5v1 byte) = (r5v2 byte), (r5v0 byte) binds: [B:110:0x01fa, B:107:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01fd: PHI (r6v1 java.lang.Object) = (r6v2 java.lang.Object), (r6v0 java.lang.Object) binds: [B:110:0x01fa, B:107:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01fd: PHI (r7v1 byte) = (r7v2 byte), (r7v0 byte) binds: [B:110:0x01fa, B:107:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01fd: PHI (r8v2 a.mtc) = (r8v3 a.mtc), (r8v0 a.mtc) binds: [B:110:0x01fa, B:107:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x0204 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0206  */
    /* JADX WARN: Code duplicated, block: B:126:0x0231  */
    /* JADX WARN: Code duplicated, block: B:127:0x0233  */
    /* JADX WARN: Code duplicated, block: B:129:0x0236  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0201 -> B:109:0x01ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0204 -> B:124:0x022b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0212 -> B:119:0x0217). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a1 -> B:34:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0127 -> B:58:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x01ab -> B:85:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01be -> B:85:0x018d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wij.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wij(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.j = b;
        this.n = obj;
    }
}
