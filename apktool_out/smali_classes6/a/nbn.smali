.class public final synthetic La/nbn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/nbn;->a:B

    iput-object p1, p0, La/nbn;->b:Ljava/lang/Object;

    iput-object p2, p0, La/nbn;->c:Ljava/lang/Object;

    iput-object p3, p0, La/nbn;->d:Ljava/lang/Object;

    iput-object p4, p0, La/nbn;->e:Ljava/lang/Object;

    iput-object p5, p0, La/nbn;->f:Ljava/lang/Object;

    iput-object p6, p0, La/nbn;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-byte v0, p0, La/nbn;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/nbn;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/nbn;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/nbn;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/nbn;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, La/nbn;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p0, p0, La/nbn;->b:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, La/kie0;

    .line 19
    .line 20
    check-cast v5, Ljava/util/ArrayList;

    .line 21
    .line 22
    check-cast v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    check-cast v3, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;

    .line 25
    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    check-cast v1, La/b8t;

    .line 29
    .line 30
    sget-object v0, La/b8t;->Q1:[La/iiy;

    .line 31
    .line 32
    iget v0, p0, La/kie0;->a:I

    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    const/4 v7, 0x1

    .line 39
    if-ge v0, v6, :cond_0

    .line 40
    .line 41
    iget v0, p0, La/kie0;->a:I

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-ge v0, v6, :cond_0

    .line 48
    .line 49
    iget v0, p0, La/kie0;->a:I

    .line 50
    .line 51
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/k7t;

    .line 56
    .line 57
    iget v5, p0, La/kie0;->a:I

    .line 58
    .line 59
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, La/k7t;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    iput v5, v3, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->g1:I

    .line 76
    .line 77
    iget-object v5, v0, La/k7t;->e:Ljava/util/List;

    .line 78
    .line 79
    invoke-static {v5}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->r(Ljava/util/List;)Ljava/util/ArrayList;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iput-object v5, v3, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->n:Ljava/util/List;

    .line 84
    .line 85
    iget-object v5, v0, La/k7t;->d:Ljava/util/List;

    .line 86
    .line 87
    iput-object v5, v3, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->f1:Ljava/util/List;

    .line 88
    .line 89
    invoke-virtual {v3, v0, v4, v2, v7}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->b(La/k7t;La/k7t;Ljava/lang/String;Z)V

    .line 90
    .line 91
    .line 92
    :cond_0
    invoke-virtual {v3}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->getShotsValue$games_mania()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v1}, La/b8t;->H0()La/c8t;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iget-object v2, v2, La/c8t;->f:Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;

    .line 101
    .line 102
    const-wide/16 v4, 0x1f4

    .line 103
    .line 104
    invoke-virtual {v2, v4, v5, v0}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->b(JLjava/util/List;)V

    .line 105
    .line 106
    .line 107
    const-wide/16 v4, 0x3e8

    .line 108
    .line 109
    invoke-virtual {v3, v4, v5}, Landroid/view/View;->postInvalidateDelayed(J)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, La/b8t;->I0()La/a9t;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, La/a9t;->y()V

    .line 117
    .line 118
    .line 119
    iget v0, p0, La/kie0;->a:I

    .line 120
    .line 121
    add-int/2addr v0, v7

    .line 122
    iput v0, p0, La/kie0;->a:I

    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_0
    check-cast p0, La/kki;

    .line 126
    .line 127
    check-cast v5, La/s0a;

    .line 128
    .line 129
    check-cast v4, La/s0a;

    .line 130
    .line 131
    check-cast v3, La/cmn0;

    .line 132
    .line 133
    check-cast v2, La/cmn0;

    .line 134
    .line 135
    move-object v6, v1

    .line 136
    check-cast v6, Ljava/util/Map$Entry;

    .line 137
    .line 138
    move-object v1, v5

    .line 139
    move-object v5, v2

    .line 140
    move-object v2, v1

    .line 141
    move-object v1, v4

    .line 142
    move-object v4, v3

    .line 143
    move-object v3, v1

    .line 144
    move-object v1, p0

    .line 145
    invoke-virtual/range {v1 .. v6}, La/kki;->b(La/s0a;La/s0a;La/cmn0;La/cmn0;Ljava/util/Map$Entry;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
