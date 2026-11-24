.class public final synthetic La/sfz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(La/a4x;FB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sfz;->a:B

    iput-object p1, p0, La/sfz;->b:La/a4x;

    iput p2, p0, La/sfz;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/sfz;->a:B

    .line 2
    .line 3
    iget v1, p0, La/sfz;->c:F

    .line 4
    .line 5
    iget-object p0, p0, La/sfz;->b:La/a4x;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/hcz;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    new-instance v2, La/vdr0;

    .line 25
    .line 26
    const/16 v3, 0xd

    .line 27
    .line 28
    invoke-direct {v2, p0, v3}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 29
    .line 30
    .line 31
    new-instance v3, La/y1t0;

    .line 32
    .line 33
    invoke-direct {v3, p0, v1}, La/y1t0;-><init>(Ljava/util/List;F)V

    .line 34
    .line 35
    .line 36
    new-instance p0, La/ugd;

    .line 37
    .line 38
    const v1, 0x2fd4df92

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    invoke-direct {p0, v1, v4, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-virtual {p1, v0, v1, v2, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    check-cast p1, La/pi9;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object v0, La/qmk;->a:La/zcl;

    .line 58
    .line 59
    const/high16 v0, 0x41000000    # 8.0f

    .line 60
    .line 61
    invoke-virtual {p1}, La/pi9;->getDensity()F

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    mul-float/2addr v2, v0

    .line 66
    invoke-static {}, La/z03;->a()La/w03;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v3, p1, La/pi9;->a:La/y99;

    .line 71
    .line 72
    invoke-interface {v3}, La/y99;->d()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    const/16 v5, 0x20

    .line 77
    .line 78
    shr-long/2addr v3, v5

    .line 79
    long-to-int v3, v3

    .line 80
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    iget-object v3, p1, La/pi9;->a:La/y99;

    .line 85
    .line 86
    invoke-interface {v3}, La/y99;->d()J

    .line 87
    .line 88
    .line 89
    move-result-wide v3

    .line 90
    const-wide v6, 0xffffffffL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    and-long/2addr v3, v6

    .line 96
    long-to-int v3, v3

    .line 97
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    int-to-long v3, v3

    .line 106
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    int-to-long v10, v2

    .line 111
    shl-long v2, v3, v5

    .line 112
    .line 113
    and-long/2addr v10, v6

    .line 114
    or-long/2addr v2, v10

    .line 115
    shr-long v4, v2, v5

    .line 116
    .line 117
    long-to-int v4, v4

    .line 118
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    and-long/2addr v2, v6

    .line 123
    long-to-int v2, v2

    .line 124
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    const/4 v6, 0x0

    .line 129
    const/4 v7, 0x0

    .line 130
    invoke-static/range {v6 .. v11}, La/r8x;->t(FFFFFF)La/wfg0;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-static {v0, v2}, La/w03;->b(La/w03;La/wfg0;)V

    .line 135
    .line 136
    .line 137
    new-instance v2, La/ny2;

    .line 138
    .line 139
    const/16 v3, 0x8

    .line 140
    .line 141
    invoke-direct {v2, v0, p0, v1, v3}, La/ny2;-><init>(Ljava/lang/Object;Ljava/lang/Object;FB)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v2}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
