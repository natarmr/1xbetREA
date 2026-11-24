package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i7k implements d7k {
    public final hev0 d;
    public int f;
    public int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hev0 f14295a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public vmk i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public i7k(hev0 hev0Var) {
        this.d = hev0Var;
    }

    @Override // a.d7k
    public final void a(d7k d7kVar) {
        ArrayList<i7k> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((i7k) it.next()).j) {
                return;
            }
        }
        this.c = true;
        hev0 hev0Var = this.f14295a;
        if (hev0Var != null) {
            hev0Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        i7k i7kVar = null;
        int i = 0;
        for (i7k i7kVar2 : arrayList) {
            if (!(i7kVar2 instanceof vmk)) {
                i++;
                i7kVar = i7kVar2;
            }
        }
        if (i7kVar != null && i == 1 && i7kVar.j) {
            vmk vmkVar = this.i;
            if (vmkVar != null) {
                if (!vmkVar.j) {
                    return;
                } else {
                    this.f = this.h * vmkVar.g;
                }
            }
            d(i7kVar.g + this.f);
        }
        hev0 hev0Var2 = this.f14295a;
        if (hev0Var2 != null) {
            hev0Var2.a(this);
        }
    }

    public final void b(hev0 hev0Var) {
        this.k.add(hev0Var);
        if (this.j) {
            hev0Var.a(hev0Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d7k d7kVar : this.k) {
            d7kVar.a(d7kVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.k0);
        sb.append(Separators.COLON);
        switch (this.e) {
            case 1:
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(Separators.LPAREN);
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(Separators.GREATER_THAN);
        return sb.toString();
    }
}
