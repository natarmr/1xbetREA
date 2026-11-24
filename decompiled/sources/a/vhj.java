package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class vhj implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kmq f37432a;
    public final /* synthetic */ uii b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    public vhj(kmq kmqVar, uii uiiVar, int i, boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.b = uiiVar;
        this.c = i;
        this.d = z;
        this.e = j;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.f37432a = kmqVar;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws Exception {
        nqo nqoVar = (nqo) obj;
        if (nqoVar == null || nqoVar.equals(lqo.f20495a)) {
            Object objM = this.b.m(this.c, this.d, this.e, this.f, this.g, this.h, this.i, yjeVar);
            if (objM == wne.f39444a) {
                return objM;
            }
        } else {
            Object objA = this.f37432a.a(nqoVar, yjeVar);
            if (objA == wne.f39444a) {
                return objA;
            }
        }
        return Unit.f46060a;
    }
}
