.class public final synthetic La/vv50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/w2d;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/w2d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/vv50;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vv50;->b:La/l7m0;

    iput-object p2, p0, La/vv50;->c:La/w2d;

    iput-object p3, p0, La/vv50;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/w2d;Lkotlin/jvm/functions/Function1;La/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/vv50;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vv50;->c:La/w2d;

    iput-object p2, p0, La/vv50;->d:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/vv50;->b:La/l7m0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/vv50;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/vv50;->b:La/l7m0;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v10, p1

    .line 12
    check-cast v10, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    and-int/lit8 p2, p1, 0x3

    .line 21
    .line 22
    if-eq p2, v1, :cond_0

    .line 23
    .line 24
    move v4, v2

    .line 25
    :cond_0
    and-int/2addr p1, v2

    .line 26
    invoke-virtual {v10, p1, v4}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/jrc0;

    .line 37
    .line 38
    invoke-interface {p1}, La/jrc0;->a()La/shc0;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    instance-of p1, p1, La/hrc0;

    .line 47
    .line 48
    xor-int/lit8 v7, p1, 0x1

    .line 49
    .line 50
    const/16 v11, 0x1000

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    iget-object v8, p0, La/vv50;->c:La/w2d;

    .line 54
    .line 55
    iget-object v9, p0, La/vv50;->d:Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    invoke-static/range {v5 .. v11}, La/q0x;->v(La/mm40;La/shc0;ZLa/w2d;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {v10}, La/fet;->X()V

    .line 62
    .line 63
    .line 64
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_0
    check-cast p1, La/fet;

    .line 68
    .line 69
    check-cast p2, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    and-int/lit8 v0, p2, 0x3

    .line 76
    .line 77
    if-eq v0, v1, :cond_2

    .line 78
    .line 79
    move v0, v2

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move v0, v4

    .line 82
    :goto_1
    and-int/2addr p2, v2

    .line 83
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    if-eqz p2, :cond_7

    .line 88
    .line 89
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    move-object v0, p2

    .line 94
    check-cast v0, La/dw50;

    .line 95
    .line 96
    iget-object p2, p0, La/vv50;->d:Lkotlin/jvm/functions/Function1;

    .line 97
    .line 98
    invoke-virtual {p1, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    sget-object v3, La/ukd;->a:La/cl5;

    .line 107
    .line 108
    if-nez v1, :cond_3

    .line 109
    .line 110
    if-ne v2, v3, :cond_4

    .line 111
    .line 112
    :cond_3
    new-instance v2, La/w250;

    .line 113
    .line 114
    const/16 v1, 0x1d

    .line 115
    .line 116
    invoke-direct {v2, p2, v1}, La/w250;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 123
    .line 124
    invoke-virtual {p1, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    if-nez v1, :cond_5

    .line 133
    .line 134
    if-ne v5, v3, :cond_6

    .line 135
    .line 136
    :cond_5
    new-instance v5, La/xv50;

    .line 137
    .line 138
    invoke-direct {v5, p2, v4}, La/xv50;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_6
    move-object v3, v5

    .line 145
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 146
    .line 147
    const/16 v5, 0x40

    .line 148
    .line 149
    iget-object v1, p0, La/vv50;->c:La/w2d;

    .line 150
    .line 151
    move-object v4, p1

    .line 152
    invoke-static/range {v0 .. v5}, La/gq80;->h(La/dw50;La/w2d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_7
    move-object v4, p1

    .line 157
    invoke-virtual {v4}, La/fet;->X()V

    .line 158
    .line 159
    .line 160
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
