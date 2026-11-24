package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oop implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25605a;
    public final /* synthetic */ rop b;

    public /* synthetic */ oop(rop ropVar, byte b) {
        this.f25605a = b;
        this.b = ropVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        j700 j700VarValueOf;
        byte b = this.f25605a;
        rop ropVar = this.b;
        switch (b) {
            case 0:
                nek nekVar = rop.a2;
                ComponentCallbacks2 application = ropVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(onp.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof onp)) {
                        ze3Var = null;
                    }
                    onp onpVar = (onp) ze3Var;
                    if (onpVar != null) {
                        ComponentCallbacks2 application2 = ropVar.n0().getApplication();
                        application2.getClass();
                        i1w0 i1w0VarF = a4n0.f(ropVar);
                        yzn0 yzn0Var = ropVar.O1;
                        iiy[] iiyVarArr = rop.b2;
                        f9h0 f9h0Var = (f9h0) yzn0Var.n(ropVar, iiyVarArr[2]);
                        String strL0 = ropVar.L0();
                        long[] jArrN = ropVar.Q1.n(ropVar, iiyVarArr[4]);
                        bj5 bj5Var = ropVar.N1;
                        int i = 1;
                        iiy iiyVar = iiyVarArr[1];
                        bj5Var.getClass();
                        iiyVar.getClass();
                        Bundle bundle = ropVar.g;
                        if (bundle == null || (string = bundle.getString("SCREEN_TYPE_KEY")) == null || (j700VarValueOf = j700.valueOf(string)) == null) {
                            throw new ss3();
                        }
                        i1w0VarF.getClass();
                        strL0.getClass();
                        LinkedHashMap linkedHashMap = whp.f39175a;
                        Object xhpVar = linkedHashMap.get(strL0);
                        if (xhpVar == null) {
                            Set setB = cui0.b(f9h0Var.getClass().getSimpleName());
                            af3 af3Var2 = application2 instanceof af3 ? (af3) application2 : null;
                            if (af3Var2 != null) {
                                o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(fkp.class);
                                ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                                if (!(ze3Var2 instanceof fkp)) {
                                    ze3Var2 = null;
                                }
                                if (((fkp) ze3Var2) != null) {
                                    xex xexVar = new xex();
                                    byte b2 = 23;
                                    xexVar.f40764a = mbl.b(new f7i(xexVar, i, b2));
                                    xexVar.b = mbl.b(new f7i(xexVar, 0, b2));
                                    xhpVar = new xhp(setB, xexVar);
                                }
                            }
                            jf4.n(b1j.i(fkp.class, "Cannot create dependency "));
                            return null;
                        }
                        xhp xhpVar2 = (xhp) xhpVar;
                        xex xexVar2 = xhpVar2.b;
                        linkedHashMap.put(strL0, new xhp(eui0.h(xhpVar2.f40905a, f9h0Var.getClass().getSimpleName()), xexVar2));
                        hkp hkpVar = (hkp) ((n5d0) xexVar2.b).get();
                        iip iipVar = onpVar.f25558a;
                        zr1 zr1Var = onpVar.h;
                        yo4 yo4Var = onpVar.i;
                        ctf0 ctf0Var = onpVar.d;
                        mne mneVar = onpVar.c;
                        iw20 iw20Var = onpVar.e;
                        m1e m1eVar = onpVar.j;
                        wdk0 wdk0Var = onpVar.k;
                        m8l0 m8l0Var = onpVar.f;
                        r9u r9uVar = onpVar.g;
                        kt2 kt2Var = onpVar.l;
                        cyu cyuVar = onpVar.m;
                        n5r0 n5r0Var = onpVar.b;
                        iipVar.getClass();
                        n5r0Var.getClass();
                        hkpVar.getClass();
                        ctf0Var.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        m8l0Var.getClass();
                        r9uVar.getClass();
                        kt2Var.getClass();
                        return new zgi(iw20Var, iipVar, n5r0Var, zr1Var, strL0, j700VarValueOf, i1w0VarF, hkpVar, ctf0Var, m1eVar, wdk0Var, mneVar, f9h0Var, jArrN, yo4Var, kt2Var, cyuVar);
                    }
                }
                jf4.n(b1j.i(onp.class, "Cannot create dependency "));
                return null;
            case 1:
                nek nekVar2 = rop.a2;
                return new q0h0((ygi) ropVar.M0().r.get());
            default:
                nek nekVar3 = rop.a2;
                ropVar.K0();
                return Unit.f46060a;
        }
    }
}
