package a;

/* JADX INFO: loaded from: classes.dex */
public final class x920 extends w46 {
    public final p7m0 A;
    public final p7m0 B;
    public final p7m0 C;
    public final mne b;
    public final duj c;
    public final g320 d;
    public final daf e;
    public final ctf0 f;
    public final o4a g;
    public final mpc h;
    public final j9c i;
    public final ni9 j;
    public final w5z k;
    public final u4a l;
    public final nou m;
    public final eti0 n;
    public final uqx o;
    public final dnv p;
    public final fqc q;
    public final znt r;
    public final fqc s;
    public final svu t;
    public final r4v u;
    public final m1e v;
    public final pru w;
    public final x1u x;
    public final ol60 y;
    public final p7m0 z;

    public x920(mne mneVar, duj dujVar, g320 g320Var, daf dafVar, ctf0 ctf0Var, o4a o4aVar, mpc mpcVar, j9c j9cVar, ni9 ni9Var, w5z w5zVar, u4a u4aVar, sp spVar, nou nouVar, k52 k52Var, eti0 eti0Var, uqx uqxVar, dnv dnvVar, fqc fqcVar, znt zntVar, fqc fqcVar2, svu svuVar, r4v r4vVar, m1e m1eVar, gs gsVar, pru pruVar, x1u x1uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = mneVar;
        this.c = dujVar;
        this.d = g320Var;
        this.e = dafVar;
        this.f = ctf0Var;
        this.g = o4aVar;
        this.h = mpcVar;
        this.i = j9cVar;
        this.j = ni9Var;
        this.k = w5zVar;
        this.l = u4aVar;
        this.m = nouVar;
        this.n = eti0Var;
        this.o = uqxVar;
        this.p = dnvVar;
        this.q = fqcVar;
        this.r = zntVar;
        this.s = fqcVar2;
        this.t = svuVar;
        this.u = r4vVar;
        this.v = m1eVar;
        this.w = pruVar;
        this.x = x1uVar;
        this.y = new ol60(3);
        this.z = q7m0.a(zq00.f44786a);
        this.A = q7m0.a(new eg5(false));
        this.B = q7m0.a(0L);
        this.C = q7m0.a("");
        byte b = 2;
        yje yjeVar = null;
        sac.T(new fnq(i120.W(new va(((tg5) spVar.f32566a.b).d, (byte) 2)), new w620(this, yjeVar, b), (byte) 4), jiu0.a(this), new xr10((Object) this, yjeVar, (byte) 6));
        sac.T(new fnq(k52Var.a(), new yg1((Object) this, yjeVar, (byte) 18), (byte) 4), jiu0.a(this), new sax(b, yjeVar, (byte) 13));
        sac.T(new fnq(((ave) gsVar.f11805a.c).o, new z210(this, yjeVar, (byte) 7), (byte) 4), jiu0.a(this), foe.h);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0144  */
    /* JADX WARN: Code duplicated, block: B:39:0x0169  */
    /* JADX WARN: Code duplicated, block: B:40:0x017d  */
    /* JADX WARN: Code duplicated, block: B:43:0x019b  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ae, code lost:
    
        if (r25.q.a(r8) == r9) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.oa20, a.svu, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(a.oa20 r26, long r27, boolean r29, a.zje r30) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x920.w(a.oa20, long, boolean, a.zje):java.lang.Object");
    }

    public final void x(kuw kuwVar, String str) {
        Object obj = null;
        sac.V(jiu0.a(this), new r520((byte) 3), null, this.b.b, new o3s(this, obj, this.i.a(), kuwVar, null, (byte) 15), 10);
        i2o i2oVar = i2o.NeedToConfirmEula;
        duj dujVar = this.c;
        if (kuwVar == i2oVar) {
            dujVar.d();
            return;
        }
        if (kuwVar == i2o.IdentificationNotPassed2) {
            dujVar.c(str);
            return;
        }
        i2o i2oVar2 = i2o.BetExistsError;
        ol60 ol60Var = this.y;
        if (kuwVar == i2oVar2) {
            ol60Var.f(new j6c0(str));
        } else {
            ol60Var.f(new l6c0(new xdk0(rek0.b, str, null, null, null, null, 124)));
        }
    }

    public final void y(String str, boolean z) {
        sac.V(jiu0.a(this), new yw10(1, this, x920.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, this.b.b, new b2b(this, z, str, (yje) null), 10);
    }
}
