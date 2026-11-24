package org.xplatform.uikit.components.successbetalert.model;

import a.c0o;
import a.ibw0;
import a.r3d;
import a.wp20;
import a.y2;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 org.xplatform.uikit.components.successbetalert.model.BetDoneIconStyleEnum[], still in use, count: 1, list:
  (r0v1 org.xplatform.uikit.components.successbetalert.model.BetDoneIconStyleEnum[]) from 0x002c: CONSTRUCTOR (r1v2 a.c0o) = (r0v1 org.xplatform.uikit.components.successbetalert.model.BetDoneIconStyleEnum[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:45) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;", "Landroid/os/Parcelable;", "", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetDoneIconStyleEnum implements Parcelable {
    NONE("none"),
    IMAGE("image"),
    LOTTIE("lottie");

    public static final Parcelable.Creator<BetDoneIconStyleEnum> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47262a;

    static {
        byte b = 0;
        c0o c0oVar = new c0o(betDoneIconStyleEnumArr);
        CREATOR = new ibw0((byte) 24);
        int iA = wp20.a(r3d.q(c0oVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        y2 y2Var = new y2(c0oVar, b);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            linkedHashMap.put(((BetDoneIconStyleEnum) next).f47262a, next);
        }
    }

    public BetDoneIconStyleEnum(String str) {
        super(str, i);
        this.f47262a = str;
    }

    public static BetDoneIconStyleEnum valueOf(String str) {
        return (BetDoneIconStyleEnum) Enum.valueOf(BetDoneIconStyleEnum.class, str);
    }

    public static BetDoneIconStyleEnum[] values() {
        return (BetDoneIconStyleEnum[]) e.clone();
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
