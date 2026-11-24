.class public final La/lvv0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/mvv0;ZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/lvv0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/lvv0;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p2, p0, La/lvv0;->j:Z

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(La/n2w0;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/lvv0;->i:B

    .line 13
    iput-object p1, p0, La/lvv0;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/lvv0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/lvv0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/lvv0;

    .line 9
    .line 10
    check-cast v0, La/n2w0;

    .line 11
    .line 12
    invoke-direct {p0, v0, p2}, La/lvv0;-><init>(La/n2w0;La/yje;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p1, La/lvv0;

    .line 17
    .line 18
    check-cast v0, La/mvv0;

    .line 19
    .line 20
    iget-boolean p0, p0, La/lvv0;->j:Z

    .line 21
    .line 22
    invoke-direct {p1, v0, p0, p2}, La/lvv0;-><init>(La/mvv0;ZLa/yje;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lvv0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/lvv0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lvv0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lvv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/lvv0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/lvv0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/lvv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/lvv0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/lvv0;->k:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, La/n2w0;

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v4, p0, La/lvv0;->j:Z

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    if-ne v4, v1, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v2, La/n2w0;->g2:La/mne;

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 38
    .line 39
    new-instance v4, La/wup0;

    .line 40
    .line 41
    const/16 v5, 0x16

    .line 42
    .line 43
    invoke-direct {v4, v2, v3, v5}, La/wup0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 44
    .line 45
    .line 46
    iput-boolean v1, p0, La/lvv0;->j:Z

    .line 47
    .line 48
    invoke-static {p1, v4, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-ne p0, v0, :cond_2

    .line 53
    .line 54
    move-object v3, v0

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    :goto_1
    return-object v3

    .line 59
    :cond_3
    const-string p0, "coroutineDispatchers"

    .line 60
    .line 61
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v3

    .line 65
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 66
    .line 67
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    check-cast v2, La/mvv0;

    .line 71
    .line 72
    iget-object p1, v2, La/mvv0;->b:La/jvv0;

    .line 73
    .line 74
    iget-object v0, p1, La/jvv0;->a:La/p7m0;

    .line 75
    .line 76
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/gvv0;

    .line 81
    .line 82
    iget-object v0, v0, La/gvv0;->a:Ljava/util/Map;

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    goto/16 :goto_4

    .line 93
    .line 94
    :cond_4
    iget-object v0, v2, La/mvv0;->a:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 95
    .line 96
    iget-object v0, v0, La/zfd;->a:La/glz;

    .line 97
    .line 98
    iget-object v0, v0, La/glz;->i:La/lkz;

    .line 99
    .line 100
    sget-object v2, La/lkz;->e:La/lkz;

    .line 101
    .line 102
    if-eq v0, v2, :cond_5

    .line 103
    .line 104
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    goto/16 :goto_4

    .line 107
    .line 108
    :cond_5
    iget-boolean p0, p0, La/lvv0;->j:Z

    .line 109
    .line 110
    iget-object p1, p1, La/jvv0;->a:La/p7m0;

    .line 111
    .line 112
    :cond_6
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object v2, v0

    .line 117
    check-cast v2, La/gvv0;

    .line 118
    .line 119
    iget-object v4, v2, La/gvv0;->a:Ljava/util/Map;

    .line 120
    .line 121
    iget-object v5, v2, La/gvv0;->b:Ljava/util/Map;

    .line 122
    .line 123
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-eqz v4, :cond_7

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_7
    iget-object v4, v2, La/gvv0;->c:La/kvv0;

    .line 131
    .line 132
    if-eqz v4, :cond_8

    .line 133
    .line 134
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    check-cast v4, La/fvv0;

    .line 139
    .line 140
    if-eqz v4, :cond_8

    .line 141
    .line 142
    invoke-virtual {v4}, La/fvv0;->a()Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-ne v4, v1, :cond_8

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_8
    iget-object v4, v2, La/gvv0;->a:Ljava/util/Map;

    .line 150
    .line 151
    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    check-cast v4, Ljava/lang/Iterable;

    .line 156
    .line 157
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->N(Ljava/lang/Iterable;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-eqz v6, :cond_a

    .line 170
    .line 171
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    move-object v7, v6

    .line 176
    check-cast v7, La/kvv0;

    .line 177
    .line 178
    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    check-cast v7, La/fvv0;

    .line 183
    .line 184
    if-eqz v7, :cond_9

    .line 185
    .line 186
    invoke-virtual {v7}, La/fvv0;->a()Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-ne v7, v1, :cond_9

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_a
    move-object v6, v3

    .line 194
    :goto_2
    check-cast v6, La/kvv0;

    .line 195
    .line 196
    const/4 v4, 0x3

    .line 197
    if-nez v6, :cond_b

    .line 198
    .line 199
    invoke-static {v2, v3, v3, v3, v4}, La/gvv0;->a(La/gvv0;Ljava/util/Map;Ljava/util/Map;La/kvv0;I)La/gvv0;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    goto :goto_3

    .line 204
    :cond_b
    if-eqz p0, :cond_c

    .line 205
    .line 206
    invoke-static {v2, v3, v3, v6, v4}, La/gvv0;->a(La/gvv0;Ljava/util/Map;Ljava/util/Map;La/kvv0;I)La/gvv0;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    goto :goto_3

    .line 211
    :cond_c
    invoke-static {v2, v3, v3, v3, v4}, La/gvv0;->a(La/gvv0;Ljava/util/Map;Ljava/util/Map;La/kvv0;I)La/gvv0;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    :goto_3
    invoke-virtual {p1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_6

    .line 220
    .line 221
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    :goto_4
    return-object p0

    .line 224
    nop

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
