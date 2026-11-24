package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class imi0 extends w46 {
    public final i1w0 b;
    public final art c;
    public final yfu d;
    public final f5a e;
    public final ctf0 f;
    public nki0 g;
    public nki0 h;
    public final ArrayList i;
    public final ra10 j;
    public final ra10 k;
    public final p7m0 l;
    public final p7m0 m;
    public final ol60 n;

    public imi0(i1w0 i1w0Var, art artVar, yfu yfuVar, f5a f5aVar, ctf0 ctf0Var, sa10 sa10Var) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.b = i1w0Var;
        this.c = artVar;
        this.d = yfuVar;
        this.e = f5aVar;
        this.f = ctf0Var;
        nki0 nki0Var = nki0.UNKNOWN;
        this.g = nki0Var;
        this.h = nki0Var;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        pb10 pb10Var = pb10.g;
        this.j = sa10.b(sa10Var, pb10Var, R.string.data_is_missing, R.string.refresh_data, new lph0(0, this, imi0.class, "initCurrentLimit", "initCurrentLimit()V", 0, (byte) 4), 16);
        this.k = sa10.b(sa10Var, pb10Var, R.string.data_retrieval_error, R.string.refresh_data, new lph0(0, this, imi0.class, "initCurrentLimit", "initCurrentLimit()V", 0, (byte) 5), 16);
        this.l = q7m0.a(gmi0.f11545a);
        this.m = q7m0.a(new zli0(CollectionsKt.L0(arrayList), false));
        this.n = new ol60(1, i99.b);
        x();
    }

    public final void w() {
        p7m0 p7m0Var;
        Object value;
        p7m0 p7m0Var2;
        Object value2;
        List listL0;
        boolean z;
        String strF;
        ArrayList arrayList = this.i;
        arrayList.removeAll(arrayList);
        this.c.getClass();
        List<nki0> listJ = q3d.j(nki0.HOUR_1, nki0.HOUR_2, nki0.HOUR_3, nki0.HOUR_4, nki0.HOUR_5, nki0.HOUR_6, nki0.HOUR_7, nki0.HOUR_8, nki0.HOUR_9, nki0.HOUR_10, nki0.HOUR_11, nki0.HOUR_12, nki0.HOUR_13, nki0.HOUR_14, nki0.HOUR_15, nki0.HOUR_16, nki0.HOUR_17, nki0.HOUR_18, nki0.HOUR_19, nki0.HOUR_20, nki0.HOUR_21, nki0.HOUR_22, nki0.HOUR_23, nki0.UNLIMITED);
        ArrayList arrayList2 = new ArrayList(r3d.q(listJ, 10));
        for (nki0 nki0Var : listJ) {
            boolean z2 = this.g == nki0Var;
            nki0Var.getClass();
            ctf0 ctf0Var = this.f;
            ctf0Var.getClass();
            int[] iArr = rki0.f30651a;
            int iOrdinal = nki0Var.ordinal();
            int i = nki0Var.f23683a;
            int i2 = iArr[iOrdinal];
            if (i2 == 1 || i2 == 2) {
                strF = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i));
            } else if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) {
                strF = ctf0Var.f(R.string.limit_second_hour_declination_v2, Integer.valueOf(i));
            } else {
                strF = (nki0Var.compareTo(nki0.HOUR_20) > 0 || nki0Var.compareTo(nki0.HOUR_5) < 0) ? ctf0Var.f(R.string.filter_no_limits, new Object[0]) : ctf0Var.f(R.string.limit_third_hour_declination_v2, Integer.valueOf(i));
            }
            arrayList2.add(new qki0(nki0Var, strF, z2));
        }
        arrayList.addAll(arrayList2);
        do {
            p7m0Var = this.l;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, !arrayList.isEmpty() ? emi0.f8048a : new fmi0(this.j)));
        do {
            p7m0Var2 = this.m;
            value2 = p7m0Var2.getValue();
            listL0 = CollectionsKt.L0(arrayList);
            z = ((zli0) value2).b;
            listL0.getClass();
        } while (!p7m0Var2.m(value2, new zli0(listL0, z)));
    }

    public final void x() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.l;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, gmi0.f11545a));
        sac.V(jiu0.a(this), new yli0(this, (byte) 0), null, null, new r7i0(this, null), 14);
    }

    public final void y(dmi0 dmi0Var) {
        sac.V(jiu0.a(this), new eoh0((byte) 28), null, null, new bai0(this, dmi0Var, null, (byte) 6), 14);
    }
}
