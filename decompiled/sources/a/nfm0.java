package a;

import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class nfm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mne f23445a;
    public final kd30 b;
    public final ddm0 c;
    public final he1 d;
    public final tgk e;
    public final knf0 f;

    public nfm0(mne mneVar, kd30 kd30Var, ddm0 ddm0Var, he1 he1Var, tgk tgkVar, knf0 knf0Var) {
        ddm0Var.getClass();
        tgkVar.getClass();
        knf0Var.getClass();
        this.f23445a = mneVar;
        this.b = kd30Var;
        this.c = ddm0Var;
        this.d = he1Var;
        this.e = tgkVar;
        this.f = knf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, zje zjeVar) {
        lfm0 lfm0Var;
        ddm0 ddm0Var;
        if (zjeVar instanceof lfm0) {
            lfm0Var = (lfm0) zjeVar;
            int i = lfm0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                lfm0Var.m = i - Integer.MIN_VALUE;
            } else {
                lfm0Var = new lfm0(this, zjeVar);
            }
        } else {
            lfm0Var = new lfm0(this, zjeVar);
        }
        Object objA = lfm0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = lfm0Var.m;
        if (i2 == 0) {
            z1x.P(objA);
            knf0 knf0Var = this.f;
            LinkedHashMap linkedHashMapO = ofm0.o(knf0Var.b(), str, knf0Var.c());
            ddm0 ddm0Var2 = this.c;
            lfm0Var.i = ddm0Var2;
            lfm0Var.j = str;
            lfm0Var.m = 1;
            objA = ((e9m0) ((jfm0) this.b.b).invoke()).a(linkedHashMapO, "application/vnd.xenvelop+json", lfm0Var);
            if (objA == wneVar) {
                return wneVar;
            }
            ddm0Var = ddm0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = lfm0Var.j;
            ddm0Var = lfm0Var.i;
            z1x.P(objA);
        }
        ddm0Var.a(str, c3x.L((drj0) ((dx5) objA).a()));
        return Unit.f46060a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:41|117|42|115|43|105|106) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:108|36|37|119|38|(7:41|117|42|115|43|105|106)|40|84) */
    /* JADX WARN: Code duplicated, block: B:100:0x0229  */
    /* JADX WARN: Code duplicated, block: B:101:0x022b  */
    /* JADX WARN: Code duplicated, block: B:103:0x022f  */
    /* JADX WARN: Code duplicated, block: B:107:0x023f  */
    /* JADX WARN: Code duplicated, block: B:108:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x015c A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:53:0x0154, B:56:0x015c, B:61:0x0168, B:65:0x0171, B:67:0x0175, B:72:0x01aa, B:74:0x01b3, B:76:0x01bb, B:80:0x01c4, B:82:0x01c8, B:87:0x01ed, B:88:0x01f6, B:90:0x0202, B:91:0x0209, B:92:0x020a, B:33:0x00da), top: B:112:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0168 A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:53:0x0154, B:56:0x015c, B:61:0x0168, B:65:0x0171, B:67:0x0175, B:72:0x01aa, B:74:0x01b3, B:76:0x01bb, B:80:0x01c4, B:82:0x01c8, B:87:0x01ed, B:88:0x01f6, B:90:0x0202, B:91:0x0209, B:92:0x020a, B:33:0x00da), top: B:112:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:63:0x016e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170  */
    /* JADX WARN: Code duplicated, block: B:67:0x0175 A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:53:0x0154, B:56:0x015c, B:61:0x0168, B:65:0x0171, B:67:0x0175, B:72:0x01aa, B:74:0x01b3, B:76:0x01bb, B:80:0x01c4, B:82:0x01c8, B:87:0x01ed, B:88:0x01f6, B:90:0x0202, B:91:0x0209, B:92:0x020a, B:33:0x00da), top: B:112:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0193  */
    /* JADX WARN: Code duplicated, block: B:70:0x0194  */
    /* JADX WARN: Code duplicated, block: B:72:0x01aa A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:53:0x0154, B:56:0x015c, B:61:0x0168, B:65:0x0171, B:67:0x0175, B:72:0x01aa, B:74:0x01b3, B:76:0x01bb, B:80:0x01c4, B:82:0x01c8, B:87:0x01ed, B:88:0x01f6, B:90:0x0202, B:91:0x0209, B:92:0x020a, B:33:0x00da), top: B:112:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b3 A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:53:0x0154, B:56:0x015c, B:61:0x0168, B:65:0x0171, B:67:0x0175, B:72:0x01aa, B:74:0x01b3, B:76:0x01bb, B:80:0x01c4, B:82:0x01c8, B:87:0x01ed, B:88:0x01f6, B:90:0x0202, B:91:0x0209, B:92:0x020a, B:33:0x00da), top: B:112:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01bb A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:53:0x0154, B:56:0x015c, B:61:0x0168, B:65:0x0171, B:67:0x0175, B:72:0x01aa, B:74:0x01b3, B:76:0x01bb, B:80:0x01c4, B:82:0x01c8, B:87:0x01ed, B:88:0x01f6, B:90:0x0202, B:91:0x0209, B:92:0x020a, B:33:0x00da), top: B:112:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c8 A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:53:0x0154, B:56:0x015c, B:61:0x0168, B:65:0x0171, B:67:0x0175, B:72:0x01aa, B:74:0x01b3, B:76:0x01bb, B:80:0x01c4, B:82:0x01c8, B:87:0x01ed, B:88:0x01f6, B:90:0x0202, B:91:0x0209, B:92:0x020a, B:33:0x00da), top: B:112:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ed A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:53:0x0154, B:56:0x015c, B:61:0x0168, B:65:0x0171, B:67:0x0175, B:72:0x01aa, B:74:0x01b3, B:76:0x01bb, B:80:0x01c4, B:82:0x01c8, B:87:0x01ed, B:88:0x01f6, B:90:0x0202, B:91:0x0209, B:92:0x020a, B:33:0x00da), top: B:112:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01f6 A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:53:0x0154, B:56:0x015c, B:61:0x0168, B:65:0x0171, B:67:0x0175, B:72:0x01aa, B:74:0x01b3, B:76:0x01bb, B:80:0x01c4, B:82:0x01c8, B:87:0x01ed, B:88:0x01f6, B:90:0x0202, B:91:0x0209, B:92:0x020a, B:33:0x00da), top: B:112:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0202 A[Catch: all -> 0x0165, TryCatch #2 {all -> 0x0165, blocks: (B:53:0x0154, B:56:0x015c, B:61:0x0168, B:65:0x0171, B:67:0x0175, B:72:0x01aa, B:74:0x01b3, B:76:0x01bb, B:80:0x01c4, B:82:0x01c8, B:87:0x01ed, B:88:0x01f6, B:90:0x0202, B:91:0x0209, B:92:0x020a, B:33:0x00da), top: B:112:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:92:0x020a A[Catch: all -> 0x0165, TRY_LEAVE, TryCatch #2 {all -> 0x0165, blocks: (B:53:0x0154, B:56:0x015c, B:61:0x0168, B:65:0x0171, B:67:0x0175, B:72:0x01aa, B:74:0x01b3, B:76:0x01bb, B:80:0x01c4, B:82:0x01c8, B:87:0x01ed, B:88:0x01f6, B:90:0x0202, B:91:0x0209, B:92:0x020a, B:33:0x00da), top: B:112:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:95:0x021b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0221  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013f, code lost:
    
        r16 = r6;
        r6 = r2;
        r2 = r16;
        r16 = r8;
        r8 = r4;
        r4 = r5;
        r5 = r14;
        r14 = r13;
        r13 = r12;
        r11 = r10;
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0151, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Path cross not found for [B:10:0x0029, B:32:0x00c5], limit reached: 124 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x01e7 -> B:16:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r22, boolean r23, a.yje r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nfm0.b(java.lang.String, boolean, a.yje):java.lang.Object");
    }
}
