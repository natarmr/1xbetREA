package a;

import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class nyf0 extends w46 {
    public final s64 A;
    public final mii0 B;
    public int C;
    public bby D;
    public bby E;
    public final k0j0 F;
    public final p7m0 G;
    public final ol60 H;
    public final ol60 I;
    public final i1w0 b;
    public final ocl c;
    public final nv20 d;
    public final byf0 e;
    public final drm0 f;
    public final rpt g;
    public final es h;
    public final ntu i;
    public final fnu j;
    public final ali k;
    public final gnu l;
    public final rjo m;
    public final s31 n;
    public final cyh o;
    public final z4w0 p;
    public final mne q;
    public final duj r;
    public final joc s;
    public final jrc t;
    public final joc u;
    public final epi0 v;
    public final vqb w;
    public final mi70 x;
    public final zn00 y;
    public final ctf0 z;

    public nyf0(i1w0 i1w0Var, ocl oclVar, nv20 nv20Var, byf0 byf0Var, zx10 zx10Var, drm0 drm0Var, rpt rptVar, es esVar, ntu ntuVar, fnu fnuVar, ali aliVar, gnu gnuVar, rjo rjoVar, s31 s31Var, cyh cyhVar, z4w0 z4w0Var, mne mneVar, duj dujVar, joc jocVar, jrc jrcVar, joc jocVar2, epi0 epi0Var, vqb vqbVar, mi70 mi70Var, zn00 zn00Var, ctf0 ctf0Var, s64 s64Var, mii0 mii0Var, czt cztVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.b = i1w0Var;
        this.c = oclVar;
        this.d = nv20Var;
        this.e = byf0Var;
        this.f = drm0Var;
        this.g = rptVar;
        this.h = esVar;
        this.i = ntuVar;
        this.j = fnuVar;
        this.k = aliVar;
        this.l = gnuVar;
        this.m = rjoVar;
        this.n = s31Var;
        this.o = cyhVar;
        this.p = z4w0Var;
        this.q = mneVar;
        this.r = dujVar;
        this.s = jocVar;
        this.t = jrcVar;
        this.u = jocVar2;
        this.v = epi0Var;
        this.w = vqbVar;
        this.x = mi70Var;
        this.y = zn00Var;
        this.z = ctf0Var;
        this.A = s64Var;
        this.B = mii0Var;
        this.F = cztVar.f5239a.b();
        this.G = q7m0.a(Boolean.FALSE);
        this.H = new ol60(3);
        this.I = new ol60(1, i99.b);
    }

    public final void w(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequenceU0;
        this.H.f(fyf0.f10356a);
        if (charSequence2 == null || (charSequenceU0 = StringsKt.u0(charSequence2)) == null) {
            charSequenceU0 = "";
        }
        this.c.l((charSequence == null || StringsKt.W(charSequence) || charSequenceU0.length() <= 4) ? false : true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(qkt qktVar, zje zjeVar) {
        myf0 myf0Var;
        if (zjeVar instanceof myf0) {
            myf0Var = (myf0) zjeVar;
            int i = myf0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                myf0Var.l = i - Integer.MIN_VALUE;
            } else {
                myf0Var = new myf0(this, zjeVar);
            }
        } else {
            myf0Var = new myf0(this, zjeVar);
        }
        Object objE = myf0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = myf0Var.l;
        if (i2 == 0) {
            z1x.P(objE);
            myf0Var.i = qktVar;
            myf0Var.l = 1;
            objE = this.B.E(qktVar, myf0Var);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qktVar = myf0Var.i;
            z1x.P(objE);
        }
        this.I.f(aac.c0(qkt.a(qktVar, "+" + qktVar.c, false, 251), ((Boolean) objE).booleanValue(), this.i.a()));
        return Unit.f46060a;
    }
}
