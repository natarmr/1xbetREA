.class public final synthetic La/sz7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sz7;->a:B

    iput-object p1, p0, La/sz7;->b:La/l7m0;

    iput-object p2, p0, La/sz7;->c:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/sz7;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iget-object v2, p0, La/sz7;->c:La/l7m0;

    .line 6
    .line 7
    iget-object p0, p0, La/sz7;->b:La/l7m0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v3, p1

    .line 13
    check-cast v3, La/fhl;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget p1, La/yom;->d:F

    .line 19
    .line 20
    invoke-interface {v3, p1}, La/w6k;->w0(F)F

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, La/y3d;

    .line 29
    .line 30
    iget-wide v0, p1, La/y3d;->a:J

    .line 31
    .line 32
    sget p1, La/yom;->c:F

    .line 33
    .line 34
    const/high16 v4, 0x40000000    # 2.0f

    .line 35
    .line 36
    div-float/2addr p1, v4

    .line 37
    invoke-interface {v3, p1}, La/w6k;->w0(F)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    div-float v4, v5, v4

    .line 42
    .line 43
    sub-float/2addr p1, v4

    .line 44
    new-instance v4, La/vtm0;

    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    const/16 v10, 0x1e

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    invoke-direct/range {v4 .. v10}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 53
    .line 54
    .line 55
    const/16 v11, 0x6c

    .line 56
    .line 57
    const-wide/16 v7, 0x0

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    move v6, p1

    .line 61
    move-object v10, v4

    .line 62
    move-wide v4, v0

    .line 63
    invoke-static/range {v3 .. v11}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, La/ycl;

    .line 71
    .line 72
    iget p1, p1, La/ycl;->a:F

    .line 73
    .line 74
    sget-object v0, La/qmk;->a:La/zcl;

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-static {p1, v0}, La/ycl;->a(FF)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-lez p1, :cond_0

    .line 82
    .line 83
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, La/y3d;

    .line 88
    .line 89
    iget-wide v4, p0, La/y3d;->a:J

    .line 90
    .line 91
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, La/ycl;

    .line 96
    .line 97
    iget p0, p0, La/ycl;->a:F

    .line 98
    .line 99
    invoke-interface {v3, p0}, La/w6k;->w0(F)F

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    sget-object v10, La/l0q;->a:La/l0q;

    .line 104
    .line 105
    const/16 v11, 0x6c

    .line 106
    .line 107
    const-wide/16 v7, 0x0

    .line 108
    .line 109
    const/4 v9, 0x0

    .line 110
    invoke-static/range {v3 .. v11}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 111
    .line 112
    .line 113
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_0
    check-cast p1, La/uag0;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Ljava/lang/Number;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    sub-float/2addr v1, v0

    .line 142
    mul-float/2addr v1, p0

    .line 143
    invoke-virtual {p1, v1}, La/uag0;->b(F)V

    .line 144
    .line 145
    .line 146
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_1
    check-cast p1, La/uag0;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    check-cast p0, Ljava/lang/Number;

    .line 159
    .line 160
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    sub-float p0, v1, p0

    .line 165
    .line 166
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    check-cast v0, Ljava/lang/Number;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    sub-float/2addr v1, v0

    .line 177
    mul-float/2addr v1, p0

    .line 178
    invoke-virtual {p1, v1}, La/uag0;->b(F)V

    .line 179
    .line 180
    .line 181
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
