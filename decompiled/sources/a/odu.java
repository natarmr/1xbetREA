package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class odu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ odu(wdu wduVar, boolean z, String str, String str2, boolean z2, boolean z3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wduVar;
        this.l = z;
        this.m = str;
        this.n = str2;
        this.o = z2;
        this.p = z3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                return new odu((wdu) this.k, this.l, (String) obj3, (String) obj2, this.o, this.p, yjeVar, (byte) 0);
            case 1:
                return new odu((wdu) this.k, this.l, (String) obj3, (String) obj2, this.o, this.p, yjeVar, (byte) 1);
            default:
                boolean z = this.p;
                odu oduVar = new odu(this.l, (daf) obj3, this.o, (List) obj2, z, yjeVar);
                oduVar.k = obj;
                return oduVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((odu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((odu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((odu) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object objE;
        Object objC;
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    objE = ((wdu) this.k).E(this.l, (String) obj3, (String) obj2, this.o, this.p, this);
                    if (objE == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = ((j0g0) obj).f15681a;
                }
                return new j0g0(objE);
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    objC = ((wdu) this.k).C(this.l, (String) obj3, (String) obj2, this.o, this.p, this);
                    if (objC == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = ((j0g0) obj).f15681a;
                }
                return new j0g0(objC);
            default:
                daf dafVar = (daf) obj3;
                kmq kmqVar = (kmq) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    boolean z4 = this.o;
                    boolean z5 = this.l;
                    if (z5) {
                        s5r0 s5r0Var = (s5r0) ((spc) dafVar.f).f32585a.b;
                        (z4 ? s5r0Var.f31667a : s5r0Var.b).a();
                    }
                    s5r0 s5r0Var2 = (s5r0) ((h0q0) dafVar.g).b;
                    a1g a1gVarO = uvw.O(new i89((z4 ? s5r0Var2.f31667a : s5r0Var2.b).c(), (byte) 22), new r0v(dafVar, z4, yjeVar, (byte) 0), new xpp((Object) dafVar, z4, yjeVar, (byte) 11));
                    List list = (List) obj2;
                    hie0 hie0Var = new hie0();
                    hie0Var.f13108a = z5;
                    hie0 hie0Var2 = new hie0();
                    hie0Var2.f13108a = this.p;
                    boolean z6 = this.o;
                    long j = z6 ? 8L : 30L;
                    lsa lsaVar = new lsa(aoq.c(aoq.b(a1gVarO, new i89(uvw.P(new qqu(new vsg0(new al6(hie0Var2, j, dafVar, z6, list, null)), hie0Var, (byte) 10), new lqu(hie0Var, (byte) 13), j, new r0v(dafVar, z6, yjeVar, b2), null, new x9((Object) dafVar, z6, (byte) 24), 24), (byte) 22)), new sot(yjeVar, (Object) dafVar, (byte) 14)), (byte) 5);
                    this.k = null;
                    this.j = true;
                    if (slb.Q(kmqVar, lsaVar, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odu(boolean z, daf dafVar, boolean z2, List list, boolean z3, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.l = z;
        this.m = dafVar;
        this.o = z2;
        this.n = list;
        this.p = z3;
    }
}
