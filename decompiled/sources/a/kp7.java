package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kp7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18664a;
    public final /* synthetic */ mp7 b;

    public /* synthetic */ kp7(mp7 mp7Var, byte b) {
        this.f18664a = b;
        this.b = mp7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18664a;
        mp7 mp7Var = this.b;
        switch (b) {
            case 0:
                zz2 zz2Var = mp7Var.P1;
                phf0 phf0Var = mp7Var.O1;
                bj5 bj5Var = mp7.S1;
                ComponentCallbacks2 application = mp7Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(np7.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof np7)) {
                        ze3Var = null;
                    }
                    np7 np7Var = (np7) ze3Var;
                    if (np7Var != null) {
                        i1w0 i1w0VarF = a4n0.f(mp7Var);
                        iiy[] iiyVarArr = mp7.U1;
                        fvt0 fvt0Var = new fvt0(new sbx0(phf0Var.n(mp7Var, iiyVarArr[2]), zz2Var.n(mp7Var, iiyVarArr[3]).intValue(), mp7Var.Q1.n(mp7Var, iiyVarArr[4]), mp7Var.N1.n(mp7Var, iiyVarArr[1])));
                        String strN = phf0Var.n(mp7Var, iiyVarArr[2]);
                        zz2Var.n(mp7Var, iiyVarArr[3]);
                        strN.getClass();
                        kj5 kj5Var = new kj5();
                        i1w0VarF.getClass();
                        zri zriVar = np7Var.e;
                        oeg0 oeg0Var = np7Var.f23898a;
                        m1e m1eVar = np7Var.d;
                        atz atzVar = np7Var.b;
                        gle0 gle0Var = np7Var.c;
                        qv2 qv2Var = np7Var.f;
                        duj dujVar = np7Var.g;
                        cad cadVar = np7Var.h;
                        roi0 roi0Var = np7Var.i;
                        wdk0 wdk0Var = np7Var.j;
                        bzt bztVar = np7Var.l;
                        pmi pmiVar = np7Var.k;
                        pru pruVar = np7Var.m;
                        h3c h3cVar = np7Var.n;
                        r9u r9uVar = np7Var.o;
                        oeg0Var.getClass();
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        r9uVar.getClass();
                        return new bai(kj5Var, fvt0Var, cadVar, roi0Var, atzVar, gle0Var, oeg0Var, m1eVar, zriVar, dujVar, qv2Var, i1w0VarF, wdk0Var, pmiVar, bztVar, pruVar, h3cVar, r9uVar);
                    }
                }
                jf4.n(b1j.i(np7.class, "Cannot create dependency "));
                return null;
            case 1:
                bj5 bj5Var2 = mp7.S1;
                return new fiu0(Collections.singletonMap(hq7.class, ((bai) mp7Var.L1.getValue()).s));
            case 2:
                bj5 bj5Var3 = mp7.S1;
                mp7Var.G0().x(ap7.f1237a);
                return Unit.f46060a;
            default:
                bj5 bj5Var4 = mp7.S1;
                mp7Var.G0().x(yo7.f42971a);
                return Unit.f46060a;
        }
    }
}
