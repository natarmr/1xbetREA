package org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards.model;

import a.dw9;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/model/DropDownCard;", "Landroid/os/Parcelable;", "LeftCard", "RightCard", "Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/model/DropDownCard$LeftCard;", "Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/model/DropDownCard$RightCard;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface DropDownCard extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/model/DropDownCard$LeftCard;", "Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/model/DropDownCard;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LeftCard implements DropDownCard {
        public static final Parcelable.Creator<LeftCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46344a;
        public final int b;

        public LeftCard(String str, int i) {
            str.getClass();
            this.f46344a = str;
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeftCard)) {
                return false;
            }
            LeftCard leftCard = (LeftCard) obj;
            return Intrinsics.d(this.f46344a, leftCard.f46344a) && this.b == leftCard.b;
        }

        @Override // org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards.model.DropDownCard
        /* JADX INFO: renamed from: getIcon, reason: from getter */
        public final int getB() {
            return this.b;
        }

        @Override // org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards.model.DropDownCard
        /* JADX INFO: renamed from: getText, reason: from getter */
        public final String getF46345a() {
            return this.f46344a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f46344a.hashCode() * 31);
        }

        public final String toString() {
            return dw9.n(this.b, "LeftCard(text=", this.f46344a, ", icon=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46344a);
            parcel.writeInt(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/model/DropDownCard$RightCard;", "Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/model/DropDownCard;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RightCard implements DropDownCard {
        public static final Parcelable.Creator<RightCard> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46345a;
        public final int b;

        public RightCard(String str, int i) {
            str.getClass();
            this.f46345a = str;
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RightCard)) {
                return false;
            }
            RightCard rightCard = (RightCard) obj;
            return Intrinsics.d(this.f46345a, rightCard.f46345a) && this.b == rightCard.b;
        }

        @Override // org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards.model.DropDownCard
        /* JADX INFO: renamed from: getIcon, reason: from getter */
        public final int getB() {
            return this.b;
        }

        @Override // org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards.model.DropDownCard
        /* JADX INFO: renamed from: getText, reason: from getter */
        public final String getF46345a() {
            return this.f46345a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f46345a.hashCode() * 31);
        }

        public final String toString() {
            return dw9.n(this.b, "RightCard(text=", this.f46345a, ", icon=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46345a);
            parcel.writeInt(this.b);
        }
    }

    /* JADX INFO: renamed from: getIcon */
    int getB();

    /* JADX INFO: renamed from: getText */
    String getF46345a();
}
