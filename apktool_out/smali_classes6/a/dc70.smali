.class public final synthetic La/dc70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mkw;


# direct methods
.method public synthetic constructor <init>(La/mkw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dc70;->a:B

    iput-object p1, p0, La/dc70;->b:La/mkw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/dc70;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/dc70;->b:La/mkw;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/zb70;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v2, La/yb70;

    .line 15
    .line 16
    iget-boolean v12, p1, La/zb70;->a:Z

    .line 17
    .line 18
    iget-object p0, p0, La/mkw;->b:La/ctf0;

    .line 19
    .line 20
    new-array p1, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 23
    .line 24
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const v0, 0x7f130876

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v11

    .line 35
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 36
    .line 37
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 38
    .line 39
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite20-0d7_KjU()J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack70-0d7_KjU()J

    .line 52
    .line 53
    .line 54
    move-result-wide v9

    .line 55
    invoke-direct/range {v2 .. v12}, La/yb70;-><init>(JJJJLjava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :pswitch_0
    check-cast p1, La/y870;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v2, La/a970;

    .line 65
    .line 66
    iget-boolean v0, p1, La/y870;->a:Z

    .line 67
    .line 68
    iget-object v3, p1, La/y870;->b:La/ql5;

    .line 69
    .line 70
    iget-boolean v4, p1, La/y870;->e:Z

    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    if-nez v0, :cond_0

    .line 74
    .line 75
    iget-boolean v0, p1, La/y870;->d:Z

    .line 76
    .line 77
    if-nez v0, :cond_0

    .line 78
    .line 79
    iget-boolean v0, p1, La/y870;->f:Z

    .line 80
    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    if-eqz v4, :cond_0

    .line 84
    .line 85
    iget-boolean v0, p1, La/y870;->h:Z

    .line 86
    .line 87
    if-nez v0, :cond_0

    .line 88
    .line 89
    move-object v0, v3

    .line 90
    move v3, v5

    .line 91
    goto :goto_0

    .line 92
    :cond_0
    move-object v0, v3

    .line 93
    move v3, v1

    .line 94
    :goto_0
    iget-wide v6, v0, La/ql5;->a:J

    .line 95
    .line 96
    const-wide/16 v8, 0x0

    .line 97
    .line 98
    cmp-long v8, v6, v8

    .line 99
    .line 100
    if-eqz v8, :cond_1

    .line 101
    .line 102
    if-eqz v4, :cond_1

    .line 103
    .line 104
    move v4, v5

    .line 105
    goto :goto_1

    .line 106
    :cond_1
    move v4, v1

    .line 107
    :goto_1
    iget-boolean v8, p1, La/y870;->g:Z

    .line 108
    .line 109
    if-eqz v8, :cond_2

    .line 110
    .line 111
    iget p1, p1, La/y870;->c:I

    .line 112
    .line 113
    if-le p1, v5, :cond_2

    .line 114
    .line 115
    const-wide/16 v8, -0x2

    .line 116
    .line 117
    cmp-long p1, v6, v8

    .line 118
    .line 119
    if-eqz p1, :cond_2

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_2
    move v5, v1

    .line 123
    :goto_2
    new-instance v6, La/sd;

    .line 124
    .line 125
    sget-object p1, La/pn40;->a:La/pn40;

    .line 126
    .line 127
    iget-wide v7, v0, La/ql5;->b:D

    .line 128
    .line 129
    sget-object p1, La/p3u0;->c:La/p3u0;

    .line 130
    .line 131
    invoke-static {v7, v8, p1}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iget-object v0, v0, La/ql5;->f:Ljava/lang/String;

    .line 136
    .line 137
    iget-object v7, p0, La/mkw;->b:La/ctf0;

    .line 138
    .line 139
    new-array v8, v1, [Ljava/lang/Object;

    .line 140
    .line 141
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 142
    .line 143
    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const v8, 0x7f13115a

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v8, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-direct {v6, p1, v0, v1}, La/sd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object p0, p0, La/mkw;->g:Ljava/lang/Object;

    .line 158
    .line 159
    move-object v7, p0

    .line 160
    check-cast v7, La/r2v0;

    .line 161
    .line 162
    invoke-direct/range {v2 .. v7}, La/a970;-><init>(ZZZLa/sd;La/r2v0;)V

    .line 163
    .line 164
    .line 165
    return-object v2

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
