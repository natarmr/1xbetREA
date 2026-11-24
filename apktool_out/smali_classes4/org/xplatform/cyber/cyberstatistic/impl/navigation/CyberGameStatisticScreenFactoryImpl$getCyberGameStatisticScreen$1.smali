.class public final Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

.field public final synthetic b:La/gr00;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;->a:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;->b:La/gr00;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;->a:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 5
    .line 6
    iget-wide v4, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 7
    .line 8
    const-wide/16 v0, 0x2

    .line 9
    .line 10
    cmp-long v0, v4, v0

    .line 11
    .line 12
    iget-object p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;->b:La/gr00;

    .line 13
    .line 14
    const/4 v13, 0x1

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, La/gr00;->b:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v1, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget v3, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->c:I

    .line 22
    .line 23
    iget v2, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->d:I

    .line 24
    .line 25
    new-instance v0, Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;

    .line 26
    .line 27
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 28
    .line 29
    .line 30
    sget-object p0, La/k210;->U1:La/atz;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance p0, La/k210;

    .line 36
    .line 37
    invoke-direct {p0}, La/k210;-><init>()V

    .line 38
    .line 39
    .line 40
    sget-object p1, La/k210;->V1:[La/iiy;

    .line 41
    .line 42
    aget-object p1, p1, v13

    .line 43
    .line 44
    iget-object v1, p0, La/k210;->R1:La/khf0;

    .line 45
    .line 46
    invoke-virtual {v1, p0, p1, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    const-wide/16 v0, 0xf

    .line 51
    .line 52
    cmp-long v0, v4, v0

    .line 53
    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    iget-object p0, p0, La/gr00;->c:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance v0, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;

    .line 59
    .line 60
    iget-object v1, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->a:Ljava/lang/String;

    .line 61
    .line 62
    move-wide v2, v4

    .line 63
    iget v4, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->c:I

    .line 64
    .line 65
    iget v5, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->d:I

    .line 66
    .line 67
    iget-object v6, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->e:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v7, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->f:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v8, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->g:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v9, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->h:Ljava/lang/String;

    .line 74
    .line 75
    iget-wide v10, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->i:J

    .line 76
    .line 77
    iget-object v12, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->j:Ljava/lang/String;

    .line 78
    .line 79
    invoke-direct/range {v0 .. v12}, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;-><init>(Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    sget-object p0, La/rwd0;->U1:La/rl70;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance p0, La/rwd0;

    .line 88
    .line 89
    invoke-direct {p0}, La/rwd0;-><init>()V

    .line 90
    .line 91
    .line 92
    sget-object p1, La/rwd0;->V1:[La/iiy;

    .line 93
    .line 94
    aget-object p1, p1, v13

    .line 95
    .line 96
    iget-object v1, p0, La/rwd0;->R1:La/khf0;

    .line 97
    .line 98
    invoke-virtual {v1, p0, p1, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 99
    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_1
    const-wide/16 v0, 0x1b

    .line 103
    .line 104
    cmp-long v0, v4, v0

    .line 105
    .line 106
    if-nez v0, :cond_2

    .line 107
    .line 108
    iget-object p0, p0, La/gr00;->d:Ljava/lang/Object;

    .line 109
    .line 110
    new-instance v0, Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;

    .line 111
    .line 112
    iget-object v1, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->a:Ljava/lang/String;

    .line 113
    .line 114
    iget v2, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->c:I

    .line 115
    .line 116
    iget v3, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->d:I

    .line 117
    .line 118
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 119
    .line 120
    .line 121
    sget-object p0, La/czt0;->U1:La/wxs0;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance p0, La/czt0;

    .line 127
    .line 128
    invoke-direct {p0}, La/czt0;-><init>()V

    .line 129
    .line 130
    .line 131
    sget-object p1, La/czt0;->V1:[La/iiy;

    .line 132
    .line 133
    aget-object p1, p1, v13

    .line 134
    .line 135
    iget-object v1, p0, La/czt0;->R1:La/khf0;

    .line 136
    .line 137
    invoke-virtual {v1, p0, p1, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 138
    .line 139
    .line 140
    return-object p0

    .line 141
    :cond_2
    const-wide/16 v0, 0x24

    .line 142
    .line 143
    cmp-long v0, v4, v0

    .line 144
    .line 145
    if-nez v0, :cond_3

    .line 146
    .line 147
    iget-object p0, p0, La/gr00;->e:Ljava/lang/Object;

    .line 148
    .line 149
    new-instance p0, Lorg/xplatform/cyber/game/mlbb/api/MlbbPostGameStatScreenParams;

    .line 150
    .line 151
    iget-object v0, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->a:Ljava/lang/String;

    .line 152
    .line 153
    iget p1, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->d:I

    .line 154
    .line 155
    invoke-direct {p0, v0, v4, v5, p1}, Lorg/xplatform/cyber/game/mlbb/api/MlbbPostGameStatScreenParams;-><init>(Ljava/lang/String;JI)V

    .line 156
    .line 157
    .line 158
    sget-object p1, La/ik40;->S1:La/uuz;

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance p1, La/ik40;

    .line 164
    .line 165
    invoke-direct {p1}, La/ik40;-><init>()V

    .line 166
    .line 167
    .line 168
    sget-object v0, La/ik40;->U1:[La/iiy;

    .line 169
    .line 170
    aget-object v0, v0, v13

    .line 171
    .line 172
    iget-object v1, p1, La/ik40;->Q1:La/khf0;

    .line 173
    .line 174
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 175
    .line 176
    .line 177
    return-object p1

    .line 178
    :cond_3
    iget-object p0, p0, La/gr00;->a:Ljava/lang/Object;

    .line 179
    .line 180
    sget-object p0, La/upg;->X1:La/kwd;

    .line 181
    .line 182
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    new-instance p0, La/upg;

    .line 186
    .line 187
    invoke-direct {p0}, La/upg;-><init>()V

    .line 188
    .line 189
    .line 190
    sget-object v0, La/upg;->Y1:[La/iiy;

    .line 191
    .line 192
    aget-object v0, v0, v13

    .line 193
    .line 194
    iget-object v1, p0, La/upg;->S1:La/khf0;

    .line 195
    .line 196
    invoke-virtual {v1, p0, v0, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 197
    .line 198
    .line 199
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;->a:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->a:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
