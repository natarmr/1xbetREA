package a;

import java.util.List;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d06 extends w46 {
    public final FinBetInfoModel b;
    public final zlt0 c;
    public final nw20 d;
    public final ilt0 e;
    public final trm0 f;
    public final ahu g;
    public final duj h;
    public final mii0 i;
    public final zr1 j;
    public final v6q k;
    public final mne l;
    public final r9u m;
    public final m1u n;
    public final ol60 o;
    public final ol60 p;
    public final List q;

    public d06(FinBetInfoModel finBetInfoModel, zlt0 zlt0Var, nw20 nw20Var, ilt0 ilt0Var, trm0 trm0Var, ahu ahuVar, duj dujVar, mii0 mii0Var, zr1 zr1Var, v6q v6qVar, mne mneVar, r9u r9uVar, m1u m1uVar) {
        r9uVar.getClass();
        this.b = finBetInfoModel;
        this.c = zlt0Var;
        this.d = nw20Var;
        this.e = ilt0Var;
        this.f = trm0Var;
        this.g = ahuVar;
        this.h = dujVar;
        this.i = mii0Var;
        this.j = zr1Var;
        this.k = v6qVar;
        this.l = mneVar;
        this.m = r9uVar;
        this.n = m1uVar;
        this.o = new ol60(3);
        this.p = new ol60(3);
        this.q = q3d.j(i2o.A, i2o.GameIsNotInLine, i2o.WrongGameBet);
    }

    public final void A(boolean z, String str, long j, String str2, double d, String str3, String str4, String str5, boolean z2) {
        str.getClass();
        str2.getClass();
        l320 l320Var = l320.f19339a;
        ol60 ol60Var = this.o;
        ol60Var.f(l320Var);
        ygp ygpVar = ygp.Z;
        r9u r9uVar = this.m;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        if (j1q0Var.f15748a.d(ygpVar)) {
            qjj.W(jiu0.a(this), null, null, new c06(this, z, str, j, str2, d, str3, str4, str5, z2, null), 3);
        } else {
            ol60Var.f(new h520(z, str, j, str2, d, str3, str4, str5, z2));
        }
    }

    public abstract void B(boolean z);

    public final void w(Throwable th) {
        th.getClass();
        this.h.b(th, new fa2((Object) this, (byte) 23));
    }

    public final void x() {
        sac.T(new fnq(new fc4(new i89(this.k.f36888a.d.c, (byte) 22), (byte) 6), new vp3(2, this, d06.class, "updateBetButtonState", "updateBetButtonState(Z)V", 4, (byte) 20), (byte) 4), d5c.S(jiu0.a(this), this.l.f22085a), a06.h);
    }

    public final void y(Throwable th) {
        th.getClass();
        this.o.f(l320.f19339a);
        if (!(th instanceof zhi0)) {
            w(th);
            return;
        }
        zhi0 zhi0Var = (zhi0) th;
        int errorCode = zhi0Var.c.getErrorCode();
        String strValueOf = String.valueOf(errorCode);
        mii0 mii0Var = this.i;
        mii0Var.getClass();
        strValueOf.getClass();
        i8i.D("error_code", strValueOf, (kt2) mii0Var.b, "finbet_bet_error");
        b1j.r(errorCode, this.j.f44833a, 3355L);
        kuw kuwVar = zhi0Var.c;
        i2o i2oVar = i2o.TryAgainLaterError;
        ol60 ol60Var = this.p;
        if (kuwVar == i2oVar) {
            rek0 rek0Var = rek0.b;
            String message = th.getMessage();
            ol60Var.f(new p0o(new xdk0(rek0Var, message == null ? "" : message, null, null, null, null, 124)));
        } else if (kuwVar == i2o.BetExistsError) {
            String message2 = th.getMessage();
            ol60Var.f(new o0o(message2 != null ? message2 : ""));
        } else if (kuwVar != i2o.q) {
            w(th);
        } else {
            String message3 = th.getMessage();
            ol60Var.f(new q0o(message3 != null ? message3 : ""));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r14.d.m(r5, (a.ql5) r2, r8, r9) == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(a.yh7 r15, a.ql5 r16, a.zje r17) {
        /*
            r14 = this;
            r1 = r16
            r2 = r17
            boolean r3 = r2 instanceof a.b06
            if (r3 == 0) goto L18
            r3 = r2
            a.b06 r3 = (a.b06) r3
            int r4 = r3.m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.m = r4
        L16:
            r9 = r3
            goto L1e
        L18:
            a.b06 r3 = new a.b06
            r3.<init>(r14, r2)
            goto L16
        L1e:
            java.lang.Object r2 = r9.k
            a.wne r10 = a.wne.f39444a
            int r3 = r9.m
            r7 = 2
            r8 = 1
            r11 = 0
            if (r3 == 0) goto L42
            if (r3 == r8) goto L37
            if (r3 != r7) goto L31
            a.z1x.P(r2)
            goto L92
        L31:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r14)
            return r11
        L37:
            a.ql5 r0 = r9.j
            a.yh7 r1 = r9.i
            a.z1x.P(r2)
            r13 = r1
            r1 = r0
            r0 = r13
            goto L77
        L42:
            a.z1x.P(r2)
            long r2 = r1.f28916a
            double r4 = r15.f42624a
            a.ilt0 r6 = r14.e
            r6.a(r4, r2)
            a.bm5 r12 = a.bm5.m
            double r2 = r15.f42624a
            r5 = 0
            r6 = 8189(0x1ffd, float:1.1475E-41)
            r4 = 0
            a.ql5 r2 = a.ql5.a(r1, r2, r4, r5, r6)
            a.trm0 r3 = r14.f
            r3.l(r12, r2)
            a.zlt0 r2 = r14.c
            boolean r2 = r2.n()
            if (r2 == 0) goto L95
            r9.i = r15
            r9.j = r1
            r9.m = r8
            a.ahu r2 = r14.g
            java.io.Serializable r2 = r2.b(r12, r9)
            if (r2 != r10) goto L76
            goto L91
        L76:
            r0 = r15
        L77:
            a.ql5 r2 = (a.ql5) r2
            long r5 = r1.f28916a
            long r0 = r0.b
            long[] r8 = new long[r8]
            r3 = 0
            r8[r3] = r0
            r9.i = r11
            r9.j = r11
            r9.m = r7
            a.nw20 r4 = r14.d
            r7 = r2
            java.lang.Object r14 = r4.m(r5, r7, r8, r9)
            if (r14 != r10) goto L92
        L91:
            return r10
        L92:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        L95:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d06.z(a.yh7, a.ql5, a.zje):java.lang.Object");
    }
}
