package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xplatform.bethistory.domain.model.GeneralBetInfoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class f6w extends bnn0 implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ List B;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ boolean f1;
    public final /* synthetic */ boolean g1;
    public boolean i;
    public final /* synthetic */ rrd j;
    public final /* synthetic */ s77 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ String o;
    public final /* synthetic */ int p;
    public final /* synthetic */ long q;
    public final /* synthetic */ String r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6w(rrd rrdVar, s77 s77Var, boolean z, boolean z2, boolean z3, String str, int i, long j, String str2, int i2, int i3, boolean z4, long j2, long j3, String str3, String str4, boolean z5, List list, List list2, boolean z6, List list3, boolean z7, boolean z8, yje yjeVar) {
        super(2, yjeVar);
        this.j = rrdVar;
        this.k = s77Var;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = str;
        this.p = i;
        this.q = j;
        this.r = str2;
        this.s = i2;
        this.t = i3;
        this.u = z4;
        this.v = j2;
        this.w = j3;
        this.x = str3;
        this.y = str4;
        this.z = z5;
        this.A = list;
        this.B = list2;
        this.Y = z6;
        this.Z = list3;
        this.f1 = z7;
        this.g1 = z8;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new f6w(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.Y, this.Z, this.f1, this.g1, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f6w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object objF;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        String str = this.o;
        rrd rrdVar = this.j;
        if (!z) {
            z1x.P(obj);
            String strC = ((knf0) rrdVar.h).c();
            sys0 sys0Var = sys0.c;
            s77 s77Var = s77.EVENTS;
            s77 s77Var2 = this.k;
            List listA = s77Var2 == s77Var ? ((tnm0) rrdVar.f).a(sys0Var, s77Var2, this.l, this.m, this.n) : kotlin.collections.a.c(1);
            Long lT0 = str != null ? StringsKt.t0(str) : null;
            boolean z2 = this.k == s77.SALE;
            String str2 = this.r;
            str2.getClass();
            listA.getClass();
            zst zstVar = new zst(strC, Integer.valueOf(this.p), Long.valueOf(this.q), Integer.valueOf(this.s), listA, lT0, Boolean.TRUE, Boolean.valueOf(z2), Integer.valueOf(this.t), Boolean.valueOf(this.u), str2);
            pyu pyuVar = (pyu) rrdVar.c;
            String strA = ((btt0) rrdVar.i).a();
            this.i = true;
            objF = ((r37) ((tpv) pyuVar.f27815a).invoke()).f(strA, zstVar, this);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objF = obj;
        }
        sg7 sg7Var = (sg7) objF;
        List listA2 = sg7Var.a();
        m0w m0wVar = (m0w) rrdVar.g;
        m0wVar.getClass();
        if (str != null) {
            m0wVar.c.addAll(listA2);
        } else {
            ArrayList arrayList = m0wVar.c;
            arrayList.clear();
            arrayList.addAll(listA2);
        }
        rdj rdjVar = rdj.f30294a;
        znq0 znq0Var = new znq0(this.v);
        sdj sdjVar = sdj.UNIVERSAL;
        String strF = rdj.f(znq0Var, sdjVar, null, 60);
        String strF2 = rdj.f(new znq0(this.w), sdjVar, null, 60);
        ng7 ng7Var = sg7Var.b;
        GeneralBetInfoModel generalBetInfoModelF0 = ng7Var != null ? fre0.f0(ng7Var, this.x, strF, strF2) : GeneralBetInfoModel.h;
        ArrayList arrayList2 = new ArrayList(r3d.q(listA2, 10));
        Iterator it = listA2.iterator();
        while (it.hasNext()) {
            arrayList2.add(bkb.r0((rg7) it.next(), this.k, this.y, this.z, this.A, this.B, this.Y, this.Z, this.f1, this.g1));
        }
        return new gbr(arrayList2, generalBetInfoModelF0);
    }
}
