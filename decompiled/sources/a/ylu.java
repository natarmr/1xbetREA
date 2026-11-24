package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ylu extends bnn0 implements Function2 {
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public long o;
    public long p;
    public long q;
    public f7u r;
    public ylu s;
    public Throwable t;
    public byte u;
    public final /* synthetic */ f7u v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ hie0 x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylu(f7u f7uVar, boolean z, hie0 hie0Var, int i, yje yjeVar) {
        super(2, yjeVar);
        this.v = f7uVar;
        this.w = z;
        this.x = hie0Var;
        this.y = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ylu(this.v, this.w, this.x, this.y, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ylu) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:46|130|47|138|48|49|127|50|51|142|52|140|53|54|136|55|56|(1:59)|105) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:(2:(1:(3:8|9|10)(2:13|14))(3:15|16|17)|(19:46|130|47|138|48|49|127|50|51|142|52|140|53|54|136|55|56|(1:59)|105)(1:(2:111|112)(1:113)))(4:18|125|19|20))(1:23)|134|60|61|115|(1:117)|118|(1:120)|(2:122|145)(2:123|124)) */
    /* JADX WARN: Code duplicated, block: B:100:0x0271  */
    /* JADX WARN: Code duplicated, block: B:103:0x0276 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:9:0x0038, B:61:0x01a2, B:80:0x01f1, B:83:0x01f9, B:84:0x0208, B:88:0x0211, B:90:0x0215, B:93:0x0241, B:95:0x0259, B:97:0x0268, B:101:0x0272, B:103:0x0276, B:107:0x02b0, B:109:0x02cd, B:111:0x02df, B:112:0x02e6, B:113:0x02e7, B:16:0x007d, B:32:0x0117), top: B:129:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b0 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:9:0x0038, B:61:0x01a2, B:80:0x01f1, B:83:0x01f9, B:84:0x0208, B:88:0x0211, B:90:0x0215, B:93:0x0241, B:95:0x0259, B:97:0x0268, B:101:0x0272, B:103:0x0276, B:107:0x02b0, B:109:0x02cd, B:111:0x02df, B:112:0x02e6, B:113:0x02e7, B:16:0x007d, B:32:0x0117), top: B:129:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02cd A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:9:0x0038, B:61:0x01a2, B:80:0x01f1, B:83:0x01f9, B:84:0x0208, B:88:0x0211, B:90:0x0215, B:93:0x0241, B:95:0x0259, B:97:0x0268, B:101:0x0272, B:103:0x0276, B:107:0x02b0, B:109:0x02cd, B:111:0x02df, B:112:0x02e6, B:113:0x02e7, B:16:0x007d, B:32:0x0117), top: B:129:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x02df A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:9:0x0038, B:61:0x01a2, B:80:0x01f1, B:83:0x01f9, B:84:0x0208, B:88:0x0211, B:90:0x0215, B:93:0x0241, B:95:0x0259, B:97:0x0268, B:101:0x0272, B:103:0x0276, B:107:0x02b0, B:109:0x02cd, B:111:0x02df, B:112:0x02e6, B:113:0x02e7, B:16:0x007d, B:32:0x0117), top: B:129:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02e7 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #2 {all -> 0x0052, blocks: (B:9:0x0038, B:61:0x01a2, B:80:0x01f1, B:83:0x01f9, B:84:0x0208, B:88:0x0211, B:90:0x0215, B:93:0x0241, B:95:0x0259, B:97:0x0268, B:101:0x0272, B:103:0x0276, B:107:0x02b0, B:109:0x02cd, B:111:0x02df, B:112:0x02e6, B:113:0x02e7, B:16:0x007d, B:32:0x0117), top: B:129:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0306  */
    /* JADX WARN: Code duplicated, block: B:123:0x0309  */
    /* JADX WARN: Code duplicated, block: B:35:0x011d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0123  */
    /* JADX WARN: Code duplicated, block: B:41:0x012b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f9 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:9:0x0038, B:61:0x01a2, B:80:0x01f1, B:83:0x01f9, B:84:0x0208, B:88:0x0211, B:90:0x0215, B:93:0x0241, B:95:0x0259, B:97:0x0268, B:101:0x0272, B:103:0x0276, B:107:0x02b0, B:109:0x02cd, B:111:0x02df, B:112:0x02e6, B:113:0x02e7, B:16:0x007d, B:32:0x0117), top: B:129:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0208 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:9:0x0038, B:61:0x01a2, B:80:0x01f1, B:83:0x01f9, B:84:0x0208, B:88:0x0211, B:90:0x0215, B:93:0x0241, B:95:0x0259, B:97:0x0268, B:101:0x0272, B:103:0x0276, B:107:0x02b0, B:109:0x02cd, B:111:0x02df, B:112:0x02e6, B:113:0x02e7, B:16:0x007d, B:32:0x0117), top: B:129:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x020e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0210  */
    /* JADX WARN: Code duplicated, block: B:90:0x0215 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:9:0x0038, B:61:0x01a2, B:80:0x01f1, B:83:0x01f9, B:84:0x0208, B:88:0x0211, B:90:0x0215, B:93:0x0241, B:95:0x0259, B:97:0x0268, B:101:0x0272, B:103:0x0276, B:107:0x02b0, B:109:0x02cd, B:111:0x02df, B:112:0x02e6, B:113:0x02e7, B:16:0x007d, B:32:0x0117), top: B:129:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:92:0x023f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0241 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:9:0x0038, B:61:0x01a2, B:80:0x01f1, B:83:0x01f9, B:84:0x0208, B:88:0x0211, B:90:0x0215, B:93:0x0241, B:95:0x0259, B:97:0x0268, B:101:0x0272, B:103:0x0276, B:107:0x02b0, B:109:0x02cd, B:111:0x02df, B:112:0x02e6, B:113:0x02e7, B:16:0x007d, B:32:0x0117), top: B:129:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:94:0x024e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0259 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:9:0x0038, B:61:0x01a2, B:80:0x01f1, B:83:0x01f9, B:84:0x0208, B:88:0x0211, B:90:0x0215, B:93:0x0241, B:95:0x0259, B:97:0x0268, B:101:0x0272, B:103:0x0276, B:107:0x02b0, B:109:0x02cd, B:111:0x02df, B:112:0x02e6, B:113:0x02e7, B:16:0x007d, B:32:0x0117), top: B:129:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0268 A[Catch: all -> 0x0052, TryCatch #2 {all -> 0x0052, blocks: (B:9:0x0038, B:61:0x01a2, B:80:0x01f1, B:83:0x01f9, B:84:0x0208, B:88:0x0211, B:90:0x0215, B:93:0x0241, B:95:0x0259, B:97:0x0268, B:101:0x0272, B:103:0x0276, B:107:0x02b0, B:109:0x02cd, B:111:0x02df, B:112:0x02e6, B:113:0x02e7, B:16:0x007d, B:32:0x0117), top: B:129:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:99:0x026f  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fc, code lost:
    
        if (r0 == r2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a7, code lost:
    
        r29 = r10;
        r31 = r12;
        r12 = r5;
        r10 = r7;
        r7 = r19;
        r5 = r20;
        r6 = r0;
        r8 = r4;
        r0 = r9;
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b5, code lost:
    
        r9 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ba, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bb, code lost:
    
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01be, code lost:
    
        r31 = r4;
        r15 = r6;
        r4 = r21;
        r29 = r23;
        r5 = r37;
        r6 = r0;
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ca, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cb, code lost:
    
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01da, code lost:
    
        r21 = r4;
        r37 = r5;
        r4 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e6, code lost:
    
        r21 = r4;
        r37 = r5;
        r4 = r26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x02c7 -> B:45:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01f9 -> B:45:0x0144). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ylu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
