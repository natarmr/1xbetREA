.class public final Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen",
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
.field public final a:J

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:J

.field public final h:Z

.field public final i:Z

.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(JZZZLjava/lang/String;Ljava/lang/String;JZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p6, p7, p12}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->a:J

    .line 8
    .line 9
    iput-boolean p3, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->b:Z

    .line 10
    .line 11
    iput-boolean p4, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->c:Z

    .line 12
    .line 13
    iput-boolean p5, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->d:Z

    .line 14
    .line 15
    iput-object p6, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p7, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-wide p8, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->g:J

    .line 20
    .line 21
    iput-boolean p10, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->h:Z

    .line 22
    .line 23
    iput-boolean p11, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->i:Z

    .line 24
    .line 25
    iput-object p12, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->j:Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/m71;->e2:La/rek0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->f:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->j:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v2, La/m71;

    .line 25
    .line 26
    invoke-direct {v2}, La/m71;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object v3, La/m71;->f2:[La/iiy;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    aget-object v4, v3, v4

    .line 33
    .line 34
    iget-object v5, v2, La/m71;->M1:La/r34;

    .line 35
    .line 36
    iget-wide v6, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->a:J

    .line 37
    .line 38
    invoke-virtual {v5, v2, v4, v6, v7}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    aget-object v4, v3, v4

    .line 43
    .line 44
    iget-object v5, v2, La/m71;->N1:La/cgx0;

    .line 45
    .line 46
    iget-boolean v6, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->b:Z

    .line 47
    .line 48
    invoke-virtual {v5, v2, v4, v6}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 49
    .line 50
    .line 51
    const/4 v4, 0x2

    .line 52
    aget-object v4, v3, v4

    .line 53
    .line 54
    iget-object v5, v2, La/m71;->O1:La/cgx0;

    .line 55
    .line 56
    iget-boolean v6, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->c:Z

    .line 57
    .line 58
    invoke-virtual {v5, v2, v4, v6}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 59
    .line 60
    .line 61
    const/4 v4, 0x3

    .line 62
    aget-object v4, v3, v4

    .line 63
    .line 64
    iget-object v5, v2, La/m71;->P1:La/cgx0;

    .line 65
    .line 66
    iget-boolean v6, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->d:Z

    .line 67
    .line 68
    invoke-virtual {v5, v2, v4, v6}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 69
    .line 70
    .line 71
    const/4 v4, 0x4

    .line 72
    aget-object v4, v3, v4

    .line 73
    .line 74
    iget-object v5, v2, La/m71;->Q1:La/yzn0;

    .line 75
    .line 76
    invoke-virtual {v5, v2, v4, p1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x5

    .line 80
    aget-object p1, v3, p1

    .line 81
    .line 82
    iget-object v4, v2, La/m71;->R1:La/phf0;

    .line 83
    .line 84
    invoke-virtual {v4, v2, p1, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p1, 0x6

    .line 88
    aget-object p1, v3, p1

    .line 89
    .line 90
    iget-object v0, v2, La/m71;->S1:La/r34;

    .line 91
    .line 92
    iget-wide v4, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->g:J

    .line 93
    .line 94
    invoke-virtual {v0, v2, p1, v4, v5}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 95
    .line 96
    .line 97
    const/4 p1, 0x7

    .line 98
    aget-object p1, v3, p1

    .line 99
    .line 100
    iget-object v0, v2, La/m71;->U1:La/cgx0;

    .line 101
    .line 102
    iget-boolean v4, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->h:Z

    .line 103
    .line 104
    invoke-virtual {v0, v2, p1, v4}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 105
    .line 106
    .line 107
    const/16 p1, 0x8

    .line 108
    .line 109
    aget-object p1, v3, p1

    .line 110
    .line 111
    iget-object v0, v2, La/m71;->V1:La/cgx0;

    .line 112
    .line 113
    iget-boolean p0, p0, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;->i:Z

    .line 114
    .line 115
    invoke-virtual {v0, v2, p1, p0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 116
    .line 117
    .line 118
    const/16 p0, 0x9

    .line 119
    .line 120
    aget-object p0, v3, p0

    .line 121
    .line 122
    iget-object p1, v2, La/m71;->W1:La/phf0;

    .line 123
    .line 124
    invoke-virtual {p1, v2, p0, v1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object v2
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
