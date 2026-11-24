.class public abstract La/tpj0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/uts0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, La/ihn;->a:La/zsf;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x12c

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-static {v2, v3, v0, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/tpj0;->a:La/uts0;

    .line 12
    .line 13
    return-void
.end method

.method public static final a(La/ugd;La/fet;I)V
    .locals 9

    .line 1
    const v0, 0x3d9bae7c

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x13

    .line 8
    .line 9
    const/16 v1, 0x12

    .line 10
    .line 11
    const/4 v8, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v8

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 19
    .line 20
    invoke-virtual {p1, v1, v0}, La/fet;->U(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_8

    .line 25
    .line 26
    const v0, 0x7f130c40

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p1}, La/jtt0;->j(ILa/fet;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, La/gqw0;->n:La/xx7;

    .line 34
    .line 35
    new-instance v3, La/wkw;

    .line 36
    .line 37
    invoke-direct {v3, v1}, La/wkw;-><init>(La/xx7;)V

    .line 38
    .line 39
    .line 40
    sget-object v1, La/gqw0;->a:La/zx7;

    .line 41
    .line 42
    invoke-static {v1, v2}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {p1}, La/e3c;->x(La/fet;)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {p1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 59
    .line 60
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, La/fet;->i0()V

    .line 64
    .line 65
    .line 66
    iget-boolean v7, p1, La/fet;->S:Z

    .line 67
    .line 68
    if-eqz v7, :cond_1

    .line 69
    .line 70
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 71
    .line 72
    invoke-virtual {p1, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {p1}, La/fet;->r0()V

    .line 77
    .line 78
    .line 79
    :goto_1
    sget-object v7, La/gqw0;->x:La/shd;

    .line 80
    .line 81
    invoke-static {p1, v1, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 82
    .line 83
    .line 84
    sget-object v1, La/gqw0;->w:La/shd;

    .line 85
    .line 86
    invoke-static {p1, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 87
    .line 88
    .line 89
    sget-object v1, La/gqw0;->y:La/shd;

    .line 90
    .line 91
    iget-boolean v5, p1, La/fet;->S:Z

    .line 92
    .line 93
    if-nez v5, :cond_2

    .line 94
    .line 95
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-nez v5, :cond_3

    .line 108
    .line 109
    :cond_2
    invoke-static {v4, p1, v4, v1}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    sget-object v1, La/gqw0;->v:La/shd;

    .line 113
    .line 114
    invoke-static {p1, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 115
    .line 116
    .line 117
    sget v1, La/vwq0;->a:F

    .line 118
    .line 119
    sget-object v1, La/xwq0;->a:La/lh80;

    .line 120
    .line 121
    sget-object v1, La/bmd;->h:La/zfn;

    .line 122
    .line 123
    invoke-virtual {p1, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, La/w6k;

    .line 128
    .line 129
    const/high16 v3, 0x40800000    # 4.0f

    .line 130
    .line 131
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-virtual {p1, v1}, La/fet;->e(I)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    sget-object v5, La/ukd;->a:La/cl5;

    .line 144
    .line 145
    if-nez v3, :cond_4

    .line 146
    .line 147
    if-ne v4, v5, :cond_5

    .line 148
    .line 149
    :cond_4
    new-instance v4, La/zwq0;

    .line 150
    .line 151
    invoke-direct {v4, v1}, La/zwq0;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_5
    check-cast v4, La/zwq0;

    .line 158
    .line 159
    new-instance v1, La/bkh;

    .line 160
    .line 161
    const/4 v3, 0x4

    .line 162
    invoke-direct {v1, v0, v3}, La/bkh;-><init>(Ljava/lang/Object;B)V

    .line 163
    .line 164
    .line 165
    const v0, 0x7ac6d537

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    sget-object v0, La/ja6;->a:La/g050;

    .line 173
    .line 174
    invoke-virtual {p1, v2}, La/fet;->h(Z)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-virtual {p1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    or-int/2addr v2, v3

    .line 183
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    if-nez v2, :cond_6

    .line 188
    .line 189
    if-ne v3, v5, :cond_7

    .line 190
    .line 191
    :cond_6
    new-instance v3, La/bxq0;

    .line 192
    .line 193
    invoke-direct {v3, v0}, La/bxq0;-><init>(La/g050;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_7
    move-object v2, v3

    .line 200
    check-cast v2, La/bxq0;

    .line 201
    .line 202
    move-object v0, v4

    .line 203
    const/4 v4, 0x0

    .line 204
    const v7, 0x6000030

    .line 205
    .line 206
    .line 207
    const/4 v3, 0x0

    .line 208
    move-object v5, p0

    .line 209
    move-object v6, p1

    .line 210
    invoke-static/range {v0 .. v7}, La/xwq0;->b(La/vmb0;La/ugd;La/bxq0;La/mm40;ZLa/ugd;La/fet;I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v8}, La/fet;->r(Z)V

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_8
    invoke-virtual {p1}, La/fet;->X()V

    .line 218
    .line 219
    .line 220
    :goto_2
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-eqz v0, :cond_9

    .line 225
    .line 226
    new-instance v1, La/w;

    .line 227
    .line 228
    const/16 v2, 0x1d

    .line 229
    .line 230
    invoke-direct {v1, p0, p2, v2}, La/w;-><init>(La/ugd;IB)V

    .line 231
    .line 232
    .line 233
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 234
    .line 235
    :cond_9
    return-void
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;La/ypj0;ZLa/fet;II)La/xpj0;
    .locals 10

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move v6, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v6, p2

    .line 9
    :goto_0
    sget p2, La/uo8;->d:F

    .line 10
    .line 11
    sget p5, La/uo8;->e:F

    .line 12
    .line 13
    sget-object v1, La/bmd;->h:La/zfn;

    .line 14
    .line 15
    invoke-virtual {p3, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La/w6k;

    .line 20
    .line 21
    invoke-virtual {p3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p3, p2}, La/fet;->d(F)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    or-int/2addr v2, v3

    .line 30
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    sget-object v7, La/ukd;->a:La/cl5;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    if-ne v3, v7, :cond_2

    .line 39
    .line 40
    :cond_1
    new-instance v3, La/qpj0;

    .line 41
    .line 42
    invoke-direct {v3, v1, p2, v0}, La/qpj0;-><init>(La/w6k;FB)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 49
    .line 50
    invoke-virtual {p3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-virtual {p3, p5}, La/fet;->d(F)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    or-int/2addr p2, v2

    .line 59
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const/4 v8, 0x1

    .line 64
    if-nez p2, :cond_3

    .line 65
    .line 66
    if-ne v2, v7, :cond_4

    .line 67
    .line 68
    :cond_3
    new-instance v2, La/qpj0;

    .line 69
    .line 70
    invoke-direct {v2, v1, p5, v8}, La/qpj0;-><init>(La/w6k;FB)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    move-object v4, v2

    .line 77
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object p5

    .line 88
    filled-new-array {p2, p0, p5}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    new-instance p5, La/ogj0;

    .line 93
    .line 94
    const/4 v1, 0x7

    .line 95
    invoke-direct {p5, v1}, La/ogj0;-><init>(B)V

    .line 96
    .line 97
    .line 98
    new-instance v1, La/f160;

    .line 99
    .line 100
    move-object v5, p0

    .line 101
    invoke-direct/range {v1 .. v6}, La/f160;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Z)V

    .line 102
    .line 103
    .line 104
    new-instance p0, La/v0h0;

    .line 105
    .line 106
    invoke-direct {p0, v1, p5}, La/v0h0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3, v2}, La/fet;->h(Z)Z

    .line 110
    .line 111
    .line 112
    move-result p5

    .line 113
    invoke-virtual {p3, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    or-int/2addr p5, v1

    .line 118
    invoke-virtual {p3, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    or-int/2addr p5, v1

    .line 123
    and-int/lit16 v1, p4, 0x380

    .line 124
    .line 125
    xor-int/lit16 v1, v1, 0x180

    .line 126
    .line 127
    const/16 v9, 0x100

    .line 128
    .line 129
    if-le v1, v9, :cond_5

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-virtual {p3, v1}, La/fet;->e(I)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-nez v1, :cond_6

    .line 140
    .line 141
    :cond_5
    and-int/lit16 v1, p4, 0x180

    .line 142
    .line 143
    if-ne v1, v9, :cond_7

    .line 144
    .line 145
    :cond_6
    move v1, v8

    .line 146
    goto :goto_1

    .line 147
    :cond_7
    move v1, v0

    .line 148
    :goto_1
    or-int/2addr p5, v1

    .line 149
    invoke-virtual {p3, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    or-int/2addr p5, v1

    .line 154
    and-int/lit16 v1, p4, 0x1c00

    .line 155
    .line 156
    xor-int/lit16 v1, v1, 0xc00

    .line 157
    .line 158
    const/16 v9, 0x800

    .line 159
    .line 160
    if-le v1, v9, :cond_8

    .line 161
    .line 162
    invoke-virtual {p3, v6}, La/fet;->h(Z)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-nez v1, :cond_a

    .line 167
    .line 168
    :cond_8
    and-int/lit16 p4, p4, 0xc00

    .line 169
    .line 170
    if-ne p4, v9, :cond_9

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_9
    move v8, v0

    .line 174
    :cond_a
    :goto_2
    or-int p4, p5, v8

    .line 175
    .line 176
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p5

    .line 180
    if-nez p4, :cond_b

    .line 181
    .line 182
    if-ne p5, v7, :cond_c

    .line 183
    .line 184
    :cond_b
    new-instance v1, La/rpj0;

    .line 185
    .line 186
    move v7, v6

    .line 187
    move-object v6, v5

    .line 188
    move-object v5, p1

    .line 189
    invoke-direct/range {v1 .. v7}, La/rpj0;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ypj0;Lkotlin/jvm/functions/Function1;Z)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    move-object p5, v1

    .line 196
    :cond_c
    check-cast p5, Lkotlin/jvm/functions/Function0;

    .line 197
    .line 198
    invoke-static {p2, p0, p5, p3, v0}, La/e9x;->R([Ljava/lang/Object;La/u0h0;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, La/xpj0;

    .line 203
    .line 204
    return-object p0
.end method
