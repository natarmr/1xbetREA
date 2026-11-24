.class public final synthetic La/rt2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(FB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rt2;->a:B

    iput p1, p0, La/rt2;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/rt2;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x42c80000    # 100.0f

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget p0, p0, La/rt2;->b:F

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sub-float/2addr p0, v1

    .line 14
    div-float/2addr p0, v1

    .line 15
    invoke-static {p0, v3, v2}, La/l1e0;->c(FFF)F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_1
    sub-float/2addr p0, v1

    .line 30
    div-float/2addr p0, v1

    .line 31
    invoke-static {p0, v3, v2}, La/l1e0;->c(FFF)F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_2
    sub-float/2addr p0, v1

    .line 41
    div-float/2addr p0, v1

    .line 42
    invoke-static {p0, v3, v2}, La/l1e0;->c(FFF)F

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_3
    sget-object v0, La/qmk;->a:La/zcl;

    .line 52
    .line 53
    const/high16 v0, 0x42600000    # 56.0f

    .line 54
    .line 55
    add-float/2addr v0, p0

    .line 56
    new-instance p0, La/ycl;

    .line 57
    .line 58
    invoke-direct {p0, v0}, La/ycl;-><init>(F)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_4
    sget-object v0, La/qmk;->a:La/zcl;

    .line 63
    .line 64
    const/high16 v0, 0x439d0000    # 314.0f

    .line 65
    .line 66
    add-float/2addr v0, p0

    .line 67
    new-instance p0, La/ycl;

    .line 68
    .line 69
    invoke-direct {p0, v0}, La/ycl;-><init>(F)V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_5
    sub-float/2addr p0, v1

    .line 74
    div-float/2addr p0, v1

    .line 75
    invoke-static {p0, v3, v2}, La/l1e0;->c(FFF)F

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :pswitch_6
    invoke-static {p0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_7
    invoke-static {p0, v3, v2}, La/l1e0;->c(FFF)F

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_8
    new-instance v0, La/oyq0;

    .line 99
    .line 100
    invoke-direct {v0, p0, v3, v3}, La/oyq0;-><init>(FFF)V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_9
    invoke-static {p0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_a
    invoke-static {p0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
