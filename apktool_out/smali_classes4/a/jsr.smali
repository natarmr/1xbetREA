.class public final synthetic La/jsr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p89;


# direct methods
.method public synthetic constructor <init>(La/p89;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jsr;->a:B

    iput-object p1, p0, La/jsr;->b:La/p89;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-byte p1, p0, La/jsr;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/jsr;->b:La/p89;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget p1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 9
    .line 10
    iget-object p0, p0, La/p89;->l:La/p7m0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, La/b89;

    .line 17
    .line 18
    iget-boolean p1, p1, La/b89;->m:Z

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    move-object v0, p1

    .line 27
    check-cast v0, La/b89;

    .line 28
    .line 29
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, La/b89;

    .line 34
    .line 35
    iget-object v1, v1, La/b89;->l:La/w3w0;

    .line 36
    .line 37
    sget-object v2, La/w3w0;->b:La/w3w0;

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    sget-object v2, La/w3w0;->a:La/w3w0;

    .line 42
    .line 43
    :cond_1
    move-object v5, v2

    .line 44
    const/4 v6, 0x0

    .line 45
    const/16 v7, 0x77ff

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v2, 0x0

    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-static/range {v0 .. v7}, La/b89;->a(La/b89;ZZZZLa/w3w0;ZI)La/b89;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    :cond_2
    return-void

    .line 62
    :pswitch_0
    sget p1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 63
    .line 64
    iget-object p1, p0, La/p89;->m:La/p7m0;

    .line 65
    .line 66
    sget-object v0, La/t79;->b:La/t79;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-virtual {p1, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    sget-object v3, La/m89;->a:La/m89;

    .line 80
    .line 81
    iget-object p1, p0, La/p89;->d:La/mne;

    .line 82
    .line 83
    iget-object v5, p1, La/mne;->a:La/rwj;

    .line 84
    .line 85
    new-instance v6, La/k89;

    .line 86
    .line 87
    const/4 p1, 0x2

    .line 88
    invoke-direct {v6, p0, v1, p1}, La/k89;-><init>(La/p89;La/yje;B)V

    .line 89
    .line 90
    .line 91
    const/16 v7, 0xa

    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 95
    .line 96
    .line 97
    iget-object p0, p0, La/p89;->e:La/ali;

    .line 98
    .line 99
    invoke-virtual {p0}, La/ali;->d()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_1
    sget p1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 104
    .line 105
    invoke-virtual {p0}, La/p89;->w()V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_2
    sget p1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 110
    .line 111
    iget-object p1, p0, La/p89;->l:La/p7m0;

    .line 112
    .line 113
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/b89;

    .line 118
    .line 119
    iget-boolean v0, v0, La/b89;->f:Z

    .line 120
    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    :cond_3
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    move-object v1, v0

    .line 128
    check-cast v1, La/b89;

    .line 129
    .line 130
    const/4 v7, 0x0

    .line 131
    const/16 v8, 0x7f5f

    .line 132
    .line 133
    const/4 v2, 0x0

    .line 134
    const/4 v3, 0x0

    .line 135
    const/4 v4, 0x0

    .line 136
    const/4 v5, 0x0

    .line 137
    const/4 v6, 0x0

    .line 138
    invoke-static/range {v1 .. v8}, La/b89;->a(La/b89;ZZZZLa/w3w0;ZI)La/b89;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    invoke-virtual {p0}, La/p89;->y()V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_4
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    move-object v1, v0

    .line 157
    check-cast v1, La/b89;

    .line 158
    .line 159
    const/4 v7, 0x0

    .line 160
    const/16 v8, 0x7fdf

    .line 161
    .line 162
    const/4 v2, 0x1

    .line 163
    const/4 v3, 0x0

    .line 164
    const/4 v4, 0x0

    .line 165
    const/4 v5, 0x0

    .line 166
    const/4 v6, 0x0

    .line 167
    invoke-static/range {v1 .. v8}, La/b89;->a(La/b89;ZZZZLa/w3w0;ZI)La/b89;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_4

    .line 176
    .line 177
    invoke-virtual {p0}, La/p89;->z()V

    .line 178
    .line 179
    .line 180
    :goto_0
    return-void

    .line 181
    :pswitch_3
    sget p1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 182
    .line 183
    iget-object p1, p0, La/p89;->l:La/p7m0;

    .line 184
    .line 185
    :cond_5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    move-object v1, v0

    .line 190
    check-cast v1, La/b89;

    .line 191
    .line 192
    const/4 v7, 0x0

    .line 193
    const/16 v8, 0x5fff

    .line 194
    .line 195
    const/4 v2, 0x0

    .line 196
    const/4 v3, 0x0

    .line 197
    const/4 v4, 0x0

    .line 198
    const/4 v5, 0x0

    .line 199
    const/4 v6, 0x0

    .line 200
    invoke-static/range {v1 .. v8}, La/b89;->a(La/b89;ZZZZLa/w3w0;ZI)La/b89;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_5

    .line 209
    .line 210
    invoke-virtual {p0}, La/p89;->x()V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
