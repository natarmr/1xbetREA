.class public final synthetic La/qlh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/slh0;


# direct methods
.method public synthetic constructor <init>(La/slh0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qlh0;->a:B

    iput-object p1, p0, La/qlh0;->b:La/slh0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/qlh0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/qlh0;->b:La/slh0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/slh0;->O1:La/cge0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/slh0;->G0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/ekh0;->a:La/ekh0;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    sget-object v0, La/slh0;->O1:La/cge0;

    .line 23
    .line 24
    invoke-virtual {p0}, La/slh0;->G0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/dkh0;->a:La/dkh0;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    sget-object v0, La/slh0;->O1:La/cge0;

    .line 37
    .line 38
    invoke-virtual {p0}, La/slh0;->G0()La/k3t0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v0, La/bkh0;->a:La/bkh0;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_2
    sget-object v0, La/slh0;->O1:La/cge0;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    instance-of v1, v0, La/af3;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    check-cast v0, La/af3;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move-object v0, v2

    .line 72
    :goto_0
    const-class v1, La/tlh0;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/o5d0;

    .line 85
    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/ze3;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move-object v0, v2

    .line 96
    :goto_1
    instance-of v3, v0, La/tlh0;

    .line 97
    .line 98
    if-nez v3, :cond_2

    .line 99
    .line 100
    move-object v0, v2

    .line 101
    :cond_2
    check-cast v0, La/tlh0;

    .line 102
    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v7, v0, La/tlh0;->a:La/qu;

    .line 113
    .line 114
    iget-object v9, v0, La/tlh0;->c:La/mne;

    .line 115
    .line 116
    iget-object v8, v0, La/tlh0;->b:La/duj;

    .line 117
    .line 118
    iget-object v4, v0, La/tlh0;->d:La/lef0;

    .line 119
    .line 120
    iget-object v10, v0, La/tlh0;->e:La/m1e;

    .line 121
    .line 122
    iget-object v11, v0, La/tlh0;->f:La/wdk0;

    .line 123
    .line 124
    iget-object p0, v0, La/tlh0;->g:La/ii;

    .line 125
    .line 126
    iget-object v12, v0, La/tlh0;->h:La/g2v;

    .line 127
    .line 128
    iget-object v5, v0, La/tlh0;->i:La/d1p;

    .line 129
    .line 130
    iget-object v13, v0, La/tlh0;->j:La/ctf0;

    .line 131
    .line 132
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    new-instance v3, La/vsi;

    .line 148
    .line 149
    invoke-direct/range {v3 .. v13}, La/vsi;-><init>(La/lef0;La/d1p;La/i1w0;La/qu;La/duj;La/mne;La/m1e;La/wdk0;La/g2v;La/ctf0;)V

    .line 150
    .line 151
    .line 152
    move-object v2, v3

    .line 153
    goto :goto_2

    .line 154
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 155
    .line 156
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :goto_2
    return-object v2

    .line 164
    :pswitch_3
    sget-object v0, La/slh0;->O1:La/cge0;

    .line 165
    .line 166
    new-instance v0, La/q0h0;

    .line 167
    .line 168
    iget-object p0, p0, La/slh0;->N1:La/a8z;

    .line 169
    .line 170
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast p0, La/vsi;

    .line 175
    .line 176
    iget-object p0, p0, La/vsi;->k:La/n5d0;

    .line 177
    .line 178
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    check-cast p0, La/usi;

    .line 183
    .line 184
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 185
    .line 186
    .line 187
    return-object v0

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
