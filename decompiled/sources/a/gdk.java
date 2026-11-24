package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class gdk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11107a;
    public final hdk b;

    public /* synthetic */ gdk(hdk hdkVar, byte b) {
        this.f11107a = b;
        this.b = hdkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11107a;
        hdk hdkVar = this.b;
        switch (b) {
            case 0:
                n0d0 n0d0VarE = hdkVar.B().z().e();
                return n0d0VarE == null ? obb.O(hdkVar.B().z(), ujn.c) : n0d0VarE;
            default:
                return jcb.V(hdkVar, false);
        }
    }
}
