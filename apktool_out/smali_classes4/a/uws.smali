.class public final synthetic La/uws;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wws;


# direct methods
.method public synthetic constructor <init>(La/wws;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uws;->a:B

    iput-object p1, p0, La/uws;->b:La/wws;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/uws;->a:B

    .line 2
    .line 3
    const-string v1, "game_screen"

    .line 4
    .line 5
    const-string v2, "screen"

    .line 6
    .line 7
    iget-object p0, p0, La/uws;->b:La/wws;

    .line 8
    .line 9
    check-cast p1, Landroid/view/View;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wws;->S1:La/pek;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/wws;->H0()La/yys;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object p1, La/gl90;->c:La/gl90;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, La/yys;->E(La/gl90;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, La/yys;->c:La/ali;

    .line 29
    .line 30
    iget-object p0, p0, La/yys;->B:La/p7m0;

    .line 31
    .line 32
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, La/ixs;

    .line 37
    .line 38
    iget-object p0, p0, La/ixs;->p:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v0, p1, La/ali;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, La/oeg0;

    .line 43
    .line 44
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, La/f5p;

    .line 49
    .line 50
    const/16 v2, 0x1a

    .line 51
    .line 52
    invoke-direct {v1, p1, p0, v2}, La/f5p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_0
    sget-object v0, La/wws;->S1:La/pek;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, La/wws;->H0()La/yys;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    sget-object p1, La/gl90;->b:La/gl90;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/yys;->E(La/gl90;)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, La/yys;->c:La/ali;

    .line 76
    .line 77
    iget-object p1, p0, La/ali;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, La/oeg0;

    .line 80
    .line 81
    invoke-virtual {p1}, La/oeg0;->c()La/i1w0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v0, La/g7p;

    .line 86
    .line 87
    const/16 v1, 0x12

    .line 88
    .line 89
    invoke-direct {v0, p0, v1}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_1
    sget-object v0, La/wws;->S1:La/pek;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, La/wws;->H0()La/yys;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    iget-object p1, p0, La/yys;->u:La/bn6;

    .line 108
    .line 109
    iget-object p1, p1, La/bn6;->b:La/kt2;

    .line 110
    .line 111
    const-string v0, "reg_page_call"

    .line 112
    .line 113
    invoke-static {v2, v1, p1, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, La/yys;->s:La/s64;

    .line 117
    .line 118
    sget-object v0, La/y1p;->t1:La/y1p;

    .line 119
    .line 120
    iget-object v1, p0, La/yys;->t:La/cmt;

    .line 121
    .line 122
    invoke-virtual {v1}, La/cmt;->g()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {p1, v0, v1}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    sget-object v3, La/vys;->a:La/vys;

    .line 134
    .line 135
    iget-object p1, p0, La/yys;->p:La/mne;

    .line 136
    .line 137
    iget-object v5, p1, La/mne;->c:La/vs10;

    .line 138
    .line 139
    new-instance v6, La/cin;

    .line 140
    .line 141
    const/4 p1, 0x0

    .line 142
    const/16 v0, 0xb

    .line 143
    .line 144
    invoke-direct {v6, p0, p1, v0}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 145
    .line 146
    .line 147
    const/16 v7, 0xa

    .line 148
    .line 149
    const/4 v4, 0x0

    .line 150
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 151
    .line 152
    .line 153
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_2
    sget-object v0, La/wws;->S1:La/pek;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, La/wws;->H0()La/yys;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    iget-object p1, p0, La/yys;->u:La/bn6;

    .line 166
    .line 167
    iget-object p1, p1, La/bn6;->b:La/kt2;

    .line 168
    .line 169
    const-string v0, "login_page_call"

    .line 170
    .line 171
    invoke-static {v2, v1, p1, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, p0, La/yys;->s:La/s64;

    .line 175
    .line 176
    sget-object v0, La/y1p;->b:La/y1p;

    .line 177
    .line 178
    invoke-virtual {p1, v1}, La/s64;->c(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    iget-object p0, p0, La/yys;->c:La/ali;

    .line 182
    .line 183
    iget-object p0, p0, La/ali;->a:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p0, La/oeg0;

    .line 186
    .line 187
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    new-instance v0, La/c8d;

    .line 196
    .line 197
    sget-object v1, La/y7d;->a:La/v7d;

    .line 198
    .line 199
    sget-object v2, La/n0w0;->a:La/n0w0;

    .line 200
    .line 201
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 202
    .line 203
    .line 204
    invoke-static {p1, v0}, La/rz4;->g(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;)La/y9v0;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    sget-object v1, La/wez;->b:La/wez;

    .line 209
    .line 210
    const/4 v2, 0x0

    .line 211
    invoke-static {v1, v0, p0, p1, v2}, La/rz4;->p(La/wez;La/y9v0;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    :goto_0
    move-object v0, p1

    .line 216
    check-cast v0, La/paw;

    .line 217
    .line 218
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_0

    .line 223
    .line 224
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, La/oe50;

    .line 229
    .line 230
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 231
    .line 232
    .line 233
    goto :goto_0

    .line 234
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object p0

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
