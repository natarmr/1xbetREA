package a;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class dzj implements miu0 {
    public static final dzj b = new dzj(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6945a;

    public /* synthetic */ dzj(byte b2) {
        this.f6945a = b2;
    }

    @Override // a.miu0
    public final diu0 b(Class cls) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        switch (this.f6945a) {
            case 0:
                return x1x.B(cls);
            case 1:
                if (!cls.isAssignableFrom(uo4.class)) {
                    jf4.o("Unknown ViewModel class");
                    return null;
                }
                xzc0.f41748a.getClass();
                xzc0 xzc0Var = (xzc0) wzc0.b.getValue();
                oo4.f25574a.getClass();
                return new uo4(xzc0Var, (oo4) no4.b.getValue());
            case 2:
                return new w1r(true);
            case 3:
                return new rq00();
            default:
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                objNewInstance.getClass();
                return (diu0) objNewInstance;
        }
    }
}
