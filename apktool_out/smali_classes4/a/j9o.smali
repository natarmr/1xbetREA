.class public final La/j9o;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Ljava/util/List;

.field public j:B

.field public final synthetic k:La/k9o;


# direct methods
.method public constructor <init>(La/k9o;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/j9o;->k:La/k9o;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/j9o;

    .line 2
    .line 3
    iget-object p0, p0, La/j9o;->k:La/k9o;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, La/j9o;-><init>(La/k9o;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/j9o;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j9o;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/j9o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/j9o;->j:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v6, p0, La/j9o;->k:La/k9o;

    .line 10
    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v4, :cond_2

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v5

    .line 30
    :cond_1
    iget-object v1, p0, La/j9o;->i:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, La/z8o;

    .line 48
    .line 49
    iget-object p1, p1, La/z8o;->c:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    iget-object p1, v6, La/k9o;->u:La/b8u;

    .line 58
    .line 59
    iput-byte v4, p0, La/j9o;->j:B

    .line 60
    .line 61
    iget-object p1, p1, La/b8u;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, La/z220;

    .line 64
    .line 65
    invoke-virtual {p1, p0}, La/z220;->u(La/zje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 73
    .line 74
    :cond_5
    move-object v1, p1

    .line 75
    iget-object p1, v6, La/k9o;->z:La/gvu;

    .line 76
    .line 77
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 78
    .line 79
    iget-byte v4, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 80
    .line 81
    iput-object v1, p0, La/j9o;->i:Ljava/util/List;

    .line 82
    .line 83
    iput-byte v3, p0, La/j9o;->j:B

    .line 84
    .line 85
    check-cast p1, La/ivu;

    .line 86
    .line 87
    invoke-virtual {p1, v4, p0}, La/ivu;->a(ILa/zje;)Ljava/io/Serializable;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v0, :cond_6

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_6
    :goto_1
    check-cast p1, Ljava/util/Map;

    .line 95
    .line 96
    iget-object v3, v6, La/k9o;->r:La/pwi;

    .line 97
    .line 98
    iget-object v4, v6, La/k9o;->F:La/sff0;

    .line 99
    .line 100
    iget-object v7, v4, La/sff0;->c:La/ech;

    .line 101
    .line 102
    iget v7, v7, La/ech;->g:I

    .line 103
    .line 104
    iget-boolean v4, v4, La/sff0;->J1:Z

    .line 105
    .line 106
    iget-object v8, v3, La/pwi;->g:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v8, La/m1e;

    .line 109
    .line 110
    invoke-interface {v8}, La/m1e;->b()La/gmq;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    new-instance v9, La/q7u;

    .line 115
    .line 116
    invoke-direct {v9, v5, v3, v7, v4}, La/q7u;-><init>(La/yje;La/pwi;IZ)V

    .line 117
    .line 118
    .line 119
    invoke-static {v8, v9}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    iget-object v3, v3, La/pwi;->h:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v3, La/mne;

    .line 126
    .line 127
    iget-object v3, v3, La/mne;->a:La/rwj;

    .line 128
    .line 129
    invoke-static {v4, v3}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-static {v3}, La/i120;->W(La/gmq;)La/gmq;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    new-instance v4, La/yj2;

    .line 138
    .line 139
    const/16 v7, 0x8

    .line 140
    .line 141
    invoke-direct {v4, v6, v1, p1, v7}, La/yj2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 142
    .line 143
    .line 144
    iput-object v5, p0, La/j9o;->i:Ljava/util/List;

    .line 145
    .line 146
    iput-byte v2, p0, La/j9o;->j:B

    .line 147
    .line 148
    invoke-interface {v3, v4, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-ne p0, v0, :cond_7

    .line 153
    .line 154
    :goto_2
    return-object v0

    .line 155
    :cond_7
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object p0
.end method
