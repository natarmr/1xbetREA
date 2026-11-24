.class public final synthetic La/i6s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p92;


# direct methods
.method public synthetic constructor <init>(La/p92;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i6s0;->a:B

    iput-object p1, p0, La/i6s0;->b:La/p92;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/i6s0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/i6s0;->b:La/p92;

    .line 4
    .line 5
    check-cast p1, La/fee;

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
    iget-object p1, p0, La/p92;->d:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, La/fee;

    .line 20
    .line 21
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    move-object v0, p1

    .line 26
    check-cast v0, La/s7s0;

    .line 27
    .line 28
    iget-object p1, p0, La/p92;->f:La/n0o0;

    .line 29
    .line 30
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, La/fee;

    .line 35
    .line 36
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    iget-object v3, p0, La/p92;->b:La/ctf0;

    .line 47
    .line 48
    iget-object p0, p0, La/p92;->e:La/n0o0;

    .line 49
    .line 50
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/fee;

    .line 55
    .line 56
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    move-object v4, p0

    .line 61
    check-cast v4, Ljava/lang/String;

    .line 62
    .line 63
    const/4 v5, 0x1

    .line 64
    invoke-static/range {v0 .. v5}, La/lvm0;->g(La/s7s0;JLa/ctf0;Ljava/lang/String;Z)La/i4;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, La/p92;->d:La/n0o0;

    .line 73
    .line 74
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, La/fee;

    .line 79
    .line 80
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, La/s7s0;

    .line 85
    .line 86
    iget-object v0, p0, La/p92;->g:La/n0o0;

    .line 87
    .line 88
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/fee;

    .line 93
    .line 94
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, La/gqt0;

    .line 99
    .line 100
    instance-of v1, p1, La/q7s0;

    .line 101
    .line 102
    if-eqz v1, :cond_0

    .line 103
    .line 104
    sget-object v1, La/gqt0;->h:La/gqt0;

    .line 105
    .line 106
    if-eq v0, v1, :cond_0

    .line 107
    .line 108
    invoke-static {v0}, La/vsm0;->B(La/gqt0;)La/hqt0;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast p1, La/q7s0;

    .line 113
    .line 114
    iget-object p1, p1, La/q7s0;->a:La/gu1;

    .line 115
    .line 116
    iget-object v2, p1, La/gu1;->b:La/z1s0;

    .line 117
    .line 118
    new-instance v3, La/mtl;

    .line 119
    .line 120
    new-instance v4, La/itl;

    .line 121
    .line 122
    new-instance v5, La/wul;

    .line 123
    .line 124
    sget-object v6, La/iul;->e:La/iul;

    .line 125
    .line 126
    sget-object v7, La/oe9;->a:La/oe9;

    .line 127
    .line 128
    new-instance v8, La/ue9;

    .line 129
    .line 130
    iget-object p1, p1, La/gu1;->o:La/lf9;

    .line 131
    .line 132
    iget-object v9, p0, La/p92;->b:La/ctf0;

    .line 133
    .line 134
    invoke-static {p1, v0, v9}, La/unh0;->o0(La/lf9;La/gqt0;La/ctf0;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-direct {v8, p1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object p0, p0, La/p92;->j:La/n0o0;

    .line 142
    .line 143
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    check-cast p0, La/fee;

    .line 148
    .line 149
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    check-cast p0, Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    const/4 v11, 0x1

    .line 160
    const/4 v9, 0x1

    .line 161
    invoke-direct/range {v5 .. v11}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 162
    .line 163
    .line 164
    sget-object p0, La/otr0;->c:La/otr0;

    .line 165
    .line 166
    invoke-direct {v4, v5, p0}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 167
    .line 168
    .line 169
    filled-new-array {v4}, [La/itl;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-static {p0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-direct {v3, p0}, La/mtl;-><init>(La/a4x;)V

    .line 178
    .line 179
    .line 180
    new-instance p0, La/ci;

    .line 181
    .line 182
    invoke-direct {p0, v3, v1, v2}, La/ci;-><init>(La/mtl;La/hqt0;La/z1s0;)V

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_0
    const/4 p0, 0x0

    .line 187
    :goto_0
    return-object p0

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
