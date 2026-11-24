package a;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/bqe;", "La/iw5;", "<init>", "()V", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bqe extends iw5 {
    public final n0o0 k2;
    public final kiu0 l2;
    public final kiu0 m2;
    public final yzn0 n2;
    public static final /* synthetic */ iiy[] p2 = {new ez40(bqe.class, "params", "getParams()Lorg/xplatform/personal/api/presentation/model/country_params/CountryChoiceScreenParams;", 0)};
    public static final kwd o2 = new kwd();
    public static final String q2 = bqe.class.getName();

    public bqe() {
        byte b = 0;
        this.k2 = maz.b(new ype(this, b));
        byte b2 = 1;
        svc svcVar = new svc(new ype(this, b2), (byte) 29);
        aqe aqeVar = new aqe(this, b);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new aqe(aqeVar, b2));
        tre0 tre0Var = sre0.f32672a;
        byte b3 = 2;
        this.l2 = agc.G(this, tre0Var.b(kqe.class), new cce(a8zVarA, (byte) 2), new cce(a8zVarA, (byte) 3), svcVar);
        a8z a8zVarA2 = maz.a(wezVar, new aqe(new ype(this, b3), b3));
        this.m2 = agc.G(this, tre0Var.b(g0c0.class), new cce(a8zVarA2, (byte) 4), new cce(a8zVarA2, (byte) 5), new h5((Object) this, (Object) a8zVarA2, (byte) 27));
        this.n2 = new yzn0("COUNTRY_CHOICE_SCREEN_PARAMS");
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1810114277);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(1020346058, new xdr(this) { // from class: a.xpe
            public final /* synthetic */ bqe b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b2;
                cl5 cl5Var = ukd.f35823a;
                bqe bqeVar = this.b;
                switch (b3) {
                    case 0:
                        y5d y5dVar = (y5d) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kwd kwdVar = bqe.o2;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ctf0 ctf0Var = ((hdi) bqeVar.k2.getValue()).e;
                            kqe kqeVar = (kqe) bqeVar.l2.getValue();
                            boolean zI = fetVar2.i(kqeVar);
                            Object objP = fetVar2.P();
                            if (zI || objP == cl5Var) {
                                z6e z6eVar = new z6e(1, kqeVar, kqe.class, "onSearchChange", "onSearchChange(Ljava/lang/String;)V", 0, (byte) 13);
                                fetVar2.o0(z6eVar);
                                objP = z6eVar;
                            }
                            ny9.L(y5dVar, ctf0Var, (Function1) ((jhy) objP), fetVar2, iIntValue & 14);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        kiu0 kiu0Var = bqeVar.l2;
                        y5d y5dVar2 = (y5d) obj;
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        kwd kwdVar2 = bqe.o2;
                        y5dVar2.getClass();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= fetVar3.g(y5dVar2) ? 4 : 2;
                        }
                        int i = iIntValue2;
                        if (fetVar3.U(i & 1, (i & 19) != 18)) {
                            pz40 pz40VarE = ydx.E(((g0c0) bqeVar.m2.getValue()).b, Boolean.FALSE, null, fetVar3, 48, 2);
                            kqe kqeVar2 = (kqe) kiu0Var.getValue();
                            pz40 pz40VarE2 = ydx.E(new s6n0(kqeVar2.f, new iqe(kqeVar2, null, (byte) 0)), new hqe(lak0.c, true), null, fetVar3, 48, 2);
                            kqe kqeVar3 = (kqe) kiu0Var.getValue();
                            boolean zI2 = fetVar3.i(kqeVar3);
                            Object objP2 = fetVar3.P();
                            if (zI2 || objP2 == cl5Var) {
                                z6e z6eVar2 = new z6e(1, kqeVar3, kqe.class, "onItemClicked", "onItemClicked(Lorg/xplatform/personal/impl/presentation/countries/models/PersonalCountryRedesignUiModel$Item;)V", 0, (byte) 14);
                                fetVar3.o0(z6eVar2);
                                objP2 = z6eVar2;
                            }
                            ny9.i(y5dVar2, pz40VarE2, pz40VarE, (Function1) ((jhy) objP2), fetVar3, i & 14);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), (ugd) null, u1c.M(1304331596, new xdr(this) { // from class: a.xpe
            public final /* synthetic */ bqe b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b;
                cl5 cl5Var = ukd.f35823a;
                bqe bqeVar = this.b;
                switch (b3) {
                    case 0:
                        y5d y5dVar = (y5d) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kwd kwdVar = bqe.o2;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ctf0 ctf0Var = ((hdi) bqeVar.k2.getValue()).e;
                            kqe kqeVar = (kqe) bqeVar.l2.getValue();
                            boolean zI = fetVar2.i(kqeVar);
                            Object objP = fetVar2.P();
                            if (zI || objP == cl5Var) {
                                z6e z6eVar = new z6e(1, kqeVar, kqe.class, "onSearchChange", "onSearchChange(Ljava/lang/String;)V", 0, (byte) 13);
                                fetVar2.o0(z6eVar);
                                objP = z6eVar;
                            }
                            ny9.L(y5dVar, ctf0Var, (Function1) ((jhy) objP), fetVar2, iIntValue & 14);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        kiu0 kiu0Var = bqeVar.l2;
                        y5d y5dVar2 = (y5d) obj;
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        kwd kwdVar2 = bqe.o2;
                        y5dVar2.getClass();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= fetVar3.g(y5dVar2) ? 4 : 2;
                        }
                        int i = iIntValue2;
                        if (fetVar3.U(i & 1, (i & 19) != 18)) {
                            pz40 pz40VarE = ydx.E(((g0c0) bqeVar.m2.getValue()).b, Boolean.FALSE, null, fetVar3, 48, 2);
                            kqe kqeVar2 = (kqe) kiu0Var.getValue();
                            pz40 pz40VarE2 = ydx.E(new s6n0(kqeVar2.f, new iqe(kqeVar2, null, (byte) 0)), new hqe(lak0.c, true), null, fetVar3, 48, 2);
                            kqe kqeVar3 = (kqe) kiu0Var.getValue();
                            boolean zI2 = fetVar3.i(kqeVar3);
                            Object objP2 = fetVar3.P();
                            if (zI2 || objP2 == cl5Var) {
                                z6e z6eVar2 = new z6e(1, kqeVar3, kqe.class, "onItemClicked", "onItemClicked(Lorg/xplatform/personal/impl/presentation/countries/models/PersonalCountryRedesignUiModel$Item;)V", 0, (byte) 14);
                                fetVar3.o0(z6eVar2);
                                objP2 = z6eVar2;
                            }
                            ny9.i(y5dVar2, pz40VarE2, pz40VarE, (Function1) ((jhy) objP2), fetVar3, i & 14);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.iw5
    public final void N0() throws Exception {
        ol60 ol60Var = ((kqe) this.l2.getValue()).g;
        fob fobVar = new fob(this, null, (byte) 17);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zpe(ol60Var, clzVarW, fobVar, (yje) null), 3);
    }
}
