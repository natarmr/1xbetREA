.class public final synthetic La/djs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gjs0;


# direct methods
.method public synthetic constructor <init>(La/gjs0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/djs0;->a:B

    iput-object p1, p0, La/djs0;->b:La/gjs0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/djs0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/djs0;->b:La/gjs0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/gjs0;->R1:La/j6m0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/gjs0;->G0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/bis0;->a:La/bis0;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    sget-object v0, La/gjs0;->R1:La/j6m0;

    .line 24
    .line 25
    invoke-virtual {p0}, La/gjs0;->G0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, La/cis0;->a:La/cis0;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_1
    sget-object v0, La/gjs0;->R1:La/j6m0;

    .line 38
    .line 39
    invoke-virtual {p0}, La/gjs0;->G0()La/k3t0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object v0, La/eis0;->a:La/eis0;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_2
    sget-object v0, La/gjs0;->R1:La/j6m0;

    .line 52
    .line 53
    iget-object p0, p0, La/gjs0;->K1:La/fiu0;

    .line 54
    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_0
    const-string p0, "viewModelFactory"

    .line 59
    .line 60
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :pswitch_3
    sget-object v0, La/gjs0;->R1:La/j6m0;

    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    instance-of v2, v0, La/af3;

    .line 78
    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    check-cast v0, La/af3;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move-object v0, v1

    .line 85
    :goto_0
    const-class v2, La/hjs0;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, La/o5d0;

    .line 98
    .line 99
    if-eqz v0, :cond_2

    .line 100
    .line 101
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, La/ze3;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    move-object v0, v1

    .line 109
    :goto_1
    instance-of v3, v0, La/hjs0;

    .line 110
    .line 111
    if-nez v3, :cond_3

    .line 112
    .line 113
    move-object v0, v1

    .line 114
    :cond_3
    check-cast v0, La/hjs0;

    .line 115
    .line 116
    if-eqz v0, :cond_4

    .line 117
    .line 118
    iget-object v1, p0, La/gjs0;->O1:La/khf0;

    .line 119
    .line 120
    sget-object v2, La/gjs0;->S1:[La/iiy;

    .line 121
    .line 122
    const/4 v3, 0x0

    .line 123
    aget-object v2, v2, v3

    .line 124
    .line 125
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    move-object v5, p0

    .line 130
    check-cast v5, Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;

    .line 131
    .line 132
    iget-object v2, v0, La/hjs0;->a:La/cad;

    .line 133
    .line 134
    iget-object v3, v0, La/hjs0;->e:La/pyg;

    .line 135
    .line 136
    iget-object v4, v0, La/hjs0;->h:La/iip;

    .line 137
    .line 138
    iget-object v6, v0, La/hjs0;->g:La/g2v;

    .line 139
    .line 140
    iget-object v7, v0, La/hjs0;->b:La/m1e;

    .line 141
    .line 142
    iget-object v8, v0, La/hjs0;->c:La/gii0;

    .line 143
    .line 144
    iget-object p0, v0, La/hjs0;->d:La/oeg0;

    .line 145
    .line 146
    iget-object v9, v0, La/hjs0;->f:La/ctf0;

    .line 147
    .line 148
    iget-object v10, v0, La/hjs0;->i:La/wdk0;

    .line 149
    .line 150
    iget-object v11, v0, La/hjs0;->j:La/kt2;

    .line 151
    .line 152
    iget-object v12, v0, La/hjs0;->k:La/zr1;

    .line 153
    .line 154
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    new-instance v1, La/gyi;

    .line 179
    .line 180
    invoke-direct/range {v1 .. v12}, La/gyi;-><init>(La/cad;La/pyg;La/iip;Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;La/g2v;La/m1e;La/gii0;La/ctf0;La/wdk0;La/kt2;La/zr1;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 185
    .line 186
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    :goto_2
    return-object v1

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
