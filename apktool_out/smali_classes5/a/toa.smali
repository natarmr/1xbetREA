.class public final synthetic La/toa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xoa;


# direct methods
.method public synthetic constructor <init>(La/xoa;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/toa;->a:B

    iput-object p1, p0, La/toa;->b:La/xoa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/toa;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, La/toa;->b:La/xoa;

    .line 10
    .line 11
    check-cast p1, La/y5d;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p2, La/mm40;

    .line 17
    .line 18
    check-cast p3, La/fet;

    .line 19
    .line 20
    check-cast p4, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-static {p4, p1, p2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    and-int/lit8 p4, p1, 0x30

    .line 27
    .line 28
    if-nez p4, :cond_1

    .line 29
    .line 30
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p4

    .line 34
    if-eqz p4, :cond_0

    .line 35
    .line 36
    move v1, v2

    .line 37
    :cond_0
    or-int/2addr p1, v1

    .line 38
    :cond_1
    and-int/lit16 p4, p1, 0x91

    .line 39
    .line 40
    const/16 v0, 0x90

    .line 41
    .line 42
    if-eq p4, v0, :cond_2

    .line 43
    .line 44
    move v4, v3

    .line 45
    :cond_2
    and-int/2addr p1, v3

    .line 46
    invoke-virtual {p3, p1, v4}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    iget-object p0, p0, La/xoa;->b:La/ao8;

    .line 53
    .line 54
    invoke-static {p2, p0, p3}, La/unh0;->i(La/mm40;La/ao8;La/fet;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-virtual {p3}, La/fet;->X()V

    .line 59
    .line 60
    .line 61
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    move-object v5, p2

    .line 65
    check-cast v5, La/mm40;

    .line 66
    .line 67
    check-cast p3, La/fet;

    .line 68
    .line 69
    check-cast p4, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-static {p4, p1, v5}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    and-int/lit8 p4, p2, 0x6

    .line 76
    .line 77
    if-nez p4, :cond_5

    .line 78
    .line 79
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p4

    .line 83
    if-eqz p4, :cond_4

    .line 84
    .line 85
    const/4 p4, 0x4

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    const/4 p4, 0x2

    .line 88
    :goto_1
    or-int/2addr p4, p2

    .line 89
    goto :goto_2

    .line 90
    :cond_5
    move p4, p2

    .line 91
    :goto_2
    and-int/lit8 p2, p2, 0x30

    .line 92
    .line 93
    if-nez p2, :cond_7

    .line 94
    .line 95
    invoke-virtual {p3, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_6

    .line 100
    .line 101
    move v1, v2

    .line 102
    :cond_6
    or-int/2addr p4, v1

    .line 103
    :cond_7
    and-int/lit16 p2, p4, 0x93

    .line 104
    .line 105
    const/16 v0, 0x92

    .line 106
    .line 107
    if-eq p2, v0, :cond_8

    .line 108
    .line 109
    move p2, v3

    .line 110
    goto :goto_3

    .line 111
    :cond_8
    move p2, v4

    .line 112
    :goto_3
    and-int/2addr p4, v3

    .line 113
    invoke-virtual {p3, p4, p2}, La/fet;->U(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eqz p2, :cond_9

    .line 118
    .line 119
    sget-object p2, La/qmk;->a:La/zcl;

    .line 120
    .line 121
    const/4 v9, 0x0

    .line 122
    const/16 v10, 0xd

    .line 123
    .line 124
    const/4 v6, 0x0

    .line 125
    const/high16 v7, 0x41000000    # 8.0f

    .line 126
    .line 127
    const/4 v8, 0x0

    .line 128
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-static {p1, p2}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iget-object p0, p0, La/xoa;->a:La/j1v0;

    .line 137
    .line 138
    invoke-static {p1, p0, p3, v4}, La/wpm0;->h(La/mm40;La/j1v0;La/fet;I)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_9
    invoke-virtual {p3}, La/fet;->X()V

    .line 143
    .line 144
    .line 145
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
