package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class up70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashMap f36049a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, zje zjeVar) {
        tp70 tp70Var;
        if (zjeVar instanceof tp70) {
            tp70Var = (tp70) zjeVar;
            int i = tp70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                tp70Var.k = i - Integer.MIN_VALUE;
            } else {
                tp70Var = new tp70(this, zjeVar);
            }
        } else {
            tp70Var = new tp70(this, zjeVar);
        }
        Object objAwait = tp70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = tp70Var.k;
        if (i2 == 0) {
            z1x.P(objAwait);
            jzj jzjVar = (jzj) this.f36049a.get(str);
            if (jzjVar != null) {
                tp70Var.k = 1;
                objAwait = jzjVar.await(tp70Var);
                if (objAwait == wneVar) {
                    return wneVar;
                }
            } else {
                objAwait = null;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objAwait);
        }
        if (objAwait != null) {
            return objAwait;
        }
        jf4.n("No ongoing request found");
        return null;
    }

    public final void b(String str) {
        jzj jzjVar;
        LinkedHashMap linkedHashMap = this.f36049a;
        jzj jzjVar2 = (jzj) linkedHashMap.get(str);
        if (jzjVar2 != null && jzjVar2.isActive() && (jzjVar = (jzj) linkedHashMap.get(str)) != null) {
            jzjVar.cancel(null);
        }
        linkedHashMap.put(str, null);
    }

    public final boolean c(String str) {
        jzj jzjVar;
        jzj jzjVar2;
        LinkedHashMap linkedHashMap = this.f36049a;
        jzj jzjVar3 = (jzj) linkedHashMap.get(str);
        return (jzjVar3 != null && jzjVar3.isActive()) || ((jzjVar = (jzj) linkedHashMap.get(str)) != null && jzjVar.isCompleted()) || ((jzjVar2 = (jzj) linkedHashMap.get(str)) != null && jzjVar2.isCancelled());
    }
}
