.class public final Lorg/xplatform/ufc/api/game/UfcGameParams;
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
        "Lorg/xplatform/ufc/api/game/UfcGameParams;",
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
            "Lorg/xplatform/ufc/api/game/UfcGameParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:Ljava/lang/String;

.field public final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/rdr0;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/rdr0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/xplatform/ufc/api/game/UfcGameParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(IJJJJLjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p2, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->a:J

    .line 8
    .line 9
    iput-boolean p11, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->b:Z

    .line 10
    .line 11
    iput-wide p4, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->c:J

    .line 12
    .line 13
    iput-wide p6, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->d:J

    .line 14
    .line 15
    iput-wide p8, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->e:J

    .line 16
    .line 17
    iput-object p10, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput p1, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->g:I

    .line 20
    .line 21
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
    instance-of v1, p1, Lorg/xplatform/ufc/api/game/UfcGameParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/ufc/api/game/UfcGameParams;

    iget-wide v3, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->a:J

    iget-wide v5, p1, Lorg/xplatform/ufc/api/game/UfcGameParams;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->b:Z

    iget-boolean v3, p1, Lorg/xplatform/ufc/api/game/UfcGameParams;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->c:J

    iget-wide v5, p1, Lorg/xplatform/ufc/api/game/UfcGameParams;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->d:J

    iget-wide v5, p1, Lorg/xplatform/ufc/api/game/UfcGameParams;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->e:J

    iget-wide v5, p1, Lorg/xplatform/ufc/api/game/UfcGameParams;->e:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->f:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/ufc/api/game/UfcGameParams;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget p0, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->g:I

    iget p1, p1, Lorg/xplatform/ufc/api/game/UfcGameParams;->g:I

    if-eq p0, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-boolean v2, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->e:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget p0, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->g:I

    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "UfcGameParams(gameId="

    .line 2
    .line 3
    const-string v1, ", live="

    .line 4
    .line 5
    iget-wide v2, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->a:J

    .line 6
    .line 7
    iget-boolean v4, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->b:Z

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/kng0;->r(JLjava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", sportId="

    .line 14
    .line 15
    const-string v2, ", subGameId="

    .line 16
    .line 17
    iget-wide v3, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->c:J

    .line 18
    .line 19
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-wide v1, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->d:J

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", champId="

    .line 28
    .line 29
    const-string v2, ", champName="

    .line 30
    .line 31
    iget-wide v3, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->e:J

    .line 32
    .line 33
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v1, ", globalChampId="

    .line 37
    .line 38
    const-string v2, ")"

    .line 39
    .line 40
    iget v3, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->g:I

    .line 41
    .line 42
    iget-object p0, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->f:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v3, p0, v1, v2, v0}, La/brm0;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v0, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->a:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean p2, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->b:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->e:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p0, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->g:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
