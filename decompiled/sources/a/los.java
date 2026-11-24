package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class los extends bnn0 implements Function1 {
    public Map i;
    public f5h j;
    public Map k;
    public List l;
    public byte m;
    public final /* synthetic */ ros n;
    public final /* synthetic */ sgs o;
    public final /* synthetic */ long p;
    public final /* synthetic */ zos q;
    public final /* synthetic */ jo20 r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ hie0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public los(ros rosVar, sgs sgsVar, long j, zos zosVar, jo20 jo20Var, boolean z, boolean z2, boolean z3, hie0 hie0Var, yje yjeVar) {
        super(1, yjeVar);
        this.n = rosVar;
        this.o = sgsVar;
        this.p = j;
        this.q = zosVar;
        this.r = jo20Var;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.v = hie0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new los(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((los) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x015f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Map mapC;
        Object objC;
        ?? arrayList;
        Object objB;
        f5h f5hVar;
        Map map;
        Object value;
        Object value2;
        List list;
        Object objB2;
        Map map2;
        List list2;
        wne wneVar = wne.f39444a;
        byte b = this.m;
        sgs sgsVar = this.o;
        ros rosVar = this.n;
        if (b == 0) {
            z1x.P(obj);
            mapC = rosVar.d.c(sgsVar.f, this.p);
            nmo nmoVar = rosVar.f30853a;
            zos zosVar = this.q;
            sip sipVar = zosVar.b;
            long j = zosVar.c;
            this.i = mapC;
            this.m = (byte) 1;
            objC = nmoVar.c(j, this, sipVar, this.r);
            if (objC != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            Map map3 = this.i;
            z1x.P(obj);
            mapC = map3;
            objC = obj;
        } else {
            if (b == 2) {
                map = this.k;
                f5h f5hVar2 = this.j;
                Map map4 = this.i;
                z1x.P(obj);
                f5hVar = f5hVar2;
                objB = obj;
                list = (List) objB;
                he1 he1Var = rosVar.g;
                this.i = null;
                this.j = f5hVar;
                this.k = map;
                this.l = list;
                this.m = (byte) 3;
                objB2 = he1Var.b(this);
                if (objB2 != wneVar) {
                    map2 = map;
                    list2 = list;
                }
                return wneVar;
            }
            if (b != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = this.l;
            Map map5 = this.k;
            f5hVar = this.j;
            Map map6 = this.i;
            z1x.P(obj);
            objB2 = obj;
            list2 = list3;
            map2 = map5;
        }
        m9s m9sVarE0 = gkb.e0(f5hVar, map2, list2, (List) objB2, sgsVar.d, rosVar.e.a(), this.s, rosVar.i, rosVar.c.e(), this.t, this.u);
        this.v.f13108a = true;
        return m9sVarE0;
        f5h f5hVar3 = (f5h) objC;
        bs20 bs20Var = rosVar.h;
        List<p5h> list4 = f5hVar3.K;
        if (list4 != null) {
            arrayList = new ArrayList();
            for (p5h p5hVar : list4) {
                Long l = p5hVar.f26404a;
                String str = p5hVar.b;
                es20 es20Var = (l == null || str == null) ? null : new es20(l.longValue(), str);
                if (es20Var != null) {
                    arrayList.add(es20Var);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ds20 ds20Var = ds20.f6591a;
        List listQ0 = zIsEmpty ? iun.f15405a : CollectionsKt.q0(kotlin.collections.a.c(ds20Var), arrayList);
        bs20Var.getClass();
        listQ0.getClass();
        zr20 zr20Var = bs20Var.f3107a;
        p7m0 p7m0Var = zr20Var.b;
        if (!listQ0.isEmpty()) {
            p7m0 p7m0Var2 = zr20Var.f44835a;
            do {
                value = p7m0Var2.getValue();
            } while (!p7m0Var2.m(value, listQ0));
            fs20 fs20Var = (fs20) p7m0Var.getValue();
            boolean z = false;
            if (!listQ0.isEmpty()) {
                Iterator it = listQ0.iterator();
                while (it.hasNext()) {
                    if (((fs20) it.next()).a() == fs20Var.a()) {
                        z = true;
                        break;
                    }
                }
            }
            if (!(fs20Var instanceof ds20) && !z) {
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, ds20Var));
            }
        }
        if (f5hVar3.equals(new f5h())) {
            jf4.k(null);
            return null;
        }
        eio eioVar = rosVar.f;
        this.i = null;
        this.j = f5hVar3;
        this.k = mapC;
        this.m = (byte) 2;
        objB = eioVar.b(this);
        if (objB != wneVar) {
            f5hVar = f5hVar3;
            map = mapC;
            list = (List) objB;
            he1 he1Var2 = rosVar.g;
            this.i = null;
            this.j = f5hVar;
            this.k = map;
            this.l = list;
            this.m = (byte) 3;
            objB2 = he1Var2.b(this);
            if (objB2 != wneVar) {
                map2 = map;
                list2 = list;
                m9s m9sVarE1 = gkb.e0(f5hVar, map2, list2, (List) objB2, sgsVar.d, rosVar.e.a(), this.s, rosVar.i, rosVar.c.e(), this.t, this.u);
                this.v.f13108a = true;
                return m9sVarE1;
            }
        }
        return wneVar;
    }
}
