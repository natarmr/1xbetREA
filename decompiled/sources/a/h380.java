package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class h380 {
    public static final w280 Companion = new w280();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new i280(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12372a;
    public final Integer b;
    public final List c;

    public /* synthetic */ h380(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f12372a = null;
        } else {
            this.f12372a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final List a() {
        ArrayList arrayList = null;
        List list = this.c;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((b380) it.next()).c;
                String strP0 = str != null ? StringsKt.p0(str, Separators.SLASH, str) : null;
                if (strP0 == null) {
                    strP0 = "";
                }
                arrayList2.add(strP0);
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public final List b() {
        ArrayList arrayList;
        List list = this.c;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Long l = ((b380) it.next()).f1891a;
                if (l != null) {
                    arrayList.add(l);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }
}
