package a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class pfd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26897a;
    public final Set b;
    public final Set c;
    public final byte d;
    public final boolean e;
    public final jgd f;
    public final Set g;

    /* JADX WARN: Multi-variable type inference failed */
    public pfd(String str, Set set, Set set2, int i, int i2, jgd jgdVar, Set set3) {
        this.f26897a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = jgdVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static ofd a(jkd0 jkd0Var) {
        return new ofd(jkd0Var, new jkd0[0]);
    }

    public static ofd b(Class cls) {
        return new ofd(cls, new Class[0]);
    }

    public static pfd c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(jkd0.a(cls));
        for (Class cls2 : clsArr) {
            g1x.q(cls2, "Null interface");
            hashSet.add(jkd0.a(cls2));
        }
        return new pfd(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new nfd(obj, (byte) 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + ((int) this.d) + ", type=" + (this.e ? 1 : 0) + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
