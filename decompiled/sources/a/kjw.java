package a;

import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final class kjw implements ljw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kjw f18407a = new kjw();

    @Override // a.ljw
    public final long a(fet fetVar) {
        fetVar.e0(-776380510);
        long primaryForeground = ((ThemeColors) fetVar.k(zaq0.b)).getPrimaryForeground();
        fetVar.r(false);
        return primaryForeground;
    }

    @Override // a.ljw
    public final long b(fet fetVar) {
        fetVar.e0(557571362);
        long primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
        fetVar.r(false);
        return primary;
    }

    @Override // a.ljw
    public final float c(fet fetVar) {
        fetVar.e0(-273174465);
        zcl zclVar = qmk.f28987a;
        fetVar.r(false);
        return 4.0f;
    }

    @Override // a.ljw
    public final long d(fet fetVar) {
        fetVar.e0(1070486594);
        long secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
        fetVar.r(false);
        return secondary;
    }

    @Override // a.ljw
    public final void e(fet fetVar) {
        fetVar.e0(-166674397);
        zcl zclVar = qmk.f28987a;
        fetVar.r(false);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kjw);
    }

    public final int hashCode() {
        return -1678346920;
    }

    public final String toString() {
        return "HeaderFocus";
    }
}
