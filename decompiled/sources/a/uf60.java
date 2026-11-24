package a;

/* JADX INFO: loaded from: classes5.dex */
public final class uf60 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35564a;
    public final ctf0 b;
    public final zvh0 c;

    public uf60(ctf0 ctf0Var, zvh0 zvh0Var, byte b) {
        this.f35564a = b;
        ctf0Var.getClass();
        switch (b) {
            case 1:
                this.b = ctf0Var;
                this.c = zvh0Var;
                break;
            default:
                this.b = ctf0Var;
                this.c = zvh0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:131:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:144:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:146:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:149:0x040f  */
    /* JADX WARN: Code duplicated, block: B:150:0x042b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0493  */
    /* JADX WARN: Code duplicated, block: B:158:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:162:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:164:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:165:0x04df  */
    /* JADX WARN: Code duplicated, block: B:167:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:168:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:170:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:173:0x04f4 A[LOOP:0: B:160:0x04c8->B:173:0x04f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:181:0x0516 A[LOOP:1: B:179:0x0510->B:181:0x0516, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x053f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0543  */
    /* JADX WARN: Code duplicated, block: B:189:0x0549  */
    /* JADX WARN: Code duplicated, block: B:190:0x057d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0595  */
    /* JADX WARN: Code duplicated, block: B:196:0x0599  */
    /* JADX WARN: Code duplicated, block: B:205:0x05f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x0600  */
    /* JADX WARN: Code duplicated, block: B:212:0x063b  */
    /* JADX WARN: Code duplicated, block: B:215:0x0643  */
    /* JADX WARN: Code duplicated, block: B:217:0x0646  */
    /* JADX WARN: Code duplicated, block: B:221:0x0651  */
    /* JADX WARN: Code duplicated, block: B:224:0x0658  */
    /* JADX WARN: Code duplicated, block: B:226:0x065d  */
    /* JADX WARN: Code duplicated, block: B:227:0x065f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0668  */
    /* JADX WARN: Code duplicated, block: B:294:0x0892 A[PHI: r22 r37 r40 r59
  0x0892: PHI (r22v8 a.mnb0) = (r22v2 a.mnb0), (r22v3 a.mnb0), (r22v10 a.mnb0) binds: [B:326:0x091e, B:319:0x0900, B:293:0x088c] A[DONT_GENERATE, DONT_INLINE]
  0x0892: PHI (r37v11 a.gx4) = (r37v5 a.gx4), (r37v6 a.gx4), (r37v12 a.gx4) binds: [B:326:0x091e, B:319:0x0900, B:293:0x088c] A[DONT_GENERATE, DONT_INLINE]
  0x0892: PHI (r40v9 a.kwo0) = (r40v4 a.kwo0), (r40v4 a.kwo0), (r40v10 a.kwo0) binds: [B:326:0x091e, B:319:0x0900, B:293:0x088c] A[DONT_GENERATE, DONT_INLINE]
  0x0892: PHI (r59v6 a.ue9) = (r59v0 a.ue9), (r59v0 a.ue9), (r59v7 a.ue9) binds: [B:326:0x091e, B:319:0x0900, B:293:0x088c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:329:0x0923 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:331:0x0928  */
    /* JADX WARN: Code duplicated, block: B:334:0x0939  */
    /* JADX WARN: Code duplicated, block: B:341:0x095d  */
    /* JADX WARN: Code duplicated, block: B:344:0x0962  */
    /* JADX WARN: Code duplicated, block: B:346:0x097b  */
    /* JADX WARN: Code duplicated, block: B:392:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:393:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:500:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x04f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0226  */
    /* JADX WARN: Code duplicated, block: B:90:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0250  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c3, code lost:
    
        if (r0 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01dd, code lost:
    
        if (r0 == false) goto L60;
     */
    @Override // a.v6t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r71) {
        /*
            Method dump skipped, instruction units count: 3442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uf60.invoke(java.lang.Object):java.lang.Object");
    }
}
