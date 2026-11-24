package a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dsj implements sg00, rbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f6613a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dsj(ft2 ft2Var, int i, long j, long j2) {
        this.c = ft2Var;
        this.b = i;
        this.f6613a = j;
    }

    @Override // a.rbe
    public void accept(Object obj) {
        mfn0 mfn0Var = (mfn0) this.c;
        ftf ftfVar = (ftf) obj;
        mfn0Var.h.getClass();
        b4x b4xVar = ftfVar.f10109a;
        long j = ftfVar.c;
        sd9 sd9Var = new sd9((byte) 2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(b4xVar.size());
        Iterator<E> it = b4xVar.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) sd9Var.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        fq80 fq80Var = mfn0Var.c;
        fq80Var.K(bArrMarshall, bArrMarshall.length);
        mfn0Var.f21701a.a(bArrMarshall.length, fq80Var);
        long j2 = ftfVar.b;
        androidx.media3.common.b bVar = mfn0Var.h;
        long j3 = this.f6613a;
        if (j2 == -9223372036854775807L) {
            x0x.K(bVar.u == Long.MAX_VALUE);
        } else {
            long j4 = bVar.u;
            j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
        }
        mfn0Var.f21701a.b(j3, this.b | 1, bArrMarshall.length, 0, null);
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        ft2 ft2Var = (ft2) this.c;
        kn30 kn30Var = (kn30) ((gt2) obj);
        HashMap map = kn30Var.h;
        HashMap map2 = kn30Var.i;
        vn30 vn30Var = ft2Var.d;
        if (vn30Var != null) {
            String strC = kn30Var.c.c(ft2Var.b, vn30Var);
            Long l = (Long) map2.get(strC);
            Long l2 = (Long) map.get(strC);
            map2.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + this.f6613a));
            map.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) this.b)));
        }
    }

    public /* synthetic */ dsj(mfn0 mfn0Var, long j, int i) {
        this.c = mfn0Var;
        this.f6613a = j;
        this.b = i;
    }
}
