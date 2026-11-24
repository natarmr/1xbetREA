package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rh80 extends wh80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gp00 f30479a;
    public final List b;
    public final int c;
    public final int d;
    public final dp00 e;
    public final dp00 f;

    public rh80(gp00 gp00Var, List list, int i, int i2, dp00 dp00Var, dp00 dp00Var2) {
        this.f30479a = gp00Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = dp00Var;
        this.f = dp00Var2;
        if (gp00Var != gp00.c && i < 0) {
            c99.s(twn.m(i, "Prepend insert defining placeholdersBefore must be > 0, but was "));
            throw null;
        }
        if (gp00Var != gp00.b && i2 < 0) {
            c99.s(twn.m(i2, "Append insert defining placeholdersAfter must be > 0, but was "));
            throw null;
        }
        if (gp00Var == gp00.f11660a && list.isEmpty()) {
            jf4.o("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:33:0x0114  */
    /* JADX WARN: Code duplicated, block: B:35:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0087 -> B:18:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00dc -> B:26:0x00eb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.wh80
    public final java.lang.Object a(a.caw r18, a.yje r19) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rh80.a(a.caw, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007f  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:18:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00d2 -> B:24:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.wh80
    public final java.lang.Object b(a.yje r18, kotlin.jvm.functions.Function2 r19) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rh80.b(a.yje, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh80)) {
            return false;
        }
        rh80 rh80Var = (rh80) obj;
        return this.f30479a == rh80Var.f30479a && Intrinsics.d(this.b, rh80Var.b) && this.c == rh80Var.c && this.d == rh80Var.d && this.e.equals(rh80Var.e) && Intrinsics.d(this.f, rh80Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + twn.a(this.d, twn.a(this.c, dw9.a(this.f30479a.hashCode() * 31, 31, this.b), 31), 31)) * 31;
        dp00 dp00Var = this.f;
        return iHashCode + (dp00Var == null ? 0 : dp00Var.hashCode());
    }

    public final String toString() {
        List list;
        List list2;
        List list3 = this.b;
        Iterator it = list3.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((kls0) it.next()).b.size();
        }
        int i = this.c;
        String strValueOf = i != -1 ? String.valueOf(i) : "none";
        int i2 = this.d;
        String strValueOf2 = i2 != -1 ? String.valueOf(i2) : "none";
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.f30479a);
        sb.append(", with ");
        sb.append(size);
        sb.append(" items (\n                    |   first item: ");
        kls0 kls0Var = (kls0) CollectionsKt.firstOrNull(list3);
        Object objF0 = null;
        sb.append((kls0Var == null || (list2 = kls0Var.b) == null) ? null : CollectionsKt.firstOrNull(list2));
        sb.append("\n                    |   last item: ");
        kls0 kls0Var2 = (kls0) CollectionsKt.f0(list3);
        if (kls0Var2 != null && (list = kls0Var2.b) != null) {
            objF0 = CollectionsKt.f0(list);
        }
        sb.append(objF0);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(strValueOf);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(strValueOf2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.e);
        sb.append("\n                    ");
        String string = sb.toString();
        dp00 dp00Var = this.f;
        if (dp00Var != null) {
            string = string + "|   mediatorLoadStates: " + dp00Var + '\n';
        }
        return ntm0.d(string.concat("|)"));
    }
}
