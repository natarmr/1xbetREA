.class public final synthetic La/tt2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(FLa/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/tt2;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/tt2;->c:F

    iput-object p2, p0, La/tt2;->b:La/l7m0;

    return-void
.end method

.method public synthetic constructor <init>(La/l7m0;FB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/tt2;->a:B

    iput-object p1, p0, La/tt2;->b:La/l7m0;

    iput p2, p0, La/tt2;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/tt2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iget v3, p0, La/tt2;->c:F

    .line 7
    .line 8
    iget-object p0, p0, La/tt2;->b:La/l7m0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    div-float/2addr p0, v3

    .line 24
    sub-float p0, v2, p0

    .line 25
    .line 26
    invoke-static {p0, v1, v2}, La/l1e0;->c(FFF)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_0
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    sub-float/2addr v2, p0

    .line 46
    mul-float/2addr v2, v3

    .line 47
    new-instance p0, La/ycl;

    .line 48
    .line 49
    invoke-direct {p0, v2}, La/ycl;-><init>(F)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_1
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    div-float/2addr p0, v3

    .line 64
    sub-float p0, v2, p0

    .line 65
    .line 66
    invoke-static {p0, v1, v2}, La/l1e0;->c(FFF)F

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_2
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    div-float/2addr p0, v3

    .line 86
    sub-float p0, v2, p0

    .line 87
    .line 88
    invoke-static {p0, v1, v2}, La/l1e0;->c(FFF)F

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
