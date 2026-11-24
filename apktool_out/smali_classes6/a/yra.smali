.class public final synthetic La/yra;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bzl;


# direct methods
.method public synthetic constructor <init>(La/bzl;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yra;->a:B

    iput-object p1, p0, La/yra;->b:La/bzl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/yra;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x41c00000    # 24.0f

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iget-object p0, p0, La/yra;->b:La/bzl;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/bzl;->f:La/a8z;

    .line 13
    .line 14
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, La/l7m0;

    .line 19
    .line 20
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    sub-float/2addr v2, p0

    .line 31
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_0
    iget-object p0, p0, La/bzl;->f:La/a8z;

    .line 37
    .line 38
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, La/l7m0;

    .line 43
    .line 44
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    sub-float/2addr v2, p0

    .line 55
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_1
    iget-object p0, p0, La/bzl;->a:La/oyq0;

    .line 61
    .line 62
    iget-object v0, p0, La/oyq0;->c:La/agk0;

    .line 63
    .line 64
    invoke-virtual {v0}, La/agk0;->l()F

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, La/oyq0;->a()F

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :pswitch_2
    new-instance v0, La/yra;

    .line 77
    .line 78
    const/4 v1, 0x3

    .line 79
    invoke-direct {v0, p0, v1}, La/yra;-><init>(La/bzl;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :pswitch_3
    sget-object v0, La/qmk;->a:La/zcl;

    .line 88
    .line 89
    iget-object p0, p0, La/bzl;->f:La/a8z;

    .line 90
    .line 91
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, La/l7m0;

    .line 96
    .line 97
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    sub-float/2addr v2, p0

    .line 108
    mul-float/2addr v2, v1

    .line 109
    new-instance p0, La/ycl;

    .line 110
    .line 111
    invoke-direct {p0, v2}, La/ycl;-><init>(F)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_4
    sget-object v0, La/qmk;->a:La/zcl;

    .line 116
    .line 117
    iget-object p0, p0, La/bzl;->f:La/a8z;

    .line 118
    .line 119
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, La/l7m0;

    .line 124
    .line 125
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, Ljava/lang/Number;

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    sub-float/2addr v2, p0

    .line 136
    mul-float/2addr v2, v1

    .line 137
    new-instance p0, La/ycl;

    .line 138
    .line 139
    invoke-direct {p0, v2}, La/ycl;-><init>(F)V

    .line 140
    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
