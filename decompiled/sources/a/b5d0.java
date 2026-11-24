package a;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b5d0 {
    public static final b5d0 c = new b5d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do20 f1999a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public b5d0() {
        y440 y440Var;
        try {
            y440Var = (y440) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            y440Var = do20.b;
        }
        y440[] y440VarArr = {wit.b, y440Var};
        bo20 bo20Var = new bo20();
        bo20Var.f2912a = y440VarArr;
        do20 do20Var = new do20();
        Charset charset = dmx.f6339a;
        do20Var.f6397a = bo20Var;
        this.f1999a = do20Var;
    }

    public final p2h0 a(Class cls) {
        p2h0 p2h0VarQ;
        Class cls2;
        Charset charset = dmx.f6339a;
        if (cls == null) {
            hny.u("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        p2h0 p2h0Var = (p2h0) concurrentHashMap.get(cls);
        if (p2h0Var != null) {
            return p2h0Var;
        }
        Class cls3 = x2h0.f40168a;
        if (!kjt.class.isAssignableFrom(cls) && (cls2 = x2h0.f40168a) != null && !cls2.isAssignableFrom(cls)) {
            jf4.o("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        y9e0 y9e0VarA = ((bo20) this.f1999a.f6397a).a(cls);
        if ((y9e0VarA.d & 2) == 2) {
            if (kjt.class.isAssignableFrom(cls)) {
                p2h0VarQ = new s640(x2h0.c, zso.f44914a, y9e0VarA.f42242a);
            } else {
                aet0 aet0Var = x2h0.b;
                wso wsoVar = zso.b;
                if (wsoVar == null) {
                    jf4.n("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                p2h0VarQ = new s640(aet0Var, wsoVar, y9e0VarA.f42242a);
            }
        } else if (kjt.class.isAssignableFrom(cls)) {
            p2h0VarQ = hne.E(y9e0VarA.a()) != 1 ? p640.q(y9e0VarA, hm50.b, cd00.b, x2h0.c, zso.f44914a, bp20.b) : p640.q(y9e0VarA, hm50.b, cd00.b, x2h0.c, null, bp20.b);
        } else if (hne.E(y9e0VarA.a()) != 1) {
            em50 em50Var = hm50.f13290a;
            yc00 yc00Var = cd00.f4137a;
            aet0 aet0Var2 = x2h0.b;
            wso wsoVar2 = zso.b;
            if (wsoVar2 == null) {
                jf4.n("Protobuf runtime is not correctly loaded.");
                return null;
            }
            p2h0VarQ = p640.q(y9e0VarA, em50Var, yc00Var, aet0Var2, wsoVar2, bp20.f2959a);
        } else {
            p2h0VarQ = p640.q(y9e0VarA, hm50.f13290a, cd00.f4137a, x2h0.b, null, bp20.f2959a);
        }
        p2h0 p2h0Var2 = (p2h0) concurrentHashMap.putIfAbsent(cls, p2h0VarQ);
        return p2h0Var2 != null ? p2h0Var2 : p2h0VarQ;
    }
}
