package a;

import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class sdn extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public bby A;
    public final MarketsParams.DuelSubGame o;
    public final mne p;
    public final x4u q;
    public final w5z r;
    public final o030 s;
    public final xpr t;
    public final es u;
    public final pmi v;
    public final owp0 w;
    public final clc x;
    public final bby y;
    public bby z;

    /* JADX WARN: Illegal instructions before constructor call */
    public sdn(vzg0 vzg0Var, MarketsParams.DuelSubGame duelSubGame, mne mneVar, ctf0 ctf0Var, x4u x4uVar, f2v f2vVar, w5z w5zVar, pru pruVar, o030 o030Var, xpr xprVar, es esVar, pmi pmiVar, r9u r9uVar, owp0 owp0Var, u8u u8uVar, edu eduVar, h7u h7uVar, clc clcVar, jqt jqtVar) {
        ctf0Var.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        vs10 vs10Var = mneVar.c;
        byte b = 0;
        yje yjeVar = null;
        super(new g8l(duelSubGame, eduVar, r9uVar, (byte) 8), cvm0.p(rwjVar, vs10Var), new idn(r9uVar, pruVar, ctf0Var, b), (yzn0) null);
        this.o = duelSubGame;
        this.p = mneVar;
        this.q = x4uVar;
        this.r = w5zVar;
        this.s = o030Var;
        this.t = xprVar;
        this.u = esVar;
        this.v = pmiVar;
        this.w = owp0Var;
        this.x = clcVar;
        byte b2 = 4;
        sac.T(new fnq(f2vVar.a(((cdn) D()).d), new pdn(this, yjeVar, (byte) 1), b2), jiu0.a(this), rdn.h);
        i3t0.L(this, new fnq(dtb.z(jqtVar.a(), 1), new ldn(this, yjeVar, b), b2), null, null, 3);
        sac.V(jiu0.a(this), qdn.f28543a, null, mneVar.f22085a, new hu3(this, ((cdn) D()).d, yjeVar, (byte) 4), 10);
        sac.V(jiu0.a(this), mdn.f21605a, null, vs10Var, new wib(this, yjeVar, (byte) 29), 10);
        bby bbyVar = this.y;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.y = i3t0.F(this, o030Var, null, null, new f4m((byte) 21), 119);
        i3t0.L(this, new fnq(u8uVar.s(), new pdn(this, yjeVar, b), b2), mneVar.b, null, 2);
        i3t0.A(this, o030Var, new r030(duelSubGame.c, oy20.c, duelSubGame.e), null, null, 6);
        i3t0.L(this, new fnq(dtb.z(new aen(vtb.M(h7uVar.f12592a.f2458a.b), b), 1), new jdn(this, null), b2), null, null, 3);
        i3t0.A(this, xprVar, new hv20(new rvm0(duelSubGame.c, duelSubGame.b, duelSubGame.e)), null, null, 6);
    }

    public final void M(boolean z) {
        bby bbyVar = this.z;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.z = sac.V(jiu0.a(this), new edl(this, (byte) 27), null, this.p.f22085a, new u88((Object) this, z, yjeVar, (byte) 15), 10);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:37|25|80|38|(2:89|40)(1:43)|(1:45)|46|(1:48)(1:49)|(1:51)|52|53|54|87|55|(1:58)) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:89|40) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:13|14|74|33|84|34|(15:37|25|80|38|(2:89|40)(1:43)|(1:45)|46|(1:48)(1:49)|(1:51)|52|53|54|87|55|(1:58))|73) */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1 A[Catch: all -> 0x00cb, CancellationException -> 0x013e, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x013e, blocks: (B:34:0x0087, B:38:0x00b8, B:40:0x00c8, B:45:0x00d1, B:46:0x00d3, B:48:0x00df, B:51:0x00e5, B:53:0x00e9, B:55:0x00fd, B:59:0x0108, B:18:0x004c, B:23:0x0062), top: B:86:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00df A[Catch: all -> 0x00cb, CancellationException -> 0x013e, TRY_ENTER, TryCatch #4 {CancellationException -> 0x013e, blocks: (B:34:0x0087, B:38:0x00b8, B:40:0x00c8, B:45:0x00d1, B:46:0x00d3, B:48:0x00df, B:51:0x00e5, B:53:0x00e9, B:55:0x00fd, B:59:0x0108, B:18:0x004c, B:23:0x0062), top: B:86:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5 A[Catch: all -> 0x00cb, CancellationException -> 0x013e, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x013e, blocks: (B:34:0x0087, B:38:0x00b8, B:40:0x00c8, B:45:0x00d1, B:46:0x00d3, B:48:0x00df, B:51:0x00e5, B:53:0x00e9, B:55:0x00fd, B:59:0x0108, B:18:0x004c, B:23:0x0062), top: B:86:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:89:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010c, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010d, code lost:
    
        r9 = r6;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0111, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0112, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0116, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0117, code lost:
    
        r10 = r2;
        r2 = r4;
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0136, code lost:
    
        if (a.qcc.O(3000, r2) == r3) goto L73;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0136 -> B:14:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(boolean r24, a.zje r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sdn.N(boolean, a.zje):java.lang.Object");
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        tcn tcnVar = (tcn) obj;
        tcnVar.getClass();
        if (tcnVar instanceof rcn) {
            i3t0.A(this, this.s, ((rcn) tcnVar).f30247a, null, null, 6);
        } else if (tcnVar.equals(qcn.f28491a)) {
            E();
        } else if (!(tcnVar instanceof scn)) {
            t9f.b();
        } else {
            i3t0.A(this, this.t, ((scn) tcnVar).f31994a, null, null, 6);
        }
    }
}
