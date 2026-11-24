package a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class mjt extends a4 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, mjt> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected ydt0 unknownFields;

    public mjt() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ydt0.f;
    }

    public static mjt d(Class cls) {
        mjt mjtVar = defaultInstanceMap.get(cls);
        if (mjtVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                mjtVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                hny.q("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (mjtVar != null) {
            return mjtVar;
        }
        try {
            mjt mjtVar2 = (mjt) ((mjt) jft0.f16446a.allocateInstance(cls)).c(6);
            if (mjtVar2 != null) {
                defaultInstanceMap.put(cls, mjtVar2);
                return mjtVar2;
            }
            v4i0.e();
            return null;
        } catch (InstantiationException e2) {
            itt0.o(e2);
            return null;
        }
    }

    public static Object e(Method method, mjt mjtVar, Object... objArr) {
        try {
            return method.invoke(mjtVar, objArr);
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

    public static final boolean f(mjt mjtVar, boolean z) {
        byte bByteValue = ((Byte) mjtVar.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        c5d0 c5d0Var = c5d0.c;
        c5d0Var.getClass();
        boolean zC = c5d0Var.a(mjtVar.getClass()).c(mjtVar);
        if (z) {
            mjtVar.c(2);
        }
        return zC;
    }

    public static void j(Class cls, mjt mjtVar) {
        mjtVar.h();
        defaultInstanceMap.put(cls, mjtVar);
    }

    @Override // a.a4
    public final int a(q2h0 q2h0Var) {
        int iE;
        int iE2;
        if (g()) {
            if (q2h0Var == null) {
                c5d0 c5d0Var = c5d0.c;
                c5d0Var.getClass();
                iE2 = c5d0Var.a(getClass()).e(this);
            } else {
                iE2 = q2h0Var.e(this);
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
        if (q2h0Var == null) {
            c5d0 c5d0Var2 = c5d0.c;
            c5d0Var2.getClass();
            iE = c5d0Var2.a(getClass()).e(this);
        } else {
            iE = q2h0Var.e(this);
        }
        k(iE);
        return iE;
    }

    @Override // a.a4
    public final void b(syc sycVar) {
        c5d0 c5d0Var = c5d0.c;
        c5d0Var.getClass();
        q2h0 q2h0VarA = c5d0Var.a(getClass());
        yqc yqcVar = sycVar.f33018a;
        if (yqcVar == null) {
            yqcVar = new yqc(sycVar);
        }
        q2h0VarA.g(this, yqcVar);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c5d0 c5d0Var = c5d0.c;
        c5d0Var.getClass();
        return c5d0Var.a(getClass()).i(this, (mjt) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            c5d0 c5d0Var = c5d0.c;
            c5d0Var.getClass();
            return c5d0Var.a(getClass()).h(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        c5d0 c5d0Var2 = c5d0.c;
        c5d0Var2.getClass();
        int iH = c5d0Var2.a(getClass()).h(this);
        this.memoizedHashCode = iH;
        return iH;
    }

    public final mjt i() {
        return (mjt) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            jf4.n(twn.m(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = i540.f14177a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        i540.c(this, sb, 0);
        return sb.toString();
    }
}
