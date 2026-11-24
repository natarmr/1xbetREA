package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16673a;
    public final List b;

    public jkk(ArrayList arrayList, List list) {
        list.getClass();
        this.f16673a = arrayList;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkk)) {
            return false;
        }
        jkk jkkVar = (jkk) obj;
        return this.f16673a.equals(jkkVar.f16673a) && Intrinsics.d(this.b, jkkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16673a.hashCode() * 31);
    }

    public final String toString() {
        return "DicePokerPlayerRollUiModel(dices=" + this.f16673a + ", throwDices=" + this.b + Separators.RPAREN;
    }
}
