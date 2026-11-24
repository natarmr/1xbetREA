.class public final synthetic La/s590;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wn;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w590;


# direct methods
.method public synthetic constructor <init>(La/w590;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s590;->a:B

    iput-object p1, p0, La/s590;->b:La/w590;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-byte v0, p0, La/s590;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/s590;->b:La/w590;

    .line 4
    .line 5
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/w590;->W1:La/mi70;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/w590;->G0()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    sget-object v0, La/w590;->W1:La/mi70;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p1, Landroidx/activity/result/ActivityResult;->b:Landroid/content/Intent;

    .line 25
    .line 26
    iget p1, p1, Landroidx/activity/result/ActivityResult;->a:I

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v2, v1

    .line 37
    :goto_0
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x1

    .line 39
    const/4 v5, -0x1

    .line 40
    const-string v6, ""

    .line 41
    .line 42
    if-nez v2, :cond_7

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move-object v2, v1

    .line 58
    :goto_1
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_7

    .line 65
    .line 66
    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    const-string v2, "FILE_PATH_BUNDLE_NAME"

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move-object v0, v1

    .line 78
    :goto_2
    if-nez v0, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move-object v6, v0

    .line 82
    :goto_3
    new-instance v0, Ljava/io/File;

    .line 83
    .line 84
    invoke-direct {v0, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    if-ne p1, v5, :cond_5

    .line 88
    .line 89
    iget-object p1, p0, La/w590;->U1:Landroid/webkit/ValueCallback;

    .line 90
    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    new-instance v5, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v2, ".provider"

    .line 114
    .line 115
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {p1, v0, v2}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-array v0, v4, [Landroid/net/Uri;

    .line 130
    .line 131
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    aput-object p1, v0, v3

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_5
    move-object v0, v1

    .line 143
    :goto_4
    iget-object p1, p0, La/w590;->U1:Landroid/webkit/ValueCallback;

    .line 144
    .line 145
    if-eqz p1, :cond_6

    .line 146
    .line 147
    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_6
    iput-object v1, p0, La/w590;->U1:Landroid/webkit/ValueCallback;

    .line 151
    .line 152
    goto/16 :goto_9

    .line 153
    .line 154
    :cond_7
    if-eqz v0, :cond_f

    .line 155
    .line 156
    if-ne p1, v5, :cond_d

    .line 157
    .line 158
    sget-object p1, La/d590;->c:La/jh70;

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-static {}, La/jh70;->g()Ljava/util/ArrayList;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-static {v0, p1, v2}, La/v3a;->b(Landroid/content/Intent;Ljava/util/ArrayList;Landroid/content/Context;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    iget-object v2, p0, La/w590;->U1:Landroid/webkit/ValueCallback;

    .line 176
    .line 177
    if-nez p1, :cond_9

    .line 178
    .line 179
    if-eqz v2, :cond_8

    .line 180
    .line 181
    new-array p1, v3, [Landroid/net/Uri;

    .line 182
    .line 183
    invoke-interface {v2, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_8
    iput-object v1, p0, La/w590;->U1:Landroid/webkit/ValueCallback;

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_9
    if-eqz v2, :cond_d

    .line 190
    .line 191
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    if-eqz p1, :cond_a

    .line 200
    .line 201
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    goto :goto_5

    .line 206
    :cond_a
    move-object p1, v1

    .line 207
    :goto_5
    if-nez p1, :cond_c

    .line 208
    .line 209
    invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    if-nez p1, :cond_b

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_b
    move-object v6, p1

    .line 217
    :goto_6
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    filled-new-array {p1}, [Landroid/net/Uri;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    goto :goto_8

    .line 226
    :cond_c
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    if-eqz p1, :cond_d

    .line 239
    .line 240
    new-array v0, v4, [Landroid/net/Uri;

    .line 241
    .line 242
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    aput-object p1, v0, v3

    .line 247
    .line 248
    move-object p1, v0

    .line 249
    goto :goto_8

    .line 250
    :cond_d
    :goto_7
    move-object p1, v1

    .line 251
    :goto_8
    iget-object v0, p0, La/w590;->U1:Landroid/webkit/ValueCallback;

    .line 252
    .line 253
    if-eqz v0, :cond_e

    .line 254
    .line 255
    invoke-interface {v0, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    :cond_e
    iput-object v1, p0, La/w590;->U1:Landroid/webkit/ValueCallback;

    .line 259
    .line 260
    :cond_f
    :goto_9
    return-void

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
