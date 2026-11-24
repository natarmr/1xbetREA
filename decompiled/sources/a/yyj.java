package a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class yyj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43469a;
    public final r7v b;

    public yyj(Set set, r7v r7vVar) {
        this.f43469a = b(set);
        this.b = r7vVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e45 e45Var = (e45) it.next();
            sb.append(e45Var.f7166a);
            sb.append('/');
            sb.append(e45Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        r7v r7vVar = this.b;
        synchronized (((HashSet) r7vVar.f29996a)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) r7vVar.f29996a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f43469a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(' ');
        synchronized (((HashSet) r7vVar.f29996a)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) r7vVar.f29996a);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
