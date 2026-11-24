package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 implements bv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36559a;
    public Object b;
    public Object c;
    public final Object d;

    public v0(Class cls) {
        this.f36559a = (byte) 4;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = ((UUID) this.b).toString();
        string.getClass();
        this.c = new ppv0(string, (zov0) null, cls.getName(), (String) null, (maj) null, (maj) null, 0L, 0L, 0L, (o4e) null, 0, (af5) null, 0L, 0L, 0L, 0L, false, (od80) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        this.d = dui0.c(cls.getName());
    }

    @Override // a.bv3
    public Object f() {
        return this.c;
    }

    public v0 g(String str) {
        str.getClass();
        ((Set) this.d).add(str);
        return r();
    }

    @Override // a.bv3
    public void i(Object obj) {
        ((ArrayList) this.d).add(this.c);
        this.c = obj;
    }

    public lpv0 k() {
        lpv0 lpv0VarM = m();
        o4e o4eVar = ((ppv0) this.c).j;
        boolean z = !o4eVar.i.isEmpty() || o4eVar.e || o4eVar.c || o4eVar.d;
        ppv0 ppv0Var = (ppv0) this.c;
        if (ppv0Var.q) {
            if (z) {
                jf4.o("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (ppv0Var.g > 0) {
                jf4.o("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = ppv0Var.x;
        if (str == null) {
            List listSplit$default = StringsKt__StringsKt.split$default(ppv0Var.c, new String[]{Separators.DOT}, false, 0, 6, null);
            String strL = listSplit$default.size() == 1 ? (String) listSplit$default.get(0) : (String) CollectionsKt.d0(listSplit$default);
            if (strL.length() > 127) {
                strL = ttm0.L(127, strL);
            }
            ppv0Var.x = strL;
        } else if (str.length() > 127) {
            ((ppv0) this.c).x = ttm0.L(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        ppv0 ppv0Var2 = (ppv0) this.c;
        this.c = new ppv0(string, ppv0Var2.b, ppv0Var2.c, ppv0Var2.d, new maj(ppv0Var2.e), new maj(ppv0Var2.f), ppv0Var2.g, ppv0Var2.h, ppv0Var2.i, new o4e(ppv0Var2.j), ppv0Var2.k, ppv0Var2.l, ppv0Var2.m, ppv0Var2.n, ppv0Var2.o, ppv0Var2.p, ppv0Var2.q, ppv0Var2.r, ppv0Var2.s, ppv0Var2.u, ppv0Var2.v, ppv0Var2.w, ppv0Var2.x, ppv0Var2.y, 524288);
        return lpv0VarM;
    }

    @Override // a.bv3
    public void l() {
        this.c = hne.k(1, (ArrayList) this.d);
    }

    public lpv0 m() {
        return new yl60((UUID) this.b, (ppv0) this.c, (Set) this.d);
    }

    public void n() {
        ((ArrayList) this.d).clear();
        this.c = this.b;
        u();
    }

    public abstract swq o();

    public int p() {
        return 1;
    }

    public abstract String q();

    public abstract p4 s();

    public abstract eky t();

    public String toString() {
        switch (this.f36559a) {
            case 1:
                return (String) this.b;
            case 2:
            default:
                return super.toString();
            case 3:
                return getClass().getSimpleName() + ": " + o();
        }
    }

    public void u() {
        ((e7z) this.b).Q();
    }

    public abstract x3 v(og9 og9Var);

    public v0 w() {
        od80 od80Var = od80.f25065a;
        ppv0 ppv0Var = (ppv0) this.c;
        ppv0Var.q = true;
        ppv0Var.r = od80Var;
        return (xl60) this;
    }

    public v0 x(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        ((ppv0) this.c).g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((ppv0) this.c).g) {
            return r();
        }
        jf4.o("The given initial delay is too large and will cause an overflow!");
        return null;
    }

    public abstract void y(x3 x3Var);

    public v0 r() {
        return this;
    }

    public v0(h950 h950Var, roi0 roi0Var, gmk0 gmk0Var) {
        this.f36559a = (byte) 3;
        this.b = h950Var;
        this.c = roi0Var;
        this.d = gmk0Var;
    }

    public v0(String str, String str2, String str3) {
        this.f36559a = (byte) 1;
        str2.getClass();
        str3.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3.equals("-1") ? "" : str3;
    }

    public v0(Class cls, m50[] m50VarArr) {
        this.f36559a = (byte) 2;
        this.b = cls;
        HashMap map = new HashMap();
        for (m50 m50Var : m50VarArr) {
            boolean zContainsKey = map.containsKey(m50Var.f21197a);
            Class cls2 = m50Var.f21197a;
            if (!zContainsKey) {
                map.put(cls2, m50Var);
            } else {
                jf4.o(ohs0.l(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                throw null;
            }
        }
        if (m50VarArr.length > 0) {
            this.d = m50VarArr[0].f21197a;
        } else {
            this.d = Void.class;
        }
        this.c = Collections.unmodifiableMap(map);
    }

    public v0(Object obj) {
        this.f36559a = (byte) 0;
        this.b = obj;
        this.d = new ArrayList();
        this.c = obj;
    }
}
