package a;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class xu00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f41489a = new ConcurrentHashMap();

    public static yv00 a(String str) {
        ConcurrentHashMap concurrentHashMap = f41489a;
        yv00 yv00Var = (yv00) concurrentHashMap.get(str);
        if (yv00Var != null) {
            return yv00Var;
        }
        yv00 yv00Var2 = new yv00();
        yv00Var2.f43296a = str;
        yv00Var2.b = aw00.b(str);
        yv00 yv00Var3 = (yv00) concurrentHashMap.putIfAbsent(str, yv00Var2);
        return yv00Var3 == null ? yv00Var2 : yv00Var3;
    }
}
