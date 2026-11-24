package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes6.dex */
public final class gr90 implements hr90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeOfDay23 f11768a;
    public final yg40 b;
    public final Function1 c;
    public final Function1 d;

    public gr90(TimeOfDay23 timeOfDay23, yg40 yg40Var) {
        er90 er90Var = new er90((byte) 0);
        er90 er90Var2 = new er90((byte) 0);
        yg40Var.getClass();
        this.f11768a = timeOfDay23;
        this.b = yg40Var;
        this.c = er90Var;
        this.d = er90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr90)) {
            return false;
        }
        gr90 gr90Var = (gr90) obj;
        return Intrinsics.d(this.f11768a, gr90Var.f11768a) && this.b == gr90Var.b && this.c.equals(gr90Var.c) && this.d.equals(gr90Var.d);
    }

    public final int hashCode() {
        TimeOfDay23 timeOfDay23 = this.f11768a;
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((timeOfDay23 == null ? 0 : timeOfDay23.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Time(initTime=" + this.f11768a + ", minuteStep=" + this.b + ", hourEnabled=" + this.c + ", minuteEnabled=" + this.d + Separators.RPAREN;
    }
}
