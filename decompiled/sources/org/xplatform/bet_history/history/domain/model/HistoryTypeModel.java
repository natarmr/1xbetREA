package org.xplatform.bet_history.history.domain.model;

import a.c0o;
import a.yoo;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 org.xplatform.bet_history.history.domain.model.HistoryTypeModel[], still in use, count: 1, list:
  (r0v1 org.xplatform.bet_history.history.domain.model.HistoryTypeModel[]) from 0x0058: CONSTRUCTOR (r0v1 org.xplatform.bet_history.history.domain.model.HistoryTypeModel[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:89) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;", "Landroid/os/Parcelable;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HistoryTypeModel implements Parcelable {
    EVENTS(0),
    TOTO(1),
    AUTO(2),
    UNSETTLED(3),
    SALE(4),
    AGGREGATOR(5),
    JACKPOT(6),
    LOTTO(7);

    public static final Parcelable.Creator<HistoryTypeModel> CREATOR = new yoo(29);
    public static final /* synthetic */ c0o k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f46393a;

    static {
        k = new c0o(new HistoryTypeModel[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryTypeModel(int i) {
        super(str, i);
        this.f46393a = i;
    }

    public static HistoryTypeModel valueOf(String str) {
        return (HistoryTypeModel) Enum.valueOf(HistoryTypeModel.class, str);
    }

    public static HistoryTypeModel[] values() {
        return (HistoryTypeModel[]) j.clone();
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
