package a;

/* JADX INFO: loaded from: classes.dex */
public final class cqq {
    public static final cqq b = new cqq();
    public static final cqq c = new cqq();
    public static final cqq d = new cqq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xz40 f4808a = new xz40(new eqq[16]);

    public static void a(cqq cqqVar) {
        cqqVar.getClass();
        if (cqqVar == b) {
            jf4.n("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (cqqVar == c) {
            jf4.n("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        xz40 xz40Var = cqqVar.f4808a;
        int i = xz40Var.c;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = xz40Var.f41739a;
        for (int i2 = 0; i2 < i; i2++) {
            yzj yzjVar = (eqq) objArr[i2];
            if (!((lm40) yzjVar).f20279a.n) {
                xcx.b("visitChildren called on an unattached node");
            }
            xz40 xz40Var2 = new xz40(new lm40[16]);
            lm40 lm40Var = ((lm40) yzjVar).f20279a;
            lm40 lm40Var2 = lm40Var.f;
            if (lm40Var2 == null) {
                vcc.v(xz40Var2, lm40Var);
            } else {
                xz40Var2.b(lm40Var2);
            }
            while (true) {
                int i3 = xz40Var2.c;
                if (i3 == 0) {
                    break;
                }
                lm40 lm40VarV = (lm40) xz40Var2.k(i3 - 1);
                if ((lm40VarV.d & 1024) == 0) {
                    vcc.v(xz40Var2, lm40VarV);
                } else {
                    while (lm40VarV != null) {
                        if ((lm40VarV.c & 1024) != 0) {
                            xz40 xz40Var3 = null;
                            while (lm40VarV != null) {
                                if (lm40VarV instanceof nqq) {
                                    if (((nqq) lm40VarV).h1(7)) {
                                        break;
                                    }
                                } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                    int i4 = 0;
                                    for (lm40 lm40Var3 = ((f3k) lm40VarV).p; lm40Var3 != null; lm40Var3 = lm40Var3.f) {
                                        if ((lm40Var3.c & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                lm40VarV = lm40Var3;
                                            } else {
                                                if (xz40Var3 == null) {
                                                    xz40Var3 = new xz40(new lm40[16]);
                                                }
                                                if (lm40VarV != null) {
                                                    xz40Var3.b(lm40VarV);
                                                    lm40VarV = null;
                                                }
                                                xz40Var3.b(lm40Var3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                lm40VarV = vcc.V(xz40Var3);
                            }
                            break;
                        }
                        lm40VarV = lm40VarV.f;
                    }
                }
            }
        }
    }
}
