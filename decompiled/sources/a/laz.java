package a;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class laz implements iiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f19730a;

    public laz(Function0 function0) {
        this.f19730a = maz.a(wez.f39042a, function0);
    }

    public final iiy c() {
        return (iiy) this.f19730a.getValue();
    }

    @Override // a.qgy
    public final Object call(Object... objArr) {
        objArr.getClass();
        return c().call(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // a.qgy
    public final Object callBy(Map map) {
        map.getClass();
        return c().callBy(map);
    }

    public final boolean equals(Object obj) {
        return Intrinsics.d(c(), obj);
    }

    @Override // a.pgy
    public final List getAnnotations() {
        return c().getAnnotations();
    }

    @Override // a.qgy
    public final List getParameters() {
        return c().getParameters();
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return c().getReturnType();
    }

    @Override // a.qgy, a.oiy
    public final List getTypeParameters() {
        return c().getTypeParameters();
    }

    @Override // a.qgy
    public final viy getVisibility() {
        return c().getVisibility();
    }

    public final int hashCode() {
        return c().hashCode();
    }

    @Override // a.qgy
    public final boolean isAbstract() {
        return c().isAbstract();
    }

    @Override // a.qgy
    public final boolean isFinal() {
        return c().isFinal();
    }

    @Override // a.qgy
    public final boolean isOpen() {
        return c().isOpen();
    }

    public final String toString() {
        return c().toString();
    }
}
