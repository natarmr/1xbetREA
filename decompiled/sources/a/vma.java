package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i f37668a;
    public final b4i b;
    public final u3i c;
    public final u3i d;

    public vma(c4i c4iVar, b4i b4iVar, u3i u3iVar, u3i u3iVar2) {
        this.f37668a = c4iVar;
        this.b = b4iVar;
        this.c = u3iVar;
        this.d = u3iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vma)) {
            return false;
        }
        vma vmaVar = (vma) obj;
        return Intrinsics.d(this.f37668a, vmaVar.f37668a) && Intrinsics.d(this.b, vmaVar.b) && Intrinsics.d(this.c, vmaVar.c) && Intrinsics.d(this.d, vmaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.f37668a.hashCode() + (Boolean.hashCode(false) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardWatermark(varTag=false, labelModel=" + this.f37668a + ", infoLabelModel=" + this.b + ", favoriteButton=" + this.c + ", accordionButton=" + this.d + Separators.RPAREN;
    }

    public /* synthetic */ vma(c4i c4iVar, b4i b4iVar, u3i u3iVar) {
        this(c4iVar, b4iVar, y3i.f41954a, u3iVar);
    }
}
