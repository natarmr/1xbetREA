.class public final Lorg/xplatform/favorites/impl/di/FavoritesScreen;
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
        "Lorg/xplatform/favorites/impl/di/FavoritesScreen;",
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

.field public final b:La/vcp;

.field public final c:La/tcp;


# direct methods
.method public constructor <init>(ZLa/vcp;La/tcp;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreen;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreen;->b:La/vcp;

    .line 7
    .line 8
    iput-object p3, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreen;->c:La/tcp;

    .line 9
    .line 10
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
    iget-boolean p1, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreen;->a:Z

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreen;->c:La/tcp;

    .line 8
    .line 9
    if-eqz p1, :cond_7

    .line 10
    .line 11
    iget-object p0, p0, Lorg/xplatform/favorites/impl/di/FavoritesScreen;->b:La/vcp;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_5

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    if-eq p0, p1, :cond_4

    .line 21
    .line 22
    const/4 p1, 0x2

    .line 23
    if-eq p0, p1, :cond_2

    .line 24
    .line 25
    const/4 p1, 0x3

    .line 26
    if-ne p0, p1, :cond_1

    .line 27
    .line 28
    sget-object p0, La/g5b;->c2:La/gl5;

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    sget-object v1, La/tcp;->b:La/tcp;

    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance p0, La/g5b;

    .line 38
    .line 39
    invoke-direct {p0}, La/g5b;-><init>()V

    .line 40
    .line 41
    .line 42
    sget-object p1, La/g5b;->d2:[La/iiy;

    .line 43
    .line 44
    aget-object p1, p1, v0

    .line 45
    .line 46
    iget-object v0, p0, La/g5b;->L1:La/yzn0;

    .line 47
    .line 48
    invoke-virtual {v0, p0, p1, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    sget-object p0, La/xra;->X1:La/cl5;

    .line 58
    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    sget-object v1, La/tcp;->b:La/tcp;

    .line 62
    .line 63
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance p0, La/xra;

    .line 67
    .line 68
    invoke-direct {p0}, La/xra;-><init>()V

    .line 69
    .line 70
    .line 71
    sget-object p1, La/xra;->Y1:[La/iiy;

    .line 72
    .line 73
    aget-object p1, p1, v0

    .line 74
    .line 75
    iget-object v0, p0, La/xra;->L1:La/yzn0;

    .line 76
    .line 77
    invoke-virtual {v0, p0, p1, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_4
    sget-object p0, La/b160;->O1:La/evz;

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance p0, La/b160;

    .line 87
    .line 88
    invoke-direct {p0}, La/b160;-><init>()V

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_5
    sget-object p0, La/gnc;->Z1:La/kl5;

    .line 93
    .line 94
    if-nez v1, :cond_6

    .line 95
    .line 96
    sget-object v1, La/tcp;->b:La/tcp;

    .line 97
    .line 98
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    new-instance p0, La/gnc;

    .line 102
    .line 103
    invoke-direct {p0}, La/gnc;-><init>()V

    .line 104
    .line 105
    .line 106
    sget-object p1, La/gnc;->a2:[La/iiy;

    .line 107
    .line 108
    aget-object p1, p1, v0

    .line 109
    .line 110
    iget-object v0, p0, La/gnc;->L1:La/yzn0;

    .line 111
    .line 112
    invoke-virtual {v0, p0, p1, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_7
    sget-object p0, La/gnc;->Z1:La/kl5;

    .line 117
    .line 118
    if-nez v1, :cond_8

    .line 119
    .line 120
    sget-object v1, La/tcp;->b:La/tcp;

    .line 121
    .line 122
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    new-instance p0, La/gnc;

    .line 126
    .line 127
    invoke-direct {p0}, La/gnc;-><init>()V

    .line 128
    .line 129
    .line 130
    sget-object p1, La/gnc;->a2:[La/iiy;

    .line 131
    .line 132
    aget-object p1, p1, v0

    .line 133
    .line 134
    iget-object v0, p0, La/gnc;->L1:La/yzn0;

    .line 135
    .line 136
    invoke-virtual {v0, p0, p1, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 137
    .line 138
    .line 139
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
