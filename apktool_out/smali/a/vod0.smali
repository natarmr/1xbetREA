.class public final synthetic La/vod0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/epd0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(BLa/epd0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/vod0;->a:B

    iput-object p2, p0, La/vod0;->b:La/epd0;

    iput-object p3, p0, La/vod0;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/epd0;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/vod0;->a:B

    iput-object p1, p0, La/vod0;->b:La/epd0;

    iput-object p2, p0, La/vod0;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/vod0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x6

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x2

    .line 8
    const/4 v6, 0x1

    .line 9
    iget-object v7, p0, La/vod0;->c:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iget-object p0, p0, La/vod0;->b:La/epd0;

    .line 12
    .line 13
    check-cast p1, La/fet;

    .line 14
    .line 15
    check-cast p2, Ljava/lang/Integer;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    and-int/lit8 v0, p2, 0x3

    .line 25
    .line 26
    if-eq v0, v5, :cond_0

    .line 27
    .line 28
    move v4, v6

    .line 29
    :cond_0
    and-int/2addr p2, v6

    .line 30
    invoke-virtual {p1, p2, v4}, La/fet;->U(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    invoke-static {p0, v7, p1, v3}, La/bww;->l(La/epd0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    and-int/lit8 v0, p2, 0x3

    .line 51
    .line 52
    if-eq v0, v5, :cond_2

    .line 53
    .line 54
    move v4, v6

    .line 55
    :cond_2
    and-int/2addr p2, v6

    .line 56
    invoke-virtual {p1, p2, v4}, La/fet;->U(IZ)Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    invoke-static {p0, v7, v2, p1, v3}, La/bww;->n(La/epd0;Lkotlin/jvm/functions/Function1;La/xdr;La/fet;I)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 67
    .line 68
    .line 69
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    and-int/lit8 v0, p2, 0x3

    .line 77
    .line 78
    if-eq v0, v5, :cond_4

    .line 79
    .line 80
    move v4, v6

    .line 81
    :cond_4
    and-int/2addr p2, v6

    .line 82
    invoke-virtual {p1, p2, v4}, La/fet;->U(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_5

    .line 87
    .line 88
    invoke-static {p0, v7, p1, v3}, La/xvw;->i(La/epd0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 93
    .line 94
    .line 95
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    and-int/lit8 v0, p2, 0x3

    .line 103
    .line 104
    if-eq v0, v5, :cond_6

    .line 105
    .line 106
    move v4, v6

    .line 107
    :cond_6
    and-int/2addr p2, v6

    .line 108
    invoke-virtual {p1, p2, v4}, La/fet;->U(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_7

    .line 113
    .line 114
    invoke-static {p0, v7, v2, p1, v3}, La/xvw;->k(La/epd0;Lkotlin/jvm/functions/Function1;La/xdr;La/fet;I)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 119
    .line 120
    .line 121
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-static {v1}, La/x8x;->L(I)I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    invoke-static {p0, v7, p1, p2}, La/bww;->l(La/epd0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 132
    .line 133
    .line 134
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {v1}, La/x8x;->L(I)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    invoke-static {p0, v7, p1, p2}, La/xvw;->i(La/epd0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 145
    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
