package a;

import android.net.Uri;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class huj implements iuo {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final iqi f = new iqi(new csj((byte) 24));
    public static final iqi g = new iqi(new csj((byte) 25));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rcf0 f13683a;
    public kwd b = new kwd();
    public boolean c;
    public boolean d;

    public final void a(int i, ArrayList arrayList) {
        int i2 = 0;
        switch (i) {
            case 0:
                arrayList.add(new f6());
                break;
            case 1:
                arrayList.add(new h6());
                break;
            case 2:
                arrayList.add(new y20(0));
                break;
            case 3:
                arrayList.add(new qp2());
                break;
            case 4:
                fuo fuoVarB = f.b(0);
                if (fuoVarB == null) {
                    arrayList.add(new yiq());
                } else {
                    arrayList.add(fuoVarB);
                }
                break;
            case 5:
                arrayList.add(new gpq());
                break;
            case 6:
                arrayList.add(new cj30(this.b, 0));
                break;
            case 7:
                arrayList.add(new av40(0));
                break;
            case 8:
                kwd kwdVar = this.b;
                v3x v3xVar = b4x.b;
                arrayList.add(new x6r(kwdVar, 704, null, rcf0.e));
                arrayList.add(new iv40(this.b, 160));
                break;
            case 9:
                arrayList.add(new bf60());
                break;
            case 10:
                arrayList.add(new n7d0());
                break;
            case 11:
                if (this.f13683a == null) {
                    v3x v3xVar2 = b4x.b;
                    this.f13683a = rcf0.e;
                }
                arrayList.add(new xrs0(1, 0, this.b, new coq0(0L), new tyj(i2, this.f13683a)));
                break;
            case 12:
                arrayList.add(new a1v0());
                break;
            case 14:
                arrayList.add(new xuv(this.c ? 1 : 0, (byte) 1));
                break;
            case 15:
                fuo fuoVarB2 = g.b(new Object[0]);
                if (fuoVarB2 != null) {
                    arrayList.add(fuoVarB2);
                }
                break;
            case 16:
                arrayList.add(new da5(0, this.b));
                break;
            case 17:
                arrayList.add(new ab8((byte) 1));
                break;
            case 18:
                arrayList.add(new ga5((byte) 1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                arrayList.add(new ab8((byte) 0));
                break;
            case 20:
                arrayList.add(new xuv(this.d ? 1 : 0, (byte) 0));
                break;
            case 21:
                arrayList.add(new ga5((byte) 0));
                break;
        }
    }

    @Override // a.iuo
    public final synchronized fuo[] d(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = e;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iM = fbc.M((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iM != -1) {
                a(iM, arrayList);
            }
            int iN = fbc.N(uri);
            if (iN != -1 && iN != iM) {
                a(iN, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iM && i2 != iN) {
                    a(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (fuo[]) arrayList.toArray(new fuo[0]);
    }

    @Override // a.iuo
    public final synchronized fuo[] f() {
        return d(Uri.EMPTY, new HashMap());
    }
}
