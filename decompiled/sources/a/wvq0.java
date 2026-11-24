package a;

import java.util.ArrayList;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public class wvq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39851a;
    public final /* synthetic */ dgu b;

    public wvq0(dgu dguVar, int i) {
        this.b = dguVar;
        this.f39851a = i;
    }

    public wvq0 a() {
        return new wvq0(this.b, this.f39851a + 1);
    }

    public final char b(int i) {
        dgu dguVar = this.b;
        if (i == 0) {
            return dguVar.i(d());
        }
        if (i == -1) {
            return dguVar.i(d() - 1);
        }
        if (i != 1) {
            return dguVar.i(i > 0 ? f(i).b : f(i + 1).b - 1);
        }
        return dguVar.i(c());
    }

    public final int c() {
        return f(0).c;
    }

    public final int d() {
        return f(0).b;
    }

    public final ar20 e() {
        return f(0).f20728a;
    }

    public final lvq0 f(int i) {
        int i2 = this.f39851a;
        dgu dguVar = this.b;
        if (i2 < 0) {
            int i3 = ((IntRange) dguVar.d).f46068a;
            return new lvq0(null, i3, i3, 0, 0);
        }
        ArrayList arrayList = (ArrayList) dguVar.b;
        ArrayList arrayList2 = (ArrayList) dguVar.b;
        ArrayList arrayList3 = (ArrayList) dguVar.f6058a;
        IntRange intRange = (IntRange) dguVar.d;
        if (i2 > arrayList.size()) {
            int i4 = intRange.b + 1;
            return new lvq0(null, i4, i4, 0, 0);
        }
        int size = (i2 < arrayList2.size() ? ((lvq0) arrayList2.get(i2)).d : arrayList3.size()) + i;
        if (size < 0) {
            int i5 = intRange.f46068a;
            return new lvq0(null, i5, i5, 0, 0);
        }
        if (size < arrayList3.size()) {
            return (lvq0) arrayList3.get(size);
        }
        int i6 = intRange.b + 1;
        return new lvq0(null, i6, i6, 0, 0);
    }

    public ar20 g() {
        return f(1).f20728a;
    }

    public final String toString() {
        return "Iterator: " + this.f39851a + ": " + e();
    }
}
