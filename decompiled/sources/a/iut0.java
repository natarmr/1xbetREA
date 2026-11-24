package a;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class iut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f15413a = r4e.b(0, 0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final pz3 a(fet fetVar) {
        if (!((Boolean) fetVar.k(kix.f18358a)).booleanValue()) {
            fetVar.e0(2019088453);
            fetVar.r(false);
            return null;
        }
        fetVar.e0(2019030948);
        pz3 pz3Var = (pz3) fetVar.k(er00.f8259a);
        fetVar.r(false);
        return pz3Var;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0014 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public static final s7k0 b(qge qgeVar, fet fetVar) {
        Object obj;
        Object obj2;
        boolean zD = Intrinsics.d(qgeVar, gqw0.g1);
        boolean zH = fetVar.h(zD);
        Object objP = fetVar.P();
        if (zH) {
            if (zD) {
                obj = s7k0.f31754a;
            } else {
                t4e t4eVar = new t4e();
                t4eVar.b = f15413a;
                t4eVar.c = new ArrayList();
                obj = t4eVar;
            }
            Object obj3 = obj;
            fetVar.o0(obj3);
            obj2 = obj3;
        } else {
            obj2 = objP;
            if (objP == ukd.f35823a) {
                if (zD) {
                    obj = s7k0.f31754a;
                } else {
                    t4e t4eVar2 = new t4e();
                    t4eVar2.b = f15413a;
                    t4eVar2.c = new ArrayList();
                    obj = t4eVar2;
                }
                Object obj4 = obj;
                fetVar.o0(obj4);
                obj2 = obj4;
            }
        }
        return (s7k0) obj2;
    }

    public static final o1x c(Object obj, fet fetVar) {
        fetVar.e0(1319639034);
        if (obj instanceof o1x) {
            fetVar.e0(1530875884);
            o1x o1xVar = (o1x) obj;
            fetVar.r(false);
            fetVar.r(false);
            return o1xVar;
        }
        fetVar.e0(1530915130);
        Context context = (Context) fetVar.k(dy2.b);
        boolean zG = fetVar.g(context) | fetVar.g(obj);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            k1x k1xVar = new k1x(context);
            k1xVar.c = obj;
            objP = k1xVar.a();
            fetVar.o0(objP);
        }
        o1x o1xVar2 = (o1x) objP;
        fetVar.r(false);
        fetVar.r(false);
        return o1xVar2;
    }

    public static final o1x d(Object obj, qge qgeVar, fet fetVar, int i) {
        fetVar.e0(-329318062);
        boolean z = obj instanceof o1x;
        Object obj2 = ukd.f35823a;
        if (!z) {
            fetVar.e0(-1008595950);
            Context context = (Context) fetVar.k(dy2.b);
            s7k0 s7k0VarB = b(qgeVar, fetVar);
            boolean zG = fetVar.g(context) | fetVar.g(obj) | fetVar.g(s7k0VarB);
            Object objP = fetVar.P();
            if (zG || objP == obj2) {
                k1x k1xVar = new k1x(context);
                k1xVar.c = obj;
                k1xVar.r = s7k0VarB;
                objP = k1xVar.a();
                fetVar.o0(objP);
            }
            o1x o1xVar = (o1x) objP;
            fetVar.r(false);
            fetVar.r(false);
            return o1xVar;
        }
        fetVar.e0(-1008942344);
        o1x o1xVar2 = (o1x) obj;
        if (o1xVar2.v.i != null) {
            fetVar.e0(-1008902292);
            fetVar.r(false);
            fetVar.r(false);
            fetVar.r(false);
            return o1xVar2;
        }
        fetVar.e0(-1008854118);
        s7k0 s7k0VarB2 = b(qgeVar, fetVar);
        boolean zG2 = ((((i & 14) ^ 6) > 4 && fetVar.g(obj)) || (i & 6) == 4) | fetVar.g(s7k0VarB2);
        Object objP2 = fetVar.P();
        if (zG2 || objP2 == obj2) {
            k1x k1xVarA = o1x.a(o1xVar2);
            k1xVarA.r = s7k0VarB2;
            objP2 = k1xVarA.a();
            fetVar.o0(objP2);
        }
        o1x o1xVar3 = (o1x) objP2;
        ohs0.x(fetVar, false, false, false);
        return o1xVar3;
    }

    public static final long e(long j) {
        int iB = si30.b(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) si30.b(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iB) << 32);
    }

    public static void f(String str) {
        throw new IllegalArgumentException(ua80.i("Unsupported type: ", str, ". ", kng0.l("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void g(o1x o1xVar) {
        Object obj = o1xVar.b;
        if (obj instanceof k1x) {
            jf4.o("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof vz2) {
            f("ImageBitmap");
            throw null;
        }
        if (obj instanceof r2x) {
            f("ImageVector");
            throw null;
        }
        if (obj instanceof pm80) {
            f("Painter");
            throw null;
        }
        if (o1xVar.c != null) {
            jf4.o("request.target must be null.");
        } else {
            if (((glz) qbc.P(o1xVar, t1x.e)) == null) {
                return;
            }
            jf4.o("request.lifecycle must be null.");
        }
    }
}
