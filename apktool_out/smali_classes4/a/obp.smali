.class public final La/obp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/aer;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/util/List;

.field public synthetic l:Ljava/util/List;

.field public synthetic m:Lkotlin/Pair;

.field public synthetic n:Ljava/util/List;

.field public final synthetic o:La/ccp;


# direct methods
.method public constructor <init>(La/ccp;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/obp;->o:La/ccp;

    .line 2
    .line 3
    const/4 p1, 0x6

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, La/obp;->j:La/kmq;

    .line 2
    .line 3
    iget-object v2, p0, La/obp;->k:Ljava/util/List;

    .line 4
    .line 5
    iget-object v3, p0, La/obp;->l:Ljava/util/List;

    .line 6
    .line 7
    iget-object v1, p0, La/obp;->m:Lkotlin/Pair;

    .line 8
    .line 9
    iget-object v5, p0, La/obp;->n:Ljava/util/List;

    .line 10
    .line 11
    sget-object v7, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-boolean v4, p0, La/obp;->i:Z

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    if-ne v4, v8, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v9

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget p1, La/ccp;->u0:I

    .line 36
    .line 37
    iget-object p1, p0, La/obp;->o:La/ccp;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, La/ccp;->O(Lkotlin/Pair;)Lkotlin/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v4, p1, La/ccp;->j0:La/nn60;

    .line 44
    .line 45
    iget-object v6, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v6, Ljava/lang/Iterable;

    .line 48
    .line 49
    new-instance v10, Ljava/util/ArrayList;

    .line 50
    .line 51
    const/16 v11, 0xa

    .line 52
    .line 53
    invoke-static {v6, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    if-eqz v11, :cond_2

    .line 69
    .line 70
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    check-cast v11, La/i8p;

    .line 75
    .line 76
    iget-wide v11, v11, La/i8p;->a:J

    .line 77
    .line 78
    invoke-static {v11, v12, v10}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    new-instance v6, La/xm60;

    .line 83
    .line 84
    invoke-direct {v6, v10}, La/xm60;-><init>(Ljava/util/ArrayList;)V

    .line 85
    .line 86
    .line 87
    new-array v10, v8, [La/en60;

    .line 88
    .line 89
    const/4 v11, 0x0

    .line 90
    aput-object v6, v10, v11

    .line 91
    .line 92
    invoke-static {p1, v4, v10}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 93
    .line 94
    .line 95
    iget-object v4, p1, La/ccp;->E:La/o470;

    .line 96
    .line 97
    sget-object v6, La/wep;->b:La/wep;

    .line 98
    .line 99
    invoke-virtual {p1, v2, v3, v1, v5}, La/ccp;->M(Ljava/util/List;Ljava/util/List;Lkotlin/Pair;Ljava/util/List;)La/lc00;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object v4, v4, La/o470;->a:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v4, La/rrc;

    .line 112
    .line 113
    invoke-virtual {v4, v6, p1}, La/rrc;->J(La/wep;Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    move-object p1, v1

    .line 117
    new-instance v1, La/ec80;

    .line 118
    .line 119
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v4, p1

    .line 122
    check-cast v4, Ljava/util/List;

    .line 123
    .line 124
    sget-object v6, La/iun;->a:La/iun;

    .line 125
    .line 126
    invoke-direct/range {v1 .. v6}, La/ec80;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    iput-object v9, p0, La/obp;->j:La/kmq;

    .line 130
    .line 131
    iput-object v9, p0, La/obp;->k:Ljava/util/List;

    .line 132
    .line 133
    iput-object v9, p0, La/obp;->l:Ljava/util/List;

    .line 134
    .line 135
    iput-object v9, p0, La/obp;->m:Lkotlin/Pair;

    .line 136
    .line 137
    iput-object v9, p0, La/obp;->n:Ljava/util/List;

    .line 138
    .line 139
    iput-boolean v8, p0, La/obp;->i:Z

    .line 140
    .line 141
    invoke-interface {v0, v1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-ne p0, v7, :cond_3

    .line 146
    .line 147
    return-object v7

    .line 148
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, Ljava/util/List;

    .line 4
    .line 5
    check-cast p3, Ljava/util/List;

    .line 6
    .line 7
    check-cast p4, Lkotlin/Pair;

    .line 8
    .line 9
    check-cast p5, Ljava/util/List;

    .line 10
    .line 11
    check-cast p6, La/yje;

    .line 12
    .line 13
    new-instance v0, La/obp;

    .line 14
    .line 15
    iget-object p0, p0, La/obp;->o:La/ccp;

    .line 16
    .line 17
    invoke-direct {v0, p0, p6}, La/obp;-><init>(La/ccp;La/yje;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/obp;->j:La/kmq;

    .line 21
    .line 22
    iput-object p2, v0, La/obp;->k:Ljava/util/List;

    .line 23
    .line 24
    iput-object p3, v0, La/obp;->l:Ljava/util/List;

    .line 25
    .line 26
    iput-object p4, v0, La/obp;->m:Lkotlin/Pair;

    .line 27
    .line 28
    iput-object p5, v0, La/obp;->n:Ljava/util/List;

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, La/obp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
