package a;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class adx0 extends giw0 {
    public final zas0 c;
    public final HashMap d;

    public adx0(zas0 zas0Var) {
        super("require");
        this.d = new HashMap();
        this.c = zas0Var;
    }

    @Override // a.giw0
    public final jlw0 a(h0q0 h0q0Var, List list) {
        jlw0 jlw0Var;
        pvm0.D("require", list, 1);
        String strZzc = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) list.get(0)).zzc();
        HashMap map = this.d;
        if (map.containsKey(strZzc)) {
            return (jlw0) map.get(strZzc);
        }
        HashMap map2 = (HashMap) this.c.b;
        if (map2.containsKey(strZzc)) {
            try {
                jlw0Var = (jlw0) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                jf4.n("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
                return null;
            }
        } else {
            jlw0Var = jlw0.V0;
        }
        if (jlw0Var instanceof giw0) {
            map.put(strZzc, (giw0) jlw0Var);
        }
        return jlw0Var;
    }
}
