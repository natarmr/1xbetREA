.class public final synthetic La/k1b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JZLjava/lang/String;ZB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/k1b;->a:B

    iput-object p1, p0, La/k1b;->f:Ljava/lang/Object;

    iput-wide p2, p0, La/k1b;->b:J

    iput-boolean p4, p0, La/k1b;->c:Z

    iput-object p5, p0, La/k1b;->d:Ljava/lang/String;

    iput-boolean p6, p0, La/k1b;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/k1b;->a:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/k1b;->e:Z

    .line 4
    .line 5
    iget-object v2, p0, La/k1b;->f:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, La/g9b0;

    .line 11
    .line 12
    check-cast p1, La/k0w0;

    .line 13
    .line 14
    iget-object v3, v2, La/g9b0;->D:La/uxs0;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v9, 0x6

    .line 18
    iget-wide v4, p0, La/k1b;->b:J

    .line 19
    .line 20
    iget-boolean v7, p0, La/k1b;->c:Z

    .line 21
    .line 22
    iget-object v8, p0, La/k1b;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static/range {v3 .. v9}, La/uxs0;->c(La/uxs0;JLa/csr;ZLjava/lang/String;I)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/c8d;

    .line 35
    .line 36
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 37
    .line 38
    new-instance v0, La/v7d;

    .line 39
    .line 40
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    check-cast v2, La/hv60;

    .line 49
    .line 50
    check-cast p1, La/k0w0;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v3, v2, La/hv60;->L:La/uxs0;

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v9, 0x6

    .line 59
    iget-wide v4, p0, La/k1b;->b:J

    .line 60
    .line 61
    iget-boolean v7, p0, La/k1b;->c:Z

    .line 62
    .line 63
    iget-object v8, p0, La/k1b;->d:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static/range {v3 .. v9}, La/uxs0;->c(La/uxs0;JLa/csr;ZLjava/lang/String;I)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, La/c8d;

    .line 76
    .line 77
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 78
    .line 79
    new-instance v0, La/v7d;

    .line 80
    .line 81
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 85
    .line 86
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_1
    check-cast v2, La/nn60;

    .line 90
    .line 91
    check-cast p1, La/k0w0;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v3, v2, La/nn60;->w:La/uxs0;

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v9, 0x6

    .line 100
    iget-wide v4, p0, La/k1b;->b:J

    .line 101
    .line 102
    iget-boolean v7, p0, La/k1b;->c:Z

    .line 103
    .line 104
    iget-object v8, p0, La/k1b;->d:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static/range {v3 .. v9}, La/uxs0;->c(La/uxs0;JLa/csr;ZLjava/lang/String;I)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, La/c8d;

    .line 117
    .line 118
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 119
    .line 120
    new-instance v0, La/v7d;

    .line 121
    .line 122
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 123
    .line 124
    .line 125
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_2
    check-cast v2, La/pm60;

    .line 131
    .line 132
    check-cast p1, La/k0w0;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object v3, v2, La/pm60;->p:La/uxs0;

    .line 138
    .line 139
    const/4 v6, 0x0

    .line 140
    const/4 v9, 0x6

    .line 141
    iget-wide v4, p0, La/k1b;->b:J

    .line 142
    .line 143
    iget-boolean v7, p0, La/k1b;->c:Z

    .line 144
    .line 145
    iget-object v8, p0, La/k1b;->d:Ljava/lang/String;

    .line 146
    .line 147
    invoke-static/range {v3 .. v9}, La/uxs0;->c(La/uxs0;JLa/csr;ZLjava/lang/String;I)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p0, La/c8d;

    .line 158
    .line 159
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 160
    .line 161
    new-instance v0, La/v7d;

    .line 162
    .line 163
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 164
    .line 165
    .line 166
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 167
    .line 168
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_3
    check-cast v2, La/h2b;

    .line 172
    .line 173
    check-cast p1, La/k0w0;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object v3, v2, La/h2b;->J:La/uxs0;

    .line 179
    .line 180
    const/4 v6, 0x0

    .line 181
    const/4 v9, 0x6

    .line 182
    iget-wide v4, p0, La/k1b;->b:J

    .line 183
    .line 184
    iget-boolean v7, p0, La/k1b;->c:Z

    .line 185
    .line 186
    iget-object v8, p0, La/k1b;->d:Ljava/lang/String;

    .line 187
    .line 188
    invoke-static/range {v3 .. v9}, La/uxs0;->c(La/uxs0;JLa/csr;ZLjava/lang/String;I)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast p0, La/c8d;

    .line 199
    .line 200
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 201
    .line 202
    new-instance v0, La/v7d;

    .line 203
    .line 204
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 205
    .line 206
    .line 207
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 208
    .line 209
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object p0

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
