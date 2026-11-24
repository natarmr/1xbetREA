.class public final La/zw90;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/w9t;

.field public final b:La/pbt;

.field public final c:La/gst0;


# direct methods
.method public constructor <init>(La/w9t;La/pbt;La/eqs;La/gst0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zw90;->a:La/w9t;

    .line 5
    .line 6
    iput-object p2, p0, La/zw90;->b:La/pbt;

    .line 7
    .line 8
    iput-object p4, p0, La/zw90;->c:La/gst0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/yw90;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/yw90;

    .line 11
    .line 12
    iget v3, v2, La/yw90;->n:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/yw90;->n:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/yw90;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/yw90;-><init>(La/zw90;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v6, La/yw90;->l:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v6, La/yw90;->n:I

    .line 36
    .line 37
    iget-object v10, v0, La/zw90;->b:La/pbt;

    .line 38
    .line 39
    const/4 v11, 0x2

    .line 40
    const/4 v12, 0x1

    .line 41
    const/4 v13, 0x0

    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    if-eq v3, v12, :cond_2

    .line 45
    .line 46
    if-ne v3, v11, :cond_1

    .line 47
    .line 48
    iget-object v0, v6, La/yw90;->j:La/s9t;

    .line 49
    .line 50
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v13

    .line 61
    :cond_2
    iget-wide v3, v6, La/yw90;->k:D

    .line 62
    .line 63
    iget-object v5, v6, La/yw90;->i:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v7, v5

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v10, La/pbt;->a:La/j5t;

    .line 74
    .line 75
    iget-object v3, v1, La/j5t;->q:La/ql5;

    .line 76
    .line 77
    if-eqz v3, :cond_8

    .line 78
    .line 79
    iget-object v9, v1, La/j5t;->p:La/csr;

    .line 80
    .line 81
    iget-wide v4, v1, La/j5t;->o:D

    .line 82
    .line 83
    iget-wide v7, v3, La/ql5;->a:J

    .line 84
    .line 85
    move-object/from16 v1, p1

    .line 86
    .line 87
    iput-object v1, v6, La/yw90;->i:Ljava/lang/String;

    .line 88
    .line 89
    iput-wide v4, v6, La/yw90;->k:D

    .line 90
    .line 91
    iput v12, v6, La/yw90;->n:I

    .line 92
    .line 93
    iget-object v3, v0, La/zw90;->a:La/w9t;

    .line 94
    .line 95
    move-wide/from16 v16, v7

    .line 96
    .line 97
    move-object v8, v6

    .line 98
    move-wide/from16 v6, v16

    .line 99
    .line 100
    invoke-virtual/range {v3 .. v9}, La/w9t;->b(DJLa/zje;La/csr;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    move-object v6, v8

    .line 105
    if-ne v3, v2, :cond_4

    .line 106
    .line 107
    goto/16 :goto_4

    .line 108
    .line 109
    :cond_4
    move-object v7, v1

    .line 110
    move-object v1, v3

    .line 111
    move-wide v3, v4

    .line 112
    :goto_2
    check-cast v1, La/s9t;

    .line 113
    .line 114
    iget-object v5, v1, La/s9t;->e:Ljava/util/List;

    .line 115
    .line 116
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    check-cast v5, La/n9t;

    .line 121
    .line 122
    iget v5, v5, La/n9t;->a:I

    .line 123
    .line 124
    iget-object v8, v1, La/s9t;->e:Ljava/util/List;

    .line 125
    .line 126
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    check-cast v8, La/n9t;

    .line 131
    .line 132
    iget-object v8, v8, La/n9t;->h:La/i9t;

    .line 133
    .line 134
    iget-object v8, v8, La/i9t;->b:Ljava/util/List;

    .line 135
    .line 136
    new-instance v9, Ljava/util/ArrayList;

    .line 137
    .line 138
    const/16 v14, 0xa

    .line 139
    .line 140
    invoke-static {v8, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    invoke-direct {v9, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-eqz v14, :cond_5

    .line 156
    .line 157
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    check-cast v14, La/r9b;

    .line 162
    .line 163
    iget v14, v14, La/r9b;->c:I

    .line 164
    .line 165
    new-instance v15, Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-direct {v15, v14}, Ljava/lang/Integer;-><init>(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_5
    sub-int/2addr v5, v12

    .line 175
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    check-cast v5, Ljava/lang/Number;

    .line 180
    .line 181
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    sget-object v8, La/a570;->Companion:La/t470;

    .line 186
    .line 187
    int-to-long v14, v5

    .line 188
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    const-wide/16 v8, 0x0

    .line 192
    .line 193
    cmp-long v5, v14, v8

    .line 194
    .line 195
    if-lez v5, :cond_7

    .line 196
    .line 197
    iget-object v0, v0, La/zw90;->c:La/gst0;

    .line 198
    .line 199
    invoke-virtual {v0}, La/gst0;->a()Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    iput-object v13, v6, La/yw90;->i:Ljava/lang/String;

    .line 204
    .line 205
    iput-object v1, v6, La/yw90;->j:La/s9t;

    .line 206
    .line 207
    iput-wide v3, v6, La/yw90;->k:D

    .line 208
    .line 209
    iput v11, v6, La/yw90;->n:I

    .line 210
    .line 211
    move-object v3, v10

    .line 212
    move-wide v4, v14

    .line 213
    invoke-virtual/range {v3 .. v8}, La/pbt;->h(JLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-ne v0, v2, :cond_6

    .line 218
    .line 219
    :goto_4
    return-object v2

    .line 220
    :cond_6
    move-object/from16 v16, v1

    .line 221
    .line 222
    move-object v1, v0

    .line 223
    move-object/from16 v0, v16

    .line 224
    .line 225
    :goto_5
    check-cast v1, La/pbv;

    .line 226
    .line 227
    iget-object v1, v1, La/pbv;->c:Ljava/lang/String;

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_7
    const-string v0, ""

    .line 231
    .line 232
    move-object/from16 v16, v1

    .line 233
    .line 234
    move-object v1, v0

    .line 235
    move-object/from16 v0, v16

    .line 236
    .line 237
    :goto_6
    new-instance v2, La/d8t;

    .line 238
    .line 239
    invoke-direct {v2, v1, v0}, La/d8t;-><init>(Ljava/lang/String;La/s9t;)V

    .line 240
    .line 241
    .line 242
    return-object v2

    .line 243
    :cond_8
    new-instance v0, La/ss3;

    .line 244
    .line 245
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 246
    .line 247
    .line 248
    throw v0
.end method
