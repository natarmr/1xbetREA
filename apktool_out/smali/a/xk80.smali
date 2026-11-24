.class public abstract La/xk80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bch0;


# instance fields
.field public final A:La/qbz;

.field public final B:La/pz40;

.field public final C:La/pz40;

.field public final D:La/pz40;

.field public final E:La/pz40;

.field public final F:La/pz40;

.field public final G:La/pz40;

.field public a:Z

.field public b:La/pk80;

.field public final c:La/pz40;

.field public final d:La/qaj;

.field public e:I

.field public f:I

.field public g:J

.field public h:J

.field public i:F

.field public j:F

.field public final k:La/ywj;

.field public final l:Z

.field public final m:La/pz40;

.field public n:La/w6k;

.field public o:I

.field public final p:La/gy40;

.field public final q:La/cgk0;

.field public final r:La/cgk0;

.field public final s:La/zbk;

.field public final t:La/zbk;

.field public final u:La/tbz;

.field public final v:La/sj80;

.field public final w:La/hru;

.field public final x:La/la5;

.field public final y:La/pz40;

.field public final z:La/a9z;


# direct methods
.method public constructor <init>(FI)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    float-to-double v0, p1

    .line 5
    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    .line 6
    .line 7
    cmpg-double v2, v2, v0

    .line 8
    .line 9
    if-gtz v2, :cond_0

    .line 10
    .line 11
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 12
    .line 13
    cmpg-double v0, v0, v2

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "currentPageOffsetFraction "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, " is not within the range -0.5 to 0.5"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, La/adx;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    new-instance v0, La/ne60;

    .line 41
    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, La/ne60;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, La/xk80;->c:La/pz40;

    .line 52
    .line 53
    new-instance v0, La/qaj;

    .line 54
    .line 55
    invoke-direct {v0, p2, p1, p0}, La/qaj;-><init>(IFLa/xk80;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, La/xk80;->d:La/qaj;

    .line 59
    .line 60
    iput p2, p0, La/xk80;->e:I

    .line 61
    .line 62
    const-wide v0, 0x7fffffffffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    iput-wide v0, p0, La/xk80;->g:J

    .line 68
    .line 69
    new-instance p1, La/uk80;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {p1, p0, v0}, La/uk80;-><init>(La/xk80;B)V

    .line 73
    .line 74
    .line 75
    new-instance v1, La/ywj;

    .line 76
    .line 77
    invoke-direct {v1, p1}, La/ywj;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, La/xk80;->k:La/ywj;

    .line 81
    .line 82
    const/4 p1, 0x1

    .line 83
    iput-boolean p1, p0, La/xk80;->l:Z

    .line 84
    .line 85
    sget-object v1, La/zk80;->b:La/pk80;

    .line 86
    .line 87
    sget-object v2, La/m2a;->v:La/m2a;

    .line 88
    .line 89
    invoke-static {v1, v2}, Landroidx/compose/runtime/e;->d(Ljava/lang/Object;La/igk0;)La/pz40;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iput-object v1, p0, La/xk80;->m:La/pz40;

    .line 94
    .line 95
    sget-object v1, La/zk80;->a:La/yk80;

    .line 96
    .line 97
    iput-object v1, p0, La/xk80;->n:La/w6k;

    .line 98
    .line 99
    new-instance v1, La/gy40;

    .line 100
    .line 101
    invoke-direct {v1}, La/gy40;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v1, p0, La/xk80;->p:La/gy40;

    .line 105
    .line 106
    const/4 v1, -0x1

    .line 107
    invoke-static {v1}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iput-object v1, p0, La/xk80;->q:La/cgk0;

    .line 112
    .line 113
    invoke-static {p2}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    iput-object p2, p0, La/xk80;->r:La/cgk0;

    .line 118
    .line 119
    sget-object p2, La/rek0;->c:La/rek0;

    .line 120
    .line 121
    new-instance v1, La/s39;

    .line 122
    .line 123
    const/16 v2, 0x1a

    .line 124
    .line 125
    invoke-direct {v1, p0, v2}, La/s39;-><init>(La/xk80;B)V

    .line 126
    .line 127
    .line 128
    sget-object v2, La/jgk0;->a:La/nvu;

    .line 129
    .line 130
    new-instance v2, La/zbk;

    .line 131
    .line 132
    invoke-direct {v2, v1, p2}, La/zbk;-><init>(Lkotlin/jvm/functions/Function0;La/igk0;)V

    .line 133
    .line 134
    .line 135
    iput-object v2, p0, La/xk80;->s:La/zbk;

    .line 136
    .line 137
    new-instance v1, La/s39;

    .line 138
    .line 139
    const/16 v2, 0x1b

    .line 140
    .line 141
    invoke-direct {v1, p0, v2}, La/s39;-><init>(La/xk80;B)V

    .line 142
    .line 143
    .line 144
    new-instance v2, La/zbk;

    .line 145
    .line 146
    invoke-direct {v2, v1, p2}, La/zbk;-><init>(Lkotlin/jvm/functions/Function0;La/igk0;)V

    .line 147
    .line 148
    .line 149
    iput-object v2, p0, La/xk80;->t:La/zbk;

    .line 150
    .line 151
    new-instance p2, La/tbz;

    .line 152
    .line 153
    new-instance v1, La/uk80;

    .line 154
    .line 155
    invoke-direct {v1, p0, p1}, La/uk80;-><init>(La/xk80;B)V

    .line 156
    .line 157
    .line 158
    invoke-direct {p2, v1}, La/tbz;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 159
    .line 160
    .line 161
    iput-object p2, p0, La/xk80;->u:La/tbz;

    .line 162
    .line 163
    new-instance p1, La/o470;

    .line 164
    .line 165
    invoke-direct {p1, p0}, La/o470;-><init>(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    new-instance v1, La/sj80;

    .line 169
    .line 170
    new-instance v2, La/s39;

    .line 171
    .line 172
    const/16 v3, 0x1c

    .line 173
    .line 174
    invoke-direct {v2, p0, v3}, La/s39;-><init>(La/xk80;B)V

    .line 175
    .line 176
    .line 177
    invoke-direct {v1, p1, p2, v2}, La/sj80;-><init>(La/o470;La/tbz;La/s39;)V

    .line 178
    .line 179
    .line 180
    iput-object v1, p0, La/xk80;->v:La/sj80;

    .line 181
    .line 182
    new-instance p1, La/hru;

    .line 183
    .line 184
    const/16 p2, 0x19

    .line 185
    .line 186
    invoke-direct {p1, p2}, La/hru;-><init>(B)V

    .line 187
    .line 188
    .line 189
    iput-object p1, p0, La/xk80;->w:La/hru;

    .line 190
    .line 191
    new-instance p1, La/la5;

    .line 192
    .line 193
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 194
    .line 195
    .line 196
    iput-object p1, p0, La/xk80;->x:La/la5;

    .line 197
    .line 198
    const/4 p1, 0x0

    .line 199
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    iput-object p1, p0, La/xk80;->y:La/pz40;

    .line 204
    .line 205
    new-instance p1, La/a9z;

    .line 206
    .line 207
    const/4 p2, 0x3

    .line 208
    invoke-direct {p1, p0, p2}, La/a9z;-><init>(La/bch0;B)V

    .line 209
    .line 210
    .line 211
    iput-object p1, p0, La/xk80;->z:La/a9z;

    .line 212
    .line 213
    const/16 p1, 0xf

    .line 214
    .line 215
    invoke-static {v0, v0, v0, v0, p1}, La/r4e;->b(IIIII)J

    .line 216
    .line 217
    .line 218
    new-instance p1, La/qbz;

    .line 219
    .line 220
    invoke-direct {p1}, La/qbz;-><init>()V

    .line 221
    .line 222
    .line 223
    iput-object p1, p0, La/xk80;->A:La/qbz;

    .line 224
    .line 225
    invoke-static {}, La/m8x;->J()La/pz40;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    iput-object p1, p0, La/xk80;->B:La/pz40;

    .line 230
    .line 231
    invoke-static {}, La/m8x;->J()La/pz40;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    iput-object p1, p0, La/xk80;->C:La/pz40;

    .line 236
    .line 237
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 238
    .line 239
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 240
    .line 241
    .line 242
    move-result-object p2

    .line 243
    iput-object p2, p0, La/xk80;->D:La/pz40;

    .line 244
    .line 245
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    iput-object p2, p0, La/xk80;->E:La/pz40;

    .line 250
    .line 251
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    iput-object p2, p0, La/xk80;->F:La/pz40;

    .line 256
    .line 257
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iput-object p1, p0, La/xk80;->G:La/pz40;

    .line 262
    .line 263
    return-void
.end method

.method public static synthetic g(La/xk80;ILa/uts0;La/yje;I)Ljava/lang/Object;
    .locals 1

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x7

    .line 6
    const/4 p4, 0x0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p4, p4, v0, p2}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, La/xk80;->f(ILa/j73;La/yje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static u(La/xk80;La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, La/wk80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/wk80;

    .line 7
    .line 8
    iget v1, v0, La/wk80;->n:I

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
    iput v1, v0, La/wk80;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wk80;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/wk80;-><init>(La/xk80;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/wk80;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/wk80;->n:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, La/wk80;->i:La/xk80;

    .line 41
    .line 42
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    iget-object p0, v0, La/wk80;->k:La/bnn0;

    .line 53
    .line 54
    move-object p2, p0

    .line 55
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 56
    .line 57
    iget-object p1, v0, La/wk80;->j:La/c050;

    .line 58
    .line 59
    iget-object p0, v0, La/wk80;->i:La/xk80;

    .line 60
    .line 61
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object p0, v0, La/wk80;->i:La/xk80;

    .line 69
    .line 70
    iput-object p1, v0, La/wk80;->j:La/c050;

    .line 71
    .line 72
    move-object p3, p2

    .line 73
    check-cast p3, La/bnn0;

    .line 74
    .line 75
    iput-object p3, v0, La/wk80;->k:La/bnn0;

    .line 76
    .line 77
    iput v5, v0, La/wk80;->n:I

    .line 78
    .line 79
    invoke-virtual {p0, v0}, La/xk80;->i(La/zje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    if-ne p3, v1, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    :goto_1
    iget-object p3, p0, La/xk80;->k:La/ywj;

    .line 87
    .line 88
    invoke-virtual {p3}, La/ywj;->a()Z

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    if-nez p3, :cond_5

    .line 93
    .line 94
    invoke-virtual {p0}, La/xk80;->k()I

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    iget-object v2, p0, La/xk80;->r:La/cgk0;

    .line 99
    .line 100
    invoke-virtual {v2, p3}, La/cgk0;->m(I)V

    .line 101
    .line 102
    .line 103
    :cond_5
    iget-object p3, p0, La/xk80;->k:La/ywj;

    .line 104
    .line 105
    iput-object p0, v0, La/wk80;->i:La/xk80;

    .line 106
    .line 107
    iput-object v3, v0, La/wk80;->j:La/c050;

    .line 108
    .line 109
    iput-object v3, v0, La/wk80;->k:La/bnn0;

    .line 110
    .line 111
    iput v4, v0, La/wk80;->n:I

    .line 112
    .line 113
    invoke-virtual {p3, p1, p2, v0}, La/ywj;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v1, :cond_6

    .line 118
    .line 119
    :goto_2
    return-object v1

    .line 120
    :cond_6
    :goto_3
    const/4 p1, -0x1

    .line 121
    iget-object p0, p0, La/xk80;->q:La/cgk0;

    .line 122
    .line 123
    invoke-virtual {p0, p1}, La/cgk0;->m(I)V

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/xk80;->k:La/ywj;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, La/xk80;->u(La/xk80;La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/xk80;->E:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/xk80;->D:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, La/xk80;->k:La/ywj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/ywj;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final f(ILa/j73;La/yje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, La/vk80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/vk80;

    .line 7
    .line 8
    iget v1, v0, La/vk80;->m:I

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
    iput v1, v0, La/vk80;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/vk80;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/vk80;-><init>(La/xk80;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/vk80;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/vk80;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v6, :cond_2

    .line 38
    .line 39
    if-ne v2, v5, :cond_1

    .line 40
    .line 41
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    iget p1, v0, La/vk80;->i:I

    .line 52
    .line 53
    iget-object p2, v0, La/vk80;->j:La/j73;

    .line 54
    .line 55
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    move-object v10, p2

    .line 59
    goto :goto_2

    .line 60
    :cond_4
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, La/xk80;->k()I

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    if-ne p1, p3, :cond_5

    .line 68
    .line 69
    invoke-virtual {p0}, La/xk80;->l()F

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    cmpg-float p3, p3, v4

    .line 74
    .line 75
    if-nez p3, :cond_5

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    invoke-virtual {p0}, La/xk80;->n()I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    if-nez p3, :cond_6

    .line 83
    .line 84
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_6
    iput-object p2, v0, La/vk80;->j:La/j73;

    .line 88
    .line 89
    iput p1, v0, La/vk80;->i:I

    .line 90
    .line 91
    iput v6, v0, La/vk80;->m:I

    .line 92
    .line 93
    invoke-virtual {p0, v0}, La/xk80;->i(La/zje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    if-ne p3, v1, :cond_3

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :goto_2
    invoke-virtual {p0, p1}, La/xk80;->j(I)I

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    invoke-virtual {p0}, La/xk80;->p()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    int-to-float p1, p1

    .line 109
    mul-float v9, v4, p1

    .line 110
    .line 111
    new-instance v6, La/ekg;

    .line 112
    .line 113
    const/4 v11, 0x0

    .line 114
    move-object v7, p0

    .line 115
    invoke-direct/range {v6 .. v11}, La/ekg;-><init>(La/xk80;IFLa/j73;La/yje;)V

    .line 116
    .line 117
    .line 118
    iput-object v3, v0, La/vk80;->j:La/j73;

    .line 119
    .line 120
    iput v5, v0, La/vk80;->m:I

    .line 121
    .line 122
    sget-object p0, La/c050;->a:La/c050;

    .line 123
    .line 124
    invoke-virtual {v7, p0, v6, v0}, La/xk80;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    if-ne p0, v1, :cond_7

    .line 129
    .line 130
    :goto_3
    return-object v1

    .line 131
    :cond_7
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0
.end method

.method public final h(La/pk80;ZZ)V
    .locals 11

    .line 1
    iget-object v0, p1, La/pk80;->a:Ljava/util/List;

    .line 2
    .line 3
    iget v1, p1, La/pk80;->l:I

    .line 4
    .line 5
    iget-object v2, p1, La/pk80;->i:La/wj30;

    .line 6
    .line 7
    iget-object v3, p1, La/pk80;->j:La/wj30;

    .line 8
    .line 9
    iget v4, p1, La/pk80;->k:F

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v6, p0, La/xk80;->u:La/tbz;

    .line 16
    .line 17
    iput v5, v6, La/tbz;->e:I

    .line 18
    .line 19
    iget v5, p1, La/pk80;->b:I

    .line 20
    .line 21
    iget v6, p1, La/pk80;->c:I

    .line 22
    .line 23
    add-int/2addr v6, v5

    .line 24
    iput v6, p0, La/xk80;->o:I

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    iget-boolean v6, p0, La/xk80;->a:Z

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    iput-object p1, p0, La/xk80;->b:La/pk80;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const/4 v6, 0x1

    .line 36
    if-eqz p2, :cond_1

    .line 37
    .line 38
    iput-boolean v6, p0, La/xk80;->a:Z

    .line 39
    .line 40
    :cond_1
    iget-object p2, p0, La/xk80;->v:La/sj80;

    .line 41
    .line 42
    iget-boolean v7, p0, La/xk80;->l:Z

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    iget-object v10, p0, La/xk80;->d:La/qaj;

    .line 47
    .line 48
    if-eqz p3, :cond_2

    .line 49
    .line 50
    iget-object p3, v10, La/qaj;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p3, La/agk0;

    .line 53
    .line 54
    invoke-virtual {p3, v4}, La/agk0;->m(F)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    iget-object p3, v3, La/wj30;->d:Ljava/lang/Object;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    move-object p3, v8

    .line 67
    :goto_0
    iput-object p3, v10, La/qaj;->b:Ljava/lang/Object;

    .line 68
    .line 69
    iget-boolean p3, v10, La/qaj;->a:Z

    .line 70
    .line 71
    if-nez p3, :cond_4

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    if-nez p3, :cond_6

    .line 78
    .line 79
    :cond_4
    iput-boolean v6, v10, La/qaj;->a:Z

    .line 80
    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    iget p3, v3, La/wj30;->a:I

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    move p3, v9

    .line 87
    :goto_1
    iget-object v0, v10, La/qaj;->d:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, La/cgk0;

    .line 90
    .line 91
    invoke-virtual {v0, p3}, La/cgk0;->m(I)V

    .line 92
    .line 93
    .line 94
    iget-object v0, v10, La/qaj;->f:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, La/lbz;

    .line 97
    .line 98
    invoke-virtual {v0, p3}, La/lbz;->b(I)V

    .line 99
    .line 100
    .line 101
    iget-object p3, v10, La/qaj;->e:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p3, La/agk0;

    .line 104
    .line 105
    invoke-virtual {p3, v4}, La/agk0;->m(F)V

    .line 106
    .line 107
    .line 108
    :cond_6
    if-eqz v7, :cond_7

    .line 109
    .line 110
    iget-object p3, p2, La/sj80;->q:La/nvu;

    .line 111
    .line 112
    iput-object p1, p3, La/nvu;->c:Ljava/lang/Object;

    .line 113
    .line 114
    iget-object v0, p2, La/sj80;->p:La/tbz;

    .line 115
    .line 116
    iput-object v0, p3, La/nvu;->d:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {p2, p3}, La/sj9;->i(La/tj9;)V

    .line 119
    .line 120
    .line 121
    :cond_7
    :goto_2
    iget-object p3, p0, La/xk80;->m:La/pz40;

    .line 122
    .line 123
    check-cast p3, La/hgk0;

    .line 124
    .line 125
    invoke-virtual {p3, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-boolean p3, p1, La/pk80;->m:Z

    .line 129
    .line 130
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    iget-object v0, p0, La/xk80;->D:La/pz40;

    .line 135
    .line 136
    check-cast v0, La/hgk0;

    .line 137
    .line 138
    invoke-virtual {v0, p3}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    if-eqz v2, :cond_8

    .line 142
    .line 143
    iget p3, v2, La/wj30;->a:I

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_8
    move p3, v9

    .line 147
    :goto_3
    if-nez p3, :cond_a

    .line 148
    .line 149
    if-eqz v1, :cond_9

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_9
    move v6, v9

    .line 153
    :cond_a
    :goto_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    iget-object v0, p0, La/xk80;->E:La/pz40;

    .line 158
    .line 159
    check-cast v0, La/hgk0;

    .line 160
    .line 161
    invoke-virtual {v0, p3}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    if-eqz v2, :cond_b

    .line 165
    .line 166
    iget p3, v2, La/wj30;->a:I

    .line 167
    .line 168
    iput p3, p0, La/xk80;->e:I

    .line 169
    .line 170
    :cond_b
    iput v1, p0, La/xk80;->f:I

    .line 171
    .line 172
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    if-eqz p3, :cond_c

    .line 177
    .line 178
    invoke-virtual {p3}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    :cond_c
    invoke-static {p3}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    const/16 v1, 0x20

    .line 187
    .line 188
    const-wide v2, 0xffffffffL

    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    if-nez v7, :cond_e

    .line 194
    .line 195
    :cond_d
    :goto_5
    invoke-static {p3, v0, v8}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 196
    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_e
    :try_start_0
    iget v4, p1, La/pk80;->h:I

    .line 200
    .line 201
    invoke-virtual {p0}, La/xk80;->n()I

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-lt v4, v6, :cond_f

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_f
    iget v4, p0, La/xk80;->j:F

    .line 209
    .line 210
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    const/high16 v6, 0x3f000000    # 0.5f

    .line 215
    .line 216
    cmpg-float v4, v4, v6

    .line 217
    .line 218
    if-gtz v4, :cond_10

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_10
    iget v4, p0, La/xk80;->j:F

    .line 222
    .line 223
    invoke-virtual {p0}, La/xk80;->m()La/pk80;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    iget-object v6, v6, La/pk80;->e:La/ma80;

    .line 228
    .line 229
    sget-object v7, La/ma80;->a:La/ma80;

    .line 230
    .line 231
    if-ne v6, v7, :cond_11

    .line 232
    .line 233
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    invoke-virtual {p0}, La/xk80;->s()J

    .line 238
    .line 239
    .line 240
    move-result-wide v6

    .line 241
    and-long/2addr v6, v2

    .line 242
    long-to-int v6, v6

    .line 243
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    neg-float v6, v6

    .line 248
    invoke-static {v6}, Ljava/lang/Math;->signum(F)F

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    cmpg-float v4, v4, v6

    .line 253
    .line 254
    if-nez v4, :cond_12

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_11
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    invoke-virtual {p0}, La/xk80;->s()J

    .line 262
    .line 263
    .line 264
    move-result-wide v6

    .line 265
    shr-long/2addr v6, v1

    .line 266
    long-to-int v6, v6

    .line 267
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    neg-float v6, v6

    .line 272
    invoke-static {v6}, Ljava/lang/Math;->signum(F)F

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    cmpg-float v4, v4, v6

    .line 277
    .line 278
    if-nez v4, :cond_12

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_12
    invoke-virtual {p0}, La/xk80;->t()Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-eqz v4, :cond_d

    .line 286
    .line 287
    :goto_6
    iget v4, p0, La/xk80;->j:F

    .line 288
    .line 289
    iget-object v6, p2, La/sj80;->q:La/nvu;

    .line 290
    .line 291
    iput-object p1, v6, La/nvu;->c:Ljava/lang/Object;

    .line 292
    .line 293
    iget-object v7, p2, La/sj80;->p:La/tbz;

    .line 294
    .line 295
    iput-object v7, v6, La/nvu;->d:Ljava/lang/Object;

    .line 296
    .line 297
    neg-float v4, v4

    .line 298
    invoke-virtual {p2, v6, v4}, La/sj9;->h(La/tj9;F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :catchall_0
    move-exception p0

    .line 303
    goto :goto_a

    .line 304
    :goto_7
    invoke-virtual {p0}, La/xk80;->n()I

    .line 305
    .line 306
    .line 307
    move-result p2

    .line 308
    invoke-static {p1, p2}, La/zk80;->a(La/pk80;I)J

    .line 309
    .line 310
    .line 311
    move-result-wide p2

    .line 312
    iput-wide p2, p0, La/xk80;->g:J

    .line 313
    .line 314
    invoke-virtual {p0}, La/xk80;->n()I

    .line 315
    .line 316
    .line 317
    iget-object p2, p1, La/pk80;->e:La/ma80;

    .line 318
    .line 319
    sget-object p3, La/ma80;->b:La/ma80;

    .line 320
    .line 321
    if-ne p2, p3, :cond_13

    .line 322
    .line 323
    invoke-virtual {p1}, La/pk80;->h()J

    .line 324
    .line 325
    .line 326
    move-result-wide p2

    .line 327
    shr-long/2addr p2, v1

    .line 328
    :goto_8
    long-to-int p2, p2

    .line 329
    goto :goto_9

    .line 330
    :cond_13
    invoke-virtual {p1}, La/pk80;->h()J

    .line 331
    .line 332
    .line 333
    move-result-wide p2

    .line 334
    and-long/2addr p2, v2

    .line 335
    goto :goto_8

    .line 336
    :goto_9
    iget-object p3, p1, La/pk80;->n:La/ifk0;

    .line 337
    .line 338
    iget v0, p1, La/pk80;->f:I

    .line 339
    .line 340
    neg-int v0, v0

    .line 341
    iget p1, p1, La/pk80;->d:I

    .line 342
    .line 343
    invoke-interface {p3, p2, v5, v0, p1}, La/ifk0;->a(IIII)I

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    invoke-static {p1, v9, p2}, La/l1e0;->d(III)I

    .line 348
    .line 349
    .line 350
    move-result p1

    .line 351
    int-to-long p1, p1

    .line 352
    iget-wide v0, p0, La/xk80;->g:J

    .line 353
    .line 354
    cmp-long p3, p1, v0

    .line 355
    .line 356
    if-lez p3, :cond_14

    .line 357
    .line 358
    move-wide p1, v0

    .line 359
    :cond_14
    iput-wide p1, p0, La/xk80;->h:J

    .line 360
    .line 361
    return-void

    .line 362
    :goto_a
    invoke-static {p3, v0, v8}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 363
    .line 364
    .line 365
    throw p0
.end method

.method public final i(La/zje;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/xk80;->m:La/pz40;

    .line 2
    .line 3
    check-cast v0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, La/zk80;->b:La/pk80;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, La/xk80;->x:La/la5;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/la5;->i(La/zje;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, La/wne;->a:La/wne;

    .line 20
    .line 21
    if-ne p0, p1, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0
.end method

.method public final j(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, La/xk80;->n()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La/xk80;->n()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    add-int/lit8 p0, p0, -0x1

    .line 13
    .line 14
    invoke-static {p1, v1, p0}, La/l1e0;->d(III)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    return v1
.end method

.method public final k()I
    .locals 0

    .line 1
    iget-object p0, p0, La/xk80;->d:La/qaj;

    .line 2
    .line 3
    iget-object p0, p0, La/qaj;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/cgk0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/cgk0;->l()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final l()F
    .locals 0

    .line 1
    iget-object p0, p0, La/xk80;->d:La/qaj;

    .line 2
    .line 3
    iget-object p0, p0, La/qaj;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/agk0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/agk0;->l()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final m()La/pk80;
    .locals 0

    .line 1
    iget-object p0, p0, La/xk80;->m:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/pk80;

    .line 10
    .line 11
    return-object p0
.end method

.method public abstract n()I
.end method

.method public final o()I
    .locals 0

    .line 1
    iget-object p0, p0, La/xk80;->m:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/pk80;

    .line 10
    .line 11
    iget p0, p0, La/pk80;->b:I

    .line 12
    .line 13
    return p0
.end method

.method public final p()I
    .locals 1

    .line 1
    invoke-virtual {p0}, La/xk80;->o()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, La/xk80;->m:La/pz40;

    .line 6
    .line 7
    check-cast p0, La/hgk0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/pk80;

    .line 14
    .line 15
    iget p0, p0, La/pk80;->c:I

    .line 16
    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public final q()I
    .locals 0

    .line 1
    iget-object p0, p0, La/xk80;->s:La/zbk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final r()I
    .locals 0

    .line 1
    iget-object p0, p0, La/xk80;->t:La/zbk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final s()J
    .locals 2

    .line 1
    iget-object p0, p0, La/xk80;->c:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ne60;

    .line 10
    .line 11
    iget-wide v0, p0, La/ne60;->a:J

    .line 12
    .line 13
    return-wide v0
.end method

.method public final t()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, La/xk80;->s()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, La/xk80;->s()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide v2, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v0, v2

    .line 26
    long-to-int p0, v0

    .line 27
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    float-to-int p0, p0

    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public final v(IFLa/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, La/c4a;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x1

    .line 5
    move-object v1, p0

    .line 6
    move v3, p1

    .line 7
    move v2, p2

    .line 8
    invoke-direct/range {v0 .. v5}, La/c4a;-><init>(Ljava/lang/Object;FILa/yje;B)V

    .line 9
    .line 10
    .line 11
    sget-object p0, La/c050;->a:La/c050;

    .line 12
    .line 13
    invoke-virtual {v1, p0, v0, p3}, La/xk80;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/wne;->a:La/wne;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0
.end method

.method public final w(FIZ)V
    .locals 3

    .line 1
    iget-object v0, p0, La/xk80;->d:La/qaj;

    .line 2
    .line 3
    iget-object v1, v0, La/qaj;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/cgk0;

    .line 6
    .line 7
    iget-object v2, v0, La/qaj;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/agk0;

    .line 10
    .line 11
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ne v1, p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, La/agk0;->l()F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    cmpg-float v1, v1, p1

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v1, p0, La/xk80;->v:La/sj80;

    .line 27
    .line 28
    invoke-virtual {v1}, La/sj9;->k()V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v1, v0, La/qaj;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, La/cgk0;

    .line 34
    .line 35
    invoke-virtual {v1, p2}, La/cgk0;->m(I)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, La/qaj;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, La/lbz;

    .line 41
    .line 42
    invoke-virtual {v1, p2}, La/lbz;->b(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p1}, La/agk0;->m(F)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    iput-object p1, v0, La/qaj;->b:Ljava/lang/Object;

    .line 50
    .line 51
    if-eqz p3, :cond_2

    .line 52
    .line 53
    iget-object p0, p0, La/xk80;->y:La/pz40;

    .line 54
    .line 55
    check-cast p0, La/hgk0;

    .line 56
    .line 57
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, La/e7z;

    .line 62
    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0}, La/e7z;->l()V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-void

    .line 69
    :cond_2
    iget-object p0, p0, La/xk80;->C:La/pz40;

    .line 70
    .line 71
    invoke-static {p0}, La/m8x;->Z(La/pz40;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method
