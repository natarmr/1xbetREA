package a;

import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final class s930 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31834a;
    public final int b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public final int i;
    public final MatchInfoContainerView j;

    public s930(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, int i7, MatchInfoContainerView matchInfoContainerView) {
        this.f31834a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = matchInfoContainerView;
    }

    public final void a(int i, int i2) {
        this.e = i;
        this.f = i2;
        MatchInfoContainerView matchInfoContainerView = this.j;
        matchInfoContainerView.A(i);
        matchInfoContainerView.y(i2);
    }
}
