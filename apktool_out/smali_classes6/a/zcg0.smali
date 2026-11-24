.class public final La/zcg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/pz40;

.field public final synthetic b:I

.field public final synthetic c:La/edg0;

.field public final synthetic d:La/ddg0;

.field public final synthetic e:La/k6z;


# direct methods
.method public constructor <init>(La/pz40;ILa/edg0;La/ddg0;La/k6z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zcg0;->a:La/pz40;

    .line 5
    .line 6
    iput p2, p0, La/zcg0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, La/zcg0;->c:La/edg0;

    .line 9
    .line 10
    iput-object p4, p0, La/zcg0;->d:La/ddg0;

    .line 11
    .line 12
    iput-object p5, p0, La/zcg0;->e:La/k6z;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/fhl;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/zcg0;->a:La/pz40;

    .line 8
    .line 9
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, La/apm;

    .line 14
    .line 15
    iget p1, p1, La/apm;->c:I

    .line 16
    .line 17
    iget v1, p0, La/zcg0;->b:I

    .line 18
    .line 19
    iget-object v2, p0, La/zcg0;->c:La/edg0;

    .line 20
    .line 21
    if-ne p1, v1, :cond_0

    .line 22
    .line 23
    iget-wide v1, v2, La/edg0;->a:J

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-wide v1, v2, La/edg0;->b:J

    .line 27
    .line 28
    :goto_0
    sget-object p1, La/qmk;->a:La/zcl;

    .line 29
    .line 30
    const/high16 p1, 0x41800000    # 16.0f

    .line 31
    .line 32
    invoke-interface {v0, p1}, La/w6k;->w0(F)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    int-to-long v3, v3

    .line 41
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    int-to-long v5, p1

    .line 46
    const/16 p1, 0x20

    .line 47
    .line 48
    shl-long/2addr v3, p1

    .line 49
    const-wide v11, 0xffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr v5, v11

    .line 55
    or-long v7, v3, v5

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    const/16 v10, 0xf6

    .line 59
    .line 60
    const-wide/16 v3, 0x0

    .line 61
    .line 62
    const-wide/16 v5, 0x0

    .line 63
    .line 64
    invoke-static/range {v0 .. v10}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, La/zcg0;->d:La/ddg0;

    .line 68
    .line 69
    invoke-interface {v1}, La/ddg0;->a()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    const/high16 v1, 0x41400000    # 12.0f

    .line 76
    .line 77
    invoke-interface {v0, v1}, La/w6k;->T(F)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    int-to-float v1, v1

    .line 82
    iget-object p0, p0, La/zcg0;->e:La/k6z;

    .line 83
    .line 84
    sget-object v2, La/k6z;->b:La/k6z;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    if-ne p0, v2, :cond_1

    .line 88
    .line 89
    move p0, v3

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-interface {v0}, La/fhl;->d()J

    .line 92
    .line 93
    .line 94
    move-result-wide v4

    .line 95
    shr-long/2addr v4, p1

    .line 96
    long-to-int p0, v4

    .line 97
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    sub-float/2addr p0, v1

    .line 102
    :goto_1
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    int-to-long v4, p0

    .line 107
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    int-to-long v2, p0

    .line 112
    shl-long/2addr v4, p1

    .line 113
    and-long/2addr v2, v11

    .line 114
    or-long/2addr v2, v4

    .line 115
    shr-long v4, v2, p1

    .line 116
    .line 117
    long-to-int p0, v4

    .line 118
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    const/high16 v4, 0x40000000    # 2.0f

    .line 123
    .line 124
    div-float/2addr v1, v4

    .line 125
    add-float/2addr p0, v1

    .line 126
    and-long/2addr v2, v11

    .line 127
    long-to-int v2, v2

    .line 128
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    add-float/2addr v2, v1

    .line 133
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    int-to-long v3, p0

    .line 138
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    int-to-long v5, p0

    .line 143
    shl-long p0, v3, p1

    .line 144
    .line 145
    and-long v2, v5, v11

    .line 146
    .line 147
    or-long v4, p0, v2

    .line 148
    .line 149
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 150
    .line 151
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 152
    .line 153
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 154
    .line 155
    .line 156
    move-result-wide p0

    .line 157
    const/4 v7, 0x0

    .line 158
    const/16 v8, 0x38

    .line 159
    .line 160
    const/4 v6, 0x0

    .line 161
    move v3, v1

    .line 162
    move-wide v1, p0

    .line 163
    invoke-static/range {v0 .. v8}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 164
    .line 165
    .line 166
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object p0
.end method
