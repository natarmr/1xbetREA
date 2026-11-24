package a;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ol60 implements noj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25437a;
    public final i99 b;
    public final boolean c;
    public final LinkedBlockingDeque d;
    public final n0o0 e;
    public final qoj0 f;

    public ol60(int i, i99 i99Var) {
        i99Var.getClass();
        this.f25437a = i;
        this.b = i99Var;
        this.c = i == Integer.MAX_VALUE;
        this.d = new LinkedBlockingDeque();
        this.e = maz.b(new th50((byte) 24));
        this.f = roj0.a(0, Integer.MAX_VALUE, i99.f14377a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0070 -> B:26:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:25:0x0070
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.gmq
    public final java.lang.Object c(a.kmq r10, a.yje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.nl60
            if (r0 == 0) goto L13
            r0 = r11
            a.nl60 r0 = (a.nl60) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.nl60 r0 = new a.nl60
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            java.util.concurrent.LinkedBlockingDeque r3 = r9.d
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 == r4) goto L2f
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r6
        L2f:
            a.z1x.P(r11)
            a.csj.b()
            return r6
        L36:
            java.util.Iterator r10 = r0.j
            a.kmq r2 = r0.i
            a.z1x.P(r11)
            goto L71
        L3e:
            a.z1x.P(r11)
            java.util.List r11 = kotlin.collections.CollectionsKt.L0(r3)
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r11 = r10
            r10 = r8
        L4c:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r10.next()
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            boolean r7 = a.zvw.X(r7)
            if (r7 == 0) goto L4c
            r3.remove(r2)
            r0.i = r11
            r0.j = r10
            r0.m = r5
            java.lang.Object r2 = r11.a(r2, r0)
            if (r2 != r1) goto L70
            return r1
        L70:
            r2 = r11
        L71:
            r11 = r2
            goto L4c
        L73:
            a.clu r10 = new a.clu
            r10.<init>(r9, r11)
            r0.i = r6
            r0.j = r6
            r0.m = r4
            a.qoj0 r9 = r9.f
            r9.c(r10, r0)
            a.wne r9 = a.wne.f39444a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ol60.c(a.kmq, a.yje):java.lang.Object");
    }

    @Override // a.noj0
    public final List d() {
        return CollectionsKt.L0(this.d);
    }

    public final void f(Object obj) {
        boolean z = this.c;
        LinkedBlockingDeque linkedBlockingDeque = this.d;
        if (z || linkedBlockingDeque.size() < this.f25437a) {
            linkedBlockingDeque.addLast(obj);
        } else {
            if (this.b != i99.b) {
                return;
            }
            linkedBlockingDeque.addLast(obj);
            ((LinkedBlockingDeque) this.e.getValue()).addLast(linkedBlockingDeque.removeFirst());
        }
        this.f.g(obj);
    }

    public /* synthetic */ ol60(int i) {
        this(Integer.MAX_VALUE, (i & 2) != 0 ? i99.f14377a : i99.b);
    }
}
