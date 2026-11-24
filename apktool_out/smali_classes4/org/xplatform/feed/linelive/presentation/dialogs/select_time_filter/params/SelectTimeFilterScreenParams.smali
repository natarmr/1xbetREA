.class public final Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;
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
        "Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;",
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
            "Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:La/ygq0;

.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:Z

.field public final f:Ljava/util/Date;

.field public final g:Z

.field public final h:La/jhq0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/sne0;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/sne0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La/ygq0;JJZZLjava/util/Date;ZLa/jhq0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->a:La/ygq0;

    .line 14
    .line 15
    iput-wide p2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->b:J

    .line 16
    .line 17
    iput-wide p4, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->c:J

    .line 18
    .line 19
    iput-boolean p6, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->d:Z

    .line 20
    .line 21
    iput-boolean p7, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->e:Z

    .line 22
    .line 23
    iput-object p8, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->f:Ljava/util/Date;

    .line 24
    .line 25
    iput-boolean p9, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->g:Z

    .line 26
    .line 27
    iput-object p10, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->h:La/jhq0;

    .line 28
    .line 29
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
    instance-of v1, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    iget-object v1, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->a:La/ygq0;

    iget-object v3, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->a:La/ygq0;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->b:J

    iget-wide v5, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->c:J

    iget-wide v5, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->d:Z

    iget-boolean v3, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->e:Z

    iget-boolean v3, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->f:Ljava/util/Date;

    iget-object v3, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->f:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->g:Z

    iget-boolean v3, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object p0, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->h:La/jhq0;

    iget-object p1, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->h:La/jhq0;

    if-eq p0, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->a:La/ygq0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-wide v2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->f:Ljava/util/Date;

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/brm0;->i(Ljava/util/Date;II)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object p0, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->h:La/jhq0;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SelectTimeFilterScreenParams(timeFilter="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->a:La/ygq0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", startTime="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->b:J

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", endTime="

    .line 24
    .line 25
    const-string v2, ", isAscendingDate="

    .line 26
    .line 27
    iget-wide v3, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->c:J

    .line 28
    .line 29
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v1, ", cyber="

    .line 33
    .line 34
    const-string v2, ", dateLimit="

    .line 35
    .line 36
    iget-boolean v3, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->d:Z

    .line 37
    .line 38
    iget-boolean v4, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->e:Z

    .line 39
    .line 40
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->f:Ljava/util/Date;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", limit="

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-boolean v1, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->g:Z

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, ", timeFilterPeriodType="

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->h:La/jhq0;

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p0, ")"

    .line 69
    .line 70
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->a:La/ygq0;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->b:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean p2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->d:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->e:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->f:Ljava/util/Date;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-boolean p2, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->g:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p0, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->h:La/jhq0;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
