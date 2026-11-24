.class public final La/hjd;
.super La/x2t0;
.source "SourceFile"


# static fields
.field public static final synthetic E:I


# instance fields
.field public final A:La/vqc;

.field public final B:La/h3c;

.field public final C:La/ouu;

.field public final D:La/pru;

.field public final h:La/uf3;

.field public final i:La/e1u;

.field public final j:La/npx;

.field public final k:La/pq;

.field public final l:La/jtj;

.field public final m:La/ywq0;

.field public final n:La/zyt;

.field public final o:La/oeg0;

.field public final p:La/mii0;

.field public final q:La/x20;

.field public final r:La/lbu;

.field public final s:La/njt0;

.field public final t:La/ivn;

.field public final u:La/cad;

.field public final v:La/pmi;

.field public final w:La/ctf0;

.field public final x:La/x20;

.field public final y:La/bn6;

.field public final z:La/je;


# direct methods
.method public constructor <init>(La/uf3;La/e1u;La/npx;La/pq;La/jtj;La/ywq0;La/zyt;La/oeg0;La/mii0;La/x20;La/lbu;La/njt0;La/ivn;La/cad;La/pmi;La/ctf0;La/x20;La/bn6;La/je;La/vqc;La/h3c;La/ouu;La/pru;)V
    .locals 2

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/a7d;

    .line 8
    .line 9
    const/16 v1, 0xd

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/a7d;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/hjd;->h:La/uf3;

    .line 18
    .line 19
    iput-object p2, p0, La/hjd;->i:La/e1u;

    .line 20
    .line 21
    iput-object p3, p0, La/hjd;->j:La/npx;

    .line 22
    .line 23
    iput-object p4, p0, La/hjd;->k:La/pq;

    .line 24
    .line 25
    iput-object p5, p0, La/hjd;->l:La/jtj;

    .line 26
    .line 27
    iput-object p6, p0, La/hjd;->m:La/ywq0;

    .line 28
    .line 29
    iput-object p7, p0, La/hjd;->n:La/zyt;

    .line 30
    .line 31
    iput-object p8, p0, La/hjd;->o:La/oeg0;

    .line 32
    .line 33
    iput-object p9, p0, La/hjd;->p:La/mii0;

    .line 34
    .line 35
    iput-object p10, p0, La/hjd;->q:La/x20;

    .line 36
    .line 37
    iput-object p11, p0, La/hjd;->r:La/lbu;

    .line 38
    .line 39
    iput-object p12, p0, La/hjd;->s:La/njt0;

    .line 40
    .line 41
    iput-object p13, p0, La/hjd;->t:La/ivn;

    .line 42
    .line 43
    move-object/from16 p1, p14

    .line 44
    .line 45
    iput-object p1, p0, La/hjd;->u:La/cad;

    .line 46
    .line 47
    move-object/from16 p1, p15

    .line 48
    .line 49
    iput-object p1, p0, La/hjd;->v:La/pmi;

    .line 50
    .line 51
    move-object/from16 p1, p16

    .line 52
    .line 53
    iput-object p1, p0, La/hjd;->w:La/ctf0;

    .line 54
    .line 55
    move-object/from16 p1, p17

    .line 56
    .line 57
    iput-object p1, p0, La/hjd;->x:La/x20;

    .line 58
    .line 59
    move-object/from16 p1, p18

    .line 60
    .line 61
    iput-object p1, p0, La/hjd;->y:La/bn6;

    .line 62
    .line 63
    move-object/from16 p1, p19

    .line 64
    .line 65
    iput-object p1, p0, La/hjd;->z:La/je;

    .line 66
    .line 67
    move-object/from16 p1, p20

    .line 68
    .line 69
    iput-object p1, p0, La/hjd;->A:La/vqc;

    .line 70
    .line 71
    move-object/from16 p1, p21

    .line 72
    .line 73
    iput-object p1, p0, La/hjd;->B:La/h3c;

    .line 74
    .line 75
    move-object/from16 p1, p22

    .line 76
    .line 77
    iput-object p1, p0, La/hjd;->C:La/ouu;

    .line 78
    .line 79
    move-object/from16 p1, p23

    .line 80
    .line 81
    iput-object p1, p0, La/hjd;->D:La/pru;

    .line 82
    .line 83
    return-void
.end method

.method public static j(La/d0t;JJLa/xgl0;)Lorg/xplatform/betting/core/zip/model/zip/BetZip;
    .locals 7

    .line 1
    iget-object v0, p0, La/d0t;->K:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    move-object v3, v1

    .line 19
    check-cast v3, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 20
    .line 21
    iget-wide v3, v3, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->b:J

    .line 22
    .line 23
    cmp-long v3, v3, p3

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v1, v2

    .line 29
    :goto_0
    check-cast v1, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 30
    .line 31
    const-wide/16 v3, 0x0

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    iget-object v0, v1, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->f:Ljava/util/List;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    new-instance p0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_b

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    move-object v0, p2

    .line 59
    check-cast v0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 60
    .line 61
    iget-wide v5, v0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 62
    .line 63
    cmpg-double v1, v5, v3

    .line 64
    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    iget-object v0, v0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->t:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    iget-object p0, p0, La/d0t;->k:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    move-object v1, v0

    .line 97
    check-cast v1, La/d0t;

    .line 98
    .line 99
    iget-wide v5, v1, La/d0t;->a:J

    .line 100
    .line 101
    cmp-long v1, v5, p1

    .line 102
    .line 103
    if-nez v1, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    move-object v0, v2

    .line 107
    :goto_2
    check-cast v0, La/d0t;

    .line 108
    .line 109
    if-eqz v0, :cond_a

    .line 110
    .line 111
    iget-object p0, v0, La/d0t;->K:Ljava/util/List;

    .line 112
    .line 113
    if-eqz p0, :cond_a

    .line 114
    .line 115
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_7

    .line 124
    .line 125
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    move-object p2, p1

    .line 130
    check-cast p2, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 131
    .line 132
    iget-wide v0, p2, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->b:J

    .line 133
    .line 134
    cmp-long p2, v0, p3

    .line 135
    .line 136
    if-nez p2, :cond_6

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    move-object p1, v2

    .line 140
    :goto_3
    check-cast p1, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 141
    .line 142
    if-eqz p1, :cond_a

    .line 143
    .line 144
    iget-object p0, p1, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->f:Ljava/util/List;

    .line 145
    .line 146
    if-eqz p0, :cond_a

    .line 147
    .line 148
    new-instance p1, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-eqz p2, :cond_9

    .line 162
    .line 163
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    move-object v0, p2

    .line 168
    check-cast v0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 169
    .line 170
    iget-wide v5, v0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 171
    .line 172
    cmpg-double v1, v5, v3

    .line 173
    .line 174
    if-nez v1, :cond_8

    .line 175
    .line 176
    iget-object v0, v0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->t:Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_8

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_8
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_9
    move-object p0, p1

    .line 190
    goto :goto_5

    .line 191
    :cond_a
    move-object p0, v2

    .line 192
    :cond_b
    :goto_5
    if-eqz p0, :cond_e

    .line 193
    .line 194
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    if-eqz p1, :cond_d

    .line 203
    .line 204
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    move-object p2, p1

    .line 209
    check-cast p2, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 210
    .line 211
    iget-wide v0, p2, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 212
    .line 213
    iget-wide v3, p5, La/xgl0;->a:J

    .line 214
    .line 215
    cmp-long v0, v0, v3

    .line 216
    .line 217
    if-nez v0, :cond_c

    .line 218
    .line 219
    iget-wide v0, p2, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->d:D

    .line 220
    .line 221
    iget-wide v3, p5, La/xgl0;->b:D

    .line 222
    .line 223
    cmpg-double v0, v0, v3

    .line 224
    .line 225
    if-nez v0, :cond_c

    .line 226
    .line 227
    iget-wide v0, p2, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 228
    .line 229
    iget-wide v3, p5, La/xgl0;->c:D

    .line 230
    .line 231
    cmpg-double v0, v0, v3

    .line 232
    .line 233
    if-nez v0, :cond_c

    .line 234
    .line 235
    iget-wide v0, p2, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->c:J

    .line 236
    .line 237
    cmp-long v0, v0, p3

    .line 238
    .line 239
    if-nez v0, :cond_c

    .line 240
    .line 241
    iget-object p2, p2, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->t:Ljava/lang/String;

    .line 242
    .line 243
    iget-object v0, p5, La/xgl0;->d:Ljava/lang/String;

    .line 244
    .line 245
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    if-eqz p2, :cond_c

    .line 250
    .line 251
    move-object v2, p1

    .line 252
    :cond_d
    check-cast v2, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 253
    .line 254
    if-eqz v2, :cond_e

    .line 255
    .line 256
    return-object v2

    .line 257
    :cond_e
    new-instance p0, La/ss3;

    .line 258
    .line 259
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 260
    .line 261
    .line 262
    throw p0
.end method

.method public static k(JLjava/util/List;)La/d0t;
    .locals 5

    .line 1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, La/d0t;

    .line 17
    .line 18
    iget-wide v2, v2, La/d0t;->a:J

    .line 19
    .line 20
    cmp-long v2, v2, p0

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-eqz v1, :cond_2

    .line 27
    .line 28
    check-cast v1, La/d0t;

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_2
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/d0t;

    .line 46
    .line 47
    iget-object v0, v0, La/d0t;->k:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, La/d0t;

    .line 64
    .line 65
    iget-wide v3, v2, La/d0t;->a:J

    .line 66
    .line 67
    cmp-long v3, v3, p0

    .line 68
    .line 69
    if-nez v3, :cond_4

    .line 70
    .line 71
    move-object v1, v2

    .line 72
    goto :goto_1

    .line 73
    :cond_5
    check-cast v1, La/d0t;

    .line 74
    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_6
    new-instance p0, La/ss3;

    .line 79
    .line 80
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw p0
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vid;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i(La/d0t;La/d0t;Lorg/xplatform/betting/core/zip/model/zip/BetZip;La/ctc;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p5, La/zid;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/zid;

    .line 7
    .line 8
    iget v1, v0, La/zid;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/zid;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/zid;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/zid;-><init>(La/hjd;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/zid;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/zid;->n:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, La/zid;->k:La/aud;

    .line 41
    .line 42
    iget-object p2, v0, La/zid;->j:La/ctc;

    .line 43
    .line 44
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v5

    .line 54
    :cond_2
    iget-object p4, v0, La/zid;->j:La/ctc;

    .line 55
    .line 56
    iget-object p1, v0, La/zid;->i:La/d0t;

    .line 57
    .line 58
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p5, p0, La/hjd;->r:La/lbu;

    .line 66
    .line 67
    invoke-virtual {p5}, La/lbu;->j()Z

    .line 68
    .line 69
    .line 70
    move-result p5

    .line 71
    if-eqz p5, :cond_4

    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_4
    invoke-static {p1}, La/q0x;->Y(La/d0t;)La/m0k0;

    .line 77
    .line 78
    .line 79
    move-result-object p5

    .line 80
    iget-object p2, p2, La/d0t;->i:Ljava/lang/String;

    .line 81
    .line 82
    const-wide/16 v6, 0x0

    .line 83
    .line 84
    const v2, -0x80001

    .line 85
    .line 86
    .line 87
    invoke-static {p5, p2, v6, v7, v2}, La/m0k0;->a(La/m0k0;Ljava/lang/String;JI)La/m0k0;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p3}, La/ucx;->n0(Lorg/xplatform/betting/core/zip/model/zip/BetZip;)La/zxj0;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p5

    .line 99
    check-cast p5, La/tjd;

    .line 100
    .line 101
    iget-object p5, p5, La/tjd;->b:La/ms2;

    .line 102
    .line 103
    iput-object p1, v0, La/zid;->i:La/d0t;

    .line 104
    .line 105
    iput-object p4, v0, La/zid;->j:La/ctc;

    .line 106
    .line 107
    iput v4, v0, La/zid;->n:I

    .line 108
    .line 109
    iget-object v2, p0, La/hjd;->v:La/pmi;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {p5}, La/phu0;->Y(La/ms2;)La/gwe;

    .line 115
    .line 116
    .line 117
    move-result-object p5

    .line 118
    iget-object v2, v2, La/pmi;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, La/gud;

    .line 121
    .line 122
    invoke-static {v2, p2, p3, p5, v0}, La/gud;->f(La/gud;La/m0k0;La/zxj0;La/gwe;La/zje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p5

    .line 126
    if-ne p5, v1, :cond_5

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    :goto_1
    move-object p2, p5

    .line 130
    check-cast p2, La/aud;

    .line 131
    .line 132
    iput-object v5, v0, La/zid;->i:La/d0t;

    .line 133
    .line 134
    iput-object p4, v0, La/zid;->j:La/ctc;

    .line 135
    .line 136
    iput-object p2, v0, La/zid;->k:La/aud;

    .line 137
    .line 138
    iput v3, v0, La/zid;->n:I

    .line 139
    .line 140
    invoke-virtual {p0, p2, p1, v0}, La/hjd;->l(La/aud;La/d0t;La/zje;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-ne p1, v1, :cond_6

    .line 145
    .line 146
    :goto_2
    return-object v1

    .line 147
    :cond_6
    move-object p1, p2

    .line 148
    move-object p2, p4

    .line 149
    :goto_3
    new-instance p3, La/njd;

    .line 150
    .line 151
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    check-cast p4, La/tjd;

    .line 156
    .line 157
    iget-object p4, p4, La/tjd;->b:La/ms2;

    .line 158
    .line 159
    invoke-direct {p3, p1, p2, p4}, La/njd;-><init>(La/aud;La/ctc;La/ms2;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, p3}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0
.end method

.method public final l(La/aud;La/d0t;La/zje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v1, p3

    .line 6
    .line 7
    instance-of v2, v1, La/ajd;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, La/ajd;

    .line 13
    .line 14
    iget v3, v2, La/ajd;->p:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v3, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v5

    .line 23
    iput v3, v2, La/ajd;->p:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, La/ajd;

    .line 27
    .line 28
    invoke-direct {v2, v4, v1}, La/ajd;-><init>(La/hjd;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v1, v2, La/ajd;->n:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v2, La/ajd;->p:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    if-ne v5, v6, :cond_1

    .line 41
    .line 42
    iget-wide v5, v2, La/ajd;->m:J

    .line 43
    .line 44
    iget-object v0, v2, La/ajd;->l:La/j1g;

    .line 45
    .line 46
    iget-object v3, v2, La/ajd;->k:La/l1g;

    .line 47
    .line 48
    iget-object v7, v2, La/ajd;->j:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v2, v2, La/ajd;->i:La/d0t;

    .line 51
    .line 52
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-wide v14, v5

    .line 56
    move-object v5, v0

    .line 57
    move-object v6, v3

    .line 58
    move-object v0, v7

    .line 59
    move-object v7, v2

    .line 60
    move-wide v2, v14

    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    return-object v0

    .line 70
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object/from16 v1, p1

    .line 74
    .line 75
    instance-of v1, v1, La/ttd;

    .line 76
    .line 77
    if-nez v1, :cond_3

    .line 78
    .line 79
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_3
    iget-wide v7, v0, La/d0t;->a:J

    .line 83
    .line 84
    iget-wide v9, v0, La/d0t;->v:J

    .line 85
    .line 86
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    const-wide/16 v11, 0x28

    .line 91
    .line 92
    cmp-long v1, v9, v11

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    iget-wide v11, v0, La/d0t;->u:J

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    move-wide v11, v9

    .line 100
    :goto_1
    sget-object v5, La/l1g;->c:La/l1g;

    .line 101
    .line 102
    if-nez v1, :cond_5

    .line 103
    .line 104
    sget-object v1, La/j1g;->c:La/j1g;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    sget-object v1, La/j1g;->d:La/j1g;

    .line 108
    .line 109
    :goto_2
    invoke-virtual {v4}, La/x2t0;->d()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    check-cast v8, La/tjd;

    .line 114
    .line 115
    iget-object v8, v8, La/tjd;->b:La/ms2;

    .line 116
    .line 117
    instance-of v13, v8, La/uq2;

    .line 118
    .line 119
    if-eqz v13, :cond_6

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_6
    instance-of v13, v8, La/kr2;

    .line 123
    .line 124
    if-eqz v13, :cond_7

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_7
    instance-of v13, v8, La/jr2;

    .line 128
    .line 129
    if-eqz v13, :cond_8

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_8
    instance-of v13, v8, La/lr2;

    .line 133
    .line 134
    if-eqz v13, :cond_9

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_9
    instance-of v13, v8, La/jq2;

    .line 138
    .line 139
    if-eqz v13, :cond_a

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_a
    instance-of v13, v8, La/rq2;

    .line 143
    .line 144
    if-eqz v13, :cond_b

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_b
    instance-of v8, v8, La/kq2;

    .line 148
    .line 149
    if-eqz v8, :cond_d

    .line 150
    .line 151
    :goto_3
    iput-object v0, v2, La/ajd;->i:La/d0t;

    .line 152
    .line 153
    iput-object v7, v2, La/ajd;->j:Ljava/lang/String;

    .line 154
    .line 155
    iput-object v5, v2, La/ajd;->k:La/l1g;

    .line 156
    .line 157
    iput-object v1, v2, La/ajd;->l:La/j1g;

    .line 158
    .line 159
    iput-wide v11, v2, La/ajd;->m:J

    .line 160
    .line 161
    iput v6, v2, La/ajd;->p:I

    .line 162
    .line 163
    iget-object v6, v4, La/hjd;->B:La/h3c;

    .line 164
    .line 165
    invoke-virtual {v6, v9, v10, v2}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    if-ne v2, v3, :cond_c

    .line 170
    .line 171
    return-object v3

    .line 172
    :cond_c
    move-object v3, v7

    .line 173
    move-object v7, v0

    .line 174
    move-object v0, v3

    .line 175
    move-object v6, v5

    .line 176
    move-object v5, v1

    .line 177
    move-object v1, v2

    .line 178
    move-wide v2, v11

    .line 179
    :goto_4
    check-cast v1, Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_d

    .line 186
    .line 187
    move-object v1, v0

    .line 188
    new-instance v0, La/yid;

    .line 189
    .line 190
    invoke-direct/range {v0 .. v7}, La/yid;-><init>(Ljava/lang/String;JLa/hjd;La/j1g;La/l1g;La/d0t;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v0}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    iget-object v1, v4, La/hjd;->A:La/vqc;

    .line 198
    .line 199
    invoke-virtual {v1, v0}, La/vqc;->k(La/m1g;)V

    .line 200
    .line 201
    .line 202
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object v0
.end method

.method public final m(JJJZ)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/tjd;

    .line 6
    .line 7
    iget-object v0, v0, La/tjd;->b:La/ms2;

    .line 8
    .line 9
    instance-of v1, v0, La/ds2;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, La/ds2;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {v0}, La/g1x;->v(La/ds2;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_1
    move-object v8, v0

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/tjd;

    .line 30
    .line 31
    iget-object v0, v0, La/tjd;->a:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :goto_2
    iget-object v1, p0, La/hjd;->y:La/bn6;

    .line 35
    .line 36
    move-wide v2, p1

    .line 37
    move-wide v4, p3

    .line 38
    move-wide v6, p5

    .line 39
    move/from16 v9, p7

    .line 40
    .line 41
    invoke-virtual/range {v1 .. v9}, La/bn6;->d(JJJLjava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, La/hjd;->z:La/je;

    .line 45
    .line 46
    invoke-virtual/range {v1 .. v9}, La/je;->f(JJJLjava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final n(La/vid;La/yje;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, La/bjd;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/bjd;

    .line 13
    .line 14
    iget v4, v3, La/bjd;->l:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/bjd;->l:I

    .line 24
    .line 25
    :goto_0
    move-object v14, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, La/bjd;

    .line 28
    .line 29
    invoke-direct {v3, v1, v2}, La/bjd;-><init>(La/hjd;La/yje;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v14, La/bjd;->j:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v15, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v3, v14, La/bjd;->l:I

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x1

    .line 41
    const/4 v6, 0x2

    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    if-eq v3, v5, :cond_2

    .line 45
    .line 46
    if-ne v3, v6, :cond_1

    .line 47
    .line 48
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_1b

    .line 52
    .line 53
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v4

    .line 59
    :cond_2
    iget-object v0, v14, La/bjd;->i:La/vid;

    .line 60
    .line 61
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, v14, La/bjd;->i:La/vid;

    .line 69
    .line 70
    iput v5, v14, La/bjd;->l:I

    .line 71
    .line 72
    invoke-static {v1, v0, v14}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-ne v2, v15, :cond_4

    .line 77
    .line 78
    goto/16 :goto_1a

    .line 79
    .line 80
    :cond_4
    :goto_2
    instance-of v2, v0, La/cid;

    .line 81
    .line 82
    iget-object v3, v1, La/x2t0;->b:La/ocj;

    .line 83
    .line 84
    if-eqz v2, :cond_6

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object v2, v3, La/ocj;->a:La/p7m0;

    .line 90
    .line 91
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    move-object v3, v1

    .line 96
    check-cast v3, La/tjd;

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-object v4, v0

    .line 102
    check-cast v4, La/cid;

    .line 103
    .line 104
    iget-object v5, v4, La/cid;->a:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v4, v4, La/cid;->b:La/ms2;

    .line 107
    .line 108
    const/4 v8, 0x0

    .line 109
    const/16 v9, 0x1c

    .line 110
    .line 111
    const/4 v6, 0x0

    .line 112
    const/4 v7, 0x0

    .line 113
    move-object/from16 v29, v5

    .line 114
    .line 115
    move-object v5, v4

    .line 116
    move-object/from16 v4, v29

    .line 117
    .line 118
    invoke-static/range {v3 .. v9}, La/tjd;->a(La/tjd;Ljava/lang/String;La/ms2;Ljava/util/List;La/m0k0;La/m97;I)La/tjd;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    instance-of v2, v0, La/did;

    .line 130
    .line 131
    if-eqz v2, :cond_8

    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object v2, v3, La/ocj;->a:La/p7m0;

    .line 137
    .line 138
    :cond_7
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    move-object v3, v1

    .line 143
    check-cast v3, La/tjd;

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-object v4, v0

    .line 149
    check-cast v4, La/did;

    .line 150
    .line 151
    iget-object v6, v4, La/did;->a:Ljava/util/List;

    .line 152
    .line 153
    const/4 v8, 0x0

    .line 154
    const/16 v9, 0x1b

    .line 155
    .line 156
    const/4 v4, 0x0

    .line 157
    const/4 v5, 0x0

    .line 158
    const/4 v7, 0x0

    .line 159
    invoke-static/range {v3 .. v9}, La/tjd;->a(La/tjd;Ljava/lang/String;La/ms2;Ljava/util/List;La/m0k0;La/m97;I)La/tjd;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_7

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_8
    sget-object v2, La/bid;->a:La/bid;

    .line 171
    .line 172
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_9

    .line 177
    .line 178
    invoke-virtual {v1}, La/x2t0;->e()V

    .line 179
    .line 180
    .line 181
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object v0

    .line 184
    :cond_9
    instance-of v2, v0, La/uid;

    .line 185
    .line 186
    if-eqz v2, :cond_43

    .line 187
    .line 188
    check-cast v0, La/uid;

    .line 189
    .line 190
    iput-object v4, v14, La/bjd;->i:La/vid;

    .line 191
    .line 192
    iput v6, v14, La/bjd;->l:I

    .line 193
    .line 194
    instance-of v2, v0, La/lid;

    .line 195
    .line 196
    const/4 v7, 0x0

    .line 197
    if-eqz v2, :cond_26

    .line 198
    .line 199
    check-cast v0, La/lid;

    .line 200
    .line 201
    iget-wide v8, v0, La/lid;->a:J

    .line 202
    .line 203
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    check-cast v2, La/tjd;

    .line 208
    .line 209
    iget-object v2, v2, La/tjd;->c:Ljava/util/List;

    .line 210
    .line 211
    invoke-static {v8, v9, v2}, La/hjd;->k(JLjava/util/List;)La/d0t;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    iget-wide v8, v0, La/lid;->b:J

    .line 216
    .line 217
    iget-wide v10, v0, La/lid;->c:J

    .line 218
    .line 219
    iget-object v0, v0, La/lid;->d:La/wgl0;

    .line 220
    .line 221
    sget-object v5, La/ugl0;->a:La/ugl0;

    .line 222
    .line 223
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-eqz v5, :cond_b

    .line 228
    .line 229
    invoke-virtual {v1, v2, v14}, La/hjd;->s(La/d0t;La/bjd;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-ne v0, v15, :cond_a

    .line 234
    .line 235
    goto/16 :goto_11

    .line 236
    .line 237
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    goto/16 :goto_11

    .line 240
    .line 241
    :cond_b
    instance-of v5, v0, La/vgl0;

    .line 242
    .line 243
    if-eqz v5, :cond_22

    .line 244
    .line 245
    check-cast v0, La/vgl0;

    .line 246
    .line 247
    iget-object v0, v0, La/vgl0;->a:La/xgl0;

    .line 248
    .line 249
    move-object/from16 v21, v0

    .line 250
    .line 251
    move-object/from16 v16, v2

    .line 252
    .line 253
    move-wide/from16 v17, v8

    .line 254
    .line 255
    move-wide/from16 v19, v10

    .line 256
    .line 257
    invoke-static/range {v16 .. v21}, La/hjd;->j(La/d0t;JJLa/xgl0;)Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    check-cast v5, La/tjd;

    .line 266
    .line 267
    iget-object v5, v5, La/tjd;->c:Ljava/util/List;

    .line 268
    .line 269
    invoke-static {v8, v9, v5}, La/hjd;->k(JLjava/util/List;)La/d0t;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-static {v2}, La/q0x;->Y(La/d0t;)La/m0k0;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    iget-object v9, v5, La/d0t;->i:Ljava/lang/String;

    .line 278
    .line 279
    const v10, -0x80001

    .line 280
    .line 281
    .line 282
    const-wide/16 v11, 0x0

    .line 283
    .line 284
    invoke-static {v8, v9, v11, v12, v10}, La/m0k0;->a(La/m0k0;Ljava/lang/String;JI)La/m0k0;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    iget-object v9, v1, La/hjd;->n:La/zyt;

    .line 289
    .line 290
    iget-object v9, v9, La/zyt;->a:La/uzc;

    .line 291
    .line 292
    invoke-virtual {v9}, La/uzc;->a()Z

    .line 293
    .line 294
    .line 295
    move-result v9

    .line 296
    move-object/from16 p2, v4

    .line 297
    .line 298
    move-object/from16 p1, v5

    .line 299
    .line 300
    iget-wide v4, v2, La/d0t;->u:J

    .line 301
    .line 302
    invoke-static {v0, v9, v4, v5}, La/p8a;->g0(Lorg/xplatform/betting/core/zip/model/zip/BetZip;ZJ)La/m97;

    .line 303
    .line 304
    .line 305
    move-result-object v21

    .line 306
    iget-object v4, v1, La/hjd;->i:La/e1u;

    .line 307
    .line 308
    invoke-virtual {v4}, La/e1u;->f()Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-eqz v4, :cond_1a

    .line 313
    .line 314
    iget-wide v4, v0, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->m:J

    .line 315
    .line 316
    iget-wide v9, v2, La/d0t;->v:J

    .line 317
    .line 318
    iget-wide v13, v2, La/d0t;->u:J

    .line 319
    .line 320
    cmp-long v0, v13, v11

    .line 321
    .line 322
    iget-object v2, v1, La/hjd;->p:La/mii0;

    .line 323
    .line 324
    if-eqz v0, :cond_c

    .line 325
    .line 326
    move-object/from16 v22, v2

    .line 327
    .line 328
    move-wide/from16 v25, v4

    .line 329
    .line 330
    move-wide/from16 v23, v9

    .line 331
    .line 332
    move-wide/from16 v27, v13

    .line 333
    .line 334
    invoke-virtual/range {v22 .. v28}, La/mii0;->K(JJJ)V

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_c
    move-object v0, v2

    .line 339
    move-wide/from16 v27, v13

    .line 340
    .line 341
    invoke-virtual {v0, v9, v10, v4, v5}, La/mii0;->J(JJ)V

    .line 342
    .line 343
    .line 344
    :goto_4
    iget-object v0, v1, La/hjd;->q:La/x20;

    .line 345
    .line 346
    move-object/from16 v22, v0

    .line 347
    .line 348
    move-wide/from16 v25, v4

    .line 349
    .line 350
    move-wide/from16 v23, v9

    .line 351
    .line 352
    invoke-virtual/range {v22 .. v28}, La/x20;->g(JJJ)V

    .line 353
    .line 354
    .line 355
    iget-object v0, v1, La/hjd;->l:La/jtj;

    .line 356
    .line 357
    invoke-virtual {v0}, La/jtj;->h()La/ose;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    iget-object v2, v1, La/hjd;->k:La/pq;

    .line 362
    .line 363
    invoke-static/range {v21 .. v21}, La/j2e;->W(La/m97;)La/ob7;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-virtual {v2, v4}, La/pq;->a(La/ob7;)Z

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    if-eqz v2, :cond_d

    .line 372
    .line 373
    sget-object v0, La/ljd;->a:La/ljd;

    .line 374
    .line 375
    invoke-virtual {v1, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    goto/16 :goto_10

    .line 379
    .line 380
    :cond_d
    iget-object v2, v1, La/hjd;->j:La/npx;

    .line 381
    .line 382
    iget-wide v4, v8, La/m0k0;->w:J

    .line 383
    .line 384
    invoke-virtual {v2, v4, v5}, La/npx;->a(J)Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    if-eqz v2, :cond_f

    .line 389
    .line 390
    sget-object v0, La/jjd;->a:La/jjd;

    .line 391
    .line 392
    invoke-virtual {v1, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    iget-object v2, v3, La/ocj;->a:La/p7m0;

    .line 399
    .line 400
    :goto_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    move-object/from16 v16, v0

    .line 405
    .line 406
    check-cast v16, La/tjd;

    .line 407
    .line 408
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    const/16 v19, 0x0

    .line 412
    .line 413
    const/16 v22, 0x7

    .line 414
    .line 415
    const/16 v17, 0x0

    .line 416
    .line 417
    const/16 v18, 0x0

    .line 418
    .line 419
    move-object/from16 v20, v8

    .line 420
    .line 421
    invoke-static/range {v16 .. v22}, La/tjd;->a(La/tjd;Ljava/lang/String;La/ms2;Ljava/util/List;La/m0k0;La/m97;I)La/tjd;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_e

    .line 430
    .line 431
    goto/16 :goto_10

    .line 432
    .line 433
    :cond_e
    move-object/from16 v8, v20

    .line 434
    .line 435
    goto :goto_5

    .line 436
    :cond_f
    move-object/from16 v20, v8

    .line 437
    .line 438
    instance-of v2, v0, La/lse;

    .line 439
    .line 440
    if-eqz v2, :cond_10

    .line 441
    .line 442
    sget-object v0, La/kjd;->a:La/kjd;

    .line 443
    .line 444
    invoke-virtual {v1, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    goto/16 :goto_10

    .line 448
    .line 449
    :cond_10
    instance-of v2, v0, La/mse;

    .line 450
    .line 451
    if-eqz v2, :cond_18

    .line 452
    .line 453
    new-instance v2, La/mjd;

    .line 454
    .line 455
    check-cast v0, La/mse;

    .line 456
    .line 457
    iget-object v4, v0, La/mse;->a:La/q4f;

    .line 458
    .line 459
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 460
    .line 461
    iget-object v0, v1, La/hjd;->w:La/ctf0;

    .line 462
    .line 463
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 464
    .line 465
    .line 466
    move-result v5

    .line 467
    if-eq v5, v6, :cond_15

    .line 468
    .line 469
    const/4 v6, 0x3

    .line 470
    if-eq v5, v6, :cond_14

    .line 471
    .line 472
    const/4 v6, 0x4

    .line 473
    if-eq v5, v6, :cond_13

    .line 474
    .line 475
    const/16 v6, 0x8

    .line 476
    .line 477
    if-eq v5, v6, :cond_12

    .line 478
    .line 479
    const/16 v6, 0x9

    .line 480
    .line 481
    if-eq v5, v6, :cond_11

    .line 482
    .line 483
    move v5, v7

    .line 484
    goto :goto_6

    .line 485
    :cond_11
    const v5, 0x7f130f1a

    .line 486
    .line 487
    .line 488
    goto :goto_6

    .line 489
    :cond_12
    const v5, 0x7f130c1d

    .line 490
    .line 491
    .line 492
    goto :goto_6

    .line 493
    :cond_13
    const v5, 0x7f1303fd

    .line 494
    .line 495
    .line 496
    goto :goto_6

    .line 497
    :cond_14
    const v5, 0x7f131476

    .line 498
    .line 499
    .line 500
    goto :goto_6

    .line 501
    :cond_15
    const v5, 0x7f13083c

    .line 502
    .line 503
    .line 504
    :goto_6
    new-array v6, v7, [Ljava/lang/Object;

    .line 505
    .line 506
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 507
    .line 508
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v6

    .line 512
    invoke-virtual {v0, v5, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 516
    goto :goto_7

    .line 517
    :catchall_0
    move-exception v0

    .line 518
    sget-object v5, La/j0g0;->b:La/e0g0;

    .line 519
    .line 520
    new-instance v5, La/g0g0;

    .line 521
    .line 522
    invoke-direct {v5, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 523
    .line 524
    .line 525
    move-object v0, v5

    .line 526
    :goto_7
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 527
    .line 528
    .line 529
    move-result-object v5

    .line 530
    if-nez v5, :cond_16

    .line 531
    .line 532
    goto :goto_8

    .line 533
    :cond_16
    const-string v0, ""

    .line 534
    .line 535
    :goto_8
    check-cast v0, Ljava/lang/String;

    .line 536
    .line 537
    sget-object v5, La/q4f;->a:La/nwd;

    .line 538
    .line 539
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-static {v4}, La/nwd;->c(La/q4f;)I

    .line 543
    .line 544
    .line 545
    move-result v4

    .line 546
    invoke-direct {v2, v0, v4}, La/mjd;-><init>(Ljava/lang/String;I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1, v2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 556
    .line 557
    :cond_17
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    move-object/from16 v16, v1

    .line 562
    .line 563
    check-cast v16, La/tjd;

    .line 564
    .line 565
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    const/16 v19, 0x0

    .line 569
    .line 570
    const/16 v22, 0x7

    .line 571
    .line 572
    const/16 v17, 0x0

    .line 573
    .line 574
    const/16 v18, 0x0

    .line 575
    .line 576
    invoke-static/range {v16 .. v22}, La/tjd;->a(La/tjd;Ljava/lang/String;La/ms2;Ljava/util/List;La/m0k0;La/m97;I)La/tjd;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    if-eqz v1, :cond_17

    .line 585
    .line 586
    goto/16 :goto_10

    .line 587
    .line 588
    :cond_18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    iget-object v3, v3, La/ocj;->a:La/p7m0;

    .line 592
    .line 593
    :goto_9
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    move-object/from16 v16, v0

    .line 598
    .line 599
    check-cast v16, La/tjd;

    .line 600
    .line 601
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    const/16 v19, 0x0

    .line 605
    .line 606
    const/16 v22, 0x7

    .line 607
    .line 608
    const/16 v17, 0x0

    .line 609
    .line 610
    const/16 v18, 0x0

    .line 611
    .line 612
    invoke-static/range {v16 .. v22}, La/tjd;->a(La/tjd;Ljava/lang/String;La/ms2;Ljava/util/List;La/m0k0;La/m97;I)La/tjd;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    move-object/from16 v4, v20

    .line 617
    .line 618
    move-object/from16 v5, v21

    .line 619
    .line 620
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    move-result v0

    .line 624
    if-eqz v0, :cond_19

    .line 625
    .line 626
    invoke-virtual {v1}, La/hjd;->p()V

    .line 627
    .line 628
    .line 629
    goto/16 :goto_10

    .line 630
    .line 631
    :cond_19
    move-object/from16 v20, v4

    .line 632
    .line 633
    move-object/from16 v21, v5

    .line 634
    .line 635
    goto :goto_9

    .line 636
    :cond_1a
    move-object v4, v8

    .line 637
    move-object/from16 v5, v21

    .line 638
    .line 639
    iget-object v3, v1, La/hjd;->D:La/pru;

    .line 640
    .line 641
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    iget-object v3, v3, La/sff0;->a:La/gx7;

    .line 646
    .line 647
    iget-boolean v3, v3, La/gx7;->g:Z

    .line 648
    .line 649
    if-eqz v3, :cond_1c

    .line 650
    .line 651
    sget-object v5, La/ctc;->a:La/ctc;

    .line 652
    .line 653
    move-object/from16 v3, p1

    .line 654
    .line 655
    move-object v4, v0

    .line 656
    move-object v6, v14

    .line 657
    invoke-virtual/range {v1 .. v6}, La/hjd;->i(La/d0t;La/d0t;Lorg/xplatform/betting/core/zip/model/zip/BetZip;La/ctc;La/zje;)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    if-ne v0, v15, :cond_1b

    .line 662
    .line 663
    goto/16 :goto_11

    .line 664
    .line 665
    :cond_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 666
    .line 667
    goto/16 :goto_11

    .line 668
    .line 669
    :cond_1c
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    check-cast v0, La/tjd;

    .line 674
    .line 675
    iget-object v0, v0, La/tjd;->b:La/ms2;

    .line 676
    .line 677
    instance-of v2, v0, La/ds2;

    .line 678
    .line 679
    if-eqz v2, :cond_1d

    .line 680
    .line 681
    check-cast v0, La/ds2;

    .line 682
    .line 683
    goto :goto_a

    .line 684
    :cond_1d
    move-object/from16 v0, p2

    .line 685
    .line 686
    :goto_a
    if-eqz v0, :cond_1e

    .line 687
    .line 688
    invoke-static {v0}, La/g1x;->v(La/ds2;)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    :goto_b
    move-object/from16 v25, v2

    .line 693
    .line 694
    goto :goto_c

    .line 695
    :cond_1e
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    check-cast v2, La/tjd;

    .line 700
    .line 701
    iget-object v2, v2, La/tjd;->b:La/ms2;

    .line 702
    .line 703
    invoke-static {v2}, La/kpb;->v0(La/ms2;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    goto :goto_b

    .line 708
    :goto_c
    iget-wide v2, v4, La/m0k0;->a:J

    .line 709
    .line 710
    iget-wide v6, v4, La/m0k0;->B:J

    .line 711
    .line 712
    cmp-long v8, v6, v11

    .line 713
    .line 714
    const-wide/16 v9, -0x1

    .line 715
    .line 716
    if-lez v8, :cond_1f

    .line 717
    .line 718
    move-wide/from16 v19, v6

    .line 719
    .line 720
    goto :goto_d

    .line 721
    :cond_1f
    move-wide/from16 v19, v9

    .line 722
    .line 723
    :goto_d
    iget-wide v11, v5, La/m97;->i:J

    .line 724
    .line 725
    if-eqz v0, :cond_20

    .line 726
    .line 727
    iget-wide v13, v4, La/m0k0;->z:J

    .line 728
    .line 729
    move-wide/from16 v23, v13

    .line 730
    .line 731
    goto :goto_e

    .line 732
    :cond_20
    move-wide/from16 v23, v9

    .line 733
    .line 734
    :goto_e
    iget-boolean v0, v4, La/m0k0;->x:Z

    .line 735
    .line 736
    iget-object v13, v1, La/hjd;->p:La/mii0;

    .line 737
    .line 738
    move/from16 v26, v0

    .line 739
    .line 740
    move-wide/from16 v17, v2

    .line 741
    .line 742
    move-wide/from16 v21, v11

    .line 743
    .line 744
    move-object/from16 v16, v13

    .line 745
    .line 746
    invoke-virtual/range {v16 .. v26}, La/mii0;->L(JJJJLjava/lang/String;Z)V

    .line 747
    .line 748
    .line 749
    iget-wide v2, v4, La/m0k0;->a:J

    .line 750
    .line 751
    if-lez v8, :cond_21

    .line 752
    .line 753
    move-wide/from16 v19, v6

    .line 754
    .line 755
    goto :goto_f

    .line 756
    :cond_21
    move-wide/from16 v19, v9

    .line 757
    .line 758
    :goto_f
    iget-wide v6, v5, La/m97;->i:J

    .line 759
    .line 760
    iget-wide v8, v4, La/m0k0;->z:J

    .line 761
    .line 762
    iget-boolean v0, v4, La/m0k0;->x:Z

    .line 763
    .line 764
    iget-object v10, v1, La/hjd;->x:La/x20;

    .line 765
    .line 766
    move/from16 v26, v0

    .line 767
    .line 768
    move-wide/from16 v17, v2

    .line 769
    .line 770
    move-wide/from16 v21, v6

    .line 771
    .line 772
    move-wide/from16 v23, v8

    .line 773
    .line 774
    move-object/from16 v16, v10

    .line 775
    .line 776
    invoke-virtual/range {v16 .. v26}, La/x20;->h(JJJJLjava/lang/String;Z)V

    .line 777
    .line 778
    .line 779
    sget-object v0, La/ojd;->a:La/ojd;

    .line 780
    .line 781
    invoke-virtual {v1, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    new-instance v0, La/pjd;

    .line 785
    .line 786
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v2

    .line 790
    check-cast v2, La/tjd;

    .line 791
    .line 792
    iget-object v2, v2, La/tjd;->b:La/ms2;

    .line 793
    .line 794
    invoke-direct {v0, v2, v5, v4}, La/pjd;-><init>(La/ms2;La/m97;La/m0k0;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v1, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 798
    .line 799
    .line 800
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 801
    .line 802
    goto :goto_11

    .line 803
    :cond_22
    move-object/from16 p2, v4

    .line 804
    .line 805
    sget-object v3, La/ugl0;->b:La/ugl0;

    .line 806
    .line 807
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    move-result v0

    .line 811
    if-eqz v0, :cond_25

    .line 812
    .line 813
    invoke-virtual {v1, v2, v14}, La/hjd;->s(La/d0t;La/bjd;)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    if-ne v0, v15, :cond_23

    .line 818
    .line 819
    goto :goto_11

    .line 820
    :cond_23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 821
    .line 822
    :goto_11
    sget-object v1, La/wne;->a:La/wne;

    .line 823
    .line 824
    if-ne v0, v1, :cond_24

    .line 825
    .line 826
    goto/16 :goto_19

    .line 827
    .line 828
    :cond_24
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 829
    .line 830
    goto/16 :goto_19

    .line 831
    .line 832
    :cond_25
    invoke-static {}, La/t9f;->b()V

    .line 833
    .line 834
    .line 835
    return-object p2

    .line 836
    :cond_26
    move-object/from16 p2, v4

    .line 837
    .line 838
    instance-of v2, v0, La/mid;

    .line 839
    .line 840
    if-eqz v2, :cond_29

    .line 841
    .line 842
    check-cast v0, La/mid;

    .line 843
    .line 844
    iget-wide v2, v0, La/mid;->a:J

    .line 845
    .line 846
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    check-cast v4, La/tjd;

    .line 851
    .line 852
    iget-object v4, v4, La/tjd;->c:Ljava/util/List;

    .line 853
    .line 854
    invoke-static {v2, v3, v4}, La/hjd;->k(JLjava/util/List;)La/d0t;

    .line 855
    .line 856
    .line 857
    move-result-object v2

    .line 858
    iget-wide v6, v0, La/mid;->b:J

    .line 859
    .line 860
    iget-wide v8, v0, La/mid;->c:J

    .line 861
    .line 862
    iget-object v10, v0, La/mid;->d:La/xgl0;

    .line 863
    .line 864
    move-object v5, v2

    .line 865
    invoke-static/range {v5 .. v10}, La/hjd;->j(La/d0t;JJLa/xgl0;)Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 866
    .line 867
    .line 868
    move-result-object v4

    .line 869
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    check-cast v0, La/tjd;

    .line 874
    .line 875
    iget-object v0, v0, La/tjd;->c:Ljava/util/List;

    .line 876
    .line 877
    invoke-static {v6, v7, v0}, La/hjd;->k(JLjava/util/List;)La/d0t;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    sget-object v5, La/ctc;->b:La/ctc;

    .line 882
    .line 883
    move-object v6, v14

    .line 884
    invoke-virtual/range {v1 .. v6}, La/hjd;->i(La/d0t;La/d0t;Lorg/xplatform/betting/core/zip/model/zip/BetZip;La/ctc;La/zje;)Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    if-ne v0, v15, :cond_27

    .line 889
    .line 890
    goto :goto_12

    .line 891
    :cond_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 892
    .line 893
    :goto_12
    if-ne v0, v15, :cond_28

    .line 894
    .line 895
    goto/16 :goto_19

    .line 896
    .line 897
    :cond_28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 898
    .line 899
    goto/16 :goto_19

    .line 900
    .line 901
    :cond_29
    instance-of v2, v0, La/fid;

    .line 902
    .line 903
    if-eqz v2, :cond_2a

    .line 904
    .line 905
    invoke-virtual {v1}, La/hjd;->p()V

    .line 906
    .line 907
    .line 908
    goto/16 :goto_18

    .line 909
    .line 910
    :cond_2a
    instance-of v2, v0, La/hid;

    .line 911
    .line 912
    if-eqz v2, :cond_2c

    .line 913
    .line 914
    check-cast v0, La/hid;

    .line 915
    .line 916
    iget-object v2, v0, La/hid;->a:La/m0k0;

    .line 917
    .line 918
    iget-object v0, v0, La/hid;->b:La/zxj0;

    .line 919
    .line 920
    invoke-virtual {v1, v2, v0, v14}, La/hjd;->r(La/m0k0;La/zxj0;La/zje;)Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    if-ne v0, v15, :cond_2b

    .line 925
    .line 926
    goto/16 :goto_19

    .line 927
    .line 928
    :cond_2b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 929
    .line 930
    goto/16 :goto_19

    .line 931
    .line 932
    :cond_2c
    instance-of v2, v0, La/eid;

    .line 933
    .line 934
    if-eqz v2, :cond_2e

    .line 935
    .line 936
    check-cast v0, La/eid;

    .line 937
    .line 938
    iget-object v2, v0, La/eid;->a:La/m0k0;

    .line 939
    .line 940
    iget-object v0, v0, La/eid;->b:La/zxj0;

    .line 941
    .line 942
    sget-object v3, La/ctc;->a:La/ctc;

    .line 943
    .line 944
    invoke-virtual {v1, v2, v0, v3, v14}, La/hjd;->o(La/m0k0;La/zxj0;La/ctc;La/zje;)Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    if-ne v0, v15, :cond_2d

    .line 949
    .line 950
    goto/16 :goto_19

    .line 951
    .line 952
    :cond_2d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 953
    .line 954
    goto/16 :goto_19

    .line 955
    .line 956
    :cond_2e
    sget-object v2, La/gid;->a:La/gid;

    .line 957
    .line 958
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 959
    .line 960
    .line 961
    move-result v2

    .line 962
    if-eqz v2, :cond_30

    .line 963
    .line 964
    invoke-virtual {v1, v14}, La/hjd;->q(La/zje;)Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    if-ne v0, v15, :cond_2f

    .line 969
    .line 970
    goto/16 :goto_19

    .line 971
    .line 972
    :cond_2f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 973
    .line 974
    goto/16 :goto_19

    .line 975
    .line 976
    :cond_30
    instance-of v2, v0, La/oid;

    .line 977
    .line 978
    iget-object v3, v1, La/hjd;->o:La/oeg0;

    .line 979
    .line 980
    if-eqz v2, :cond_31

    .line 981
    .line 982
    check-cast v0, La/oid;

    .line 983
    .line 984
    iget-wide v6, v0, La/oid;->a:J

    .line 985
    .line 986
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    check-cast v0, La/tjd;

    .line 991
    .line 992
    iget-object v0, v0, La/tjd;->c:Ljava/util/List;

    .line 993
    .line 994
    invoke-static {v6, v7, v0}, La/hjd;->k(JLjava/util/List;)La/d0t;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    invoke-virtual {v3}, La/oeg0;->c()La/i1w0;

    .line 999
    .line 1000
    .line 1001
    move-result-object v2

    .line 1002
    new-instance v3, La/xid;

    .line 1003
    .line 1004
    invoke-direct {v3, v1, v0, v5}, La/xid;-><init>(La/hjd;La/d0t;B)V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1008
    .line 1009
    .line 1010
    goto/16 :goto_18

    .line 1011
    .line 1012
    :cond_31
    instance-of v2, v0, La/pid;

    .line 1013
    .line 1014
    if-eqz v2, :cond_34

    .line 1015
    .line 1016
    check-cast v0, La/pid;

    .line 1017
    .line 1018
    iget-wide v2, v0, La/pid;->a:J

    .line 1019
    .line 1020
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    check-cast v0, La/tjd;

    .line 1025
    .line 1026
    iget-object v0, v0, La/tjd;->c:Ljava/util/List;

    .line 1027
    .line 1028
    invoke-static {v2, v3, v0}, La/hjd;->k(JLjava/util/List;)La/d0t;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v0

    .line 1032
    iget-wide v2, v0, La/d0t;->v:J

    .line 1033
    .line 1034
    iget-wide v4, v0, La/d0t;->u:J

    .line 1035
    .line 1036
    iget-wide v6, v0, La/d0t;->n:J

    .line 1037
    .line 1038
    iget-boolean v8, v0, La/d0t;->C:Z

    .line 1039
    .line 1040
    invoke-virtual/range {v1 .. v8}, La/hjd;->m(JJJZ)V

    .line 1041
    .line 1042
    .line 1043
    iget-wide v2, v0, La/d0t;->a:J

    .line 1044
    .line 1045
    iget-wide v4, v0, La/d0t;->v:J

    .line 1046
    .line 1047
    iget-wide v6, v0, La/d0t;->u:J

    .line 1048
    .line 1049
    iget-boolean v8, v0, La/d0t;->C:Z

    .line 1050
    .line 1051
    sget-object v9, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 1052
    .line 1053
    sget-object v10, La/grs;->b:La/grs;

    .line 1054
    .line 1055
    iget-object v11, v0, La/d0t;->o:Ljava/lang/String;

    .line 1056
    .line 1057
    iget-wide v12, v0, La/d0t;->n:J

    .line 1058
    .line 1059
    move-object/from16 v1, p0

    .line 1060
    .line 1061
    invoke-virtual/range {v1 .. v14}, La/hjd;->t(JJJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;JLa/zje;)Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    if-ne v0, v15, :cond_32

    .line 1066
    .line 1067
    goto :goto_13

    .line 1068
    :cond_32
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1069
    .line 1070
    :goto_13
    if-ne v0, v15, :cond_33

    .line 1071
    .line 1072
    goto/16 :goto_19

    .line 1073
    .line 1074
    :cond_33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1075
    .line 1076
    goto/16 :goto_19

    .line 1077
    .line 1078
    :cond_34
    instance-of v2, v0, La/rid;

    .line 1079
    .line 1080
    if-eqz v2, :cond_36

    .line 1081
    .line 1082
    check-cast v0, La/rid;

    .line 1083
    .line 1084
    iget-wide v4, v0, La/rid;->a:J

    .line 1085
    .line 1086
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    check-cast v0, La/tjd;

    .line 1091
    .line 1092
    iget-object v0, v0, La/tjd;->c:Ljava/util/List;

    .line 1093
    .line 1094
    invoke-static {v4, v5, v0}, La/hjd;->k(JLjava/util/List;)La/d0t;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v2

    .line 1102
    check-cast v2, La/tjd;

    .line 1103
    .line 1104
    iget-object v2, v2, La/tjd;->b:La/ms2;

    .line 1105
    .line 1106
    instance-of v2, v2, La/ks2;

    .line 1107
    .line 1108
    if-eqz v2, :cond_35

    .line 1109
    .line 1110
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v2

    .line 1114
    check-cast v2, La/tjd;

    .line 1115
    .line 1116
    iget-object v2, v2, La/tjd;->b:La/ms2;

    .line 1117
    .line 1118
    invoke-static {v2}, La/kpb;->v0(La/ms2;)Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v4

    .line 1122
    move-object v13, v4

    .line 1123
    goto :goto_14

    .line 1124
    :cond_35
    move-object/from16 v13, p2

    .line 1125
    .line 1126
    :goto_14
    iget-wide v9, v0, La/d0t;->v:J

    .line 1127
    .line 1128
    iget-wide v11, v0, La/d0t;->u:J

    .line 1129
    .line 1130
    iget-object v8, v1, La/hjd;->y:La/bn6;

    .line 1131
    .line 1132
    invoke-virtual/range {v8 .. v13}, La/bn6;->k(JJLjava/lang/String;)V

    .line 1133
    .line 1134
    .line 1135
    iget-wide v9, v0, La/d0t;->v:J

    .line 1136
    .line 1137
    iget-wide v11, v0, La/d0t;->u:J

    .line 1138
    .line 1139
    iget-object v8, v1, La/hjd;->z:La/je;

    .line 1140
    .line 1141
    invoke-virtual/range {v8 .. v13}, La/je;->n(JJLjava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v3}, La/oeg0;->c()La/i1w0;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v2

    .line 1148
    new-instance v3, La/xid;

    .line 1149
    .line 1150
    invoke-direct {v3, v1, v0, v7}, La/xid;-><init>(La/hjd;La/d0t;B)V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1154
    .line 1155
    .line 1156
    goto/16 :goto_18

    .line 1157
    .line 1158
    :cond_36
    instance-of v2, v0, La/kid;

    .line 1159
    .line 1160
    if-eqz v2, :cond_38

    .line 1161
    .line 1162
    check-cast v0, La/kid;

    .line 1163
    .line 1164
    iget-wide v2, v0, La/kid;->a:J

    .line 1165
    .line 1166
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v0

    .line 1170
    check-cast v0, La/tjd;

    .line 1171
    .line 1172
    iget-object v0, v0, La/tjd;->c:Ljava/util/List;

    .line 1173
    .line 1174
    invoke-static {v2, v3, v0}, La/hjd;->k(JLjava/util/List;)La/d0t;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    invoke-virtual {v1, v0, v14}, La/hjd;->s(La/d0t;La/bjd;)Ljava/lang/Object;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    if-ne v0, v15, :cond_37

    .line 1183
    .line 1184
    goto/16 :goto_19

    .line 1185
    .line 1186
    :cond_37
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1187
    .line 1188
    goto/16 :goto_19

    .line 1189
    .line 1190
    :cond_38
    instance-of v2, v0, La/sid;

    .line 1191
    .line 1192
    if-eqz v2, :cond_3c

    .line 1193
    .line 1194
    check-cast v0, La/sid;

    .line 1195
    .line 1196
    iget-wide v2, v0, La/sid;->a:J

    .line 1197
    .line 1198
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    check-cast v0, La/tjd;

    .line 1203
    .line 1204
    iget-object v0, v0, La/tjd;->c:Ljava/util/List;

    .line 1205
    .line 1206
    invoke-static {v2, v3, v0}, La/hjd;->k(JLjava/util/List;)La/d0t;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v0

    .line 1210
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v2

    .line 1214
    check-cast v2, La/tjd;

    .line 1215
    .line 1216
    iget-object v2, v2, La/tjd;->b:La/ms2;

    .line 1217
    .line 1218
    instance-of v2, v2, La/ks2;

    .line 1219
    .line 1220
    if-eqz v2, :cond_39

    .line 1221
    .line 1222
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v2

    .line 1226
    check-cast v2, La/tjd;

    .line 1227
    .line 1228
    iget-object v4, v2, La/tjd;->a:Ljava/lang/String;

    .line 1229
    .line 1230
    move-object v10, v4

    .line 1231
    goto :goto_15

    .line 1232
    :cond_39
    move-object/from16 v10, p2

    .line 1233
    .line 1234
    :goto_15
    iget-wide v6, v0, La/d0t;->v:J

    .line 1235
    .line 1236
    iget-wide v8, v0, La/d0t;->u:J

    .line 1237
    .line 1238
    iget-object v5, v1, La/hjd;->y:La/bn6;

    .line 1239
    .line 1240
    invoke-virtual/range {v5 .. v10}, La/bn6;->j(JJLjava/lang/String;)V

    .line 1241
    .line 1242
    .line 1243
    iget-wide v6, v0, La/d0t;->v:J

    .line 1244
    .line 1245
    iget-wide v8, v0, La/d0t;->u:J

    .line 1246
    .line 1247
    iget-object v5, v1, La/hjd;->z:La/je;

    .line 1248
    .line 1249
    invoke-virtual/range {v5 .. v10}, La/je;->l(JJLjava/lang/String;)V

    .line 1250
    .line 1251
    .line 1252
    iget-wide v2, v0, La/d0t;->v:J

    .line 1253
    .line 1254
    iget-wide v4, v0, La/d0t;->u:J

    .line 1255
    .line 1256
    iget-wide v6, v0, La/d0t;->n:J

    .line 1257
    .line 1258
    iget-boolean v8, v0, La/d0t;->C:Z

    .line 1259
    .line 1260
    invoke-virtual/range {v1 .. v8}, La/hjd;->m(JJJZ)V

    .line 1261
    .line 1262
    .line 1263
    iget-wide v2, v0, La/d0t;->a:J

    .line 1264
    .line 1265
    iget-wide v4, v0, La/d0t;->v:J

    .line 1266
    .line 1267
    iget-wide v6, v0, La/d0t;->u:J

    .line 1268
    .line 1269
    iget-boolean v8, v0, La/d0t;->C:Z

    .line 1270
    .line 1271
    sget-object v9, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->a:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 1272
    .line 1273
    sget-object v10, La/grs;->b:La/grs;

    .line 1274
    .line 1275
    iget-object v11, v0, La/d0t;->o:Ljava/lang/String;

    .line 1276
    .line 1277
    iget-wide v12, v0, La/d0t;->n:J

    .line 1278
    .line 1279
    move-object/from16 v1, p0

    .line 1280
    .line 1281
    invoke-virtual/range {v1 .. v14}, La/hjd;->t(JJJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;JLa/zje;)Ljava/lang/Object;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    if-ne v0, v15, :cond_3a

    .line 1286
    .line 1287
    goto :goto_16

    .line 1288
    :cond_3a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1289
    .line 1290
    :goto_16
    if-ne v0, v15, :cond_3b

    .line 1291
    .line 1292
    goto :goto_19

    .line 1293
    :cond_3b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1294
    .line 1295
    goto :goto_19

    .line 1296
    :cond_3c
    instance-of v1, v0, La/tid;

    .line 1297
    .line 1298
    if-eqz v1, :cond_3f

    .line 1299
    .line 1300
    check-cast v0, La/tid;

    .line 1301
    .line 1302
    iget-wide v0, v0, La/tid;->a:J

    .line 1303
    .line 1304
    invoke-virtual/range {p0 .. p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v2

    .line 1308
    check-cast v2, La/tjd;

    .line 1309
    .line 1310
    iget-object v2, v2, La/tjd;->c:Ljava/util/List;

    .line 1311
    .line 1312
    invoke-static {v0, v1, v2}, La/hjd;->k(JLjava/util/List;)La/d0t;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0

    .line 1316
    iget-wide v2, v0, La/d0t;->a:J

    .line 1317
    .line 1318
    iget-wide v4, v0, La/d0t;->v:J

    .line 1319
    .line 1320
    iget-wide v6, v0, La/d0t;->u:J

    .line 1321
    .line 1322
    iget-boolean v8, v0, La/d0t;->C:Z

    .line 1323
    .line 1324
    sget-object v9, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->b:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 1325
    .line 1326
    sget-object v10, La/grs;->b:La/grs;

    .line 1327
    .line 1328
    iget-object v11, v0, La/d0t;->o:Ljava/lang/String;

    .line 1329
    .line 1330
    iget-wide v12, v0, La/d0t;->n:J

    .line 1331
    .line 1332
    move-object/from16 v1, p0

    .line 1333
    .line 1334
    invoke-virtual/range {v1 .. v14}, La/hjd;->t(JJJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;JLa/zje;)Ljava/lang/Object;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    if-ne v0, v15, :cond_3d

    .line 1339
    .line 1340
    goto :goto_17

    .line 1341
    :cond_3d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1342
    .line 1343
    :goto_17
    if-ne v0, v15, :cond_3e

    .line 1344
    .line 1345
    goto :goto_19

    .line 1346
    :cond_3e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1347
    .line 1348
    goto :goto_19

    .line 1349
    :cond_3f
    instance-of v1, v0, La/nid;

    .line 1350
    .line 1351
    if-nez v1, :cond_41

    .line 1352
    .line 1353
    instance-of v1, v0, La/iid;

    .line 1354
    .line 1355
    if-nez v1, :cond_41

    .line 1356
    .line 1357
    instance-of v1, v0, La/jid;

    .line 1358
    .line 1359
    if-nez v1, :cond_41

    .line 1360
    .line 1361
    instance-of v0, v0, La/qid;

    .line 1362
    .line 1363
    if-eqz v0, :cond_40

    .line 1364
    .line 1365
    goto :goto_18

    .line 1366
    :cond_40
    invoke-static {}, La/t9f;->b()V

    .line 1367
    .line 1368
    .line 1369
    return-object p2

    .line 1370
    :cond_41
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1371
    .line 1372
    :goto_19
    if-ne v0, v15, :cond_42

    .line 1373
    .line 1374
    :goto_1a
    return-object v15

    .line 1375
    :cond_42
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1376
    .line 1377
    return-object v0

    .line 1378
    :cond_43
    move-object/from16 p2, v4

    .line 1379
    .line 1380
    invoke-static {}, La/t9f;->b()V

    .line 1381
    .line 1382
    .line 1383
    return-object p2
.end method

.method public final o(La/m0k0;La/zxj0;La/ctc;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, La/cjd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/cjd;

    .line 7
    .line 8
    iget v1, v0, La/cjd;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/cjd;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/cjd;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/cjd;-><init>(La/hjd;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/cjd;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/cjd;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p3, v0, La/cjd;->i:La/ctc;

    .line 37
    .line 38
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p4, p0, La/hjd;->r:La/lbu;

    .line 53
    .line 54
    invoke-virtual {p4}, La/lbu;->j()Z

    .line 55
    .line 56
    .line 57
    move-result p4

    .line 58
    if-eqz p4, :cond_3

    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    check-cast p4, La/tjd;

    .line 68
    .line 69
    iget-object p4, p4, La/tjd;->b:La/ms2;

    .line 70
    .line 71
    iput-object p3, v0, La/cjd;->i:La/ctc;

    .line 72
    .line 73
    iput v3, v0, La/cjd;->l:I

    .line 74
    .line 75
    iget-object v2, p0, La/hjd;->v:La/pmi;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {p4}, La/phu0;->Y(La/ms2;)La/gwe;

    .line 81
    .line 82
    .line 83
    move-result-object p4

    .line 84
    iget-object v2, v2, La/pmi;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, La/cr;

    .line 87
    .line 88
    invoke-static {v2, p1, p2, p4, v0}, La/cr;->c(La/cr;La/m0k0;La/zxj0;La/gwe;La/zje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    if-ne p4, v1, :cond_4

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_4
    :goto_1
    check-cast p4, La/aud;

    .line 96
    .line 97
    new-instance p1, La/njd;

    .line 98
    .line 99
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    check-cast p2, La/tjd;

    .line 104
    .line 105
    iget-object p2, p2, La/tjd;->b:La/ms2;

    .line 106
    .line 107
    invoke-direct {p1, p4, p3, p2}, La/njd;-><init>(La/aud;La/ctc;La/ms2;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0
.end method

.method public final p()V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/tjd;

    .line 6
    .line 7
    iget-object v0, v0, La/tjd;->d:La/m0k0;

    .line 8
    .line 9
    invoke-static {v0}, La/epv0;->a0(La/m0k0;)La/yx6;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La/tjd;

    .line 18
    .line 19
    iget-object v1, v1, La/tjd;->e:La/m97;

    .line 20
    .line 21
    invoke-static {v1}, La/j2e;->W(La/m97;)La/ob7;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, La/hjd;->m:La/ywq0;

    .line 26
    .line 27
    invoke-virtual {v2, v0, v1}, La/ywq0;->s(La/yx6;La/ob7;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, La/za50;

    .line 31
    .line 32
    const-wide/16 v8, 0x0

    .line 33
    .line 34
    const/4 v5, 0x7

    .line 35
    const/4 v4, 0x0

    .line 36
    const-wide/16 v6, 0x0

    .line 37
    .line 38
    invoke-direct/range {v3 .. v9}, La/za50;-><init>(IIJJ)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, La/hjd;->C:La/ouu;

    .line 42
    .line 43
    iget-object p0, p0, La/ouu;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, La/qe50;

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p0, v3, v0}, La/qe50;->a(La/cb50;Z)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final q(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/djd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/djd;

    .line 7
    .line 8
    iget v1, v0, La/djd;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/djd;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/djd;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/djd;-><init>(La/hjd;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/djd;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/djd;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/djd;->k:I

    .line 51
    .line 52
    iget-object p1, p0, La/hjd;->v:La/pmi;

    .line 53
    .line 54
    iget-object p1, p1, La/pmi;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, La/esg0;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/esg0;->Y(La/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v1, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    :goto_1
    if-ne p1, v1, :cond_4

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_4
    :goto_2
    sget-object p1, La/ijd;->a:La/ijd;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0
.end method

.method public final r(La/m0k0;La/zxj0;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/fjd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/fjd;

    .line 7
    .line 8
    iget v1, v0, La/fjd;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/fjd;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fjd;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/fjd;-><init>(La/hjd;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/fjd;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fjd;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    check-cast p3, La/tjd;

    .line 55
    .line 56
    iget-object p3, p3, La/tjd;->b:La/ms2;

    .line 57
    .line 58
    iput v3, v0, La/fjd;->k:I

    .line 59
    .line 60
    iget-object v2, p0, La/hjd;->v:La/pmi;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {p3}, La/phu0;->Y(La/ms2;)La/gwe;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    iget-object v2, v2, La/pmi;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, La/xzp;

    .line 72
    .line 73
    invoke-virtual {v2, p1, p2, p3, v0}, La/xzp;->N(La/m0k0;La/zxj0;La/gwe;La/zje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    if-ne p3, v1, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    :goto_1
    check-cast p3, La/vtd;

    .line 81
    .line 82
    new-instance p1, La/njd;

    .line 83
    .line 84
    sget-object p2, La/ctc;->b:La/ctc;

    .line 85
    .line 86
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, La/tjd;

    .line 91
    .line 92
    iget-object v0, v0, La/tjd;->b:La/ms2;

    .line 93
    .line 94
    invoke-direct {p1, p3, p2, v0}, La/njd;-><init>(La/aud;La/ctc;La/ms2;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0
.end method

.method public final s(La/d0t;La/bjd;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-wide v1, p1, La/d0t;->a:J

    .line 2
    .line 3
    iget-wide v3, p1, La/d0t;->v:J

    .line 4
    .line 5
    iget-wide v5, p1, La/d0t;->u:J

    .line 6
    .line 7
    iget-boolean v7, p1, La/d0t;->C:Z

    .line 8
    .line 9
    sget-object v8, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 10
    .line 11
    sget-object v9, La/grs;->a:La/grs;

    .line 12
    .line 13
    iget-object v10, p1, La/d0t;->o:Ljava/lang/String;

    .line 14
    .line 15
    iget-wide v11, p1, La/d0t;->n:J

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-object/from16 v13, p2

    .line 19
    .line 20
    invoke-virtual/range {v0 .. v13}, La/hjd;->t(JJJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;JLa/zje;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sget-object p1, La/wne;->a:La/wne;

    .line 25
    .line 26
    if-ne p0, p1, :cond_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method

.method public final t(JJJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;JLa/zje;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v0, p13

    .line 6
    .line 7
    instance-of v4, v0, La/gjd;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    move-object v4, v0

    .line 12
    check-cast v4, La/gjd;

    .line 13
    .line 14
    iget v5, v4, La/gjd;->s:I

    .line 15
    .line 16
    const/high16 v6, -0x80000000

    .line 17
    .line 18
    and-int v7, v5, v6

    .line 19
    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    sub-int/2addr v5, v6

    .line 23
    iput v5, v4, La/gjd;->s:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v4, La/gjd;

    .line 27
    .line 28
    invoke-direct {v4, v1, v0}, La/gjd;-><init>(La/hjd;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v4, La/gjd;->q:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v5, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v6, v4, La/gjd;->s:I

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x1

    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    if-ne v6, v8, :cond_1

    .line 42
    .line 43
    iget-wide v2, v4, La/gjd;->l:J

    .line 44
    .line 45
    iget-boolean v5, v4, La/gjd;->m:Z

    .line 46
    .line 47
    iget-wide v8, v4, La/gjd;->k:J

    .line 48
    .line 49
    iget-wide v10, v4, La/gjd;->j:J

    .line 50
    .line 51
    iget-wide v12, v4, La/gjd;->i:J

    .line 52
    .line 53
    iget-object v6, v4, La/gjd;->p:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v14, v4, La/gjd;->o:La/grs;

    .line 56
    .line 57
    iget-object v4, v4, La/gjd;->n:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 58
    .line 59
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-wide/from16 v18, v12

    .line 63
    .line 64
    move-object v12, v4

    .line 65
    move-object v13, v14

    .line 66
    move-object v14, v6

    .line 67
    move-wide v6, v8

    .line 68
    move-wide/from16 v20, v10

    .line 69
    .line 70
    move v11, v5

    .line 71
    move-wide v9, v2

    .line 72
    move-wide/from16 v4, v20

    .line 73
    .line 74
    move-wide/from16 v2, v18

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v7

    .line 83
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object/from16 v0, p8

    .line 87
    .line 88
    iput-object v0, v4, La/gjd;->n:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 89
    .line 90
    move-object/from16 v6, p9

    .line 91
    .line 92
    iput-object v6, v4, La/gjd;->o:La/grs;

    .line 93
    .line 94
    move-object/from16 v9, p10

    .line 95
    .line 96
    iput-object v9, v4, La/gjd;->p:Ljava/lang/String;

    .line 97
    .line 98
    move-wide/from16 v10, p1

    .line 99
    .line 100
    iput-wide v10, v4, La/gjd;->i:J

    .line 101
    .line 102
    iput-wide v2, v4, La/gjd;->j:J

    .line 103
    .line 104
    move-wide/from16 v12, p5

    .line 105
    .line 106
    iput-wide v12, v4, La/gjd;->k:J

    .line 107
    .line 108
    move/from16 v14, p7

    .line 109
    .line 110
    iput-boolean v14, v4, La/gjd;->m:Z

    .line 111
    .line 112
    move-wide/from16 v6, p11

    .line 113
    .line 114
    iput-wide v6, v4, La/gjd;->l:J

    .line 115
    .line 116
    iput v8, v4, La/gjd;->s:I

    .line 117
    .line 118
    iget-object v8, v1, La/hjd;->B:La/h3c;

    .line 119
    .line 120
    invoke-virtual {v8, v2, v3, v4}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    if-ne v4, v5, :cond_3

    .line 125
    .line 126
    return-object v5

    .line 127
    :cond_3
    move-wide/from16 v18, v12

    .line 128
    .line 129
    move-object v12, v0

    .line 130
    move-object v0, v4

    .line 131
    move-wide v4, v2

    .line 132
    move-wide v2, v10

    .line 133
    move v11, v14

    .line 134
    move-object v14, v9

    .line 135
    move-wide v9, v6

    .line 136
    move-wide/from16 v6, v18

    .line 137
    .line 138
    move-object/from16 v13, p9

    .line 139
    .line 140
    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, La/tjd;

    .line 151
    .line 152
    iget-object v0, v0, La/tjd;->c:Ljava/util/List;

    .line 153
    .line 154
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v15

    .line 162
    if-eqz v15, :cond_5

    .line 163
    .line 164
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v15

    .line 168
    move-object/from16 p1, v0

    .line 169
    .line 170
    move-object v0, v15

    .line 171
    check-cast v0, La/d0t;

    .line 172
    .line 173
    move-wide/from16 p2, v2

    .line 174
    .line 175
    iget-wide v2, v0, La/d0t;->a:J

    .line 176
    .line 177
    cmp-long v0, v2, p2

    .line 178
    .line 179
    if-nez v0, :cond_4

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_4
    move-object/from16 v0, p1

    .line 183
    .line 184
    move-wide/from16 v2, p2

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_5
    move-wide/from16 p2, v2

    .line 188
    .line 189
    const/4 v15, 0x0

    .line 190
    :goto_3
    check-cast v15, La/d0t;

    .line 191
    .line 192
    if-eqz v15, :cond_6

    .line 193
    .line 194
    iget v0, v15, La/d0t;->O:I

    .line 195
    .line 196
    :goto_4
    move v15, v0

    .line 197
    goto :goto_5

    .line 198
    :cond_6
    const/4 v0, 0x0

    .line 199
    goto :goto_4

    .line 200
    :goto_5
    iget-object v0, v1, La/hjd;->o:La/oeg0;

    .line 201
    .line 202
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    move-object v2, v0

    .line 207
    new-instance v0, La/wid;

    .line 208
    .line 209
    const/16 v16, 0x0

    .line 210
    .line 211
    move-object/from16 v17, v2

    .line 212
    .line 213
    move-wide/from16 v2, p2

    .line 214
    .line 215
    invoke-direct/range {v0 .. v16}, La/wid;-><init>(Ljava/lang/Object;JJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;IB)V

    .line 216
    .line 217
    .line 218
    move-object/from16 v2, v17

    .line 219
    .line 220
    invoke-virtual {v2, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 221
    .line 222
    .line 223
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object v0
.end method
