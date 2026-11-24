package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zby implements ugi0 {
    public static final zby b = new zby();
    public static final String c = "kotlinx.serialization.json.JsonArray";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uw3 f44141a;

    public zby() {
        ugi0 descriptor = qcy.f28507a.getDescriptor();
        descriptor.getClass();
        this.f44141a = new uw3(descriptor, (byte) 1);
    }

    @Override // a.ugi0
    public final boolean b() {
        return false;
    }

    @Override // a.ugi0
    public final int c(String str) {
        str.getClass();
        return this.f44141a.c(str);
    }

    @Override // a.ugi0
    public final int d() {
        return 1;
    }

    @Override // a.ugi0
    public final String e(int i) {
        return String.valueOf(i);
    }

    @Override // a.ugi0
    public final List f(int i) {
        return this.f44141a.f(i);
    }

    @Override // a.ugi0
    public final ugi0 g(int i) {
        return this.f44141a.g(i);
    }

    @Override // a.ugi0
    public final List getAnnotations() {
        return iun.f15405a;
    }

    @Override // a.ugi0
    public final String h() {
        return c;
    }

    @Override // a.ugi0
    public final boolean i(int i) {
        this.f44141a.i(i);
        return false;
    }

    @Override // a.ugi0
    public final boolean isInline() {
        return false;
    }

    @Override // a.ugi0
    public final c3x l() {
        return aum0.c;
    }
}
