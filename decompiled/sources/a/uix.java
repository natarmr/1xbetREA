package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class uix extends bnn0 implements Function2 {
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;
    public ywu n;
    public Throwable o;
    public byte p;
    public final /* synthetic */ ywu q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uix(ywu ywuVar, yje yjeVar) {
        super(2, yjeVar);
        this.q = ywuVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new uix(this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uix) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:18|75|19|(2:21|65)) */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x009d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bc A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:19:0x0075, B:22:0x009f, B:23:0x00b6, B:25:0x00bc, B:27:0x00cb, B:29:0x00d1, B:32:0x00d7), top: B:75:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00cb A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:19:0x0075, B:22:0x009f, B:23:0x00b6, B:25:0x00bc, B:27:0x00cb, B:29:0x00d1, B:32:0x00d7), top: B:75:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:46:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x012b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x0136  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x015f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:70:0x016b  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        r17 = r14;
        r14 = r0;
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011d, code lost:
    
        if (a.qcc.P(r10, r18) == r2) goto L65;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0162 -> B:42:0x00fa). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uix.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
