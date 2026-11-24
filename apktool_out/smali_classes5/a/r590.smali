.class public final synthetic La/r590;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w590;


# direct methods
.method public synthetic constructor <init>(La/w590;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r590;->a:B

    iput-object p1, p0, La/r590;->b:La/w590;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/r590;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/r590;->b:La/w590;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/w590;->W1:La/mi70;

    .line 11
    .line 12
    invoke-virtual {p0}, La/w590;->I0()La/s690;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object v0, p0, La/s690;->v:La/p7m0;

    .line 17
    .line 18
    new-instance v1, La/k690;

    .line 19
    .line 20
    iget-object p0, p0, La/s690;->z:La/ra10;

    .line 21
    .line 22
    invoke-direct {v1, p0}, La/k690;-><init>(La/ra10;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    sget-object v0, La/w590;->W1:La/mi70;

    .line 35
    .line 36
    invoke-virtual {p0}, La/w590;->I0()La/s690;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object v0, p0, La/s690;->i:La/i1w0;

    .line 41
    .line 42
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object p0, p0, La/s690;->h:La/jh70;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-static {p0, v3}, La/jh70;->j(La/jh70;Z)Lorg/xplatform/personal/impl/navigation/PersonalScreen$PersonalDataScreen;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    instance-of v3, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 54
    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    new-instance v3, La/e1w0;

    .line 58
    .line 59
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 60
    .line 61
    invoke-direct {v3, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 62
    .line 63
    .line 64
    new-instance p0, La/c8d;

    .line 65
    .line 66
    sget-object v4, La/y7d;->a:La/v7d;

    .line 67
    .line 68
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    new-instance v3, La/w0w0;

    .line 76
    .line 77
    invoke-direct {v3, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 78
    .line 79
    .line 80
    new-instance p0, La/c8d;

    .line 81
    .line 82
    sget-object v4, La/y7d;->a:La/v7d;

    .line 83
    .line 84
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-static {v0, v2, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    :goto_1
    move-object v1, p0

    .line 95
    check-cast v1, La/paw;

    .line 96
    .line 97
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_1

    .line 102
    .line 103
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, La/oe50;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_1
    sget-object v0, La/w590;->W1:La/mi70;

    .line 117
    .line 118
    invoke-virtual {p0}, La/w590;->I0()La/s690;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    new-instance v4, La/ev80;

    .line 138
    .line 139
    const/16 v5, 0xb

    .line 140
    .line 141
    invoke-direct {v4, v5}, La/ev80;-><init>(B)V

    .line 142
    .line 143
    .line 144
    new-instance v7, La/o690;

    .line 145
    .line 146
    invoke-direct {v7, v0, p0, v2, v1}, La/o690;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 147
    .line 148
    .line 149
    const/16 v8, 0xe

    .line 150
    .line 151
    const/4 v5, 0x0

    .line 152
    const/4 v6, 0x0

    .line 153
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 154
    .line 155
    .line 156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_2
    sget-object v0, La/w590;->W1:La/mi70;

    .line 160
    .line 161
    invoke-virtual {p0}, La/w590;->G0()V

    .line 162
    .line 163
    .line 164
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_3
    sget-object v0, La/w590;->W1:La/mi70;

    .line 168
    .line 169
    invoke-static {}, La/j120;->V()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    filled-new-array {v0}, [Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    const-string v1, "android.permission.CAMERA"

    .line 178
    .line 179
    invoke-static {p0, v1, v0}, La/m7x;->P(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {p0}, La/khf0;->d()La/qog0;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0

    .line 188
    :pswitch_4
    iget-object p0, p0, La/w590;->M1:La/fiu0;

    .line 189
    .line 190
    if-eqz p0, :cond_2

    .line 191
    .line 192
    return-object p0

    .line 193
    :cond_2
    const-string p0, "viewModelFactory"

    .line 194
    .line 195
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v2

    .line 199
    :pswitch_5
    sget-object v0, La/w590;->W1:La/mi70;

    .line 200
    .line 201
    invoke-virtual {p0}, La/w590;->G0()V

    .line 202
    .line 203
    .line 204
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object p0

    .line 207
    :pswitch_6
    sget-object v0, La/w590;->W1:La/mi70;

    .line 208
    .line 209
    invoke-virtual {p0}, La/w590;->I0()La/s690;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-virtual {p0}, La/s690;->w()V

    .line 214
    .line 215
    .line 216
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object p0

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
