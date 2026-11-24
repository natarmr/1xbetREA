package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class ch70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public dqr j;
    public String k;
    public double l;
    public double m;
    public byte n;
    public /* synthetic */ Object o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ w46 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch70(w46 w46Var, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.q = w46Var;
        this.p = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.p;
        w46 w46Var = this.q;
        switch (b) {
            case 0:
                ch70 ch70Var = new ch70((eh70) w46Var, z, yjeVar, (byte) 0);
                ch70Var.o = obj;
                return ch70Var;
            default:
                ch70 ch70Var2 = new ch70((ji70) w46Var, z, yjeVar, (byte) 1);
                ch70Var2.o = obj;
                return ch70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ch70) create(pair, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0104 A[LOOP:0: B:36:0x00d0->B:46:0x0104, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01af  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01da  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101 A[SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        double dDoubleValue;
        dqr dqrVar;
        Object objA;
        double dA;
        dqr dqrVar2;
        String str;
        double d;
        double d2;
        boolean z;
        boolean z2;
        Object value;
        tg70 tg70Var;
        double d3;
        double d4;
        boolean z3;
        double dDoubleValue2;
        dqr dqrVar3;
        Object objA2;
        double dA2;
        double d5;
        dqr dqrVar4;
        String str2;
        double d6;
        boolean z4;
        boolean z5;
        Object value2;
        double d7;
        boolean z6;
        bi70 bi70VarA;
        String str3;
        double d8;
        byte b = this.i;
        boolean z7 = this.p;
        w46 w46Var = this.q;
        switch (b) {
            case 0:
                eh70 eh70Var = (eh70) w46Var;
                itt ittVar = eh70Var.j;
                p7m0 p7m0Var = eh70Var.z;
                Pair pair = (Pair) this.o;
                wne wneVar = wne.f39444a;
                byte b2 = this.n;
                if (b2 == 0) {
                    z1x.P(obj);
                    dDoubleValue = ((Number) pair.f46059a).doubleValue();
                    dqrVar = (dqr) pair.b;
                    t0u t0uVar = eh70Var.r;
                    this.o = null;
                    this.j = dqrVar;
                    this.l = dDoubleValue;
                    this.n = (byte) 1;
                    objA = t0uVar.a(this);
                    if (objA != wneVar) {
                    }
                    return wneVar;
                }
                if (b2 == 1) {
                    dDoubleValue = this.l;
                    dqrVar = this.j;
                    z1x.P(obj);
                    objA = obj;
                } else {
                    if (b2 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dA = this.m;
                    d = this.l;
                    String str4 = this.k;
                    dqrVar2 = this.j;
                    z1x.P(obj);
                    str = str4;
                }
                d2 = dA;
                if (d2 >= Math.min(dqrVar2.b, d)) {
                    z = true;
                } else {
                    z = false;
                }
                if (dqrVar2.f6530a >= d2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Regex regex = eh70.C;
                eh70Var.y(false);
                do {
                    value = p7m0Var.getValue();
                    tg70Var = (tg70) value;
                    d3 = dqrVar2.f6530a;
                    d4 = dqrVar2.b;
                    if (d2 <= d4 || d3 > d2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } while (!p7m0Var.m(value, tg70.a(tg70Var, d3, d4, str, d2, z2, z, z, z2, z3, false, false, 6144)));
                return Unit.f46060a;
                String str5 = (String) objA;
                if (((tg70) p7m0Var.getValue()).e == 0.0d || z7) {
                    dA = dqrVar.c;
                } else {
                    dA = (ittVar.a() == 0.0d || z7) ? ((tg70) p7m0Var.getValue()).e : ittVar.a();
                }
                String strValueOf = String.valueOf(dA);
                this.o = null;
                this.j = dqrVar;
                this.k = str5;
                this.l = dDoubleValue;
                this.m = dA;
                this.n = (byte) 2;
                if (eh70Var.x(strValueOf, this) != wneVar) {
                    dqrVar2 = dqrVar;
                    str = str5;
                    d = dDoubleValue;
                    d2 = dA;
                    if (d2 >= Math.min(dqrVar2.b, d)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dqrVar2.f6530a >= d2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Regex regex2 = eh70.C;
                    eh70Var.y(false);
                    do {
                        value = p7m0Var.getValue();
                        tg70Var = (tg70) value;
                        d3 = dqrVar2.f6530a;
                        d4 = dqrVar2.b;
                        if (d2 <= d4) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                    } while (!p7m0Var.m(value, tg70.a(tg70Var, d3, d4, str, d2, z2, z, z, z2, z3, false, false, 6144)));
                    return Unit.f46060a;
                }
                return wneVar;
            default:
                ji70 ji70Var = (ji70) w46Var;
                itt ittVar2 = ji70Var.j;
                p7m0 p7m0Var2 = ji70Var.w;
                Pair pair2 = (Pair) this.o;
                wne wneVar2 = wne.f39444a;
                byte b3 = this.n;
                if (b3 == 0) {
                    z1x.P(obj);
                    dDoubleValue2 = ((Number) pair2.f46059a).doubleValue();
                    dqrVar3 = (dqr) pair2.b;
                    t0u t0uVar2 = ji70Var.q;
                    this.o = null;
                    this.j = dqrVar3;
                    this.l = dDoubleValue2;
                    this.n = (byte) 1;
                    objA2 = t0uVar2.a(this);
                    if (objA2 != wneVar2) {
                    }
                    return wneVar2;
                }
                if (b3 == 1) {
                    dDoubleValue2 = this.l;
                    dqrVar3 = this.j;
                    z1x.P(obj);
                    objA2 = obj;
                } else {
                    if (b3 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    double d9 = this.m;
                    d6 = this.l;
                    String str6 = this.k;
                    dqr dqrVar5 = this.j;
                    z1x.P(obj);
                    d5 = d9;
                    str2 = str6;
                    dqrVar4 = dqrVar5;
                }
                if (d5 >= Math.min(dqrVar4.b, d6)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dqrVar4.f6530a >= d5) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Regex regex3 = ji70.y;
                ji70Var.x(false);
                while (true) {
                    value2 = p7m0Var2.getValue();
                    bi70 bi70Var = (bi70) value2;
                    double d10 = dqrVar4.f6530a;
                    d7 = dqrVar4.b;
                    if (d5 <= d7 || d10 > d5) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    bi70VarA = bi70.a(bi70Var, d10, d7, str2, d5, z5, z4, z4, z5, z6, false, false, 6144);
                    str3 = str2;
                    d8 = d5;
                    if (p7m0Var2.m(value2, bi70VarA)) {
                        return Unit.f46060a;
                    }
                    d5 = d8;
                    str2 = str3;
                }
                String str7 = (String) objA2;
                if (((bi70) p7m0Var2.getValue()).e == 0.0d || z7) {
                    dA2 = dqrVar3.c;
                } else {
                    dA2 = ittVar2.a() == 0.0d ? ((bi70) p7m0Var2.getValue()).e : ittVar2.a();
                }
                String strValueOf2 = String.valueOf(dA2);
                this.o = null;
                this.j = dqrVar3;
                this.k = str7;
                this.l = dDoubleValue2;
                this.m = dA2;
                this.n = (byte) 2;
                if (ji70Var.w(strValueOf2, this) != wneVar2) {
                    d5 = dA2;
                    dqrVar4 = dqrVar3;
                    str2 = str7;
                    d6 = dDoubleValue2;
                    if (d5 >= Math.min(dqrVar4.b, d6)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dqrVar4.f6530a >= d5) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Regex regex4 = ji70.y;
                    ji70Var.x(false);
                    while (true) {
                        value2 = p7m0Var2.getValue();
                        bi70 bi70Var2 = (bi70) value2;
                        double d11 = dqrVar4.f6530a;
                        d7 = dqrVar4.b;
                        if (d5 <= d7) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        bi70VarA = bi70.a(bi70Var2, d11, d7, str2, d5, z5, z4, z4, z5, z6, false, false, 6144);
                        str3 = str2;
                        d8 = d5;
                        if (p7m0Var2.m(value2, bi70VarA)) {
                            return Unit.f46060a;
                        }
                        d5 = d8;
                        str2 = str3;
                    }
                }
                return wneVar2;
        }
    }
}
