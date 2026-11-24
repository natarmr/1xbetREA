package a;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vh80 extends wh80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37417a;

    public vh80(List list) {
        list.getClass();
        this.f37417a = list;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006a -> B:21:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.wh80
    public final java.lang.Object a(a.caw r7, a.yje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.th80
            if (r0 == 0) goto L13
            r0 = r8
            a.th80 r0 = (a.th80) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L1a
        L13:
            a.th80 r0 = new a.th80
            a.zje r8 = (a.zje) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.l
            java.util.Iterator r7 = r0.k
            java.util.Collection r2 = r0.j
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.jvm.functions.Function2 r4 = r0.i
            a.z1x.P(r8)
            goto L6e
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L3a:
            a.z1x.P(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r6 = r6.f37417a
            java.util.Iterator r6 = r6.iterator()
            r2 = r7
            r7 = r6
            r6 = r2
            r2 = r8
        L4c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7b
            java.lang.Object r8 = r7.next()
            r0.i = r6
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            r0.j = r4
            r0.k = r7
            r0.l = r8
            r0.o = r3
            java.lang.Object r4 = r6.invoke(r8, r0)
            if (r4 != r1) goto L6a
            return r1
        L6a:
            r5 = r4
            r4 = r6
            r6 = r8
            r8 = r5
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L79
            r2.add(r6)
        L79:
            r6 = r4
            goto L4c
        L7b:
            java.util.List r2 = (java.util.List) r2
            a.vh80 r6 = new a.vh80
            r6.<init>(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vh80.a(a.caw, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:21:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.wh80
    public final java.lang.Object b(a.yje r7, kotlin.jvm.functions.Function2 r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.uh80
            if (r0 == 0) goto L13
            r0 = r7
            a.uh80 r0 = (a.uh80) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L1a
        L13:
            a.uh80 r0 = new a.uh80
            a.zje r7 = (a.zje) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            java.util.Collection r6 = r0.l
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r8 = r0.k
            java.util.Collection r2 = r0.j
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.jvm.functions.Function2 r4 = r0.i
            a.z1x.P(r7)
            goto L75
        L35:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L3c:
            a.z1x.P(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            java.util.List r6 = r6.f37417a
            int r2 = a.r3d.q(r6, r2)
            r7.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        L54:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r8.next()
            r0.i = r7
            r4 = r6
            java.util.Collection r4 = (java.util.Collection) r4
            r0.j = r4
            r0.k = r8
            r0.l = r4
            r0.o = r3
            java.lang.Object r2 = r7.invoke(r2, r0)
            if (r2 != r1) goto L72
            return r1
        L72:
            r4 = r7
            r7 = r2
            r2 = r6
        L75:
            r6.add(r7)
            r6 = r2
            r7 = r4
            goto L54
        L7b:
            java.util.List r6 = (java.util.List) r6
            a.vh80 r7 = new a.vh80
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vh80.b(a.yje, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vh80) && Intrinsics.d(this.f37417a, ((vh80) obj).f37417a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + twn.a(0, this.f37417a.hashCode() * 29791, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
        List list = this.f37417a;
        sb.append(list.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(CollectionsKt.firstOrNull(list));
        sb.append("\n                    |   last item: ");
        sb.append(CollectionsKt.f0(list));
        sb.append("\n                    |   sourceLoadStates: null,\n                    |   placeholdersBefore: 0,\n                    |   placeholdersAfter: 0,\n                    ");
        return ntm0.d(sb.toString().concat("|)"));
    }
}
