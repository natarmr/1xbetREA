package a;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class twl implements eyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34655a;
    public final nwl b;
    public final swl c;
    public final hwl d;
    public final boolean e;
    public final wxl f;
    public final Function1 g;

    public twl(String str, nwl nwlVar, swl swlVar, hwl hwlVar, boolean z, wxl wxlVar, Function1 function1) {
        str.getClass();
        nwlVar.getClass();
        swlVar.getClass();
        hwlVar.getClass();
        wxlVar.getClass();
        this.f34655a = str;
        this.b = nwlVar;
        this.c = swlVar;
        this.d = hwlVar;
        this.e = z;
        this.f = wxlVar;
        this.g = function1;
        uwl uwlVar = uwl.f36398a;
    }

    public static twl e(twl twlVar, boolean z) {
        String str = twlVar.f34655a;
        nwl nwlVar = twlVar.b;
        swl swlVar = twlVar.c;
        hwl hwlVar = twlVar.d;
        wxl wxlVar = twlVar.f;
        Function1 function1 = twlVar.g;
        str.getClass();
        nwlVar.getClass();
        swlVar.getClass();
        hwlVar.getClass();
        wxlVar.getClass();
        return new twl(str, nwlVar, swlVar, hwlVar, z, wxlVar, function1);
    }

    @Override // a.eyl
    public final uwl a() {
        return uwl.b;
    }

    @Override // a.eyl
    public final Collection b(eyl eylVar, eyl eylVar2) {
        if (!(eylVar instanceof twl) || !(eylVar2 instanceof twl)) {
            return null;
        }
        twl twlVar = (twl) eylVar;
        twl twlVar2 = (twl) eylVar2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = twlVar.e;
        boolean z2 = twlVar2.e;
        swl swlVar = twlVar2.c;
        nwl nwlVar = twlVar2.b;
        if (z != z2) {
            linkedHashSet.add(new sxl(z2));
        }
        if (!Intrinsics.d(twlVar.b, nwlVar)) {
            nwlVar.getClass();
            linkedHashSet.add(new qxl(nwlVar));
        }
        if (!Intrinsics.d(twlVar.c, swlVar)) {
            swlVar.getClass();
            linkedHashSet.add(new rxl(swlVar));
        }
        return linkedHashSet;
    }

    @Override // a.eyl
    public final boolean c(eyl eylVar, eyl eylVar2) {
        return (eylVar instanceof twl) && (eylVar2 instanceof twl) && Intrinsics.d(((twl) eylVar).f34655a, ((twl) eylVar2).f34655a);
    }

    @Override // a.eyl
    public final boolean d(eyl eylVar, eyl eylVar2) {
        if (!(eylVar instanceof twl) || !(eylVar2 instanceof twl)) {
            return false;
        }
        twl twlVar = (twl) eylVar;
        twl twlVar2 = (twl) eylVar2;
        return twlVar.e == twlVar2.e && Intrinsics.d(twlVar.b, twlVar2.b) && Intrinsics.d(twlVar.c, twlVar2.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twl)) {
            return false;
        }
        twl twlVar = (twl) obj;
        return Intrinsics.d(this.f34655a, twlVar.f34655a) && Intrinsics.d(this.b, twlVar.b) && Intrinsics.d(this.c, twlVar.c) && Intrinsics.d(this.d, twlVar.d) && this.e == twlVar.e && this.f == twlVar.f && this.g.equals(twlVar.g) && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + defpackage.c.a((this.g.hashCode() + ((this.f.hashCode() + brm0.e(brm0.e(brm0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f34655a.hashCode() * 961)) * 31)) * 31)) * 923521, 31, false), 29791, false), 31, this.e)) * 31)) * 887503681, 0.0f, 31);
    }

    public final String toString() {
        return "DsChipItemModel(text=" + this.f34655a + ", valueText=null, leftIcon=" + this.b + ", rightIcon=" + this.c + ", iconTint=" + this.d + ", backgroundActiveColor=null, textActiveColor=null, textMaxLines=null, unlimitedLines=false, disable=false, counter=null, badge=null, selected=" + this.e + ", style=" + this.f + ", onSelectClick=" + this.g + ", backgroundDisabledColor=null, textDisabledColor=null, valueDisabledColor=null, leftIconDisabledTint=null, rightIconDisabledTint=null, leftIconRadius=0.0, rightIconRadius=0.0)";
    }
}
