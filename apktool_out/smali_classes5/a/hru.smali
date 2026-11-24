.class public final La/hru;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n1x;
.implements La/pp9;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance p1, La/fq80;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, La/fq80;-><init>(I)V

    iput-object p1, p0, La/hru;->a:Ljava/lang/Object;

    return-void

    .line 62
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance p1, La/xz40;

    const/16 v0, 0x10

    new-array v0, v0, [La/paz;

    invoke-direct {p1, v0}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 64
    iput-object p1, p0, La/hru;->a:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch p2, :pswitch_data_0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance p2, La/tpv;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, La/tpv;-><init>(La/gii0;B)V

    iput-object p2, p0, La/hru;->a:Ljava/lang/Object;

    return-void

    .line 57
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance p2, La/tpv;

    const/4 v0, 0x2

    invoke-direct {p2, p1, v0}, La/tpv;-><init>(La/gii0;B)V

    iput-object p2, p0, La/hru;->a:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/umx;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, La/hru;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/v0;Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/v0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-class v0, Ljava/lang/Void;

    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p2, "Given internalKeyMananger "

    .line 36
    .line 37
    const-string v0, " does not support primitive class "

    .line 38
    .line 39
    invoke-static {p2, p0, v0, p1}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    throw p0

    .line 48
    :cond_1
    :goto_0
    iput-object p1, p0, La/hru;->a:Ljava/lang/Object;

    .line 49
    .line 50
    return-void
.end method

.method public constructor <init>(La/wu00;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, La/hru;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 59
    iput-object p1, p0, La/hru;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 5

    .line 1
    iget-object p0, p0, La/hru;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/rkr0;

    .line 4
    .line 5
    invoke-interface {p0}, La/rkr0;->s()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/util/Set;

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    int-to-long v3, v3

    .line 57
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Ljava/lang/Number;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 92
    .line 93
    .line 94
    move-result-wide v1

    .line 95
    check-cast v0, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v3

    .line 101
    mul-long/2addr v3, v1

    .line 102
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    goto :goto_1

    .line 107
    :cond_1
    check-cast v0, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    return-wide v0

    .line 114
    :cond_2
    const-string p0, "Empty collection can\'t be reduced."

    .line 115
    .line 116
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    return-wide v1
.end method

.method public b(Z)La/xae0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hru;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nv20;

    .line 4
    .line 5
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/u5g0;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/u5g0;->b:La/p7m0;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p0, La/u5g0;->a:La/p7m0;

    .line 15
    .line 16
    :goto_0
    invoke-static {p0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public c(DDIIJLa/zje;La/qvo0;)Ljava/io/Serializable;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p9

    .line 4
    .line 5
    iget-object v2, v0, La/hru;->a:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v3, v2

    .line 8
    check-cast v3, La/dgu;

    .line 9
    .line 10
    instance-of v2, v1, La/sxu;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    move-object v2, v1

    .line 15
    check-cast v2, La/sxu;

    .line 16
    .line 17
    iget v4, v2, La/sxu;->n:I

    .line 18
    .line 19
    const/high16 v5, -0x80000000

    .line 20
    .line 21
    and-int v6, v4, v5

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    sub-int/2addr v4, v5

    .line 26
    iput v4, v2, La/sxu;->n:I

    .line 27
    .line 28
    :goto_0
    move-object v12, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    new-instance v2, La/sxu;

    .line 31
    .line 32
    invoke-direct {v2, v0, v1}, La/sxu;-><init>(La/hru;La/zje;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    iget-object v1, v12, La/sxu;->l:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object v2, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v4, v12, La/sxu;->n:I

    .line 41
    .line 42
    const/4 v14, 0x0

    .line 43
    const/4 v15, 0x0

    .line 44
    const/4 v5, 0x1

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    if-ne v4, v5, :cond_1

    .line 48
    .line 49
    iget-wide v4, v12, La/sxu;->j:D

    .line 50
    .line 51
    iget-wide v6, v12, La/sxu;->i:D

    .line 52
    .line 53
    iget-object v0, v12, La/sxu;->k:La/hru;

    .line 54
    .line 55
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v14

    .line 68
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v3, La/dgu;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, La/ovo0;

    .line 74
    .line 75
    iget-boolean v1, v1, La/ovo0;->a:Z

    .line 76
    .line 77
    if-eqz v1, :cond_9

    .line 78
    .line 79
    :try_start_1
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 80
    .line 81
    iput-object v0, v12, La/sxu;->k:La/hru;

    .line 82
    .line 83
    move-wide/from16 v6, p1

    .line 84
    .line 85
    iput-wide v6, v12, La/sxu;->i:D

    .line 86
    .line 87
    move-wide/from16 v8, p3

    .line 88
    .line 89
    iput-wide v8, v12, La/sxu;->j:D

    .line 90
    .line 91
    iput v5, v12, La/sxu;->n:I

    .line 92
    .line 93
    move-wide/from16 v10, p7

    .line 94
    .line 95
    move-object/from16 v13, p10

    .line 96
    .line 97
    move-wide v4, v6

    .line 98
    move-wide v6, v8

    .line 99
    move/from16 v8, p5

    .line 100
    .line 101
    move/from16 v9, p6

    .line 102
    .line 103
    invoke-virtual/range {v3 .. v13}, La/dgu;->k(DDIIJLa/zje;La/qvo0;)Ljava/io/Serializable;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-ne v1, v2, :cond_3

    .line 108
    .line 109
    return-object v2

    .line 110
    :cond_3
    move-wide/from16 v6, p1

    .line 111
    .line 112
    move-wide/from16 v4, p3

    .line 113
    .line 114
    :goto_2
    check-cast v1, La/hxu;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v0, v1, La/hxu;->f:La/ivo0;

    .line 120
    .line 121
    iget-wide v8, v0, La/ivo0;->b:D

    .line 122
    .line 123
    mul-double/2addr v6, v4

    .line 124
    sub-double/2addr v8, v6

    .line 125
    new-instance v0, Ljava/math/BigDecimal;

    .line 126
    .line 127
    invoke-direct {v0, v8, v9}, Ljava/math/BigDecimal;-><init>(D)V

    .line 128
    .line 129
    .line 130
    sget-object v2, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 131
    .line 132
    const/4 v4, 0x2

    .line 133
    invoke-virtual {v0, v4, v2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/math/BigDecimal;->signum()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_4

    .line 142
    .line 143
    new-instance v0, Ljava/math/BigDecimal;

    .line 144
    .line 145
    sget-object v2, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 146
    .line 147
    invoke-direct {v0, v2, v15}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_4
    invoke-virtual {v0}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :goto_3
    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 156
    .line 157
    .line 158
    move-result-wide v4

    .line 159
    const/16 v0, 0x3f

    .line 160
    .line 161
    invoke-static {v1, v14, v4, v5, v0}, La/hxu;->a(La/hxu;La/ivo0;DI)La/hxu;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :goto_4
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 169
    .line 170
    new-instance v1, La/g0g0;

    .line 171
    .line 172
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    move-object v0, v1

    .line 176
    :goto_5
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    if-nez v1, :cond_5

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_5
    instance-of v0, v1, La/zhi0;

    .line 184
    .line 185
    if-eqz v0, :cond_7

    .line 186
    .line 187
    check-cast v1, La/zhi0;

    .line 188
    .line 189
    iget-object v0, v1, La/zhi0;->c:La/kuw;

    .line 190
    .line 191
    sget-object v1, La/i2o;->V2:La/i2o;

    .line 192
    .line 193
    if-ne v0, v1, :cond_6

    .line 194
    .line 195
    iget-object v0, v3, La/dgu;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, La/ovo0;

    .line 198
    .line 199
    iput-boolean v15, v0, La/ovo0;->a:Z

    .line 200
    .line 201
    :cond_6
    sget-object v0, La/hxu;->h:La/hxu;

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_7
    instance-of v0, v1, Ljava/util/concurrent/CancellationException;

    .line 205
    .line 206
    if-nez v0, :cond_8

    .line 207
    .line 208
    sget-object v0, La/hxu;->h:La/hxu;

    .line 209
    .line 210
    :goto_6
    check-cast v0, La/hxu;

    .line 211
    .line 212
    return-object v0

    .line 213
    :cond_8
    throw v1

    .line 214
    :cond_9
    sget-object v0, La/hxu;->h:La/hxu;

    .line 215
    .line 216
    return-object v0
.end method

.method public d(La/q7f0;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/gru;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/gru;

    .line 7
    .line 8
    iget v1, v0, La/gru;->l:I

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
    iput v1, v0, La/gru;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gru;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/gru;-><init>(La/hru;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/gru;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gru;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/gru;->i:La/q7f0;

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/hru;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/g8f0;

    .line 55
    .line 56
    iput-object p1, v0, La/gru;->i:La/q7f0;

    .line 57
    .line 58
    iput v4, v0, La/gru;->l:I

    .line 59
    .line 60
    invoke-virtual {p0, v0}, La/g8f0;->a(La/zje;)Ljava/io/Serializable;

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
    check-cast p2, Ljava/lang/Iterable;

    .line 68
    .line 69
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_5

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    move-object v0, p2

    .line 84
    check-cast v0, La/b1f0;

    .line 85
    .line 86
    iget-object v0, v0, La/b1f0;->a:La/q7f0;

    .line 87
    .line 88
    if-ne v0, p1, :cond_4

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    move-object p2, v3

    .line 92
    :goto_2
    check-cast p2, La/b1f0;

    .line 93
    .line 94
    if-eqz p2, :cond_6

    .line 95
    .line 96
    iget-object v3, p2, La/b1f0;->b:Ljava/util/ArrayList;

    .line 97
    .line 98
    :cond_6
    if-nez v3, :cond_7

    .line 99
    .line 100
    sget-object p0, La/iun;->a:La/iun;

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_7
    return-object v3
.end method

.method public e(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/hru;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/op1;

    .line 4
    .line 5
    instance-of v1, p2, La/ytu;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p2

    .line 10
    check-cast v1, La/ytu;

    .line 11
    .line 12
    iget v2, v1, La/ytu;->l:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/ytu;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/ytu;

    .line 25
    .line 26
    invoke-direct {v1, p0, p2}, La/ytu;-><init>(La/hru;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v1, La/ytu;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v1, La/ytu;->l:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    iget-object p1, v1, La/ytu;->i:Ljava/util/List;

    .line 42
    .line 43
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, v1, La/ytu;->i:Ljava/util/List;

    .line 57
    .line 58
    iput v4, v1, La/ytu;->l:I

    .line 59
    .line 60
    invoke-virtual {v0, v1}, La/op1;->b(La/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, p2, :cond_3

    .line 65
    .line 66
    return-object p2

    .line 67
    :cond_3
    :goto_1
    check-cast p0, Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-nez p2, :cond_4

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    const/4 v1, 0x0

    .line 86
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_a

    .line 91
    .line 92
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    add-int/lit8 v4, v1, 0x1

    .line 97
    .line 98
    if-ltz v1, :cond_9

    .line 99
    .line 100
    check-cast v2, La/ykg0;

    .line 101
    .line 102
    iget-object v2, v2, La/ykg0;->c:La/ysw;

    .line 103
    .line 104
    iget-object v5, v2, La/ysw;->a:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v5}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-nez v5, :cond_7

    .line 111
    .line 112
    new-instance v5, La/qtc0;

    .line 113
    .line 114
    iget-object v6, v2, La/ysw;->a:Ljava/lang/String;

    .line 115
    .line 116
    add-int/lit8 v1, v1, -0x1

    .line 117
    .line 118
    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, La/ykg0;

    .line 123
    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    iget-object v1, v1, La/ykg0;->b:Ljava/lang/String;

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    move-object v1, v3

    .line 130
    :goto_3
    if-nez v1, :cond_6

    .line 131
    .line 132
    const-string v1, ""

    .line 133
    .line 134
    :cond_6
    iget-object v2, v2, La/ysw;->d:Ljava/lang/String;

    .line 135
    .line 136
    invoke-direct {v5, v6, v1, v2}, La/qtc0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    move-object v5, v3

    .line 141
    :goto_4
    if-eqz v5, :cond_8

    .line 142
    .line 143
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    :cond_8
    move v1, v4

    .line 147
    goto :goto_2

    .line 148
    :cond_9
    invoke-static {}, La/q3d;->p()V

    .line 149
    .line 150
    .line 151
    throw v3

    .line 152
    :cond_a
    iget-object p1, v0, La/op1;->a:La/p7m0;

    .line 153
    .line 154
    invoke-virtual {p1, v3, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    return-object p0
.end method

.method public f(La/uaq0;)Ljava/util/ArrayList;
    .locals 12

    .line 1
    iget-object p0, p0, La/hru;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/rh00;

    .line 4
    .line 5
    sget-object v0, La/rh00;->d:Ljava/util/List;

    .line 6
    .line 7
    iget-object p0, p0, La/rh00;->c:La/knf0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/knf0;->c()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v1, "ru"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v3, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/16 v4, 0xa

    .line 34
    .line 35
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_5

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    add-int/lit8 v5, v2, 0x1

    .line 57
    .line 58
    if-ltz v2, :cond_4

    .line 59
    .line 60
    check-cast v4, La/ph00;

    .line 61
    .line 62
    new-instance v2, La/oh00;

    .line 63
    .line 64
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    if-eqz p0, :cond_0

    .line 69
    .line 70
    const-string v7, "/ru/"

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    const-string v7, "/en/"

    .line 74
    .line 75
    :goto_1
    sget-object v8, La/uaq0;->a:La/s9m0;

    .line 76
    .line 77
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, La/s9m0;->j(La/uaq0;)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    const-string v9, "_l"

    .line 85
    .line 86
    if-eqz v8, :cond_1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_1
    invoke-static {p1}, La/s9m0;->i(La/uaq0;)Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v8, :cond_2

    .line 94
    .line 95
    const-string v9, "_d"

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    invoke-static {p1}, La/s9m0;->k(La/uaq0;)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_3

    .line 103
    .line 104
    const-string v9, "_n"

    .line 105
    .line 106
    :cond_3
    :goto_2
    const-string v8, "/"

    .line 107
    .line 108
    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    const-string v10, "static/img/android/instructions/onboarding_casino"

    .line 113
    .line 114
    const-string v11, "/live"

    .line 115
    .line 116
    invoke-static {v10, v8, v11, v7, v6}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    const-string v7, ".webp"

    .line 121
    .line 122
    invoke-static {v6, v9, v7}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-direct {v2, v4, v6}, La/oh00;-><init>(La/ph00;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move v2, v5

    .line 133
    goto :goto_0

    .line 134
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 135
    .line 136
    .line 137
    const/4 p0, 0x0

    .line 138
    throw p0

    .line 139
    :cond_5
    return-object v3
.end method

.method public g(La/to9;La/jtf0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/hru;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n5a;

    .line 4
    .line 5
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public h(La/o1x;La/hhn0;)V
    .locals 8

    .line 1
    iget-object p0, p0, La/hru;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/k6y;

    .line 4
    .line 5
    sget-object p1, La/k6y;->Q1:La/sqt;

    .line 6
    .line 7
    invoke-virtual {p0}, La/k6y;->H0()La/t6y;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p1, p0, La/t6y;->o:La/p7m0;

    .line 12
    .line 13
    iget-object p2, p0, La/t6y;->n:La/p7m0;

    .line 14
    .line 15
    iget-boolean v0, p0, La/t6y;->m:Z

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance p2, La/n6y;

    .line 21
    .line 22
    iget-object v2, p0, La/t6y;->e:La/sa10;

    .line 23
    .line 24
    sget-object v3, La/pb10;->g:La/pb10;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    const/16 v7, 0x1c

    .line 28
    .line 29
    const v4, 0x7f130677

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-static/range {v2 .. v7}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {p2, p0}, La/n6y;-><init>(La/ra10;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1, p2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    instance-of v0, v0, La/p6y;

    .line 54
    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object p0, La/m6y;->a:La/m6y;

    .line 61
    .line 62
    invoke-virtual {p1, v1, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    iget-boolean p0, p0, La/t6y;->m:Z

    .line 67
    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
.end method

.method public i()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/hru;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/rrc;

    .line 4
    .line 5
    iget-object p0, p0, La/rrc;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/tgk;

    .line 8
    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x1a

    .line 12
    .line 13
    if-lt v0, v1, :cond_5

    .line 14
    .line 15
    iget-object v0, p0, La/tgk;->h:La/n0o0;

    .line 16
    .line 17
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/app/NotificationManager;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    iget-object p0, p0, La/tgk;->h:La/n0o0;

    .line 33
    .line 34
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Landroid/app/NotificationManager;

    .line 39
    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    invoke-static {p0}, La/c0g;->u(Landroid/app/NotificationManager;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 p0, 0x0

    .line 48
    :goto_0
    if-nez p0, :cond_2

    .line 49
    .line 50
    sget-object p0, La/iun;->a:La/iun;

    .line 51
    .line 52
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, La/c0g;->b(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, La/c0g;->a(Landroid/app/NotificationChannel;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    :goto_1
    const/4 p0, 0x0

    .line 77
    return p0

    .line 78
    :cond_4
    const/4 p0, 0x1

    .line 79
    return p0

    .line 80
    :cond_5
    iget-object p0, p0, La/tgk;->a:La/us00;

    .line 81
    .line 82
    new-instance v0, La/o760;

    .line 83
    .line 84
    invoke-direct {v0, p0}, La/o760;-><init>(Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    iget-object p0, v0, La/o760;->b:Landroid/app/NotificationManager;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    return p0
.end method

.method public j(La/s470;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, La/hru;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/kgq0;

    .line 4
    .line 5
    instance-of v1, p2, La/fp00;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p2

    .line 10
    check-cast v1, La/fp00;

    .line 11
    .line 12
    iget v2, v1, La/fp00;->k:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/fp00;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/fp00;

    .line 25
    .line 26
    invoke-direct {v1, p0, p2}, La/fp00;-><init>(La/hru;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v1, La/fp00;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v1, La/fp00;->k:I

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput v3, v1, La/fp00;->k:I

    .line 55
    .line 56
    invoke-virtual {v0, p1, v1}, La/kgq0;->b(La/s470;La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-ne p0, p2, :cond_3

    .line 61
    .line 62
    return-object p2

    .line 63
    :cond_3
    :goto_1
    check-cast p0, Ljava/util/List;

    .line 64
    .line 65
    invoke-virtual {v0, p0}, La/kgq0;->e(Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    return-object p0
.end method

.method public k(La/o1x;La/r1o;)V
    .locals 0

    .line 1
    return-void
.end method

.method public l(La/og9;)La/fky;
    .locals 3

    .line 1
    iget-object p0, p0, La/hru;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/v0;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, La/v0;->s()La/p4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, La/p4;->G0(La/og9;)La/x3;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, La/p4;->M0(La/x3;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, La/p4;->t0(La/x3;)La/x3;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, La/fky;->B()La/dky;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0}, La/v0;->q()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0}, La/yit;->e()V

    .line 29
    .line 30
    .line 31
    iget-object v2, v0, La/yit;->b:La/jjt;

    .line 32
    .line 33
    check-cast v2, La/fky;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, La/fky;->D(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, La/x3;->f()La/kg9;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0}, La/yit;->e()V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, La/yit;->b:La/jjt;

    .line 46
    .line 47
    check-cast v1, La/fky;

    .line 48
    .line 49
    invoke-virtual {v1, p1}, La/fky;->E(La/kg9;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, La/v0;->t()La/eky;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v0}, La/yit;->e()V

    .line 57
    .line 58
    .line 59
    iget-object p1, v0, La/yit;->b:La/jjt;

    .line 60
    .line 61
    check-cast p1, La/fky;

    .line 62
    .line 63
    invoke-virtual {p1, p0}, La/fky;->C(La/eky;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, La/yit;->b()La/jjt;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, La/fky;
    :try_end_0
    .catch La/ynx; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    return-object p0

    .line 73
    :catch_0
    move-exception p0

    .line 74
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 75
    .line 76
    const-string v0, "Unexpected proto"

    .line 77
    .line 78
    invoke-direct {p1, v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method

.method public m(La/to9;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/hru;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n5a;

    .line 4
    .line 5
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 6
    .line 7
    new-instance p1, La/g0g0;

    .line 8
    .line 9
    invoke-direct {p1, p2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public n(La/guo;La/cxw;I)La/ed40;
    .locals 12

    .line 1
    iget-object p0, p0, La/hru;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/fq80;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    move v3, v0

    .line 8
    move-object v2, v1

    .line 9
    :goto_0
    move v4, v0

    .line 10
    :cond_0
    rem-int/lit8 v5, v4, 0xa

    .line 11
    .line 12
    add-int/lit8 v6, v5, 0xa

    .line 13
    .line 14
    const/16 v7, 0xa

    .line 15
    .line 16
    if-nez v5, :cond_1

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    iget-object v8, p0, La/fq80;->a:[B

    .line 21
    .line 22
    const/16 v9, 0x9

    .line 23
    .line 24
    invoke-static {v8, v7, v8, v0, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    :cond_1
    if-nez v4, :cond_2

    .line 28
    .line 29
    move v8, v7

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 v8, 0x1

    .line 32
    :goto_1
    :try_start_0
    iget-object v9, p0, La/fq80;->a:[B

    .line 33
    .line 34
    sub-int v10, v6, v8

    .line 35
    .line 36
    invoke-interface {p1, v9, v10, v8}, La/guo;->n([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v5}, La/fq80;->M(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v6}, La/fq80;->L(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/fq80;->a()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    const/4 v8, 0x3

    .line 50
    if-lt v6, v8, :cond_8

    .line 51
    .line 52
    invoke-virtual {p0}, La/fq80;->C()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    iget v9, p0, La/fq80;->b:I

    .line 57
    .line 58
    sub-int/2addr v9, v8

    .line 59
    iput v9, p0, La/fq80;->b:I

    .line 60
    .line 61
    const v9, 0x494433

    .line 62
    .line 63
    .line 64
    if-ne v6, v9, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0, v8}, La/fq80;->N(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, La/fq80;->z()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    const/4 v8, 0x2

    .line 74
    if-lt v6, v8, :cond_6

    .line 75
    .line 76
    const/4 v8, 0x4

    .line 77
    if-gt v6, v8, :cond_6

    .line 78
    .line 79
    invoke-virtual {p0, v5}, La/fq80;->M(I)V

    .line 80
    .line 81
    .line 82
    iget v4, p0, La/fq80;->b:I

    .line 83
    .line 84
    const/4 v5, 0x6

    .line 85
    invoke-virtual {p0, v5}, La/fq80;->N(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, La/fq80;->y()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    add-int/lit8 v6, v5, 0xa

    .line 93
    .line 94
    invoke-interface {p1}, La/guo;->getLength()J

    .line 95
    .line 96
    .line 97
    move-result-wide v8

    .line 98
    const-wide/16 v10, -0x1

    .line 99
    .line 100
    cmp-long v8, v8, v10

    .line 101
    .line 102
    if-eqz v8, :cond_3

    .line 103
    .line 104
    invoke-interface {p1}, La/guo;->i()J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    int-to-long v10, v5

    .line 109
    add-long/2addr v8, v10

    .line 110
    invoke-interface {p1}, La/guo;->getLength()J

    .line 111
    .line 112
    .line 113
    move-result-wide v10

    .line 114
    cmp-long v8, v8, v10

    .line 115
    .line 116
    if-lez v8, :cond_3

    .line 117
    .line 118
    const-string p0, "Skipping ID3 tag with tagLength="

    .line 119
    .line 120
    const-string p2, " greater than input length="

    .line 121
    .line 122
    invoke-static {v6, p0, p2}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-interface {p1}, La/guo;->getLength()J

    .line 127
    .line 128
    .line 129
    move-result-wide p2

    .line 130
    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    const-string p2, "Id3Peeker"

    .line 138
    .line 139
    invoke-static {p2, p0}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_3
    if-nez v2, :cond_4

    .line 144
    .line 145
    new-array v2, v6, [B

    .line 146
    .line 147
    iget-object v8, p0, La/fq80;->a:[B

    .line 148
    .line 149
    invoke-static {v8, v4, v2, v0, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p1, v2, v7, v5}, La/guo;->n([BII)V

    .line 153
    .line 154
    .line 155
    new-instance v4, La/exw;

    .line 156
    .line 157
    invoke-direct {v4, p2}, La/exw;-><init>(La/cxw;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v2, v6}, La/exw;->Q([BI)La/ed40;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    goto :goto_2

    .line 165
    :cond_4
    invoke-interface {p1, v5}, La/guo;->j(I)V

    .line 166
    .line 167
    .line 168
    :goto_2
    add-int/2addr v3, v6

    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_5
    invoke-virtual {p0}, La/fq80;->i()I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    invoke-static {v5}, La/saj;->S(I)I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    const/4 v6, -0x1

    .line 180
    if-eq v5, v6, :cond_6

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_6
    if-nez v4, :cond_7

    .line 184
    .line 185
    const/16 v5, 0x14

    .line 186
    .line 187
    invoke-virtual {p0, v5}, La/fq80;->c(I)V

    .line 188
    .line 189
    .line 190
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 191
    .line 192
    if-le v4, p3, :cond_0

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_8
    iget p1, p0, La/fq80;->b:I

    .line 196
    .line 197
    const-string p2, ", limit="

    .line 198
    .line 199
    iget p0, p0, La/fq80;->c:I

    .line 200
    .line 201
    const-string p3, "position="

    .line 202
    .line 203
    invoke-static {p1, p0, p2, p3}, La/ohq;->g(IILjava/lang/Object;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-object v1

    .line 207
    :catch_0
    :goto_3
    invoke-interface {p1}, La/guo;->g()V

    .line 208
    .line 209
    .line 210
    invoke-interface {p1, v3}, La/guo;->j(I)V

    .line 211
    .line 212
    .line 213
    return-object v2
.end method
