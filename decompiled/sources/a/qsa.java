package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class qsa extends bnn0 implements Function2 {
    public sff0 i;
    public String j;
    public String k;
    public List l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public byte t;
    public final /* synthetic */ wsa u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsa(wsa wsaVar, yje yjeVar) {
        super(2, yjeVar);
        this.u = wsaVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new qsa(this.u, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qsa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00d8  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        sff0 sff0VarA;
        boolean zJ;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        List listA;
        boolean z6;
        Object objC;
        boolean z7;
        boolean z8;
        boolean z9;
        wne wneVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        wsa wsaVar = this.u;
        r9u r9uVar = wsaVar.K;
        wne wneVar2 = wne.f39444a;
        byte b = this.t;
        if (b != 0) {
            if (b == 1) {
                boolean z14 = this.s;
                z5 = this.r;
                z4 = this.q;
                z3 = this.p;
                z2 = this.o;
                z = this.n;
                zJ = this.m;
                listA = this.l;
                str2 = this.k;
                str = this.j;
                sff0VarA = this.i;
                z1x.P(obj);
                z7 = z14;
                z6 = true;
                objC = obj;
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            return Unit.f46060a;
        }
        z1x.P(obj);
        sff0VarA = wsaVar.r.a();
        zJ = wsaVar.t.j();
        z = sff0VarA.L.f30534a;
        str = sff0VarA.g.i.f12896a;
        q1w0 q1w0Var = sff0VarA.d;
        z2 = q1w0Var.b;
        hl1 hl1Var = sff0VarA.b;
        z3 = hl1Var.b;
        z4 = hl1Var.C;
        z5 = sff0VarA.J;
        str2 = q1w0Var.f27973a.b;
        boolean z15 = sff0VarA.J1;
        listA = wsaVar.C.f20692a.a();
        j3c j3cVar = wsaVar.x;
        this.i = sff0VarA;
        this.j = str;
        this.k = str2;
        this.l = listA;
        this.m = zJ;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = z15;
        z6 = true;
        this.t = (byte) 1;
        objC = j3cVar.c(this);
        if (objC == wneVar2) {
            return wneVar2;
        }
        z7 = z15;
        String str3 = str;
        boolean z16 = z5;
        boolean z17 = z4;
        boolean z18 = z3;
        boolean z19 = z2;
        boolean z20 = z;
        boolean z21 = zJ;
        List list = listA;
        String str4 = str2;
        wcb wcbVar = (wcb) objC;
        ygp ygpVar = ygp.t;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        if (sff0VarA.B0) {
            ygp ygpVar2 = ygp.u;
            r9uVar.getClass();
            j1q0 j1q0Var2 = r9uVar.f30104a;
            j1q0Var2.getClass();
            if (j1q0Var2.f15748a.d(ygpVar2)) {
                z8 = z6;
            } else {
                z8 = false;
            }
        } else {
            z8 = false;
        }
        rra rraVar = new rra(z20, z19, str4, z18, z17, str3, z16, z7, z21, z8, wsaVar.G, wcbVar, list, zD);
        boolean z22 = z20;
        p7m0 p7m0Var = wsaVar.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            p7m0 p7m0Var2 = p7m0Var;
            z9 = z22;
            wneVar = wneVar2;
            z10 = z18;
            z11 = z17;
            z12 = z16;
            z13 = z7;
            if (p7m0Var2.m(value, gsa.a((gsa) value, rraVar, null, false, null, 0, 0, null, false, false, null, 4094))) {
                break;
            }
            p7m0Var = p7m0Var2;
            z22 = z9;
            wneVar2 = wneVar;
            z18 = z10;
            z17 = z11;
            z16 = z12;
            z7 = z13;
        }
        hjd hjdVar = wsaVar.u;
        y1p y1pVar = y1p.MAIN;
        cid cidVar = new cid("bet_favor_events", new xq2());
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = z21;
        this.n = z9;
        this.o = z19;
        this.p = z10;
        this.q = z11;
        this.r = z12;
        this.s = z13;
        this.t = (byte) 2;
        hjdVar.getClass();
        if (hjdVar.a(cidVar, this) == wneVar) {
            return wneVar;
        }
        return Unit.f46060a;
    }
}
