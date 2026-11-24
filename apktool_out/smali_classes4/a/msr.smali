.class public final synthetic La/msr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wzs;


# direct methods
.method public synthetic constructor <init>(La/wzs;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/msr;->a:B

    iput-object p1, p0, La/msr;->b:La/wzs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/msr;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/msr;->b:La/wzs;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, La/tzs;->a:La/tzs;

    .line 21
    .line 22
    iget-object v1, v0, La/wzs;->m:La/mne;

    .line 23
    .line 24
    iget-object v6, v1, La/mne;->a:La/rwj;

    .line 25
    .line 26
    new-instance v7, La/mzs;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v7, v0, v2, v1}, La/mzs;-><init>(La/wzs;La/yje;B)V

    .line 30
    .line 31
    .line 32
    const/16 v8, 0xa

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 40
    .line 41
    iget-object v1, v0, La/wzs;->u:La/p7m0;

    .line 42
    .line 43
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    move-object v4, v3

    .line 48
    check-cast v4, La/czs;

    .line 49
    .line 50
    const/16 v20, 0x0

    .line 51
    .line 52
    const v21, 0xbfff

    .line 53
    .line 54
    .line 55
    const-wide/16 v5, 0x0

    .line 56
    .line 57
    const-wide/16 v7, 0x0

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    const-wide/16 v10, 0x0

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    const/4 v13, 0x0

    .line 64
    const/4 v14, 0x0

    .line 65
    const/4 v15, 0x0

    .line 66
    const/16 v16, 0x0

    .line 67
    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    const/16 v19, 0x0

    .line 73
    .line 74
    invoke-static/range {v4 .. v21}, La/czs;->a(La/czs;JJLjava/lang/String;JLjava/lang/String;ZZZZZZZLjava/lang/String;I)La/czs;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_0

    .line 83
    .line 84
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    sget-object v5, La/szs;->a:La/szs;

    .line 89
    .line 90
    iget-object v1, v0, La/wzs;->m:La/mne;

    .line 91
    .line 92
    iget-object v7, v1, La/mne;->a:La/rwj;

    .line 93
    .line 94
    new-instance v8, La/mzs;

    .line 95
    .line 96
    const/4 v1, 0x1

    .line 97
    invoke-direct {v8, v0, v2, v1}, La/mzs;-><init>(La/wzs;La/yje;B)V

    .line 98
    .line 99
    .line 100
    const/16 v9, 0xa

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_1
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 108
    .line 109
    iget-object v1, v0, La/wzs;->u:La/p7m0;

    .line 110
    .line 111
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, La/czs;

    .line 116
    .line 117
    iget-boolean v2, v2, La/czs;->f:Z

    .line 118
    .line 119
    if-eqz v2, :cond_2

    .line 120
    .line 121
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    move-object v3, v2

    .line 126
    check-cast v3, La/czs;

    .line 127
    .line 128
    const/16 v19, 0x0

    .line 129
    .line 130
    const v20, 0xff9f

    .line 131
    .line 132
    .line 133
    const-wide/16 v4, 0x0

    .line 134
    .line 135
    const-wide/16 v6, 0x0

    .line 136
    .line 137
    const/4 v8, 0x0

    .line 138
    const-wide/16 v9, 0x0

    .line 139
    .line 140
    const/4 v11, 0x0

    .line 141
    const/4 v12, 0x0

    .line 142
    const/4 v13, 0x0

    .line 143
    const/4 v14, 0x0

    .line 144
    const/4 v15, 0x0

    .line 145
    const/16 v16, 0x0

    .line 146
    .line 147
    const/16 v17, 0x0

    .line 148
    .line 149
    const/16 v18, 0x0

    .line 150
    .line 151
    invoke-static/range {v3 .. v20}, La/czs;->a(La/czs;JJLjava/lang/String;JLjava/lang/String;ZZZZZZZLjava/lang/String;I)La/czs;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_1

    .line 160
    .line 161
    invoke-virtual {v0}, La/wzs;->z()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, La/wzs;->y()V

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    move-object v3, v2

    .line 173
    check-cast v3, La/czs;

    .line 174
    .line 175
    const/16 v19, 0x0

    .line 176
    .line 177
    const v20, 0xffdf

    .line 178
    .line 179
    .line 180
    const-wide/16 v4, 0x0

    .line 181
    .line 182
    const-wide/16 v6, 0x0

    .line 183
    .line 184
    const/4 v8, 0x0

    .line 185
    const-wide/16 v9, 0x0

    .line 186
    .line 187
    const/4 v11, 0x0

    .line 188
    const/4 v12, 0x1

    .line 189
    const/4 v13, 0x0

    .line 190
    const/4 v14, 0x0

    .line 191
    const/4 v15, 0x0

    .line 192
    const/16 v16, 0x0

    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    const/16 v18, 0x0

    .line 197
    .line 198
    invoke-static/range {v3 .. v20}, La/czs;->a(La/czs;JJLjava/lang/String;JLjava/lang/String;ZZZZZZZLjava/lang/String;I)La/czs;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_2

    .line 207
    .line 208
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    check-cast v1, La/czs;

    .line 213
    .line 214
    iget-object v2, v0, La/wzs;->q:La/fuj0;

    .line 215
    .line 216
    iget-wide v3, v1, La/czs;->a:J

    .line 217
    .line 218
    iget-wide v5, v1, La/czs;->b:J

    .line 219
    .line 220
    iget-wide v7, v1, La/czs;->d:J

    .line 221
    .line 222
    sget-object v9, La/v39;->b:La/v39;

    .line 223
    .line 224
    iget-object v10, v1, La/czs;->c:Ljava/lang/String;

    .line 225
    .line 226
    iget-object v11, v1, La/czs;->o:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual/range {v2 .. v11}, La/fuj0;->A(JJJLa/v39;Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :goto_0
    return-void

    .line 232
    :pswitch_2
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 233
    .line 234
    invoke-virtual {v0}, La/wzs;->x()V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
