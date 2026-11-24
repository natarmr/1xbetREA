package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nru0 {
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmt0 f24023a;
    public final jmb b;
    public final knf0 c;

    static {
        uen uenVar = wen.b;
        d = ibc.v0(30, bfn.SECONDS);
    }

    public nru0(nmt0 nmt0Var, jmb jmbVar, knf0 knf0Var) {
        knf0Var.getClass();
        this.f24023a = nmt0Var;
        this.b = jmbVar;
        this.c = knf0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:86|30|31|83|32|33|(1:36)|73) */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:40:0x011e A[Catch: all -> 0x009c, LOOP:0: B:38:0x0118->B:40:0x011e, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x009c, blocks: (B:37:0x0107, B:38:0x0118, B:40:0x011e, B:22:0x0096), top: B:88:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x013d A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:14:0x0045, B:42:0x012c, B:46:0x0135, B:49:0x013d, B:52:0x0146, B:56:0x0150, B:58:0x0154, B:61:0x0174, B:63:0x017f, B:65:0x0187, B:69:0x0191, B:71:0x0195, B:74:0x01b5, B:75:0x01be, B:77:0x01c8, B:78:0x01cf, B:79:0x01d0, B:19:0x0070, B:27:0x00b2), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0146 A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:14:0x0045, B:42:0x012c, B:46:0x0135, B:49:0x013d, B:52:0x0146, B:56:0x0150, B:58:0x0154, B:61:0x0174, B:63:0x017f, B:65:0x0187, B:69:0x0191, B:71:0x0195, B:74:0x01b5, B:75:0x01be, B:77:0x01c8, B:78:0x01cf, B:79:0x01d0, B:19:0x0070, B:27:0x00b2), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154 A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:14:0x0045, B:42:0x012c, B:46:0x0135, B:49:0x013d, B:52:0x0146, B:56:0x0150, B:58:0x0154, B:61:0x0174, B:63:0x017f, B:65:0x0187, B:69:0x0191, B:71:0x0195, B:74:0x01b5, B:75:0x01be, B:77:0x01c8, B:78:0x01cf, B:79:0x01d0, B:19:0x0070, B:27:0x00b2), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x0174 A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:14:0x0045, B:42:0x012c, B:46:0x0135, B:49:0x013d, B:52:0x0146, B:56:0x0150, B:58:0x0154, B:61:0x0174, B:63:0x017f, B:65:0x0187, B:69:0x0191, B:71:0x0195, B:74:0x01b5, B:75:0x01be, B:77:0x01c8, B:78:0x01cf, B:79:0x01d0, B:19:0x0070, B:27:0x00b2), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x017f A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:14:0x0045, B:42:0x012c, B:46:0x0135, B:49:0x013d, B:52:0x0146, B:56:0x0150, B:58:0x0154, B:61:0x0174, B:63:0x017f, B:65:0x0187, B:69:0x0191, B:71:0x0195, B:74:0x01b5, B:75:0x01be, B:77:0x01c8, B:78:0x01cf, B:79:0x01d0, B:19:0x0070, B:27:0x00b2), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0187 A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:14:0x0045, B:42:0x012c, B:46:0x0135, B:49:0x013d, B:52:0x0146, B:56:0x0150, B:58:0x0154, B:61:0x0174, B:63:0x017f, B:65:0x0187, B:69:0x0191, B:71:0x0195, B:74:0x01b5, B:75:0x01be, B:77:0x01c8, B:78:0x01cf, B:79:0x01d0, B:19:0x0070, B:27:0x00b2), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0190  */
    /* JADX WARN: Code duplicated, block: B:71:0x0195 A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:14:0x0045, B:42:0x012c, B:46:0x0135, B:49:0x013d, B:52:0x0146, B:56:0x0150, B:58:0x0154, B:61:0x0174, B:63:0x017f, B:65:0x0187, B:69:0x0191, B:71:0x0195, B:74:0x01b5, B:75:0x01be, B:77:0x01c8, B:78:0x01cf, B:79:0x01d0, B:19:0x0070, B:27:0x00b2), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b5 A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:14:0x0045, B:42:0x012c, B:46:0x0135, B:49:0x013d, B:52:0x0146, B:56:0x0150, B:58:0x0154, B:61:0x0174, B:63:0x017f, B:65:0x0187, B:69:0x0191, B:71:0x0195, B:74:0x01b5, B:75:0x01be, B:77:0x01c8, B:78:0x01cf, B:79:0x01d0, B:19:0x0070, B:27:0x00b2), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01be A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:14:0x0045, B:42:0x012c, B:46:0x0135, B:49:0x013d, B:52:0x0146, B:56:0x0150, B:58:0x0154, B:61:0x0174, B:63:0x017f, B:65:0x0187, B:69:0x0191, B:71:0x0195, B:74:0x01b5, B:75:0x01be, B:77:0x01c8, B:78:0x01cf, B:79:0x01d0, B:19:0x0070, B:27:0x00b2), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x01c8 A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:14:0x0045, B:42:0x012c, B:46:0x0135, B:49:0x013d, B:52:0x0146, B:56:0x0150, B:58:0x0154, B:61:0x0174, B:63:0x017f, B:65:0x0187, B:69:0x0191, B:71:0x0195, B:74:0x01b5, B:75:0x01be, B:77:0x01c8, B:78:0x01cf, B:79:0x01d0, B:19:0x0070, B:27:0x00b2), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0 A[Catch: all -> 0x01d1, TRY_LEAVE, TryCatch #1 {all -> 0x01d1, blocks: (B:14:0x0045, B:42:0x012c, B:46:0x0135, B:49:0x013d, B:52:0x0146, B:56:0x0150, B:58:0x0154, B:61:0x0174, B:63:0x017f, B:65:0x0187, B:69:0x0191, B:71:0x0195, B:74:0x01b5, B:75:0x01be, B:77:0x01c8, B:78:0x01cf, B:79:0x01d0, B:19:0x0070, B:27:0x00b2), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0130, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0131, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0134, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b2, code lost:
    
        if (a.qcc.P(r10, r6) == r3) goto L73;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x017c -> B:51:0x0143). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(int r20, a.zje r21, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage r22) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nru0.a(int, a.zje, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage):java.io.Serializable");
    }
}
