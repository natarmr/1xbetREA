package a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b4a extends bnn0 implements Function2 {
    public p7m0 i;
    public d4a j;
    public Bitmap k;
    public Rect l;
    public Object m;
    public wub0 n;
    public float o;
    public float p;
    public boolean q;
    public final /* synthetic */ d4a r;
    public final /* synthetic */ Bitmap s;
    public final /* synthetic */ Rect t;
    public final /* synthetic */ float u;
    public final /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4a(d4a d4aVar, Bitmap bitmap, Rect rect, float f, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.r = d4aVar;
        this.s = bitmap;
        this.t = rect;
        this.u = f;
        this.v = f2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new b4a(this.r, this.s, this.t, this.u, this.v, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b4a) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0067  */
    /* JADX WARN: Code duplicated, block: B:15:0x007e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0067 -> B:13:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            a.wne r0 = a.wne.f39444a
            boolean r1 = r13.q
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 != r2) goto L1f
            float r1 = r13.p
            float r3 = r13.o
            a.wub0 r4 = r13.n
            java.lang.Object r5 = r13.m
            android.graphics.Rect r6 = r13.l
            android.graphics.Bitmap r7 = r13.k
            a.d4a r8 = r13.j
            a.p7m0 r9 = r13.i
            a.z1x.P(r14)
            r11 = r3
            r10 = r6
            goto L6a
        L1f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            r13 = 0
            return r13
        L26:
            a.z1x.P(r14)
            a.d4a r14 = r13.r
            a.p7m0 r1 = r14.l
            android.graphics.Bitmap r3 = r13.s
            android.graphics.Rect r4 = r13.t
            float r5 = r13.u
            float r6 = r13.v
            r8 = r14
            r14 = r1
            r9 = r3
            r10 = r4
            r11 = r5
            r1 = r6
        L3b:
            java.lang.Object r5 = r14.getValue()
            r4 = r5
            a.wub0 r4 = (a.wub0) r4
            r13.i = r14
            r13.j = r8
            r13.k = r9
            r13.l = r10
            r13.m = r5
            r13.n = r4
            r13.o = r11
            r13.p = r1
            r13.q = r2
            java.util.List r3 = a.d4a.o
            a.mne r3 = r8.b
            a.dvj r3 = r3.b
            a.a4a r7 = new a.a4a
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.Object r3 = a.qjj.d0(r3, r7, r13)
            if (r3 != r0) goto L67
            return r0
        L67:
            r7 = r9
            r9 = r14
            r14 = r3
        L6a:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            r4.getClass()
            r14.getClass()
            a.wub0 r3 = new a.wub0
            r4 = 0
            r3.<init>(r14, r1, r2, r4)
            boolean r14 = r9.m(r5, r3)
            if (r14 == 0) goto L81
            kotlin.Unit r13 = kotlin.Unit.f46060a
            return r13
        L81:
            r14 = r9
            r9 = r7
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b4a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
