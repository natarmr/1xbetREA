package a;

import android.util.Log;
import android.view.textclassifier.TextClassifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fl3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl3(long j, vpq vpqVar, pot0 pot0Var, odd oddVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.k = j;
        this.l = vpqVar;
        this.m = pot0Var;
        this.n = oddVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                return new fl3((gl3) this.l, (String) obj2, (String) obj3, this.k, yjeVar);
            case 1:
                return new fl3(this.k, (vpq) this.l, (pot0) obj2, (odd) obj3, yjeVar);
            case 2:
                return new fl3((nn60) this.l, (a570) obj2, this.k, (cn60) obj3, yjeVar);
            case 3:
                return new fl3((nn60) this.l, (a570) obj3, this.k, (String) obj2, yjeVar);
            case 4:
                fl3 fl3Var = new fl3(this.k, yjeVar, (lw90) obj2, (CharSequence) obj3);
                fl3Var.l = obj;
                return fl3Var;
            case 5:
                fl3 fl3Var2 = new fl3((sch0) obj2, this.k, (jie0) obj3, yjeVar);
                fl3Var2.l = obj;
                return fl3Var2;
            case 6:
                return new fl3((k4s0) this.l, this.k, (z1s0) obj3, (String) obj2, yjeVar, (byte) 6);
            case 7:
                return new fl3((n6s0) this.l, this.k, (z1s0) obj3, (String) obj2, yjeVar, (byte) 7);
            default:
                return new fl3((l7s0) this.l, this.k, (z1s0) obj3, (String) obj2, yjeVar, (byte) 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fl3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fl3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((fl3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((fl3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((fl3) create(jw90.g(obj), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((fl3) create((rch0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((fl3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((fl3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fl3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                String str = (String) this.n;
                gl3 gl3Var = (gl3) this.l;
                p7m0 p7m0Var = gl3Var.m;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gl3Var.d.getClass();
                    jm3 jm3Var = (jm3) gl3Var.b.f2175a;
                    q7d0 q7d0Var = jm3Var.f16745a;
                    jm3Var.b.getClass();
                    String strJ0 = sj3.j0(q7d0.c(q7d0Var, "UpdateChannelId"), "prod_id_channel_update");
                    ((jm3) gl3Var.c.b).b.getClass();
                    wk3 wk3Var = new wk3(strJ0);
                    p7m0Var.getClass();
                    p7m0Var.o(null, wk3Var);
                    cl3 cl3Var = gl3Var.f;
                    String str2 = (String) this.m;
                    String str3 = (String) this.n;
                    long j = this.k;
                    this.j = true;
                    if (cl3Var.a(str2, str3, j, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                gl3Var.j.a(str);
                gl3Var.k.o(str);
                gl3Var.g.b(mm3.f22019a);
                uk3 uk3Var = uk3.f35807a;
                p7m0Var.getClass();
                p7m0Var.o(null, uk3Var);
                return Unit.f46060a;
            case 1:
                long j2 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(j2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "triggerAutoCancel: auto-canceling after " + j2 + " ms");
                }
                vpq vpqVar = (vpq) this.l;
                pot0 pot0Var = (pot0) this.m;
                odd oddVar = (odd) this.n;
                vpqVar.getClass();
                oddVar.b0(new c44("Cancelled by cancelFocusAndMetering()", (byte) 1));
                i7m0 i7m0Var = vpqVar.c;
                synchronized (i7m0Var.d) {
                    i7m0Var.l = null;
                }
                i7m0Var.f();
                pot0Var.d();
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    nn60 nn60Var = (nn60) this.l;
                    i1w0 i1w0VarC = nn60Var.l.c();
                    a570 a570Var = (a570) this.m;
                    long j3 = this.k;
                    String str4 = ((cn60) this.n).b;
                    this.j = true;
                    if (nn60Var.k(i1w0VarC, a570Var, j3, str4, this) == wneVar3) {
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
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    nn60 nn60Var2 = (nn60) this.l;
                    nn60Var2.y = true;
                    i1w0 i1w0VarC2 = nn60Var2.l.c();
                    a570 a570Var2 = (a570) this.n;
                    long j4 = this.k;
                    String str5 = (String) this.m;
                    this.j = true;
                    if (nn60Var2.k(i1w0VarC2, a570Var2, j4, str5, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    TextClassifier textClassifierG = jw90.g(this.l);
                    lw90 lw90Var = (lw90) this.m;
                    CharSequence charSequence = (CharSequence) this.n;
                    long j5 = this.k;
                    this.j = true;
                    if (lw90Var.a(charSequence, j5, textClassifierG, this) == wneVar5) {
                        return wneVar5;
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
                sch0 sch0Var = (sch0) this.m;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    rch0 rch0Var = (rch0) this.l;
                    float fH = sch0Var.h(this.k);
                    rwc0 rwc0Var = new rwc0(this.n, (Object) sch0Var, (Object) rch0Var, (byte) 26);
                    this.j = true;
                    if (hhm0.n(0.0f, fH, null, rwc0Var, this, 12) == wneVar6) {
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
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    k4s0 k4s0Var = (k4s0) this.l;
                    long j6 = this.k;
                    z1s0 z1s0Var = (z1s0) this.n;
                    String str6 = (String) this.m;
                    this.j = true;
                    int i = k4s0.A;
                    if (k4s0Var.O(j6, z1s0Var, str6, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    n6s0 n6s0Var = (n6s0) this.l;
                    long j7 = this.k;
                    z1s0 z1s0Var2 = (z1s0) this.n;
                    String str7 = (String) this.m;
                    this.j = true;
                    int i2 = n6s0.A;
                    if (n6s0Var.O(j7, z1s0Var2, str7, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    l7s0 l7s0Var = (l7s0) this.l;
                    long j8 = this.k;
                    z1s0 z1s0Var3 = (z1s0) this.n;
                    String str8 = (String) this.m;
                    this.j = true;
                    int i3 = l7s0.z;
                    if (l7s0Var.O(j8, z1s0Var3, str8, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl3(long j, yje yjeVar, lw90 lw90Var, CharSequence charSequence) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.m = lw90Var;
        this.n = charSequence;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl3(gl3 gl3Var, String str, String str2, long j, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.l = gl3Var;
        this.m = str;
        this.n = str2;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl3(nn60 nn60Var, a570 a570Var, long j, cn60 cn60Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.l = nn60Var;
        this.m = a570Var;
        this.k = j;
        this.n = cn60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl3(nn60 nn60Var, a570 a570Var, long j, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.l = nn60Var;
        this.n = a570Var;
        this.k = j;
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl3(sch0 sch0Var, long j, jie0 jie0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        this.m = sch0Var;
        this.k = j;
        this.n = jie0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl3(i3t0 i3t0Var, long j, z1s0 z1s0Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = i3t0Var;
        this.k = j;
        this.n = z1s0Var;
        this.m = str;
    }
}
