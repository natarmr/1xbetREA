package a;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f35255a;
    public static final List b;
    public static final Map c;
    public static final Map d;
    public static final LinkedHashMap e;

    static {
        x83 x83Var = x83.FIELD;
        x83 x83Var2 = x83.METHOD_RETURN_TYPE;
        x83 x83Var3 = x83.VALUE_PARAMETER;
        List listJ = q3d.j(x83Var, x83Var2, x83Var3, x83.TYPE_PARAMETER_BOUNDS, x83.TYPE_USE);
        f35255a = listJ;
        List listC = kotlin.collections.a.c(x83Var3);
        b = listC;
        swq swqVar = cey.f4235a;
        p860 p860Var = p860.c;
        Map mapF = xp20.f(new Pair(swqVar, new t8y(new lov0(p860Var, false), listJ, false, true, true)), new Pair(cey.b, new t8y(new lov0(p860Var, false), listJ, false, true, true)), new Pair(cey.c, new t8y(new lov0(p860.f26540a, false), listJ, 4)));
        c = mapF;
        Map mapF2 = xp20.f(new Pair(cey.h, new t8y(new lov0(p860Var, false), listC, 28)), new Pair(cey.i, new t8y(new lov0(p860.b, false), listC, 28)));
        d = mapF2;
        e = xp20.j(mapF, mapF2);
    }
}
