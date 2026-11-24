package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i7f extends bnn0 implements Function2 {
    public List i;
    public String j;
    public r7f k;
    public q4f l;
    public List m;
    public List n;
    public List o;
    public List p;
    public byte q;
    public final /* synthetic */ r7f r;
    public final /* synthetic */ q4f s;
    public final /* synthetic */ List t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7f(r7f r7fVar, q4f q4fVar, List list, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.r = r7fVar;
        this.s = q4fVar;
        this.t = list;
        this.u = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new i7f(this.r, this.s, this.t, this.u, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i7f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:32:0x0118  */
    /* JADX WARN: Code duplicated, block: B:36:0x0144  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objP;
        List list;
        Object objN;
        List list2;
        String str;
        q4f q4fVar;
        List listN;
        List list3;
        Object objB;
        List list4;
        List list5;
        r7f r7fVar;
        List list6;
        List list7;
        Object objB2;
        List list8;
        List list9;
        List list10;
        r7f r7fVar2;
        q4f q4fVar2;
        List list11;
        String str2;
        List list12;
        wne wneVar = wne.f39444a;
        byte b = this.q;
        r7f r7fVar3 = this.r;
        if (b == 0) {
            z1x.P(obj);
            znt zntVar = r7fVar3.e;
            this.q = (byte) 1;
            objP = zntVar.f44690a.p(this);
            if (objP != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
            objP = obj;
        } else {
            if (b == 2) {
                list = this.i;
                z1x.P(obj);
                objN = obj;
                list2 = list;
                str = (String) objN;
                ((vwb0) r7fVar3.l1.f24624a.e).g("coupon_last_events_count", list2.size());
                eyg0 eyg0Var = r7fVar3.y;
                eyg0Var.getClass();
                str.getClass();
                ave aveVar = ((xre) eyg0Var.b).f41366a;
                aveVar.getClass();
                aveVar.d = str;
                boolean z = !list2.isEmpty();
                boolean z2 = ((pwq0) r7fVar3.X1.getValue()).d;
                q4fVar = this.s;
                r7fVar3.t0(q4fVar, list2, z, z2);
                if (!r7fVar3.x1) {
                    listN = r7fVar3.E.f13600a.n();
                    rpt rptVar = r7fVar3.i1;
                    this.i = list2;
                    this.j = str;
                    this.k = r7fVar3;
                    this.l = q4fVar;
                    this.m = listN;
                    this.n = list2;
                    list3 = this.t;
                    this.o = list3;
                    this.q = (byte) 3;
                    objB = ((zfo) rptVar.f30901a).b(this);
                    if (objB != wneVar) {
                        list4 = listN;
                        list5 = list3;
                        r7fVar = r7fVar3;
                        list6 = list2;
                        list7 = (List) objB;
                        f4u f4uVar = r7fVar3.j1;
                        this.i = list6;
                        this.j = str;
                        this.k = r7fVar;
                        this.l = q4fVar;
                        this.m = list4;
                        this.n = list2;
                        this.o = list5;
                        this.p = list7;
                        this.q = (byte) 4;
                        objB2 = ((edo) f4uVar.b).b(this);
                        if (objB2 != wneVar) {
                            List list13 = list4;
                            list8 = list5;
                            list9 = list7;
                            list10 = list2;
                            r7fVar2 = r7fVar;
                            q4fVar2 = q4fVar;
                            list11 = list13;
                            this.i = list6;
                            this.j = str;
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.n = null;
                            this.o = null;
                            this.p = null;
                            this.q = (byte) 5;
                            if (r7fVar2.n0(q4fVar2, list11, list10, list8, list9, (List) objB2, this.u, this) != wneVar) {
                                str2 = str;
                                list12 = list6;
                            }
                        }
                    }
                    return wneVar;
                }
                r7fVar3.p0(str, !list2.isEmpty());
                return Unit.f46060a;
            }
            if (b == 3) {
                list5 = this.o;
                List list14 = this.n;
                list4 = this.m;
                q4fVar = this.l;
                r7fVar = this.k;
                str = this.j;
                List list15 = this.i;
                z1x.P(obj);
                list6 = list15;
                list2 = list14;
                objB = obj;
                list7 = (List) objB;
                f4u f4uVar2 = r7fVar3.j1;
                this.i = list6;
                this.j = str;
                this.k = r7fVar;
                this.l = q4fVar;
                this.m = list4;
                this.n = list2;
                this.o = list5;
                this.p = list7;
                this.q = (byte) 4;
                objB2 = ((edo) f4uVar2.b).b(this);
                if (objB2 != wneVar) {
                    List list16 = list4;
                    list8 = list5;
                    list9 = list7;
                    list10 = list2;
                    r7fVar2 = r7fVar;
                    q4fVar2 = q4fVar;
                    list11 = list16;
                    this.i = list6;
                    this.j = str;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.p = null;
                    this.q = (byte) 5;
                    if (r7fVar2.n0(q4fVar2, list11, list10, list8, list9, (List) objB2, this.u, this) != wneVar) {
                        str2 = str;
                        list12 = list6;
                    }
                }
                return wneVar;
            }
            if (b == 4) {
                list9 = this.p;
                List list17 = this.o;
                list10 = this.n;
                List list18 = this.m;
                q4f q4fVar3 = this.l;
                r7f r7fVar4 = this.k;
                str = this.j;
                List list19 = this.i;
                z1x.P(obj);
                list6 = list19;
                r7fVar2 = r7fVar4;
                q4fVar2 = q4fVar3;
                list11 = list18;
                list8 = list17;
                objB2 = obj;
                this.i = list6;
                this.j = str;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.p = null;
                this.q = (byte) 5;
                if (r7fVar2.n0(q4fVar2, list11, list10, list8, list9, (List) objB2, this.u, this) != wneVar) {
                    str2 = str;
                    list12 = list6;
                }
                return wneVar;
            }
            if (b != 5) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = this.j;
            list12 = this.i;
            z1x.P(obj);
        }
        str = str2;
        list2 = list12;
        r7fVar3.p0(str, !list2.isEmpty());
        return Unit.f46060a;
        list = (List) objP;
        chf0 chf0Var = r7fVar3.S;
        this.i = list;
        this.q = (byte) 2;
        objN = chf0Var.N(this);
        if (objN != wneVar) {
            list2 = list;
            str = (String) objN;
            ((vwb0) r7fVar3.l1.f24624a.e).g("coupon_last_events_count", list2.size());
            eyg0 eyg0Var2 = r7fVar3.y;
            eyg0Var2.getClass();
            str.getClass();
            ave aveVar2 = ((xre) eyg0Var2.b).f41366a;
            aveVar2.getClass();
            aveVar2.d = str;
            boolean z3 = !list2.isEmpty();
            boolean z4 = ((pwq0) r7fVar3.X1.getValue()).d;
            q4fVar = this.s;
            r7fVar3.t0(q4fVar, list2, z3, z4);
            if (!r7fVar3.x1) {
                listN = r7fVar3.E.f13600a.n();
                rpt rptVar2 = r7fVar3.i1;
                this.i = list2;
                this.j = str;
                this.k = r7fVar3;
                this.l = q4fVar;
                this.m = listN;
                this.n = list2;
                list3 = this.t;
                this.o = list3;
                this.q = (byte) 3;
                objB = ((zfo) rptVar2.f30901a).b(this);
                if (objB != wneVar) {
                    list4 = listN;
                    list5 = list3;
                    r7fVar = r7fVar3;
                    list6 = list2;
                    list7 = (List) objB;
                    f4u f4uVar3 = r7fVar3.j1;
                    this.i = list6;
                    this.j = str;
                    this.k = r7fVar;
                    this.l = q4fVar;
                    this.m = list4;
                    this.n = list2;
                    this.o = list5;
                    this.p = list7;
                    this.q = (byte) 4;
                    objB2 = ((edo) f4uVar3.b).b(this);
                    if (objB2 != wneVar) {
                        List list110 = list4;
                        list8 = list5;
                        list9 = list7;
                        list10 = list2;
                        r7fVar2 = r7fVar;
                        q4fVar2 = q4fVar;
                        list11 = list110;
                        this.i = list6;
                        this.j = str;
                        this.k = null;
                        this.l = null;
                        this.m = null;
                        this.n = null;
                        this.o = null;
                        this.p = null;
                        this.q = (byte) 5;
                        if (r7fVar2.n0(q4fVar2, list11, list10, list8, list9, (List) objB2, this.u, this) != wneVar) {
                            str2 = str;
                            list12 = list6;
                            str = str2;
                            list2 = list12;
                        }
                    }
                }
            }
            r7fVar3.p0(str, !list2.isEmpty());
            return Unit.f46060a;
        }
        return wneVar;
    }
}
