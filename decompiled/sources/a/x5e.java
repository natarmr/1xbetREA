package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x5e extends bnn0 implements Function2 {
    public c6e i;
    public Iterator j;
    public boolean k;
    public final /* synthetic */ List l;
    public final /* synthetic */ c6e m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5e(List list, c6e c6eVar, yje yjeVar) {
        super(2, yjeVar);
        this.l = list;
        this.m = c6eVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new x5e(this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x5e) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r1 r6
  0x0025: PHI (r1v2 java.util.Iterator) = (r1v1 java.util.Iterator), (r1v3 java.util.Iterator) binds: [B:8:0x001c, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x0025: PHI (r6v1 a.c6e) = (r6v0 a.c6e), (r6v2 a.c6e) binds: [B:8:0x001c, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003d -> B:14:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            a.wne r0 = a.wne.f39444a
            boolean r1 = r8.k
            a.c6e r2 = r8.m
            java.util.List r3 = r8.l
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1c
            if (r1 != r4) goto L16
            java.util.Iterator r1 = r8.j
            a.c6e r6 = r8.i
            a.z1x.P(r9)
            goto L40
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L1c:
            a.z1x.P(r9)
            java.util.Iterator r9 = r3.iterator()
            r1 = r9
            r6 = r2
        L25:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L4f
            java.lang.Object r9 = r1.next()
            java.io.File r9 = (java.io.File) r9
            a.h03 r7 = r6.h
            r8.i = r6
            r8.j = r1
            r8.k = r4
            java.lang.Object r9 = r7.C(r9, r8)
            if (r9 != r0) goto L40
            return r0
        L40:
            a.a2c r9 = (a.a2c) r9
            a.x1c r7 = a.x1c.f40116a
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r9, r7)
            if (r7 != 0) goto L4b
            goto L4c
        L4b:
            r9 = r5
        L4c:
            if (r9 == 0) goto L25
            r5 = r9
        L4f:
            if (r5 == 0) goto L5a
            a.r5e r8 = new a.r5e
            r8.<init>(r5)
            r2.y(r8)
            goto L67
        L5a:
            a.o5e r8 = new a.o5e
            org.xplatform.consultantchat.presentation.dialogs.file.model.FileBottomDialogResult$ImageResult r9 = new org.xplatform.consultantchat.presentation.dialogs.file.model.FileBottomDialogResult$ImageResult
            r9.<init>(r3)
            r8.<init>(r9)
            r2.y(r8)
        L67:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x5e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
