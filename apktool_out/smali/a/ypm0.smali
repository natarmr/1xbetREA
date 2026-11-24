.class public final La/ypm0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/xpm0;

.field public j:Ljava/lang/Object;

.field public k:La/aqm0;

.field public l:B

.field public final synthetic m:Ljava/util/ArrayList;

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:La/odd;

.field public final synthetic q:La/aqm0;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;IILa/odd;La/aqm0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ypm0;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput p2, p0, La/ypm0;->n:I

    .line 4
    .line 5
    iput p3, p0, La/ypm0;->o:I

    .line 6
    .line 7
    iput-object p4, p0, La/ypm0;->p:La/odd;

    .line 8
    .line 9
    iput-object p5, p0, La/ypm0;->q:La/aqm0;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/ypm0;

    .line 2
    .line 3
    iget-object v4, p0, La/ypm0;->p:La/odd;

    .line 4
    .line 5
    iget-object v5, p0, La/ypm0;->q:La/aqm0;

    .line 6
    .line 7
    iget-object v1, p0, La/ypm0;->m:Ljava/util/ArrayList;

    .line 8
    .line 9
    iget v2, p0, La/ypm0;->n:I

    .line 10
    .line 11
    iget v3, p0, La/ypm0;->o:I

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/ypm0;-><init>(Ljava/util/ArrayList;IILa/odd;La/aqm0;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/ypm0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ypm0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ypm0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/ypm0;->l:B

    .line 4
    .line 5
    const-string v2, "Required value was null."

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, La/ypm0;->q:La/aqm0;

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    if-eq v1, v5, :cond_2

    .line 16
    .line 17
    if-eq v1, v4, :cond_1

    .line 18
    .line 19
    if-ne v1, v3, :cond_0

    .line 20
    .line 21
    iget-object v6, p0, La/ypm0;->k:La/aqm0;

    .line 22
    .line 23
    iget-object v0, p0, La/ypm0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, La/i050;

    .line 26
    .line 27
    iget-object p0, p0, La/ypm0;->i:La/xpm0;

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object v2, v0

    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v7

    .line 41
    :cond_1
    iget-object v6, p0, La/ypm0;->k:La/aqm0;

    .line 42
    .line 43
    iget-object v0, p0, La/ypm0;->j:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, La/pot0;

    .line 46
    .line 47
    iget-object p0, p0, La/ypm0;->i:La/xpm0;

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v12, p0

    .line 53
    move-object/from16 p0, p1

    .line 54
    .line 55
    move-object v13, v0

    .line 56
    :goto_0
    move-object v10, v6

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    iget-object v1, p0, La/ypm0;->j:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, La/pot0;

    .line 61
    .line 62
    iget-object v5, p0, La/ypm0;->i:La/xpm0;

    .line 63
    .line 64
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object v8, v1

    .line 68
    move-object v1, v5

    .line 69
    move-object/from16 v5, p1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, La/xpm0;

    .line 76
    .line 77
    iget v8, p0, La/ypm0;->o:I

    .line 78
    .line 79
    iget-object v9, p0, La/ypm0;->p:La/odd;

    .line 80
    .line 81
    iget-object v10, p0, La/ypm0;->m:Ljava/util/ArrayList;

    .line 82
    .line 83
    iget v11, p0, La/ypm0;->n:I

    .line 84
    .line 85
    invoke-direct {v1, v10, v11, v8, v9}, La/xpm0;-><init>(Ljava/util/ArrayList;IILa/odd;)V

    .line 86
    .line 87
    .line 88
    iget-object v8, v6, La/aqm0;->d:La/pot0;

    .line 89
    .line 90
    if-eqz v8, :cond_8

    .line 91
    .line 92
    iput-object v1, p0, La/ypm0;->i:La/xpm0;

    .line 93
    .line 94
    iput-object v8, p0, La/ypm0;->j:Ljava/lang/Object;

    .line 95
    .line 96
    iput-byte v5, p0, La/ypm0;->l:B

    .line 97
    .line 98
    invoke-interface {v8, p0}, La/pot0;->k(La/bnn0;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    if-ne v5, v0, :cond_4

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    :goto_1
    check-cast v5, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_8

    .line 112
    .line 113
    if-eqz v8, :cond_7

    .line 114
    .line 115
    iput-object v1, p0, La/ypm0;->i:La/xpm0;

    .line 116
    .line 117
    iput-object v8, p0, La/ypm0;->j:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v6, p0, La/ypm0;->k:La/aqm0;

    .line 120
    .line 121
    iput-byte v4, p0, La/ypm0;->l:B

    .line 122
    .line 123
    invoke-virtual {v6, v1, v8, p0}, La/aqm0;->a(La/xpm0;La/pot0;La/zje;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    if-ne p0, v0, :cond_5

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_5
    move-object v12, v1

    .line 131
    move-object v13, v8

    .line 132
    goto :goto_0

    .line 133
    :goto_2
    move-object v11, p0

    .line 134
    check-cast v11, La/jzj;

    .line 135
    .line 136
    if-eqz v13, :cond_6

    .line 137
    .line 138
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance v9, La/l0i0;

    .line 142
    .line 143
    const/4 v14, 0x5

    .line 144
    invoke-direct/range {v9 .. v14}, La/l0i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v11, v9}, La/bby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 148
    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_6
    invoke-static {v2}, La/jf4;->o(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v7

    .line 155
    :cond_7
    invoke-static {v2}, La/jf4;->o(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v7

    .line 159
    :cond_8
    iget-object v2, v6, La/aqm0;->c:La/k050;

    .line 160
    .line 161
    iput-object v1, p0, La/ypm0;->i:La/xpm0;

    .line 162
    .line 163
    iput-object v2, p0, La/ypm0;->j:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object v6, p0, La/ypm0;->k:La/aqm0;

    .line 166
    .line 167
    iput-byte v3, p0, La/ypm0;->l:B

    .line 168
    .line 169
    invoke-virtual {v2, p0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    if-ne p0, v0, :cond_9

    .line 174
    .line 175
    :goto_3
    return-object v0

    .line 176
    :cond_9
    move-object p0, v1

    .line 177
    :goto_4
    :try_start_0
    iget-object v0, v6, La/aqm0;->e:Ljava/util/LinkedList;

    .line 178
    .line 179
    invoke-virtual {v0, p0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    .line 181
    .line 182
    invoke-interface {v2, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    const-string v0, "CXCP"

    .line 186
    .line 187
    invoke-static {v0}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_a

    .line 192
    .line 193
    new-instance v1, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    const-string v2, "StillCaptureRequestControl: useCaseCamera is null, "

    .line 196
    .line 197
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string p0, " will be retried with a future UseCaseCamera"

    .line 204
    .line 205
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    :cond_a
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object p0

    .line 218
    :catchall_0
    move-exception v0

    .line 219
    move-object p0, v0

    .line 220
    invoke-interface {v2, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    throw p0
.end method
