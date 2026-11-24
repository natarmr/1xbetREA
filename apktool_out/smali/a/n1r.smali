.class public final La/n1r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zkz;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/sje;La/f390;La/fge0;La/mie0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/n1r;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/n1r;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/n1r;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/n1r;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, La/n1r;->e:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/e;Ljava/lang/String;La/k4r;La/glz;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/n1r;->a:B

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n1r;->e:Ljava/lang/Object;

    iput-object p2, p0, La/n1r;->b:Ljava/lang/Object;

    iput-object p3, p0, La/n1r;->c:Ljava/lang/Object;

    iput-object p4, p0, La/n1r;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final l(La/clz;La/kkz;)V
    .locals 9

    .line 1
    iget-byte v0, p0, La/n1r;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, La/rjv0;->a:[I

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    aget p2, v0, p2

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x1

    .line 16
    packed-switch p2, :pswitch_data_1

    .line 17
    .line 18
    .line 19
    invoke-static {}, La/t9f;->b()V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_6

    .line 23
    .line 24
    :pswitch_0
    iget-object p0, p0, La/n1r;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/fge0;

    .line 27
    .line 28
    invoke-virtual {p0}, La/fge0;->A()V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :pswitch_1
    iget-object p0, p0, La/n1r;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, La/fge0;

    .line 36
    .line 37
    iget-object p1, p0, La/fge0;->c:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter p1

    .line 40
    :try_start_0
    iput-boolean v1, p0, La/fge0;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    monitor-exit p1

    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p0, v0

    .line 47
    monitor-exit p1

    .line 48
    throw p0

    .line 49
    :pswitch_2
    iget-object p1, p0, La/n1r;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, La/f390;

    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    iget-object p1, p1, La/f390;->b:La/o24;

    .line 57
    .line 58
    iget-object v2, p1, La/o24;->b:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v2

    .line 61
    :try_start_1
    iget-object v3, p1, La/o24;->b:Ljava/lang/Object;

    .line 62
    .line 63
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    :try_start_2
    iget-boolean v4, p1, La/o24;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 65
    .line 66
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    if-eqz v4, :cond_0

    .line 68
    .line 69
    :goto_0
    monitor-exit v2

    .line 70
    goto :goto_3

    .line 71
    :cond_0
    :try_start_4
    iget-object v3, p1, La/o24;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Ljava/util/ArrayList;

    .line 74
    .line 75
    iget-object v4, p1, La/o24;->d:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v4, Ljava/util/ArrayList;

    .line 78
    .line 79
    iput-object v4, p1, La/o24;->c:Ljava/lang/Object;

    .line 80
    .line 81
    iput-object v3, p1, La/o24;->d:Ljava/lang/Object;

    .line 82
    .line 83
    iput-boolean v1, p1, La/o24;->a:Z

    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    move v1, p2

    .line 90
    :goto_1
    if-ge v1, p1, :cond_1

    .line 91
    .line 92
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, La/yje;

    .line 97
    .line 98
    sget-object v5, La/j0g0;->b:La/e0g0;

    .line 99
    .line 100
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    invoke-interface {v4, v5}, La/yje;->resumeWith(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :catchall_1
    move-exception v0

    .line 109
    move-object p0, v0

    .line 110
    goto :goto_2

    .line 111
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :catchall_2
    move-exception v0

    .line 116
    move-object p0, v0

    .line 117
    monitor-exit v3

    .line 118
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 119
    :goto_2
    monitor-exit v2

    .line 120
    throw p0

    .line 121
    :cond_2
    :goto_3
    iget-object p0, p0, La/n1r;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, La/fge0;

    .line 124
    .line 125
    iget-object p1, p0, La/fge0;->c:Ljava/lang/Object;

    .line 126
    .line 127
    monitor-enter p1

    .line 128
    :try_start_5
    iget-boolean v1, p0, La/fge0;->t:Z

    .line 129
    .line 130
    if-eqz v1, :cond_3

    .line 131
    .line 132
    iput-boolean p2, p0, La/fge0;->t:Z

    .line 133
    .line 134
    invoke-virtual {p0}, La/fge0;->C()La/m5a;

    .line 135
    .line 136
    .line 137
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 138
    goto :goto_4

    .line 139
    :catchall_3
    move-exception v0

    .line 140
    move-object p0, v0

    .line 141
    goto :goto_5

    .line 142
    :cond_3
    :goto_4
    monitor-exit p1

    .line 143
    if-eqz v0, :cond_4

    .line 144
    .line 145
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    check-cast v0, La/n5a;

    .line 150
    .line 151
    invoke-virtual {v0, p0}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_6

    .line 155
    :goto_5
    monitor-exit p1

    .line 156
    throw p0

    .line 157
    :pswitch_3
    iget-object p2, p0, La/n1r;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p2, La/sje;

    .line 160
    .line 161
    sget-object v2, La/yne;->d:La/yne;

    .line 162
    .line 163
    new-instance v3, La/e0r0;

    .line 164
    .line 165
    iget-object v4, p0, La/n1r;->e:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v4, La/mie0;

    .line 168
    .line 169
    iget-object v5, p0, La/n1r;->d:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v5, La/fge0;

    .line 172
    .line 173
    const/4 v8, 0x0

    .line 174
    move-object v7, p0

    .line 175
    move-object v6, p1

    .line 176
    invoke-direct/range {v3 .. v8}, La/e0r0;-><init>(La/mie0;La/fge0;La/clz;La/n1r;La/yje;)V

    .line 177
    .line 178
    .line 179
    invoke-static {p2, v0, v2, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 180
    .line 181
    .line 182
    :cond_4
    :goto_6
    :pswitch_4
    return-void

    .line 183
    :pswitch_5
    move-object v7, p0

    .line 184
    iget-object p0, v7, La/n1r;->e:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p0, Landroidx/fragment/app/e;

    .line 187
    .line 188
    iget-object p1, v7, La/n1r;->b:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p1, Ljava/lang/String;

    .line 191
    .line 192
    sget-object v0, La/kkz;->ON_START:La/kkz;

    .line 193
    .line 194
    if-ne p2, v0, :cond_5

    .line 195
    .line 196
    iget-object v0, p0, Landroidx/fragment/app/e;->m:Ljava/util/Map;

    .line 197
    .line 198
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Landroid/os/Bundle;

    .line 203
    .line 204
    if-eqz v0, :cond_5

    .line 205
    .line 206
    iget-object v1, v7, La/n1r;->c:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, La/k4r;

    .line 209
    .line 210
    invoke-interface {v1, v0, p1}, La/k4r;->i(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, p1}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_5
    sget-object v0, La/kkz;->ON_DESTROY:La/kkz;

    .line 217
    .line 218
    if-ne p2, v0, :cond_6

    .line 219
    .line 220
    iget-object p2, v7, La/n1r;->d:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast p2, La/glz;

    .line 223
    .line 224
    invoke-virtual {p2, v7}, La/glz;->f(La/blz;)V

    .line 225
    .line 226
    .line 227
    iget-object p0, p0, Landroidx/fragment/app/e;->n:Ljava/util/Map;

    .line 228
    .line 229
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    :cond_6
    return-void

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
    .end packed-switch

    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method
