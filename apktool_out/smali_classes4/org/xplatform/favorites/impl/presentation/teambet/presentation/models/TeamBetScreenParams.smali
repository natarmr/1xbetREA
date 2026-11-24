.class public final Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;
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
        "Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;",
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
            "Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:J

.field public final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/l7n0;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/l7n0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(JJJLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    .line 11
    .line 12
    iput-object p7, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p3, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->c:J

    .line 15
    .line 16
    iput-wide p5, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->d:J

    .line 17
    .line 18
    iput-object p8, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->e:Ljava/lang/String;

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
    instance-of v1, p1, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    iget-wide v3, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    iget-wide v5, p1, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->b:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->c:J

    iget-wide v5, p1, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->d:J

    iget-wide v5, p1, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object p0, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->e:Ljava/lang/String;

    iget-object p1, p1, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->e:Ljava/lang/String;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

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
    iget-object v2, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

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
    const-string v0, "TeamBetScreenParams(teamId="

    .line 2
    .line 3
    const-string v1, ", teamName="

    .line 4
    .line 5
    iget-wide v2, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    .line 6
    .line 7
    iget-object v4, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", sportId="

    .line 14
    .line 15
    const-string v2, ", subSportId="

    .line 16
    .line 17
    iget-wide v3, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->c:J

    .line 18
    .line 19
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ", statId="

    .line 23
    .line 24
    iget-wide v2, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->d:J

    .line 25
    .line 26
    iget-object p0, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v2, v3, v1, p0}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p0, ")"

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v0, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p0, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->e:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
