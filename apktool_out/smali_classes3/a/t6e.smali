.class public final synthetic La/t6e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/e7e;


# direct methods
.method public synthetic constructor <init>(La/e7e;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t6e;->a:B

    iput-object p1, p0, La/t6e;->b:La/e7e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    .line 1
    iget-byte p1, p0, La/t6e;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object p0, p0, La/t6e;->b:La/e7e;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object p1, La/e7e;->d2:La/kwd;

    .line 12
    .line 13
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v3, La/z6e;

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    const/16 v10, 0x8

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    const-class v6, La/fae;

    .line 28
    .line 29
    const-string v7, "handleError"

    .line 30
    .line 31
    const-string v8, "handleError(Ljava/lang/Throwable;)V"

    .line 32
    .line 33
    invoke-direct/range {v3 .. v10}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 34
    .line 35
    .line 36
    new-instance v10, La/z9e;

    .line 37
    .line 38
    invoke-direct {v10, v5, v1, v2}, La/z9e;-><init>(La/fae;La/yje;B)V

    .line 39
    .line 40
    .line 41
    const/16 v11, 0xe

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    move-object v6, p0

    .line 46
    move-object v7, v3

    .line 47
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_0
    sget-object p1, La/e7e;->d2:La/kwd;

    .line 52
    .line 53
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget-object p1, p0, La/fae;->B:La/ol60;

    .line 58
    .line 59
    iget-object p0, p0, La/fae;->A:La/zj2;

    .line 60
    .line 61
    invoke-virtual {p0}, La/zj2;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/f9e;

    .line 66
    .line 67
    instance-of v0, p0, La/d9e;

    .line 68
    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    check-cast p0, La/d9e;

    .line 72
    .line 73
    iget-object p0, p0, La/d9e;->a:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    const/16 v0, 0xa

    .line 80
    .line 81
    if-lt p0, v0, :cond_0

    .line 82
    .line 83
    new-instance p0, La/n6e;

    .line 84
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    sget-object p0, La/g6e;->a:La/g6e;

    .line 93
    .line 94
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :goto_0
    return-void

    .line 98
    :pswitch_1
    sget-object p1, La/e7e;->d2:La/kwd;

    .line 99
    .line 100
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    iget-object p0, p0, La/fae;->A:La/zj2;

    .line 105
    .line 106
    sget-object p1, La/e9e;->a:La/e9e;

    .line 107
    .line 108
    invoke-virtual {p0, p1}, La/zj2;->f(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_2
    sget-object p1, La/e7e;->d2:La/kwd;

    .line 113
    .line 114
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iget-object p1, p0, La/fae;->v:La/yxb;

    .line 119
    .line 120
    iget-object v3, p0, La/fae;->O:Ljava/lang/Integer;

    .line 121
    .line 122
    if-eqz v3, :cond_1

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-virtual {p0, v3}, La/fae;->B(I)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_3

    .line 133
    .line 134
    new-instance v4, La/x9c;

    .line 135
    .line 136
    const/4 v5, 0x2

    .line 137
    invoke-direct {v4, p0, v3, v5}, La/x9c;-><init>(Ljava/lang/Object;IB)V

    .line 138
    .line 139
    .line 140
    iput-boolean v0, p1, La/yxb;->C:Z

    .line 141
    .line 142
    new-instance v0, La/bh1;

    .line 143
    .line 144
    invoke-direct {v0, p1, v3, v4, v2}, La/bh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, La/bh1;->invoke()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    iput-object v0, p1, La/yxb;->s:Lkotlin/jvm/functions/Function0;

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_1
    iget-boolean v3, p1, La/yxb;->B:Z

    .line 154
    .line 155
    if-nez v3, :cond_2

    .line 156
    .line 157
    iput-boolean v0, p1, La/yxb;->C:Z

    .line 158
    .line 159
    new-instance v0, La/hxb;

    .line 160
    .line 161
    invoke-direct {v0, p1, v2}, La/hxb;-><init>(La/yxb;B)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, La/hxb;->invoke()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    iput-object v0, p1, La/yxb;->s:Lkotlin/jvm/functions/Function0;

    .line 168
    .line 169
    :cond_2
    iget-boolean v0, p1, La/yxb;->B:Z

    .line 170
    .line 171
    if-eqz v0, :cond_3

    .line 172
    .line 173
    iget-object p1, p1, La/yxb;->t:La/w8e;

    .line 174
    .line 175
    if-eqz p1, :cond_3

    .line 176
    .line 177
    invoke-virtual {p1}, La/w8e;->invoke()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    :cond_3
    :goto_1
    iput-object v1, p0, La/fae;->O:Ljava/lang/Integer;

    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_3
    sget-object p1, La/e7e;->d2:La/kwd;

    .line 184
    .line 185
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    iget-object p0, p0, La/fae;->b:La/i1w0;

    .line 190
    .line 191
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    new-instance v1, La/c8d;

    .line 196
    .line 197
    sget-object v2, La/y7d;->a:La/v7d;

    .line 198
    .line 199
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 200
    .line 201
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 202
    .line 203
    .line 204
    invoke-static {p1, v1, p0, p1, v0}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    :goto_2
    move-object v0, p1

    .line 209
    check-cast v0, La/paw;

    .line 210
    .line 211
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v1, :cond_4

    .line 216
    .line 217
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, La/oe50;

    .line 222
    .line 223
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_4
    return-void

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
