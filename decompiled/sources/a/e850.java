package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e850 extends bnn0 implements Function2 {
    public String i;
    public p850 j;
    public String k;
    public String l;
    public p4u m;
    public int n;
    public boolean o;
    public byte p;
    public /* synthetic */ Object q;
    public final /* synthetic */ p850 r;
    public final /* synthetic */ ha8 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e850(p850 p850Var, ha8 ha8Var, yje yjeVar) {
        super(2, yjeVar);
        this.r = p850Var;
        this.s = ha8Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        e850 e850Var = new e850(this.r, this.s, yjeVar);
        e850Var.q = obj;
        return e850Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e850) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [a.qi10] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ha8 y98Var;
        String strValueOf;
        Object objC;
        String str;
        p4u p4uVar;
        int i;
        p850 p850Var;
        ?? r0;
        Throwable th;
        String str2;
        Object objB;
        int i2;
        String str3;
        Object g0g0Var;
        rh10 rh10Var;
        vne vneVar = (vne) this.q;
        wne wneVar = wne.f39444a;
        byte b = this.p;
        ha8 ha8Var = this.s;
        p850 p850Var2 = this.r;
        boolean z = true;
        if (b == 0) {
            z1x.P(obj);
            rou rouVar = p850Var2.z;
            this.q = vneVar;
            this.p = (byte) 1;
            obj = rouVar.a(false, this);
            if (obj != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b != 2) {
                if (b != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.n;
                str3 = this.k;
                str2 = this.i;
                try {
                    z1x.P(obj);
                    zh10 zh10Var = new zh10(str3, (yh10) obj);
                    if (i2 == 0) {
                        z = false;
                    }
                    g0g0Var = new rh10(z, zh10Var);
                    e0g0 e0g0Var = j0g0.b;
                } catch (Throwable th2) {
                    th = th2;
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                rh10Var = (rh10) (g0g0Var instanceof g0g0 ? null : g0g0Var);
                if (rh10Var != null) {
                    y98Var = new da8(ha8Var.a(), rh10Var, false);
                } else {
                    y98Var = new z98(ha8Var.a(), str2);
                }
                l750 l750Var = new l750(ha8Var.getKey(), y98Var, (byte) 6);
                int i3 = p850.p0;
                p850Var2.H(l750Var);
                return Unit.f46060a;
            }
            boolean z2 = this.o;
            int i4 = this.n;
            p4u p4uVar2 = this.m;
            str = this.l;
            p850 p850Var3 = this.j;
            String str4 = this.i;
            try {
                z1x.P(obj);
                objC = obj;
                strValueOf = str4;
                p850Var = p850Var3;
                p4uVar = p4uVar2;
                i = i4;
                r0 = z2;
                int iIntValue = ((Number) objC).intValue();
                String strA = p850Var.A.a();
                this.q = null;
                this.i = strValueOf;
                this.j = null;
                this.k = str;
                this.l = null;
                this.m = null;
                this.n = i;
                this.p = (byte) 3;
                objB = ((qi10) p4uVar.f26374a).b(r0, iIntValue, this, strA);
                if (objB != wneVar) {
                    String str5 = strValueOf;
                    obj = objB;
                    str2 = str5;
                    i2 = i;
                    str3 = str;
                    zh10 zh10Var2 = new zh10(str3, (yh10) obj);
                    if (i2 == 0) {
                        z = false;
                    }
                    g0g0Var = new rh10(z, zh10Var2);
                    e0g0 e0g0Var3 = j0g0.b;
                    rh10Var = (rh10) (g0g0Var instanceof g0g0 ? null : g0g0Var);
                    if (rh10Var != null) {
                        y98Var = new da8(ha8Var.a(), rh10Var, false);
                    } else {
                        y98Var = new z98(ha8Var.a(), str2);
                    }
                    l750 l750Var2 = new l750(ha8Var.getKey(), y98Var, (byte) 6);
                    int i5 = p850.p0;
                    p850Var2.H(l750Var2);
                    return Unit.f46060a;
                }
                return wneVar;
            } catch (Throwable th3) {
                th = th3;
                str2 = str4;
                e0g0 e0g0Var4 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        }
        m2c0 m2c0Var = (m2c0) obj;
        if (m2c0Var.o0 && ((p650) p850Var2.D()).k) {
            String str6 = m2c0Var.U;
            strValueOf = str6.length() == 0 ? String.valueOf(m2c0Var.S) : str6;
            try {
                e0g0 e0g0Var5 = j0g0.b;
                p4u p4uVar3 = p850Var2.F;
                p850Var2.E.j();
                x0u x0uVar = p850Var2.B;
                this.q = null;
                this.i = strValueOf;
                this.j = p850Var2;
                this.k = null;
                this.l = strValueOf;
                this.m = p4uVar3;
                this.n = 0;
                this.o = true;
                this.p = (byte) 2;
                objC = x0uVar.c(this);
                if (objC != wneVar) {
                    str = strValueOf;
                    p4uVar = p4uVar3;
                    i = 0;
                    p850Var = p850Var2;
                    r0 = 1;
                    int iIntValue2 = ((Number) objC).intValue();
                    String strA2 = p850Var.A.a();
                    this.q = null;
                    this.i = strValueOf;
                    this.j = null;
                    this.k = str;
                    this.l = null;
                    this.m = null;
                    this.n = i;
                    this.p = (byte) 3;
                    objB = ((qi10) p4uVar.f26374a).b(r0, iIntValue2, this, strA2);
                    if (objB != wneVar) {
                        String str7 = strValueOf;
                        obj = objB;
                        str2 = str7;
                        i2 = i;
                        str3 = str;
                        zh10 zh10Var3 = new zh10(str3, (yh10) obj);
                        if (i2 == 0) {
                            z = false;
                        }
                        g0g0Var = new rh10(z, zh10Var3);
                        e0g0 e0g0Var6 = j0g0.b;
                        rh10Var = (rh10) (g0g0Var instanceof g0g0 ? null : g0g0Var);
                        if (rh10Var != null) {
                            y98Var = new da8(ha8Var.a(), rh10Var, false);
                        } else {
                            y98Var = new z98(ha8Var.a(), str2);
                        }
                    }
                }
                return wneVar;
            } catch (Throwable th4) {
                String str8 = strValueOf;
                th = th4;
                str2 = str8;
                e0g0 e0g0Var7 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        } else {
            y98Var = new y98(ha8Var.a());
        }
        l750 l750Var3 = new l750(ha8Var.getKey(), y98Var, (byte) 6);
        int i6 = p850.p0;
        p850Var2.H(l750Var3);
        return Unit.f46060a;
    }
}
