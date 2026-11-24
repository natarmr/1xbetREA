package org.xplatform.statistic.tennis.impl.summary.domain.models;

import a.c0o;
import a.l7n0;
import a.m6m0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType[], still in use, count: 1, list:
  (r0v1 org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType[]) from 0x0048: CONSTRUCTOR (r0v1 org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:73) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;", "Landroid/os/Parcelable;", "", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TennisSurfaceType implements Parcelable {
    ALL("all"),
    /* JADX INFO: Fake field, exist only in values array */
    CLAY("clay"),
    /* JADX INFO: Fake field, exist only in values array */
    GRASS("grass"),
    /* JADX INFO: Fake field, exist only in values array */
    HARD("hard"),
    /* JADX INFO: Fake field, exist only in values array */
    CARPET("carpet"),
    UNKNOWN("");

    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47098a;
    public static final m6m0 b = new m6m0(17);
    public static final Parcelable.Creator<TennisSurfaceType> CREATOR = new l7n0((byte) 17);

    static {
        f = new c0o(new TennisSurfaceType[]{r0, r1, r2, r3, r4, r5});
    }

    public TennisSurfaceType(String str) {
        super(str, i);
        this.f47098a = str;
    }

    public static TennisSurfaceType valueOf(String str) {
        return (TennisSurfaceType) Enum.valueOf(TennisSurfaceType.class, str);
    }

    public static TennisSurfaceType[] values() {
        return (TennisSurfaceType[]) e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
