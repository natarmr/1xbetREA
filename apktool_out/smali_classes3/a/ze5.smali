.class public final La/ze5;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/b5v;

.field public final c:La/nw20;

.field public final d:La/j910;

.field public final e:La/u8u;

.field public final f:La/b5v;

.field public final g:La/g090;

.field public final h:La/cad;

.field public final i:La/ocl;

.field public final j:La/mne;

.field public final k:Ljava/util/ArrayList;

.field public final l:La/p7m0;


# direct methods
.method public constructor <init>(La/b5v;La/nw20;La/j910;La/u8u;La/b5v;La/g090;La/cad;La/ocl;La/mne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ze5;->b:La/b5v;

    .line 5
    .line 6
    iput-object p2, p0, La/ze5;->c:La/nw20;

    .line 7
    .line 8
    iput-object p3, p0, La/ze5;->d:La/j910;

    .line 9
    .line 10
    iput-object p4, p0, La/ze5;->e:La/u8u;

    .line 11
    .line 12
    iput-object p5, p0, La/ze5;->f:La/b5v;

    .line 13
    .line 14
    iput-object p6, p0, La/ze5;->g:La/g090;

    .line 15
    .line 16
    iput-object p7, p0, La/ze5;->h:La/cad;

    .line 17
    .line 18
    iput-object p8, p0, La/ze5;->i:La/ocl;

    .line 19
    .line 20
    iput-object p9, p0, La/ze5;->j:La/mne;

    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/ze5;->k:Ljava/util/ArrayList;

    .line 28
    .line 29
    sget-object p1, La/ee5;->a:La/ee5;

    .line 30
    .line 31
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, La/ze5;->l:La/p7m0;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final w(Z)Z
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/ze5;->k:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, La/bby;

    .line 24
    .line 25
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-ne p0, p1, :cond_2

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_2
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public final x(JLjava/lang/String;Ljava/lang/String;La/rwn;La/zje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    instance-of v3, v2, La/ue5;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/ue5;

    .line 13
    .line 14
    iget v4, v3, La/ue5;->o:I

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
    iput v4, v3, La/ue5;->o:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/ue5;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, La/ue5;-><init>(La/ze5;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/ue5;->m:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/ue5;->o:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v7, :cond_1

    .line 42
    .line 43
    iget-wide v4, v3, La/ue5;->i:J

    .line 44
    .line 45
    iget-object v0, v3, La/ue5;->l:La/rwn;

    .line 46
    .line 47
    iget-object v6, v3, La/ue5;->k:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v3, v3, La/ue5;->j:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object v7, v3

    .line 55
    move-object v3, v2

    .line 56
    move-object v2, v7

    .line 57
    :goto_1
    move-object v7, v0

    .line 58
    goto :goto_3

    .line 59
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v6

    .line 65
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v2, p3

    .line 69
    .line 70
    iput-object v2, v3, La/ue5;->j:Ljava/lang/String;

    .line 71
    .line 72
    move-object/from16 v10, p4

    .line 73
    .line 74
    iput-object v10, v3, La/ue5;->k:Ljava/lang/String;

    .line 75
    .line 76
    iput-object v0, v3, La/ue5;->l:La/rwn;

    .line 77
    .line 78
    move-wide/from16 v14, p1

    .line 79
    .line 80
    iput-wide v14, v3, La/ue5;->i:J

    .line 81
    .line 82
    iput v7, v3, La/ue5;->o:I

    .line 83
    .line 84
    iget-object v5, v1, La/ze5;->e:La/u8u;

    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    instance-of v7, v0, La/pwn;

    .line 92
    .line 93
    const/4 v12, 0x0

    .line 94
    if-eqz v7, :cond_3

    .line 95
    .line 96
    iget-object v5, v5, La/u8u;->c:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v9, v5

    .line 99
    check-cast v9, La/xex;

    .line 100
    .line 101
    move-object v5, v0

    .line 102
    check-cast v5, La/pwn;

    .line 103
    .line 104
    iget-object v11, v5, La/pwn;->a:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v5, v9, La/xex;->a:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v5, La/mne;

    .line 109
    .line 110
    iget-object v5, v5, La/mne;->b:La/dvj;

    .line 111
    .line 112
    new-instance v8, La/ke5;

    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    invoke-direct/range {v8 .. v13}, La/ke5;-><init>(La/xex;Ljava/lang/String;Ljava/lang/String;La/yje;B)V

    .line 116
    .line 117
    .line 118
    invoke-static {v5, v8, v3}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    goto :goto_2

    .line 123
    :cond_3
    instance-of v7, v0, La/qwn;

    .line 124
    .line 125
    if-eqz v7, :cond_5

    .line 126
    .line 127
    iget-object v5, v5, La/u8u;->b:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v9, v5

    .line 130
    check-cast v9, La/xex;

    .line 131
    .line 132
    move-object v5, v0

    .line 133
    check-cast v5, La/qwn;

    .line 134
    .line 135
    iget-object v11, v5, La/qwn;->a:Ljava/lang/String;

    .line 136
    .line 137
    iget-object v5, v9, La/xex;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v5, La/mne;

    .line 140
    .line 141
    iget-object v5, v5, La/mne;->b:La/dvj;

    .line 142
    .line 143
    new-instance v8, La/ke5;

    .line 144
    .line 145
    const/4 v13, 0x0

    .line 146
    move-object/from16 v10, p4

    .line 147
    .line 148
    invoke-direct/range {v8 .. v13}, La/ke5;-><init>(La/xex;Ljava/lang/String;Ljava/lang/String;La/yje;B)V

    .line 149
    .line 150
    .line 151
    invoke-static {v5, v8, v3}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    :goto_2
    if-ne v3, v4, :cond_4

    .line 156
    .line 157
    return-object v4

    .line 158
    :cond_4
    move-object/from16 v6, p4

    .line 159
    .line 160
    move-wide v4, v14

    .line 161
    goto :goto_1

    .line 162
    :goto_3
    check-cast v3, Ljava/io/File;

    .line 163
    .line 164
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    iget-object v0, v1, La/ze5;->j:La/mne;

    .line 169
    .line 170
    iget-object v11, v0, La/mne;->c:La/vs10;

    .line 171
    .line 172
    new-instance v0, La/dc0;

    .line 173
    .line 174
    const/16 v8, 0xb

    .line 175
    .line 176
    move-object/from16 p1, v0

    .line 177
    .line 178
    move-object/from16 p2, v1

    .line 179
    .line 180
    move-object/from16 p5, v2

    .line 181
    .line 182
    move-object/from16 p3, v6

    .line 183
    .line 184
    move-object/from16 p4, v7

    .line 185
    .line 186
    move/from16 p6, v8

    .line 187
    .line 188
    invoke-direct/range {p1 .. p6}, La/dc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 189
    .line 190
    .line 191
    move-object/from16 v12, p1

    .line 192
    .line 193
    new-instance v0, La/we5;

    .line 194
    .line 195
    const/4 v8, 0x0

    .line 196
    const/4 v9, 0x0

    .line 197
    move-object/from16 v1, p0

    .line 198
    .line 199
    invoke-direct/range {v0 .. v9}, La/we5;-><init>(La/ze5;Ljava/lang/String;Ljava/io/File;JLjava/lang/String;Ljava/lang/Object;La/yje;B)V

    .line 200
    .line 201
    .line 202
    const/16 v2, 0xa

    .line 203
    .line 204
    const/4 v3, 0x0

    .line 205
    move-object/from16 p5, v0

    .line 206
    .line 207
    move/from16 p6, v2

    .line 208
    .line 209
    move-object/from16 p3, v3

    .line 210
    .line 211
    move-object/from16 p1, v10

    .line 212
    .line 213
    move-object/from16 p4, v11

    .line 214
    .line 215
    move-object/from16 p2, v12

    .line 216
    .line 217
    invoke-static/range {p1 .. p6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iget-object v1, v1, La/ze5;->k:Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object v0

    .line 229
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 230
    .line 231
    .line 232
    return-object v6
.end method

.method public final y(Ljava/lang/String;JLjava/lang/String;La/xwn;La/zje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    instance-of v3, v2, La/xe5;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/xe5;

    .line 13
    .line 14
    iget v4, v3, La/xe5;->o:I

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
    iput v4, v3, La/xe5;->o:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/xe5;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, La/xe5;-><init>(La/ze5;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/xe5;->m:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/xe5;->o:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v7, :cond_1

    .line 42
    .line 43
    iget-wide v4, v3, La/xe5;->l:J

    .line 44
    .line 45
    iget-object v0, v3, La/xe5;->k:La/xwn;

    .line 46
    .line 47
    iget-object v6, v3, La/xe5;->j:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v3, v3, La/xe5;->i:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object v7, v3

    .line 55
    move-object v3, v2

    .line 56
    move-object v2, v7

    .line 57
    :goto_1
    move-object v7, v0

    .line 58
    goto :goto_3

    .line 59
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v6

    .line 65
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v2, p1

    .line 69
    .line 70
    iput-object v2, v3, La/xe5;->i:Ljava/lang/String;

    .line 71
    .line 72
    move-object/from16 v10, p4

    .line 73
    .line 74
    iput-object v10, v3, La/xe5;->j:Ljava/lang/String;

    .line 75
    .line 76
    iput-object v0, v3, La/xe5;->k:La/xwn;

    .line 77
    .line 78
    move-wide/from16 v14, p2

    .line 79
    .line 80
    iput-wide v14, v3, La/xe5;->l:J

    .line 81
    .line 82
    iput v7, v3, La/xe5;->o:I

    .line 83
    .line 84
    iget-object v5, v1, La/ze5;->b:La/b5v;

    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    instance-of v7, v0, La/vwn;

    .line 92
    .line 93
    const/4 v12, 0x0

    .line 94
    if-eqz v7, :cond_3

    .line 95
    .line 96
    iget-object v9, v5, La/b5v;->a:La/xex;

    .line 97
    .line 98
    move-object v5, v0

    .line 99
    check-cast v5, La/vwn;

    .line 100
    .line 101
    iget-object v11, v5, La/vwn;->a:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v5, v9, La/xex;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v5, La/mne;

    .line 106
    .line 107
    iget-object v5, v5, La/mne;->b:La/dvj;

    .line 108
    .line 109
    new-instance v8, La/ke5;

    .line 110
    .line 111
    const/4 v13, 0x1

    .line 112
    invoke-direct/range {v8 .. v13}, La/ke5;-><init>(La/xex;Ljava/lang/String;Ljava/lang/String;La/yje;B)V

    .line 113
    .line 114
    .line 115
    invoke-static {v5, v8, v3}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    goto :goto_2

    .line 120
    :cond_3
    instance-of v7, v0, La/wwn;

    .line 121
    .line 122
    if-eqz v7, :cond_5

    .line 123
    .line 124
    iget-object v9, v5, La/b5v;->b:La/xex;

    .line 125
    .line 126
    move-object v5, v0

    .line 127
    check-cast v5, La/wwn;

    .line 128
    .line 129
    iget-object v11, v5, La/wwn;->a:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v5, v9, La/xex;->a:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v5, La/mne;

    .line 134
    .line 135
    iget-object v5, v5, La/mne;->b:La/dvj;

    .line 136
    .line 137
    new-instance v8, La/ke5;

    .line 138
    .line 139
    const/4 v13, 0x1

    .line 140
    move-object/from16 v10, p4

    .line 141
    .line 142
    invoke-direct/range {v8 .. v13}, La/ke5;-><init>(La/xex;Ljava/lang/String;Ljava/lang/String;La/yje;B)V

    .line 143
    .line 144
    .line 145
    invoke-static {v5, v8, v3}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    :goto_2
    if-ne v3, v4, :cond_4

    .line 150
    .line 151
    return-object v4

    .line 152
    :cond_4
    move-object/from16 v6, p4

    .line 153
    .line 154
    move-wide v4, v14

    .line 155
    goto :goto_1

    .line 156
    :goto_3
    check-cast v3, Ljava/io/File;

    .line 157
    .line 158
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    iget-object v0, v1, La/ze5;->j:La/mne;

    .line 163
    .line 164
    iget-object v11, v0, La/mne;->c:La/vs10;

    .line 165
    .line 166
    new-instance v0, La/dc0;

    .line 167
    .line 168
    const/16 v8, 0xa

    .line 169
    .line 170
    move-object/from16 p1, v0

    .line 171
    .line 172
    move-object/from16 p2, v1

    .line 173
    .line 174
    move-object/from16 p5, v2

    .line 175
    .line 176
    move-object/from16 p3, v6

    .line 177
    .line 178
    move-object/from16 p4, v7

    .line 179
    .line 180
    move/from16 p6, v8

    .line 181
    .line 182
    invoke-direct/range {p1 .. p6}, La/dc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 183
    .line 184
    .line 185
    move-object/from16 v12, p1

    .line 186
    .line 187
    new-instance v0, La/we5;

    .line 188
    .line 189
    const/4 v8, 0x0

    .line 190
    const/4 v9, 0x1

    .line 191
    move-object/from16 v1, p0

    .line 192
    .line 193
    invoke-direct/range {v0 .. v9}, La/we5;-><init>(La/ze5;Ljava/lang/String;Ljava/io/File;JLjava/lang/String;Ljava/lang/Object;La/yje;B)V

    .line 194
    .line 195
    .line 196
    const/16 v2, 0xa

    .line 197
    .line 198
    const/4 v3, 0x0

    .line 199
    move-object/from16 p5, v0

    .line 200
    .line 201
    move/from16 p6, v2

    .line 202
    .line 203
    move-object/from16 p3, v3

    .line 204
    .line 205
    move-object/from16 p1, v10

    .line 206
    .line 207
    move-object/from16 p4, v11

    .line 208
    .line 209
    move-object/from16 p2, v12

    .line 210
    .line 211
    invoke-static/range {p1 .. p6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iget-object v1, v1, La/ze5;->k:Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 224
    .line 225
    .line 226
    return-object v6
.end method
