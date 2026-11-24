package a;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3190a;
    public final k03 b;
    public final r9a c;
    public final int d;
    public final Map e;
    public final Integer f;
    public final cto g;
    public final o03 h;

    public bto(ArrayList arrayList, k03 k03Var, r9a r9aVar, int i, Map map, Integer num, cto ctoVar, o03 o03Var) {
        this.f3190a = arrayList;
        this.b = k03Var;
        this.c = r9aVar;
        this.d = i;
        this.e = map;
        this.f = num;
        this.g = ctoVar;
        this.h = o03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bto) {
            bto btoVar = (bto) obj;
            if (this.f3190a.equals(btoVar.f3190a) && this.b == btoVar.b && this.c == btoVar.c && this.d == btoVar.d && this.e.equals(btoVar.e) && this.f.equals(btoVar.f) && this.g == btoVar.g && Intrinsics.d(this.h, btoVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ohs0.f(this.e, twn.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + twn.g(this.f3190a, Integer.hashCode(2) * 31, 31)) * 31)) * 31, 31), 31)) * 31)) * 31;
        o03 o03Var = this.h;
        return iHashCode + (o03Var == null ? 0 : o03Var.hashCode());
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.f3190a + ", executor=" + this.b + ", stateCallback=" + this.c + ", sessionTemplateId=" + this.d + ", sessionParameters=" + this.e + ", extensionMode=" + this.f + ", extensionStateCallback=" + this.g + ", postviewOutputConfiguration=" + this.h + ')';
    }
}
