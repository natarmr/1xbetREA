package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g1q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1q0 f10528a;

    public g1q0(a1q0 a1q0Var) {
        a1q0Var.getClass();
        this.f10528a = a1q0Var;
    }

    public final List a() {
        a1q0 a1q0Var = this.f10528a;
        String string = a1q0Var.f85a.a().getString("KEY_TEST_CREDS_STORAGE", "");
        if (string == null || string.length() == 0) {
            return iun.f15405a;
        }
        try {
            return (List) a1q0Var.b.b(new zw3(d1q0.Companion.serializer(), (byte) 0), string);
        } catch (Exception unused) {
            return iun.f15405a;
        }
    }
}
