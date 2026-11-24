.class public final Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;",
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
.field public final a:La/r040;

.field public final b:Z

.field public final c:Z

.field public final d:Z


# direct methods
.method public constructor <init>(La/r040;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;->a:La/r040;

    .line 5
    .line 6
    iput-boolean p2, p0, Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;->d:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;->d:Z

    .line 5
    .line 6
    iget-boolean v0, p0, Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;->c:Z

    .line 7
    .line 8
    iget-boolean v1, p0, Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;->b:Z

    .line 9
    .line 10
    iget-object p0, p0, Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;->a:La/r040;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p1, La/bz30;->P1:La/wsz;

    .line 15
    .line 16
    new-instance v2, La/q040;

    .line 17
    .line 18
    invoke-direct {v2, p0, v1, v0}, La/q040;-><init>(La/r040;ZZ)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance p0, La/bz30;

    .line 25
    .line 26
    invoke-direct {p0}, La/bz30;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object p1, La/bz30;->Q1:[La/iiy;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    aget-object p1, p1, v0

    .line 33
    .line 34
    iget-object v0, p0, La/bz30;->K1:La/yzn0;

    .line 35
    .line 36
    invoke-virtual {v0, p0, p1, v2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_0
    sget-object p1, La/dw10;->V1:La/uuz;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance p1, La/dw10;

    .line 46
    .line 47
    invoke-direct {p1}, La/dw10;-><init>()V

    .line 48
    .line 49
    .line 50
    sget-object v2, La/dw10;->W1:[La/iiy;

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    aget-object v3, v2, v3

    .line 54
    .line 55
    iget-object v4, p1, La/dw10;->P1:La/yzn0;

    .line 56
    .line 57
    invoke-virtual {v4, p1, v3, p0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x2

    .line 61
    aget-object p0, v2, p0

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v3, p1, La/dw10;->S1:La/yzn0;

    .line 68
    .line 69
    invoke-virtual {v3, p1, p0, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x3

    .line 73
    aget-object p0, v2, p0

    .line 74
    .line 75
    iget-object v1, p1, La/dw10;->U1:La/cgx0;

    .line 76
    .line 77
    invoke-virtual {v1, p1, p0, v0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 78
    .line 79
    .line 80
    return-object p1
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
