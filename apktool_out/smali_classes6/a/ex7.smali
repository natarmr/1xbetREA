.class public final La/ex7;
.super La/zx5;
.source "SourceFile"


# static fields
.field public static final q:La/ek5;


# instance fields
.field public final o:La/a530;

.field public final p:La/ms2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ek5;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ek5;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/ex7;->q:La/ek5;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/e;La/glz;La/a530;La/ms2;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/ex7;->q:La/ek5;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, v0}, La/zx5;-><init>(Landroidx/fragment/app/e;La/glz;La/dtb;)V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, La/ex7;->o:La/a530;

    .line 10
    .line 11
    iput-object p4, p0, La/ex7;->p:La/ms2;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final A(J)Z
    .locals 2

    .line 1
    iget-object p0, p0, La/zx5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yz3;

    .line 4
    .line 5
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/swm0;

    .line 32
    .line 33
    invoke-virtual {v0}, La/swm0;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    cmp-long v0, v0, p1

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public final B(I)Landroidx/fragment/app/Fragment;
    .locals 14

    .line 1
    invoke-virtual {p0, p1}, La/zx5;->G(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, La/swm0;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_4

    .line 9
    .line 10
    instance-of v1, p1, La/pwm0;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-instance v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$InsightsSubGame;

    .line 15
    .line 16
    check-cast p1, La/pwm0;

    .line 17
    .line 18
    iget-wide v3, p1, La/pwm0;->a:J

    .line 19
    .line 20
    iget-wide v5, p1, La/pwm0;->b:J

    .line 21
    .line 22
    iget-wide v7, p1, La/pwm0;->c:J

    .line 23
    .line 24
    iget-boolean v11, p1, La/pwm0;->e:Z

    .line 25
    .line 26
    iget-object v10, p1, La/pwm0;->d:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v9, p0, La/ex7;->p:La/ms2;

    .line 29
    .line 30
    invoke-direct/range {v2 .. v11}, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$InsightsSubGame;-><init>(JJJLa/ms2;Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    instance-of v1, p1, La/qwm0;

    .line 35
    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    new-instance v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;

    .line 39
    .line 40
    check-cast p1, La/qwm0;

    .line 41
    .line 42
    iget-wide v3, p1, La/qwm0;->a:J

    .line 43
    .line 44
    iget-wide v5, p1, La/qwm0;->b:J

    .line 45
    .line 46
    iget-wide v7, p1, La/qwm0;->c:J

    .line 47
    .line 48
    iget-boolean v9, p1, La/qwm0;->e:Z

    .line 49
    .line 50
    iget-object v10, p1, La/qwm0;->d:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v11, p0, La/ex7;->p:La/ms2;

    .line 53
    .line 54
    iget v12, p1, La/qwm0;->g:I

    .line 55
    .line 56
    invoke-direct/range {v2 .. v12}, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;-><init>(JJJZLjava/lang/String;La/ms2;I)V

    .line 57
    .line 58
    .line 59
    :goto_0
    iget-object p0, p0, La/ex7;->o:La/a530;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    instance-of p0, v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$InsightsSubGame;

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    if-eqz p0, :cond_1

    .line 68
    .line 69
    check-cast v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$InsightsSubGame;

    .line 70
    .line 71
    sget-object p0, La/lhx;->Y1:La/ihx;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance p0, La/lhx;

    .line 77
    .line 78
    invoke-direct {p0}, La/lhx;-><init>()V

    .line 79
    .line 80
    .line 81
    sget-object v0, La/lhx;->Z1:[La/iiy;

    .line 82
    .line 83
    aget-object p1, v0, p1

    .line 84
    .line 85
    iget-object v0, p0, La/lhx;->X1:La/khf0;

    .line 86
    .line 87
    invoke-virtual {v0, p0, p1, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 88
    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_1
    instance-of p0, v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;

    .line 92
    .line 93
    if-eqz p0, :cond_2

    .line 94
    .line 95
    sget-object p0, La/w430;->Y1:La/u430;

    .line 96
    .line 97
    check-cast v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance p0, La/w430;

    .line 103
    .line 104
    invoke-direct {p0}, La/w430;-><init>()V

    .line 105
    .line 106
    .line 107
    sget-object v0, La/w430;->Z1:[La/iiy;

    .line 108
    .line 109
    aget-object p1, v0, p1

    .line 110
    .line 111
    iget-object v0, p0, La/w430;->X1:La/khf0;

    .line 112
    .line 113
    invoke-virtual {v0, p0, p1, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 114
    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_2
    instance-of p0, v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;

    .line 118
    .line 119
    if-eqz p0, :cond_3

    .line 120
    .line 121
    sget-object p0, La/w430;->Y1:La/u430;

    .line 122
    .line 123
    new-instance v3, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;

    .line 124
    .line 125
    check-cast v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;

    .line 126
    .line 127
    iget-object v12, v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->f:La/ms2;

    .line 128
    .line 129
    const/4 v13, 0x1

    .line 130
    iget-wide v4, v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->a:J

    .line 131
    .line 132
    iget-wide v6, v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->b:J

    .line 133
    .line 134
    iget-wide v8, v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->c:J

    .line 135
    .line 136
    iget-boolean v10, v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->d:Z

    .line 137
    .line 138
    iget-object v11, v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->e:Ljava/lang/String;

    .line 139
    .line 140
    invoke-direct/range {v3 .. v13}, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;-><init>(JJJZLjava/lang/String;La/ms2;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    new-instance p0, La/w430;

    .line 147
    .line 148
    invoke-direct {p0}, La/w430;-><init>()V

    .line 149
    .line 150
    .line 151
    sget-object v0, La/w430;->Z1:[La/iiy;

    .line 152
    .line 153
    aget-object p1, v0, p1

    .line 154
    .line 155
    iget-object v0, p0, La/w430;->X1:La/khf0;

    .line 156
    .line 157
    invoke-virtual {v0, p0, p1, v3}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 162
    .line 163
    .line 164
    return-object v0

    .line 165
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 166
    .line 167
    .line 168
    return-object v0
.end method

.method public final e(I)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/zx5;->G(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/swm0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/swm0;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method
