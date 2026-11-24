package a;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class uvw0 extends oww0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cow0 f36369a;
    public final int b;

    public uvw0(jpw0 jpw0Var) throws l52 {
        jpw0Var.getClass();
        this.f36369a = jpw0Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            cow0 cow0Var = this.f36369a;
            if (i >= cow0Var.size()) {
                break;
            }
            int iA = ((oww0) cow0Var.get(i)).a();
            if (i2 < iA) {
                i2 = iA;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 > 8) {
            throw new l52("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // a.oww0
    public final int a() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        oww0 oww0Var = (oww0) obj;
        int iZza = oww0Var.zza();
        int iC = oww0.c((byte) -128);
        if (iC != iZza) {
            return iC - oww0Var.zza();
        }
        cow0 cow0Var = ((uvw0) oww0Var).f36369a;
        cow0 cow0Var2 = this.f36369a;
        if (cow0Var2.size() != cow0Var.size()) {
            return cow0Var2.size() - cow0Var.size();
        }
        for (int i = 0; i < cow0Var2.size(); i++) {
            int iCompareTo = ((oww0) cow0Var2.get(i)).compareTo((oww0) cow0Var.get(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uvw0.class == obj.getClass()) {
            return this.f36369a.equals(((uvw0) obj).f36369a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(oww0.c((byte) -128)), this.f36369a});
    }

    public final String toString() {
        cow0 cow0Var = this.f36369a;
        if (cow0Var.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = cow0Var.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((oww0) cow0Var.get(i)).toString().replace(Separators.RETURN, "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(bzs0.g(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(bzs0.g(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            c99.l(e);
            return null;
        }
    }
}
