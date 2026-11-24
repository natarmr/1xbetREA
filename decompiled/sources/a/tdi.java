package a;

/* JADX INFO: loaded from: classes4.dex */
public final class tdi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uci f33770a;

    public tdi(uci uciVar) {
        this.f33770a = uciVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        udi udiVar = (udi) this.f33770a.b;
        b8u b8uVarE = udiVar.f35479a.e();
        xhi xhiVar = udiVar.f35479a;
        b8u b8uVarE2 = xhiVar.e();
        q530 q530Var = (q530) xhiVar.T.get();
        x1x.x(q530Var);
        j910 j910Var = new j910(b8uVarE2, new pv00(q530Var), (byte) 8);
        ros rosVar = (ros) xhiVar.S.get();
        rosVar.getClass();
        mne mneVarH = ((psc) udiVar.b.b).h();
        x1x.x(mneVarH);
        vs10 vs10Var = mneVarH.c;
        rwj rwjVar = mneVarH.f22085a;
        yje yjeVar = null;
        j3g j3gVar = new j3g(new dpf((byte) 19), cvm0.p(vs10Var, rwjVar), new vlf((byte) 11), null);
        fnq fnqVar = new fnq(b8uVarE.d(), new fob(j3gVar, yjeVar, (byte) 25), (byte) 4);
        sje sjeVarS = d5c.S(jiu0.a(j3gVar), rwjVar);
        foe foeVar = foe.h;
        j3gVar.o = sac.T(fnqVar, sjeVarS, foeVar);
        j3gVar.p = sac.T(new fnq(i120.W(aoq.c(new m430(b8uVarE2.d(), j910Var, (byte) 5), new za60(yjeVar, (Object) j910Var, (byte) 3))), new i3g(j3gVar, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(j3gVar), rwjVar), foeVar);
        j3gVar.q = sac.T(new fnq(i120.W(new h2c(rosVar.b.c, (byte) 18)), new i3g(j3gVar, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(j3gVar), rwjVar), foeVar);
        return j3gVar;
    }
}
