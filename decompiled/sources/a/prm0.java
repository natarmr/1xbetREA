package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class prm0 implements vii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qrm0 f27474a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fpt0 d;
    public final /* synthetic */ h55 e;
    public final /* synthetic */ h55 f;

    public /* synthetic */ prm0(qrm0 qrm0Var, String str, String str2, fpt0 fpt0Var, h55 h55Var, h55 h55Var2) {
        this.f27474a = qrm0Var;
        this.b = str;
        this.c = str2;
        this.d = fpt0Var;
        this.e = h55Var;
        this.f = h55Var2;
    }

    @Override // a.vii0
    public final void a(xii0 xii0Var) {
        qrm0 qrm0Var = this.f27474a;
        if (qrm0Var.d() == null) {
            return;
        }
        qrm0Var.G();
        qrm0Var.E(qrm0Var.H(this.b, this.c, this.d, this.e, this.f));
        qrm0Var.r();
        fnu0 fnu0Var = qrm0Var.s;
        fnu0Var.getClass();
        ofm0.m();
        Iterator it = fnu0Var.f9855a.iterator();
        while (it.hasNext()) {
            fnu0Var.l((fot0) it.next());
        }
    }
}
