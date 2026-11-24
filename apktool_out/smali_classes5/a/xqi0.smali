.class public final synthetic La/xqi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bri0;


# direct methods
.method public synthetic constructor <init>(La/bri0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xqi0;->a:B

    iput-object p1, p0, La/xqi0;->b:La/bri0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/xqi0;->a:B

    .line 2
    .line 3
    sget-object v1, La/iri0;->a:La/iri0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/xqi0;->b:La/bri0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object p0, La/bri0;->V1:La/lme0;

    .line 12
    .line 13
    invoke-virtual {v3}, La/bri0;->H0()La/uri0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, La/uri0;->w()V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    sget-object p0, La/bri0;->V1:La/lme0;

    .line 24
    .line 25
    invoke-virtual {v3}, La/bri0;->H0()La/uri0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, La/uri0;->w()V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_1
    sget-object p0, La/bri0;->V1:La/lme0;

    .line 36
    .line 37
    invoke-virtual {v3}, La/bri0;->H0()La/uri0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-object p0, p0, La/uri0;->w:La/ol60;

    .line 42
    .line 43
    sget-object v0, La/hri0;->a:La/hri0;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_2
    sget-object v0, La/bri0;->V1:La/lme0;

    .line 52
    .line 53
    iget-object v5, p0, La/xqi0;->b:La/bri0;

    .line 54
    .line 55
    iget-object v3, v5, La/bri0;->O1:La/wdk0;

    .line 56
    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    new-instance v4, La/xdk0;

    .line 60
    .line 61
    sget-object v7, La/rek0;->b:La/rek0;

    .line 62
    .line 63
    const p0, 0x7f130dca

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const/4 v12, 0x0

    .line 74
    const/16 v13, 0x7c

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v10, 0x0

    .line 78
    const/4 v11, 0x0

    .line 79
    move-object v6, v4

    .line 80
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 81
    .line 82
    .line 83
    const/16 v10, 0x3fc

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x0

    .line 87
    const/4 v8, 0x0

    .line 88
    invoke-static/range {v3 .. v10}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_0
    const-string p0, "snackbarManager"

    .line 95
    .line 96
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v2

    .line 100
    :pswitch_3
    sget-object p0, La/bri0;->V1:La/lme0;

    .line 101
    .line 102
    invoke-virtual {v3}, La/bri0;->H0()La/uri0;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    iget-object p0, p0, La/uri0;->w:La/ol60;

    .line 107
    .line 108
    invoke-virtual {p0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_4
    sget-object p0, La/bri0;->V1:La/lme0;

    .line 115
    .line 116
    invoke-virtual {v3}, La/bri0;->H0()La/uri0;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    iget-object p0, p0, La/uri0;->w:La/ol60;

    .line 121
    .line 122
    invoke-virtual {p0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_5
    sget-object p0, La/bri0;->V1:La/lme0;

    .line 129
    .line 130
    invoke-virtual {v3}, La/bri0;->H0()La/uri0;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {v3}, La/bri0;->G0()La/r4r;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iget-object v0, v0, La/r4r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 139
    .line 140
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-boolean v1, p0, La/uri0;->C:Z

    .line 149
    .line 150
    if-nez v1, :cond_1

    .line 151
    .line 152
    iget-object p0, p0, La/uri0;->w:La/ol60;

    .line 153
    .line 154
    sget-object v0, La/eri0;->a:La/eri0;

    .line 155
    .line 156
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iget-object v3, p0, La/uri0;->r:La/mne;

    .line 165
    .line 166
    iget-object v4, v3, La/mne;->b:La/dvj;

    .line 167
    .line 168
    move-object v5, v2

    .line 169
    new-instance v2, La/cri0;

    .line 170
    .line 171
    const/4 v3, 0x1

    .line 172
    invoke-direct {v2, p0, v3}, La/cri0;-><init>(La/uri0;B)V

    .line 173
    .line 174
    .line 175
    move-object v6, v5

    .line 176
    new-instance v5, La/zye0;

    .line 177
    .line 178
    const/16 v3, 0x16

    .line 179
    .line 180
    invoke-direct {v5, p0, v0, v6, v3}, La/zye0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 181
    .line 182
    .line 183
    const/16 v6, 0xa

    .line 184
    .line 185
    const/4 v3, 0x0

    .line 186
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 187
    .line 188
    .line 189
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_6
    move-object v6, v2

    .line 193
    new-instance p0, La/t0h0;

    .line 194
    .line 195
    iget-object v0, v3, La/bri0;->M1:La/pti;

    .line 196
    .line 197
    if-eqz v0, :cond_2

    .line 198
    .line 199
    invoke-static {v3}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-direct {p0, v0, v1}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 204
    .line 205
    .line 206
    return-object p0

    .line 207
    :cond_2
    const-string p0, "viewModelFactory"

    .line 208
    .line 209
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v6

    .line 213
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
