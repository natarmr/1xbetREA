package a;

import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class jwu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfm0 f17272a;

    public jwu(nfm0 nfm0Var, byte b) {
        switch (b) {
            case 1:
                nfm0Var.getClass();
                this.f17272a = nfm0Var;
                break;
            case 2:
                this.f17272a = nfm0Var;
                break;
            default:
                nfm0Var.getClass();
                this.f17272a = nfm0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(xqj0 xqj0Var, zje zjeVar) {
        iwu iwuVar;
        Object next;
        if (zjeVar instanceof iwu) {
            iwuVar = (iwu) zjeVar;
            int i = iwuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwuVar.l = i - Integer.MIN_VALUE;
            } else {
                iwuVar = new iwu(this, zjeVar);
            }
        } else {
            iwuVar = new iwu(this, zjeVar);
        }
        Object objD0 = iwuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = iwuVar.l;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                nfm0 nfm0Var = this.f17272a;
                tcm0[] tcm0VarArr = tcm0.f33725a;
                iwuVar.i = xqj0Var;
                iwuVar.l = 1;
                objD0 = qjj.d0(nfm0Var.f23445a.b, new z8b0(nfm0Var, null), iwuVar);
                if (objD0 == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xqj0Var = iwuVar.i;
                z1x.P(objD0);
            }
            Iterator it = ((Iterable) objD0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int i3 = ((khm0) next).f18301a;
                if (i3 == xqj0Var.d && i3 != 0) {
                    break;
                }
            }
            khm0 khm0Var = (khm0) next;
            String str = khm0Var != null ? khm0Var.b : null;
            return str == null ? "" : str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public Object b(String str, yje yjeVar) throws Throwable {
        Object objB = this.f17272a.b(str, true, yjeVar);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }
}
