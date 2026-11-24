.class public final Lorg/xplatform/sportgame/advanced/impl/navigation/SportGameAdvancedScreenFactoryImpl$getScreen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
.implements Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenFactory$SportGameAdvancedScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "org/xplatform/sportgame/advanced/impl/navigation/SportGameAdvancedScreenFactoryImpl$getScreen$1",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
        "Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenFactory$SportGameAdvancedScreen;",
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
.field public final synthetic a:Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;


# direct methods
.method public constructor <init>(La/gle0;Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lorg/xplatform/sportgame/advanced/impl/navigation/SportGameAdvancedScreenFactoryImpl$getScreen$1;->a:Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/dnr;->c2:La/ddk;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p1, La/dnr;

    .line 10
    .line 11
    invoke-direct {p1}, La/dnr;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/dnr;->d2:[La/iiy;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    aget-object v0, v0, v1

    .line 18
    .line 19
    iget-object v1, p1, La/dnr;->Z1:La/khf0;

    .line 20
    .line 21
    iget-object p0, p0, Lorg/xplatform/sportgame/advanced/impl/navigation/SportGameAdvancedScreenFactoryImpl$getScreen$1;->a:Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;

    .line 22
    .line 23
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/advanced/impl/navigation/SportGameAdvancedScreenFactoryImpl$getScreen$1;->a:Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;

    .line 2
    .line 3
    iget-wide v0, p0, Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;->c:J

    .line 4
    .line 5
    const-string p0, "GameAdvancedScreenFragment"

    .line 6
    .line 7
    invoke-static {v0, v1, p0}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
