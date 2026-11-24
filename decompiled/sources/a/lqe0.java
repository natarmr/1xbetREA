package a;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lqe0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lqe0 f20484a = new lqe0(1, vqe0.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Method method = (Method) obj;
        method.getClass();
        return new vqe0(method);
    }
}
