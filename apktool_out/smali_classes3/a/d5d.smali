.class public final synthetic La/d5d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/a4x;La/bdz;Lkotlin/jvm/functions/Function1;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/d5d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/d5d;->d:Ljava/lang/Object;

    iput p1, p0, La/d5d;->b:I

    iput-object p3, p0, La/d5d;->e:Ljava/lang/Object;

    iput-object p4, p0, La/d5d;->f:Ljava/lang/Object;

    iput-boolean p5, p0, La/d5d;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(La/sd60;La/mlr;IZLjava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/d5d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/d5d;->d:Ljava/lang/Object;

    iput-object p2, p0, La/d5d;->e:Ljava/lang/Object;

    iput p3, p0, La/d5d;->b:I

    iput-boolean p4, p0, La/d5d;->c:Z

    iput-object p5, p0, La/d5d;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/Window;Landroid/app/Activity;ILa/l7m0;Z)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput-byte v0, p0, La/d5d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/d5d;->d:Ljava/lang/Object;

    iput-object p2, p0, La/d5d;->e:Ljava/lang/Object;

    iput p3, p0, La/d5d;->b:I

    iput-object p4, p0, La/d5d;->f:Ljava/lang/Object;

    iput-boolean p5, p0, La/d5d;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/d5d;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/d5d;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, v0, La/d5d;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, La/d5d;->d:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v6, La/sd60;

    .line 17
    .line 18
    check-cast v5, La/mlr;

    .line 19
    .line 20
    move-object/from16 v21, v4

    .line 21
    .line 22
    check-cast v21, Ljava/lang/String;

    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/k0w0;

    .line 27
    .line 28
    iget-object v4, v6, La/sd60;->c:Ljava/lang/Object;

    .line 29
    .line 30
    iget-wide v7, v5, La/mlr;->a:J

    .line 31
    .line 32
    iget-object v9, v5, La/mlr;->f:Ljava/lang/String;

    .line 33
    .line 34
    iget-wide v10, v5, La/mlr;->c:J

    .line 35
    .line 36
    iget-boolean v12, v5, La/mlr;->l:Z

    .line 37
    .line 38
    iget-wide v13, v5, La/mlr;->b:J

    .line 39
    .line 40
    iget-boolean v15, v5, La/mlr;->m:Z

    .line 41
    .line 42
    iget-boolean v4, v5, La/mlr;->n:Z

    .line 43
    .line 44
    const/16 v20, 0x0

    .line 45
    .line 46
    const/16 v22, 0x1

    .line 47
    .line 48
    const/16 v16, 0x0

    .line 49
    .line 50
    iget v6, v0, La/d5d;->b:I

    .line 51
    .line 52
    iget-boolean v0, v0, La/d5d;->c:Z

    .line 53
    .line 54
    move/from16 v19, v0

    .line 55
    .line 56
    move/from16 v18, v4

    .line 57
    .line 58
    move/from16 v17, v6

    .line 59
    .line 60
    invoke-static/range {v7 .. v22}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, La/c8d;

    .line 71
    .line 72
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 73
    .line 74
    if-nez v19, :cond_0

    .line 75
    .line 76
    iget-boolean v4, v5, La/mlr;->n:Z

    .line 77
    .line 78
    if-nez v4, :cond_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    move v2, v3

    .line 82
    :goto_0
    new-instance v3, La/v7d;

    .line 83
    .line 84
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 85
    .line 86
    .line 87
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 88
    .line 89
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_0
    check-cast v6, La/a4x;

    .line 93
    .line 94
    check-cast v5, La/bdz;

    .line 95
    .line 96
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 97
    .line 98
    move-object/from16 v1, p1

    .line 99
    .line 100
    check-cast v1, La/i8z;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance v7, La/rj50;

    .line 106
    .line 107
    const/16 v8, 0xf

    .line 108
    .line 109
    invoke-direct {v7, v8}, La/rj50;-><init>(B)V

    .line 110
    .line 111
    .line 112
    new-instance v8, La/cl2;

    .line 113
    .line 114
    const/4 v9, 0x7

    .line 115
    iget v10, v0, La/d5d;->b:I

    .line 116
    .line 117
    invoke-direct {v8, v10, v9}, La/cl2;-><init>(IB)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    move v10, v9

    .line 125
    new-instance v9, La/m160;

    .line 126
    .line 127
    invoke-direct {v9, v7, v6, v3}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 128
    .line 129
    .line 130
    move v11, v10

    .line 131
    new-instance v10, La/a8;

    .line 132
    .line 133
    const/16 v3, 0x12

    .line 134
    .line 135
    invoke-direct {v10, v8, v6, v3}, La/a8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 136
    .line 137
    .line 138
    move v12, v11

    .line 139
    new-instance v11, La/ap30;

    .line 140
    .line 141
    const/16 v3, 0x18

    .line 142
    .line 143
    invoke-direct {v11, v6, v3}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 144
    .line 145
    .line 146
    new-instance v3, La/vfe;

    .line 147
    .line 148
    const/4 v8, 0x2

    .line 149
    iget-boolean v7, v0, La/d5d;->c:Z

    .line 150
    .line 151
    move-object/from16 v23, v6

    .line 152
    .line 153
    move-object v6, v4

    .line 154
    move-object/from16 v4, v23

    .line 155
    .line 156
    invoke-direct/range {v3 .. v8}, La/vfe;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ZB)V

    .line 157
    .line 158
    .line 159
    move v8, v12

    .line 160
    new-instance v12, La/ugd;

    .line 161
    .line 162
    const v0, -0x73c450aa

    .line 163
    .line 164
    .line 165
    invoke-direct {v12, v0, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    move-object v7, v1

    .line 169
    invoke-virtual/range {v7 .. v12}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 170
    .line 171
    .line 172
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_1
    check-cast v6, Landroid/view/Window;

    .line 176
    .line 177
    check-cast v5, Landroid/app/Activity;

    .line 178
    .line 179
    move-object v8, v4

    .line 180
    check-cast v8, La/l7m0;

    .line 181
    .line 182
    move-object/from16 v1, p1

    .line 183
    .line 184
    check-cast v1, La/ilz;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v4, La/e5d;

    .line 190
    .line 191
    iget v7, v0, La/d5d;->b:I

    .line 192
    .line 193
    iget-boolean v9, v0, La/d5d;->c:Z

    .line 194
    .line 195
    move-object/from16 v23, v6

    .line 196
    .line 197
    move-object v6, v5

    .line 198
    move-object/from16 v5, v23

    .line 199
    .line 200
    invoke-direct/range {v4 .. v9}, La/e5d;-><init>(Landroid/view/Window;Landroid/app/Activity;ILa/l7m0;Z)V

    .line 201
    .line 202
    .line 203
    if-eqz v5, :cond_1

    .line 204
    .line 205
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-eqz v0, :cond_1

    .line 210
    .line 211
    invoke-virtual {v0, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 212
    .line 213
    .line 214
    :cond_1
    new-instance v0, La/f5d;

    .line 215
    .line 216
    invoke-direct {v0, v1, v5, v4, v3}, La/f5d;-><init>(La/ilz;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 217
    .line 218
    .line 219
    return-object v0

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
