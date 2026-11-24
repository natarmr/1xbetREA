package a;

/* JADX INFO: loaded from: classes.dex */
public final class q460 implements r460 {
    @Override // a.r460
    public final int b() {
        return 16;
    }

    @Override // a.r460
    public final boolean c(e7z e7zVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // a.r460
    public final boolean d(raw rawVar, e7z e7zVar) {
        s460 s460Var = (s460) e7zVar.h1.e;
        s460Var.getClass();
        lm40 lm40VarJ1 = s460Var.j1(t460.g(16));
        if (lm40VarJ1 != null && lm40VarJ1.n) {
            if (!lm40VarJ1.f20279a.n) {
                xcx.b("visitLocalDescendants called on an unattached node");
            }
            lm40 lm40Var = lm40VarJ1.f20279a;
            if ((lm40Var.d & 16) != 0) {
                while (lm40Var != null) {
                    if ((lm40Var.c & 16) != 0) {
                        ?? V = lm40Var;
                        ?? xz40Var = 0;
                        while (V != 0) {
                            if (V instanceof gpa0) {
                                if (((gpa0) V).F0()) {
                                    rawVar.c = rawVar.f30156a.b - 1;
                                    return true;
                                }
                            } else if ((V.c & 16) != 0 && (V instanceof f3k)) {
                                lm40 lm40Var2 = ((f3k) V).p;
                                int i = 0;
                                V = V;
                                xz40Var = xz40Var;
                                while (lm40Var2 != null) {
                                    if ((lm40Var2.c & 16) != 0) {
                                        i++;
                                        xz40Var = xz40Var;
                                        if (i == 1) {
                                            V = lm40Var2;
                                        } else {
                                            if (xz40Var == 0) {
                                                xz40Var = new xz40(new lm40[16]);
                                            }
                                            if (V != 0) {
                                                xz40Var.b(V);
                                                V = 0;
                                            }
                                            xz40Var.b(lm40Var2);
                                        }
                                    }
                                    lm40Var2 = lm40Var2.f;
                                    V = V;
                                    xz40Var = xz40Var;
                                }
                                if (i == 1) {
                                }
                            }
                            V = vcc.V(xz40Var);
                        }
                    }
                    lm40Var = lm40Var.f;
                }
            }
        }
        return false;
    }

    @Override // a.r460
    public final void g(e7z e7zVar, long j, raw rawVar, int i, boolean z) {
        e7zVar.B(j, rawVar, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r7v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // a.r460
    public final boolean h(lm40 lm40Var) {
        ?? xz40Var = 0;
        while (true) {
            int i = 0;
            if (lm40Var == 0) {
                return false;
            }
            if (lm40Var instanceof gpa0) {
                ((gpa0) lm40Var).D();
            } else if ((lm40Var.c & 16) != 0 && (lm40Var instanceof f3k)) {
                lm40 lm40Var2 = ((f3k) lm40Var).p;
                xz40Var = xz40Var;
                lm40Var = lm40Var;
                while (lm40Var2 != null) {
                    if ((lm40Var2.c & 16) != 0) {
                        i++;
                        xz40Var = xz40Var;
                        if (i == 1) {
                            lm40Var = lm40Var2;
                        } else {
                            if (xz40Var == 0) {
                                xz40Var = new xz40(new lm40[16]);
                            }
                            if (lm40Var != 0) {
                                xz40Var.b(lm40Var);
                                lm40Var = 0;
                            }
                            xz40Var.b(lm40Var2);
                        }
                    }
                    lm40Var2 = lm40Var2.f;
                    xz40Var = xz40Var;
                    lm40Var = lm40Var;
                }
                if (i == 1) {
                }
            }
            lm40Var = vcc.V(xz40Var);
        }
    }
}
