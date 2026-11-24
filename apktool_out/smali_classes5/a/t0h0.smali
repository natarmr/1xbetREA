.class public final La/t0h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/miu0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/j0h0;La/i1w0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/t0h0;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/t0h0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p2, p0, La/t0h0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/pni;La/qni;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/t0h0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, La/t0h0;->b:Ljava/lang/Object;

    .line 20
    iput-object p2, p0, La/t0h0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Class;La/by40;)La/diu0;
    .locals 13

    .line 1
    iget-byte p1, p0, La/t0h0;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/t0h0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/t0h0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, La/zzg0;->a(La/by40;)La/vzg0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p0, La/qni;

    .line 15
    .line 16
    new-instance v10, La/g090;

    .line 17
    .line 18
    iget-object p0, p0, La/qni;->a:La/omi;

    .line 19
    .line 20
    iget-object p0, p0, La/omi;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, La/sni;

    .line 23
    .line 24
    iget-object p0, p0, La/sni;->h:La/pru;

    .line 25
    .line 26
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, v10, La/g090;->a:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-object p0, p0, La/sff0;->N:La/co4;

    .line 36
    .line 37
    iget-boolean v2, p0, La/co4;->c:Z

    .line 38
    .line 39
    const-string p0, "KEY_ENTER_PHONE_CODE_BY_MANUALLY"

    .line 40
    .line 41
    invoke-virtual {p1, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/lang/Boolean;

    .line 46
    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    :goto_0
    move v3, p0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    const/4 p0, 0x0

    .line 56
    goto :goto_0

    .line 57
    :goto_1
    sget-object v6, La/iun;->a:La/iun;

    .line 58
    .line 59
    const-string p0, "KEY_PHONE_CODE_BY_MANUALLY"

    .line 60
    .line 61
    invoke-virtual {p1, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Ljava/lang/String;

    .line 66
    .line 67
    if-nez p0, :cond_1

    .line 68
    .line 69
    const-string p0, "+"

    .line 70
    .line 71
    :cond_1
    move-object v4, p0

    .line 72
    const-string p0, "KEY_SEARCH_VALUE"

    .line 73
    .line 74
    invoke-virtual {p1, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Ljava/lang/String;

    .line 79
    .line 80
    if-nez p0, :cond_2

    .line 81
    .line 82
    const-string p0, ""

    .line 83
    .line 84
    :cond_2
    move-object v5, p0

    .line 85
    const-string p0, "KEY_BOTTOM_SHEET_STATE_BY_MANUALLY"

    .line 86
    .line 87
    invoke-virtual {p1, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    move-object v9, p0

    .line 92
    check-cast v9, Ljava/lang/Integer;

    .line 93
    .line 94
    new-instance v1, La/cr90;

    .line 95
    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    invoke-direct/range {v1 .. v9}, La/cr90;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Throwable;Ljava/lang/Integer;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    iput-object p0, v10, La/g090;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, La/pni;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    new-instance v1, La/es90;

    .line 113
    .line 114
    iget-object p0, v0, La/pni;->a:La/omi;

    .line 115
    .line 116
    iget-object p0, p0, La/omi;->c:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p0, La/sni;

    .line 119
    .line 120
    iget-object v2, p0, La/sni;->a:La/ctf0;

    .line 121
    .line 122
    new-instance v3, La/gnu;

    .line 123
    .line 124
    new-instance p1, La/dq00;

    .line 125
    .line 126
    iget-object p2, p0, La/sni;->b:La/yp90;

    .line 127
    .line 128
    iget-object v0, p0, La/sni;->c:La/imb;

    .line 129
    .line 130
    invoke-direct {p1, p2, v0}, La/dq00;-><init>(La/yp90;La/imb;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v3, p1}, La/gnu;-><init>(La/dq00;)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, La/sni;->d:La/cad;

    .line 137
    .line 138
    iget-object p1, p1, La/cad;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p1, La/psc;

    .line 141
    .line 142
    invoke-virtual {p1}, La/psc;->h()La/mne;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    iget-object v5, p0, La/sni;->e:La/duj;

    .line 150
    .line 151
    iget-object v6, p0, La/sni;->f:Lorg/xplatform/picker/api/presentation/PickerParams;

    .line 152
    .line 153
    new-instance v7, La/fnu;

    .line 154
    .line 155
    new-instance p1, La/dq00;

    .line 156
    .line 157
    iget-object p2, p0, La/sni;->b:La/yp90;

    .line 158
    .line 159
    iget-object v0, p0, La/sni;->c:La/imb;

    .line 160
    .line 161
    invoke-direct {p1, p2, v0}, La/dq00;-><init>(La/yp90;La/imb;)V

    .line 162
    .line 163
    .line 164
    invoke-direct {v7, p1}, La/fnu;-><init>(La/dq00;)V

    .line 165
    .line 166
    .line 167
    new-instance v8, La/wti;

    .line 168
    .line 169
    iget-object p1, p0, La/sni;->g:La/bot;

    .line 170
    .line 171
    iget-object v12, p0, La/sni;->h:La/pru;

    .line 172
    .line 173
    invoke-direct {v8, p1, v12}, La/wti;-><init>(La/bot;La/pru;)V

    .line 174
    .line 175
    .line 176
    new-instance v9, La/fnu;

    .line 177
    .line 178
    new-instance p1, La/dq00;

    .line 179
    .line 180
    invoke-direct {p1, p2, v0}, La/dq00;-><init>(La/yp90;La/imb;)V

    .line 181
    .line 182
    .line 183
    invoke-direct {v9, p1}, La/fnu;-><init>(La/dq00;)V

    .line 184
    .line 185
    .line 186
    new-instance v11, La/cyu;

    .line 187
    .line 188
    new-instance p1, La/b4j;

    .line 189
    .line 190
    iget-object p2, p0, La/sni;->i:La/kt2;

    .line 191
    .line 192
    const/4 v0, 0x3

    .line 193
    invoke-direct {p1, p2, v0}, La/b4j;-><init>(La/kt2;B)V

    .line 194
    .line 195
    .line 196
    iget-object p2, p0, La/sni;->j:La/je;

    .line 197
    .line 198
    iget-object p0, p0, La/sni;->k:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 199
    .line 200
    invoke-direct {v11, p1, p2, p0}, La/cyu;-><init>(La/b4j;La/je;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V

    .line 201
    .line 202
    .line 203
    invoke-direct/range {v1 .. v12}, La/es90;-><init>(La/ctf0;La/gnu;La/mne;La/duj;Lorg/xplatform/picker/api/presentation/PickerParams;La/fnu;La/wti;La/fnu;La/g090;La/cyu;La/pru;)V

    .line 204
    .line 205
    .line 206
    return-object v1

    .line 207
    :pswitch_0
    invoke-static {p2}, La/zzg0;->a(La/by40;)La/vzg0;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    check-cast v0, La/j0h0;

    .line 212
    .line 213
    check-cast p0, La/i1w0;

    .line 214
    .line 215
    invoke-interface {v0, p1, p0}, La/j0h0;->a(La/vzg0;La/i1w0;)La/diu0;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    return-object p0

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
