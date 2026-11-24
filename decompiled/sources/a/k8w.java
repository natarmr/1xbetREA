package a;

import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class k8w extends i3t0 {
    public final HistoryTypeModel o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8w(HistoryTypeModel historyTypeModel, ql5 ql5Var, f8w f8wVar, mne mneVar, bst bstVar, pru pruVar, ctf0 ctf0Var) {
        Object value;
        String str;
        f8w f8wVar2;
        HistoryTypeModel historyTypeModel2;
        boolean z;
        super(null, new g8l(pruVar, f8wVar, historyTypeModel, (byte) 15), new bcn(ctf0Var, (byte) 22), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = historyTypeModel;
        i4 i4VarD = bst.d(ql5Var, pruVar.a());
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            z7w z7wVar = (z7w) value;
            this.f.getClass();
            str = z7wVar.b;
            f8wVar2 = z7wVar.c;
            historyTypeModel2 = z7wVar.d;
            z = z7wVar.e;
            i4VarD.getClass();
        } while (!p7m0Var.m(value, new z7w(i4VarD, str, f8wVar2, historyTypeModel2, z)));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        HistoryTypeModel historyTypeModel;
        u7w u7wVar = (u7w) obj;
        u7wVar.getClass();
        super.x(u7wVar);
        boolean z = u7wVar instanceof t7w;
        if (z && (historyTypeModel = ((t7w) u7wVar).f33486a) != this.o) {
            G(new v7w(historyTypeModel));
        } else if (z) {
            G(w7w.f38693a);
        } else if (u7wVar.equals(s7w.f31771a)) {
            G(x7w.f40434a);
        }
    }
}
