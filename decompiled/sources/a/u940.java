package a;

import com.google.firebase.messaging.RemoteMessage;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import org.xplatform.services.mobile_services.impl.workers.CustomerIOPushWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class u940 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f35265a;

    public u940(us00 us00Var) {
        this.f35265a = us00Var;
    }

    public final void a(RemoteMessage remoteMessage, gmo gmoVar) {
        HashMap mapM = remoteMessage.m();
        if (!mapM.containsKey("CIO-Delivery-Token")) {
            gmoVar.invoke();
            return;
        }
        laj lajVar = new laj((byte) 0);
        lajVar.c(mapM);
        maj majVarA = lajVar.a();
        sl50 sl50Var = sl50.f32381a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o4e o4eVar = new o4e(new hl50(null), sl50.b, false, false, false, false, -1L, -1L, CollectionsKt.P0(linkedHashSet));
        xl60 xl60Var = new xl60(CustomerIOPushWorker.class);
        od80 od80Var = od80.f25065a;
        xl60 xl60Var2 = (xl60) xl60Var.w();
        ((ppv0) xl60Var2.c).j = o4eVar;
        ((ppv0) xl60Var2.c).e = majVarA;
        yl60 yl60Var = (yl60) xl60Var2.k();
        cpv0 cpv0VarD = cpv0.d(this.f35265a);
        cpv0VarD.getClass();
        cpv0VarD.a(yl60Var);
    }
}
