package a;

import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class l830 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final x4u o;
    public final wdu p;
    public final ikt0 q;
    public final o030 r;
    public final xpr s;
    public final f2v t;
    public final owp0 u;
    public final bn6 v;
    public final je w;
    public final MarketsParams.StandardSubGame x;
    public final yqc y;
    public final bby z;

    /* JADX WARN: Illegal instructions before constructor call */
    public l830(vzg0 vzg0Var, x4u x4uVar, wdu wduVar, mne mneVar, ctf0 ctf0Var, pru pruVar, ikt0 ikt0Var, o030 o030Var, r9u r9uVar, xpr xprVar, u8u u8uVar, edu eduVar, f2v f2vVar, owp0 owp0Var, bn6 bn6Var, je jeVar, MarketsParams.StandardSubGame standardSubGame, ecu ecuVar, yqc yqcVar, jqt jqtVar) {
        ctf0Var.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        vs10 vs10Var = mneVar.c;
        yje yjeVar = null;
        super(new uhx(eduVar, r9uVar, pruVar), cvm0.p(rwjVar, vs10Var), new idn(r9uVar, pruVar, ctf0Var, (byte) 3), (yzn0) null);
        this.o = x4uVar;
        this.p = wduVar;
        this.q = ikt0Var;
        this.r = o030Var;
        this.s = xprVar;
        this.t = f2vVar;
        this.u = owp0Var;
        this.v = bn6Var;
        this.w = jeVar;
        this.x = standardSubGame;
        this.y = yqcVar;
        i3t0.L(this, new fnq(dtb.z(jqtVar.a(), 1), new w620((Object) this, yjeVar, (byte) 8), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(u8uVar.s(), new f830(this, yjeVar, (byte) 1), (byte) 4), mneVar.b, null, 2);
        sac.V(jiu0.a(this), d830.f5625a, null, vs10Var, new z210(this, yjeVar, (byte) 12), 10);
        bby bbyVar = this.z;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.z = i3t0.F(this, o030Var, null, null, new b120(this, (byte) 11), 119);
        byte b = 0;
        i3t0.L(this, new fnq(new i89(ecuVar.f7584a.e.f40057a, (byte) 22), new f830(this, yjeVar, b), (byte) 4), null, new c830(this, b), 1);
        sac.V(jiu0.a(this), g830.f10846a, null, mneVar.f22085a, new j830(this, null), 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [a.je] */
    /* JADX WARN: Type inference failed for: r4v9, types: [a.bn6] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        l9s l9sVar;
        ny20 ny20Var = (ny20) obj;
        ny20Var.getClass();
        if (ny20Var instanceof jy20) {
            i3t0.A(this, this.r, ((jy20) ny20Var).f17339a, null, null, 6);
            return;
        }
        if (ny20Var.equals(iy20.f15569a)) {
            E();
            return;
        }
        ?? ValueOf = 0;
        ValueOf = 0;
        ValueOf = 0;
        if (ny20Var instanceof ky20) {
            kv20 kv20Var = ((ky20) ny20Var).f19086a;
            if (kv20Var instanceof jv20) {
                jv20 jv20Var = (jv20) kv20Var;
                boolean z = jv20Var.c;
                long j = jv20Var.f17186a;
                l9s l9sVar2 = ((m730) D()).c;
                if (l9sVar2 != null && l9sVar2.c() == 40 && (l9sVar = ((m730) D()).c) != null) {
                    ValueOf = Long.valueOf(l9sVar.d());
                }
                ?? r7 = ValueOf;
                l9s l9sVar3 = ((m730) D()).c;
                this.v.h(l9sVar3 != null ? l9sVar3.c() : 0L, r7, String.valueOf(j), z);
                l9s l9sVar4 = ((m730) D()).c;
                this.w.j(l9sVar4 != null ? l9sVar4.c() : 0L, r7, String.valueOf(j), z);
            }
            i3t0.A(this, this.s, kv20Var, null, null, 6);
            return;
        }
        if (!(ny20Var instanceof ly20)) {
            if (ny20Var instanceof my20) {
                return;
            }
            t9f.b();
            return;
        }
        MarketsParams.StandardSubGame standardSubGame = this.x;
        sac.T(new fnq(this.t.a(standardSubGame.c), new f830(this, ValueOf, (byte) 2), (byte) 4), jiu0.a(this), k830.h);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, m730.a((m730) value, null, null, null, standardSubGame.c, null, null, 247)));
        long j2 = standardSubGame.c;
        String str = standardSubGame.e;
        vvm0 vvm0Var = new vvm0(str, j2, standardSubGame.b, standardSubGame.g);
        i3t0.A(this, this.r, new r030(j2, standardSubGame.f instanceof lq2 ? oy20.e : oy20.f26041a, str), null, null, 6);
        i3t0.A(this, this.s, new hv20(vvm0Var), null, null, 6);
    }
}
