.class final Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0003\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState",
        "Landroid/os/Parcelable;",
        "ui_core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/os/Parcelable;

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/xplatform/ui_core/viewcomponents/smart_background/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/a;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->a:Landroid/os/Parcelable;

    .line 8
    .line 9
    iput p2, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->b:I

    .line 10
    .line 11
    iput p3, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->c:I

    .line 12
    .line 13
    iput-object p4, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->d:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->a:Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget p2, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->c:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->d:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
