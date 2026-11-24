package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mxl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22560a;
    public final fxl b;
    public final kxl c;
    public final zwl d;
    public final boolean e;

    public mxl(String str, fxl fxlVar, kxl kxlVar, zwl zwlVar, boolean z) {
        str.getClass();
        fxlVar.getClass();
        this.f22560a = str;
        this.b = fxlVar;
        this.c = kxlVar;
        this.d = zwlVar;
        this.e = z;
    }

    public static mxl a(mxl mxlVar, boolean z) {
        String str = mxlVar.f22560a;
        fxl fxlVar = mxlVar.b;
        kxl kxlVar = mxlVar.c;
        zwl zwlVar = mxlVar.d;
        str.getClass();
        fxlVar.getClass();
        kxlVar.getClass();
        zwlVar.getClass();
        return new mxl(str, fxlVar, kxlVar, zwlVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxl)) {
            return false;
        }
        mxl mxlVar = (mxl) obj;
        return Intrinsics.d(this.f22560a, mxlVar.f22560a) && Intrinsics.d(this.b, mxlVar.b) && Intrinsics.d(this.c, mxlVar.c) && Intrinsics.d(this.d, mxlVar.d) && this.e == mxlVar.e && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + defpackage.c.a(brm0.e(brm0.e(brm0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f22560a.hashCode() * 961)) * 31)) * 31)) * 923521, 31, false), 29791, false), 887503681, this.e), 0.0f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsChipModel(text=");
        sb.append(this.f22560a);
        sb.append(", valueText=null, leftIcon=");
        sb.append(this.b);
        sb.append(", rightIcon=");
        sb.append(this.c);
        sb.append(", iconTint=");
        sb.append(this.d);
        sb.append(", backgroundActiveColor=null, textActiveColor=null, textMaxLines=null, unlimitedLines=false, disable=false, counter=null, badge=null, selected=");
        return rw2.p(sb, this.e, ", backgroundDisabledColor=null, textDisabledColor=null, valueDisabledColor=null, leftIconDisabledTint=null, rightIconDisabledTint=null, leftIconRadius=0.0, rightIconRadius=0.0)");
    }

    public /* synthetic */ mxl(String str, fxl fxlVar, boolean z, int i) {
        this(str, (i & 4) != 0 ? exl.f8583a : fxlVar, jxl.f17311a, xwl.f41614a, z);
    }
}
