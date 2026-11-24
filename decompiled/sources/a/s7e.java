package a;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s7e implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31746a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ g45 c;

    public /* synthetic */ s7e(kmq kmqVar, g45 g45Var, byte b) {
        this.f31746a = b;
        this.b = kmqVar;
        this.c = g45Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        r7e r7eVar;
        j8e j8eVar;
        n640 n640Var;
        p8e p8eVar;
        n640 n640Var2;
        byte b = this.f31746a;
        kmq kmqVar = this.b;
        g45 g45Var = this.c;
        a640 a640VarB0 = null;
        switch (b) {
            case 0:
                if (yjeVar instanceof r7e) {
                    r7eVar = (r7e) yjeVar;
                    int i = r7eVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        r7eVar.j = i - Integer.MIN_VALUE;
                    } else {
                        r7eVar = new r7e(this, yjeVar);
                    }
                } else {
                    r7eVar = new r7e(this, yjeVar);
                }
                Object obj2 = r7eVar.i;
                wne wneVar = wne.f39444a;
                int i2 = r7eVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    HashMap mapV = g45Var.V((Map) obj);
                    r7eVar.j = 1;
                    if (kmqVar.a(mapV, r7eVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof j8e) {
                    j8eVar = (j8e) yjeVar;
                    int i3 = j8eVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        j8eVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        j8eVar = new j8e(this, yjeVar);
                    }
                } else {
                    j8eVar = new j8e(this, yjeVar);
                }
                Object obj3 = j8eVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = j8eVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    om50 om50Var = (om50) obj;
                    gxb gxbVar = (gxb) ((i7e) g45Var.c).i.getValue();
                    if (!Intrinsics.d(gxbVar, gxb.k) && (n640Var = om50Var.f25488a) != null) {
                        a640VarB0 = s0x.b0(n640Var, gxbVar, null, (vby) g45Var.i);
                    }
                    if (a640VarB0 != null) {
                        j8eVar.j = 1;
                        if (kmqVar.a(a640VarB0, j8eVar) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof p8e) {
                    p8eVar = (p8e) yjeVar;
                    int i5 = p8eVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        p8eVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        p8eVar = new p8e(this, yjeVar);
                    }
                } else {
                    p8eVar = new p8e(this, yjeVar);
                }
                Object obj4 = p8eVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = p8eVar.j;
                if (i6 == 0) {
                    z1x.P(obj4);
                    kjt0 kjt0Var = (kjt0) obj;
                    gxb gxbVar2 = (gxb) ((i7e) g45Var.c).i.getValue();
                    if (!Intrinsics.d(gxbVar2, gxb.k) && (n640Var2 = kjt0Var.c) != null) {
                        a640VarB0 = s0x.b0(n640Var2, gxbVar2, null, (vby) g45Var.i);
                    }
                    if (a640VarB0 != null) {
                        p8eVar.j = 1;
                        if (kmqVar.a(a640VarB0, p8eVar) == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
        }
    }
}
