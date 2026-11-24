.class public final Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;
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
        "Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;",
        "Landroid/os/Parcelable;",
        "api"
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
            "Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:La/sip;

.field public final b:La/dam0;

.field public final c:J

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/List;

.field public final g:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/lbi0;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/lbi0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La/sip;La/dam0;JJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V
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
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->a:La/sip;

    .line 20
    .line 21
    iput-object p2, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->b:La/dam0;

    .line 22
    .line 23
    iput-wide p3, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->c:J

    .line 24
    .line 25
    iput-wide p5, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->d:J

    .line 26
    .line 27
    iput-object p7, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->e:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p8, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->f:Ljava/util/List;

    .line 30
    .line 31
    iput-object p9, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->g:Ljava/util/List;

    .line 32
    .line 33
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
    instance-of v1, p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    iget-object v1, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->a:La/sip;

    iget-object v3, p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->a:La/sip;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->b:La/dam0;

    iget-object v3, p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->b:La/dam0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->c:J

    iget-wide v5, p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->d:J

    iget-wide v5, p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->e:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->f:Ljava/util/List;

    iget-object v3, p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->f:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object p0, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->g:Ljava/util/List;

    iget-object p1, p1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->g:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->a:La/sip;

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
    iget-object v2, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->b:La/dam0;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-wide v3, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->c:J

    .line 19
    .line 20
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-wide v2, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->f:Ljava/util/List;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object p0, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->g:Ljava/util/List;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/2addr p0, v0

    .line 49
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "StatisticBlocksParams(feedKind="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->a:La/sip;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", statisticBlockScreenType="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->b:La/dam0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", sportId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->c:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", subSportId="

    .line 34
    .line 35
    const-string v2, ", sportName="

    .line 36
    .line 37
    iget-wide v3, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->d:J

    .line 38
    .line 39
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v1, ", availableStatsIds="

    .line 43
    .line 44
    const-string v2, ", disableStats="

    .line 45
    .line 46
    iget-object v3, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->e:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v4, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->f:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v3, v1, v2, v0, v4}, La/cs0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    const-string v1, ")"

    .line 54
    .line 55
    iget-object p0, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->g:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v0, p0, v1}, La/dw9;->r(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->a:La/sip;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->b:La/dam0;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-wide v0, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->c:J

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 25
    .line 26
    .line 27
    iget-wide v0, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->d:J

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->e:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->f:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {p2, p1}, La/cs0;->t(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/lang/Number;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object p0, p0, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->g:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {p0, p1}, La/cs0;->t(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_1

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    check-cast p2, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    return-void
.end method
