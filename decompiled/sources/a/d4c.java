package a;

/* JADX INFO: loaded from: classes5.dex */
public final class d4c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7v f5447a;

    public d4c(r7v r7vVar) {
        this.f5447a = r7vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar, String str) throws t3c {
        c4c c4cVar;
        if (zjeVar instanceof c4c) {
            c4cVar = (c4c) zjeVar;
            int i = c4cVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4cVar.k = i - Integer.MIN_VALUE;
            } else {
                c4cVar = new c4c(this, zjeVar);
            }
        } else {
            c4cVar = new c4c(this, zjeVar);
        }
        Object objA = c4cVar.i;
        wne wneVar = wne.f39444a;
        int i2 = c4cVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            c4cVar.k = 1;
            objA = ((p3c) ((sza) this.f5447a.f29996a).invoke()).a(new l4c(new s3c(j, str)), c4cVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        q16 q16Var = (q16) objA;
        kuw kuwVar = q16Var.c;
        if (kuwVar == i2o.SimplePasswordError || kuwVar == i2o.RepeatCharsInPasswordError || kuwVar == i2o.CommonPasswordError || kuwVar == i2o.UnacceptableSymbolsPasswordError || kuwVar == i2o.UsedBeforePasswordError) {
            throw new t3c(q16Var.f27936a);
        }
        return q16Var.a();
    }
}
