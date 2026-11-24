package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rdk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30296a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rdk0(djz djzVar, cqq cqqVar, boolean z, boolean z2, k7q0 k7q0Var, qe60 qe60Var) {
        this.d = djzVar;
        this.e = cqqVar;
        this.b = z;
        this.c = z2;
        this.f = k7q0Var;
        this.g = qe60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pkk0 pkk0Var;
        byte b = this.f30296a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                kxq kxqVar = (kxq) obj;
                kxqVar.getClass();
                return wdk0.j((wdk0) obj5, (xdk0) obj4, kxqVar, null, (Function0) obj3, this.b, this.c, (Integer) obj2, 4);
            default:
                djz djzVar = (djz) obj5;
                cqq cqqVar = (cqq) obj4;
                k7q0 k7q0Var = (k7q0) obj3;
                qe60 qe60Var = (qe60) obj2;
                ne60 ne60Var = (ne60) obj;
                if (!djzVar.b()) {
                    cqq.a(cqqVar);
                } else if (!this.b && (pkk0Var = djzVar.c) != null) {
                    ((r3k) pkk0Var).b();
                }
                if (djzVar.b() && this.c) {
                    if (djzVar.a() != dmv.b) {
                        b9q0 b9q0VarD = djzVar.d();
                        if (b9q0VarD != null) {
                            long j = ne60Var.f23370a;
                            hsj hsjVar = djzVar.d;
                            ome omeVar = djzVar.v;
                            int iN = qe60Var.n(b9q0VarD.b(true, j));
                            omeVar.invoke(a8q0.a((a8q0) hsjVar.f13586a, null, s7n0.e(iN, iN), 5));
                            if (((j83) djzVar.f6209a.b).b.length() > 0) {
                                ((hgk0) djzVar.k).setValue(dmv.c);
                            }
                        }
                    } else {
                        k7q0Var.d(ne60Var);
                    }
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ rdk0(wdk0 wdk0Var, xdk0 xdk0Var, Function0 function0, boolean z, boolean z2, Integer num) {
        this.d = wdk0Var;
        this.e = xdk0Var;
        this.f = function0;
        this.b = z;
        this.c = z2;
        this.g = num;
    }
}
