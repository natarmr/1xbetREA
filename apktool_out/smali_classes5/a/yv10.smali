.class public final synthetic La/yv10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dw10;


# direct methods
.method public synthetic constructor <init>(La/dw10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yv10;->a:B

    iput-object p1, p0, La/yv10;->b:La/dw10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 13

    .line 1
    iget-byte v0, p0, La/yv10;->a:B

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/yv10;->b:La/dw10;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/dw10;->V1:La/uuz;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string p2, "NEGATIVE_CLICK_REQUEST_KEY"

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, La/dw10;->I0()La/cx10;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object p1, v6, La/cx10;->f:La/mne;

    .line 34
    .line 35
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 36
    .line 37
    new-instance v4, La/pf10;

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    const/16 v11, 0x1b

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    const-class v7, La/cx10;

    .line 44
    .line 45
    const-string v8, "handleError"

    .line 46
    .line 47
    const-string v9, "handleError(Ljava/lang/Throwable;)V"

    .line 48
    .line 49
    invoke-direct/range {v4 .. v11}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 50
    .line 51
    .line 52
    new-instance v11, La/xw10;

    .line 53
    .line 54
    invoke-direct {v11, v6, v3, v2}, La/xw10;-><init>(La/cx10;La/yje;B)V

    .line 55
    .line 56
    .line 57
    const/16 v12, 0xa

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    move-object v7, p0

    .line 61
    move-object v10, p1

    .line 62
    move-object v8, v4

    .line 63
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_0
    const-string p2, "CHANGE_BALANCE_REQUEST_KEY"

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 74
    .line 75
    if-lt v0, v1, :cond_1

    .line 76
    .line 77
    invoke-static {p1}, La/c7;->C(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    const-string v0, "GET_BALANCE_REQUEST_KEY"

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    instance-of v0, p1, La/ql5;

    .line 89
    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    move-object p1, v3

    .line 93
    :cond_2
    check-cast p1, La/ql5;

    .line 94
    .line 95
    :goto_0
    check-cast p1, La/ql5;

    .line 96
    .line 97
    invoke-virtual {p0}, La/dw10;->I0()La/cx10;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-nez p1, :cond_3

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    sget-object v5, La/sw10;->a:La/sw10;

    .line 109
    .line 110
    new-instance v8, La/tw10;

    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    invoke-direct {v8, v0, p1, v3, v1}, La/tw10;-><init>(La/cx10;La/ql5;La/yje;B)V

    .line 114
    .line 115
    .line 116
    const/16 v9, 0xe

    .line 117
    .line 118
    const/4 v6, 0x0

    .line 119
    const/4 v7, 0x0

    .line 120
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 121
    .line 122
    .line 123
    :goto_1
    invoke-virtual {p0}, La/dw10;->I0()La/cx10;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    iget-object p0, p0, La/cx10;->s:La/zlt0;

    .line 128
    .line 129
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p0, La/vlk;

    .line 132
    .line 133
    iget-object p0, p0, La/vlk;->a:La/vwb0;

    .line 134
    .line 135
    const-string p1, "changeBalance"

    .line 136
    .line 137
    invoke-virtual {p0, p1, p2}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 138
    .line 139
    .line 140
    :goto_2
    return-void

    .line 141
    :pswitch_0
    sget-object v0, La/dw10;->V1:La/uuz;

    .line 142
    .line 143
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const-string v0, "SELECT_BALANCE_REQUEST_KEY"

    .line 147
    .line 148
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-nez p2, :cond_4

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_4
    const-string p2, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 156
    .line 157
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_8

    .line 162
    .line 163
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 164
    .line 165
    if-lt v0, v1, :cond_5

    .line 166
    .line 167
    invoke-static {p1}, La/c7;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    goto :goto_3

    .line 172
    :cond_5
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    instance-of p2, p1, La/ql5;

    .line 177
    .line 178
    if-nez p2, :cond_6

    .line 179
    .line 180
    move-object p1, v3

    .line 181
    :cond_6
    check-cast p1, La/ql5;

    .line 182
    .line 183
    :goto_3
    check-cast p1, La/ql5;

    .line 184
    .line 185
    invoke-virtual {p0}, La/dw10;->I0()La/cx10;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    if-nez p1, :cond_7

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_7
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    iget-object p2, v6, La/cx10;->f:La/mne;

    .line 197
    .line 198
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 199
    .line 200
    new-instance v4, La/pf10;

    .line 201
    .line 202
    const/4 v10, 0x0

    .line 203
    const/16 v11, 0x1a

    .line 204
    .line 205
    const/4 v5, 0x1

    .line 206
    const-class v7, La/cx10;

    .line 207
    .line 208
    const-string v8, "handleError"

    .line 209
    .line 210
    const-string v9, "handleError(Ljava/lang/Throwable;)V"

    .line 211
    .line 212
    invoke-direct/range {v4 .. v11}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 213
    .line 214
    .line 215
    new-instance v11, La/tw10;

    .line 216
    .line 217
    invoke-direct {v11, v6, p1, v3, v2}, La/tw10;-><init>(La/cx10;La/ql5;La/yje;B)V

    .line 218
    .line 219
    .line 220
    const/16 v12, 0xa

    .line 221
    .line 222
    const/4 v9, 0x0

    .line 223
    move-object v7, p0

    .line 224
    move-object v10, p2

    .line 225
    move-object v8, v4

    .line 226
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 227
    .line 228
    .line 229
    :cond_8
    :goto_4
    return-void

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
