package a;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class qm40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f28965a;
    public vy40 b;
    public vy40 c;
    public vy40 d;
    public vy40 e;
    public boolean f;

    public qm40(AndroidComposeView androidComposeView) {
        this.f28965a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static void b(lm40 lm40Var, i5d0 i5d0Var) {
        if (!lm40Var.f20279a.n) {
            xcx.b("visitSubtreeIf called on an unattached node");
        }
        xz40 xz40Var = new xz40(new lm40[16]);
        lm40 lm40Var2 = lm40Var.f20279a;
        lm40 lm40Var3 = lm40Var2.f;
        if (lm40Var3 == null) {
            vcc.v(xz40Var, lm40Var2);
        } else {
            xz40Var.b(lm40Var3);
        }
        while (true) {
            int i = xz40Var.c;
            if (i == 0) {
                return;
            }
            lm40 lm40Var4 = (lm40) xz40Var.k(i - 1);
            if ((lm40Var4.d & 32) != 0) {
                lm40 lm40Var5 = lm40Var4;
                while (true) {
                    if (lm40Var5 != null && lm40Var5.n) {
                        if ((lm40Var5.c & 32) != 0) {
                            ?? V = lm40Var5;
                            ?? xz40Var2 = 0;
                            while (V != 0) {
                                if (V instanceof rm40) {
                                    if (((rm40) V).I().D(i5d0Var)) {
                                        break;
                                    }
                                } else if ((V.c & 32) != 0 && (V instanceof f3k)) {
                                    lm40 lm40Var6 = ((f3k) V).p;
                                    int i2 = 0;
                                    V = V;
                                    xz40Var2 = xz40Var2;
                                    while (lm40Var6 != null) {
                                        if ((lm40Var6.c & 32) != 0) {
                                            i2++;
                                            xz40Var2 = xz40Var2;
                                            if (i2 == 1) {
                                                V = lm40Var6;
                                            } else {
                                                if (xz40Var2 == 0) {
                                                    xz40Var2 = new xz40(new lm40[16]);
                                                }
                                                if (V != 0) {
                                                    xz40Var2.b(V);
                                                    V = 0;
                                                }
                                                xz40Var2.b(lm40Var6);
                                            }
                                        }
                                        lm40Var6 = lm40Var6.f;
                                        V = V;
                                        xz40Var2 = xz40Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                V = vcc.V(xz40Var2);
                            }
                        }
                        lm40Var5 = lm40Var5.f;
                    }
                }
            }
            vcc.v(xz40Var, lm40Var4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        np30 np30Var = new np30(this, (byte) 10);
        vy40 vy40Var = this.f28965a.Q1;
        if (vy40Var.e(np30Var)) {
            return;
        }
        vy40Var.a(np30Var);
    }
}
