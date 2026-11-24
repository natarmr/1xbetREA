package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class pwt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cf60 f27727a = new cf60(pe60.f26836a, 0, 0);

    public static final nls0 a(vuu0 vuu0Var, j83 j83Var) {
        nls0 nls0VarA = vuu0Var.a(j83Var);
        int length = j83Var.b.length();
        j83 j83Var2 = nls0VarA.f23743a;
        qe60 qe60Var = nls0VarA.b;
        int length2 = j83Var2.b.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(qe60Var.s(i), length2, i);
        }
        b(qe60Var.s(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(qe60Var.n(i2), length, i2);
        }
        c(qe60Var.n(length2), length, length2);
        return new nls0(j83Var2, new cf60(qe60Var, j83Var.b.length(), j83Var2.b.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbT = dw9.t("OffsetMapping.originalToTransformed returned invalid mapping: ", i3, " -> ", " is not in range of transformed text [0, ", i);
        sbT.append(i2);
        sbT.append("]");
        adx.c(sbT.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbT = dw9.t("OffsetMapping.transformedToOriginal returned invalid mapping: ", i3, " -> ", " is not in range of original text [0, ", i);
        sbT.append(i2);
        sbT.append("]");
        adx.c(sbT.toString());
    }
}
