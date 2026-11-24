package a;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c5d0 {
    public static final c5d0 c = new c5d0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final peg0 f3767a = new peg0((byte) 2);

    public final q2h0 a(Class cls) {
        xso xsoVar;
        q2h0 q2h0VarW;
        Class cls2;
        fmx.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        q2h0 q2h0Var = (q2h0) concurrentHashMap.get(cls);
        if (q2h0Var != null) {
            return q2h0Var;
        }
        Class cls3 = y2h0.f41904a;
        if (!mjt.class.isAssignableFrom(cls) && (cls2 = y2h0.f41904a) != null && !cls2.isAssignableFrom(cls)) {
            jf4.o("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        z9e0 z9e0VarA = ((co20) this.f3767a.b).a(cls);
        if ((z9e0VarA.d & 2) == 2) {
            if (mjt.class.isAssignableFrom(cls)) {
                q2h0VarW = new t640(y2h0.c, ato.f1440a, z9e0VarA.f44013a);
            } else {
                bet0 bet0Var = y2h0.b;
                xso xsoVar2 = ato.b;
                if (xsoVar2 == null) {
                    jf4.n("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                q2h0VarW = new t640(bet0Var, xsoVar2, z9e0VarA.f44013a);
            }
        } else if (mjt.class.isAssignableFrom(cls)) {
            q2h0VarW = q640.w(z9e0VarA, im50.b, fd00.b, y2h0.c, hne.E(z9e0VarA.a()) != 1 ? ato.f1440a : null, cp20.b);
        } else {
            fm50 fm50Var = im50.f15010a;
            ed00 ed00Var = fd00.f9336a;
            bet0 bet0Var2 = y2h0.b;
            if (hne.E(z9e0VarA.a()) != 1) {
                xso xsoVar3 = ato.b;
                if (xsoVar3 == null) {
                    jf4.n("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                xsoVar = xsoVar3;
            } else {
                xsoVar = null;
            }
            q2h0VarW = q640.w(z9e0VarA, fm50Var, ed00Var, bet0Var2, xsoVar, cp20.f4725a);
        }
        q2h0 q2h0Var2 = (q2h0) concurrentHashMap.putIfAbsent(cls, q2h0VarW);
        return q2h0Var2 != null ? q2h0Var2 : q2h0VarW;
    }
}
