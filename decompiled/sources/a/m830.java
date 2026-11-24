package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class m830 implements p830 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21351a;

    public m830(ArrayList arrayList) {
        this.f21351a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m830) && this.f21351a.equals(((m830) obj).f21351a);
    }

    public final int hashCode() {
        return this.f21351a.hashCode();
    }

    public final String toString() {
        return hne.o("BulletList(content=", Separators.RPAREN, this.f21351a);
    }
}
