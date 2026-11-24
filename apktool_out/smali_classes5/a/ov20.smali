.class public final synthetic La/ov20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mfm;

.field public final synthetic c:La/nfm;


# direct methods
.method public synthetic constructor <init>(La/mfm;La/nfm;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ov20;->a:B

    iput-object p1, p0, La/ov20;->b:La/mfm;

    iput-object p2, p0, La/ov20;->c:La/nfm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ov20;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x4

    .line 9
    sget-object v5, La/jm40;->b:La/jm40;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v7, p0, La/ov20;->c:La/nfm;

    .line 13
    .line 14
    iget-object p0, p0, La/ov20;->b:La/mfm;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    check-cast p1, La/yhg0;

    .line 18
    .line 19
    check-cast p2, La/fet;

    .line 20
    .line 21
    check-cast p3, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    and-int/lit8 v0, p3, 0x6

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    move v3, v4

    .line 44
    :cond_0
    or-int/2addr p3, v3

    .line 45
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 46
    .line 47
    if-eq v0, v2, :cond_2

    .line 48
    .line 49
    move v0, v6

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move v0, v8

    .line 52
    :goto_0
    and-int/2addr p3, v6

    .line 53
    invoke-virtual {p2, p3, v0}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-eqz p3, :cond_3

    .line 58
    .line 59
    const p3, 0x3f266666    # 0.65f

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, p3, v5, v6}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1, p0, v7, p2, v8}, La/l7x;->p(La/mm40;La/mfm;La/nfm;La/fet;I)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 71
    .line 72
    .line 73
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    and-int/lit8 v0, p3, 0x6

    .line 80
    .line 81
    if-nez v0, :cond_5

    .line 82
    .line 83
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    move v3, v4

    .line 90
    :cond_4
    or-int/2addr p3, v3

    .line 91
    :cond_5
    and-int/lit8 v0, p3, 0x13

    .line 92
    .line 93
    if-eq v0, v2, :cond_6

    .line 94
    .line 95
    move v0, v6

    .line 96
    goto :goto_2

    .line 97
    :cond_6
    move v0, v8

    .line 98
    :goto_2
    and-int/2addr p3, v6

    .line 99
    invoke-virtual {p2, p3, v0}, La/fet;->U(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    if-eqz p3, :cond_7

    .line 104
    .line 105
    invoke-interface {p1, v1, v5, v6}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {p1, p0, v7, p2, v8}, La/l7x;->p(La/mm40;La/mfm;La/nfm;La/fet;I)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 114
    .line 115
    .line 116
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    and-int/lit8 p1, p3, 0x11

    .line 123
    .line 124
    const/16 v0, 0x10

    .line 125
    .line 126
    if-eq p1, v0, :cond_8

    .line 127
    .line 128
    move v8, v6

    .line 129
    :cond_8
    and-int/lit8 p1, p3, 0x1

    .line 130
    .line 131
    invoke-virtual {p2, p1, v8}, La/fet;->U(IZ)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-eqz p1, :cond_9

    .line 136
    .line 137
    invoke-static {v5, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const/4 p3, 0x6

    .line 142
    invoke-static {p1, p0, v7, p2, p3}, La/l7x;->p(La/mm40;La/mfm;La/nfm;La/fet;I)V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_9
    invoke-virtual {p2}, La/fet;->X()V

    .line 147
    .line 148
    .line 149
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
