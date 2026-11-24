package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q6p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28210a;
    public final /* synthetic */ s6p b;

    public /* synthetic */ q6p(s6p s6pVar, byte b) {
        this.f28210a = b;
        this.b = s6pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28210a;
        s6p s6pVar = this.b;
        switch (b) {
            case 0:
                pek pekVar = s6p.o2;
                ComponentCallbacks2 application = s6pVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(iqc.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof iqc)) {
                        ze3Var = null;
                    }
                    iqc iqcVar = (iqc) ze3Var;
                    if (iqcVar != null) {
                        wep wepVar = (wep) s6pVar.l2.n(s6pVar, s6p.p2[1]);
                        wdd0 wdd0Var = iqcVar.c;
                        ctf0 ctf0Var = iqcVar.f15204a;
                        wdk0 wdk0Var = iqcVar.b;
                        t6p t6pVar = iqcVar.h;
                        mne mneVar = iqcVar.d;
                        abp abpVar = iqcVar.e;
                        btt0 btt0Var = iqcVar.f;
                        gii0 gii0Var = iqcVar.g;
                        wdd0Var.getClass();
                        t6pVar.getClass();
                        ctf0Var.getClass();
                        abpVar.getClass();
                        btt0Var.getClass();
                        gii0Var.getClass();
                        wdk0Var.getClass();
                        return new qci(wepVar, t6pVar, ctf0Var, mneVar, wdk0Var);
                    }
                }
                jf4.n(b1j.i(iqc.class, "Cannot create dependency "));
                return null;
            case 1:
                pek pekVar2 = s6p.o2;
                return new fiu0(Collections.singletonMap(h7p.class, ((qci) s6pVar.m2.getValue()).e));
            default:
                pek pekVar3 = s6p.o2;
                ((h7p) s6pVar.n2.getValue()).x(m6p.f21283a);
                return Unit.f46060a;
        }
    }
}
