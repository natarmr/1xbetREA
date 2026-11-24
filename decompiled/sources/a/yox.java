package a;

import android.os.Handler;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

/* JADX INFO: loaded from: classes2.dex */
public final class yox implements fj10, imk, zf60, vke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43005a;

    public yox(byte b) {
        switch (b) {
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.f43005a = new ConcurrentHashMap();
                break;
            default:
                this.f43005a = new or30();
                break;
        }
    }

    @Override // a.imk
    public boolean a(float f) {
        if (f == 0.0f) {
            return false;
        }
        c();
        ((NestedScrollView) this.f43005a).j((int) f);
        return true;
    }

    @Override // a.imk
    public float b() {
        return -((NestedScrollView) this.f43005a).getVerticalScrollFactorCompat();
    }

    @Override // a.imk
    public void c() {
        ((NestedScrollView) this.f43005a).d.abortAnimation();
    }

    public synchronized void d(bly blyVar) {
        fny fnyVarE;
        synchronized (this) {
            fnyVarE = e(pcf0.e(blyVar), blyVar.y());
        }
        dny dnyVar = (dny) this.f43005a;
        dnyVar.e();
        ((gny) dnyVar.b).x(fnyVarE);
    }

    public synchronized fny e(fky fkyVar, af80 af80Var) {
        int iA;
        synchronized (this) {
            iA = utt0.a();
            while (r(iA)) {
                iA = utt0.a();
            }
        }
        return (fny) enyVarC.b();
        if (af80Var == af80.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        eny enyVarC = fny.C();
        enyVarC.e();
        ((fny) enyVarC.b).D(fkyVar);
        enyVarC.e();
        ((fny) enyVarC.b).E(iA);
        enyVarC.e();
        ((fny) enyVarC.b).G();
        enyVarC.e();
        ((fny) enyVarC.b).F(af80Var);
        return (fny) enyVarC.b();
    }

    public int f(int[] iArr, int i) {
        int[] iArr2;
        int[] iArr3;
        int iC;
        int i2;
        wjt wjtVar = (wjt) this.f43005a;
        if (iArr.length == 0) {
            e9d0.o();
            return 0;
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i3 = 1;
            while (i3 < length && iArr[i3] == 0) {
                i3++;
            }
            if (i3 == length) {
                iArr2 = new int[]{0};
            } else {
                int i4 = length - i3;
                int[] iArr4 = new int[i4];
                System.arraycopy(iArr, i3, iArr4, 0, i4);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i];
        int i5 = 0;
        boolean z = true;
        while (i5 < i) {
            int i6 = wjtVar.f39280a[(wjtVar.g ? 1 : 0) + i5];
            if (i6 == 0) {
                i2 = iArr2[iArr2.length - 1];
            } else {
                if (i6 == 1) {
                    iC = 0;
                    for (int i7 : iArr2) {
                        wjt wjtVar2 = wjt.h;
                        iC ^= i7;
                    }
                } else {
                    iC = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i8 = 1; i8 < length2; i8++) {
                        iC = wjtVar.c(i6, iC) ^ iArr2[i8];
                    }
                }
                i2 = iC;
            }
            iArr5[(i - 1) - i5] = i2;
            if (i2 != 0) {
                z = false;
            }
            i5++;
            z = z;
        }
        if (z) {
            return 0;
        }
        xjt xjtVar = new xjt(wjtVar, iArr5);
        xjt xjtVarA = wjtVar.a(i, 1);
        xjt xjtVar2 = wjtVar.c;
        if (xjtVarA.d() >= xjtVar.d()) {
            xjtVarA = xjtVar;
            xjtVar = xjtVarA;
        }
        xjt xjtVar3 = wjtVar.d;
        xjt xjtVar4 = xjtVarA;
        xjt xjtVarA2 = xjtVar;
        xjt xjtVar5 = xjtVar4;
        xjt xjtVar6 = xjtVar2;
        while (xjtVar5.d() * 2 >= i) {
            if (xjtVar5.e()) {
                throw new eie0("r_{i-1} was zero");
            }
            int iB = wjtVar.b(xjtVar5.c(xjtVar5.d()));
            xjt xjtVarA3 = xjtVar2;
            while (xjtVarA2.d() >= xjtVar5.d() && !xjtVarA2.e()) {
                int iD = xjtVarA2.d() - xjtVar5.d();
                int iC2 = wjtVar.c(xjtVarA2.c(xjtVarA2.d()), iB);
                xjtVarA3 = xjtVarA3.a(wjtVar.a(iD, iC2));
                xjtVarA2 = xjtVarA2.a(xjtVar5.h(iD, iC2));
            }
            xjt xjtVarA4 = xjtVarA3.g(xjtVar3).a(xjtVar6);
            if (xjtVarA2.d() >= xjtVar5.d()) {
                c99.n("Division algorithm failed to reduce polynomial? r: ", xjtVarA2, ", rLast: ", xjtVar5);
                return 0;
            }
            xjt xjtVar7 = xjtVarA2;
            xjtVarA2 = xjtVar5;
            xjtVar5 = xjtVar7;
            xjtVar6 = xjtVar3;
            xjtVar3 = xjtVarA4;
        }
        int iC3 = xjtVar3.c(0);
        if (iC3 == 0) {
            throw new eie0("sigmaTilde(0) was zero");
        }
        int iB2 = wjtVar.b(iC3);
        xjt[] xjtVarArr = {xjtVar3.f(iB2), xjtVar5.f(iB2)};
        xjt xjtVar8 = xjtVarArr[0];
        xjt xjtVar9 = xjtVarArr[1];
        int iD2 = xjtVar8.d();
        if (iD2 == 1) {
            iArr3 = new int[]{xjtVar8.c(1)};
        } else {
            int[] iArr6 = new int[iD2];
            int i9 = 0;
            for (int i10 = 1; i10 < wjtVar.e && i9 < iD2; i10++) {
                if (xjtVar8.b(i10) == 0) {
                    iArr6[i9] = wjtVar.b(i10);
                    i9++;
                }
            }
            if (i9 != iD2) {
                throw new eie0("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i11 = 0; i11 < length3; i11++) {
            int iB3 = wjtVar.b(iArr3[i11]);
            int iC4 = 1;
            for (int i12 = 0; i12 < length3; i12++) {
                if (i11 != i12) {
                    int iC5 = wjtVar.c(iArr3[i12], iB3);
                    iC4 = wjtVar.c(iC4, (iC5 & 1) == 0 ? iC5 | 1 : iC5 & (-2));
                }
            }
            int iC6 = wjtVar.c(xjtVar9.b(iB3), wjtVar.b(iC4));
            iArr7[i11] = iC6;
            if (wjtVar.g) {
                iArr7[i11] = wjtVar.c(iC6, iB3);
            }
        }
        for (int i13 = 0; i13 < iArr3.length; i13++) {
            int length4 = iArr.length - 1;
            int i14 = iArr3[i13];
            if (i14 == 0) {
                e9d0.o();
                return 0;
            }
            int i15 = length4 - wjtVar.b[i14];
            if (i15 < 0) {
                throw new eie0("Bad error location");
            }
            iArr[i15] = iArr[i15] ^ iArr7[i13];
        }
        return iArr3.length;
    }

    public g2v g(String str) {
        jre0 jre0VarN;
        Class clsQ = ufx.Q((ClassLoader) this.f43005a, str);
        if (clsQ == null || (jre0VarN = zvw.N(clsQ)) == null) {
            return null;
        }
        return new g2v(jre0VarN);
    }

    public PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 h(String str) {
        str.getClass();
        return new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str);
    }

    public synchronized ywu i() {
        return ywu.j((gny) ((dny) this.f43005a).b());
    }

    public edu j() {
        uii uiiVar = (uii) this.f43005a;
        return new edu((Object) uiiVar.H(), (Object) uiiVar.c(), (byte) 16);
    }

    public vsg0 k(String str) {
        str.getClass();
        ouu ouuVar = (ouu) this.f43005a;
        return gfx.R(((jd30) ouuVar.c).f16311a, ibc.w0(30L, bfn.SECONDS), null, new ffd(ouuVar, str, null, (byte) 26), 220);
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        uiv0 uiv0Var = xiv0Var.f40966a;
        boolean zU = uiv0Var.u(8);
        int i = uiv0Var.i(8).d;
        if (!zU) {
            ((ck60) this.f43005a).invoke();
        }
        return xiv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(long j, zje zjeVar) {
        jqx jqxVar;
        if (zjeVar instanceof jqx) {
            jqxVar = (jqx) zjeVar;
            int i = jqxVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqxVar.k = i - Integer.MIN_VALUE;
            } else {
                jqxVar = new jqx(this, zjeVar);
            }
        } else {
            jqxVar = new jqx(this, zjeVar);
        }
        Object objA = jqxVar.i;
        wne wneVar = wne.f39444a;
        int i2 = jqxVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            zfo zfoVar = (zfo) this.f43005a;
            jqxVar.k = 1;
            objA = zfoVar.a(j, jqxVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return Boolean.valueOf(((ueo) objA).d == 2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object n(long j, String str, String str2, String str3, boolean z, zje zjeVar) {
        bv00 bv00Var;
        Object g0g0Var;
        if (zjeVar instanceof bv00) {
            bv00Var = (bv00) zjeVar;
            int i = bv00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bv00Var.k = i - Integer.MIN_VALUE;
            } else {
                bv00Var = new bv00(this, zjeVar);
            }
        } else {
            bv00Var = new bv00(this, zjeVar);
        }
        bv00 bv00Var2 = bv00Var;
        Object obj = bv00Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = bv00Var2.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                sd60 sd60Var = (sd60) this.f43005a;
                bv00Var2.k = 1;
                if (sd60Var.o(j, str, str2, str3, z, bv00Var2) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            thA.printStackTrace();
        }
        return Unit.f46060a;
    }

    @Override // a.vke
    public Object o(Object obj) {
        return Optional.ofNullable(((vke) this.f43005a).o((ResponseBody) obj));
    }

    public void p(long j, v39 v39Var) {
        Object value;
        ArrayList arrayList;
        d49 d49Var = (d49) this.f43005a;
        d49Var.getClass();
        p7m0 p7m0Var = d49Var.f5443a.f3714a;
        do {
            value = p7m0Var.getValue();
            List<z39> list = (List) value;
            arrayList = new ArrayList(r3d.q(list, 10));
            for (z39 z39VarA : list) {
                if (z39VarA.f43709a == j && z39VarA.d == v39Var) {
                    z39VarA = z39.a(z39VarA, 0L, 0L, false, "TRANSFERRING_HOST", 255);
                }
                arrayList.add(z39VarA);
            }
        } while (!p7m0Var.m(value, arrayList));
    }

    public boolean q(int i) {
        if (i < 0) {
            return false;
        }
        zz2 zz2Var = (zz2) this.f43005a;
        if (i >= zz2Var.f45232a) {
            return false;
        }
        zmx zmxVarQ = zz2Var.q(i);
        Function1 function1 = ((wdz) zmxVarQ.c).c;
        return function1 != null && function1.invoke(Integer.valueOf(i - zmxVarQ.f44646a)) == qek0.b;
    }

    public synchronized boolean r(int i) {
        Iterator it = Collections.unmodifiableList(((gny) ((dny) this.f43005a).b).A()).iterator();
        while (it.hasNext()) {
            if (((fny) it.next()).y() == i) {
                return true;
            }
        }
        return false;
    }

    public void s(Exception exc) {
        f1t0.R("MediaCodecAudioRenderer", "Audio sink error", exc);
        xex xexVar = ((fm30) this.f43005a).l2;
        Handler handler = (Handler) xexVar.f40764a;
        if (handler != null) {
            handler.post(new w34(xexVar, (Object) exc, (byte) 7));
        }
    }

    public wm40 t(mqe0 mqe0Var) {
        r9z r9zVar;
        swq swqVarC = mqe0Var.c();
        if (swqVarC != null) {
            imz[] imzVarArr = imz.f15049a;
        }
        Class<?> declaringClass = mqe0Var.f22221a.getDeclaringClass();
        mqe0 mqe0Var2 = declaringClass != null ? new mqe0(declaringClass) : null;
        if (mqe0Var2 != null) {
            wm40 wm40VarT = t(mqe0Var2);
            cr30 cr30VarJ0 = wm40VarT != null ? wm40VarT.j0() : null;
            foc focVarD = cr30VarJ0 != null ? cr30VarJ0.d(mqe0Var.e(), ux50.h) : null;
            if (focVarD instanceof wm40) {
                return (wm40) focVarD;
            }
        } else if (swqVarC != null && (r9zVar = (r9z) CollectionsKt.firstOrNull(kotlin.collections.a.c(((s9z) this.f43005a).c(swqVarC.b())))) != null) {
            x9z x9zVar = r9zVar.k.d;
            x9zVar.getClass();
            return x9zVar.v(mqe0Var.e(), mqe0Var);
        }
        return null;
    }

    public yox(zfo zfoVar) {
        zfoVar.getClass();
        this.f43005a = zfoVar;
    }

    public yox(r2m0 r2m0Var) {
        r2m0Var.getClass();
        this.f43005a = r2m0Var;
    }

    public /* synthetic */ yox(Object obj) {
        this.f43005a = obj;
    }

    public yox(neu0 neu0Var) {
        neu0Var.getClass();
        this.f43005a = neu0Var;
    }

    public yox(ClassLoader classLoader) {
        classLoader.getClass();
        this.f43005a = classLoader;
    }
}
