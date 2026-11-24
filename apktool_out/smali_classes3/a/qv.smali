.class public final La/qv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g45;


# direct methods
.method public synthetic constructor <init>(La/g45;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qv;->a:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILa/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/qv;->a:La/g45;

    .line 6
    .line 7
    iget-object v3, v2, La/g45;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/i7e;

    .line 10
    .line 11
    instance-of v4, v1, La/gbu;

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, La/gbu;

    .line 17
    .line 18
    iget v5, v4, La/gbu;->n:I

    .line 19
    .line 20
    const/high16 v6, -0x80000000

    .line 21
    .line 22
    and-int v7, v5, v6

    .line 23
    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    sub-int/2addr v5, v6

    .line 27
    iput v5, v4, La/gbu;->n:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v4, La/gbu;

    .line 31
    .line 32
    invoke-direct {v4, v0, v1}, La/gbu;-><init>(La/qv;La/zje;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v0, v4, La/gbu;->l:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v1, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v5, v4, La/gbu;->n:I

    .line 40
    .line 41
    const/4 v6, 0x3

    .line 42
    const/4 v7, 0x2

    .line 43
    const/4 v8, 0x1

    .line 44
    if-eqz v5, :cond_4

    .line 45
    .line 46
    if-eq v5, v8, :cond_3

    .line 47
    .line 48
    if-eq v5, v7, :cond_2

    .line 49
    .line 50
    if-ne v5, v6, :cond_1

    .line 51
    .line 52
    iget-object v1, v4, La/gbu;->k:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    return-object v0

    .line 65
    :cond_2
    iget v5, v4, La/gbu;->j:I

    .line 66
    .line 67
    iget-byte v7, v4, La/gbu;->i:B

    .line 68
    .line 69
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    iget-byte v5, v4, La/gbu;->i:B

    .line 74
    .line 75
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move/from16 v17, v5

    .line 79
    .line 80
    move-object v5, v0

    .line 81
    move/from16 v0, v17

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, v3, La/i7e;->i:La/p7m0;

    .line 88
    .line 89
    new-instance v5, La/a1t;

    .line 90
    .line 91
    const/16 v9, 0xf

    .line 92
    .line 93
    invoke-direct {v5, v0, v9}, La/a1t;-><init>(La/gmq;B)V

    .line 94
    .line 95
    .line 96
    move/from16 v0, p1

    .line 97
    .line 98
    iput-byte v0, v4, La/gbu;->i:B

    .line 99
    .line 100
    iput v8, v4, La/gbu;->n:I

    .line 101
    .line 102
    invoke-static {v5, v4}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-ne v5, v1, :cond_5

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_5
    :goto_1
    check-cast v5, La/gxb;

    .line 110
    .line 111
    iget v5, v5, La/gxb;->d:I

    .line 112
    .line 113
    if-ge v5, v8, :cond_6

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    move v8, v5

    .line 117
    :goto_2
    iput-byte v0, v4, La/gbu;->i:B

    .line 118
    .line 119
    iput v8, v4, La/gbu;->j:I

    .line 120
    .line 121
    iput v7, v4, La/gbu;->n:I

    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    invoke-virtual {v2, v8, v5, v0, v4}, La/g45;->r(IIILa/zje;)Ljava/io/Serializable;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    if-ne v5, v1, :cond_7

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    move v7, v0

    .line 132
    move-object v0, v5

    .line 133
    move v5, v8

    .line 134
    :goto_3
    check-cast v0, Ljava/util/List;

    .line 135
    .line 136
    iget-object v3, v3, La/i7e;->i:La/p7m0;

    .line 137
    .line 138
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    move-object v8, v3

    .line 143
    check-cast v8, La/gxb;

    .line 144
    .line 145
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    check-cast v3, La/a640;

    .line 150
    .line 151
    if-eqz v3, :cond_8

    .line 152
    .line 153
    invoke-virtual {v3}, La/a640;->b()I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    iget-object v10, v8, La/gxb;->j:La/vxy;

    .line 158
    .line 159
    iget v10, v10, La/vxy;->a:I

    .line 160
    .line 161
    if-le v9, v10, :cond_8

    .line 162
    .line 163
    new-instance v15, La/vxy;

    .line 164
    .line 165
    invoke-virtual {v3}, La/a640;->b()I

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    invoke-virtual {v3}, La/a640;->e()La/xrt0;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    instance-of v3, v3, La/srt0;

    .line 174
    .line 175
    invoke-direct {v15, v9, v3}, La/vxy;-><init>(IZ)V

    .line 176
    .line 177
    .line 178
    const/16 v16, 0x1ff

    .line 179
    .line 180
    const/4 v9, 0x0

    .line 181
    const/4 v10, 0x0

    .line 182
    const/4 v11, 0x0

    .line 183
    const/4 v12, 0x0

    .line 184
    const/4 v13, 0x0

    .line 185
    const/4 v14, 0x0

    .line 186
    invoke-static/range {v8 .. v16}, La/gxb;->a(La/gxb;ZIILa/v9k0;ZLjava/util/List;La/vxy;I)La/gxb;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v2, v3}, La/g45;->j0(La/gxb;)V

    .line 191
    .line 192
    .line 193
    :cond_8
    iput-object v0, v4, La/gbu;->k:Ljava/util/List;

    .line 194
    .line 195
    iput-byte v7, v4, La/gbu;->i:B

    .line 196
    .line 197
    iput v5, v4, La/gbu;->j:I

    .line 198
    .line 199
    iput v6, v4, La/gbu;->n:I

    .line 200
    .line 201
    invoke-virtual {v2, v0}, La/g45;->l0(Ljava/util/List;)Lkotlin/Unit;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    if-ne v2, v1, :cond_9

    .line 206
    .line 207
    :goto_4
    return-object v1

    .line 208
    :cond_9
    return-object v0
.end method

.method public b(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/qv;->a:La/g45;

    .line 11
    .line 12
    iget-object p0, p0, La/g45;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/gcl;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, La/gcl;->d:La/p7m0;

    .line 20
    .line 21
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/util/Map;

    .line 26
    .line 27
    invoke-static {v1}, La/xp20;->p(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, La/vnt0;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {v2, p1, p3}, La/vnt0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, La/gcl;->b:La/vwb0;

    .line 44
    .line 45
    iget-object p2, p0, La/gcl;->c:La/vby;

    .line 46
    .line 47
    new-instance p3, La/inv;

    .line 48
    .line 49
    sget-object v2, La/ysm0;->a:La/ysm0;

    .line 50
    .line 51
    sget-object v3, La/vnt0;->Companion:La/unt0;

    .line 52
    .line 53
    invoke-virtual {v3}, La/unt0;->serializer()La/jiy;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const/4 v4, 0x1

    .line 58
    invoke-direct {p3, v2, v3, v4}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, p3, v1}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    const-string p3, "KEY_UPLOADED_MEDIA_IDS"

    .line 66
    .line 67
    invoke-virtual {p1, p3, p2}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    invoke-virtual {v0, p1, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, La/gcl;->d()V

    .line 75
    .line 76
    .line 77
    return-void
.end method
