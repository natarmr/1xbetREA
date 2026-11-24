package a;

/* JADX INFO: loaded from: classes2.dex */
public final class s2x0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31527a;

    public s2x0(int i, String str, qa3 qa3Var) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + str.length());
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, qa3Var);
        this.f31527a = i;
    }
}
