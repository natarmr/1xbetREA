package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ge2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11129a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ y78 c;

    public /* synthetic */ ge2(ctf0 ctf0Var, y78 y78Var, byte b) {
        this.f11129a = b;
        this.b = ctf0Var;
        this.c = y78Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l0l0 l0l0Var;
        cef0 cef0Var;
        bef0 bef0Var;
        boolean z;
        Object next;
        m5l0 m5l0Var;
        ge2 ge2Var = this;
        byte b = ge2Var.f11129a;
        y78 y78Var = ge2Var.c;
        ctf0 ctf0Var = ge2Var.b;
        switch (b) {
            case 0:
                ce2 ce2Var = (ce2) obj;
                ce2Var.getClass();
                return new ee2(ctf0Var, y78Var, ce2Var);
            case 1:
                aef0 aef0Var = (aef0) obj;
                aef0Var.getClass();
                v5l0 v5l0Var = aef0Var.d;
                List list = aef0Var.f725a;
                ctf0Var.getClass();
                boolean zJ = ctf0Var.j();
                int i = zJ ? 2 : 1;
                int i2 = aef0Var.e;
                boolean z2 = aef0Var.k;
                wcb wcbVar = aef0Var.i;
                if (list.isEmpty() || wcbVar == null) {
                    int i3 = i;
                    if (aef0Var.c) {
                        xuz xuzVar = pb10.c;
                        pb10 pb10Var = pb10.g;
                        xuzVar.getClass();
                        cef0Var = new cef0(new mdm(xuz.a(pb10Var, i2), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    } else {
                        if (aef0Var.b || wcbVar == null) {
                            int i4 = zJ ? 12 : 6;
                            ArrayList arrayList = new ArrayList(i4);
                            for (int i5 = 0; i5 < i4; i5++) {
                                int iOrdinal = v5l0Var.ordinal();
                                if (iOrdinal == 0) {
                                    l0l0Var = g0l0.f10465a;
                                } else if (iOrdinal == 1) {
                                    l0l0Var = k0l0.f17474a;
                                } else if (iOrdinal == 2) {
                                    l0l0Var = j0l0.f15687a;
                                } else if (iOrdinal == 3) {
                                    l0l0Var = i0l0.f13953a;
                                } else {
                                    if (iOrdinal != 4) {
                                        t9f.b();
                                        return null;
                                    }
                                    l0l0Var = h0l0.f12241a;
                                }
                                arrayList.add(new x56(l0l0Var));
                            }
                            return new bef0(dyb.o0(arrayList), i3, z2);
                        }
                        xuz xuzVar2 = pb10.c;
                        pb10 pb10Var2 = pb10.g;
                        xuzVar2.getClass();
                        cef0Var = new cef0(new mdm(xuz.a(pb10Var2, i2), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    }
                    return cef0Var;
                }
                List list2 = aef0Var.h;
                int i6 = i;
                boolean z3 = aef0Var.f;
                int i7 = i6;
                boolean z4 = aef0Var.g;
                boolean z5 = aef0Var.k;
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    d0t d0tVar = (d0t) it.next();
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            z = z5;
                            if (((lok0) next).f20396a != d0tVar.O) {
                                z5 = z;
                            }
                        } else {
                            z = z5;
                            next = null;
                        }
                    }
                    lok0 lok0Var = (lok0) next;
                    Iterator it3 = it;
                    bef0 bef0Var2 = bef0Var;
                    boolean z6 = z4;
                    boolean z7 = z3;
                    String strA = wcbVar.a(d0tVar.v, d0tVar.u);
                    wcb wcbVar2 = wcbVar;
                    ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(Integer.valueOf(((lok0) it4.next()).f20396a));
                    }
                    boolean z8 = lok0Var != null ? lok0Var.n : false;
                    boolean z9 = lok0Var != null ? lok0Var.p : false;
                    if (d0tVar.K.isEmpty()) {
                        List list3 = d0tVar.k;
                        if (list3 == null || !list3.isEmpty()) {
                            Iterator it5 = list3.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    Iterator it6 = it5;
                                    if (((d0t) it5.next()).K.isEmpty()) {
                                        it5 = it6;
                                    } else {
                                        m5l0Var = l5l0.f19463a;
                                    }
                                }
                            }
                        }
                        m5l0Var = i5l0.f14197a;
                    } else {
                        m5l0Var = l5l0.f19463a;
                    }
                    String str = lok0Var != null ? lok0Var.u : null;
                    if (str == null) {
                        str = "";
                    }
                    boolean z10 = z9;
                    z3 = z7;
                    ArrayList arrayList4 = arrayList2;
                    boolean z11 = z8;
                    z4 = z6;
                    arrayList4.add(wwb.V(d0tVar, ctf0Var, ge2Var.c, z4, z3, strA, false, arrayList3, z11, z10, true, v5l0Var, m5l0Var, str, z));
                    arrayList2 = arrayList4;
                    z2 = z2;
                    i7 = i7;
                    z5 = z;
                    it = it3;
                    bef0Var = bef0Var2;
                    list2 = list2;
                    wcbVar = wcbVar2;
                    ge2Var = this;
                }
                return new bef0(dyb.o0(arrayList2), i7, z2);
            case 2:
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                dhh0 dhh0Var = (dhh0) a8k0.H(vzg0Var, "SAVED_STATE_SHOW_TYPE", dhh0.d);
                bnf0 bnf0Var = bnf0.f2882a;
                phh0 phh0Var = phh0.f26997a;
                return new hpl0(false, false, "", "", false, bnf0Var, dhh0Var, phh0Var, phh0Var, ge2Var.b, ge2Var.c, null, null, null, null, null, null, false);
            default:
                ser0 ser0Var = (ser0) obj;
                ser0Var.getClass();
                return new zer0(ser0Var, ctf0Var, y78Var);
        }
    }
}
