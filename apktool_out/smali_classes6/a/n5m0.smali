.class public final synthetic La/n5m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/nsm0;JLa/pwr0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    const/4 p9, 0x1

    iput-byte p9, p0, La/n5m0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n5m0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/n5m0;->d:Ljava/lang/Object;

    iput-wide p3, p0, La/n5m0;->b:J

    iput-object p5, p0, La/n5m0;->e:Ljava/lang/Object;

    iput-object p6, p0, La/n5m0;->f:Ljava/lang/Object;

    iput-object p7, p0, La/n5m0;->g:Ljava/lang/Object;

    iput-object p8, p0, La/n5m0;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/t33;La/t33;La/t33;La/t33;La/y9q0;JLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/n5m0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n5m0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/n5m0;->d:Ljava/lang/Object;

    iput-object p3, p0, La/n5m0;->e:Ljava/lang/Object;

    iput-object p4, p0, La/n5m0;->f:Ljava/lang/Object;

    iput-object p5, p0, La/n5m0;->g:Ljava/lang/Object;

    iput-wide p6, p0, La/n5m0;->b:J

    iput-object p8, p0, La/n5m0;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/n5m0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/n5m0;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/n5m0;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/n5m0;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/n5m0;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/n5m0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, La/n5m0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v8, v7

    .line 21
    check-cast v8, La/mm40;

    .line 22
    .line 23
    move-object v9, v6

    .line 24
    check-cast v9, La/nsm0;

    .line 25
    .line 26
    move-object v12, v5

    .line 27
    check-cast v12, La/pwr0;

    .line 28
    .line 29
    move-object v13, v4

    .line 30
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 31
    .line 32
    move-object v14, v3

    .line 33
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    move-object v15, v2

    .line 36
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    move-object/from16 v16, p1

    .line 39
    .line 40
    check-cast v16, La/fet;

    .line 41
    .line 42
    move-object/from16 v1, p2

    .line 43
    .line 44
    check-cast v1, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x7

    .line 50
    invoke-static {v1}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result v17

    .line 54
    iget-wide v10, v0, La/n5m0;->b:J

    .line 55
    .line 56
    invoke-static/range {v8 .. v17}, La/jpm0;->g(La/mm40;La/nsm0;JLa/pwr0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_0
    check-cast v7, La/t33;

    .line 63
    .line 64
    check-cast v6, La/t33;

    .line 65
    .line 66
    check-cast v5, La/t33;

    .line 67
    .line 68
    check-cast v4, La/t33;

    .line 69
    .line 70
    move-object v8, v3

    .line 71
    check-cast v8, La/y9q0;

    .line 72
    .line 73
    check-cast v2, Ljava/lang/String;

    .line 74
    .line 75
    move-object/from16 v1, p1

    .line 76
    .line 77
    check-cast v1, La/fet;

    .line 78
    .line 79
    move-object/from16 v3, p2

    .line 80
    .line 81
    check-cast v3, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    and-int/lit8 v9, v3, 0x3

    .line 88
    .line 89
    const/4 v10, 0x2

    .line 90
    const/4 v11, 0x1

    .line 91
    if-eq v9, v10, :cond_0

    .line 92
    .line 93
    move v9, v11

    .line 94
    goto :goto_0

    .line 95
    :cond_0
    const/4 v9, 0x0

    .line 96
    :goto_0
    and-int/2addr v3, v11

    .line 97
    invoke-virtual {v1, v3, v9}, La/fet;->U(IZ)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_5

    .line 102
    .line 103
    invoke-virtual {v1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    sget-object v10, La/ukd;->a:La/cl5;

    .line 112
    .line 113
    if-nez v3, :cond_1

    .line 114
    .line 115
    if-ne v9, v10, :cond_2

    .line 116
    .line 117
    :cond_1
    new-instance v9, La/n53;

    .line 118
    .line 119
    const/4 v3, 0x3

    .line 120
    invoke-direct {v9, v7, v3}, La/n53;-><init>(La/t33;B)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_2
    move-object v3, v9

    .line 127
    check-cast v3, La/n4d;

    .line 128
    .line 129
    invoke-virtual {v1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    or-int/2addr v7, v9

    .line 138
    invoke-virtual {v1, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    or-int/2addr v7, v9

    .line 143
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    if-nez v7, :cond_3

    .line 148
    .line 149
    if-ne v9, v10, :cond_4

    .line 150
    .line 151
    :cond_3
    new-instance v9, La/gy7;

    .line 152
    .line 153
    invoke-direct {v9, v6, v5, v4, v11}, La/gy7;-><init>(La/t33;La/t33;La/t33;B)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_4
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 160
    .line 161
    sget-object v4, La/jm40;->b:La/jm40;

    .line 162
    .line 163
    invoke-static {v4, v9}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    const/16 v25, 0x0

    .line 168
    .line 169
    const v26, 0xfeeffd

    .line 170
    .line 171
    .line 172
    const-wide/16 v9, 0x0

    .line 173
    .line 174
    iget-wide v11, v0, La/n5m0;->b:J

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const/4 v14, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    const-wide/16 v16, 0x0

    .line 180
    .line 181
    const/16 v18, 0x0

    .line 182
    .line 183
    sget-object v19, La/k5q0;->d:La/k5q0;

    .line 184
    .line 185
    const/16 v20, 0x0

    .line 186
    .line 187
    const/16 v21, 0x1

    .line 188
    .line 189
    const-wide/16 v22, 0x0

    .line 190
    .line 191
    const/16 v24, 0x0

    .line 192
    .line 193
    invoke-static/range {v8 .. v26}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    const/16 v21, 0x2f8

    .line 198
    .line 199
    const/4 v12, 0x0

    .line 200
    const/4 v13, 0x0

    .line 201
    const/4 v14, 0x0

    .line 202
    const/4 v15, 0x0

    .line 203
    const/16 v16, 0x0

    .line 204
    .line 205
    move-object/from16 v19, v1

    .line 206
    .line 207
    move-object v9, v2

    .line 208
    move-object/from16 v17, v3

    .line 209
    .line 210
    move-object v10, v4

    .line 211
    invoke-static/range {v9 .. v21}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_5
    move-object/from16 v19, v1

    .line 216
    .line 217
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 218
    .line 219
    .line 220
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
