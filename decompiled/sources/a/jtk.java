package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jtk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17104a;
    public final ypl0 b;
    public final itk c;
    public final ypl0 d;

    public jtk(boolean z, ypl0 ypl0Var, itk itkVar, ypl0 ypl0Var2) {
        ypl0Var.getClass();
        ypl0Var2.getClass();
        this.f17104a = z;
        this.b = ypl0Var;
        this.c = itkVar;
        this.d = ypl0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtk)) {
            return false;
        }
        jtk jtkVar = (jtk) obj;
        return this.f17104a == jtkVar.f17104a && Intrinsics.d(this.b, jtkVar.b) && Intrinsics.d(this.c, jtkVar.c) && Intrinsics.d(this.d, jtkVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.f17104a) * 31)) * 31;
        itk itkVar = this.c;
        return this.d.hashCode() + ((iHashCode + (itkVar == null ? 0 : itkVar.hashCode())) * 31);
    }

    public final String toString() {
        return "DisciplineHeaderScenarioModel(betMarketExpanded=" + this.f17104a + ", sportSimpleModel=" + this.b + ", calendarModel=" + this.c + ", headerBackgroundEventHeaderFocusPlaceholder=" + this.d + Separators.RPAREN;
    }
}
