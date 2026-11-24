.class public final La/oqx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rou;

.field public final b:La/iqt;

.field public final c:La/pqx;

.field public final d:La/yri0;


# direct methods
.method public constructor <init>(La/rou;La/iqt;La/pqx;La/yri0;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/oqx;->a:La/rou;

    .line 11
    .line 12
    iput-object p2, p0, La/oqx;->b:La/iqt;

    .line 13
    .line 14
    iput-object p3, p0, La/oqx;->c:La/pqx;

    .line 15
    .line 16
    iput-object p4, p0, La/oqx;->d:La/yri0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/nqx;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/nqx;

    .line 11
    .line 12
    iget v3, v2, La/nqx;->l:I

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
    iput v3, v2, La/nqx;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/nqx;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/nqx;-><init>(La/oqx;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/nqx;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/nqx;->l:I

    .line 34
    .line 35
    iget-object v5, v0, La/oqx;->d:La/yri0;

    .line 36
    .line 37
    const/4 v6, 0x4

    .line 38
    const/4 v7, 0x3

    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v10, 0x1

    .line 42
    const/4 v11, 0x0

    .line 43
    if-eqz v4, :cond_4

    .line 44
    .line 45
    if-eq v4, v10, :cond_3

    .line 46
    .line 47
    if-eq v4, v8, :cond_2

    .line 48
    .line 49
    if-eq v4, v7, :cond_2

    .line 50
    .line 51
    if-ne v4, v6, :cond_1

    .line 52
    .line 53
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v9

    .line 63
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_8

    .line 67
    .line 68
    :cond_3
    iget-object v4, v2, La/nqx;->i:Ljava/util/List;

    .line 69
    .line 70
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object/from16 v16, v4

    .line 74
    .line 75
    move-object v4, v1

    .line 76
    move-object/from16 v1, v16

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v1, v0, La/oqx;->b:La/iqt;

    .line 83
    .line 84
    iget-object v1, v1, La/iqt;->a:La/gst0;

    .line 85
    .line 86
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_c

    .line 91
    .line 92
    move-object/from16 v1, p1

    .line 93
    .line 94
    iput-object v1, v2, La/nqx;->i:Ljava/util/List;

    .line 95
    .line 96
    iput v10, v2, La/nqx;->l:I

    .line 97
    .line 98
    iget-object v4, v0, La/oqx;->a:La/rou;

    .line 99
    .line 100
    invoke-virtual {v4, v11, v2}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-ne v4, v3, :cond_5

    .line 105
    .line 106
    goto/16 :goto_9

    .line 107
    .line 108
    :cond_5
    :goto_1
    check-cast v4, La/m2c0;

    .line 109
    .line 110
    iget-object v4, v4, La/m2c0;->c:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v4}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    if-eqz v4, :cond_6

    .line 117
    .line 118
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 119
    .line 120
    .line 121
    move-result-wide v12

    .line 122
    goto :goto_2

    .line 123
    :cond_6
    const-wide/16 v12, 0x0

    .line 124
    .line 125
    :goto_2
    if-eqz v1, :cond_8

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_8

    .line 132
    .line 133
    :cond_7
    move v10, v11

    .line 134
    goto :goto_3

    .line 135
    :cond_8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_7

    .line 144
    .line 145
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    check-cast v4, Ljava/lang/Number;

    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 152
    .line 153
    .line 154
    move-result-wide v14

    .line 155
    cmp-long v4, v14, v12

    .line 156
    .line 157
    if-nez v4, :cond_9

    .line 158
    .line 159
    :goto_3
    iput-object v9, v2, La/nqx;->i:Ljava/util/List;

    .line 160
    .line 161
    iput v8, v2, La/nqx;->l:I

    .line 162
    .line 163
    iget-object v1, v5, La/yri0;->a:La/ihb0;

    .line 164
    .line 165
    iget-object v1, v1, La/ihb0;->g:La/j910;

    .line 166
    .line 167
    invoke-virtual {v1, v10, v2}, La/j910;->A(ZLa/zje;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    sget-object v4, La/wne;->a:La/wne;

    .line 172
    .line 173
    if-ne v1, v4, :cond_a

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_a
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    :goto_4
    if-ne v1, v4, :cond_b

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_b
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    :goto_5
    if-ne v1, v3, :cond_f

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_c
    iput-object v9, v2, La/nqx;->i:Ljava/util/List;

    .line 187
    .line 188
    iput v7, v2, La/nqx;->l:I

    .line 189
    .line 190
    iget-object v1, v5, La/yri0;->a:La/ihb0;

    .line 191
    .line 192
    iget-object v1, v1, La/ihb0;->g:La/j910;

    .line 193
    .line 194
    invoke-virtual {v1, v11, v2}, La/j910;->A(ZLa/zje;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    if-ne v1, v3, :cond_d

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_d
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    :goto_6
    if-ne v1, v3, :cond_e

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_e
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    :goto_7
    if-ne v1, v3, :cond_f

    .line 209
    .line 210
    goto :goto_9

    .line 211
    :cond_f
    :goto_8
    iput-object v9, v2, La/nqx;->i:Ljava/util/List;

    .line 212
    .line 213
    iput v6, v2, La/nqx;->l:I

    .line 214
    .line 215
    iget-object v0, v0, La/oqx;->c:La/pqx;

    .line 216
    .line 217
    iget-object v0, v0, La/pqx;->a:La/ihb0;

    .line 218
    .line 219
    iget-object v0, v0, La/ihb0;->g:La/j910;

    .line 220
    .line 221
    invoke-virtual {v0, v2}, La/j910;->u(La/zje;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-ne v0, v3, :cond_10

    .line 226
    .line 227
    :goto_9
    return-object v3

    .line 228
    :cond_10
    return-object v0
.end method
