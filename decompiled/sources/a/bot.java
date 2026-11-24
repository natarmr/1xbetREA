package a;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqe f2951a;

    public /* synthetic */ bot(uqe uqeVar) {
        this.f2951a = uqeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(String str, zje zjeVar) throws g2 {
        geu geuVar;
        if (zjeVar instanceof geu) {
            geuVar = (geu) zjeVar;
            int i = geuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                geuVar.l = i - Integer.MIN_VALUE;
            } else {
                geuVar = new geu(this, zjeVar);
            }
        } else {
            geuVar = new geu(this, zjeVar);
        }
        Object objD = geuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = geuVar.l;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objD);
            geuVar.i = str;
            geuVar.l = 1;
            objD = this.f2951a.d(geuVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = geuVar.i;
            z1x.P(objD);
        }
        for (Object obj2 : (Iterable) objD) {
            if (Intrinsics.d(((qkt) obj2).c, str)) {
                obj = obj2;
                break;
            }
        }
        qkt qktVar = (qkt) obj;
        if (qktVar != null) {
            return qktVar;
        }
        throw new g2((byte) 10);
    }
}
