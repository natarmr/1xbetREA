package a;

import android.view.View;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class o470 implements vaz, zf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24619a;

    public o470(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 15:
                this.f24619a = new rta0(gii0Var, (byte) 22);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.f24619a = gii0Var;
                break;
            default:
                this.f24619a = new rta0(gii0Var, (byte) 9);
                break;
        }
    }

    public static oln d(q4f q4fVar, double d, String str) {
        return q3d.j(q4f.k, q4f.j, q4f.f).contains(q4fVar) ? mln.f21999a : new lln(new e0d(d, d, str, str));
    }

    @Override // a.vaz
    public int a(int i) {
        return 0;
    }

    @Override // a.vaz
    public int b(int i) {
        return ((xk80) this.f24619a).o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(zje zjeVar) {
        hki0 hki0Var;
        if (zjeVar instanceof hki0) {
            hki0Var = (hki0) zjeVar;
            int i = hki0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hki0Var.k = i - Integer.MIN_VALUE;
            } else {
                hki0Var = new hki0(this, zjeVar);
            }
        } else {
            hki0Var = new hki0(this, zjeVar);
        }
        Object obj = hki0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = hki0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            throw null;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        if (((c14) this.f24619a).a(gki0.f11446a, gki0.b)) {
            return Unit.f46060a;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r0.e(r7, r2, r10) == r11) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(a.pzf r8, boolean r9, java.lang.String r10, a.zje r11) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f24619a
            a.jzf r0 = (a.jzf) r0
            a.ozf r1 = r0.b
            boolean r2 = r11 instanceof a.xna0
            if (r2 == 0) goto L19
            r2 = r11
            a.xna0 r2 = (a.xna0) r2
            int r3 = r2.n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.n = r3
            goto L1e
        L19:
            a.xna0 r2 = new a.xna0
            r2.<init>(r7, r11)
        L1e:
            java.lang.Object r7 = r2.l
            a.wne r11 = a.wne.f39444a
            int r3 = r2.n
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L41
            if (r3 == r6) goto L37
            if (r3 != r5) goto L31
            a.z1x.P(r7)
            goto L6c
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L37:
            boolean r9 = r2.k
            java.lang.String r10 = r2.j
            a.pzf r8 = r2.i
            a.z1x.P(r7)
            goto L5b
        L41:
            a.z1x.P(r7)
            if (r9 == 0) goto L48
            r7 = 0
            goto L4a
        L48:
            boolean r7 = r1.f26098a
        L4a:
            if (r7 != 0) goto L6e
            r2.i = r8
            r2.j = r10
            r2.k = r9
            r2.n = r6
            java.lang.Object r7 = r0.d(r8, r2)
            if (r7 != r11) goto L5b
            goto L6b
        L5b:
            long r7 = r8.f27841a
            r2.i = r4
            r2.j = r4
            r2.k = r9
            r2.n = r5
            java.lang.Object r7 = r0.e(r7, r2, r10)
            if (r7 != r11) goto L6c
        L6b:
            return r11
        L6c:
            r1.f26098a = r6
        L6e:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o470.e(a.pzf, boolean, java.lang.String, a.zje):java.lang.Object");
    }

    public void f(n3w n3wVar) {
        n3wVar.getClass();
        vqc vqcVar = (vqc) this.f24619a;
        String str = n3wVar.f22868a;
        q4f q4fVar = n3wVar.g1;
        vqcVar.l(new v0f(str, q4fVar, n3wVar.g, n3wVar.o, n3wVar.m, n3wVar.L1, 0.0d, "", iun.f15405a, 0.0d, n3wVar.w, n3wVar.v, d(q4fVar, n3wVar.e, n3wVar.f)));
    }

    public void g(uob0 uob0Var) {
        drb0 drb0Var = (drb0) ((iw20) this.f24619a).f15470a;
        drb0Var.getClass();
        drb0Var.f6552a = uob0Var;
    }

    public void h(List list) {
        list.getClass();
        t37 t37Var = (t37) ((ok50) this.f24619a).f25390a;
        t37Var.getClass();
        ArrayList arrayListA = t37.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListA) {
            if (((un7) obj).f35947a != q4f.l) {
                arrayList.add(obj);
            }
        }
        if (list.equals(arrayList)) {
            list = arrayListA;
        }
        t37Var.getClass();
        t37Var.f33251a = list;
    }

    public void i(boolean z) {
        ((t91) this.f24619a).f33539a.o = z;
    }

    public void j() {
        if (c14.b.getAndSet((c14) this.f24619a, gki0.c) == gki0.b) {
            throw null;
        }
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        jmu0.l(xiv0Var.f40966a.i(1).b, 0, 13, ((fdf0) this.f24619a).q0());
        return xiv0Var;
    }

    public o470(g6m0 g6m0Var) {
        g6m0Var.getClass();
        this.f24619a = g6m0Var;
    }

    public o470(d0b d0bVar) {
        d0bVar.getClass();
        this.f24619a = d0bVar;
    }

    public o470(q430 q430Var) {
        q430Var.getClass();
        this.f24619a = q430Var;
    }

    public o470(fnd0 fnd0Var) {
        fnd0Var.getClass();
        this.f24619a = fnd0Var;
    }

    public o470(oh9 oh9Var) {
        oh9Var.getClass();
        this.f24619a = oh9Var;
    }

    public o470(m4i0 m4i0Var) {
        m4i0Var.getClass();
        this.f24619a = m4i0Var;
    }

    public /* synthetic */ o470(Object obj) {
        this.f24619a = obj;
    }

    public o470(zxz zxzVar) {
        euc eucVar = (euc) zxzVar.b;
        azj0 azj0Var = (azj0) zxzVar.f45181a;
        mne mneVar = (mne) zxzVar.d;
        ntu ntuVar = (ntu) zxzVar.c;
        eucVar.getClass();
        azj0Var.getClass();
        this.f24619a = new kki(eucVar, azj0Var, mneVar, ntuVar);
    }

    public o470(plc plcVar) {
        plcVar.getClass();
        this.f24619a = o2e.Z(gki0.f11446a);
    }
}
