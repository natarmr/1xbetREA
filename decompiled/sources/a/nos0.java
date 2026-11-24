package a;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class nos0 implements mos0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f23881a;
    public final q55 b;
    public final eps0 c;

    public nos0(Set set, q55 q55Var, eps0 eps0Var) {
        this.f23881a = set;
        this.b = q55Var;
        this.c = eps0Var;
    }

    public final vkr0 a(String str, gwn gwnVar, ols0 ols0Var) {
        Set set = this.f23881a;
        if (set.contains(gwnVar)) {
            return new vkr0((Object) this.b, (Object) str, (Object) gwnVar, (Object) ols0Var, (Object) this.c, (byte) 2);
        }
        jf4.l("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{gwnVar, set});
        return null;
    }
}
