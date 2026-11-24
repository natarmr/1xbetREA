package a;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class so80 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final so80 f32534a = new so80();

    public so80() {
        super(1, f1t0.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Type type = (Type) obj;
        type.getClass();
        return f1t0.f0(type);
    }
}
