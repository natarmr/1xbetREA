.class public final La/bl00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public final synthetic m:J

.field public final synthetic n:La/ywq0;

.field public o:La/kmq;

.field public p:Ljava/util/List;


# direct methods
.method public constructor <init>(La/yje;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;JLa/ywq0;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/bl00;->l:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 2
    .line 3
    iput-wide p3, p0, La/bl00;->m:J

    .line 4
    .line 5
    iput-object p5, p0, La/bl00;->n:La/ywq0;

    .line 6
    .line 7
    const/4 p2, 0x3

    .line 8
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/bl00;

    .line 7
    .line 8
    iget-wide v3, p0, La/bl00;->m:J

    .line 9
    .line 10
    iget-object v5, p0, La/bl00;->n:La/ywq0;

    .line 11
    .line 12
    iget-object v2, p0, La/bl00;->l:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, La/bl00;-><init>(La/yje;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;JLa/ywq0;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/bl00;->j:La/kmq;

    .line 18
    .line 19
    iput-object p2, v0, La/bl00;->k:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    invoke-virtual {v0, p0}, La/bl00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    .line 1
    iget-object v6, p0, La/bl00;->n:La/ywq0;

    .line 2
    .line 3
    iget-object v0, v6, La/ywq0;->g:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v7, v0

    .line 6
    check-cast v7, La/n0o0;

    .line 7
    .line 8
    sget-object v8, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-byte v0, p0, La/bl00;->i:B

    .line 11
    .line 12
    const/4 v9, 0x2

    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v10, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    if-ne v0, v9, :cond_0

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v10

    .line 32
    :cond_1
    iget-object v0, p0, La/bl00;->p:Ljava/util/List;

    .line 33
    .line 34
    iget-object v1, p0, La/bl00;->o:La/kmq;

    .line 35
    .line 36
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object v12, v0

    .line 40
    move-object/from16 v0, p1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v11, p0, La/bl00;->j:La/kmq;

    .line 47
    .line 48
    iget-object v0, p0, La/bl00;->k:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v12, v0

    .line 51
    check-cast v12, Ljava/util/List;

    .line 52
    .line 53
    iget-object v0, p0, La/bl00;->l:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 54
    .line 55
    iget-wide v2, p0, La/bl00;->m:J

    .line 56
    .line 57
    invoke-static {v2, v3, v0}, Lorg/xplatform/cyber/section/api/domain/entity/d;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Lkotlin/Pair;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v2, v6, La/ywq0;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, La/j3c;

    .line 64
    .line 65
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide v13

    .line 81
    iput-object v10, p0, La/bl00;->j:La/kmq;

    .line 82
    .line 83
    iput-object v10, p0, La/bl00;->k:Ljava/lang/Object;

    .line 84
    .line 85
    iput-object v11, p0, La/bl00;->o:La/kmq;

    .line 86
    .line 87
    iput-object v12, p0, La/bl00;->p:Ljava/util/List;

    .line 88
    .line 89
    iput-byte v1, p0, La/bl00;->i:B

    .line 90
    .line 91
    move-object v5, p0

    .line 92
    move-object v0, v2

    .line 93
    move-wide v1, v3

    .line 94
    move-wide v3, v13

    .line 95
    invoke-virtual/range {v0 .. v5}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-ne v0, v8, :cond_3

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    move-object v1, v11

    .line 103
    :goto_0
    check-cast v0, La/ypl0;

    .line 104
    .line 105
    iget-object v0, v0, La/ypl0;->c:La/lel0;

    .line 106
    .line 107
    iget-object v0, v0, La/lel0;->j:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v2, v6, La/ywq0;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v2, La/v7i;

    .line 112
    .line 113
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, La/sff0;

    .line 118
    .line 119
    iget-boolean v3, v3, La/sff0;->J1:Z

    .line 120
    .line 121
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, La/sff0;

    .line 126
    .line 127
    iget-boolean v4, v4, La/sff0;->O1:Z

    .line 128
    .line 129
    invoke-virtual {v2, v12, v3, v4}, La/v7i;->k(Ljava/util/List;ZZ)La/acu;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    new-instance v3, La/jxt;

    .line 134
    .line 135
    invoke-direct {v3, v2, v0, v9}, La/jxt;-><init>(La/acu;Ljava/lang/String;B)V

    .line 136
    .line 137
    .line 138
    iput-object v10, p0, La/bl00;->j:La/kmq;

    .line 139
    .line 140
    iput-object v10, p0, La/bl00;->k:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v10, p0, La/bl00;->o:La/kmq;

    .line 143
    .line 144
    iput-object v10, p0, La/bl00;->p:Ljava/util/List;

    .line 145
    .line 146
    iput-byte v9, p0, La/bl00;->i:B

    .line 147
    .line 148
    invoke-static {v1, v3, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-ne v0, v8, :cond_4

    .line 153
    .line 154
    :goto_1
    return-object v8

    .line 155
    :cond_4
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0
.end method
