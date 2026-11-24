package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class ro00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vff0 f30814a;
    public final j1q0 b;
    public final ony c;

    public ro00(vff0 vff0Var, j1q0 j1q0Var, nwd nwdVar, ony onyVar) {
        vff0Var.getClass();
        j1q0Var.getClass();
        onyVar.getClass();
        this.f30814a = vff0Var;
        this.b = j1q0Var;
        this.c = onyVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[PHI: r0 r2
  0x0055: PHI (r0v19 java.lang.Object) = (r0v18 java.lang.Object), (r0v24 java.lang.Object) binds: [B:51:0x00e7, B:20:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r2v4 a.rhi0) = (r2v3 a.rhi0), (r2v10 a.rhi0) binds: [B:51:0x00e7, B:20:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0129, code lost:
    
        if (r10.g(r1, r14, r4) == r8) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.zje r15) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ro00.a(a.zje):java.lang.Object");
    }

    public final void b(Throwable th) {
        zhi0 zhi0Var = th instanceof zhi0 ? (zhi0) th : null;
        if (zhi0Var != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("REMOTE_CONFIG_ERROR", ncy.c("config error is " + zhi0Var.c + " and title " + zhi0Var.getMessage()));
            ((rny) this.c).a("REMOTE_CONFIG_ERROR", new tny("event", xp20.n(linkedHashMap)));
        }
    }
}
