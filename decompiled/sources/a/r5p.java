package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class r5p extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ s5p k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5p(s5p s5pVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = s5pVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        s5p s5pVar = this.k;
        switch (b) {
            case 0:
                r5p r5pVar = new r5p(s5pVar, yjeVar, (byte) 0);
                r5pVar.j = obj;
                return r5pVar;
            default:
                r5p r5pVar2 = new r5p(s5pVar, yjeVar, (byte) 1);
                r5pVar2.j = obj;
                return r5pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r5p) create((f6p) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r5p) create((b6p) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                s5p s5pVar = this.k;
                a8z a8zVar = s5pVar.O1;
                f6p f6pVar = (f6p) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (f6pVar != null) {
                    if (f6pVar instanceof e6p) {
                        nek nekVar = s5p.P1;
                        s5pVar.G0().d.setVisibility(0);
                        s5pVar.G0().b.setVisibility(8);
                        ((o5p) a8zVar.getValue()).A(((e6p) f6pVar).f7296a);
                    } else if (f6pVar instanceof c6p) {
                        nek nekVar2 = s5p.P1;
                        s5pVar.G0().d.setVisibility(0);
                        s5pVar.G0().b.setVisibility(8);
                        ((o5p) a8zVar.getValue()).A(((c6p) f6pVar).f3828a);
                    } else if (f6pVar instanceof d6p) {
                        nek nekVar3 = s5p.P1;
                        s5pVar.G0().d.setVisibility(8);
                        s5pVar.G0().b.setVisibility(0);
                        s5pVar.G0().b.a(((d6p) f6pVar).f5561a);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                b6p b6pVar = (b6p) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (b6pVar == null) {
                    t9f.b();
                    return null;
                }
                nek nekVar4 = s5p.P1;
                s5p s5pVar2 = this.k;
                wdk0 wdk0Var = ((igi) s5pVar2.M1.getValue()).p;
                rek0 rek0Var = rek0.b;
                String strH = s5pVar2.H(b6pVar.f2066a);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), s5pVar2, null, null, false, null, 1020);
                return Unit.f46060a;
        }
    }
}
