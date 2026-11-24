package a;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class mos extends bnn0 implements Function1 {
    public Map i;
    public f5h j;
    public Map k;
    public List l;
    public int m;
    public byte n;
    public final /* synthetic */ ros o;
    public final /* synthetic */ sgs p;
    public final /* synthetic */ zos q;
    public final /* synthetic */ jo20 r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mos(ros rosVar, sgs sgsVar, zos zosVar, jo20 jo20Var, boolean z, boolean z2, boolean z3, long j, yje yjeVar) {
        super(1, yjeVar);
        this.o = rosVar;
        this.p = sgsVar;
        this.q = zosVar;
        this.r = jo20Var;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.v = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new mos(this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((mos) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:44:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc A[SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Map mapC;
        Object objC;
        Object objB;
        f5h f5hVar;
        int i;
        List list;
        Object objB2;
        Map map;
        boolean z;
        Iterator it;
        Object next;
        List list2;
        wne wneVar = wne.f39444a;
        byte b = this.n;
        zos zosVar = this.q;
        sgs sgsVar = this.p;
        ros rosVar = this.o;
        if (b == 0) {
            z1x.P(obj);
            mapC = rosVar.d.c(sgsVar.f, -26L);
            nmo nmoVar = rosVar.f30853a;
            sip sipVar = zosVar.b;
            long j = zosVar.c;
            this.i = mapC;
            this.n = (byte) 1;
            objC = nmoVar.c(j, this, sipVar, this.r);
            if (objC != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            Map map2 = this.i;
            z1x.P(obj);
            mapC = map2;
            objC = obj;
        } else {
            if (b == 2) {
                i = this.m;
                Map map3 = this.k;
                f5h f5hVar2 = this.j;
                Map map4 = this.i;
                z1x.P(obj);
                mapC = map3;
                f5hVar = f5hVar2;
                objB = obj;
                list = (List) objB;
                he1 he1Var = rosVar.g;
                this.i = null;
                this.j = f5hVar;
                this.k = mapC;
                this.l = list;
                this.m = i;
                this.n = (byte) 3;
                objB2 = he1Var.b(this);
                if (objB2 != wneVar) {
                    map = mapC;
                }
                return wneVar;
            }
            if (b != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.m;
            list = this.l;
            Map map5 = this.k;
            f5hVar = this.j;
            Map map6 = this.i;
            z1x.P(obj);
            map = map5;
            objB2 = obj;
        }
        List list3 = list;
        f5h f5hVar3 = f5hVar;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        it = acb.c0(f5hVar3, map, z, list3, (List) objB2, this.s, sgsVar.d, rosVar.e.a(), this.t, this.u).iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xum0) next).b != this.v);
        xum0 xum0Var = (xum0) next;
        list2 = xum0Var != null ? xum0Var.f : null;
        if (list2 == null) {
            return iun.f15405a;
        }
        return list2;
        f5h f5hVar4 = (f5h) objC;
        int i2 = zosVar.b == sip.c ? 1 : 0;
        eio eioVar = rosVar.f;
        this.i = null;
        this.j = f5hVar4;
        this.k = mapC;
        this.m = i2;
        this.n = (byte) 2;
        objB = eioVar.b(this);
        if (objB != wneVar) {
            f5hVar = f5hVar4;
            i = i2;
            list = (List) objB;
            he1 he1Var2 = rosVar.g;
            this.i = null;
            this.j = f5hVar;
            this.k = mapC;
            this.l = list;
            this.m = i;
            this.n = (byte) 3;
            objB2 = he1Var2.b(this);
            if (objB2 != wneVar) {
                map = mapC;
                List list4 = list;
                f5h f5hVar5 = f5hVar;
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                it = acb.c0(f5hVar5, map, z, list4, (List) objB2, this.s, sgsVar.d, rosVar.e.a(), this.t, this.u).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((xum0) next).b != this.v);
                xum0 xum0Var2 = (xum0) next;
                if (xum0Var2 != null) {
                }
                if (list2 == null) {
                    return iun.f15405a;
                }
                return list2;
            }
        }
        return wneVar;
    }
}
