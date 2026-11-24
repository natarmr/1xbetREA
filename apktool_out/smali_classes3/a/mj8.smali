.class public final La/mj8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r9u;


# direct methods
.method public constructor <init>(La/r9u;B)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/mj8;->a:La/r9u;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/mj8;->a:La/r9u;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/mj8;->a:La/r9u;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/udl0;La/fet;I)V
    .locals 8

    .line 1
    const v0, 0x5fe0360e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p2, v0}, La/fet;->e(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int/2addr v0, p3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v0, p3

    .line 27
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 28
    .line 29
    if-nez v1, :cond_4

    .line 30
    .line 31
    and-int/lit8 v1, p3, 0x40

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    :goto_2
    if-eqz v1, :cond_3

    .line 45
    .line 46
    const/16 v1, 0x20

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_3
    const/16 v1, 0x10

    .line 50
    .line 51
    :goto_3
    or-int/2addr v0, v1

    .line 52
    :cond_4
    and-int/lit8 v1, v0, 0x13

    .line 53
    .line 54
    const/16 v2, 0x12

    .line 55
    .line 56
    if-eq v1, v2, :cond_5

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    goto :goto_4

    .line 60
    :cond_5
    const/4 v1, 0x0

    .line 61
    :goto_4
    and-int/lit8 v2, v0, 0x1

    .line 62
    .line 63
    invoke-virtual {p2, v2, v1}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_7

    .line 68
    .line 69
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object v2, La/ukd;->a:La/cl5;

    .line 74
    .line 75
    if-ne v1, v2, :cond_6

    .line 76
    .line 77
    sget-object v1, La/ygp;->o1:La/ygp;

    .line 78
    .line 79
    iget-object v2, p0, La/mj8;->a:La/r9u;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 90
    .line 91
    invoke-virtual {v2, v1}, La/m1q0;->d(La/ygp;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {p2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    check-cast v1, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    shl-int/lit8 v0, v0, 0x3

    .line 109
    .line 110
    and-int/lit8 v0, v0, 0x70

    .line 111
    .line 112
    or-int/lit16 v6, v0, 0x180

    .line 113
    .line 114
    const/4 v7, 0x1

    .line 115
    const/4 v2, 0x0

    .line 116
    move-object v3, p1

    .line 117
    move-object v5, p2

    .line 118
    invoke-static/range {v2 .. v7}, La/tfx;->e(La/mm40;La/udl0;ZLa/fet;II)V

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_7
    move-object v3, p1

    .line 123
    move-object v5, p2

    .line 124
    invoke-virtual {v5}, La/fet;->X()V

    .line 125
    .line 126
    .line 127
    :goto_5
    invoke-virtual {v5}, La/fet;->u()La/yfe0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-eqz p1, :cond_8

    .line 132
    .line 133
    new-instance p2, La/dlw;

    .line 134
    .line 135
    const/16 v0, 0xf

    .line 136
    .line 137
    invoke-direct {p2, p0, v3, p3, v0}, La/dlw;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 138
    .line 139
    .line 140
    iput-object p2, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 141
    .line 142
    :cond_8
    return-void
.end method

.method public b()Lorg/xplatform/toto_bet/core/navigation/a;
    .locals 1

    .line 1
    new-instance v0, Lorg/xplatform/toto_bet/core/navigation/a;

    .line 2
    .line 3
    iget-object p0, p0, La/mj8;->a:La/r9u;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lorg/xplatform/toto_bet/core/navigation/a;-><init>(La/r9u;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
