.class public final La/dvh;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public final o:La/fhj;

.field public final p:La/cmt;

.field public final q:Ljava/lang/String;

.field public final r:J

.field public final s:La/i1w0;

.field public final t:La/duj;

.field public final u:La/ieu;

.field public final v:La/do20;

.field public final w:La/cge0;

.field public final x:La/mne;

.field public final y:La/c4m0;


# direct methods
.method public constructor <init>(La/ctf0;La/qzt;La/fhj;La/cmt;La/wyu;Ljava/lang/String;JLa/i1w0;La/duj;La/m1e;La/zqu;La/ieu;La/do20;La/ocl;La/cge0;La/mne;La/uyu;La/pru;La/r9u;)V
    .locals 15

    .line 1
    move-object/from16 v9, p17

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p20 .. p20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/wuh;

    .line 16
    .line 17
    move-object/from16 v4, p1

    .line 18
    .line 19
    move-object/from16 v3, p2

    .line 20
    .line 21
    move-object/from16 v5, p3

    .line 22
    .line 23
    move-object/from16 v7, p5

    .line 24
    .line 25
    move-object/from16 v6, p6

    .line 26
    .line 27
    move-wide/from16 v1, p7

    .line 28
    .line 29
    move-object/from16 v8, p19

    .line 30
    .line 31
    invoke-direct/range {v0 .. v8}, La/wuh;-><init>(JLa/qzt;La/ctf0;La/fhj;Ljava/lang/String;La/wyu;La/pru;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, La/xuh;

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    move-object/from16 v1, p15

    .line 38
    .line 39
    move-object/from16 v2, p20

    .line 40
    .line 41
    invoke-direct {v3, v1, v2, v7}, La/xuh;-><init>(La/ocl;La/r9u;B)V

    .line 42
    .line 43
    .line 44
    iget-object v8, v9, La/mne;->a:La/rwj;

    .line 45
    .line 46
    invoke-static {v8, v8}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v1, 0x0

    .line 52
    move-object v2, v0

    .line 53
    move-object v0, p0

    .line 54
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 55
    .line 56
    .line 57
    move-object/from16 v5, p3

    .line 58
    .line 59
    iput-object v5, p0, La/dvh;->o:La/fhj;

    .line 60
    .line 61
    move-object/from16 v1, p4

    .line 62
    .line 63
    iput-object v1, p0, La/dvh;->p:La/cmt;

    .line 64
    .line 65
    iput-object v6, p0, La/dvh;->q:Ljava/lang/String;

    .line 66
    .line 67
    move-wide/from16 v1, p7

    .line 68
    .line 69
    iput-wide v1, p0, La/dvh;->r:J

    .line 70
    .line 71
    move-object/from16 v1, p9

    .line 72
    .line 73
    iput-object v1, p0, La/dvh;->s:La/i1w0;

    .line 74
    .line 75
    move-object/from16 v1, p10

    .line 76
    .line 77
    iput-object v1, p0, La/dvh;->t:La/duj;

    .line 78
    .line 79
    move-object/from16 v1, p13

    .line 80
    .line 81
    iput-object v1, p0, La/dvh;->u:La/ieu;

    .line 82
    .line 83
    move-object/from16 v1, p14

    .line 84
    .line 85
    iput-object v1, p0, La/dvh;->v:La/do20;

    .line 86
    .line 87
    move-object/from16 v1, p16

    .line 88
    .line 89
    iput-object v1, p0, La/dvh;->w:La/cge0;

    .line 90
    .line 91
    iput-object v9, p0, La/dvh;->x:La/mne;

    .line 92
    .line 93
    move-object/from16 v1, p12

    .line 94
    .line 95
    iget-object v1, v1, La/zqu;->a:La/nfm0;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v1, v1, La/nfm0;->c:La/ddm0;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object v2, v1, La/ddm0;->c:La/qoj0;

    .line 106
    .line 107
    invoke-static {v2}, La/vtb;->M(La/mz40;)La/vae0;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    new-instance v3, La/zj2;

    .line 112
    .line 113
    const/16 v4, 0x14

    .line 114
    .line 115
    invoke-direct {v3, v2, v1, v6, v4}, La/zj2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 116
    .line 117
    .line 118
    const/4 v1, 0x1

    .line 119
    invoke-static {v3, v1}, La/dtb;->U(La/gmq;I)La/qnq;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    new-instance v3, La/b1f;

    .line 124
    .line 125
    const/16 v4, 0xc

    .line 126
    .line 127
    const/4 v5, 0x0

    .line 128
    invoke-direct {v3, p0, v5, v4}, La/b1f;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 129
    .line 130
    .line 131
    new-instance v4, La/fnq;

    .line 132
    .line 133
    const/4 v6, 0x4

    .line 134
    invoke-direct {v4, v2, v3, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 135
    .line 136
    .line 137
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-static {v2, v8}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    new-instance v3, La/d7e;

    .line 146
    .line 147
    const/4 v9, 0x4

    .line 148
    const/16 v10, 0x14

    .line 149
    .line 150
    const/4 v11, 0x2

    .line 151
    const-class v12, La/dvh;

    .line 152
    .line 153
    const-string v13, "handleError"

    .line 154
    .line 155
    const-string v14, "handleError(Ljava/lang/Throwable;)V"

    .line 156
    .line 157
    move-object/from16 p3, p0

    .line 158
    .line 159
    move-object/from16 p1, v3

    .line 160
    .line 161
    move/from16 p7, v9

    .line 162
    .line 163
    move/from16 p8, v10

    .line 164
    .line 165
    move/from16 p2, v11

    .line 166
    .line 167
    move-object/from16 p4, v12

    .line 168
    .line 169
    move-object/from16 p5, v13

    .line 170
    .line 171
    move-object/from16 p6, v14

    .line 172
    .line 173
    invoke-direct/range {p1 .. p8}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 174
    .line 175
    .line 176
    invoke-static {v4, v2, v3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    iput-object v2, p0, La/dvh;->y:La/c4m0;

    .line 181
    .line 182
    move-object/from16 v2, p18

    .line 183
    .line 184
    iget-object v2, v2, La/uyu;->a:La/v6j0;

    .line 185
    .line 186
    invoke-virtual {v2}, La/v6j0;->h()La/qz40;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    new-instance v3, La/avh;

    .line 191
    .line 192
    invoke-direct {v3, p0, v5, v1}, La/avh;-><init>(La/dvh;La/yje;B)V

    .line 193
    .line 194
    .line 195
    new-instance v1, La/fnq;

    .line 196
    .line 197
    invoke-direct {v1, v2, v3, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 198
    .line 199
    .line 200
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-static {v2, v8}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    sget-object v3, La/bvh;->h:La/bvh;

    .line 209
    .line 210
    invoke-static {v1, v2, v3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 211
    .line 212
    .line 213
    invoke-interface/range {p11 .. p11}, La/m1e;->b()La/gmq;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    new-instance v2, La/igb;

    .line 218
    .line 219
    const/16 v3, 0x1a

    .line 220
    .line 221
    invoke-direct {v2, p0, v5, v3}, La/igb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 222
    .line 223
    .line 224
    new-instance v3, La/fnq;

    .line 225
    .line 226
    invoke-direct {v3, v1, v2, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 227
    .line 228
    .line 229
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-static {v1, v8}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    new-instance v2, La/avh;

    .line 238
    .line 239
    invoke-direct {v2, p0, v5, v7}, La/avh;-><init>(La/dvh;La/yje;B)V

    .line 240
    .line 241
    .line 242
    invoke-static {v3, v1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 243
    .line 244
    .line 245
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 14

    .line 1
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 2
    .line 3
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 4
    .line 5
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, La/ruh;

    .line 14
    .line 15
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v12, 0x0

    .line 21
    const/16 v13, 0x1fc7

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v9, 0x0

    .line 30
    const/4 v10, 0x0

    .line 31
    const/4 v11, 0x0

    .line 32
    invoke-static/range {v2 .. v13}, La/ruh;->a(La/ruh;La/nc5;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)La/ruh;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v0, p0, La/dvh;->x:La/mne;

    .line 47
    .line 48
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 49
    .line 50
    new-instance v3, La/yuh;

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-direct {v3, p0, v0}, La/yuh;-><init>(La/dvh;B)V

    .line 54
    .line 55
    .line 56
    new-instance v6, La/lv;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    const/4 v1, 0x4

    .line 60
    invoke-direct {v6, p0, v0, v1}, La/lv;-><init>(La/diu0;La/yje;B)V

    .line 61
    .line 62
    .line 63
    const/16 v7, 0xa

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final N(La/xqj0;La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, La/cvh;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/cvh;

    .line 7
    .line 8
    iget v1, v0, La/cvh;->l:I

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
    iput v1, v0, La/cvh;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/cvh;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/cvh;-><init>(La/dvh;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/cvh;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/cvh;->l:I

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
    iget-object p1, v0, La/cvh;->i:La/xqj0;

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, v0, La/cvh;->i:La/xqj0;

    .line 53
    .line 54
    iput v3, v0, La/cvh;->l:I

    .line 55
    .line 56
    iget-object p2, p0, La/dvh;->u:La/ieu;

    .line 57
    .line 58
    iget-wide v2, p0, La/dvh;->r:J

    .line 59
    .line 60
    invoke-virtual {p2, v2, v3, v0}, La/ieu;->f(JLa/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-ne p2, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast p2, La/ril0;

    .line 68
    .line 69
    iget-object v7, p2, La/ril0;->b:Ljava/lang/String;

    .line 70
    .line 71
    iget-object p2, p0, La/dvh;->v:La/do20;

    .line 72
    .line 73
    iget-object p2, p2, La/do20;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p2, La/nfm0;

    .line 76
    .line 77
    iget-object p2, p2, La/nfm0;->e:La/tgk;

    .line 78
    .line 79
    iget-object p2, p2, La/tgk;->a:La/us00;

    .line 80
    .line 81
    invoke-static {p2}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    iget-object v0, p1, La/xqj0;->c:La/lho;

    .line 86
    .line 87
    iget-wide v1, p1, La/xqj0;->b:J

    .line 88
    .line 89
    new-instance v3, La/znq0;

    .line 90
    .line 91
    invoke-direct {v3, v1, v2}, La/znq0;-><init>(J)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v3, p2}, La/pzb;->K(La/lho;La/znq0;Z)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    iget-object p2, p0, La/i3t0;->i:La/ocj;

    .line 99
    .line 100
    iget-object p2, p2, La/ocj;->a:La/p7m0;

    .line 101
    .line 102
    :cond_4
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-object v0, v12

    .line 110
    check-cast v0, La/ruh;

    .line 111
    .line 112
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v8, p1, La/xqj0;->o:Ljava/lang/String;

    .line 118
    .line 119
    const/4 v10, 0x0

    .line 120
    const/16 v11, 0x11ff

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    const/4 v2, 0x0

    .line 124
    const/4 v3, 0x0

    .line 125
    const/4 v4, 0x0

    .line 126
    const/4 v5, 0x0

    .line 127
    const/4 v6, 0x0

    .line 128
    invoke-static/range {v0 .. v11}, La/ruh;->a(La/ruh;La/nc5;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)La/ruh;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {p2, v12, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_4

    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/juh;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, La/guh;->a:La/guh;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    iget-object v2, p0, La/dvh;->s:La/i1w0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance p1, La/c8d;

    .line 25
    .line 26
    sget-object v0, La/y7d;->a:La/v7d;

    .line 27
    .line 28
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 29
    .line 30
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p1, v2, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    move-object p1, p0

    .line 38
    check-cast p1, La/paw;

    .line 39
    .line 40
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, La/oe50;

    .line 51
    .line 52
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    instance-of v0, p1, La/huh;

    .line 57
    .line 58
    if-eqz v0, :cond_6

    .line 59
    .line 60
    check-cast p1, La/huh;

    .line 61
    .line 62
    iget-object p1, p1, La/huh;->a:La/lvh;

    .line 63
    .line 64
    instance-of v0, p1, La/jvh;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    new-instance p1, La/yuh;

    .line 69
    .line 70
    invoke-direct {p1, p0, v1}, La/yuh;-><init>(La/dvh;B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    instance-of v0, p1, La/ivh;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-static {v2, v2}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v0, Lorg/xplatform/statistic/cycling/impl/cycling_results/presentation/CyclingResultsTableFragmentScreen;

    .line 86
    .line 87
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/ruh;

    .line 92
    .line 93
    iget-object p0, p0, La/ruh;->i:Ljava/lang/String;

    .line 94
    .line 95
    invoke-direct {v0, p0}, Lorg/xplatform/statistic/cycling/impl/cycling_results/presentation/CyclingResultsTableFragmentScreen;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 99
    .line 100
    .line 101
    iget-object p0, p1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 102
    .line 103
    invoke-static {v2, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_1
    move-object p1, p0

    .line 108
    check-cast p1, La/paw;

    .line 109
    .line 110
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_2

    .line 115
    .line 116
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, La/oe50;

    .line 121
    .line 122
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    return-void

    .line 127
    :cond_3
    instance-of p0, p1, La/kvh;

    .line 128
    .line 129
    if-eqz p0, :cond_5

    .line 130
    .line 131
    :cond_4
    return-void

    .line 132
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_6
    sget-object v0, La/iuh;->a:La/iuh;

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-eqz p1, :cond_7

    .line 143
    .line 144
    invoke-virtual {p0}, La/dvh;->M()V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 149
    .line 150
    .line 151
    return-void
.end method
