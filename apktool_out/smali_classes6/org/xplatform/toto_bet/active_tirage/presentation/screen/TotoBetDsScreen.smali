.class public final Lorg/xplatform/toto_bet/active_tirage/presentation/screen/TotoBetDsScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/toto_bet/active_tirage/presentation/screen/TotoBetDsScreen;",
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
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lorg/xplatform/toto_bet/active_tirage/presentation/screen/TotoBetDsScreen;->a:Z

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
    iget-boolean p0, p0, Lorg/xplatform/toto_bet/active_tirage/presentation/screen/TotoBetDsScreen;->a:Z

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const-string v0, "NONE"

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    sget-object p0, La/phr0;->W1:La/y2m0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p0, La/phr0;

    .line 17
    .line 18
    invoke-direct {p0}, La/phr0;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v1, La/phr0;->X1:[La/iiy;

    .line 22
    .line 23
    aget-object p1, v1, p1

    .line 24
    .line 25
    iget-object v1, p0, La/phr0;->L1:La/phf0;

    .line 26
    .line 27
    invoke-virtual {v1, p0, p1, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    sget-object p0, La/pir0;->W1:La/j6m0;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance p0, La/pir0;

    .line 37
    .line 38
    invoke-direct {p0}, La/pir0;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object v1, La/pir0;->X1:[La/iiy;

    .line 42
    .line 43
    aget-object p1, v1, p1

    .line 44
    .line 45
    iget-object v1, p0, La/pir0;->L1:La/phf0;

    .line 46
    .line 47
    invoke-virtual {v1, p0, p1, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
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
