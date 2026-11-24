.class public final synthetic La/wrj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/udp0;


# direct methods
.method public synthetic constructor <init>(La/udp0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wrj0;->a:B

    iput-object p1, p0, La/wrj0;->b:La/udp0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/wrj0;->a:B

    .line 2
    .line 3
    sget-object v1, La/ukd;->a:La/cl5;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v8, p1

    .line 12
    check-cast v8, La/fet;

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
    if-eq p2, v3, :cond_0

    .line 23
    .line 24
    move v2, v4

    .line 25
    :cond_0
    and-int/2addr p1, v4

    .line 26
    invoke-virtual {v8, p1, v2}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    sget-object p1, La/qmk;->a:La/zcl;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/16 v7, 0xc

    .line 36
    .line 37
    sget-object v2, La/jm40;->b:La/jm40;

    .line 38
    .line 39
    const/high16 v3, 0x41000000    # 8.0f

    .line 40
    .line 41
    const/high16 v4, 0x41c00000    # 24.0f

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v1, :cond_1

    .line 53
    .line 54
    new-instance p1, La/ogj0;

    .line 55
    .line 56
    const/16 p2, 0x12

    .line 57
    .line 58
    invoke-direct {p1, p2}, La/ogj0;-><init>(B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v8, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    move-object v7, p1

    .line 65
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 66
    .line 67
    const/16 v9, 0x180

    .line 68
    .line 69
    const/4 v10, 0x0

    .line 70
    iget-object v6, p0, La/wrj0;->b:La/udp0;

    .line 71
    .line 72
    invoke-static/range {v5 .. v10}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v8}, La/fet;->X()V

    .line 77
    .line 78
    .line 79
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_0
    check-cast p1, La/fet;

    .line 83
    .line 84
    check-cast p2, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    and-int/lit8 v0, p2, 0x3

    .line 91
    .line 92
    if-eq v0, v3, :cond_3

    .line 93
    .line 94
    move v2, v4

    .line 95
    :cond_3
    and-int/2addr p2, v4

    .line 96
    invoke-virtual {p1, p2, v2}, La/fet;->U(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-eqz p2, :cond_5

    .line 101
    .line 102
    sget-object p2, La/qmk;->a:La/zcl;

    .line 103
    .line 104
    const/4 v6, 0x0

    .line 105
    const/16 v7, 0x9

    .line 106
    .line 107
    sget-object v2, La/jm40;->b:La/jm40;

    .line 108
    .line 109
    const/4 v3, 0x0

    .line 110
    const/high16 v4, 0x41c00000    # 24.0f

    .line 111
    .line 112
    const/high16 v5, 0x41000000    # 8.0f

    .line 113
    .line 114
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    if-ne p2, v1, :cond_4

    .line 123
    .line 124
    new-instance p2, La/ogj0;

    .line 125
    .line 126
    const/16 v1, 0x11

    .line 127
    .line 128
    invoke-direct {p2, v1}, La/ogj0;-><init>(B)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    move-object v2, p2

    .line 135
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 136
    .line 137
    const/16 v4, 0x180

    .line 138
    .line 139
    const/4 v5, 0x0

    .line 140
    iget-object v1, p0, La/wrj0;->b:La/udp0;

    .line 141
    .line 142
    move-object v3, p1

    .line 143
    invoke-static/range {v0 .. v5}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_5
    move-object v3, p1

    .line 148
    invoke-virtual {v3}, La/fet;->X()V

    .line 149
    .line 150
    .line 151
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p0

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
