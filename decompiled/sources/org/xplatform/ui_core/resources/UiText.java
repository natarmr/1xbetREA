package org.xplatform.ui_core.resources;

import a.lbk;
import a.r3d;
import a.t9f;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@lbk
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lorg/xplatform/ui_core/resources/UiText;", "Landroid/os/Parcelable;", "ByString", "ByRes", "ByIntRes", "Combined", "Lorg/xplatform/ui_core/resources/UiText$ByIntRes;", "Lorg/xplatform/ui_core/resources/UiText$ByRes;", "Lorg/xplatform/ui_core/resources/UiText$ByString;", "Lorg/xplatform/ui_core/resources/UiText$Combined;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class UiText implements Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/resources/UiText$ByIntRes;", "Lorg/xplatform/ui_core/resources/UiText;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ByIntRes extends UiText {
        public static final Parcelable.Creator<ByIntRes> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47187a;
        public final int[] b;

        public ByIntRes(int[] iArr, int i) {
            iArr.getClass();
            this.f47187a = i;
            this.b = iArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!ByIntRes.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            ByIntRes byIntRes = (ByIntRes) obj;
            return this.f47187a == byIntRes.f47187a && Arrays.equals(this.b, byIntRes.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b) + (this.f47187a * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f47187a);
            parcel.writeIntArray(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/resources/UiText$ByRes;", "Lorg/xplatform/ui_core/resources/UiText;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ByRes extends UiText {
        public static final Parcelable.Creator<ByRes> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47188a;
        public final CharSequence[] b;

        public ByRes(int i, CharSequence... charSequenceArr) {
            this.f47188a = i;
            this.b = charSequenceArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!ByRes.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            ByRes byRes = (ByRes) obj;
            return this.f47188a == byRes.f47188a && Arrays.equals(this.b, byRes.b);
        }

        public final int hashCode() {
            return (this.f47188a * 31) + Arrays.hashCode(this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f47188a);
            CharSequence[] charSequenceArr = this.b;
            int length = charSequenceArr.length;
            parcel.writeInt(length);
            for (int i2 = 0; i2 != length; i2++) {
                TextUtils.writeToParcel(charSequenceArr[i2], parcel, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/resources/UiText$ByString;", "Lorg/xplatform/ui_core/resources/UiText;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ByString extends UiText {
        public static final Parcelable.Creator<ByString> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f47189a;

        public ByString(CharSequence charSequence) {
            charSequence.getClass();
            this.f47189a = charSequence;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ByString) && Intrinsics.d(this.f47189a, ((ByString) obj).f47189a);
        }

        public final int hashCode() {
            return this.f47189a.hashCode();
        }

        public final String toString() {
            return "ByString(value=" + ((Object) this.f47189a) + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            TextUtils.writeToParcel(this.f47189a, parcel, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/resources/UiText$Combined;", "Lorg/xplatform/ui_core/resources/UiText;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Combined extends UiText {
        public static final Parcelable.Creator<Combined> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47190a;
        public final ArrayList b;

        public Combined(int i, ArrayList arrayList) {
            this.f47190a = i;
            this.b = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Combined.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            Combined combined = (Combined) obj;
            return this.f47190a == combined.f47190a && this.b.equals(combined.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b.toArray(new UiText[0])) + (this.f47190a * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f47190a);
            ArrayList arrayList = this.b;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
    }

    public final CharSequence a(Context context) {
        context.getClass();
        if (this instanceof ByString) {
            return ((ByString) this).f47189a;
        }
        if (this instanceof ByRes) {
            ByRes byRes = (ByRes) this;
            CharSequence[] charSequenceArr = byRes.b;
            String string = context.getString(byRes.f47188a, Arrays.copyOf(charSequenceArr, charSequenceArr.length));
            string.getClass();
            return string;
        }
        if (this instanceof ByIntRes) {
            ByIntRes byIntRes = (ByIntRes) this;
            int[] iArr = byIntRes.b;
            iArr.getClass();
            int length = iArr.length;
            Integer[] numArr = new Integer[length];
            int length2 = iArr.length;
            for (int i = 0; i < length2; i++) {
                numArr[i] = Integer.valueOf(iArr[i]);
            }
            String string2 = context.getString(byIntRes.f47187a, Arrays.copyOf(numArr, length));
            string2.getClass();
            return string2;
        }
        if (!(this instanceof Combined)) {
            t9f.b();
            return null;
        }
        Combined combined = (Combined) this;
        ArrayList arrayList = combined.b;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((UiText) it.next()).a(context));
        }
        CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList2.toArray(new CharSequence[0]);
        String string3 = context.getString(combined.f47190a, Arrays.copyOf(charSequenceArr2, charSequenceArr2.length));
        string3.getClass();
        return string3;
    }
}
