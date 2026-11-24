.class public final La/ft4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vby;

.field public final b:La/mne;

.field public final c:La/at4;

.field public final d:La/knf0;

.field public final e:La/epi0;

.field public final f:La/rp4;

.field public final g:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>(La/vby;La/mne;La/at4;La/knf0;La/tgk;La/epi0;La/us3;La/rp4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ft4;->a:La/vby;

    .line 5
    .line 6
    iput-object p2, p0, La/ft4;->b:La/mne;

    .line 7
    .line 8
    iput-object p3, p0, La/ft4;->c:La/at4;

    .line 9
    .line 10
    iput-object p4, p0, La/ft4;->d:La/knf0;

    .line 11
    .line 12
    iput-object p6, p0, La/ft4;->e:La/epi0;

    .line 13
    .line 14
    iput-object p8, p0, La/ft4;->f:La/rp4;

    .line 15
    .line 16
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/ft4;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lokhttp3/WebSocket;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/ft4;->c:La/at4;

    .line 2
    .line 3
    iget-object v1, v0, La/at4;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-lez v2, :cond_0

    .line 10
    .line 11
    new-instance v2, La/tyf0;

    .line 12
    .line 13
    iget-object v3, v0, La/at4;->a:La/swp0;

    .line 14
    .line 15
    iget-object v3, v3, La/swp0;->a:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v4, La/bkk0;->a:[La/bkk0;

    .line 18
    .line 19
    new-instance v4, La/syf0;

    .line 20
    .line 21
    invoke-direct {v4, v1}, La/syf0;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, v3, v4}, La/tyf0;-><init>(Ljava/lang/String;La/syf0;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, La/tyf0;->Companion:La/pyf0;

    .line 28
    .line 29
    invoke-virtual {v1}, La/pyf0;->serializer()La/jiy;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, La/jiy;

    .line 34
    .line 35
    iget-object p0, p0, La/ft4;->a:La/vby;

    .line 36
    .line 37
    invoke-virtual {p0, v1, v2}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p1, p0}, Lokhttp3/WebSocket;->a(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v0}, La/at4;->a()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final b(Lokhttp3/WebSocket;La/ckk0;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La/ft4;->a:La/vby;

    .line 6
    .line 7
    iget-object p0, p0, La/ft4;->c:La/at4;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {}, La/t9f;->b()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    new-instance v0, La/en50;

    .line 17
    .line 18
    iget-object v2, p0, La/at4;->a:La/swp0;

    .line 19
    .line 20
    iget-object v2, v2, La/swp0;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p2}, La/ckk0;->a()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance v3, La/dn50;

    .line 27
    .line 28
    iget-object p0, p0, La/at4;->f:La/zs4;

    .line 29
    .line 30
    iget-object p0, p0, La/zs4;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-direct {v3, p0}, La/dn50;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v2, p2, v3}, La/en50;-><init>(Ljava/lang/String;Ljava/lang/String;La/dn50;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, La/en50;->Companion:La/an50;

    .line 39
    .line 40
    invoke-virtual {p0}, La/an50;->serializer()La/jiy;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/jiy;

    .line 45
    .line 46
    invoke-virtual {v1, p0, v0}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :pswitch_1
    new-instance v0, La/cof0;

    .line 53
    .line 54
    iget-object v2, p0, La/at4;->a:La/swp0;

    .line 55
    .line 56
    iget-object v2, v2, La/swp0;->a:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p2}, La/ckk0;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    new-instance v3, La/bof0;

    .line 63
    .line 64
    iget-object p0, p0, La/at4;->e:Ljava/lang/String;

    .line 65
    .line 66
    invoke-direct {v3, p0}, La/bof0;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v2, p2, v3}, La/cof0;-><init>(Ljava/lang/String;Ljava/lang/String;La/bof0;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, La/cof0;->Companion:La/ynf0;

    .line 73
    .line 74
    invoke-virtual {p0}, La/ynf0;->serializer()La/jiy;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, La/jiy;

    .line 79
    .line 80
    invoke-virtual {v1, p0, v0}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    goto :goto_1

    .line 85
    :pswitch_2
    new-instance v0, La/y080;

    .line 86
    .line 87
    iget-object p0, p0, La/at4;->a:La/swp0;

    .line 88
    .line 89
    iget-object p0, p0, La/swp0;->a:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p2}, La/ckk0;->a()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    new-instance v3, La/x080;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    const/4 v4, 0x1

    .line 102
    packed-switch p2, :pswitch_data_1

    .line 103
    .line 104
    .line 105
    invoke-static {}, La/t9f;->b()V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_3
    const/4 v4, 0x5

    .line 110
    goto :goto_0

    .line 111
    :pswitch_4
    const/4 v4, 0x4

    .line 112
    goto :goto_0

    .line 113
    :pswitch_5
    const/4 v4, 0x6

    .line 114
    goto :goto_0

    .line 115
    :pswitch_6
    const/4 v4, 0x0

    .line 116
    goto :goto_0

    .line 117
    :pswitch_7
    const/4 v4, 0x2

    .line 118
    :goto_0
    :pswitch_8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-direct {v3, p2}, La/x080;-><init>(Ljava/lang/Integer;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v0, p0, v2, v3}, La/y080;-><init>(Ljava/lang/String;Ljava/lang/String;La/x080;)V

    .line 126
    .line 127
    .line 128
    sget-object p0, La/y080;->Companion:La/u080;

    .line 129
    .line 130
    invoke-virtual {p0}, La/u080;->serializer()La/jiy;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, La/jiy;

    .line 135
    .line 136
    invoke-virtual {v1, p0, v0}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    goto :goto_1

    .line 141
    :pswitch_9
    new-instance v0, La/mzf0;

    .line 142
    .line 143
    iget-object v2, p0, La/at4;->a:La/swp0;

    .line 144
    .line 145
    iget-object v2, v2, La/swp0;->a:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p2}, La/ckk0;->a()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    new-instance v3, La/kzf0;

    .line 152
    .line 153
    iget-object p0, p0, La/at4;->f:La/zs4;

    .line 154
    .line 155
    iget-object v4, p0, La/zs4;->b:Ljava/lang/String;

    .line 156
    .line 157
    iget-object p0, p0, La/zs4;->a:Ljava/lang/String;

    .line 158
    .line 159
    invoke-direct {v3, v4, p0}, La/kzf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-direct {v0, v2, p2, v3}, La/mzf0;-><init>(Ljava/lang/String;Ljava/lang/String;La/kzf0;)V

    .line 163
    .line 164
    .line 165
    sget-object p0, La/mzf0;->Companion:La/hzf0;

    .line 166
    .line 167
    invoke-virtual {p0}, La/hzf0;->serializer()La/jiy;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    check-cast p0, La/jiy;

    .line 172
    .line 173
    invoke-virtual {v1, p0, v0}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-lez p2, :cond_0

    .line 182
    .line 183
    invoke-interface {p1, p0}, Lokhttp3/WebSocket;->a(Ljava/lang/String;)Z

    .line 184
    .line 185
    .line 186
    :cond_0
    return-void

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
