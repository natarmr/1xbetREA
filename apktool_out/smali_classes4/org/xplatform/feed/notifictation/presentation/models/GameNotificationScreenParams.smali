.class public final Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;
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
        "Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;",
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
            "Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:J

.field public final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/yoo;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/yoo;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(JJJJLjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->a:J

    .line 8
    .line 9
    iput-wide p3, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->b:J

    .line 10
    .line 11
    iput-object p9, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-wide p5, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->d:J

    .line 14
    .line 15
    iput-wide p7, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->e:J

    .line 16
    .line 17
    iput-boolean p10, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->f:Z

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
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;

    iget-wide v3, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->a:J

    iget-wide v5, p1, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->b:J

    iget-wide v5, p1, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->c:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->d:J

    iget-wide v5, p1, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->e:J

    iget-wide v5, p1, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->e:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-boolean p0, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->f:Z

    iget-boolean p1, p1, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->f:Z

    if-eq p0, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->a:J

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
    iget-wide v2, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->e:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean p0, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->f:Z

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    const-string v0, "GameNotificationScreenParams(gameId="

    .line 2
    .line 3
    const-string v1, ", constId="

    .line 4
    .line 5
    iget-wide v2, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ", matchName="

    .line 12
    .line 13
    iget-wide v2, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->b:J

    .line 14
    .line 15
    iget-object v4, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, ", sportId="

    .line 21
    .line 22
    const-string v2, ", subSportId="

    .line 23
    .line 24
    iget-wide v3, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, ", live="

    .line 30
    .line 31
    iget-wide v2, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->e:J

    .line 32
    .line 33
    iget-boolean p0, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->f:Z

    .line 34
    .line 35
    invoke-static {v2, v3, v1, v0, p0}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 36
    .line 37
    .line 38
    const-string p0, ")"

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v0, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->a:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->b:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->e:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean p0, p0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->f:Z

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
