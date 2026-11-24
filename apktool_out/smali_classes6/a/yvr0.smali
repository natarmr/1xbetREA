.class public final La/yvr0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/zvr0;


# direct methods
.method public synthetic constructor <init>(La/zvr0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yvr0;->i:B

    iput-object p1, p0, La/yvr0;->j:La/zvr0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/yvr0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yvr0;->j:La/zvr0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/yvr0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/yvr0;-><init>(La/zvr0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/yvr0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/yvr0;-><init>(La/zvr0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/yvr0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/yvr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yvr0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yvr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/yvr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/yvr0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/yvr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/yvr0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yvr0;->j:La/zvr0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget p1, La/zvr0;->E:I

    .line 14
    .line 15
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 16
    .line 17
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    check-cast v2, La/uvr0;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v1, v2, La/uvr0;->a:La/vvr0;

    .line 35
    .line 36
    sget-object v3, La/crq0;->a:La/crq0;

    .line 37
    .line 38
    const/4 v4, 0x3

    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-static {v1, v5, v5, v3, v4}, La/vvr0;->a(La/vvr0;Ljava/lang/String;La/mtr0;La/erq0;I)La/vvr0;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const/4 v11, 0x0

    .line 45
    const/16 v12, 0x1fc

    .line 46
    .line 47
    sget-object v4, La/nlr0;->a:La/nlr0;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    const-wide/16 v7, 0x0

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    invoke-static/range {v2 .. v12}, La/uvr0;->a(La/uvr0;La/vvr0;La/plr0;ZIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)La/uvr0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 69
    .line 70
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, La/zvr0;->t:La/nv20;

    .line 74
    .line 75
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, La/uvr0;

    .line 80
    .line 81
    iget-object v0, v0, La/uvr0;->f:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, La/uvr0;

    .line 88
    .line 89
    iget-object v1, v1, La/uvr0;->g:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object p1, p1, La/nv20;->a:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, La/nvu;

    .line 97
    .line 98
    iget-object p1, p1, La/nvu;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, La/afm0;

    .line 101
    .line 102
    :try_start_0
    new-instance v2, Landroid/app/DownloadManager$Request;

    .line 103
    .line 104
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-direct {v2, v0}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    .line 112
    .line 113
    .line 114
    const/4 v0, 0x1

    .line 115
    invoke-virtual {v2, v0}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    .line 116
    .line 117
    .line 118
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v2, v0, v1}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 121
    .line 122
    .line 123
    iget-object p1, p1, La/afm0;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p1, La/us00;

    .line 126
    .line 127
    const-string v0, "download"

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    check-cast p1, Landroid/app/DownloadManager;

    .line 137
    .line 138
    invoke-virtual {p1, v2}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    .line 140
    .line 141
    new-instance p1, La/rvr0;

    .line 142
    .line 143
    sget-object v1, La/pek0;->a:La/pek0;

    .line 144
    .line 145
    iget-object v0, p0, La/zvr0;->x:La/ctf0;

    .line 146
    .line 147
    const/4 v2, 0x0

    .line 148
    new-array v3, v2, [Ljava/lang/Object;

    .line 149
    .line 150
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 151
    .line 152
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    const v3, 0x7f1312c8

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    new-instance v0, La/xdk0;

    .line 164
    .line 165
    new-instance v6, Ljava/lang/Integer;

    .line 166
    .line 167
    const v3, 0x7f0808fe

    .line 168
    .line 169
    .line 170
    invoke-direct {v6, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 171
    .line 172
    .line 173
    const/16 v7, 0x5c

    .line 174
    .line 175
    const/4 v3, 0x0

    .line 176
    const/4 v4, 0x0

    .line 177
    const/4 v5, 0x0

    .line 178
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 179
    .line 180
    .line 181
    invoke-direct {p1, v0}, La/rvr0;-><init>(La/xdk0;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object p0

    .line 190
    :catch_0
    new-instance p0, La/kzp;

    .line 191
    .line 192
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 193
    .line 194
    .line 195
    throw p0

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
