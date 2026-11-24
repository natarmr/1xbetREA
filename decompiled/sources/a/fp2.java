package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fp2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ gp2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp2(gp2 gp2Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gp2Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gp2 gp2Var = this.k;
        switch (b) {
            case 0:
                return new fp2(gp2Var, yjeVar, (byte) 0);
            default:
                fp2 fp2Var = new fp2(gp2Var, yjeVar, (byte) 1);
                fp2Var.j = ((Boolean) obj).booleanValue();
                return fp2Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fp2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((fp2) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object objQ;
        boolean z;
        String value;
        byte b = this.i;
        byte b2 = 0;
        gp2 gp2Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                boolean z3 = true;
                if (!z2) {
                    z1x.P(obj);
                    fvt0 fvt0Var = gp2Var.c;
                    long j = gp2Var.b;
                    this.j = true;
                    objQ = ((mii0) fvt0Var.f10231a).q(j, this);
                    if (objQ == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objQ = obj;
                }
                List list = (List) objQ;
                p7m0 p7m0Var = gp2Var.i;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    so2 so2Var = (so2) it.next();
                    so2Var.getClass();
                    long j2 = so2Var.f32522a;
                    long j3 = so2Var.b;
                    long j4 = so2Var.d;
                    String str = so2Var.e;
                    String str2 = so2Var.f;
                    boolean z4 = z3;
                    String str3 = so2Var.g;
                    ArrayList arrayList2 = arrayList;
                    long j5 = so2Var.h;
                    String str4 = so2Var.i;
                    Iterator it2 = it;
                    String str5 = (String) CollectionsKt.firstOrNull(so2Var.j);
                    String strR = "";
                    if (str5 == null) {
                        str5 = "";
                    }
                    String strS = vsm0.s(j5, str5);
                    long j6 = so2Var.k;
                    String str6 = so2Var.l;
                    String str7 = (String) CollectionsKt.firstOrNull(so2Var.m);
                    if (str7 == null) {
                        str7 = "";
                    }
                    String strS2 = vsm0.s(j6, str7);
                    boolean z5 = so2Var.n;
                    String str8 = so2Var.o;
                    boolean z6 = !StringsKt.W(str8);
                    bh30 bh30VarB = new Regex("(\\d+[:-]\\d+)").b(str8);
                    if (bh30VarB == null || (value = bh30VarB.getValue()) == null) {
                        z = false;
                    } else {
                        z = false;
                        strR = kotlin.text.c.r(value, Separators.COLON, "-", false);
                    }
                    arrayList2.add(new ap2(j2, j3, j4, str, str2, str3, j5, str4, strS, j6, str6, strS2, z5, z6, strR, xf0.S(str8), !StringsKt.W(xf0.S(str8)), so2Var.p, so2Var.q));
                    arrayList = arrayList2;
                    z3 = z4;
                    it = it2;
                }
                bp2 bp2Var = new bp2(arrayList);
                p7m0Var.getClass();
                p7m0Var.o(null, bp2Var);
                return Unit.f46060a;
            default:
                boolean z7 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!gp2Var.h && z7) {
                    sac.V(jiu0.a(gp2Var), new m51(gp2Var, (byte) 25), null, gp2Var.e.b, new fp2(gp2Var, yjeVar, b2), 10);
                }
                gp2Var.h = z7;
                return Unit.f46060a;
        }
    }
}
