.class public final Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;",
        "Landroid/os/Parcelable;",
        "core"
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
            "Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Long;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/l7n0;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, La/l7n0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->d:Ljava/lang/Long;

    .line 14
    .line 15
    iput-object p5, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->f:Ljava/util/List;

    .line 18
    .line 19
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
    instance-of v1, p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    iget-object v1, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->a:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->b:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->c:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->d:Ljava/lang/Long;

    iget-object v3, p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->d:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->e:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object p0, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->f:Ljava/util/List;

    iget-object p1, p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->f:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->c:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->d:Ljava/lang/Long;

    if-nez v2, :cond_3

    move v2, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->e:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object p0, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->f:Ljava/util/List;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr p0, v1

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", betNumber="

    .line 2
    .line 3
    const-string v1, ", requestKey="

    .line 4
    .line 5
    const-string v2, "SuccessBetAlertModel(betType="

    .line 6
    .line 7
    iget-object v3, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", balanceId="

    .line 16
    .line 17
    const-string v2, ", betMode="

    .line 18
    .line 19
    iget-object v3, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->d:Ljava/lang/Long;

    .line 20
    .line 21
    iget-object v4, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v3, v4, v1, v2, v0}, La/h97;->w(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", betInfoList="

    .line 27
    .line 28
    const-string v2, ")"

    .line 29
    .line 30
    iget-object v3, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p0, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->f:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v3, v1, v2, v0, p0}, La/rw2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->d:Ljava/lang/Long;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x1

    .line 29
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v0, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->e:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->f:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {p0, p1}, La/cs0;->t(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Landroid/os/Parcelable;

    .line 61
    .line 62
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    return-void
.end method
