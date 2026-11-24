.class public final synthetic La/k1i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m1i0;


# direct methods
.method public synthetic constructor <init>(La/m1i0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k1i0;->a:B

    iput-object p1, p0, La/k1i0;->b:La/m1i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/k1i0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/k1i0;->b:La/m1i0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/m1i0;->O1:La/cge0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/m1i0;->G0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/iec;->a:La/iec;

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
    sget-object v0, La/m1i0;->O1:La/cge0;

    .line 23
    .line 24
    new-instance v0, La/q0h0;

    .line 25
    .line 26
    iget-object p0, p0, La/m1i0;->M1:La/a8z;

    .line 27
    .line 28
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, La/oci;

    .line 33
    .line 34
    iget-object p0, p0, La/oci;->i:La/n5d0;

    .line 35
    .line 36
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/nci;

    .line 41
    .line 42
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_1
    sget-object v0, La/m1i0;->O1:La/cge0;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    instance-of v1, v0, La/af3;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    check-cast v0, La/af3;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move-object v0, v2

    .line 68
    :goto_0
    const-class v1, La/lec;

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/o5d0;

    .line 81
    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, La/ze3;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    move-object v0, v2

    .line 92
    :goto_1
    instance-of v3, v0, La/lec;

    .line 93
    .line 94
    if-nez v3, :cond_2

    .line 95
    .line 96
    move-object v0, v2

    .line 97
    :cond_2
    check-cast v0, La/lec;

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object v4, v0, La/lec;->a:La/iip;

    .line 109
    .line 110
    iget-object v5, v0, La/lec;->b:La/mne;

    .line 111
    .line 112
    iget-object v8, v0, La/lec;->e:La/g2v;

    .line 113
    .line 114
    iget-object v7, v0, La/lec;->d:La/x0u;

    .line 115
    .line 116
    iget-object v9, v0, La/lec;->g:La/ii;

    .line 117
    .line 118
    iget-object p0, v0, La/lec;->c:La/m1e;

    .line 119
    .line 120
    iget-object v11, v0, La/lec;->f:La/ctf0;

    .line 121
    .line 122
    iget-object v6, v0, La/lec;->h:La/duj;

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance v3, La/oci;

    .line 137
    .line 138
    invoke-direct/range {v3 .. v11}, La/oci;-><init>(La/iip;La/mne;La/duj;La/x0u;La/g2v;La/ii;La/i1w0;La/ctf0;)V

    .line 139
    .line 140
    .line 141
    move-object v2, v3

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 144
    .line 145
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :goto_2
    return-object v2

    .line 153
    :pswitch_2
    sget-object v0, La/m1i0;->O1:La/cge0;

    .line 154
    .line 155
    invoke-virtual {p0}, La/m1i0;->G0()La/k3t0;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    sget-object v0, La/cec;->a:La/cec;

    .line 160
    .line 161
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_3
    sget-object v0, La/m1i0;->O1:La/cge0;

    .line 168
    .line 169
    invoke-virtual {p0}, La/m1i0;->G0()La/k3t0;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    sget-object v0, La/dec;->a:La/dec;

    .line 174
    .line 175
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object p0

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
