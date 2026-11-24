package a;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class g7a0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final o030 o;
    public final rmo p;
    public final rrd q;
    public final eu90 r;
    public final bn6 s;
    public final je t;
    public final lrc u;
    public bby v;

    public g7a0(mne mneVar, r9u r9uVar, o030 o030Var, rmo rmoVar, rrd rrdVar, x4u x4uVar, zsu zsuVar, s1u s1uVar, eu90 eu90Var, rku rkuVar, bzt bztVar, u8u u8uVar, edu eduVar, bn6 bn6Var, je jeVar, lrc lrcVar, jqt jqtVar, pru pruVar) {
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        vs10 vs10Var = mneVar.c;
        g090 g090VarP = cvm0.p(rwjVar, vs10Var);
        qw80 qw80Var = new qw80((Object) eduVar, (Object) r9uVar, (byte) 16);
        jl40 jl40Var = new jl40((Object) r9uVar, (Object) pruVar, (Object) bztVar, (byte) 25);
        yje yjeVar = null;
        super(qw80Var, g090VarP, jl40Var, (yzn0) null);
        this.o = o030Var;
        this.p = rmoVar;
        this.q = rrdVar;
        this.r = eu90Var;
        this.s = bn6Var;
        this.t = jeVar;
        this.u = lrcVar;
        byte b = 1;
        byte b2 = 0;
        byte b3 = 4;
        i3t0.L(this, new fnq(dtb.z(jqtVar.a(), 1), new d7a0(this, yjeVar, b2), b3), null, null, 3);
        sac.T(new fnq(((n9s) x4uVar.f40284a).a(), new e7a0(this, yjeVar, b2), b3), d5c.S(jiu0.a(this), vs10Var), foe.h);
        sac.T(new p6d(s1uVar.a(), new i89(zsuVar.f44923a.f2157a.b, (byte) 22), new f7a0(this, null), b), d5c.S(jiu0.a(this), rwjVar), foe.h);
        i3t0.L(this, new fnq(u8uVar.s(), new s980(this, yjeVar, (byte) 17), b3), mneVar.b, null, 2);
        sac.T(aoq.c(new p6d(rkuVar.f30666a.f2157a.f38672a, rkuVar.b.f13495a.f44771a, new qos(3, yjeVar, (byte) 5), b), new kh1(yjeVar, (Object) this, (byte) 14)), d5c.S(jiu0.a(this), rwjVar), foe.h);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        l9s l9sVar;
        Object value;
        Map map;
        Map map2;
        q6a0 q6a0Var = (q6a0) obj;
        q6a0Var.getClass();
        if (q6a0Var instanceof l6a0) {
            i3t0.A(this, this.o, ((l6a0) q6a0Var).f19497a, null, null, 6);
            return;
        }
        if (q6a0Var.equals(k6a0.f17758a)) {
            E();
            return;
        }
        if (q6a0Var.equals(o6a0.f24724a)) {
            bby bbyVar = this.v;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.v = i3t0.F(this, this.o, null, null, new so90((byte) 24), 119);
                return;
            }
            return;
        }
        if (q6a0Var.equals(p6a0.f26445a)) {
            e3c.n(this.v);
            return;
        }
        if (!(q6a0Var instanceof m6a0)) {
            if (!(q6a0Var instanceof n6a0)) {
                t9f.b();
                return;
            }
            n6a0 n6a0Var = (n6a0) q6a0Var;
            long j = n6a0Var.f22987a;
            String str = n6a0Var.b;
            boolean z = n6a0Var.c;
            l9s l9sVar2 = ((y6a0) D()).e;
            Long lValueOf = (l9sVar2 == null || l9sVar2.c() != 40 || (l9sVar = ((y6a0) D()).e) == null) ? null : Long.valueOf(l9sVar.d());
            l9s l9sVar3 = ((y6a0) D()).e;
            this.s.h(l9sVar3 != null ? l9sVar3.c() : 0L, lValueOf, String.valueOf(j), z);
            l9s l9sVar4 = ((y6a0) D()).e;
            this.t.j(l9sVar4 != null ? l9sVar4.c() : 0L, lValueOf, String.valueOf(j), z);
            i3t0.K(this, null, null, new sr((Object) this, j, (Object) str, (yje) null, (byte) 11), 3);
            return;
        }
        m6a0 m6a0Var = (m6a0) q6a0Var;
        long j2 = m6a0Var.f21260a;
        boolean z2 = m6a0Var.b;
        String str2 = ((y6a0) D()).c;
        if (str2 == null) {
            return;
        }
        boolean z3 = !z2;
        rmo rmoVar = this.p;
        rmoVar.getClass();
        noo nooVar = rmoVar.f30752a;
        nooVar.getClass();
        moo mooVar = nooVar.f23877a;
        mooVar.getClass();
        p7m0 p7m0Var = mooVar.f22144a;
        do {
            value = p7m0Var.getValue();
            map = (Map) value;
            map2 = (Map) map.get(str2);
            if (map2 == null) {
                map2 = lun.f20680a;
                map2.getClass();
            }
        } while (!p7m0Var.m(value, xp20.k(map, new Pair(str2, xp20.k(map2, new Pair(Long.valueOf(j2), Boolean.valueOf(z3)))))));
    }
}
