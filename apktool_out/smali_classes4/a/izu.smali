.class public final La/izu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/f7u;

.field public final synthetic m:La/sip;

.field public final synthetic n:J

.field public final synthetic o:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public p:La/kmq;

.field public q:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public r:La/sip;

.field public s:La/cyu;

.field public t:I

.field public u:J


# direct methods
.method public constructor <init>(La/yje;La/f7u;La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/izu;->l:La/f7u;

    .line 2
    .line 3
    iput-object p3, p0, La/izu;->m:La/sip;

    .line 4
    .line 5
    iput-wide p4, p0, La/izu;->n:J

    .line 6
    .line 7
    iput-object p6, p0, La/izu;->o:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

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
    new-instance v0, La/izu;

    .line 7
    .line 8
    iget-wide v4, p0, La/izu;->n:J

    .line 9
    .line 10
    iget-object v6, p0, La/izu;->o:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 11
    .line 12
    iget-object v2, p0, La/izu;->l:La/f7u;

    .line 13
    .line 14
    iget-object v3, p0, La/izu;->m:La/sip;

    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, La/izu;-><init>(La/yje;La/f7u;La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/izu;->j:La/kmq;

    .line 20
    .line 21
    iput-object p2, v0, La/izu;->k:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, La/izu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, v0, La/izu;->i:B

    .line 6
    .line 7
    iget-object v3, v0, La/izu;->l:La/f7u;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v5, :cond_1

    .line 15
    .line 16
    if-ne v2, v4, :cond_0

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v6

    .line 29
    :cond_1
    iget-wide v7, v0, La/izu;->u:J

    .line 30
    .line 31
    iget v2, v0, La/izu;->t:I

    .line 32
    .line 33
    iget-object v9, v0, La/izu;->s:La/cyu;

    .line 34
    .line 35
    iget-object v10, v0, La/izu;->r:La/sip;

    .line 36
    .line 37
    iget-object v11, v0, La/izu;->q:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 38
    .line 39
    iget-object v12, v0, La/izu;->p:La/kmq;

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-wide v13, v7

    .line 45
    move-object/from16 v7, p1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v12, v0, La/izu;->j:La/kmq;

    .line 52
    .line 53
    iget-object v2, v0, La/izu;->k:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    iget-object v7, v3, La/f7u;->b:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v9, v7

    .line 64
    check-cast v9, La/cyu;

    .line 65
    .line 66
    iget-object v7, v3, La/f7u;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v7, La/sjl0;

    .line 69
    .line 70
    iput-object v6, v0, La/izu;->j:La/kmq;

    .line 71
    .line 72
    iput-object v6, v0, La/izu;->k:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v12, v0, La/izu;->p:La/kmq;

    .line 75
    .line 76
    iget-object v11, v0, La/izu;->o:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 77
    .line 78
    iput-object v11, v0, La/izu;->q:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 79
    .line 80
    iget-object v10, v0, La/izu;->m:La/sip;

    .line 81
    .line 82
    iput-object v10, v0, La/izu;->r:La/sip;

    .line 83
    .line 84
    iput-object v9, v0, La/izu;->s:La/cyu;

    .line 85
    .line 86
    iput v2, v0, La/izu;->t:I

    .line 87
    .line 88
    iget-wide v13, v0, La/izu;->n:J

    .line 89
    .line 90
    iput-wide v13, v0, La/izu;->u:J

    .line 91
    .line 92
    iput-byte v5, v0, La/izu;->i:B

    .line 93
    .line 94
    invoke-virtual {v7, v0}, La/sjl0;->d(La/zje;)Ljava/io/Serializable;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    if-ne v7, v1, :cond_3

    .line 99
    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :cond_3
    :goto_0
    check-cast v7, Ljava/util/List;

    .line 103
    .line 104
    iget-object v3, v3, La/f7u;->d:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v3, La/iqt;

    .line 107
    .line 108
    iget-object v3, v3, La/iqt;->a:La/gst0;

    .line 109
    .line 110
    invoke-virtual {v3}, La/gst0;->a()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v8, La/hie0;

    .line 127
    .line 128
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 129
    .line 130
    .line 131
    iput-boolean v5, v8, La/hie0;->a:Z

    .line 132
    .line 133
    iget-object v5, v9, La/cyu;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v5, La/knf0;

    .line 136
    .line 137
    invoke-virtual {v5}, La/knf0;->d()La/lnf0;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    new-instance v15, La/jo20;

    .line 142
    .line 143
    invoke-direct {v15}, La/jo20;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-static {v15, v2, v3}, La/qbt;->d(Ljava/util/Map;IZ)V

    .line 147
    .line 148
    .line 149
    iget v2, v5, La/lnf0;->b:I

    .line 150
    .line 151
    invoke-static {v2, v15}, La/qbt;->g(ILjava/util/Map;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v15}, La/qbt;->h(Ljava/util/Map;)V

    .line 155
    .line 156
    .line 157
    iget-object v2, v5, La/lnf0;->a:Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {v2, v15}, La/qbt;->j(Ljava/lang/String;Ljava/util/Map;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v15}, La/qbt;->l(Ljava/util/Map;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v15, v11, v13, v14}, La/qbt;->m(La/jo20;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;J)V

    .line 166
    .line 167
    .line 168
    invoke-static {v15}, La/qbt;->p(Ljava/util/Map;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v15}, La/jo20;->b()La/jo20;

    .line 172
    .line 173
    .line 174
    move-result-object v19

    .line 175
    iget-object v2, v9, La/cyu;->c:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, La/n660;

    .line 178
    .line 179
    invoke-virtual {v2, v11, v10}, La/n660;->r(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;)La/or30;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    invoke-static {v10}, La/kpb;->v(La/sip;)J

    .line 184
    .line 185
    .line 186
    move-result-wide v2

    .line 187
    new-instance v15, La/zzq0;

    .line 188
    .line 189
    const/16 v20, 0x0

    .line 190
    .line 191
    const/16 v21, 0x1

    .line 192
    .line 193
    move-object/from16 v16, v9

    .line 194
    .line 195
    move-object/from16 v17, v10

    .line 196
    .line 197
    move-object/from16 v18, v11

    .line 198
    .line 199
    invoke-direct/range {v15 .. v21}, La/zzq0;-><init>(La/cyu;La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/yje;B)V

    .line 200
    .line 201
    .line 202
    move-object/from16 v19, v18

    .line 203
    .line 204
    const/16 v18, 0xfc

    .line 205
    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    move-object/from16 v17, v15

    .line 209
    .line 210
    move-wide v14, v2

    .line 211
    invoke-static/range {v13 .. v18}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 212
    .line 213
    .line 214
    move-result-object v16

    .line 215
    new-instance v15, La/yzq0;

    .line 216
    .line 217
    move-object/from16 v20, v7

    .line 218
    .line 219
    move-object/from16 v18, v8

    .line 220
    .line 221
    move-object/from16 v17, v9

    .line 222
    .line 223
    invoke-direct/range {v15 .. v21}, La/yzq0;-><init>(La/vsg0;La/cyu;La/hie0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Ljava/util/List;B)V

    .line 224
    .line 225
    .line 226
    iput-object v6, v0, La/izu;->j:La/kmq;

    .line 227
    .line 228
    iput-object v6, v0, La/izu;->k:Ljava/lang/Object;

    .line 229
    .line 230
    iput-object v6, v0, La/izu;->p:La/kmq;

    .line 231
    .line 232
    iput-object v6, v0, La/izu;->q:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 233
    .line 234
    iput-object v6, v0, La/izu;->r:La/sip;

    .line 235
    .line 236
    iput-object v6, v0, La/izu;->s:La/cyu;

    .line 237
    .line 238
    iput-byte v4, v0, La/izu;->i:B

    .line 239
    .line 240
    invoke-static {v12, v15, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    if-ne v0, v1, :cond_4

    .line 245
    .line 246
    :goto_1
    return-object v1

    .line 247
    :cond_4
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object v0
.end method
