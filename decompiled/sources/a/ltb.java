package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public class ltb extends ktb {
    public final /* synthetic */ byte d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ltb(Object obj, CoroutineContext coroutineContext, int i, i99 i99Var, byte b) {
        super(coroutineContext, i, i99Var);
        this.d = b;
        this.e = obj;
    }

    @Override // a.ktb
    public Object h(hzb0 hzb0Var, yje yjeVar) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                Object objInvoke = ((Function2) obj).invoke(hzb0Var, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            default:
                mfi0 mfi0Var = new mfi0(hzb0Var);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    qjj.W(hzb0Var, null, null, new jtb((gmq) it.next(), mfi0Var, null, (byte) 2), 3);
                }
                return Unit.f46060a;
        }
    }

    @Override // a.ktb
    public ktb j(CoroutineContext coroutineContext, int i, i99 i99Var) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return new ltb((Function2) obj, coroutineContext, i, i99Var, (byte) 0);
            default:
                return new ltb((Iterable) obj, coroutineContext, i, i99Var, (byte) 1);
        }
    }

    @Override // a.ktb
    public htb l(vne vneVar) {
        switch (this.d) {
            case 1:
                Function2 jtbVar = new jtb(this, null, (byte) 0);
                i99 i99Var = i99.f14377a;
                yne yneVar = yne.f42936a;
                hzb0 hzb0Var = new hzb0(jne.b(vneVar, this.f18855a), vtb.d(this.b, i99Var, null, 4));
                hzb0Var.d0(yneVar, hzb0Var, jtbVar);
                return hzb0Var;
            default:
                return super.l(vneVar);
        }
    }

    @Override // a.ktb
    public String toString() {
        switch (this.d) {
            case 0:
                return "block[" + ((Function2) this.e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
