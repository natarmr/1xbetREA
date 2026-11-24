package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ce0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4190a;
    public final /* synthetic */ bzt b;

    public /* synthetic */ ce0(bzt bztVar, byte b) {
        this.f4190a = b;
        this.b = bztVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object aq7Var;
        wui0 wui0Var;
        byte b = this.f4190a;
        bzt bztVar = this.b;
        switch (b) {
            case 0:
                wd0 wd0Var = (wd0) obj;
                wd0Var.getClass();
                return new be0(bztVar.f3488a.a().r, wd0Var);
            case 1:
                hz0 hz0Var = (hz0) obj;
                hz0Var.getClass();
                return new ho1(bztVar.f3488a.a().r, hz0Var);
            case 2:
                zp7 zp7Var = (zp7) obj;
                zp7Var.getClass();
                v5l0 v5l0Var = zp7Var.i;
                int i = bztVar.f3488a.a().r;
                if (zp7Var.c) {
                    String str = zp7Var.e;
                    String str2 = zp7Var.f;
                    boolean z = zp7Var.d;
                    int i2 = zp7Var.g;
                    String str3 = zp7Var.h;
                    xuz xuzVar = pb10.c;
                    pb10 pb10Var = pb10.g;
                    xuzVar.getClass();
                    mdm mdmVar = new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                    da10 da10Var = da10.DEFAULT_ERROR;
                    return new cq7(str, str2, i2, str3, z, mdmVar);
                }
                if (zp7Var.b) {
                    aq7Var = new dq7(zp7Var.e, zp7Var.f, zp7Var.g, zp7Var.h, zp7Var.d, v5l0Var);
                } else {
                    boolean zIsEmpty = zp7Var.f44745a.isEmpty();
                    String str4 = zp7Var.e;
                    String str5 = zp7Var.f;
                    boolean z2 = zp7Var.d;
                    int i3 = zp7Var.g;
                    if (zIsEmpty) {
                        String str6 = zp7Var.h;
                        xuz xuzVar2 = pb10.c;
                        pb10 pb10Var2 = pb10.g;
                        xuzVar2.getClass();
                        return new bq7(str4, str5, i3, str6, z2, new mdm(xuz.a(pb10Var2, i), null, null, 0, 0, R.string.bet_without_risk_no_events, 0, R.string.bet_without_risk_to_line, 0L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    }
                    aq7Var = new aq7(str4, str5, i3, zp7Var.h, z2, zp7Var.f44745a, v5l0Var, zp7Var.j);
                }
                return aq7Var;
            default:
                erz erzVar = (erz) obj;
                erzVar.getClass();
                int i4 = bztVar.f3488a.a().r;
                List list = erzVar.f8304a;
                d7i0 d7i0Var = erzVar.b;
                List listA0 = CollectionsKt.A0(list, new wpv((byte) 11));
                ArrayList arrayList = new ArrayList(r3d.q(listA0, 10));
                Iterator it = listA0.iterator();
                int i5 = 0;
                while (true) {
                    boolean z3 = true;
                    if (!it.hasNext()) {
                        a4x a4xVarO0 = dyb.o0(arrayList);
                        boolean z4 = d7i0Var != null;
                        boolean z5 = erzVar.c;
                        boolean z6 = erzVar.d;
                        xuz xuzVar3 = pb10.c;
                        pb10 pb10Var3 = pb10.g;
                        xuzVar3.getClass();
                        return new frz(a4xVarO0, z4, z5, z6, new mdm(xuz.a(pb10Var3, i4), null, null, 0, 0, R.string.data_retrieval_error, 0, 0, 0L, 0L, 990));
                    }
                    Object next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        q3d.p();
                        throw null;
                    }
                    d7i0 d7i0Var2 = (d7i0) next;
                    int i7 = d7i0Var2.f5595a;
                    String str7 = d7i0Var2.b;
                    if (list.size() == 1) {
                        wui0Var = wui0.f39793a;
                    } else if (i5 == 0) {
                        wui0Var = wui0.b;
                    } else {
                        wui0Var = i5 == list.size() - 1 ? wui0.d : wui0.c;
                    }
                    if (d7i0Var == null || !d7i0Var.equals(d7i0Var2)) {
                        z3 = false;
                    }
                    arrayList.add(new m85(i7, str7, wui0Var, z3));
                    i5 = i6;
                }
                break;
        }
    }
}
