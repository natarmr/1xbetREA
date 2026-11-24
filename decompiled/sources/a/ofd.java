package a;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ofd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25161a = null;
    public final HashSet b;
    public final HashSet c;
    public byte d;
    public boolean e;
    public jgd f;
    public final HashSet g;

    public ofd(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(jkd0.a(cls));
        for (Class cls2 : clsArr) {
            g1x.q(cls2, "Null interface");
            this.b.add(jkd0.a(cls2));
        }
    }

    public final void a(c7k c7kVar) {
        if (this.b.contains(c7kVar.f3867a)) {
            jf4.o("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(c7kVar);
        }
    }

    public final pfd b() {
        if (!(this.f != null)) {
            jf4.n("Missing required property: factory.");
            return null;
        }
        return new pfd(this.f25161a, new HashSet(this.b), new HashSet(this.c), this.d, this.e ? 1 : 0, this.f, this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i) {
        if (this.d == 0) {
            this.d = i;
        } else {
            jf4.n("Instantiation type has already been set.");
        }
    }

    public ofd(jkd0 jkd0Var, jkd0... jkd0VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(jkd0Var);
        for (jkd0 jkd0Var2 : jkd0VarArr) {
            g1x.q(jkd0Var2, "Null interface");
        }
        Collections.addAll(this.b, jkd0VarArr);
    }
}
