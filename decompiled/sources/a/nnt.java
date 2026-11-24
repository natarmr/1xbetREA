package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class nnt implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23839a;
    public final /* synthetic */ ewt b;

    public /* synthetic */ nnt(ewt ewtVar, byte b) {
        this.f23839a = b;
        this.b = ewtVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        lnt lntVar;
        d5v d5vVar;
        byte b = this.f23839a;
        ewt ewtVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof lnt) {
                    lntVar = (lnt) yjeVar;
                    int i = lntVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lntVar.j = i - Integer.MIN_VALUE;
                    } else {
                        lntVar = new lnt(this, yjeVar);
                    }
                } else {
                    lntVar = new lnt(this, yjeVar);
                }
                Object obj = lntVar.i;
                wne wneVar = wne.f39444a;
                int i2 = lntVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    uap uapVar = new uap(kmqVar, (byte) 29);
                    lntVar.j = 1;
                    if (ewtVar.c(uapVar, lntVar) == wneVar) {
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
            default:
                if (yjeVar instanceof d5v) {
                    d5vVar = (d5v) yjeVar;
                    int i3 = d5vVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        d5vVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        d5vVar = new d5v(this, yjeVar);
                    }
                } else {
                    d5vVar = new d5v(this, yjeVar);
                }
                Object obj2 = d5vVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = d5vVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    b4v b4vVar = new b4v(kmqVar, (byte) 2);
                    d5vVar.j = 1;
                    if (ewtVar.c(b4vVar, d5vVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
        }
    }
}
