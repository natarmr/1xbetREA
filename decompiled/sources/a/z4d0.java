package a;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class z4d0 {
    public static final z4d0 c = new z4d0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bbw0 f43766a = new bbw0((byte) 2);

    public final o2h0 a(Class cls) {
        o2h0 o2h0VarY;
        Class cls2;
        cmx.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        o2h0 o2h0Var = (o2h0) concurrentHashMap.get(cls);
        if (o2h0Var != null) {
            return o2h0Var;
        }
        Class cls3 = w2h0.f38448a;
        if (!jjt.class.isAssignableFrom(cls) && (cls2 = w2h0.f38448a) != null && !cls2.isAssignableFrom(cls)) {
            jf4.o("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        x9e0 x9e0VarA = ((ao20) this.f43766a.b).a(cls);
        if ((x9e0VarA.d & 2) == 2) {
            if (jjt.class.isAssignableFrom(cls)) {
                o2h0VarY = new r640(w2h0.d, yso.f43178a, x9e0VarA.f40506a);
            } else {
                zdt0 zdt0Var = w2h0.b;
                vso vsoVar = yso.b;
                if (vsoVar == null) {
                    jf4.n("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                o2h0VarY = new r640(zdt0Var, vsoVar, x9e0VarA.f40506a);
            }
        } else if (jjt.class.isAssignableFrom(cls)) {
            o2h0VarY = (x9e0VarA.d & 1) == 1 ? o640.y(x9e0VarA, gm50.b, dd00.b, w2h0.d, yso.f43178a, ap20.b) : o640.y(x9e0VarA, gm50.b, dd00.b, w2h0.d, null, ap20.b);
        } else if ((x9e0VarA.d & 1) == 1) {
            dm50 dm50Var = gm50.f11526a;
            zc00 zc00Var = dd00.f5871a;
            zdt0 zdt0Var2 = w2h0.b;
            vso vsoVar2 = yso.b;
            if (vsoVar2 == null) {
                jf4.n("Protobuf runtime is not correctly loaded.");
                return null;
            }
            o2h0VarY = o640.y(x9e0VarA, dm50Var, zc00Var, zdt0Var2, vsoVar2, ap20.f1230a);
        } else {
            o2h0VarY = o640.y(x9e0VarA, gm50.f11526a, dd00.f5871a, w2h0.c, null, ap20.f1230a);
        }
        o2h0 o2h0Var2 = (o2h0) concurrentHashMap.putIfAbsent(cls, o2h0VarY);
        return o2h0Var2 != null ? o2h0Var2 : o2h0VarY;
    }
}
