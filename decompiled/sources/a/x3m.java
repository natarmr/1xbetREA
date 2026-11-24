package a;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class x3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f40227a;
    public final pz40 b;
    public final agk0 c;
    public final rv2 d;

    public x3m(y3m y3mVar) {
        y3mVar.getClass();
        Boolean bool = Boolean.FALSE;
        this.f40227a = androidx.compose.runtime.e.e(bool);
        this.b = androidx.compose.runtime.e.e(bool);
        this.c = androidx.compose.runtime.e.a(0.0f);
        pel pelVar = new pel();
        pelVar.a(y3mVar, 0.0f);
        float[] fArr = pelVar.b;
        ArrayList arrayList = pelVar.f26860a;
        int size = arrayList.size();
        nx3.a(size, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
        fArrCopyOfRange.getClass();
        this.d = new rv2(new vtj(arrayList, fArrCopyOfRange), y3mVar);
    }

    public final Object a(zje zjeVar) {
        if (d()) {
            return Unit.f46060a;
        }
        Object objC = dv2.c(this.d, y3m.f41958a, nu2.f24127a, zjeVar);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }

    public final Object b(boolean z, zje zjeVar) {
        ((hgk0) this.b).setValue(Boolean.valueOf(z));
        Object objC = dv2.c(this.d, y3m.c, nu2.f24127a, zjeVar);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }

    public final y3m c() {
        return (y3m) ((hgk0) this.d.c).getValue();
    }

    public final boolean d() {
        return ((Boolean) ((hgk0) this.b).getValue()).booleanValue();
    }

    public final Object e(zje zjeVar) {
        if (d()) {
            return Unit.f46060a;
        }
        Object objC = dv2.c(this.d, y3m.b, nu2.f24127a, zjeVar);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }
}
