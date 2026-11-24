.class public final La/c0l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public final c:Ljava/lang/CharSequence;

.field public final d:La/uub;

.field public final e:Z

.field public f:I

.field public g:I

.field public final synthetic h:B

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/qo8;Ljava/lang/CharSequence;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/c0l0;->h:B

    .line 2
    .line 3
    iput-object p3, p0, La/c0l0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p3, 0x2

    .line 9
    iput p3, p0, La/c0l0;->a:I

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    iput p3, p0, La/c0l0;->f:I

    .line 13
    .line 14
    iget-object p3, p1, La/qo8;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p3, La/uub;

    .line 17
    .line 18
    iput-object p3, p0, La/c0l0;->d:La/uub;

    .line 19
    .line 20
    iget-boolean p3, p1, La/qo8;->c:Z

    .line 21
    .line 22
    iput-boolean p3, p0, La/c0l0;->e:Z

    .line 23
    .line 24
    iget p1, p1, La/qo8;->b:I

    .line 25
    .line 26
    iput p1, p0, La/c0l0;->g:I

    .line 27
    .line 28
    iput-object p2, p0, La/c0l0;->c:Ljava/lang/CharSequence;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 15

    .line 1
    iget v0, p0, La/c0l0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x4

    .line 6
    if-eq v0, v3, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, La/c0l0;->a:I

    .line 15
    .line 16
    invoke-static {v0}, La/hne;->E(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_f

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    if-eq v0, v4, :cond_e

    .line 24
    .line 25
    iput v3, p0, La/c0l0;->a:I

    .line 26
    .line 27
    iget v0, p0, La/c0l0;->f:I

    .line 28
    .line 29
    :cond_1
    :goto_1
    iget v3, p0, La/c0l0;->f:I

    .line 30
    .line 31
    const/4 v4, -0x1

    .line 32
    const/4 v5, 0x3

    .line 33
    if-eq v3, v4, :cond_d

    .line 34
    .line 35
    iget-byte v6, p0, La/c0l0;->h:B

    .line 36
    .line 37
    iget-object v7, p0, La/c0l0;->i:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v8, p0, La/c0l0;->c:Ljava/lang/CharSequence;

    .line 40
    .line 41
    packed-switch v6, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    move-object v9, v7

    .line 45
    check-cast v9, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    sub-int/2addr v11, v10

    .line 56
    :goto_2
    if-gt v3, v11, :cond_3

    .line 57
    .line 58
    move v12, v1

    .line 59
    :goto_3
    if-ge v12, v10, :cond_5

    .line 60
    .line 61
    add-int v13, v12, v3

    .line 62
    .line 63
    invoke-interface {v8, v13}, Ljava/lang/CharSequence;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v13

    .line 67
    invoke-virtual {v9, v12}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v14

    .line 71
    if-eq v13, v14, :cond_2

    .line 72
    .line 73
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    add-int/lit8 v12, v12, 0x1

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    move v3, v4

    .line 80
    goto :goto_5

    .line 81
    :pswitch_0
    move-object v9, v7

    .line 82
    check-cast v9, La/vub;

    .line 83
    .line 84
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    invoke-static {v3, v10}, La/x0x;->H(II)V

    .line 89
    .line 90
    .line 91
    :goto_4
    if-ge v3, v10, :cond_3

    .line 92
    .line 93
    invoke-interface {v8, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    invoke-virtual {v9, v11}, La/vub;->a(C)Z

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    if-eqz v11, :cond_4

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    :goto_5
    if-ne v3, v4, :cond_6

    .line 108
    .line 109
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    iput v4, p0, La/c0l0;->f:I

    .line 114
    .line 115
    move v6, v4

    .line 116
    goto :goto_7

    .line 117
    :cond_6
    packed-switch v6, :pswitch_data_1

    .line 118
    .line 119
    .line 120
    check-cast v7, Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    add-int/2addr v6, v3

    .line 127
    goto :goto_6

    .line 128
    :pswitch_1
    add-int/lit8 v6, v3, 0x1

    .line 129
    .line 130
    :goto_6
    iput v6, p0, La/c0l0;->f:I

    .line 131
    .line 132
    :goto_7
    if-ne v6, v0, :cond_7

    .line 133
    .line 134
    add-int/lit8 v6, v6, 0x1

    .line 135
    .line 136
    iput v6, p0, La/c0l0;->f:I

    .line 137
    .line 138
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-le v6, v3, :cond_1

    .line 143
    .line 144
    iput v4, p0, La/c0l0;->f:I

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_7
    :goto_8
    iget-object v6, p0, La/c0l0;->d:La/uub;

    .line 148
    .line 149
    if-ge v0, v3, :cond_8

    .line 150
    .line 151
    invoke-interface {v8, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    invoke-virtual {v6, v7}, La/uub;->a(C)Z

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-eqz v7, :cond_8

    .line 160
    .line 161
    add-int/lit8 v0, v0, 0x1

    .line 162
    .line 163
    goto :goto_8

    .line 164
    :cond_8
    :goto_9
    if-le v3, v0, :cond_9

    .line 165
    .line 166
    add-int/lit8 v7, v3, -0x1

    .line 167
    .line 168
    invoke-interface {v8, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    invoke-virtual {v6, v7}, La/uub;->a(C)Z

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    if-eqz v7, :cond_9

    .line 177
    .line 178
    add-int/lit8 v3, v3, -0x1

    .line 179
    .line 180
    goto :goto_9

    .line 181
    :cond_9
    iget-boolean v7, p0, La/c0l0;->e:Z

    .line 182
    .line 183
    if-eqz v7, :cond_a

    .line 184
    .line 185
    if-ne v0, v3, :cond_a

    .line 186
    .line 187
    iget v0, p0, La/c0l0;->f:I

    .line 188
    .line 189
    goto/16 :goto_1

    .line 190
    .line 191
    :cond_a
    iget v7, p0, La/c0l0;->g:I

    .line 192
    .line 193
    if-ne v7, v2, :cond_b

    .line 194
    .line 195
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    iput v4, p0, La/c0l0;->f:I

    .line 200
    .line 201
    :goto_a
    if-le v3, v0, :cond_c

    .line 202
    .line 203
    add-int/lit8 v4, v3, -0x1

    .line 204
    .line 205
    invoke-interface {v8, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    invoke-virtual {v6, v4}, La/uub;->a(C)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_c

    .line 214
    .line 215
    add-int/lit8 v3, v3, -0x1

    .line 216
    .line 217
    goto :goto_a

    .line 218
    :cond_b
    sub-int/2addr v7, v2

    .line 219
    iput v7, p0, La/c0l0;->g:I

    .line 220
    .line 221
    :cond_c
    invoke-interface {v8, v0, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    goto :goto_b

    .line 230
    :cond_d
    iput v5, p0, La/c0l0;->a:I

    .line 231
    .line 232
    const/4 v0, 0x0

    .line 233
    :goto_b
    iput-object v0, p0, La/c0l0;->b:Ljava/lang/String;

    .line 234
    .line 235
    iget v0, p0, La/c0l0;->a:I

    .line 236
    .line 237
    if-eq v0, v5, :cond_e

    .line 238
    .line 239
    iput v2, p0, La/c0l0;->a:I

    .line 240
    .line 241
    return v2

    .line 242
    :cond_e
    return v1

    .line 243
    :cond_f
    return v2

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, La/c0l0;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    iput v0, p0, La/c0l0;->a:I

    .line 9
    .line 10
    iget-object v0, p0, La/c0l0;->b:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, La/c0l0;->b:Ljava/lang/String;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-static {}, La/itt0;->a()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final remove()V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method
