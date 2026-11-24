.class public final synthetic La/l53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y9q0;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:La/t33;


# direct methods
.method public synthetic constructor <init>(La/y9q0;JLjava/lang/String;La/t33;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/l53;->a:B

    iput-object p1, p0, La/l53;->b:La/y9q0;

    iput-wide p2, p0, La/l53;->c:J

    iput-object p4, p0, La/l53;->d:Ljava/lang/String;

    iput-object p5, p0, La/l53;->e:La/t33;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/l53;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    iget-object v4, v0, La/l53;->e:La/t33;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/fet;

    .line 18
    .line 19
    move-object/from16 v7, p2

    .line 20
    .line 21
    check-cast v7, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    and-int/lit8 v8, v7, 0x3

    .line 28
    .line 29
    if-eq v8, v3, :cond_0

    .line 30
    .line 31
    move v5, v6

    .line 32
    :cond_0
    and-int/lit8 v3, v7, 0x1

    .line 33
    .line 34
    invoke-virtual {v1, v3, v5}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-ne v3, v2, :cond_1

    .line 45
    .line 46
    new-instance v3, La/n53;

    .line 47
    .line 48
    invoke-direct {v3, v4, v6}, La/n53;-><init>(La/t33;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    move-object v15, v3

    .line 55
    check-cast v15, La/n4d;

    .line 56
    .line 57
    const/16 v33, 0x0

    .line 58
    .line 59
    const v34, 0xfefffd

    .line 60
    .line 61
    .line 62
    iget-object v2, v0, La/l53;->b:La/y9q0;

    .line 63
    .line 64
    const-wide/16 v17, 0x0

    .line 65
    .line 66
    iget-wide v3, v0, La/l53;->c:J

    .line 67
    .line 68
    const/16 v21, 0x0

    .line 69
    .line 70
    const/16 v22, 0x0

    .line 71
    .line 72
    const/16 v23, 0x0

    .line 73
    .line 74
    const-wide/16 v24, 0x0

    .line 75
    .line 76
    const/16 v26, 0x0

    .line 77
    .line 78
    const/16 v27, 0x0

    .line 79
    .line 80
    const/16 v28, 0x0

    .line 81
    .line 82
    const/16 v29, 0x1

    .line 83
    .line 84
    const-wide/16 v30, 0x0

    .line 85
    .line 86
    const/16 v32, 0x0

    .line 87
    .line 88
    move-object/from16 v16, v2

    .line 89
    .line 90
    move-wide/from16 v19, v3

    .line 91
    .line 92
    invoke-static/range {v16 .. v34}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    const/16 v18, 0x30

    .line 97
    .line 98
    const/16 v19, 0x2f8

    .line 99
    .line 100
    iget-object v7, v0, La/l53;->d:Ljava/lang/String;

    .line 101
    .line 102
    sget-object v8, La/jm40;->b:La/jm40;

    .line 103
    .line 104
    const/4 v10, 0x0

    .line 105
    const/4 v11, 0x0

    .line 106
    const/4 v12, 0x0

    .line 107
    const/4 v13, 0x0

    .line 108
    const/4 v14, 0x0

    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    move-object/from16 v17, v1

    .line 112
    .line 113
    invoke-static/range {v7 .. v19}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    move-object/from16 v17, v1

    .line 118
    .line 119
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 120
    .line 121
    .line 122
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_0
    move-object/from16 v11, p1

    .line 126
    .line 127
    check-cast v11, La/fet;

    .line 128
    .line 129
    move-object/from16 v1, p2

    .line 130
    .line 131
    check-cast v1, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    and-int/lit8 v7, v1, 0x3

    .line 138
    .line 139
    if-eq v7, v3, :cond_3

    .line 140
    .line 141
    move v3, v6

    .line 142
    goto :goto_1

    .line 143
    :cond_3
    move v3, v5

    .line 144
    :goto_1
    and-int/2addr v1, v6

    .line 145
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_5

    .line 150
    .line 151
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-ne v1, v2, :cond_4

    .line 156
    .line 157
    new-instance v1, La/n53;

    .line 158
    .line 159
    invoke-direct {v1, v4, v5}, La/n53;-><init>(La/t33;B)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v11, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    move-object v9, v1

    .line 166
    check-cast v9, La/n4d;

    .line 167
    .line 168
    const/16 v29, 0x0

    .line 169
    .line 170
    const v30, 0xfefffd

    .line 171
    .line 172
    .line 173
    iget-object v12, v0, La/l53;->b:La/y9q0;

    .line 174
    .line 175
    const-wide/16 v13, 0x0

    .line 176
    .line 177
    iget-wide v1, v0, La/l53;->c:J

    .line 178
    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    const/16 v18, 0x0

    .line 182
    .line 183
    const/16 v19, 0x0

    .line 184
    .line 185
    const-wide/16 v20, 0x0

    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    const/16 v23, 0x0

    .line 190
    .line 191
    const/16 v24, 0x0

    .line 192
    .line 193
    const/16 v25, 0x1

    .line 194
    .line 195
    const-wide/16 v26, 0x0

    .line 196
    .line 197
    const/16 v28, 0x0

    .line 198
    .line 199
    move-wide v15, v1

    .line 200
    invoke-static/range {v12 .. v30}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    const v12, 0x186030

    .line 205
    .line 206
    .line 207
    const/16 v13, 0x2a8

    .line 208
    .line 209
    iget-object v1, v0, La/l53;->d:Ljava/lang/String;

    .line 210
    .line 211
    sget-object v2, La/jm40;->b:La/jm40;

    .line 212
    .line 213
    const/4 v4, 0x0

    .line 214
    const/4 v5, 0x2

    .line 215
    const/4 v6, 0x0

    .line 216
    const/4 v7, 0x1

    .line 217
    const/4 v8, 0x0

    .line 218
    const/4 v10, 0x0

    .line 219
    invoke-static/range {v1 .. v13}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_5
    invoke-virtual {v11}, La/fet;->X()V

    .line 224
    .line 225
    .line 226
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object v0

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
