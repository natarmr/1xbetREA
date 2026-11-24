package a;

import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class z9i implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8i f44020a;

    public z9i(n8i n8iVar) {
        this.f44020a = n8iVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        o3c o3cVar = (o3c) this.f44020a.b;
        LimitTypeEnum limitTypeEnum = (LimitTypeEnum) o3cVar.f24576a;
        xfu xfuVar = new xfu(new ciu(new pzu(new abu((gii0) o3cVar.b, (byte) 25), (dzz) o3cVar.c, (xio) o3cVar.d, (czz) o3cVar.e, (btt0) o3cVar.f, (knf0) o3cVar.g), (byte) 0));
        wsf0 wsf0Var = (wsf0) o3cVar.h;
        return new uf7(vzg0Var, limitTypeEnum, xfuVar, ((g45) wsf0Var.b).E(), ((g45) wsf0Var.b).t(), new f5a(new pzu(new abu((gii0) o3cVar.b, (byte) 25), (dzz) o3cVar.c, (xio) o3cVar.d, (czz) o3cVar.e, (btt0) o3cVar.f, (knf0) o3cVar.g)), (i1w0) o3cVar.i, (duj) o3cVar.j);
    }
}
