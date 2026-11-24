.class public final synthetic La/zm8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/i3t0;Ljava/lang/Object;JJB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/zm8;->a:B

    iput-object p1, p0, La/zm8;->d:Ljava/lang/Object;

    iput-object p2, p0, La/zm8;->e:Ljava/lang/Object;

    iput-wide p3, p0, La/zm8;->b:J

    iput-wide p5, p0, La/zm8;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JJLjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p7, p0, La/zm8;->a:B

    iput-object p1, p0, La/zm8;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/zm8;->b:J

    iput-wide p4, p0, La/zm8;->c:J

    iput-object p6, p0, La/zm8;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zm8;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/zm8;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/zm8;->d:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, La/f1b0;

    .line 13
    .line 14
    check-cast v2, La/vh0;

    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, La/k0w0;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v4, v3, La/f1b0;->z:La/peg0;

    .line 24
    .line 25
    new-instance v5, La/fr1;

    .line 26
    .line 27
    new-instance v6, La/fs80;

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v2, v2, La/vh0;->b:Ljava/lang/String;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v2, v7

    .line 36
    :goto_0
    if-nez v2, :cond_1

    .line 37
    .line 38
    const-string v2, ""

    .line 39
    .line 40
    :cond_1
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, La/d0b0;

    .line 45
    .line 46
    iget-object v3, v3, La/d0b0;->f:La/c0b0;

    .line 47
    .line 48
    iget-boolean v3, v3, La/c0b0;->a:Z

    .line 49
    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    sget-object v3, La/iun;->a:La/iun;

    .line 53
    .line 54
    :goto_1
    move-object v10, v3

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    iget-wide v8, v0, La/zm8;->c:J

    .line 57
    .line 58
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    goto :goto_1

    .line 67
    :goto_2
    const/4 v14, 0x0

    .line 68
    const/16 v15, 0x78

    .line 69
    .line 70
    iget-wide v8, v0, La/zm8;->b:J

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    const-wide/16 v12, 0x0

    .line 74
    .line 75
    move-object v0, v7

    .line 76
    move-object v7, v2

    .line 77
    invoke-direct/range {v6 .. v15}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 78
    .line 79
    .line 80
    const/4 v2, 0x2

    .line 81
    invoke-direct {v5, v6, v0, v2}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v5}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 89
    .line 90
    .line 91
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_0
    check-cast v3, La/rua0;

    .line 95
    .line 96
    move-object v10, v2

    .line 97
    check-cast v10, Ljava/lang/String;

    .line 98
    .line 99
    move-object/from16 v1, p1

    .line 100
    .line 101
    check-cast v1, La/k0w0;

    .line 102
    .line 103
    iget-object v4, v3, La/rua0;->s:La/vjp;

    .line 104
    .line 105
    sget-object v5, La/rua0;->H:La/j700;

    .line 106
    .line 107
    new-instance v6, La/m8h0;

    .line 108
    .line 109
    invoke-direct {v6, v10}, La/m8h0;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-wide v2, v0, La/zm8;->b:J

    .line 113
    .line 114
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-static {v2}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    iget-wide v8, v0, La/zm8;->c:J

    .line 123
    .line 124
    invoke-virtual/range {v4 .. v10}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 129
    .line 130
    .line 131
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_1
    check-cast v3, La/a4x;

    .line 135
    .line 136
    move-object v7, v2

    .line 137
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 138
    .line 139
    move-object/from16 v8, p1

    .line 140
    .line 141
    check-cast v8, La/hcz;

    .line 142
    .line 143
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    new-instance v1, La/wk60;

    .line 147
    .line 148
    const/16 v2, 0x1d

    .line 149
    .line 150
    invoke-direct {v1, v2}, La/wk60;-><init>(B)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    new-instance v10, La/m160;

    .line 158
    .line 159
    const/16 v2, 0xc

    .line 160
    .line 161
    invoke-direct {v10, v1, v3, v2}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 162
    .line 163
    .line 164
    new-instance v11, La/a580;

    .line 165
    .line 166
    const/4 v1, 0x0

    .line 167
    invoke-direct {v11, v3, v1}, La/a580;-><init>(Ljava/util/List;B)V

    .line 168
    .line 169
    .line 170
    new-instance v1, La/b580;

    .line 171
    .line 172
    move-object v2, v3

    .line 173
    iget-wide v3, v0, La/zm8;->b:J

    .line 174
    .line 175
    iget-wide v5, v0, La/zm8;->c:J

    .line 176
    .line 177
    invoke-direct/range {v1 .. v7}, La/b580;-><init>(Ljava/util/List;JJLkotlin/jvm/functions/Function1;)V

    .line 178
    .line 179
    .line 180
    new-instance v0, La/ugd;

    .line 181
    .line 182
    const v2, 0x2fd4df92

    .line 183
    .line 184
    .line 185
    const/4 v3, 0x1

    .line 186
    invoke-direct {v0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8, v9, v10, v11, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 190
    .line 191
    .line 192
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object v0

    .line 195
    :pswitch_2
    check-cast v3, La/t89;

    .line 196
    .line 197
    move-object v8, v2

    .line 198
    check-cast v8, La/agc;

    .line 199
    .line 200
    move-object/from16 v1, p1

    .line 201
    .line 202
    check-cast v1, La/g7z;

    .line 203
    .line 204
    invoke-virtual {v1}, La/g7z;->a()V

    .line 205
    .line 206
    .line 207
    const/4 v10, 0x0

    .line 208
    const/16 v11, 0x68

    .line 209
    .line 210
    move-object v2, v3

    .line 211
    iget-wide v3, v0, La/zm8;->b:J

    .line 212
    .line 213
    iget-wide v5, v0, La/zm8;->c:J

    .line 214
    .line 215
    const/4 v7, 0x0

    .line 216
    const/4 v9, 0x0

    .line 217
    invoke-static/range {v1 .. v11}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 218
    .line 219
    .line 220
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
