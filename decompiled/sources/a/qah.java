package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class qah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw20 f28394a;
    public final sd60 b;

    public qah(nw20 nw20Var, sd60 sd60Var) {
        this.f28394a = nw20Var;
        this.b = sd60Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, zje zjeVar) {
        kah kahVar;
        Object g0g0Var;
        Object obj;
        if (zjeVar instanceof kah) {
            kahVar = (kah) zjeVar;
            int i = kahVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kahVar.k = i - Integer.MIN_VALUE;
            } else {
                kahVar = new kah(this, zjeVar);
            }
        } else {
            kahVar = new kah(this, zjeVar);
        }
        Object objD = kahVar.i;
        wne wneVar = wne.f39444a;
        int i2 = kahVar.k;
        sd60 sd60Var = this.b;
        try {
            if (i2 == 0) {
                z1x.P(objD);
                jo20 jo20VarF = lvm0.f(str, str2);
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = (smg) sd60Var.b;
                if (g0g0Var == null) {
                    nw20 nw20Var = this.f28394a;
                    kahVar.k = 1;
                    objD = nw20Var.d(jo20VarF, kahVar);
                    if (objD == wneVar) {
                        return wneVar;
                    }
                }
                e0g0 e0g0Var2 = j0g0.b;
                obj = (smg) ((a8z) sd60Var.g).getValue();
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = obj;
                }
                smg smgVar = (smg) g0g0Var;
                smgVar.getClass();
                sd60Var.b = smgVar;
                return smgVar;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
            g0g0Var = ahb.X((List) objD);
            e0g0 e0g0Var3 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        obj = (smg) ((a8z) sd60Var.g).getValue();
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        smg smgVar2 = (smg) g0g0Var;
        smgVar2.getClass();
        sd60Var.b = smgVar2;
        return smgVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:94|34|89|35|36|37|(1:40)|73) */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x010d A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0115 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0123 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0147 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0152 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0159 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0160  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0193 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x019f A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:94:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        r21 = r8;
        r8 = r0;
        r0 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x010d -> B:33:0x00c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x014f -> B:60:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0193 -> B:60:0x0144). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r25, java.lang.String r26, a.zje r27) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qah.b(java.lang.String, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:94|34|89|35|36|37|(1:40)|73) */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x010d A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0115 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0123 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0147 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0152 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0159 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0160  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0193 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x019f A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0044, B:81:0x01a8, B:47:0x0105, B:50:0x010d, B:51:0x0115, B:55:0x011f, B:57:0x0123, B:61:0x0147, B:63:0x0152, B:65:0x0159, B:69:0x0163, B:71:0x0167, B:75:0x018a, B:76:0x0193, B:78:0x019f, B:79:0x01a6, B:80:0x01a7, B:21:0x006f, B:29:0x00af, B:31:0x00b7), top: B:91:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:94:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        r16 = r8;
        r8 = r0;
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x010d -> B:33:0x00c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x014f -> B:60:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0193 -> B:60:0x0144). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r20, java.lang.String r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qah.c(java.lang.String, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX INFO: Removed unreachable split cross block B:190:0x03e8 */
    /* JADX WARN: Can't wrap try/catch for region: R(3:148|195|149) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:36|191|(2:38|(7:41|42|(1:56)(5:46|47|48|(2:51|49)|199)|(1:58)|59|150|151))(2:62|(2:64|(7:67|68|(1:79)(6:72|73|74|(2:77|75)|200|78)|(1:81)|59|150|151))(2:83|(2:85|(7:88|89|(1:100)(6:93|94|95|(2:98|96)|201|99)|(1:102)|59|150|151))(2:104|(2:106|(7:109|110|(1:121)(6:114|115|116|(2:119|117)|202|120)|(1:123)|59|150|151))(4:125|(2:127|(5:130|131|(1:143)(6:135|136|193|137|(2:140|138)|203)|(1:145)(1:147)|59))(3:148|195|149)|150|151))))|181) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:135|136|193|137|(2:140|138)|203) */
    /* JADX WARN: Code duplicated, block: B:100:0x0273  */
    /* JADX WARN: Code duplicated, block: B:102:0x0279 A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #5 {all -> 0x018e, blocks: (B:48:0x016f, B:49:0x017a, B:51:0x0180, B:58:0x019e, B:74:0x01e8, B:75:0x01f3, B:77:0x01f9, B:81:0x020f, B:95:0x0252, B:96:0x025d, B:98:0x0263, B:102:0x0279, B:116:0x02bd, B:117:0x02c8, B:119:0x02ce, B:123:0x02e4), top: B:189:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x027d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0283 A[Catch: all -> 0x01a3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01a3, blocks: (B:38:0x0135, B:64:0x01ae, B:85:0x0218, B:106:0x0283, B:127:0x02ee), top: B:191:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b3 A[Catch: all -> 0x0193, TryCatch #0 {all -> 0x0193, blocks: (B:42:0x015b, B:44:0x0165, B:46:0x0169, B:68:0x01d4, B:70:0x01de, B:72:0x01e2, B:89:0x023e, B:91:0x0248, B:93:0x024c, B:110:0x02a9, B:112:0x02b3, B:114:0x02b7, B:131:0x0314, B:133:0x031e, B:135:0x0322), top: B:189:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02de  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e4 A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #5 {all -> 0x018e, blocks: (B:48:0x016f, B:49:0x017a, B:51:0x0180, B:58:0x019e, B:74:0x01e8, B:75:0x01f3, B:77:0x01f9, B:81:0x020f, B:95:0x0252, B:96:0x025d, B:98:0x0263, B:102:0x0279, B:116:0x02bd, B:117:0x02c8, B:119:0x02ce, B:123:0x02e4), top: B:189:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ee A[Catch: all -> 0x01a3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01a3, blocks: (B:38:0x0135, B:64:0x01ae, B:85:0x0218, B:106:0x0283, B:127:0x02ee), top: B:191:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x030c  */
    /* JADX WARN: Code duplicated, block: B:133:0x031e A[Catch: all -> 0x0193, TryCatch #0 {all -> 0x0193, blocks: (B:42:0x015b, B:44:0x0165, B:46:0x0169, B:68:0x01d4, B:70:0x01de, B:72:0x01e2, B:89:0x023e, B:91:0x0248, B:93:0x024c, B:110:0x02a9, B:112:0x02b3, B:114:0x02b7, B:131:0x0314, B:133:0x031e, B:135:0x0322), top: B:189:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x034c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0354 A[Catch: all -> 0x0347, TRY_LEAVE, TryCatch #2 {all -> 0x0347, blocks: (B:137:0x0328, B:138:0x0333, B:140:0x0339, B:145:0x0354), top: B:193:0x0328 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0358  */
    /* JADX WARN: Code duplicated, block: B:148:0x035b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0371 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0373  */
    /* JADX WARN: Code duplicated, block: B:158:0x037d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0384  */
    /* JADX WARN: Code duplicated, block: B:161:0x0386  */
    /* JADX WARN: Code duplicated, block: B:164:0x038b  */
    /* JADX WARN: Code duplicated, block: B:167:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:169:0x03af  */
    /* JADX WARN: Code duplicated, block: B:171:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:179:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:184:0x03fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:187:0x0402  */
    /* JADX WARN: Code duplicated, block: B:36:0x012b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0135 A[Catch: all -> 0x01a3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01a3, blocks: (B:38:0x0135, B:64:0x01ae, B:85:0x0218, B:106:0x0283, B:127:0x02ee), top: B:191:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0153  */
    /* JADX WARN: Code duplicated, block: B:44:0x0165 A[Catch: all -> 0x0193, TryCatch #0 {all -> 0x0193, blocks: (B:42:0x015b, B:44:0x0165, B:46:0x0169, B:68:0x01d4, B:70:0x01de, B:72:0x01e2, B:89:0x023e, B:91:0x0248, B:93:0x024c, B:110:0x02a9, B:112:0x02b3, B:114:0x02b7, B:131:0x0314, B:133:0x031e, B:135:0x0322), top: B:189:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0198  */
    /* JADX WARN: Code duplicated, block: B:58:0x019e A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #5 {all -> 0x018e, blocks: (B:48:0x016f, B:49:0x017a, B:51:0x0180, B:58:0x019e, B:74:0x01e8, B:75:0x01f3, B:77:0x01f9, B:81:0x020f, B:95:0x0252, B:96:0x025d, B:98:0x0263, B:102:0x0279, B:116:0x02bd, B:117:0x02c8, B:119:0x02ce, B:123:0x02e4), top: B:189:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ae A[Catch: all -> 0x01a3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01a3, blocks: (B:38:0x0135, B:64:0x01ae, B:85:0x0218, B:106:0x0283, B:127:0x02ee), top: B:191:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01de A[Catch: all -> 0x0193, TryCatch #0 {all -> 0x0193, blocks: (B:42:0x015b, B:44:0x0165, B:46:0x0169, B:68:0x01d4, B:70:0x01de, B:72:0x01e2, B:89:0x023e, B:91:0x0248, B:93:0x024c, B:110:0x02a9, B:112:0x02b3, B:114:0x02b7, B:131:0x0314, B:133:0x031e, B:135:0x0322), top: B:189:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0209  */
    /* JADX WARN: Code duplicated, block: B:81:0x020f A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #5 {all -> 0x018e, blocks: (B:48:0x016f, B:49:0x017a, B:51:0x0180, B:58:0x019e, B:74:0x01e8, B:75:0x01f3, B:77:0x01f9, B:81:0x020f, B:95:0x0252, B:96:0x025d, B:98:0x0263, B:102:0x0279, B:116:0x02bd, B:117:0x02c8, B:119:0x02ce, B:123:0x02e4), top: B:189:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0212  */
    /* JADX WARN: Code duplicated, block: B:85:0x0218 A[Catch: all -> 0x01a3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01a3, blocks: (B:38:0x0135, B:64:0x01ae, B:85:0x0218, B:106:0x0283, B:127:0x02ee), top: B:191:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0236  */
    /* JADX WARN: Code duplicated, block: B:91:0x0248 A[Catch: all -> 0x0193, TryCatch #0 {all -> 0x0193, blocks: (B:42:0x015b, B:44:0x0165, B:46:0x0169, B:68:0x01d4, B:70:0x01de, B:72:0x01e2, B:89:0x023e, B:91:0x0248, B:93:0x024c, B:110:0x02a9, B:112:0x02b3, B:114:0x02b7, B:131:0x0314, B:133:0x031e, B:135:0x0322), top: B:189:0x0029 }] */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0347, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0348, code lost:
    
        r3 = r22;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x036a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03e6, code lost:
    
        if (a.qcc.P(r9, r3) == r4) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03a9, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [long] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v27, types: [a.nw20] */
    /* JADX WARN: Type inference failed for: r15v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v0, types: [long] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [a.oah] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v34, types: [a.oah, a.zje] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v5, types: [a.oah, a.yje] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [long] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [long] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [long] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x03ef -> B:35:0x0129). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r22, a.zje r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qah.d(long, a.zje, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, zje zjeVar) {
        pah pahVar;
        Object g0g0Var;
        Object obj;
        if (zjeVar instanceof pah) {
            pahVar = (pah) zjeVar;
            int i = pahVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pahVar.k = i - Integer.MIN_VALUE;
            } else {
                pahVar = new pah(this, zjeVar);
            }
        } else {
            pahVar = new pah(this, zjeVar);
        }
        Object objL = pahVar.i;
        wne wneVar = wne.f39444a;
        int i2 = pahVar.k;
        sd60 sd60Var = this.b;
        try {
            if (i2 == 0) {
                z1x.P(objL);
                jo20 jo20VarF = lvm0.f(str, str2);
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = (qrh) sd60Var.d;
                if (g0g0Var == null) {
                    nw20 nw20Var = this.f28394a;
                    pahVar.k = 1;
                    objL = nw20Var.l(jo20VarF, pahVar);
                    if (objL == wneVar) {
                        return wneVar;
                    }
                }
                e0g0 e0g0Var2 = j0g0.b;
                obj = (qrh) ((a8z) sd60Var.h).getValue();
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = obj;
                }
                qrh qrhVar = (qrh) g0g0Var;
                qrhVar.getClass();
                sd60Var.d = qrhVar;
                return qrhVar;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objL);
            g0g0Var = ahb.Z((List) objL);
            e0g0 e0g0Var3 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        obj = (qrh) ((a8z) sd60Var.h).getValue();
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        qrh qrhVar2 = (qrh) g0g0Var;
        qrhVar2.getClass();
        sd60Var.d = qrhVar2;
        return qrhVar2;
    }
}
