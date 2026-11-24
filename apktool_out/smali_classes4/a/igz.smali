.class public final synthetic La/igz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jgz;


# direct methods
.method public synthetic constructor <init>(La/jgz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/igz;->a:B

    iput-object p1, p0, La/igz;->b:La/jgz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/igz;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/igz;->b:La/jgz;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/jgz;->Q1:La/tqt;

    .line 10
    .line 11
    invoke-virtual {p0}, La/jgz;->G0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/cfz;->a:La/cfz;

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
    sget-object v0, La/jgz;->Q1:La/tqt;

    .line 24
    .line 25
    invoke-virtual {p0}, La/jgz;->G0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, La/dfz;->a:La/dfz;

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
    sget-object v0, La/jgz;->Q1:La/tqt;

    .line 38
    .line 39
    iget-object p0, p0, La/jgz;->K1:La/fiu0;

    .line 40
    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_0
    const-string p0, "viewModelFactory"

    .line 45
    .line 46
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :pswitch_2
    sget-object v0, La/jgz;->Q1:La/tqt;

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
    instance-of v2, v0, La/af3;

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    check-cast v0, La/af3;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move-object v0, v1

    .line 71
    :goto_0
    const-class v2, La/afz;

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, La/o5d0;

    .line 84
    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/ze3;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    move-object v0, v1

    .line 95
    :goto_1
    instance-of v3, v0, La/afz;

    .line 96
    .line 97
    if-nez v3, :cond_3

    .line 98
    .line 99
    move-object v0, v1

    .line 100
    :cond_3
    check-cast v0, La/afz;

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    iget-object v1, p0, La/jgz;->M1:La/khf0;

    .line 105
    .line 106
    sget-object v2, La/jgz;->R1:[La/iiy;

    .line 107
    .line 108
    const/4 v3, 0x0

    .line 109
    aget-object v2, v2, v3

    .line 110
    .line 111
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    move-object v6, p0

    .line 116
    check-cast v6, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 117
    .line 118
    iget-object p0, v0, La/afz;->a:La/oeg0;

    .line 119
    .line 120
    iget-object v5, v0, La/afz;->b:La/m1e;

    .line 121
    .line 122
    iget-object v2, v0, La/afz;->c:La/cad;

    .line 123
    .line 124
    iget-object v3, v0, La/afz;->d:La/pyg;

    .line 125
    .line 126
    iget-object v1, v0, La/afz;->e:La/xri;

    .line 127
    .line 128
    iget-object v7, v0, La/afz;->g:La/ctf0;

    .line 129
    .line 130
    iget-object v8, v0, La/afz;->h:La/g2v;

    .line 131
    .line 132
    iget-object v4, v0, La/afz;->f:La/iip;

    .line 133
    .line 134
    iget-object v9, v0, La/afz;->i:La/wdk0;

    .line 135
    .line 136
    iget-object v10, v0, La/afz;->j:La/kt2;

    .line 137
    .line 138
    iget-object v11, v0, La/afz;->k:La/zr1;

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-instance v1, La/nji;

    .line 165
    .line 166
    invoke-direct/range {v1 .. v11}, La/nji;-><init>(La/cad;La/pyg;La/iip;La/m1e;Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;La/ctf0;La/g2v;La/wdk0;La/kt2;La/zr1;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 171
    .line 172
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :goto_2
    return-object v1

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
