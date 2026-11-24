package a;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class acj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i050 f629a;
    public final /* synthetic */ hie0 b;
    public final /* synthetic */ mie0 c;
    public final /* synthetic */ ncj d;

    public acj(i050 i050Var, hie0 hie0Var, mie0 mie0Var, ncj ncjVar) {
        this.f629a = i050Var;
        this.b = hie0Var;
        this.c = mie0Var;
        this.d = ncjVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00a8, B:37:0x00b0), top: B:52:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(uu3 uu3Var, zje zjeVar) throws Throwable {
        zbj zbjVar;
        i050 i050Var;
        hie0 hie0Var;
        mie0 mie0Var;
        ncj ncjVar;
        Function2 function2;
        i050 i050Var2;
        i050 i050Var3;
        mie0 mie0Var2;
        Object obj;
        if (zjeVar instanceof zbj) {
            zbjVar = (zbj) zjeVar;
            int i = zbjVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                zbjVar.p = i - Integer.MIN_VALUE;
            } else {
                zbjVar = new zbj(this, zjeVar);
            }
        } else {
            zbjVar = new zbj(this, zjeVar);
        }
        Object obj2 = zbjVar.n;
        wne wneVar = wne.f39444a;
        int i2 = zbjVar.p;
        try {
            if (i2 == 0) {
                z1x.P(obj2);
                zbjVar.i = uu3Var;
                i050Var = this.f629a;
                zbjVar.j = i050Var;
                hie0Var = this.b;
                zbjVar.k = hie0Var;
                mie0Var = this.c;
                zbjVar.l = mie0Var;
                ncjVar = this.d;
                zbjVar.m = ncjVar;
                zbjVar.p = 1;
                function2 = uu3Var;
                if (i050Var.d(zbjVar) != wneVar) {
                }
                return wneVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = zbjVar.k;
                    mie0Var2 = (mie0) zbjVar.j;
                    i050Var2 = (i050) zbjVar.i;
                    try {
                        z1x.P(obj2);
                        mie0Var2.f21842a = obj;
                        Object obj3 = mie0Var2.f21842a;
                        i050Var2.c(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        i050Var2.c(null);
                        throw th;
                    }
                }
                ncjVar = (ncj) zbjVar.k;
                mie0Var2 = (mie0) zbjVar.j;
                i050Var3 = (i050) zbjVar.i;
                try {
                    z1x.P(obj2);
                    if (!Intrinsics.d(obj2, mie0Var2.f21842a)) {
                        zbjVar.i = i050Var3;
                        zbjVar.j = mie0Var2;
                        zbjVar.k = obj2;
                        zbjVar.p = 3;
                        if (ncjVar.i(obj2, false, zbjVar) != wneVar) {
                            obj = obj2;
                            i050Var2 = i050Var3;
                            mie0Var2.f21842a = obj;
                        }
                        return wneVar;
                    }
                    i050Var2 = i050Var3;
                    Object obj4 = mie0Var2.f21842a;
                    i050Var2.c(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    i050Var2 = i050Var3;
                    i050Var2.c(null);
                    throw th;
                }
            }
            ncjVar = zbjVar.m;
            mie0 mie0Var3 = zbjVar.l;
            hie0Var = (hie0) zbjVar.k;
            i050 i050Var4 = (i050) zbjVar.j;
            Function2 function3 = (Function2) zbjVar.i;
            z1x.P(obj2);
            mie0Var = mie0Var3;
            function2 = function3;
            i050Var = i050Var4;
            if (hie0Var.f13108a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = mie0Var.f21842a;
            zbjVar.i = i050Var;
            zbjVar.j = mie0Var;
            zbjVar.k = ncjVar;
            zbjVar.l = null;
            zbjVar.m = null;
            zbjVar.p = 2;
            Object objInvoke = function2.invoke(obj5, zbjVar);
            if (objInvoke != wneVar) {
                i050Var3 = i050Var;
                obj2 = objInvoke;
                mie0Var2 = mie0Var;
                if (!Intrinsics.d(obj2, mie0Var2.f21842a)) {
                    zbjVar.i = i050Var3;
                    zbjVar.j = mie0Var2;
                    zbjVar.k = obj2;
                    zbjVar.p = 3;
                    if (ncjVar.i(obj2, false, zbjVar) != wneVar) {
                        obj = obj2;
                        i050Var2 = i050Var3;
                        mie0Var2.f21842a = obj;
                    }
                } else {
                    i050Var2 = i050Var3;
                }
                Object obj6 = mie0Var2.f21842a;
                i050Var2.c(null);
                return obj6;
            }
            return wneVar;
        } catch (Throwable th3) {
            th = th3;
            i050Var2 = i050Var;
            i050Var2.c(null);
            throw th;
        }
    }
}
