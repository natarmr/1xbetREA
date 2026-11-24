package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes6.dex */
public final class gc4 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc4(fir0 fir0Var, int i, md80 md80Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 5;
        this.l = fir0Var;
        this.k = i;
        this.m = md80Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        int i = this.k;
        Object obj = this.m;
        switch (b) {
            case 0:
                return new gc4((i3t0) obj, i, yjeVar, (byte) 0);
            case 1:
                return new gc4((i3t0) obj, i, yjeVar, (byte) 1);
            case 2:
                return new gc4((i3t0) obj, i, yjeVar, (byte) 2);
            case 3:
                return new gc4((img) this.l, (CyberGamesPage) obj, this.k, yjeVar, (byte) 3);
            case 4:
                return new gc4((w220) this.l, (cb50) obj, this.k, yjeVar, (byte) 4);
            case 5:
                return new gc4((fir0) this.l, i, (md80) obj, yjeVar);
            default:
                return new gc4((nru0) this.l, (CyberGamesPage) obj, this.k, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((gc4) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws g2 {
        kc4 kc4Var;
        fh4 fh4Var;
        hk4 hk4Var;
        byte b = this.i;
        byte b2 = 4;
        int i = this.k;
        Object obj2 = this.m;
        byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kc4 kc4Var2 = (kc4) obj2;
                    rpt rptVar = kc4Var2.w;
                    this.l = kc4Var2;
                    this.j = true;
                    Serializable serializableH = rptVar.h(i, this);
                    if (serializableH == wneVar) {
                        return wneVar;
                    }
                    obj = serializableH;
                    kc4Var = kc4Var2;
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kc4Var = (kc4) this.l;
                    z1x.P(obj);
                }
                int i2 = kc4.Y;
                kc4Var.getClass();
                kc4Var.H(new wb4((qkt) obj, b3));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    fh4 fh4Var2 = (fh4) obj2;
                    rpt rptVar2 = fh4Var2.v;
                    this.l = fh4Var2;
                    this.j = true;
                    Serializable serializableH2 = rptVar2.h(i, this);
                    if (serializableH2 == wneVar2) {
                        return wneVar2;
                    }
                    obj = serializableH2;
                    fh4Var = fh4Var2;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fh4Var = (fh4) this.l;
                    z1x.P(obj);
                }
                int i3 = fh4.c0;
                fh4Var.getClass();
                fh4Var.H(new wb4((qkt) obj, (byte) 2));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    hk4 hk4Var2 = (hk4) obj2;
                    rpt rptVar3 = hk4Var2.u;
                    this.l = hk4Var2;
                    this.j = true;
                    Serializable serializableH3 = rptVar3.h(i, this);
                    if (serializableH3 == wneVar3) {
                        return wneVar3;
                    }
                    obj = serializableH3;
                    hk4Var = hk4Var2;
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hk4Var = (hk4) this.l;
                    z1x.P(obj);
                }
                int i4 = hk4.b0;
                hk4Var.getClass();
                hk4Var.H(new wb4((qkt) obj, b2));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    this.j = true;
                    Serializable serializableA = ((img) this.l).a((CyberGamesPage) obj2, i, true, this);
                    return serializableA == wneVar4 ? wneVar4 : serializableA;
                }
                if (z4) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                cb50 cb50Var = (cb50) obj2;
                w220 w220Var = (w220) this.l;
                ouu ouuVar = w220Var.s;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    cb50 cb50VarT = ouuVar.t();
                    if (!cb50Var.f4046a.equals(cb50VarT.f4046a)) {
                        ag3 ag3Var = w220Var.q;
                        String strA = cb50Var.a();
                        ag3Var.getClass();
                        i8i.D("option", strA, ag3Var.f809a, "footer_sport_menu_call");
                        ix0 ix0Var = w220Var.k0;
                        String strA2 = cb50Var.a();
                        ix0Var.getClass();
                        b1j.v(strA2, ix0Var.f15516a, 3006L);
                        ((qe50) ouuVar.b).a(cb50Var, false);
                    } else if (i > 0) {
                        if (cb50VarT instanceof za50) {
                            ((fme) w220Var.Z0.f24973a.b).b.set(true);
                        }
                        ouu.o(ouuVar, cb50VarT, null, 4);
                    } else {
                        cb50 cb50VarT2 = ouuVar.t();
                        this.j = true;
                        Object objA = ((qe50) ouuVar.b).b.a(cb50VarT2, this);
                        if (objA != wneVar5) {
                            objA = Unit.f46060a;
                        }
                        if (objA != wneVar5) {
                            objA = Unit.f46060a;
                        }
                        if (objA == wneVar5) {
                            return wneVar5;
                        }
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    this.j = true;
                    if (((fir0) this.l).z.c(i, (md80) obj2, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                nru0 nru0Var = (nru0) this.l;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    jo20 jo20VarG = egm0.g(nru0Var.c.d(), i, ((CyberGamesPage) obj2).f46556a, true);
                    nmt0 nmt0Var = nru0Var.f24023a;
                    this.j = true;
                    obj = nmt0Var.b(jo20VarG, this);
                    if (obj == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(wgm0.v((rru0) it.next()));
                }
                return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc4(i3t0 i3t0Var, int i, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.m = i3t0Var;
        this.k = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc4(Object obj, Object obj2, int i, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.k = i;
    }
}
