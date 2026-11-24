package a;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dr30 implements cr30 {
    @Override // a.cr30
    public Collection a(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        return iun.f15405a;
    }

    @Override // a.cr30
    public Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        return iun.f15405a;
    }

    @Override // a.cr30
    public Set c() {
        Collection collectionB = b(cek.p, ske.B);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionB) {
            if (obj instanceof fyj0) {
                g950 name = ((fyj0) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // a.cr30
    public foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        return null;
    }

    @Override // a.cr30
    public Set e() {
        return null;
    }

    @Override // a.cr30
    public Collection f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        return iun.f15405a;
    }

    @Override // a.cr30
    public Set g() {
        Collection collectionB = b(cek.q, ske.B);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionB) {
            if (obj instanceof r3u0) {
                g950 name = ((r3u0) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
