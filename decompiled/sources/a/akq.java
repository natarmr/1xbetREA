package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class akq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1034a;
    public int b;
    public boolean c;
    public final List d;
    public final Object e;
    public Object f;

    public akq(ktb0 ktb0Var, List list) {
        this.f = ktb0Var;
        this.d = list;
        this.e = new List[list.size()];
        if (list.isEmpty()) {
            adx.a("NestedPrefetchController shouldn't be created with no states");
        }
    }

    public void a(wh80 wh80Var) {
        xw3 xw3Var = (xw3) this.d;
        cyu cyuVar = (cyu) this.e;
        wh80Var.getClass();
        this.c = true;
        if (!(wh80Var instanceof rh80)) {
            if (wh80Var instanceof oh80) {
                cyuVar.N(null, bp00.c);
                throw null;
            }
            if (wh80Var instanceof sh80) {
                sh80 sh80Var = (sh80) wh80Var;
                cyuVar.M(sh80Var.f32201a);
                this.f = sh80Var.b;
                return;
            } else {
                if (!(wh80Var instanceof vh80)) {
                    t9f.b();
                    return;
                }
                xw3Var.clear();
                this.b = 0;
                this.f1034a = 0;
                xw3Var.addLast(new kls0(0, ((vh80) wh80Var).f37417a));
                return;
            }
        }
        rh80 rh80Var = (rh80) wh80Var;
        dp00 dp00Var = rh80Var.e;
        int i = rh80Var.c;
        int i2 = rh80Var.d;
        List list = rh80Var.b;
        cyuVar.M(dp00Var);
        this.f = rh80Var.f;
        int iOrdinal = rh80Var.f30479a.ordinal();
        if (iOrdinal == 0) {
            xw3Var.clear();
            this.b = i2;
            this.f1034a = i;
            xw3Var.addAll(list);
            return;
        }
        if (iOrdinal == 1) {
            this.f1034a = i;
            Iterator it = l1e0.i(list.size() - 1, 0).iterator();
            while (((kkx) it).c) {
                xw3Var.addFirst(list.get(((bkx) it).nextInt()));
            }
            return;
        }
        if (iOrdinal != 2) {
            t9f.b();
        } else {
            this.b = i2;
            xw3Var.addAll(list);
        }
    }

    public List b() {
        xw3 xw3Var = (xw3) this.d;
        if (!this.c) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        dp00 dp00VarP = ((cyu) this.e).P();
        if (xw3Var.isEmpty()) {
            arrayList.add(new sh80(dp00VarP, (dp00) this.f));
            return arrayList;
        }
        List listL0 = CollectionsKt.L0(xw3Var);
        int i = this.f1034a;
        int i2 = this.b;
        dp00 dp00Var = (dp00) this.f;
        listL0.getClass();
        arrayList.add(new rh80(gp00.f11660a, listL0, i, i2, dp00VarP, dp00Var));
        return arrayList;
    }

    public akq() {
        this.d = new xw3();
        this.e = new cyu((byte) 10);
    }
}
