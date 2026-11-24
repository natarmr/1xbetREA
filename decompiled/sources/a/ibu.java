package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ibu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ien f14507a;

    public /* synthetic */ ibu(ien ienVar) {
        this.f14507a = ienVar;
    }

    public void a(tdn tdnVar, wdn wdnVar) {
        hen henVarA;
        gen genVar = this.f14507a.f14642a;
        genVar.getClass();
        qoj0 qoj0Var = genVar.b;
        hen henVarK0 = ebc.k0(qoj0Var);
        int iOrdinal = wdnVar.ordinal();
        if (iOrdinal == 0) {
            henVarA = hen.a(henVarK0, CollectionsKt.m0(henVarK0.f12930a, tdnVar), null, 2);
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            henVarA = hen.a(henVarK0, null, CollectionsKt.m0(henVarK0.b, tdnVar), 1);
        }
        qoj0Var.g(henVarA);
    }
}
