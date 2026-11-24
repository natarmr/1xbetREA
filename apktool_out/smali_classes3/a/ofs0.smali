.class public final synthetic La/ofs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wfs0;


# direct methods
.method public synthetic constructor <init>(La/wfs0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ofs0;->a:B

    iput-object p1, p0, La/ofs0;->b:La/wfs0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ofs0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ofs0;->b:La/wfs0;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/wfs0;->w:La/duj;

    .line 14
    .line 15
    new-instance v1, La/efr0;

    .line 16
    .line 17
    const/16 v2, 0x16

    .line 18
    .line 19
    invoke-direct {v1, v2}, La/efr0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 26
    .line 27
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 37
    .line 38
    move-object v2, p1

    .line 39
    check-cast v2, La/ifs0;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    const/16 v10, 0x1ed

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    sget-object v4, La/igs0;->a:La/igs0;

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    invoke-static/range {v2 .. v10}, La/ifs0;->a(La/ifs0;ZLa/lgs0;La/ql5;ZLjava/util/List;Ljava/util/List;Ljava/util/List;I)La/ifs0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_0

    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, La/wfs0;->w:La/duj;

    .line 71
    .line 72
    new-instance v1, La/efr0;

    .line 73
    .line 74
    const/16 v2, 0x17

    .line 75
    .line 76
    invoke-direct {v1, v2}, La/efr0;-><init>(B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 83
    .line 84
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 85
    .line 86
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 94
    .line 95
    move-object v2, p1

    .line 96
    check-cast v2, La/ifs0;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const/4 v9, 0x0

    .line 102
    const/16 v10, 0x1ef

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    const/4 v4, 0x0

    .line 106
    const/4 v5, 0x0

    .line 107
    const/4 v6, 0x0

    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    invoke-static/range {v2 .. v10}, La/ifs0;->a(La/ifs0;ZLa/lgs0;La/ql5;ZLjava/util/List;Ljava/util/List;Ljava/util/List;I)La/ifs0;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_1

    .line 119
    .line 120
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 127
    .line 128
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 129
    .line 130
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 138
    .line 139
    move-object v2, p1

    .line 140
    check-cast v2, La/ifs0;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    const/4 v9, 0x0

    .line 146
    const/16 v10, 0x1ef

    .line 147
    .line 148
    const/4 v3, 0x0

    .line 149
    const/4 v4, 0x0

    .line 150
    const/4 v5, 0x0

    .line 151
    const/4 v6, 0x0

    .line 152
    const/4 v7, 0x0

    .line 153
    const/4 v8, 0x0

    .line 154
    invoke-static/range {v2 .. v10}, La/ifs0;->a(La/ifs0;ZLa/lgs0;La/ql5;ZLjava/util/List;Ljava/util/List;Ljava/util/List;I)La/ifs0;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_2

    .line 163
    .line 164
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object p0, p0, La/wfs0;->w:La/duj;

    .line 171
    .line 172
    new-instance v0, La/efr0;

    .line 173
    .line 174
    const/16 v1, 0x15

    .line 175
    .line 176
    invoke-direct {v0, v1}, La/efr0;-><init>(B)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 180
    .line 181
    .line 182
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
