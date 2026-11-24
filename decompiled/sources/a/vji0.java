package a;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class vji0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final olq0 f37530a;
    public final out0 b;

    public vji0(olq0 olq0Var, out0 out0Var) {
        olq0Var.getClass();
        out0Var.getClass();
        this.f37530a = olq0Var;
        this.b = out0Var;
    }

    public final pji0 a(pji0 pji0Var) {
        String str;
        this.b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String string = uuidRandomUUID.toString();
        string.getClass();
        String lowerCase = kotlin.text.c.r(string, "-", "", false).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (pji0Var == null || (str = pji0Var.b) == null) ? lowerCase : str;
        int i = pji0Var != null ? pji0Var.c + 1 : 0;
        this.f37530a.getClass();
        return new pji0(i, olq0.a().b, lowerCase, str2);
    }
}
