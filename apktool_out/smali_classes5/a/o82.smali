.class public final synthetic La/o82;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f3d;

.field public final synthetic c:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/f3d;La/l7m0;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/o82;->a:B

    iput-object p1, p0, La/o82;->b:La/f3d;

    iput-object p2, p0, La/o82;->c:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/l7m0;La/f3d;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/o82;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o82;->c:La/l7m0;

    iput-object p2, p0, La/o82;->b:La/f3d;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/o82;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x12

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, p0, La/o82;->c:La/l7m0;

    .line 10
    .line 11
    iget-object p0, p0, La/o82;->b:La/f3d;

    .line 12
    .line 13
    check-cast p1, La/mm40;

    .line 14
    .line 15
    check-cast p2, La/fet;

    .line 16
    .line 17
    check-cast p3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    sget-object v0, La/fpk0;->V1:La/zie0;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    and-int/lit8 v0, p3, 0x6

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    move v3, v4

    .line 42
    :cond_0
    or-int/2addr p3, v3

    .line 43
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 44
    .line 45
    if-eq v0, v2, :cond_2

    .line 46
    .line 47
    move v1, v5

    .line 48
    :cond_2
    and-int/lit8 v0, p3, 0x1

    .line 49
    .line 50
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, La/wnk0;

    .line 61
    .line 62
    and-int/lit8 p3, p3, 0xe

    .line 63
    .line 64
    invoke-static {p1, v0, p0, p2, p3}, La/m2x;->j(La/mm40;La/wnk0;La/f3d;La/fet;I)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 69
    .line 70
    .line 71
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_0
    sget-object v0, La/fpk0;->V1:La/zie0;

    .line 75
    .line 76
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
    move v1, v5

    .line 96
    :cond_6
    and-int/lit8 v0, p3, 0x1

    .line 97
    .line 98
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, La/z1d;

    .line 109
    .line 110
    and-int/lit8 p3, p3, 0xe

    .line 111
    .line 112
    invoke-static {p1, v0, p0, p2, p3}, La/dub;->g(La/mm40;La/z1d;La/f3d;La/fet;I)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 117
    .line 118
    .line 119
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_1
    sget-object v0, La/y82;->V1:La/qek0;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    and-int/lit8 v0, p3, 0x6

    .line 128
    .line 129
    if-nez v0, :cond_9

    .line 130
    .line 131
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    move v3, v4

    .line 138
    :cond_8
    or-int/2addr p3, v3

    .line 139
    :cond_9
    and-int/lit8 v0, p3, 0x13

    .line 140
    .line 141
    if-eq v0, v2, :cond_a

    .line 142
    .line 143
    move v1, v5

    .line 144
    :cond_a
    and-int/lit8 v0, p3, 0x1

    .line 145
    .line 146
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_b

    .line 151
    .line 152
    and-int/lit8 p3, p3, 0xe

    .line 153
    .line 154
    invoke-static {p1, v6, p0, p2, p3}, La/wvb;->d(La/mm40;La/l7m0;La/f3d;La/fet;I)V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_b
    invoke-virtual {p2}, La/fet;->X()V

    .line 159
    .line 160
    .line 161
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
