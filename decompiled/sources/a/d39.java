package a;

/* JADX INFO: loaded from: classes.dex */
public final class d39 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xz40 f5392a = new xz40(new e39[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(a.jge0 r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.c39
            if (r0 == 0) goto L13
            r0 = r10
            a.c39 r0 = (a.c39) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            a.c39 r0 = new a.c39
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            int r8 = r0.l
            int r9 = r0.k
            java.lang.Object[] r2 = r0.j
            a.jge0 r4 = r0.i
            a.z1x.P(r10)
            r10 = r4
            goto L63
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L37:
            a.z1x.P(r10)
            a.xz40 r8 = r8.f5392a
            java.lang.Object[] r10 = r8.f41739a
            int r8 = r8.c
            r2 = 0
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
        L45:
            if (r9 >= r8) goto L65
            r4 = r2[r9]
            a.e39 r4 = (a.e39) r4
            a.vb8 r5 = new a.vb8
            r6 = 14
            r5.<init>(r10, r6)
            r0.i = r10
            r0.j = r2
            r0.k = r9
            r0.l = r8
            r0.o = r3
            java.lang.Object r4 = a.b34.S(r4, r5, r0)
            if (r4 != r1) goto L63
            return r1
        L63:
            int r9 = r9 + r3
            goto L45
        L65:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d39.a(a.jge0, a.zje):java.lang.Object");
    }
}
