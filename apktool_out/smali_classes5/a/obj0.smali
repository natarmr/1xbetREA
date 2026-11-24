.class public final synthetic La/obj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qbj0;


# direct methods
.method public synthetic constructor <init>(La/qbj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/obj0;->a:B

    iput-object p1, p0, La/obj0;->b:La/qbj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 12

    .line 1
    iget-byte v0, p0, La/obj0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x21

    .line 5
    .line 6
    iget-object p0, p0, La/obj0;->b:La/qbj0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/qbj0;->Z1:La/lme0;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string v0, "REQUEST_SHOW_LOGOUT_DIALOG"

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p2, "CONNECTION_LOST"

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, La/qbj0;->G0()La/ii;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 38
    .line 39
    const p2, 0x7f130e12

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const p2, 0x7f1307c4

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const p2, 0x7f130e5d

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object v9, La/n12;->b:La/n12;

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    const/16 v11, 0x5f8

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    invoke-direct/range {v0 .. v11}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    :goto_0
    return-void

    .line 87
    :pswitch_0
    sget-object p1, La/qbj0;->Z1:La/lme0;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, La/qbj0;->H0()La/k3t0;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    sget-object p1, La/saj0;->a:La/saj0;

    .line 97
    .line 98
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_1
    sget-object v0, La/qbj0;->Z1:La/lme0;

    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    const-string p2, "NEGATIVE_CLICK_REQUEST_KEY"

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_2

    .line 114
    .line 115
    invoke-virtual {p0}, La/qbj0;->H0()La/k3t0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    sget-object p1, La/waj0;->a:La/waj0;

    .line 120
    .line 121
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_2
    const-string p2, "CHANGE_BALANCE_REQUEST_KEY"

    .line 126
    .line 127
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 132
    .line 133
    if-lt v0, v2, :cond_3

    .line 134
    .line 135
    invoke-static {p1}, La/c7;->C(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    goto :goto_2

    .line 140
    :cond_3
    const-string v0, "GET_BALANCE_REQUEST_KEY"

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    instance-of v0, p1, La/ql5;

    .line 147
    .line 148
    if-nez v0, :cond_4

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_4
    move-object v1, p1

    .line 152
    :goto_1
    move-object p1, v1

    .line 153
    check-cast p1, La/ql5;

    .line 154
    .line 155
    :goto_2
    check-cast p1, La/ql5;

    .line 156
    .line 157
    invoke-virtual {p0}, La/qbj0;->H0()La/k3t0;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    new-instance v1, La/gaj0;

    .line 162
    .line 163
    invoke-direct {v1, p1}, La/gaj0;-><init>(La/ql5;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, La/qbj0;->H0()La/k3t0;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    new-instance p1, La/eaj0;

    .line 174
    .line 175
    invoke-direct {p1, p2}, La/eaj0;-><init>(Z)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :goto_3
    return-void

    .line 182
    :pswitch_2
    sget-object v0, La/qbj0;->Z1:La/lme0;

    .line 183
    .line 184
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    const-string v0, "SELECT_BALANCE_REQUEST_KEY"

    .line 188
    .line 189
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    if-nez p2, :cond_5

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_5
    const-string p2, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 197
    .line 198
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_8

    .line 203
    .line 204
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 205
    .line 206
    if-lt v0, v2, :cond_6

    .line 207
    .line 208
    invoke-static {p1}, La/c7;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    goto :goto_5

    .line 213
    :cond_6
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    instance-of p2, p1, La/ql5;

    .line 218
    .line 219
    if-nez p2, :cond_7

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_7
    move-object v1, p1

    .line 223
    :goto_4
    move-object p1, v1

    .line 224
    check-cast p1, La/ql5;

    .line 225
    .line 226
    :goto_5
    check-cast p1, La/ql5;

    .line 227
    .line 228
    invoke-virtual {p0}, La/qbj0;->H0()La/k3t0;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    new-instance p2, La/vaj0;

    .line 233
    .line 234
    invoke-direct {p2, p1}, La/vaj0;-><init>(La/ql5;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_8
    :goto_6
    return-void

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
