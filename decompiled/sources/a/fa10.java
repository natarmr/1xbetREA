package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fa10 {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public gnk0 h;
    public u710 i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td90 f9184a = new td90();
    public final HashSet b = new HashSet();
    public int p = 0;

    public final void a(String str) {
        xv00.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float fC = cut0.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap map = this.d;
                String str = (String) entry.getKey();
                hb10 hb10Var = (hb10) entry.getValue();
                float f = this.e / fC;
                int i = (int) (hb10Var.f12750a * f);
                int i2 = (int) (hb10Var.b * f);
                hb10 hb10Var2 = new hb10(hb10Var.c, i, hb10Var.d, hb10Var.e, i2);
                Bitmap bitmap = hb10Var.f;
                if (bitmap != null) {
                    hb10Var2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, hb10Var2);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final gr20 d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            gr20 gr20Var = (gr20) this.g.get(i);
            String str2 = gr20Var.f11761a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return gr20Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((y5z) it.next()).a(Separators.HT));
        }
        return sb.toString();
    }
}
