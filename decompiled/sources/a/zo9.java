package a;

import android.gov.nist.core.Separators;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.Closeable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes.dex */
public final class zo9 implements pk50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call.Factory f44709a;

    public /* synthetic */ zo9(Call.Factory factory) {
        this.f44709a = factory;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(Call.Factory factory, gl50 gl50Var, Function2 function2, zje zjeVar) {
        yo9 yo9Var;
        Function2 function3;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (zjeVar instanceof yo9) {
            yo9Var = (yo9) zjeVar;
            int i = yo9Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yo9Var.l = i - Integer.MIN_VALUE;
            } else {
                yo9Var = new yo9(zjeVar);
            }
        } else {
            yo9Var = new yo9(zjeVar);
        }
        Object objB = yo9Var.k;
        wne wneVar = wne.f39444a;
        int i2 = yo9Var.l;
        if (i2 == 0) {
            z1x.P(objB);
            yo9Var.i = function2;
            yo9Var.j = factory;
            yo9Var.l = 1;
            objB = bp9.b(gl50Var, yo9Var);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) yo9Var.j;
                try {
                    z1x.P(objB);
                    bkb.E(closeable2, null);
                    return objB;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        bkb.E(closeable2, th);
                        throw th3;
                    }
                }
            }
            function3 = yo9Var.i;
            z1x.P(objB);
            closeable = (Closeable) objB;
            try {
                ol50 ol50VarA = bp9.a((Response) closeable);
                yo9Var.i = null;
                yo9Var.j = closeable;
                yo9Var.l = 3;
                objB = function3.invoke(ol50VarA, yo9Var);
                if (objB != wneVar) {
                    closeable2 = closeable;
                    bkb.E(closeable2, null);
                    return objB;
                }
                return wneVar;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        factory = (Call.Factory) yo9Var.j;
        function2 = yo9Var.i;
        z1x.P(objB);
        RealCall realCallA = factory.a((Request) objB);
        yo9Var.i = function2;
        yo9Var.j = null;
        yo9Var.l = 2;
        n5a n5aVar = new n5a(1, pnx.b(yo9Var));
        n5aVar.r();
        n5aVar.t(new w0((Object) realCallA, (byte) 11));
        FirebasePerfOkHttpClient.enqueue(realCallA, new fvt0(n5aVar));
        objB = n5aVar.p();
        if (objB != wneVar) {
            function3 = function2;
            closeable = (Closeable) objB;
            ol50 ol50VarA2 = bp9.a((Response) closeable);
            yo9Var.i = null;
            yo9Var.j = closeable;
            yo9Var.l = 3;
            objB = function3.invoke(ol50VarA2, yo9Var);
            if (objB != wneVar) {
                closeable2 = closeable;
                bkb.E(closeable2, null);
                return objB;
            }
        }
        return wneVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zo9) {
            return Intrinsics.d(this.f44709a, ((zo9) obj).f44709a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44709a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.f44709a + Separators.RPAREN;
    }
}
