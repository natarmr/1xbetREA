.class public final Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;
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
        "Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;",
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
            "Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:J

.field public final d:Z

.field public final e:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/sne0;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/sne0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZJZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p2, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->b:Z

    .line 13
    .line 14
    iput-wide p3, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->c:J

    .line 15
    .line 16
    iput-boolean p5, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->d:Z

    .line 17
    .line 18
    iput-object p6, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->e:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    iget-object v1, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->a:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->b:Z

    iget-boolean v3, p1, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->c:J

    iget-wide v5, p1, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->d:Z

    iget-boolean v3, p1, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object p0, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->e:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    iget-object p1, p1, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->e:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    if-eq p0, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-boolean v2, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->e:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isAutoSale="

    .line 2
    .line 3
    const-string v1, ", balanceId="

    .line 4
    .line 5
    const-string v2, "SaleScreenModel(betId="

    .line 6
    .line 7
    iget-object v3, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/brm0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", isUpdateOnExit="

    .line 16
    .line 17
    iget-wide v2, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->c:J

    .line 18
    .line 19
    iget-boolean v4, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->d:Z

    .line 20
    .line 21
    invoke-static {v2, v3, v1, v0, v4}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", historyTypeModel="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->e:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, ")"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->b:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean v0, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->d:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p0, p0, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;->e:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    invoke-virtual {p0, p1, p2}, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
