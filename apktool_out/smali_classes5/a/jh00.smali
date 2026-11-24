.class public final synthetic La/jh00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kh00;


# direct methods
.method public synthetic constructor <init>(La/kh00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jh00;->a:B

    iput-object p1, p0, La/jh00;->b:La/kh00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/jh00;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/jh00;->b:La/kh00;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p0, p0, La/kh00;->b:La/ctf0;

    .line 19
    .line 20
    new-instance p1, La/yw00;

    .line 21
    .line 22
    invoke-static {p0}, La/m2x;->l(La/ctf0;)La/wul;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {p1, v1, v1, p0}, La/yw00;-><init>(La/g9x;La/wul;La/wul;)V

    .line 27
    .line 28
    .line 29
    move-object v1, p1

    .line 30
    :goto_0
    return-object v1

    .line 31
    :pswitch_0
    check-cast p1, La/pn8;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, La/kh00;->b:La/ctf0;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v0, La/qn8;

    .line 42
    .line 43
    new-instance v2, La/wul;

    .line 44
    .line 45
    sget-object v3, La/iul;->e:La/iul;

    .line 46
    .line 47
    sget-object v4, La/oe9;->a:La/oe9;

    .line 48
    .line 49
    new-instance v5, La/ue9;

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    new-array v7, v6, [Ljava/lang/Object;

    .line 53
    .line 54
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 55
    .line 56
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const v7, 0x7f130528

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {v5, p0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-boolean v6, p1, La/pn8;->a:Z

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v8, 0x1

    .line 74
    invoke-direct/range {v2 .. v8}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, v2, v1}, La/qn8;-><init>(La/wul;La/wul;)V

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_1
    check-cast p1, La/cnd0;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v0, p1, La/cnd0;->a:La/nnd0;

    .line 87
    .line 88
    iget-object v1, p1, La/cnd0;->b:Ljava/lang/String;

    .line 89
    .line 90
    iget-boolean v2, p1, La/cnd0;->e:Z

    .line 91
    .line 92
    iget-object v3, p0, La/kh00;->b:La/ctf0;

    .line 93
    .line 94
    iget-object v4, p1, La/cnd0;->c:Ljava/lang/String;

    .line 95
    .line 96
    iget-boolean v5, p1, La/cnd0;->d:Z

    .line 97
    .line 98
    invoke-static/range {v0 .. v5}, La/vvw;->I(La/nnd0;Ljava/lang/String;ZLa/ctf0;Ljava/lang/String;Z)La/lnd0;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :pswitch_2
    check-cast p1, La/jx4;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object v0, p1, La/jx4;->a:La/hx4;

    .line 109
    .line 110
    iget-object p0, p0, La/kh00;->b:La/ctf0;

    .line 111
    .line 112
    iget-boolean p1, p1, La/jx4;->b:Z

    .line 113
    .line 114
    invoke-static {v0, p0, p1}, La/dwi0;->R(La/hx4;La/ctf0;Z)La/px4;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :pswitch_3
    check-cast p1, La/t6c0;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v0, p1, La/t6c0;->a:La/dzc0;

    .line 125
    .line 126
    iget-object p0, p0, La/kh00;->b:La/ctf0;

    .line 127
    .line 128
    iget-boolean p1, p1, La/t6c0;->b:Z

    .line 129
    .line 130
    invoke-static {v0, p0, p1}, La/e9x;->a0(La/dzc0;La/ctf0;Z)La/z6c0;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :pswitch_4
    check-cast p1, La/tvj0;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v0, p1, La/tvj0;->a:La/pvj0;

    .line 141
    .line 142
    iget-object p0, p0, La/kh00;->b:La/ctf0;

    .line 143
    .line 144
    iget-boolean p1, p1, La/tvj0;->b:Z

    .line 145
    .line 146
    invoke-static {v0, p0, p1}, La/d9x;->X(La/pvj0;La/ctf0;Z)La/zvj0;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_5
    check-cast p1, La/ye6;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-object v0, p1, La/ye6;->a:La/xm5;

    .line 157
    .line 158
    iget-object v1, p0, La/kh00;->b:La/ctf0;

    .line 159
    .line 160
    iget-wide v2, p1, La/ye6;->b:D

    .line 161
    .line 162
    iget-object v4, p1, La/ye6;->c:La/ko7;

    .line 163
    .line 164
    iget-boolean v5, p1, La/ye6;->d:Z

    .line 165
    .line 166
    invoke-static/range {v0 .. v5}, La/p8a;->e0(La/xm5;La/ctf0;DLa/ko7;Z)La/ef6;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :pswitch_6
    check-cast p1, La/mhp;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v0, La/m820;

    .line 177
    .line 178
    iget-object v1, p1, La/mhp;->a:La/txe;

    .line 179
    .line 180
    iget-object p0, p0, La/kh00;->b:La/ctf0;

    .line 181
    .line 182
    iget-boolean v2, p1, La/mhp;->b:Z

    .line 183
    .line 184
    iget-boolean p1, p1, La/mhp;->c:Z

    .line 185
    .line 186
    invoke-static {v1, p0, v2, p1}, La/m2x;->N(La/txe;La/ctf0;ZZ)La/cye;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-direct {v0, p0}, La/m820;-><init>(La/cye;)V

    .line 191
    .line 192
    .line 193
    return-object v0

    .line 194
    nop

    .line 195
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
