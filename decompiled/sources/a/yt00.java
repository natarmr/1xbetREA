package a;

/* JADX INFO: loaded from: classes2.dex */
public final class yt00 extends bu00 implements r660 {
    public volatile j910 d;
    public final /* synthetic */ w0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt00(eu00 eu00Var, o5 o5Var, w0 w0Var) {
        super(eu00Var, o5Var);
        this.e = w0Var;
        if (eu00Var == null) {
            g(0);
            throw null;
        }
        this.d = null;
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void g(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // a.bu00
    public final void b(Object obj) {
        this.d = new j910(obj);
        try {
            if (obj == null) {
                a(2);
                throw null;
            }
            this.e.invoke(obj);
            this.d = null;
        } catch (Throwable th) {
            this.d = null;
            throw th;
        }
    }

    @Override // a.bu00
    public final s88 c(boolean z) {
        return new s88((Object) new q5(kotlin.collections.a.c(f2o.d)), false, (byte) 7);
    }

    @Override // a.bu00, kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        Object objInvoke;
        j910 j910Var = this.d;
        if (j910Var == null || ((Thread) j910Var.c) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else if (((Thread) j910Var.c) == Thread.currentThread()) {
            objInvoke = j910Var.b;
        } else {
            jf4.n("No value in this thread (hasValue should be checked before)");
            objInvoke = null;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        g(2);
        throw null;
    }
}
