.class public final Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
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


# instance fields
.field public final synthetic a:J

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Z


# direct methods
.method public constructor <init>(JJJJLjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->b:J

    .line 7
    .line 8
    iput-object p9, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-wide p5, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->d:J

    .line 11
    .line 12
    iput-wide p7, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->e:J

    .line 13
    .line 14
    iput-boolean p10, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->f:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/gns;->R1:La/pek;

    .line 5
    .line 6
    new-instance v0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;

    .line 7
    .line 8
    iget-wide v7, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->e:J

    .line 9
    .line 10
    iget-boolean v10, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->f:Z

    .line 11
    .line 12
    iget-wide v1, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->a:J

    .line 13
    .line 14
    iget-wide v3, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->b:J

    .line 15
    .line 16
    iget-wide v5, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->d:J

    .line 17
    .line 18
    iget-object v9, p0, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-direct/range {v0 .. v10}, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;-><init>(JJJJLjava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance p0, La/gns;

    .line 27
    .line 28
    invoke-direct {p0}, La/gns;-><init>()V

    .line 29
    .line 30
    .line 31
    sget-object p1, La/gns;->S1:[La/iiy;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    aget-object p1, p1, v1

    .line 35
    .line 36
    iget-object v1, p0, La/gns;->Q1:La/khf0;

    .line 37
    .line 38
    invoke-virtual {v1, p0, p1, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 39
    .line 40
    .line 41
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, La/ufx;->C(La/m7h0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
