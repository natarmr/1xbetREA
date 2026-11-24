package a;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class yv00 {
    public static final p96 c;
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43296a;
    public zv00 b;

    static {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) kr20.f18745a.b;
        p96 p96Var = (p96) concurrentHashMap.get("FATAL");
        if (p96Var == null) {
            p96Var = new p96();
            p96Var.f26593a = new CopyOnWriteArrayList();
            p96 p96Var2 = (p96) concurrentHashMap.putIfAbsent("FATAL", p96Var);
            if (p96Var2 != null) {
                p96Var = p96Var2;
            }
        }
        c = p96Var;
    }

    public final void a(String str) {
        b(null, 10, str);
    }

    public final void b(p96 p96Var, int i, Object obj) {
        zv00 zv00Var = this.b;
        String string = obj == null ? (String) obj : obj.toString();
        if (i == 0) {
            zv00Var.o(p96Var, string);
            return;
        }
        if (i == 10) {
            zv00Var.h(p96Var, string);
            return;
        }
        if (i == 20) {
            zv00Var.k(p96Var, string);
        } else if (i == 30) {
            zv00Var.q(p96Var, string);
        } else {
            if (i != 40) {
                return;
            }
            zv00Var.g(p96Var, string);
        }
    }
}
