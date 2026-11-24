.class public final synthetic La/srl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/url0;


# direct methods
.method public synthetic constructor <init>(La/url0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/srl0;->a:B

    iput-object p1, p0, La/srl0;->b:La/url0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/srl0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/srl0;->b:La/url0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v1, La/q0h0;

    .line 12
    .line 13
    iget-object v0, v0, La/url0;->M1:La/tui;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_0
    const-string v0, "viewModelFactory"

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v2

    .line 27
    :pswitch_0
    sget-object v1, La/url0;->R1:La/cge0;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    instance-of v3, v1, La/af3;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    check-cast v1, La/af3;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v1, v2

    .line 48
    :goto_0
    const-class v3, La/vrl0;

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, La/o5d0;

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/ze3;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move-object v1, v2

    .line 72
    :goto_1
    instance-of v4, v1, La/vrl0;

    .line 73
    .line 74
    if-nez v4, :cond_3

    .line 75
    .line 76
    move-object v1, v2

    .line 77
    :cond_3
    check-cast v1, La/vrl0;

    .line 78
    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    iget-object v2, v0, La/url0;->Q1:La/khf0;

    .line 86
    .line 87
    sget-object v3, La/url0;->S1:[La/iiy;

    .line 88
    .line 89
    const/4 v4, 0x1

    .line 90
    aget-object v3, v3, v4

    .line 91
    .line 92
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    move-object v15, v0

    .line 97
    check-cast v15, Lorg/xplatform/feed/navigation/SportFilterScreenParams;

    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v5, v1, La/vrl0;->a:La/mne;

    .line 103
    .line 104
    iget-object v8, v1, La/vrl0;->b:La/g2v;

    .line 105
    .line 106
    iget-object v9, v1, La/vrl0;->c:La/wdk0;

    .line 107
    .line 108
    iget-object v10, v1, La/vrl0;->d:La/duj;

    .line 109
    .line 110
    iget-object v11, v1, La/vrl0;->e:La/s31;

    .line 111
    .line 112
    iget-object v12, v1, La/vrl0;->f:La/cyu;

    .line 113
    .line 114
    iget-object v13, v1, La/vrl0;->g:La/ii;

    .line 115
    .line 116
    iget-object v14, v1, La/vrl0;->h:La/ctf0;

    .line 117
    .line 118
    iget-object v6, v1, La/vrl0;->i:La/iip;

    .line 119
    .line 120
    iget-object v0, v1, La/vrl0;->j:La/b4j;

    .line 121
    .line 122
    iget-object v1, v1, La/vrl0;->k:La/je;

    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance v4, La/uui;

    .line 137
    .line 138
    move-object/from16 v16, v0

    .line 139
    .line 140
    move-object/from16 v17, v1

    .line 141
    .line 142
    invoke-direct/range {v4 .. v17}, La/uui;-><init>(La/mne;La/iip;La/i1w0;La/g2v;La/wdk0;La/duj;La/s31;La/cyu;La/ii;La/ctf0;Lorg/xplatform/feed/navigation/SportFilterScreenParams;La/b4j;La/je;)V

    .line 143
    .line 144
    .line 145
    move-object v2, v4

    .line 146
    goto :goto_2

    .line 147
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 148
    .line 149
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :goto_2
    return-object v2

    .line 157
    :pswitch_1
    sget-object v1, La/url0;->R1:La/cge0;

    .line 158
    .line 159
    invoke-virtual {v0}, La/url0;->G0()La/k3t0;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sget-object v1, La/mrl0;->a:La/mrl0;

    .line 164
    .line 165
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object v0

    .line 171
    :pswitch_2
    sget-object v1, La/url0;->R1:La/cge0;

    .line 172
    .line 173
    invoke-virtual {v0}, La/url0;->G0()La/k3t0;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    sget-object v1, La/jrl0;->a:La/jrl0;

    .line 178
    .line 179
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_3
    sget-object v1, La/url0;->R1:La/cge0;

    .line 186
    .line 187
    invoke-virtual {v0}, La/url0;->G0()La/k3t0;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sget-object v1, La/grl0;->a:La/grl0;

    .line 192
    .line 193
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_4
    sget-object v1, La/url0;->R1:La/cge0;

    .line 200
    .line 201
    invoke-virtual {v0}, La/url0;->G0()La/k3t0;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    sget-object v1, La/drl0;->a:La/drl0;

    .line 206
    .line 207
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object v0

    .line 213
    :pswitch_5
    sget-object v1, La/url0;->R1:La/cge0;

    .line 214
    .line 215
    invoke-virtual {v0}, La/url0;->G0()La/k3t0;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    sget-object v1, La/frl0;->a:La/frl0;

    .line 220
    .line 221
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object v0

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
