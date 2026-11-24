package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class bwt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final edu f3343a;
    public final rpt b;
    public final iqi c;
    public final xfu d;

    public bwt(edu eduVar, rpt rptVar, iqi iqiVar, xfu xfuVar) {
        this.f3343a = eduVar;
        this.b = rptVar;
        this.c = iqiVar;
        this.d = xfuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        awt awtVar;
        String str;
        String str2;
        if (zjeVar instanceof awt) {
            awtVar = (awt) zjeVar;
            int i = awtVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                awtVar.l = i - Integer.MIN_VALUE;
            } else {
                awtVar = new awt(this, zjeVar);
            }
        } else {
            awtVar = new awt(this, zjeVar);
        }
        Object obj = awtVar.j;
        wne wneVar = wne.f39444a;
        int i2 = awtVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            int iOrdinal = ((xr) this.b.f30901a).i().ordinal();
            if (iOrdinal == 0) {
                str = "fc04feb281830e4d648e07a68178fa28";
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                str = "10f491f14fd4a6d13ac039bb907f0a44";
            }
            awtVar.i = str;
            awtVar.l = 1;
            Serializable serializableI = this.f3343a.i("", awtVar);
            if (serializableI == wneVar) {
                return wneVar;
            }
            str2 = str;
            obj = serializableI;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = awtVar.i;
            z1x.P(obj);
        }
        CharSequence charSequenceC = (CharSequence) obj;
        if (charSequenceC.length() == 0) {
            charSequenceC = ((vwb0) ((iw20) ((nvu) this.d.f40810a).d).f15470a).c("push_token", "");
        }
        return new q6a((String) charSequenceC, str2, this.c.j());
    }
}
