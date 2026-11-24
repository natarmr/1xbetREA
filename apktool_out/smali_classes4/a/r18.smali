.class public final synthetic La/r18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:La/t33;


# direct methods
.method public synthetic constructor <init>(ZLa/t33;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r18;->a:B

    iput-boolean p1, p0, La/r18;->b:Z

    iput-object p2, p0, La/r18;->c:La/t33;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/r18;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/r18;->c:La/t33;

    .line 4
    .line 5
    iget-boolean p0, p0, La/r18;->b:Z

    .line 6
    .line 7
    const/high16 v2, -0x3f400000    # -6.0f

    .line 8
    .line 9
    const/high16 v3, 0x41a00000    # 20.0f

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/high16 v5, 0x3f800000    # 1.0f

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget p0, La/t18;->n:F

    .line 20
    .line 21
    neg-float p0, p0

    .line 22
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-float/2addr v0, v2

    .line 33
    div-float/2addr v0, v3

    .line 34
    invoke-static {v0, v4, v5}, La/l1e0;->c(FFF)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    mul-float/2addr v0, p0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz p0, :cond_1

    .line 51
    .line 52
    sget-object p0, La/qmk;->a:La/zcl;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    sget p0, La/t18;->j:F

    .line 56
    .line 57
    sub-float/2addr v0, v2

    .line 58
    div-float/2addr v0, v3

    .line 59
    invoke-static {v0, v4, v5}, La/l1e0;->c(FFF)F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    mul-float v4, v0, p0

    .line 64
    .line 65
    :goto_0
    move v0, v4

    .line 66
    :goto_1
    new-instance p0, La/ycl;

    .line 67
    .line 68
    invoke-direct {p0, v0}, La/ycl;-><init>(F)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_0
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz p0, :cond_2

    .line 83
    .line 84
    sget-object p0, La/qmk;->a:La/zcl;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    sget p0, La/t18;->i:F

    .line 88
    .line 89
    sub-float/2addr v0, v2

    .line 90
    div-float/2addr v0, v3

    .line 91
    invoke-static {v0, v4, v5}, La/l1e0;->c(FFF)F

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    mul-float v4, v0, p0

    .line 96
    .line 97
    :goto_2
    neg-float p0, v4

    .line 98
    new-instance v0, La/ycl;

    .line 99
    .line 100
    invoke-direct {v0, p0}, La/ycl;-><init>(F)V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_1
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz p0, :cond_3

    .line 115
    .line 116
    sget-object p0, La/qmk;->a:La/zcl;

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_3
    sget p0, La/t18;->j:F

    .line 120
    .line 121
    sub-float/2addr v0, v2

    .line 122
    div-float/2addr v0, v3

    .line 123
    invoke-static {v0, v4, v5}, La/l1e0;->c(FFF)F

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    mul-float v4, v0, p0

    .line 128
    .line 129
    :goto_3
    new-instance p0, La/ycl;

    .line 130
    .line 131
    invoke-direct {p0, v4}, La/ycl;-><init>(F)V

    .line 132
    .line 133
    .line 134
    return-object p0

    .line 135
    :pswitch_2
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Ljava/lang/Number;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz p0, :cond_4

    .line 146
    .line 147
    sget-object p0, La/qmk;->a:La/zcl;

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_4
    sget p0, La/t18;->i:F

    .line 151
    .line 152
    sub-float/2addr v0, v2

    .line 153
    div-float/2addr v0, v3

    .line 154
    invoke-static {v0, v4, v5}, La/l1e0;->c(FFF)F

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    mul-float v4, v0, p0

    .line 159
    .line 160
    :goto_4
    neg-float p0, v4

    .line 161
    new-instance v0, La/ycl;

    .line 162
    .line 163
    invoke-direct {v0, p0}, La/ycl;-><init>(F)V

    .line 164
    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
