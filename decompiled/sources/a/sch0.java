package a;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bch0 f31986a;
    public vf80 b;
    public qkq c;
    public ma80 d;
    public boolean e;
    public yj50 f;
    public final lbh0 g;
    public final ibh0 h;
    public boolean i;
    public byte j = 1;
    public qah0 k = fbh0.f9258a;
    public final rch0 l = new rch0(this);
    public final gwg0 m = new gwg0((Object) this, (byte) 9);

    public sch0(bch0 bch0Var, vf80 vf80Var, qkq qkqVar, ma80 ma80Var, boolean z, yj50 yj50Var, lbh0 lbh0Var, ibh0 ibh0Var) {
        this.f31986a = bch0Var;
        this.b = vf80Var;
        this.c = qkqVar;
        this.d = ma80Var;
        this.e = z;
        this.f = yj50Var;
        this.g = lbh0Var;
        this.h = ibh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar) throws Throwable {
        pch0 pch0Var;
        sch0 sch0Var;
        Throwable th;
        lie0 lie0Var;
        if (zjeVar instanceof pch0) {
            pch0Var = (pch0) zjeVar;
            int i = pch0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                pch0Var.l = i - Integer.MIN_VALUE;
            } else {
                pch0Var = new pch0(this, zjeVar);
            }
        } else {
            pch0Var = new pch0(this, zjeVar);
        }
        Object obj = pch0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = pch0Var.l;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lie0Var = pch0Var.i;
            try {
                z1x.P(obj);
                sch0Var = this;
                sch0Var.i = false;
                return new g6u0(lie0Var.f20100a);
            } catch (Throwable th2) {
                th = th2;
                sch0Var = this;
                sch0Var.i = false;
                throw th;
            }
        }
        z1x.P(obj);
        lie0 lie0Var2 = new lie0();
        lie0Var2.f20100a = j;
        this.i = true;
        try {
            c050 c050Var = c050.f3507a;
            sch0Var = this;
            try {
                qch0 qch0Var = new qch0(sch0Var, lie0Var2, j, null);
                pch0Var.i = lie0Var2;
                pch0Var.l = 1;
                if (sch0Var.g(c050Var, qch0Var, pch0Var) == wneVar) {
                    return wneVar;
                }
                lie0Var = lie0Var2;
                sch0Var.i = false;
                return new g6u0(lie0Var.f20100a);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                sch0Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            sch0Var = this;
        }
    }

    public final boolean b() {
        vf80 vf80Var;
        return this.f31986a.d() || this.f31986a.c() || ((vf80Var = this.b) != null && vf80Var.b());
    }

    public final Object c(long j, boolean z, bnn0 bnn0Var) {
        if (z) {
            qkq qkqVar = this.c;
            dbh0 dbh0Var = fbh0.f9258a;
            if (qkqVar instanceof iuj) {
                return Unit.f46060a;
            }
        }
        long jA = g6u0.a(j, 0.0f, 0.0f, this.d == ma80.b ? 1 : 2);
        qkc0 qkc0Var = new qkc0(this, null);
        vf80 vf80Var = this.b;
        if (vf80Var != null && b()) {
            Object objD = vf80Var.d(jA, qkc0Var, bnn0Var);
            return objD == wne.f39444a ? objD : Unit.f46060a;
        }
        qkc0 qkc0Var2 = new qkc0((sch0) qkc0Var.m, bnn0Var);
        qkc0Var2.l = jA;
        Object objInvokeSuspend = qkc0Var2.invokeSuspend(Unit.f46060a);
        return objInvokeSuspend == wne.f39444a ? objInvokeSuspend : Unit.f46060a;
    }

    public final long d(qah0 qah0Var, long j, int i) {
        ek50 ek50Var = this.f.f42727a;
        ek50 ek50VarA1 = ek50Var != null ? ek50Var.a1() : null;
        long jC = ek50VarA1 != null ? ek50VarA1.C(i, j) : 0L;
        long jE = ne60.e(j, jC);
        long jF = f(i(qah0Var.a(h(f(this.d == ma80.b ? ne60.a(jE, 0.0f, 0.0f, 1) : ne60.a(jE, 0.0f, 0.0f, 2))))));
        lbh0 lbh0Var = this.g;
        if (lbh0Var.n) {
            ViewTreeObserver viewTreeObserver = ((AndroidComposeView) vcc.a0(lbh0Var)).getViewTreeObserver();
            try {
                Method declaredMethod = AndroidComposeView.o2;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.o2 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jE2 = ne60.e(jE, jF);
        ek50 ek50Var2 = this.f.f42727a;
        ek50 ek50VarA2 = ek50Var2 != null ? ek50Var2.a1() : null;
        return ne60.f(ne60.f(jC, jF), ek50VarA2 != null ? ek50VarA2.S(i, jF, jE2) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? ne60.g(-1.0f, j) : j;
    }

    public final Object g(c050 c050Var, Function2 function2, zje zjeVar) {
        Object objB = this.f31986a.b(c050Var, new kmg0((Object) this, (Object) function2, (yje) null, (byte) 14), zjeVar);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == ma80.b ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == ma80.b) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        ma80 ma80Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (ma80Var == ma80.f21447a) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (ma80Var == ma80.b) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
