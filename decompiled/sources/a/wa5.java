package a;

import android.gov.nist.core.Separators;
import android.graphics.DashPathEffect;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class wa5 extends cgd {
    public psj f;
    public int j;
    public int k;
    public final ArrayList p;
    public int g = -7829368;
    public float h = 1.0f;
    public float[] i = new float[0];
    public int l = 6;
    public boolean m = false;
    public boolean n = true;
    public DashPathEffect o = null;
    public boolean q = false;
    public boolean r = false;
    public float s = 0.0f;
    public float t = 0.0f;
    public float u = 0.0f;

    public wa5() {
        this.d = dut0.c(10.0f);
        this.b = dut0.c(5.0f);
        this.c = dut0.c(5.0f);
        this.p = new ArrayList();
    }

    public void a(float f, float f2) {
        float f3 = this.q ? this.t : f - 0.0f;
        float f4 = this.r ? this.s : f2 + 0.0f;
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.t = f3;
        this.s = f4;
        this.u = Math.abs(f4 - f3);
    }

    public final String b() {
        int i = 0;
        String str = "";
        while (true) {
            float[] fArr = this.i;
            if (i >= fArr.length) {
                return str;
            }
            String strA = (i < 0 || i >= fArr.length) ? "" : c().a(this.i[i]);
            if (strA != null && str.length() < strA.length()) {
                str = strA;
            }
            i++;
        }
    }

    public final e3u0 c() {
        psj psjVar = this.f;
        if (psjVar != null && psjVar.b == this.k) {
            return psjVar;
        }
        int i = this.k;
        psj psjVar2 = new psj();
        psjVar2.b = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(Separators.DOT);
            }
            stringBuffer.append("0");
        }
        psjVar2.f27517a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
        this.f = psjVar2;
        return psjVar2;
    }
}
