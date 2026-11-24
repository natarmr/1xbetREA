package a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jjt extends x3 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, jjt> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected wdt0 unknownFields;

    public jjt() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wdt0.f;
    }

    public static void h(jjt jjtVar) throws ynx {
        if (!n(jjtVar, true)) {
            throw new ynx(new v7t0().getMessage());
        }
    }

    public static jjt k(Class cls) {
        jjt jjtVar = defaultInstanceMap.get(cls);
        if (jjtVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                jjtVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                hny.q("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (jjtVar != null) {
            return jjtVar;
        }
        try {
            jjt jjtVarA = ((jjt) hft0.f12986a.allocateInstance(cls)).a();
            if (jjtVarA != null) {
                defaultInstanceMap.put(cls, jjtVarA);
                return jjtVarA;
            }
            v4i0.e();
            return null;
        } catch (InstantiationException e2) {
            itt0.o(e2);
            return null;
        }
    }

    public static Object m(Method method, jjt jjtVar, Object... objArr) {
        try {
            return method.invoke(jjtVar, objArr);
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

    public static final boolean n(jjt jjtVar, boolean z) {
        byte bByteValue = ((Byte) jjtVar.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        z4d0 z4d0Var = z4d0.c;
        z4d0Var.getClass();
        boolean zC = z4d0Var.a(jjtVar.getClass()).c(jjtVar);
        if (z) {
            jjtVar.j(2);
        }
        return zC;
    }

    public static jjt s(jjt jjtVar, og9 og9Var, qso qsoVar) throws ynx {
        kg9 kg9Var = (kg9) og9Var;
        byte[] bArr = kg9Var.d;
        int i = kg9Var.i();
        int size = kg9Var.size();
        kyc kycVar = new kyc(bArr, i, size, true);
        try {
            kycVar.k(size);
            jjt jjtVarT = t(jjtVar, kycVar, qsoVar);
            kycVar.a(0);
            h(jjtVarT);
            return jjtVarT;
        } catch (ynx e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static jjt t(jjt jjtVar, oyc oycVar, qso qsoVar) throws ynx {
        jjt jjtVarR = jjtVar.r();
        try {
            z4d0 z4d0Var = z4d0.c;
            z4d0Var.getClass();
            o2h0 o2h0VarA = z4d0Var.a(jjtVarR.getClass());
            hu5 hu5Var = (hu5) oycVar.b;
            if (hu5Var == null) {
                hu5Var = new hu5(oycVar);
            }
            o2h0VarA.g(jjtVarR, hu5Var, qsoVar);
            o2h0VarA.b(jjtVarR);
            return jjtVarR;
        } catch (v7t0 e) {
            throw new ynx(e.getMessage());
        } catch (ynx e2) {
            if (e2.f42961a) {
                throw new ynx(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof ynx) {
                throw ((ynx) e3.getCause());
            }
            throw new ynx(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof ynx) {
                throw ((ynx) e4.getCause());
            }
            throw e4;
        }
    }

    public static void u(Class cls, jjt jjtVar) {
        jjtVar.p();
        defaultInstanceMap.put(cls, jjtVar);
    }

    @Override // a.x3
    public final int b(o2h0 o2h0Var) {
        int iF;
        int iF2;
        if (o()) {
            if (o2h0Var == null) {
                z4d0 z4d0Var = z4d0.c;
                z4d0Var.getClass();
                iF2 = z4d0Var.a(getClass()).f(this);
            } else {
                iF2 = o2h0Var.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            jf4.n(twn.m(iF2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (o2h0Var == null) {
            z4d0 z4d0Var2 = z4d0.c;
            z4d0Var2.getClass();
            iF = z4d0Var2.a(getClass()).f(this);
        } else {
            iF = o2h0Var.f(this);
        }
        v(iF);
        return iF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z4d0 z4d0Var = z4d0.c;
        z4d0Var.getClass();
        return z4d0Var.a(getClass()).j(this, (jjt) obj);
    }

    @Override // a.x3
    public final void g(ryc rycVar) {
        z4d0 z4d0Var = z4d0.c;
        z4d0Var.getClass();
        o2h0 o2h0VarA = z4d0Var.a(getClass());
        psc pscVar = rycVar.f31307a;
        if (pscVar == null) {
            pscVar = new psc(rycVar);
        }
        o2h0VarA.e(this, pscVar);
    }

    public final int hashCode() {
        if (o()) {
            z4d0 z4d0Var = z4d0.c;
            z4d0Var.getClass();
            return z4d0Var.a(getClass()).i(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        z4d0 z4d0Var2 = z4d0.c;
        z4d0Var2.getClass();
        int i2 = z4d0Var2.a(getClass()).i(this);
        this.memoizedHashCode = i2;
        return i2;
    }

    public final yit i() {
        return (yit) j(5);
    }

    public abstract Object j(int i);

    @Override // a.f540
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final jjt a() {
        return (jjt) j(6);
    }

    public final boolean o() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void p() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // a.x3
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final yit d() {
        return (yit) j(5);
    }

    public final jjt r() {
        return (jjt) j(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = g540.f10701a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        g540.c(this, sb, 0);
        return sb.toString();
    }

    public final void v(int i) {
        if (i < 0) {
            jf4.n(twn.m(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final yit w() {
        yit yitVar = (yit) j(5);
        if (!yitVar.f42712a.equals(this)) {
            yitVar.e();
            yit.f(yitVar.b, this);
        }
        return yitVar;
    }
}
