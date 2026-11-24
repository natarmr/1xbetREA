package a;

import android.content.Intent;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.services.mobile_services.impl.workers.CustomerIOPushWorker;

/* JADX INFO: loaded from: classes.dex */
public final class jv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv0(ufk0 ufk0Var, ywv0 ywv0Var, l7m0 l7m0Var, Function0 function0, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        this.l = ufk0Var;
        this.m = ywv0Var;
        this.j = l7m0Var;
        this.n = function0;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        switch (b) {
            case 0:
                return new jv0((l7m0) this.j, (yez) this.k, (cqq) obj4, (pkk0) obj3, (wpq) obj2, yjeVar, (byte) 0);
            case 1:
                return new jv0((vne) this.j, (vz40) this.k, (vz40) obj4, (db8) obj3, (pz40) obj2, yjeVar, (byte) 1);
            case 2:
                jv0 jv0Var = new jv0((mie0) this.k, (zu3) obj4, (hie0) obj3, (mie0) obj2, yjeVar, (byte) 2);
                jv0Var.j = obj;
                return jv0Var;
            case 3:
                return new jv0((fm7) this.j, (kzv) this.k, (ql5) obj4, (ArrayList) obj3, (HashMap) obj2, yjeVar, (byte) 3);
            case 4:
                jv0 jv0Var2 = new jv0((g39) this.k, (s460) obj4, (gj4) obj3, (kk0) obj2, yjeVar, (byte) 4);
                jv0Var2.j = obj;
                return jv0Var2;
            case 5:
                return new jv0((dfu0) this.j, (cgk0) this.k, (pz40) obj4, (pz40) obj3, (pz40) obj2, yjeVar, (byte) 5);
            case 6:
                jv0 jv0Var3 = new jv0((efu0) this.k, (pz40) obj4, (ExoPlayer) obj3, (pz40) obj2, yjeVar, (byte) 6);
                jv0Var3.j = obj;
                return jv0Var3;
            case 7:
                return new jv0((CustomerIOPushWorker) this.j, (Intent) this.k, (String) obj4, (String) obj3, (Bitmap) obj2, yjeVar, (byte) 7);
            case 8:
                jv0 jv0Var4 = new jv0((w6g) this.k, (ArrayList) obj4, (CyberCalendarPeriodUiModel) obj3, (ril0) obj2, yjeVar, (byte) 8);
                jv0Var4.j = obj;
                return jv0Var4;
            case 9:
                jv0 jv0Var5 = new jv0((u8g) this.k, (ArrayList) obj4, (CyberCalendarPeriodUiModel) obj3, (ril0) obj2, yjeVar, (byte) 9);
                jv0Var5.j = obj;
                return jv0Var5;
            case 10:
                jv0 jv0Var6 = new jv0((fhj) this.k, (w4b0) obj4, (j5b0) obj3, (pgj) obj2, yjeVar, (byte) 10);
                jv0Var6.j = obj;
                return jv0Var6;
            case 11:
                jv0 jv0Var7 = new jv0((tzi) this.k, (yx5) obj4, (ms2) obj3, (f0s) obj2, yjeVar, (byte) 11);
                jv0Var7.j = obj;
                return jv0Var7;
            case 12:
                jv0 jv0Var8 = new jv0((ufk0) obj4, (ywv0) obj3, (l7m0) this.j, (Function0) obj2, yjeVar);
                jv0Var8.k = obj;
                return jv0Var8;
            case 13:
                return new jv0((ddk0) this.j, (yez) this.k, (cqq) obj4, (pkk0) obj3, (wpq) obj2, yjeVar, (byte) 13);
            case 14:
                return new jv0((kie0) this.j, (a4x) this.k, (pz40) obj4, (pz40) obj3, (LinkedHashMap) obj2, yjeVar, (byte) 14);
            default:
                jv0 jv0Var9 = new jv0((Function1) this.k, (Function2) obj4, (j3t0) obj3, (i3t0) obj2, yjeVar, (byte) 15);
                jv0Var9.j = obj;
                return jv0Var9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((jv0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((jv0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((jv0) create((y9o) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((jv0) create((vm7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:181:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:182:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:185:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:186:0x06c9  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v7 java.lang.Object, still in use, count: 2, list:
          (r9v7 java.lang.Object) from 0x069f: PHI (r9 I:??) = (r9v3 java.lang.Object), (r9v7 java.lang.Object) binds: [B:173:0x069e, B:261:0x069f] A[DONT_GENERATE, DONT_INLINE]
          (r9v7 java.lang.Object) from 0x0693: CHECK_CAST (a.f3n0) (r9v7 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 2388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jv0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv0(Object obj, Object obj2, Object obj3, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = obj4;
        this.n = obj5;
    }
}
