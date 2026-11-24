.class public final La/na6;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public j:La/qz40;

.field public k:La/xoa0;

.field public l:J

.field public m:B

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:La/vne;

.field public final synthetic p:La/bxq0;


# direct methods
.method public constructor <init>(La/vne;La/bxq0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/na6;->o:La/vne;

    .line 2
    .line 3
    iput-object p2, p0, La/na6;->p:La/bxq0;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/zzf0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/na6;

    .line 2
    .line 3
    iget-object v1, p0, La/na6;->o:La/vne;

    .line 4
    .line 5
    iget-object p0, p0, La/na6;->p:La/bxq0;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, La/na6;-><init>(La/vne;La/bxq0;La/yje;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, La/na6;->n:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/inn0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/na6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/na6;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/na6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/na6;->m:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v5, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v4, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, La/na6;->n:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/qz40;

    .line 21
    .line 22
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v6

    .line 36
    :cond_1
    iget-object v1, p0, La/na6;->k:La/xoa0;

    .line 37
    .line 38
    iget-object v2, p0, La/na6;->j:La/qz40;

    .line 39
    .line 40
    iget-object v3, p0, La/na6;->n:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, La/inn0;

    .line 43
    .line 44
    :try_start_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catch La/yoa0; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :catchall_1
    move-exception p1

    .line 50
    move-object p0, v2

    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :catch_0
    move-object v9, v1

    .line 54
    move-object v1, v2

    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_2
    iget-wide v7, p0, La/na6;->l:J

    .line 58
    .line 59
    iget-object v1, p0, La/na6;->k:La/xoa0;

    .line 60
    .line 61
    iget-object v9, p0, La/na6;->j:La/qz40;

    .line 62
    .line 63
    iget-object v10, p0, La/na6;->n:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v10, La/inn0;

    .line 66
    .line 67
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object v11, v9

    .line 71
    move-object v9, v1

    .line 72
    move-object v1, v11

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, La/na6;->n:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, La/inn0;

    .line 80
    .line 81
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p1}, La/inn0;->e()La/wgu0;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-interface {v7}, La/wgu0;->c()J

    .line 92
    .line 93
    .line 94
    move-result-wide v7

    .line 95
    sget-object v9, La/xoa0;->a:La/xoa0;

    .line 96
    .line 97
    iput-object p1, p0, La/na6;->n:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v1, p0, La/na6;->j:La/qz40;

    .line 100
    .line 101
    iput-object v9, p0, La/na6;->k:La/xoa0;

    .line 102
    .line 103
    iput-wide v7, p0, La/na6;->l:J

    .line 104
    .line 105
    iput-byte v5, p0, La/na6;->m:B

    .line 106
    .line 107
    invoke-static {p1, v2, p0, v5}, La/tto0;->b(La/inn0;ZLa/yje;I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    if-ne v10, v0, :cond_4

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    move-object v11, v10

    .line 115
    move-object v10, p1

    .line 116
    move-object p1, v11

    .line 117
    :goto_0
    check-cast p1, La/dpa0;

    .line 118
    .line 119
    iget p1, p1, La/dpa0;->i:I

    .line 120
    .line 121
    if-ne p1, v5, :cond_5

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    if-ne p1, v4, :cond_9

    .line 125
    .line 126
    :goto_1
    :try_start_2
    new-instance p1, La/ma6;

    .line 127
    .line 128
    invoke-direct {p1, v9, v6, v2}, La/ma6;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 129
    .line 130
    .line 131
    iput-object v10, p0, La/na6;->n:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object v1, p0, La/na6;->j:La/qz40;

    .line 134
    .line 135
    iput-object v9, p0, La/na6;->k:La/xoa0;

    .line 136
    .line 137
    iput-byte v3, p0, La/na6;->m:B

    .line 138
    .line 139
    invoke-virtual {v10, v7, v8, p1, p0}, La/inn0;->g(JLkotlin/jvm/functions/Function2;La/zw5;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0
    :try_end_2
    .catch La/yoa0; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 143
    if-ne p0, v0, :cond_6

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    move-object v2, v1

    .line 147
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 148
    .line 149
    check-cast v2, La/p7m0;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v6, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_7

    .line 158
    :catchall_2
    move-exception p1

    .line 159
    move-object p0, v1

    .line 160
    goto :goto_6

    .line 161
    :catch_1
    move-object v3, v10

    .line 162
    :goto_3
    :try_start_3
    iget-object p1, p0, La/na6;->o:La/vne;

    .line 163
    .line 164
    sget-object v2, La/yne;->d:La/yne;

    .line 165
    .line 166
    new-instance v7, La/ex1;

    .line 167
    .line 168
    iget-object v8, p0, La/na6;->p:La/bxq0;

    .line 169
    .line 170
    const/16 v10, 0x8

    .line 171
    .line 172
    invoke-direct {v7, v1, v8, v6, v10}, La/ex1;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 173
    .line 174
    .line 175
    invoke-static {p1, v6, v2, v7, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 176
    .line 177
    .line 178
    iput-object v1, p0, La/na6;->n:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v6, p0, La/na6;->j:La/qz40;

    .line 181
    .line 182
    iput-object v6, p0, La/na6;->k:La/xoa0;

    .line 183
    .line 184
    iput-byte v4, p0, La/na6;->m:B

    .line 185
    .line 186
    invoke-static {v3, v9, p0}, La/tto0;->i(La/inn0;La/xoa0;La/zw5;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 190
    if-ne p1, v0, :cond_7

    .line 191
    .line 192
    :goto_4
    return-object v0

    .line 193
    :cond_7
    move-object p0, v1

    .line 194
    :goto_5
    :try_start_4
    check-cast p1, La/dpa0;

    .line 195
    .line 196
    if-eqz p1, :cond_8

    .line 197
    .line 198
    invoke-virtual {p1}, La/dpa0;->a()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 199
    .line 200
    .line 201
    :cond_8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 202
    .line 203
    check-cast p0, La/p7m0;

    .line 204
    .line 205
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, v6, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_7

    .line 212
    :goto_6
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 213
    .line 214
    check-cast p0, La/p7m0;

    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v6, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    throw p1

    .line 223
    :cond_9
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object p0
.end method
