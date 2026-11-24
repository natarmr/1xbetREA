package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hh1 extends bnn0 implements Function2 {
    public long i;
    public long j;
    public long k;
    public Object l;
    public hl m;
    public int n;
    public int o;
    public byte p;
    public final /* synthetic */ mh1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh1(mh1 mh1Var, yje yjeVar) {
        super(2, yjeVar);
        this.q = mh1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new hh1(this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hh1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0132  */
    /* JADX WARN: Code duplicated, block: B:51:0x0138  */
    /* JADX WARN: Code duplicated, block: B:65:0x0187  */
    /* JADX WARN: Code duplicated, block: B:67:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        long jCurrentTimeMillis;
        long j2;
        long j3;
        long j4;
        Object objJ;
        long jCurrentTimeMillis2;
        dlc0 dlc0Var;
        long jCurrentTimeMillis3;
        long j5;
        long j6;
        dlc0 dlc0Var2;
        long j7;
        int i;
        int i2;
        hl hlVar;
        String str;
        int i3;
        Object objA;
        int i4;
        hl hlVar2;
        int i5;
        klc0 glc0Var;
        Object value;
        mh1 mh1Var = this.q;
        ocj ocjVar = mh1Var.i;
        wne wneVar = wne.f39444a;
        byte b = this.p;
        if (b == 0) {
            z1x.P(obj);
            j = ((pf1) mh1Var.D()).s;
            jCurrentTimeMillis = System.currentTimeMillis();
            j2 = 1000;
            try {
                edu eduVar = mh1Var.F;
                this.i = j;
                this.j = 1000L;
                this.k = jCurrentTimeMillis;
                this.p = (byte) 1;
                eduVar.getClass();
                objJ = d5c.J(this, new bpu(j, null, eduVar));
                if (objJ != wneVar) {
                    dlc0Var = (dlc0) objJ;
                    jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (jCurrentTimeMillis3 < j2) {
                        long j8 = j2;
                        j5 = j8 - jCurrentTimeMillis3;
                        this.l = dlc0Var;
                        this.i = j;
                        j6 = j;
                        this.j = j8;
                        this.k = jCurrentTimeMillis;
                        this.p = (byte) 2;
                        if (qcc.O(j5, this) != wneVar) {
                            dlc0Var2 = dlc0Var;
                            j7 = j6;
                            dlc0Var = dlc0Var2;
                            j = j7;
                            i = dlc0Var.f6273a.f34280a;
                            i2 = dlc0Var.b.f34280a;
                            hlVar = dlc0Var.c;
                            if (hlVar.c.length() > 0) {
                                q0u q0uVar = mh1Var.q;
                                String str2 = hlVar.c;
                                this.l = null;
                                this.m = hlVar;
                                this.i = j;
                                this.n = i;
                                this.o = i2;
                                this.p = (byte) 4;
                                objA = q0uVar.a(str2, this);
                                if (objA != wneVar) {
                                    i4 = i;
                                    hlVar2 = hlVar;
                                    str = (String) objA;
                                    i3 = i4;
                                    hlVar = hlVar2;
                                }
                            } else {
                                str = "";
                                i3 = i;
                            }
                        }
                    } else {
                        i = dlc0Var.f6273a.f34280a;
                        i2 = dlc0Var.b.f34280a;
                        hlVar = dlc0Var.c;
                        if (hlVar.c.length() > 0) {
                            q0u q0uVar2 = mh1Var.q;
                            String str3 = hlVar.c;
                            this.l = null;
                            this.m = hlVar;
                            this.i = j;
                            this.n = i;
                            this.o = i2;
                            this.p = (byte) 4;
                            objA = q0uVar2.a(str3, this);
                            if (objA != wneVar) {
                                i4 = i;
                                hlVar2 = hlVar;
                                str = (String) objA;
                                i3 = i4;
                                hlVar = hlVar2;
                            }
                        } else {
                            str = "";
                            i3 = i;
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                j3 = jCurrentTimeMillis;
                j4 = 1000;
                jCurrentTimeMillis2 = System.currentTimeMillis() - j3;
                if (jCurrentTimeMillis2 >= j4) {
                    throw th;
                }
                this.l = th;
                this.i = j;
                this.j = j4;
                this.k = j3;
                this.p = (byte) 3;
                if (qcc.O(j4 - jCurrentTimeMillis2, this) != wneVar) {
                    return wneVar;
                }
                throw th;
            }
            return wneVar;
        }
        if (b == 1) {
            j3 = this.k;
            j4 = this.j;
            j = this.i;
            try {
                z1x.P(obj);
                j2 = j4;
                jCurrentTimeMillis = j3;
                objJ = obj;
                try {
                    dlc0Var = (dlc0) objJ;
                    jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (jCurrentTimeMillis3 < j2) {
                        long j9 = j2;
                        j5 = j9 - jCurrentTimeMillis3;
                        this.l = dlc0Var;
                        this.i = j;
                        j6 = j;
                        this.j = j9;
                        this.k = jCurrentTimeMillis;
                        this.p = (byte) 2;
                        if (qcc.O(j5, this) != wneVar) {
                            dlc0Var2 = dlc0Var;
                            j7 = j6;
                            dlc0Var = dlc0Var2;
                            j = j7;
                            i = dlc0Var.f6273a.f34280a;
                            i2 = dlc0Var.b.f34280a;
                            hlVar = dlc0Var.c;
                            if (hlVar.c.length() > 0) {
                                q0u q0uVar3 = mh1Var.q;
                                String str4 = hlVar.c;
                                this.l = null;
                                this.m = hlVar;
                                this.i = j;
                                this.n = i;
                                this.o = i2;
                                this.p = (byte) 4;
                                objA = q0uVar3.a(str4, this);
                                if (objA != wneVar) {
                                    i4 = i;
                                    hlVar2 = hlVar;
                                }
                            } else {
                                str = "";
                                i3 = i;
                            }
                        }
                    } else {
                        i = dlc0Var.f6273a.f34280a;
                        i2 = dlc0Var.b.f34280a;
                        hlVar = dlc0Var.c;
                        if (hlVar.c.length() > 0) {
                            q0u q0uVar4 = mh1Var.q;
                            String str5 = hlVar.c;
                            this.l = null;
                            this.m = hlVar;
                            this.i = j;
                            this.n = i;
                            this.o = i2;
                            this.p = (byte) 4;
                            objA = q0uVar4.a(str5, this);
                            if (objA != wneVar) {
                                i4 = i;
                                hlVar2 = hlVar;
                            }
                        } else {
                            str = "";
                            i3 = i;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j3 = jCurrentTimeMillis;
                    j4 = j2;
                    j = j;
                    jCurrentTimeMillis2 = System.currentTimeMillis() - j3;
                    if (jCurrentTimeMillis2 >= j4) {
                        throw th;
                    }
                    this.l = th;
                    this.i = j;
                    this.j = j4;
                    this.k = j3;
                    this.p = (byte) 3;
                    if (qcc.O(j4 - jCurrentTimeMillis2, this) != wneVar) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                jCurrentTimeMillis2 = System.currentTimeMillis() - j3;
                if (jCurrentTimeMillis2 >= j4) {
                    throw th;
                }
                this.l = th;
                this.i = j;
                this.j = j4;
                this.k = j3;
                this.p = (byte) 3;
                if (qcc.O(j4 - jCurrentTimeMillis2, this) != wneVar) {
                    return wneVar;
                }
                throw th;
            }
            return wneVar;
        }
        if (b == 2) {
            j7 = this.i;
            dlc0Var2 = (dlc0) this.l;
            z1x.P(obj);
            dlc0Var = dlc0Var2;
            j = j7;
            i = dlc0Var.f6273a.f34280a;
            i2 = dlc0Var.b.f34280a;
            hlVar = dlc0Var.c;
            if (hlVar.c.length() > 0) {
                q0u q0uVar5 = mh1Var.q;
                String str6 = hlVar.c;
                this.l = null;
                this.m = hlVar;
                this.i = j;
                this.n = i;
                this.o = i2;
                this.p = (byte) 4;
                objA = q0uVar5.a(str6, this);
                if (objA != wneVar) {
                    i4 = i;
                    hlVar2 = hlVar;
                }
                return wneVar;
            }
            str = "";
            i3 = i;
        } else {
            if (b == 3) {
                Throwable th4 = (Throwable) this.l;
                z1x.P(obj);
                throw th4;
            }
            if (b != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = this.o;
            i4 = this.n;
            hlVar2 = this.m;
            z1x.P(obj);
            i2 = i6;
            objA = obj;
        }
        str = (String) objA;
        i3 = i4;
        hlVar = hlVar2;
        String str7 = str;
        int i7 = i2;
        String str8 = mh1.E0;
        p7m0 p7m0Var = ocjVar.f25029a;
        while (true) {
            Object value2 = p7m0Var.getValue();
            value2.getClass();
            i5 = i7;
            if (p7m0Var.m(value2, pf1.a((pf1) value2, str7, i3, i7, false, 0L, null, false, null, null, null, null, null, null, false, null, false, -196610, 15))) {
                break;
            }
            i7 = i5;
        }
        int i8 = i3 + i5;
        if (hlVar.f13231a != 0) {
            double d = hlVar.b;
            if (d > 0.0d) {
                glc0Var = new elc0(str7, d);
            } else if (i8 > 0) {
                glc0Var = new glc0(i8);
            } else {
                glc0Var = ilc0.f14971a;
            }
        } else if (i8 > 0) {
            glc0Var = new glc0(i8);
        } else {
            glc0Var = ilc0.f14971a;
        }
        klc0 klc0Var = glc0Var;
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value = p7m0Var2.getValue();
            value.getClass();
        } while (!p7m0Var2.m(value, pf1.a((pf1) value, null, 0, 0, false, 0L, null, false, klc0Var, null, null, null, null, null, false, null, false, -16777217, 15)));
        return Unit.f46060a;
    }
}
