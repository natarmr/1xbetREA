package a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kjt extends y3 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, kjt> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected xdt0 unknownFields;

    public kjt() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = xdt0.f;
    }

    public static kjt k(Class cls) {
        kjt kjtVar = defaultInstanceMap.get(cls);
        if (kjtVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                kjtVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                hny.q("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (kjtVar != null) {
            return kjtVar;
        }
        try {
            kjt kjtVar2 = (kjt) ((kjt) ift0.f14705a.allocateInstance(cls)).j(6);
            if (kjtVar2 != null) {
                defaultInstanceMap.put(cls, kjtVar2);
                return kjtVar2;
            }
            v4i0.e();
            return null;
        } catch (InstantiationException e2) {
            itt0.o(e2);
            return null;
        }
    }

    public static Object l(Method method, kjt kjtVar, Object... objArr) {
        try {
            return method.invoke(kjtVar, objArr);
        } catch (IllegalAccessException e) {
            e9d0.m("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            e9d0.m("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static amx o(amx amxVar) {
        int size = amxVar.size();
        return amxVar.n(size == 0 ? 10 : size * 2);
    }

    public static void p(Class cls, kjt kjtVar) {
        kjtVar.n();
        defaultInstanceMap.put(cls, kjtVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b5d0 b5d0Var = b5d0.c;
        b5d0Var.getClass();
        return b5d0Var.a(getClass()).f(this, (kjt) obj);
    }

    @Override // a.y3
    public final int g(p2h0 p2h0Var) {
        int iE;
        int iE2;
        if (m()) {
            if (p2h0Var == null) {
                b5d0 b5d0Var = b5d0.c;
                b5d0Var.getClass();
                iE2 = b5d0Var.a(getClass()).e(this);
            } else {
                iE2 = p2h0Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            jf4.n(twn.m(iE2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (p2h0Var == null) {
            b5d0 b5d0Var2 = b5d0.c;
            b5d0Var2.getClass();
            iE = b5d0Var2.a(getClass()).e(this);
        } else {
            iE = p2h0Var.e(this);
        }
        q(iE);
        return iE;
    }

    @Override // a.y3
    public final void h(qyc qycVar) {
        b5d0 b5d0Var = b5d0.c;
        b5d0Var.getClass();
        p2h0 p2h0VarA = b5d0Var.a(getClass());
        prc prcVar = qycVar.f29525a;
        if (prcVar == null) {
            prcVar = new prc(qycVar);
        }
        p2h0VarA.g(this, prcVar);
    }

    public final int hashCode() {
        if (m()) {
            b5d0 b5d0Var = b5d0.c;
            b5d0Var.getClass();
            return b5d0Var.a(getClass()).h(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        b5d0 b5d0Var2 = b5d0.c;
        b5d0Var2.getClass();
        int iH = b5d0Var2.a(getClass()).h(this);
        this.memoizedHashCode = iH;
        return iH;
    }

    public final zit i() {
        return (zit) j(5);
    }

    public abstract Object j(int i);

    public final boolean m() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void n() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final void q(int i) {
        if (i < 0) {
            jf4.n(twn.m(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = h540.f12462a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        h540.c(this, sb, 0);
        return sb.toString();
    }
}
