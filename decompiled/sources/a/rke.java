package a;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class rke implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30644a;
    public final Type b;

    public /* synthetic */ rke(Type type, byte b) {
        this.f30644a = b;
        this.b = type;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30644a;
        return this.b;
    }
}
