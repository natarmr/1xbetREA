.class public final Lorg/xplatform/search/impl/navigation/SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;
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
        "org/xplatform/search/impl/navigation/SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1",
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
.field public final synthetic a:La/bhh0;


# direct methods
.method public constructor <init>(La/bhh0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/search/impl/navigation/SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;->a:La/bhh0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/search/impl/navigation/SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;->a:La/bhh0;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v0, 0x2

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz p1, :cond_5

    .line 13
    .line 14
    if-eq p1, v1, :cond_4

    .line 15
    .line 16
    if-eq p1, v0, :cond_3

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    if-eq p1, v2, :cond_2

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    if-eq p1, v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x5

    .line 25
    if-ne p1, v2, :cond_0

    .line 26
    .line 27
    new-instance p1, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$Default;

    .line 28
    .line 29
    sget-object v2, La/bfo0;->d:La/bfo0;

    .line 30
    .line 31
    invoke-direct {p1, v2, p0}, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$Default;-><init>(La/bfo0;La/bhh0;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0

    .line 40
    :cond_1
    sget-object p1, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$FavoriteTeam;->a:Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$FavoriteTeam;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    sget-object p1, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$FromBetSlip;->a:Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$FromBetSlip;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    new-instance p1, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$Default;

    .line 47
    .line 48
    sget-object v2, La/bfo0;->c:La/bfo0;

    .line 49
    .line 50
    invoke-direct {p1, v2, p0}, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$Default;-><init>(La/bfo0;La/bhh0;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    new-instance p1, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$Default;

    .line 55
    .line 56
    sget-object v2, La/bfo0;->b:La/bfo0;

    .line 57
    .line 58
    invoke-direct {p1, v2, p0}, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$Default;-><init>(La/bfo0;La/bhh0;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_5
    new-instance p1, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$Default;

    .line 63
    .line 64
    sget-object v2, La/bfo0;->a:La/bfo0;

    .line 65
    .line 66
    invoke-direct {p1, v2, p0}, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$Default;-><init>(La/bfo0;La/bhh0;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object p0, La/g8v;->P1:La/rqt;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance p0, La/g8v;

    .line 75
    .line 76
    invoke-direct {p0}, La/g8v;-><init>()V

    .line 77
    .line 78
    .line 79
    sget-object v2, La/g8v;->Q1:[La/iiy;

    .line 80
    .line 81
    aget-object v1, v2, v1

    .line 82
    .line 83
    iget-object v3, p0, La/g8v;->M1:La/khf0;

    .line 84
    .line 85
    invoke-virtual {v3, p0, v1, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 86
    .line 87
    .line 88
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, La/g8v;->N1:La/phf0;

    .line 100
    .line 101
    aget-object v0, v2, v0

    .line 102
    .line 103
    invoke-virtual {v1, p0, v0, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
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
