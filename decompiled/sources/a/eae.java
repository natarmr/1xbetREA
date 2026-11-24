package a;

import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class eae extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public int j;
    public boolean k;
    public final /* synthetic */ boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eae(fae faeVar, skp skpVar, int i, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.m = faeVar;
        this.n = skpVar;
        this.j = i;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new eae((fae) this.m, (skp) obj2, this.j, this.l, yjeVar);
            case 1:
                eae eaeVar = new eae(this.l, (f7u) obj2, yjeVar);
                eaeVar.m = obj;
                return eaeVar;
            case 2:
                return new eae((rrd) this.m, this.l, this.j, (jvn) obj2, yjeVar);
            default:
                return new eae((w5z) this.m, (ouj0) obj2, this.l, this.j, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((eae) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((eae) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((eae) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((eae) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        byte b = this.i;
        boolean z = this.l;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    f4v f4vVar = ((fae) this.m).j;
                    String str = ((skp) obj2).f32362a;
                    int i2 = this.j;
                    this.k = true;
                    Object objM = ((vae) f4vVar.f8933a.b).m(i2, this, str, z);
                    if (objM != wneVar) {
                        objM = Unit.f46060a;
                    }
                    if (objM != wneVar) {
                        objM = Unit.f46060a;
                    }
                    if (objM == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                f7u f7uVar = (f7u) obj2;
                Throwable th = (Throwable) this.m;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.k;
                if (!z3) {
                    z1x.P(obj);
                    if (th instanceof zhi0) {
                        zhi0 zhi0Var = (zhi0) th;
                        if (zhi0Var.c == i2o.IncorrectDataError) {
                            gst0 gst0Var = (gst0) f7uVar.b;
                            if (z) {
                                gst0Var.j();
                            } else {
                                gst0Var.i();
                            }
                        } else {
                            if (!zhi0Var.e) {
                            }
                            if (i != 0) {
                                this.m = null;
                                this.j = i;
                                this.k = true;
                                if (qcc.O(3000L, this) == wneVar2) {
                                    return wneVar2;
                                }
                            }
                        }
                        i = 1;
                        if (i != 0) {
                            this.m = null;
                            this.j = i;
                            this.k = true;
                            if (qcc.O(3000L, this) == wneVar2) {
                                return wneVar2;
                            }
                        }
                    } else {
                        th.getClass();
                        if (!(th instanceof SocketTimeoutException)) {
                            boolean z4 = th instanceof UnknownHostException;
                        }
                    }
                    i = 0;
                    if (i != 0) {
                        this.m = null;
                        this.j = i;
                        this.k = true;
                        if (qcc.O(3000L, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.j;
                    z1x.P(obj);
                }
                return Boolean.valueOf(i != 0);
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.k;
                if (z5) {
                    if (z5) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                hru hruVar = (hru) ((rrd) this.m).b;
                y9s y9sVar = y9s.b;
                this.k = true;
                Serializable serializableN = ((w5z) hruVar.f13549a).N(false, this.l, this.j, (jvn) obj2, y9sVar, this);
                return serializableN == wneVar3 ? wneVar3 : serializableN;
            default:
                w5z w5zVar = (w5z) this.m;
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.k;
                if (z6) {
                    if (z6) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                w5zVar.getClass();
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                ouj0 ouj0Var = (ouj0) obj2;
                w5zVar.getClass();
                String strL = w5z.l(ouj0Var, timeInMillis);
                int i3 = this.j;
                knf0 knf0Var = (knf0) w5zVar.d;
                zt6 zt6VarW = lv00.W(ouj0Var, knf0Var.a(), timeInMillis, strL, knf0Var.c(), this.l, ouj0Var.u, i3);
                abu abuVar = (abu) w5zVar.b;
                String strA = ((btt0) w5zVar.c).a();
                this.k = true;
                Object objA = abuVar.m().a(strA, zt6VarW, this);
                return objA == wneVar4 ? wneVar4 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eae(rrd rrdVar, boolean z, int i, jvn jvnVar, yje yjeVar) {
        super(2, yjeVar);
        this.m = rrdVar;
        this.l = z;
        this.j = i;
        this.n = jvnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eae(w5z w5zVar, ouj0 ouj0Var, boolean z, int i, yje yjeVar) {
        super(2, yjeVar);
        this.m = w5zVar;
        this.n = ouj0Var;
        this.l = z;
        this.j = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eae(boolean z, f7u f7uVar, yje yjeVar) {
        super(2, yjeVar);
        this.l = z;
        this.n = f7uVar;
    }
}
