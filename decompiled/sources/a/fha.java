package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public enum fha implements Serializable {
    d(0, "TIME_OUT"),
    e(1, "FIRST_ATTACK"),
    f(1, "SECOND_ATTACK"),
    g(1, "THIRD_ATTACK"),
    h(2, "FORTH_ATTACK"),
    i(2, "FIFTH_ATTACK"),
    j(2, "SIXTH_ATTACK");

    public static final bj5 c = new bj5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f9530a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    fha(int i2, String str) {
        this.f9530a = i;
        this.b = i2;
    }
}
