.class public final synthetic La/zxo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/byo;


# direct methods
.method public synthetic constructor <init>(La/byo;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zxo;->a:B

    iput-object p1, p0, La/zxo;->b:La/byo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/zxo;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zxo;->b:La/byo;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/byo;->P1:La/bek;

    .line 9
    .line 10
    invoke-virtual {p0}, La/byo;->H0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/mxo;->a:La/mxo;

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
    sget-object v0, La/byo;->P1:La/bek;

    .line 23
    .line 24
    invoke-virtual {p0}, La/byo;->H0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/lxo;->a:La/lxo;

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
    sget-object v0, La/byo;->P1:La/bek;

    .line 37
    .line 38
    const v0, 0x7f130dca

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object v1, La/rek0;->b:La/rek0;

    .line 49
    .line 50
    invoke-virtual {p0, v1, v0}, La/byo;->I0(La/sek0;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_2
    sget-object v0, La/byo;->P1:La/bek;

    .line 57
    .line 58
    new-instance v0, La/q0h0;

    .line 59
    .line 60
    iget-object p0, p0, La/byo;->N1:La/a8z;

    .line 61
    .line 62
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/egi;

    .line 67
    .line 68
    iget-object p0, p0, La/egi;->g:La/n5d0;

    .line 69
    .line 70
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/dgi;

    .line 75
    .line 76
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_3
    sget-object v0, La/byo;->P1:La/bek;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    instance-of v1, v0, La/af3;

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    if-eqz v1, :cond_0

    .line 97
    .line 98
    check-cast v0, La/af3;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    move-object v0, v2

    .line 102
    :goto_0
    const-class v1, La/cyo;

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, La/o5d0;

    .line 115
    .line 116
    if-eqz v0, :cond_1

    .line 117
    .line 118
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, La/ze3;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_1
    move-object v0, v2

    .line 126
    :goto_1
    instance-of v3, v0, La/cyo;

    .line 127
    .line 128
    if-nez v3, :cond_2

    .line 129
    .line 130
    move-object v0, v2

    .line 131
    :cond_2
    check-cast v0, La/cyo;

    .line 132
    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    iget-object v1, p0, La/byo;->M1:La/yzn0;

    .line 140
    .line 141
    sget-object v2, La/byo;->Q1:[La/iiy;

    .line 142
    .line 143
    const/4 v3, 0x1

    .line 144
    aget-object v2, v2, v3

    .line 145
    .line 146
    invoke-virtual {v1, p0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    move-object v9, p0

    .line 151
    check-cast v9, La/we50;

    .line 152
    .line 153
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-object v4, v0, La/cyo;->a:La/v7i;

    .line 157
    .line 158
    iget-object v5, v0, La/cyo;->b:La/lef0;

    .line 159
    .line 160
    iget-object v6, v0, La/cyo;->c:La/epi0;

    .line 161
    .line 162
    iget-object v7, v0, La/cyo;->d:La/ok50;

    .line 163
    .line 164
    new-instance v3, La/egi;

    .line 165
    .line 166
    invoke-direct/range {v3 .. v9}, La/egi;-><init>(La/v7i;La/lef0;La/epi0;La/ok50;La/i1w0;La/we50;)V

    .line 167
    .line 168
    .line 169
    move-object v2, v3

    .line 170
    goto :goto_2

    .line 171
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 172
    .line 173
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :goto_2
    return-object v2

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
