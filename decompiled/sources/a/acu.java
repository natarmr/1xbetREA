package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class acu implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gmq f647a;
    public final /* synthetic */ mie0 b;
    public final /* synthetic */ hie0 c;
    public final /* synthetic */ v7i d;
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public acu(gmq gmqVar, mie0 mie0Var, hie0 hie0Var, v7i v7iVar, List list, boolean z, boolean z2, boolean z3) {
        this.f647a = gmqVar;
        this.b = mie0Var;
        this.c = hie0Var;
        this.d = v7iVar;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        xbu xbuVar;
        if (yjeVar instanceof xbu) {
            xbuVar = (xbu) yjeVar;
            int i = xbuVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                xbuVar.j = i - Integer.MIN_VALUE;
            } else {
                xbuVar = new xbu(this, yjeVar);
            }
        } else {
            xbuVar = new xbu(this, yjeVar);
        }
        Object obj = xbuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = xbuVar.j;
        if (i2 == 0) {
            z1x.P(obj);
            zbu zbuVar = new zbu(kmqVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            xbuVar.j = 1;
            if (this.f647a.c(zbuVar, xbuVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
