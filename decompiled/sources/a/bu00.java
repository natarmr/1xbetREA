package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class bu00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eu00 f3208a;
    public final Function0 b;
    public volatile Object c;

    public bu00(eu00 eu00Var, Function0 function0) {
        if (eu00Var == null) {
            a(0);
            throw null;
        }
        this.c = du00.f6678a;
        this.f3208a = eu00Var;
        this.b = function0;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public s88 c(boolean z) {
        s88 s88VarE = this.f3208a.e(null, "in a lazy value");
        if (s88VarE != null) {
            return s88VarE;
        }
        a(2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    @Override // kotlin.jvm.functions.Function0
    public Object invoke() throws Throwable {
        Object objInvoke;
        s88 s88VarC;
        du00 du00Var = du00.c;
        du00 du00Var2 = du00.b;
        Object obj = this.c;
        if (!(obj instanceof du00)) {
            brv0.a(obj);
            return obj;
        }
        this.f3208a.f8395a.lock();
        try {
            Object obj2 = this.c;
            if (!(obj2 instanceof du00)) {
                brv0.a(obj2);
                this.f3208a.f8395a.unlock();
                return obj2;
            }
            if (obj2 == du00Var2) {
                this.c = du00Var;
                s88 s88VarC2 = c(true);
                if (!s88VarC2.b) {
                    objInvoke = s88VarC2.c;
                } else if (obj2 == du00Var) {
                    s88VarC = c(false);
                    if (s88VarC.b) {
                        this.c = du00Var2;
                        try {
                            objInvoke = this.b.invoke();
                            b(objInvoke);
                            this.c = objInvoke;
                        } catch (Throwable th) {
                            if (vic.B(th)) {
                                this.c = du00.f6678a;
                                throw th;
                            }
                            if (this.c == du00Var2) {
                                this.c = new arv0(th);
                            }
                            this.f3208a.b.getClass();
                            throw th;
                        }
                    } else {
                        objInvoke = s88VarC.c;
                    }
                } else {
                    this.c = du00Var2;
                    objInvoke = this.b.invoke();
                    b(objInvoke);
                    this.c = objInvoke;
                }
            } else if (obj2 == du00Var) {
                s88VarC = c(false);
                if (s88VarC.b) {
                    objInvoke = s88VarC.c;
                } else {
                    this.c = du00Var2;
                    objInvoke = this.b.invoke();
                    b(objInvoke);
                    this.c = objInvoke;
                }
            } else {
                this.c = du00Var2;
                objInvoke = this.b.invoke();
                b(objInvoke);
                this.c = objInvoke;
            }
            this.f3208a.f8395a.unlock();
            return objInvoke;
        } catch (Throwable th2) {
            this.f3208a.f8395a.unlock();
            throw th2;
        }
    }

    public void b(Object obj) {
    }
}
