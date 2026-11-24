package a;

import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes5.dex */
public final class hef0 extends i3t0 {
    public static final /* synthetic */ int C = 0;
    public c4m0 A;
    public bby B;
    public final RelatedParams o;
    public final hjd p;
    public final m1e q;
    public final j3c r;
    public final a6u s;
    public final a6u t;
    public final pru u;
    public final mne v;
    public final b4j w;
    public final je x;
    public c4m0 y;
    public bby z;

    public hef0(vzg0 vzg0Var, RelatedParams relatedParams, hjd hjdVar, m1e m1eVar, j3c j3cVar, a6u a6uVar, a6u a6uVar2, ctf0 ctf0Var, y78 y78Var, luu luuVar, bzt bztVar, pru pruVar, lbu lbuVar, mne mneVar, b4j b4jVar, je jeVar, r9u r9uVar) {
        relatedParams.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        ng0 ng0Var = new ng0(pruVar, (Object) bztVar, (Object) lbuVar, (Object) luuVar, (Object) r9uVar, (byte) 13);
        byte b = 1;
        ge2 ge2Var = new ge2(ctf0Var, y78Var, b);
        vs10 vs10Var = mneVar.c;
        super(null, ng0Var, ge2Var, cvm0.p(vs10Var, vs10Var), null);
        this.o = relatedParams;
        this.p = hjdVar;
        this.q = m1eVar;
        this.r = j3cVar;
        this.s = a6uVar;
        this.t = a6uVar2;
        this.u = pruVar;
        this.v = mneVar;
        this.w = b4jVar;
        this.x = jeVar;
        i3t0.K(this, mneVar.f22085a, null, new fef0(this, null, b), 2);
    }

    public final void M() {
        c4m0 c4m0Var = this.y;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar = this.z;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        c4m0 c4m0Var2 = this.A;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        bby bbyVar2 = this.B;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
    }

    public final void N() {
        c4m0 c4m0Var = this.A;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        boolean z = ((aef0) D()).j;
        boolean z2 = this.u.a().O1;
        a6u a6uVar = this.s;
        yje yjeVar = null;
        byte b = 4;
        this.A = J(new fnq(aoq.c(aoq.c(((uzc) a6uVar.d).c(), new sot(yjeVar, (Object) a6uVar, (byte) 16)), new b9u((byte) 7, yjeVar, a6uVar, z, z2)), new tye0(this, yjeVar, b), b), this.v.f22085a, new eef0(this, (byte) 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        zde0 zde0Var;
        y1p y1pVar;
        xdf0 xdf0Var = (xdf0) obj;
        xdf0Var.getClass();
        super.x(xdf0Var);
        byte b = 0;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (xdf0Var.equals(sdf0.f32033a)) {
            i3t0.K(this, null, null, new fef0(this, objArr3 == true ? 1 : 0, b), 3);
            return;
        }
        if (xdf0Var.equals(tdf0.f33767a)) {
            c4m0 c4m0Var = this.y;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                bby bbyVar = this.B;
                if (bbyVar != null) {
                    e3c.n(bbyVar);
                }
                this.B = i3t0.F(this, this.p, null, null, new k8e0((byte) 23), 119);
                this.y = i3t0.L(this, new fnq(this.q.b(), new coc0(this, objArr2 == true ? 1 : 0, (byte) 20), (byte) 4), null, null, 3);
                return;
            }
            return;
        }
        if (xdf0Var.equals(qdf0.f28532a)) {
            M();
            return;
        }
        if (xdf0Var.equals(rdf0.f30289a)) {
            E();
            return;
        }
        boolean zEquals = xdf0Var.equals(wdf0.f38971a);
        RelatedParams relatedParams = this.o;
        if (zEquals) {
            if (!relatedParams.f46881a) {
                N();
                return;
            }
            bby bbyVar2 = this.z;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            this.z = I(this.v.f22085a, new eef0(this, b), new bu(this, objArr == true ? 1 : 0, (byte) 15));
            return;
        }
        if (xdf0Var instanceof udf0) {
            i3t0.A(this, this.p, ((udf0) xdf0Var).f35475a, null, null, 6);
            return;
        }
        if (!(xdf0Var instanceof vdf0)) {
            t9f.b();
            return;
        }
        bem bemVar = ((vdf0) xdf0Var).f37229a;
        if (bemVar instanceof wdm) {
            wdm wdmVar = (wdm) bemVar;
            long j = wdmVar.f38979a;
            for (Object obj3 : ((aef0) D()).f725a) {
                if (((d0t) obj3).f5282a == j) {
                    obj2 = obj3;
                    break;
                }
            }
            d0t d0tVar = (d0t) obj2;
            long j2 = d0tVar != null ? d0tVar.v : 0L;
            boolean z = wdmVar.b;
            tef0 tef0Var = relatedParams.f;
            tef0Var.getClass();
            int iOrdinal = tef0Var.ordinal();
            if (iOrdinal == 0) {
                zde0Var = z ? zde0.GAME_SCREEN_LIVE : zde0.GAME_SCREEN_LINE;
            } else if (iOrdinal == 1) {
                zde0Var = zde0.DUEL_SCREEN;
            } else if (iOrdinal == 2) {
                zde0Var = zde0.SIMILAR_GAME;
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return;
                }
                zde0Var = z ? zde0.GAME_SCREEN_CYBER_LIVE : zde0.GAME_SCREEN_CYBER_LINE;
            }
            int iOrdinal2 = relatedParams.f.ordinal();
            if (iOrdinal2 == 0) {
                y1pVar = z ? y1p.GAME_SCREEN_LIVE : y1p.GAME_SCREEN_LINE;
            } else if (iOrdinal2 == 1) {
                y1pVar = y1p.DUEL_SCREEN;
            } else if (iOrdinal2 == 2) {
                y1pVar = y1p.SIMILAR_GAME;
            } else {
                if (iOrdinal2 != 3) {
                    t9f.b();
                    return;
                }
                y1pVar = z ? y1p.GAME_SCREEN_CYBER_LIVE : y1p.GAME_SCREEN_CYBER_LINE;
            }
            this.w.q(j2, zde0Var, z);
            this.x.o(j2, z, y1pVar);
        }
        i3t0.A(this, this.p, ebc.n0(bemVar), null, null, 6);
    }
}
