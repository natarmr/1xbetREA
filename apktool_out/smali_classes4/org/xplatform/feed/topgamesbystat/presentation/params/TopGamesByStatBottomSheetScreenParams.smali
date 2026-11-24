.class public final Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;
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
        "Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;",
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
            "Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Z

.field public final b:Ljava/util/List;

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/l7n0;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/l7n0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(JJJLjava/lang/String;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-boolean p9, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->a:Z

    .line 11
    .line 12
    iput-object p8, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->b:Ljava/util/List;

    .line 13
    .line 14
    iput-wide p1, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->c:J

    .line 15
    .line 16
    iput-wide p3, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->d:J

    .line 17
    .line 18
    iput-wide p5, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->e:J

    .line 19
    .line 20
    iput-object p7, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->f:Ljava/lang/String;

    .line 21
    .line 22
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
    instance-of v1, p1, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;

    iget-boolean v1, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->a:Z

    iget-boolean v3, p1, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->b:Ljava/util/List;

    iget-object v3, p1, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->c:J

    iget-wide v5, p1, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->d:J

    iget-wide v5, p1, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->e:J

    iget-wide v5, p1, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->e:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object p0, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->f:Ljava/lang/String;

    iget-object p1, p1, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->f:Ljava/lang/String;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-object v2, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->e:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object p0, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TopGamesByStatBottomSheetScreenParams(live="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", sportIds="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", gameId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->c:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", gameSportId="

    .line 34
    .line 35
    const-string v2, ", subSportId="

    .line 36
    .line 37
    iget-wide v3, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->d:J

    .line 38
    .line 39
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v1, ", screenType="

    .line 43
    .line 44
    iget-wide v2, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->e:J

    .line 45
    .line 46
    iget-object p0, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->f:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v2, v3, v1, p0}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string p0, ")"

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p2, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->a:Z

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {p2, p1}, La/cs0;->t(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-wide v0, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->c:J

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 38
    .line 39
    .line 40
    iget-wide v0, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->d:J

    .line 41
    .line 42
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 43
    .line 44
    .line 45
    iget-wide v0, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->e:J

    .line 46
    .line 47
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;->f:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
