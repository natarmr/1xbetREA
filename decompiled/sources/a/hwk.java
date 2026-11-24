package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hwk extends lm40 implements ehl {
    public dbz o;

    @Override // a.lm40
    public final void R0() {
        this.o.j = this;
    }

    @Override // a.lm40
    public final void S0() {
        dbz dbzVar = this.o;
        dbzVar.e();
        dbzVar.b = null;
        dbzVar.c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwk) && Intrinsics.d(this.o, ((hwk) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.o + Separators.RPAREN;
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        a6a a6aVar = g7zVar.f10839a;
        ArrayList arrayList = this.o.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zaz zazVar = (zaz) arrayList.get(i);
            dfv dfvVar = zazVar.o;
            if (dfvVar != null) {
                long j = zazVar.m;
                long j2 = dfvVar.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((fvt0) a6aVar.b.b).A(f, f2);
                try {
                    agc.I(g7zVar, dfvVar);
                    ((fvt0) a6aVar.b.b).A(-f, -f2);
                } catch (Throwable th) {
                    ((fvt0) a6aVar.b.b).A(-f, -f2);
                    throw th;
                }
            }
        }
        g7zVar.a();
    }
}
