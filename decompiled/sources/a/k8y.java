package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public class k8y implements rnb0 {
    public static final /* synthetic */ iiy[] e = {new j0d0(k8y.class, Payload.TYPE, "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swq f17891a;
    public final gmk0 b;
    public final cu00 c;
    public final dqe0 d;

    public k8y(f7u f7uVar, cqe0 cqe0Var, swq swqVar) {
        f7uVar.getClass();
        swqVar.getClass();
        this.f17891a = swqVar;
        this.b = cqe0Var != null ? m2a.v(cqe0Var) : gmk0.x0;
        this.c = new cu00((eu00) ((v7i) f7uVar.b).i, new nsr((Object) f7uVar, (Object) this, (byte) 13));
        this.d = cqe0Var != null ? (dqe0) CollectionsKt.V(cqe0Var.b()) : null;
    }

    @Override // a.t83
    public final gmk0 b() {
        return this.b;
    }

    @Override // a.t83
    public Map c() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return lunVar;
    }

    @Override // a.t83
    public final swq d() {
        return this.f17891a;
    }

    @Override // a.t83
    public final wsy getType() {
        Object objS = yqm0.s(this.c, e[0]);
        objS.getClass();
        return (kzj0) objS;
    }
}
