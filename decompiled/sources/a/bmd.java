package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class bmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f2832a = new zfn(new a7d(20), (byte) 1);
    public static final zfn b = new zfn(new a7d(21), (byte) 1);
    public static final zfn c = new zfn(new a7d(26), (byte) 1);
    public static final zfn d = new zfn(new a7d(27), (byte) 1);
    public static final zfn e = new zfn(new a7d(28), (byte) 1);
    public static final zfn f = new zfn(new a7d(29), (byte) 1);
    public static final zfn g = new zfn(new yld(0), (byte) 1);
    public static final zfn h = new zfn(new yld(2), (byte) 1);
    public static final zfn i = new zfn(new yld(3), (byte) 1);
    public static final zfn j = new zfn(new yld(4), (byte) 1);
    public static final zfn k = new zfn(new yld(1), (byte) 1);
    public static final zfn l = new zfn(new yld(5), (byte) 1);
    public static final zfn m = new zfn(new yld(6), (byte) 1);
    public static final zfn n = new zfn(new yld(7), (byte) 1);
    public static final zfn o = new zfn(new yld(8), (byte) 1);
    public static final zfn p;
    public static final zfn q;
    public static final zfn r;
    public static final zfn s;
    public static final zfn t;
    public static final zfn u;
    public static final zfn v;
    public static final zfn w;
    public static final zfn x;
    public static final zfn y;

    static {
        maz.b(new yld((byte) 13));
        p = new zfn(new yld((byte) 9), (byte) 1);
        q = new zfn(new yld((byte) 10), (byte) 1);
        r = new zfn(new yld((byte) 11), (byte) 1);
        s = new zfn(new yld((byte) 12), (byte) 1);
        t = new zfn(new a7d((byte) 22), (byte) 1);
        u = new zfn(new a7d((byte) 23), (byte) 1);
        v = new zfn(new a7d((byte) 24), (byte) 1);
        w = new zfn(new a7d((byte) 25), (byte) 1);
        x = new zfn(new v9q((byte) 17), (byte) 0);
        y = new zfn(new xal((byte) 3), (byte) 1);
    }

    public static final void a(final cg80 cg80Var, u23 u23Var, ugd ugdVar, fet fetVar, int i2) {
        fetVar.g0(1925803616);
        int i3 = i2 | (fetVar.g(cg80Var) ? 4 : 2) | (fetVar.g(u23Var) ? 32 : 16) | (fetVar.i(ugdVar) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            l5d0 l5d0VarA = f2832a.a(cg80Var.getAccessibilityManager());
            l5d0 l5d0VarA2 = b.a(cg80Var.getAutofill());
            l5d0 l5d0VarA3 = d.a(cg80Var.getAutofillManager());
            l5d0 l5d0VarA4 = c.a(cg80Var.getAutofillTree());
            l5d0 l5d0VarA5 = e.a(cg80Var.getClipboardManager());
            l5d0 l5d0VarA6 = f.a(cg80Var.getClipboard());
            l5d0 l5d0VarA7 = h.a(cg80Var.getDensity());
            l5d0 l5d0VarA8 = i.a(cg80Var.getFocusOwner());
            l5d0 l5d0VarA9 = j.a(cg80Var.getFontLoader());
            l5d0VarA9.g = false;
            l5d0 l5d0VarA10 = k.a(cg80Var.getFontFamilyResolver());
            l5d0VarA10.g = false;
            l5d0 l5d0VarA11 = l.a(cg80Var.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                final byte b2 = 0;
                objP = new Function1() { // from class: a.zld
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        cg80 cg80Var2 = cg80Var;
                        switch (b3) {
                            case 0:
                                return cg80Var2.getInputModeManager();
                            case 1:
                                return cg80Var2.getTextInputService();
                            case 2:
                                return cg80Var2.getSoftwareKeyboardController();
                            case 3:
                                return cg80Var2.getTextToolbar();
                            default:
                                return cg80Var2.getPointerIconService();
                        }
                    }
                };
                fetVar.o0(objP);
            }
            l5d0 l5d0VarC = m.c((Function1) objP);
            l5d0 l5d0VarA12 = n.a(cg80Var.getLayoutDirection());
            boolean z2 = i4 == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                final byte b3 = 1;
                objP2 = new Function1() { // from class: a.zld
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        cg80 cg80Var2 = cg80Var;
                        switch (b4) {
                            case 0:
                                return cg80Var2.getInputModeManager();
                            case 1:
                                return cg80Var2.getTextInputService();
                            case 2:
                                return cg80Var2.getSoftwareKeyboardController();
                            case 3:
                                return cg80Var2.getTextToolbar();
                            default:
                                return cg80Var2.getPointerIconService();
                        }
                    }
                };
                fetVar.o0(objP2);
            }
            l5d0 l5d0VarC2 = p.c((Function1) objP2);
            boolean z3 = i4 == 4;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                final byte b4 = 2;
                objP3 = new Function1() { // from class: a.zld
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b5 = b4;
                        cg80 cg80Var2 = cg80Var;
                        switch (b5) {
                            case 0:
                                return cg80Var2.getInputModeManager();
                            case 1:
                                return cg80Var2.getTextInputService();
                            case 2:
                                return cg80Var2.getSoftwareKeyboardController();
                            case 3:
                                return cg80Var2.getTextToolbar();
                            default:
                                return cg80Var2.getPointerIconService();
                        }
                    }
                };
                fetVar.o0(objP3);
            }
            l5d0 l5d0VarC3 = q.c((Function1) objP3);
            boolean z4 = i4 == 4;
            Object objP4 = fetVar.P();
            final byte b5 = 3;
            if (z4 || objP4 == cl5Var) {
                objP4 = new Function1() { // from class: a.zld
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b6 = b5;
                        cg80 cg80Var2 = cg80Var;
                        switch (b6) {
                            case 0:
                                return cg80Var2.getInputModeManager();
                            case 1:
                                return cg80Var2.getTextInputService();
                            case 2:
                                return cg80Var2.getSoftwareKeyboardController();
                            case 3:
                                return cg80Var2.getTextToolbar();
                            default:
                                return cg80Var2.getPointerIconService();
                        }
                    }
                };
                fetVar.o0(objP4);
            }
            l5d0 l5d0VarC4 = r.c((Function1) objP4);
            l5d0 l5d0VarA13 = s.a(u23Var);
            l5d0 l5d0VarA14 = t.a(cg80Var.getViewConfiguration());
            l5d0 l5d0VarA15 = u.a(cg80Var.getWindowInfo());
            final byte b6 = 4;
            boolean z5 = i4 == 4;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new Function1() { // from class: a.zld
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b7 = b6;
                        cg80 cg80Var2 = cg80Var;
                        switch (b7) {
                            case 0:
                                return cg80Var2.getInputModeManager();
                            case 1:
                                return cg80Var2.getTextInputService();
                            case 2:
                                return cg80Var2.getSoftwareKeyboardController();
                            case 3:
                                return cg80Var2.getTextToolbar();
                            default:
                                return cg80Var2.getPointerIconService();
                        }
                    }
                };
                fetVar.o0(objP5);
            }
            obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarA3, l5d0VarA4, l5d0VarA5, l5d0VarA6, l5d0VarA7, l5d0VarA8, l5d0VarA9, l5d0VarA10, l5d0VarA11, l5d0VarC, l5d0VarA12, l5d0VarC2, l5d0VarC3, l5d0VarC4, l5d0VarA13, l5d0VarA14, l5d0VarA15, w.c((Function1) objP5), g.a(cg80Var.getGraphicsContext()), wr00.f39616a.a(cg80Var.getRetainedValuesStore()), o.a(cg80Var.getLocaleList())}, ugdVar, fetVar, ((i3 >> 3) & 112) | 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(cg80Var, u23Var, ugdVar, i2, (byte) 16);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
