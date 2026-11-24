.class public final La/gh2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:La/hh2;

.field public j:Ljava/util/Iterator;

.field public k:B

.field public final synthetic l:La/hh2;

.field public final synthetic m:Ljava/util/List;


# direct methods
.method public constructor <init>(La/hh2;Ljava/util/List;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gh2;->l:La/hh2;

    .line 2
    .line 3
    iput-object p2, p0, La/gh2;->m:Ljava/util/List;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/gh2;

    .line 2
    .line 3
    iget-object v1, p0, La/gh2;->l:La/hh2;

    .line 4
    .line 5
    iget-object p0, p0, La/gh2;->m:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, La/gh2;-><init>(La/hh2;Ljava/util/List;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/gh2;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/gh2;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/gh2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/gh2;->k:B

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v5, :cond_1

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    :goto_0
    iget-object v1, p0, La/gh2;->j:Ljava/util/Iterator;

    .line 28
    .line 29
    iget-object v6, p0, La/gh2;->i:La/hh2;

    .line 30
    .line 31
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, La/gh2;->l:La/hh2;

    .line 39
    .line 40
    invoke-virtual {p1}, La/i3t0;->D()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, La/ug2;

    .line 45
    .line 46
    iget-object v1, v1, La/ug2;->c:La/hat;

    .line 47
    .line 48
    iget-object v1, p0, La/gh2;->m:Ljava/util/List;

    .line 49
    .line 50
    if-eqz v1, :cond_8

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    move-object v6, p1

    .line 57
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_8

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;

    .line 68
    .line 69
    if-nez p1, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    instance-of v7, p1, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Live;

    .line 73
    .line 74
    if-eqz v7, :cond_5

    .line 75
    .line 76
    iput-object v6, p0, La/gh2;->i:La/hh2;

    .line 77
    .line 78
    iput-object v1, p0, La/gh2;->j:Ljava/util/Iterator;

    .line 79
    .line 80
    iput-byte v5, p0, La/gh2;->k:B

    .line 81
    .line 82
    sget p1, La/hh2;->O:I

    .line 83
    .line 84
    invoke-virtual {v6, p0}, La/hh2;->O(La/zje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    instance-of v7, p1, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Line;

    .line 92
    .line 93
    if-eqz v7, :cond_6

    .line 94
    .line 95
    iput-object v6, p0, La/gh2;->i:La/hh2;

    .line 96
    .line 97
    iput-object v1, p0, La/gh2;->j:Ljava/util/Iterator;

    .line 98
    .line 99
    iput-byte v4, p0, La/gh2;->k:B

    .line 100
    .line 101
    sget p1, La/hh2;->O:I

    .line 102
    .line 103
    invoke-virtual {v6, p0}, La/hh2;->N(La/zje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v0, :cond_3

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    instance-of v7, p1, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Results;

    .line 111
    .line 112
    if-eqz v7, :cond_7

    .line 113
    .line 114
    iput-object v6, p0, La/gh2;->i:La/hh2;

    .line 115
    .line 116
    iput-object v1, p0, La/gh2;->j:Ljava/util/Iterator;

    .line 117
    .line 118
    iput-byte v3, p0, La/gh2;->k:B

    .line 119
    .line 120
    sget p1, La/hh2;->O:I

    .line 121
    .line 122
    invoke-virtual {v6, p0}, La/hh2;->P(La/zje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-ne p1, v0, :cond_3

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    instance-of p1, p1, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$All;

    .line 130
    .line 131
    if-eqz p1, :cond_3

    .line 132
    .line 133
    iput-object v6, p0, La/gh2;->i:La/hh2;

    .line 134
    .line 135
    iput-object v1, p0, La/gh2;->j:Ljava/util/Iterator;

    .line 136
    .line 137
    iput-byte v2, p0, La/gh2;->k:B

    .line 138
    .line 139
    sget p1, La/hh2;->O:I

    .line 140
    .line 141
    invoke-virtual {v6, p0}, La/hh2;->M(La/zje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-ne p1, v0, :cond_3

    .line 146
    .line 147
    :goto_2
    return-object v0

    .line 148
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0
.end method
