package a;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zbl0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ncl0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zbl0(ncl0 ncl0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ncl0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ncl0 ncl0Var = this.k;
        switch (b) {
            case 0:
                zbl0 zbl0Var = new zbl0(ncl0Var, yjeVar, (byte) 0);
                zbl0Var.j = obj;
                return zbl0Var;
            case 1:
                zbl0 zbl0Var2 = new zbl0(ncl0Var, yjeVar, (byte) 1);
                zbl0Var2.j = obj;
                return zbl0Var2;
            case 2:
                zbl0 zbl0Var3 = new zbl0(ncl0Var, yjeVar, (byte) 2);
                zbl0Var3.j = obj;
                return zbl0Var3;
            case 3:
                zbl0 zbl0Var4 = new zbl0(ncl0Var, yjeVar, (byte) 3);
                zbl0Var4.j = obj;
                return zbl0Var4;
            case 4:
                zbl0 zbl0Var5 = new zbl0(ncl0Var, yjeVar, (byte) 4);
                zbl0Var5.j = obj;
                return zbl0Var5;
            case 5:
                zbl0 zbl0Var6 = new zbl0(ncl0Var, yjeVar, (byte) 5);
                zbl0Var6.j = obj;
                return zbl0Var6;
            case 6:
                zbl0 zbl0Var7 = new zbl0(ncl0Var, yjeVar, (byte) 6);
                zbl0Var7.j = obj;
                return zbl0Var7;
            case 7:
                zbl0 zbl0Var8 = new zbl0(ncl0Var, yjeVar, (byte) 7);
                zbl0Var8.j = obj;
                return zbl0Var8;
            case 8:
                zbl0 zbl0Var9 = new zbl0(ncl0Var, yjeVar, (byte) 8);
                zbl0Var9.j = obj;
                return zbl0Var9;
            case 9:
                zbl0 zbl0Var10 = new zbl0(ncl0Var, yjeVar, (byte) 9);
                zbl0Var10.j = obj;
                return zbl0Var10;
            case 10:
                zbl0 zbl0Var11 = new zbl0(ncl0Var, yjeVar, (byte) 10);
                zbl0Var11.j = obj;
                return zbl0Var11;
            default:
                zbl0 zbl0Var12 = new zbl0(ncl0Var, yjeVar, (byte) 11);
                zbl0Var12.j = obj;
                return zbl0Var12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zbl0) create((usr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((zbl0) create((ui9) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((zbl0) create((gna) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((zbl0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((zbl0) create((xvm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((zbl0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((zbl0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((zbl0) create((fsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((zbl0) create((anq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((zbl0) create((bg30) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((zbl0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zbl0) create((anq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        long j;
        Object value;
        Object value2;
        Object value3;
        Pair pair;
        bby bbyVar;
        Pair pair2;
        bby bbyVar2;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        byte b = this.i;
        Object[] objArr = 0;
        ncl0 ncl0Var = this.k;
        switch (b) {
            case 0:
                usr usrVar = (usr) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (usrVar != null) {
                    if (usrVar instanceof ssr) {
                        j = ((ssr) usrVar).f32739a;
                    } else if (usrVar instanceof tsr) {
                        j = ((tsr) usrVar).f34474a;
                    }
                    if (j != ((zqs) ((p7m0) ncl0Var.w()).getValue()).b) {
                        return Unit.f46060a;
                    }
                    ncl0Var.C(xqs.b);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 1:
                ui9 ui9Var = (ui9) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = ncl0Var.O;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, yqs.a((yqs) value, null, null, null, ui9Var, null, null, 55)));
                return Unit.f46060a;
            case 2:
                gna gnaVar = (gna) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ncl0Var.D(false);
                p7m0 p7m0Var2 = ncl0Var.O;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, yqs.a((yqs) value2, gnaVar, null, null, null, null, null, 62)));
                return Unit.f46060a;
            case 3:
                List list = (List) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var3 = ncl0Var.U;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, list));
                return Unit.f46060a;
            case 4:
                xvm0 xvm0Var = (xvm0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ncl0 ncl0Var2 = this.k;
                nqs nqsVar = ncl0Var2.s;
                Pair pair3 = ncl0Var2.X;
                if (pair3 != null && xvm0Var.getId() == ((Number) pair3.f46059a).longValue() && (pair2 = ncl0Var2.X) != null && (bbyVar2 = (bby) pair2.b) != null && bbyVar2.isActive()) {
                    return Unit.f46060a;
                }
                if (xvm0Var.getId() != xvm0Var.a()) {
                    u3z u3zVarV = nqsVar.v();
                    ncl0Var2.A(xvm0Var.getId(), xvm0Var.a(), u3zVarV.c, u3zVarV.b == t3z.c, ncl0Var2.x().D0);
                } else {
                    Pair pair4 = ncl0Var2.X;
                    if (pair4 != null && ((Number) pair4.f46059a).longValue() == ncl0Var2.j.d && (pair = ncl0Var2.X) != null && (bbyVar = (bby) pair.b) != null && bbyVar.isActive()) {
                        return Unit.f46060a;
                    }
                    Pair pair5 = ncl0Var2.X;
                    e3c.n(pair5 != null ? (bby) pair5.b : null);
                    ncl0Var2.z(nqsVar.v());
                }
                return Unit.f46060a;
            case 5:
                List list2 = (List) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                ncl0Var.I.i(udl0.CLASSIC, list2);
                return Unit.f46060a;
            case 6:
                List list3 = (List) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var4 = ncl0Var.O;
                do {
                    value4 = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value4, yqs.a((yqs) value4, null, null, null, null, null, list3, 31)));
                return Unit.f46060a;
            case 7:
                fsr fsrVar = (fsr) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                vzg0 vzg0Var = ncl0Var.c;
                ncl0Var.Q.n(fsrVar);
                if (!fsrVar.b && !fsrVar.c) {
                    ncl0Var.C(xqs.f41338a);
                }
                Boolean bool = (Boolean) vzg0Var.a("KEY_OPEN_BROADCAST_HANDLED");
                if (!(bool != null ? bool.booleanValue() : false)) {
                    if (fsrVar.d && fsrVar.b) {
                        ncl0Var.C(xqs.b);
                    }
                    vzg0Var.e("KEY_OPEN_BROADCAST_HANDLED", Boolean.TRUE);
                }
                return Unit.f46060a;
            case 8:
                anq0 anq0Var = (anq0) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = ncl0Var.Y;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                ncl0Var.A.getClass();
                ncl0Var.Y = sac.T(new fnq(qud.f(anq0Var), new zbl0(ncl0Var, objArr == true ? 1 : 0, (byte) 11), (byte) 4), jiu0.a(ncl0Var), mcl0.h);
                return Unit.f46060a;
            case 9:
                bg30 bg30Var = (bg30) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var5 = ncl0Var.O;
                do {
                    value5 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value5, yqs.a((yqs) value5, null, null, bg30Var, null, null, null, 59)));
                return Unit.f46060a;
            case 10:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var6 = ncl0Var.S;
                do {
                    value6 = p7m0Var6.getValue();
                    uaq0.f35345a.getClass();
                } while (!p7m0Var6.m(value6, tcs.a((tcs) value6, s9m0.l(uaq0Var), 0L, null, null, null, null, null, 126)));
                return Unit.f46060a;
            default:
                anq0 anq0Var2 = (anq0) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var7 = ncl0Var.O;
                do {
                    value7 = p7m0Var7.getValue();
                } while (!p7m0Var7.m(value7, yqs.a((yqs) value7, null, anq0Var2, null, null, null, null, 61)));
                return Unit.f46060a;
        }
    }
}
