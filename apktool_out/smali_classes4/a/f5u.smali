.class public final La/f5u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/q5u;

.field public final synthetic m:La/sip;

.field public final synthetic n:J

.field public final synthetic o:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;


# direct methods
.method public constructor <init>(La/yje;La/q5u;La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/f5u;->l:La/q5u;

    .line 2
    .line 3
    iput-object p3, p0, La/f5u;->m:La/sip;

    .line 4
    .line 5
    iput-wide p4, p0, La/f5u;->n:J

    .line 6
    .line 7
    iput-object p6, p0, La/f5u;->o:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 8
    .line 9
    const/4 p2, 0x3

    .line 10
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/f5u;

    .line 7
    .line 8
    iget-wide v4, p0, La/f5u;->n:J

    .line 9
    .line 10
    iget-object v6, p0, La/f5u;->o:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 11
    .line 12
    iget-object v2, p0, La/f5u;->l:La/q5u;

    .line 13
    .line 14
    iget-object v3, p0, La/f5u;->m:La/sip;

    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, La/f5u;-><init>(La/yje;La/q5u;La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/f5u;->j:La/kmq;

    .line 20
    .line 21
    iput-object p2, v0, La/f5u;->k:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, La/f5u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/f5u;->i:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v3

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, La/f5u;->j:La/kmq;

    .line 28
    .line 29
    iget-object v5, v0, La/f5u;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, La/c3c0;

    .line 32
    .line 33
    iget-object v6, v0, La/f5u;->l:La/q5u;

    .line 34
    .line 35
    iget-object v6, v6, La/q5u;->b:La/edu;

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v10, v0, La/f5u;->o:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 41
    .line 42
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v7, v6, La/edu;->c:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v8, v7

    .line 48
    check-cast v8, La/n660;

    .line 49
    .line 50
    iget-object v6, v6, La/edu;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, La/uzc;

    .line 53
    .line 54
    invoke-virtual {v6}, La/uzc;->b()La/jvn;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    iget-object v7, v8, La/n660;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v7, La/knf0;

    .line 61
    .line 62
    invoke-virtual {v7}, La/knf0;->d()La/lnf0;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    new-instance v9, La/jo20;

    .line 67
    .line 68
    invoke-direct {v9}, La/jo20;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-static {v9, v6}, La/qbt;->a(Ljava/util/Map;La/jvn;)V

    .line 72
    .line 73
    .line 74
    iget v6, v5, La/c3c0;->a:I

    .line 75
    .line 76
    invoke-static {v6, v9}, La/qbt;->c(ILjava/util/Map;)V

    .line 77
    .line 78
    .line 79
    iget v6, v7, La/lnf0;->b:I

    .line 80
    .line 81
    invoke-static {v6, v9}, La/qbt;->g(ILjava/util/Map;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v9}, La/qbt;->h(Ljava/util/Map;)V

    .line 85
    .line 86
    .line 87
    iget-object v6, v7, La/lnf0;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v6, v9}, La/qbt;->j(Ljava/lang/String;Ljava/util/Map;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v9}, La/qbt;->l(Ljava/util/Map;)V

    .line 93
    .line 94
    .line 95
    iget-wide v6, v0, La/f5u;->n:J

    .line 96
    .line 97
    invoke-static {v9, v10, v6, v7}, La/qbt;->m(La/jo20;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;J)V

    .line 98
    .line 99
    .line 100
    iget-boolean v6, v5, La/c3c0;->b:Z

    .line 101
    .line 102
    iget-wide v11, v5, La/c3c0;->c:J

    .line 103
    .line 104
    invoke-static {v9, v6, v11, v12}, La/qbt;->o(Ljava/util/Map;ZJ)V

    .line 105
    .line 106
    .line 107
    invoke-static {v9}, La/qbt;->p(Ljava/util/Map;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v9}, La/jo20;->b()La/jo20;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    iget-object v5, v8, La/n660;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v5, La/jtj;

    .line 117
    .line 118
    iget-object v9, v0, La/f5u;->m:La/sip;

    .line 119
    .line 120
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_3

    .line 125
    .line 126
    if-ne v6, v4, :cond_2

    .line 127
    .line 128
    iget-object v5, v5, La/jtj;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v5, La/or30;

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 134
    .line 135
    .line 136
    return-object v3

    .line 137
    :cond_3
    iget-object v5, v5, La/jtj;->c:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v5, La/or30;

    .line 140
    .line 141
    :goto_0
    invoke-static {v9}, La/kpb;->v(La/sip;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v14

    .line 145
    move-wide/from16 v16, v14

    .line 146
    .line 147
    new-instance v15, La/joq0;

    .line 148
    .line 149
    const/16 v6, 0x11

    .line 150
    .line 151
    invoke-direct {v15, v6}, La/joq0;-><init>(B)V

    .line 152
    .line 153
    .line 154
    new-instance v7, La/bm4;

    .line 155
    .line 156
    const/4 v12, 0x0

    .line 157
    const/4 v13, 0x5

    .line 158
    invoke-direct/range {v7 .. v13}, La/bm4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;La/yje;B)V

    .line 159
    .line 160
    .line 161
    move-wide/from16 v13, v16

    .line 162
    .line 163
    const/16 v17, 0x3c

    .line 164
    .line 165
    move-object v12, v5

    .line 166
    move-object/from16 v16, v7

    .line 167
    .line 168
    invoke-static/range {v12 .. v17}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    iput-object v3, v0, La/f5u;->j:La/kmq;

    .line 173
    .line 174
    iput-object v3, v0, La/f5u;->k:Ljava/lang/Object;

    .line 175
    .line 176
    iput-boolean v4, v0, La/f5u;->i:Z

    .line 177
    .line 178
    invoke-static {v2, v5, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-ne v0, v1, :cond_4

    .line 183
    .line 184
    return-object v1

    .line 185
    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0
.end method
