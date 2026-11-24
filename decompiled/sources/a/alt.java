package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class alt extends bnn0 implements Function2 {
    public pmi i;
    public cre j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ pmi n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ cre p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alt(pmi pmiVar, boolean z, cre creVar, yje yjeVar) {
        super(2, yjeVar);
        this.n = pmiVar;
        this.o = z;
        this.p = creVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        alt altVar = new alt(this.n, this.o, this.p, yjeVar);
        altVar.m = obj;
        return altVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((alt) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object g0g0Var;
        boolean z;
        Object objA;
        cre creVar;
        xkt xktVar;
        pmi pmiVar = this.n;
        ykt yktVar = (ykt) pmiVar.c;
        knf0 knf0Var = (knf0) pmiVar.e;
        wne wneVar = wne.f39444a;
        boolean z2 = this.l;
        try {
            if (!z2) {
                z1x.P(obj);
                z = this.o;
                cre creVar2 = this.p;
                e0g0 e0g0Var = j0g0.b;
                String strC = q7d0.c(knf0Var.b, "ISO_CODE_TO_CHANGE");
                if (strC == null) {
                    strC = knf0Var.c();
                }
                if (strC.length() <= 0) {
                    strC = null;
                }
                if (strC == null) {
                    strC = knf0Var.c();
                }
                bwl bwlVar = (bwl) pmiVar.b;
                this.m = null;
                this.i = pmiVar;
                this.j = creVar2;
                this.k = z;
                this.l = true;
                objA = ((zkt) ((wgn) bwlVar.f3330a).invoke()).a(strC, this);
                if (objA == wneVar) {
                    return wneVar;
                }
                creVar = creVar2;
            } else {
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z3 = this.k;
                creVar = this.j;
                pmi pmiVar2 = this.i;
                z1x.P(obj);
                z = z3;
                pmiVar = pmiVar2;
                objA = obj;
            }
            xkt xktVarH = hic.H((dlt) ((dx5) objA).a());
            pmiVar.getClass();
            int i = creVar.f4842a;
            if (i == 0) {
                xktVar = xktVarH;
            } else {
                xktVar = new xkt(creVar.c, creVar.b, z ? xktVarH.c : "", xktVarH.d, Integer.valueOf(i), z ? xktVarH.f : 0L, xktVarH.g);
            }
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = xktVar;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        Object obj2 = g0g0Var;
        if (thA != null) {
            xkt xktVarA = yktVar.a();
            obj2 = xktVarA;
            if (xktVarA == null) {
                throw thA;
            }
        }
        xkt xktVar2 = (xkt) obj2;
        yktVar.getClass();
        yktVar.c = xktVar2;
        q7d0 q7d0Var = yktVar.f42806a;
        if (!Intrinsics.d(yktVar.a(), xktVar2)) {
            q7d0Var.h("GEO_IP_INFO_PREF_KEY");
            q7d0Var.g("GEO_IP_INFO_PREF_KEY", yktVar.b.d(xkt.Companion.serializer(), xktVar2));
        }
        Integer num = xktVar2.e;
        int iIntValue = num != null ? num.intValue() : 0;
        knf0Var.e = Integer.valueOf(iIntValue);
        q7d0 q7d0Var2 = knf0Var.b;
        q7d0Var2.e(iIntValue, "COUNTRY_ID_PREFS_KEY");
        Long l = xktVar2.f;
        long jLongValue = l != null ? l.longValue() : 0L;
        knf0Var.f = Long.valueOf(jLongValue);
        q7d0Var2.f("REGION_ID_PREFS_KEY", jLongValue);
        return vic.H(xktVar2);
    }
}
