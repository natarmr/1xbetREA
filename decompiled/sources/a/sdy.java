package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class sdy extends zzf0 implements xdr {
    public boolean j;
    public /* synthetic */ jrj k;
    public final /* synthetic */ u3u0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdy(u3u0 u3u0Var, yje yjeVar) {
        super(3, yjeVar);
        this.l = u3u0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        sdy sdyVar = new sdy(this.l, (yje) obj3);
        sdyVar.k = (jrj) obj;
        return sdyVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        u3u0 u3u0Var = this.l;
        fp fpVar = (fp) u3u0Var.c;
        jrj jrjVar = this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            byte bF = fpVar.F();
            if (bF == 1) {
                return u3u0Var.k(true);
            }
            if (bF == 0) {
                return u3u0Var.k(false);
            }
            if (bF != 6) {
                if (bF == 8) {
                    return u3u0Var.h();
                }
                fp.t(fpVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.k = null;
            this.j = true;
            obj = u3u0Var.i(jrjVar, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return (mcy) obj;
    }
}
