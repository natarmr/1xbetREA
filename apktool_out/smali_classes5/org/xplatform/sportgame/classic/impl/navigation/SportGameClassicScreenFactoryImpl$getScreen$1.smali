.class public final Lorg/xplatform/sportgame/classic/impl/navigation/SportGameClassicScreenFactoryImpl$getScreen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
.implements Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenFactory$SportGameClassicScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "org/xplatform/sportgame/classic/impl/navigation/SportGameClassicScreenFactoryImpl$getScreen$1",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
        "Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenFactory$SportGameClassicScreen;",
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
.field public final synthetic a:La/r46;

.field public final synthetic b:Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;


# direct methods
.method public constructor <init>(La/r46;Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/navigation/SportGameClassicScreenFactoryImpl$getScreen$1;->a:La/r46;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/sportgame/classic/impl/navigation/SportGameClassicScreenFactoryImpl$getScreen$1;->b:Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 7
    .line 8
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
    iget-object p1, p0, Lorg/xplatform/sportgame/classic/impl/navigation/SportGameClassicScreenFactoryImpl$getScreen$1;->a:La/r46;

    .line 5
    .line 6
    iget-object p1, p1, La/r46;->a:La/r9u;

    .line 7
    .line 8
    sget-object v0, La/ygp;->o1:La/ygp;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p1, p1, La/r9u;->a:La/j1q0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, La/j1q0;->a:La/m1q0;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v0, 0x1

    .line 25
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/navigation/SportGameClassicScreenFactoryImpl$getScreen$1;->b:Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    sget-object p1, La/j2s;->b2:La/xak;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance p1, La/j2s;

    .line 35
    .line 36
    invoke-direct {p1}, La/j2s;-><init>()V

    .line 37
    .line 38
    .line 39
    sget-object v1, La/j2s;->c2:[La/iiy;

    .line 40
    .line 41
    aget-object v0, v1, v0

    .line 42
    .line 43
    iget-object v1, p1, La/j2s;->Z1:La/khf0;

    .line 44
    .line 45
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    sget-object p1, La/gbl0;->c2:La/lme0;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-instance p1, La/gbl0;

    .line 55
    .line 56
    invoke-direct {p1}, La/gbl0;-><init>()V

    .line 57
    .line 58
    .line 59
    sget-object v1, La/gbl0;->d2:[La/iiy;

    .line 60
    .line 61
    aget-object v0, v1, v0

    .line 62
    .line 63
    iget-object v1, p1, La/gbl0;->X1:La/khf0;

    .line 64
    .line 65
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 66
    .line 67
    .line 68
    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/navigation/SportGameClassicScreenFactoryImpl$getScreen$1;->b:Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;

    .line 2
    .line 3
    iget-wide v0, p0, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenParams;->c:J

    .line 4
    .line 5
    const-string p0, "GameScreenFragment"

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
