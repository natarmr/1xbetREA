.class public final synthetic La/eda0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hda0;


# direct methods
.method public synthetic constructor <init>(La/hda0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eda0;->a:B

    iput-object p1, p0, La/eda0;->b:La/hda0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/eda0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/eda0;->b:La/hda0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/hda0;->R1:La/mi70;

    .line 10
    .line 11
    invoke-virtual {p0}, La/hda0;->G0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/rca0;->a:La/rca0;

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
    sget-object v0, La/hda0;->R1:La/mi70;

    .line 24
    .line 25
    invoke-virtual {p0}, La/hda0;->G0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, La/sca0;->a:La/sca0;

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
    sget-object v0, La/hda0;->R1:La/mi70;

    .line 38
    .line 39
    invoke-virtual {p0}, La/hda0;->G0()La/k3t0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object v0, La/uca0;->a:La/uca0;

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
    sget-object v0, La/hda0;->R1:La/mi70;

    .line 52
    .line 53
    iget-object p0, p0, La/hda0;->K1:La/fiu0;

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
    sget-object v0, La/hda0;->R1:La/mi70;

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
    const-class v2, La/ida0;

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
    instance-of v3, v0, La/ida0;

    .line 110
    .line 111
    if-nez v3, :cond_3

    .line 112
    .line 113
    move-object v0, v1

    .line 114
    :cond_3
    check-cast v0, La/ida0;

    .line 115
    .line 116
    if-eqz v0, :cond_4

    .line 117
    .line 118
    iget-object v1, p0, La/hda0;->O1:La/khf0;

    .line 119
    .line 120
    sget-object v2, La/hda0;->S1:[La/iiy;

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
    move-object v4, p0

    .line 130
    check-cast v4, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;

    .line 131
    .line 132
    iget-object v2, v0, La/ida0;->a:La/cad;

    .line 133
    .line 134
    iget-object v3, v0, La/ida0;->d:La/pyg;

    .line 135
    .line 136
    iget-object p0, v0, La/ida0;->g:La/iip;

    .line 137
    .line 138
    iget-object v5, v0, La/ida0;->f:La/g2v;

    .line 139
    .line 140
    iget-object v6, v0, La/ida0;->b:La/m1e;

    .line 141
    .line 142
    iget-object v7, v0, La/ida0;->c:La/gii0;

    .line 143
    .line 144
    iget-object v8, v0, La/ida0;->e:La/ctf0;

    .line 145
    .line 146
    iget-object v9, v0, La/ida0;->h:La/wdk0;

    .line 147
    .line 148
    iget-object v10, v0, La/ida0;->i:La/ih5;

    .line 149
    .line 150
    iget-object v11, v0, La/ida0;->j:La/zr1;

    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    new-instance v1, La/goi;

    .line 171
    .line 172
    invoke-direct/range {v1 .. v11}, La/goi;-><init>(La/cad;La/pyg;Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;La/g2v;La/m1e;La/gii0;La/ctf0;La/wdk0;La/ih5;La/zr1;)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 177
    .line 178
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :goto_2
    return-object v1

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
