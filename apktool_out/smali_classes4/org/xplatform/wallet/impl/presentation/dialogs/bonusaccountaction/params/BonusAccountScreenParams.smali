.class public final Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;",
        "Landroid/os/Parcelable;",
        "impl"
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
            "Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/qo7;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, La/qo7;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->b:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;

    iget-object v1, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->a:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object p0, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->b:Ljava/util/List;

    iget-object p1, p1, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->b:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->b:Ljava/util/List;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ", accounts="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    const-string v2, "BonusAccountScreenParams(requestKey="

    .line 6
    .line 7
    iget-object v3, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, p0, v1}, La/ohs0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {p0, p1}, La/cs0;->t(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/os/Parcelable;

    .line 26
    .line 27
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method
