package a;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class iu40 extends d660 {
    public final do20 f;
    public final q99 g;
    public c4m0 h;

    public iu40(sch0 sch0Var, do20 do20Var, jbh0 jbh0Var, w6k w6kVar) {
        super(sch0Var, jbh0Var, w6kVar);
        this.f = do20Var;
        this.g = vtb.d(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object e(iu40 iu40Var, mie0 mie0Var, jie0 jie0Var, sch0 sch0Var, mie0 mie0Var2, long j, zje zjeVar) {
        hu40 hu40Var;
        sch0 sch0Var2;
        mie0 mie0Var3;
        iu40 iu40Var2;
        mie0 mie0Var4;
        jie0 jie0Var2;
        boolean z;
        if (zjeVar instanceof hu40) {
            hu40Var = (hu40) zjeVar;
            int i = hu40Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                hu40Var.o = i - Integer.MIN_VALUE;
            } else {
                hu40Var = new hu40(zjeVar);
            }
        } else {
            hu40Var = new hu40(zjeVar);
        }
        Object objU = hu40Var.n;
        wne wneVar = wne.f39444a;
        int i2 = hu40Var.o;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objU);
            if (j < 0) {
                return Boolean.FALSE;
            }
            w620 w620Var = new w620((Object) iu40Var, yjeVar, (byte) 15);
            hu40Var.i = iu40Var;
            hu40Var.j = mie0Var;
            hu40Var.k = jie0Var;
            sch0Var2 = sch0Var;
            hu40Var.l = sch0Var2;
            mie0Var3 = mie0Var2;
            hu40Var.m = mie0Var3;
            hu40Var.o = 1;
            objU = msm0.u(j, w620Var, hu40Var);
            if (objU == wneVar) {
                return wneVar;
            }
            iu40Var2 = iu40Var;
            mie0Var4 = mie0Var;
            jie0Var2 = jie0Var;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mie0 mie0Var5 = hu40Var.m;
            sch0 sch0Var3 = hu40Var.l;
            jie0Var2 = hu40Var.k;
            mie0Var4 = hu40Var.j;
            iu40 iu40Var3 = hu40Var.i;
            z1x.P(objU);
            mie0Var3 = mie0Var5;
            sch0Var2 = sch0Var3;
            iu40Var2 = iu40Var3;
        }
        eu40 eu40Var = (eu40) objU;
        if (eu40Var != null) {
            boolean z2 = ((eu40) mie0Var4.f21842a).c;
            long j2 = eu40Var.f8401a;
            mie0Var4.f21842a = new eu40(j2, z2, eu40Var.b);
            jie0Var2.f16571a = sch0Var2.j(sch0Var2.f(j2));
            mie0Var3.f21842a = x4d0.d(0.0f, 0.0f, 30);
            zri zriVar = iu40Var2.e;
            long j3 = eu40Var.b;
            long j4 = eu40Var.f8401a;
            ((i6u0) zriVar.b).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((i6u0) zriVar.c).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !k7x.Q(jie0Var2.f16571a);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static eu40 g(q99 q99Var) {
        eu40 eu40Var = null;
        egi0 egi0VarA = igi0.a(new e660(null, new du40(q99Var, (byte) 0)));
        while (egi0VarA.hasNext()) {
            eu40 eu40VarA = (eu40) egi0VarA.next();
            if (eu40Var != null) {
                eu40VarA = eu40Var.a(eu40VarA);
            }
            eu40Var = eu40VarA;
        }
        return eu40Var;
    }

    public final float c(rch0 rch0Var, float f) {
        sch0 sch0Var = this.f5538a;
        long jI = sch0Var.i(sch0Var.e(f));
        sch0 sch0Var2 = rch0Var.f30239a;
        return sch0Var.h(sch0Var.f(sch0Var2.d(sch0Var2.k, jI, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015f, code lost:
    
        if (r5.b.invoke(r0, r9) == r10) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(a.sch0 r20, a.eu40 r21, float r22, float r23, a.zje r24) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iu40.d(a.sch0, a.eu40, float, float, a.zje):java.lang.Object");
    }

    public final boolean f(woa0 woa0Var) {
        long j;
        w6k w6kVar = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.f6397a;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? ga3.l(viewConfiguration) : w6kVar.w0(64.0f));
        float f2 = -(i > 26 ? ga3.h(viewConfiguration) : w6kVar.w0(64.0f));
        List list = woa0Var.f39485a;
        ne60 ne60Var = new ne60(0L);
        int size = list.size();
        boolean zD = false;
        int i2 = 0;
        while (true) {
            j = ne60Var.f23370a;
            if (i2 >= size) {
                break;
            }
            ne60Var = new ne60(ne60.f(j, ((dpa0) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        sch0 sch0Var = this.f5538a;
        float fJ = sch0Var.j(sch0Var.f(jFloatToRawIntBits));
        if (fJ != 0.0f) {
            bch0 bch0Var = sch0Var.f31986a;
            zD = fJ > 0.0f ? bch0Var.d() : bch0Var.c();
        }
        if (zD) {
            return !(this.g.f(new eu40(jFloatToRawIntBits, false, ((dpa0) CollectionsKt.U(woa0Var.f39485a)).b)) instanceof ytb);
        }
        return this.d;
    }
}
