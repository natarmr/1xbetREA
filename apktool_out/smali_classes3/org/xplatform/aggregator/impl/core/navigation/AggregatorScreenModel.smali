.class public final Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;
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
        "Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;",
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
            "Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:La/tm1;

.field public final e:La/wgh0;

.field public final f:J

.field public final g:J

.field public final h:Ljava/lang/String;

.field public final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ibw0;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ibw0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;Z)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->a:Ljava/lang/String;

    .line 100
    iput-object p2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->b:Ljava/lang/String;

    .line 101
    iput-wide p3, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->c:J

    .line 102
    iput-object p5, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    .line 103
    iput-object p6, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->e:La/wgh0;

    .line 104
    iput-wide p7, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->f:J

    .line 105
    iput-wide p9, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->g:J

    .line 106
    iput-object p11, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->h:Ljava/lang/String;

    .line 107
    iput-boolean p12, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->i:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V
    .locals 11

    .line 1
    move/from16 v0, p13

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object p1, v2

    .line 10
    :cond_0
    and-int/lit8 v1, v0, 0x2

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    move-object p2, v2

    .line 15
    :cond_1
    and-int/lit8 v1, v0, 0x4

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    const-wide/16 v3, -0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    move-wide v3, p3

    .line 23
    :goto_0
    and-int/lit8 v1, v0, 0x8

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    sget-object v1, La/gm1;->a:La/gm1;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_3
    move-object/from16 v1, p5

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v5, v0, 0x10

    .line 33
    .line 34
    if-eqz v5, :cond_4

    .line 35
    .line 36
    sget-object v5, La/wgh0;->Y:La/wgh0;

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_4
    move-object/from16 v5, p6

    .line 40
    .line 41
    :goto_2
    and-int/lit8 v6, v0, 0x20

    .line 42
    .line 43
    const-wide/16 v7, -0x2

    .line 44
    .line 45
    if-eqz v6, :cond_5

    .line 46
    .line 47
    sget-object v6, La/s0s;->b:La/s0s;

    .line 48
    .line 49
    move-wide v9, v7

    .line 50
    goto :goto_3

    .line 51
    :cond_5
    move-wide/from16 v9, p7

    .line 52
    .line 53
    :goto_3
    and-int/lit8 v6, v0, 0x40

    .line 54
    .line 55
    if-eqz v6, :cond_6

    .line 56
    .line 57
    sget-object v6, La/s0s;->b:La/s0s;

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_6
    move-wide/from16 v7, p9

    .line 61
    .line 62
    :goto_4
    and-int/lit16 v6, v0, 0x80

    .line 63
    .line 64
    if-eqz v6, :cond_7

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_7
    move-object/from16 v2, p11

    .line 68
    .line 69
    :goto_5
    and-int/lit16 v0, v0, 0x100

    .line 70
    .line 71
    if-eqz v0, :cond_8

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    move/from16 p13, v0

    .line 75
    .line 76
    :goto_6
    move-object p3, p2

    .line 77
    move-object/from16 p6, v1

    .line 78
    .line 79
    move-object/from16 p12, v2

    .line 80
    .line 81
    move-wide p4, v3

    .line 82
    move-object/from16 p7, v5

    .line 83
    .line 84
    move-wide/from16 p10, v7

    .line 85
    .line 86
    move-wide/from16 p8, v9

    .line 87
    .line 88
    move-object p2, p1

    .line 89
    move-object p1, p0

    .line 90
    goto :goto_7

    .line 91
    :cond_8
    move/from16 p13, p12

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :goto_7
    invoke-direct/range {p1 .. p13}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;Z)V

    .line 95
    .line 96
    .line 97
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
    instance-of v1, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    iget-object v1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->a:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->b:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->c:J

    iget-wide v5, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    iget-object v3, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->e:La/wgh0;

    iget-object v3, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->e:La/wgh0;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->f:J

    iget-wide v5, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->f:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->g:J

    iget-wide v5, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->g:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->h:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean p0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->i:Z

    iget-boolean p1, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->i:Z

    if-eq p0, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->e:La/wgh0;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-wide v2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->f:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-wide v2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->g:J

    .line 45
    .line 46
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->h:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean p0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->i:Z

    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    add-int/2addr p0, v0

    .line 63
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", subtitle="

    .line 2
    .line 3
    const-string v1, ", partitionId="

    .line 4
    .line 5
    const-string v2, "AggregatorScreenModel(title="

    .line 6
    .line 7
    iget-object v3, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->c:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", screenType="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", searchScreenType="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->e:La/wgh0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", categoryId="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-wide v1, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->f:J

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", partType="

    .line 51
    .line 52
    const-string v2, ", subStringValue="

    .line 53
    .line 54
    iget-wide v3, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->g:J

    .line 55
    .line 56
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", openedFromMenu="

    .line 60
    .line 61
    const-string v2, ")"

    .line 62
    .line 63
    iget-object v3, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->h:Ljava/lang/String;

    .line 64
    .line 65
    iget-boolean p0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->i:Z

    .line 66
    .line 67
    invoke-static {v3, v1, v2, v0, p0}, Lc;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->e:La/wgh0;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->f:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->g:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->i:Z

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
