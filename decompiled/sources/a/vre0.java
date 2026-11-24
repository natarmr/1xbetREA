package a;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public final class vre0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37896a;

    public vre0(boolean z) {
        this.f37896a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        kTypeProjection.getClass();
        return (this.f37896a ? "(raw) " : "") + kTypeProjection;
    }
}
