.class public final synthetic La/p1d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLa/o2s;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/p1d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/p1d;->b:F

    iput-object p2, p0, La/p1d;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/p1d;->a:B

    iput-object p1, p0, La/p1d;->c:Ljava/lang/Object;

    iput p2, p0, La/p1d;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/p1d;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, La/p1d;->b:F

    .line 5
    .line 6
    iget-object p0, p0, La/p1d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/zyn;

    .line 12
    .line 13
    iget-object p0, p0, La/zyn;->a:La/oyq0;

    .line 14
    .line 15
    iget v0, p0, La/oyq0;->a:F

    .line 16
    .line 17
    neg-float v1, v2

    .line 18
    cmpg-float v0, v0, v1

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput v1, p0, La/oyq0;->a:F

    .line 24
    .line 25
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p0, La/xk80;

    .line 29
    .line 30
    invoke-virtual {p0}, La/xk80;->k()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0}, La/xk80;->l()F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    cmpl-float v1, p0, v2

    .line 39
    .line 40
    if-lez v1, :cond_1

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    neg-float v1, v2

    .line 46
    cmpg-float p0, p0, v1

    .line 47
    .line 48
    if-gez p0, :cond_2

    .line 49
    .line 50
    add-int/lit8 v0, v0, -0x1

    .line 51
    .line 52
    :cond_2
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_1
    check-cast p0, La/o2s;

    .line 58
    .line 59
    iget-object p0, p0, La/o2s;->d:La/t33;

    .line 60
    .line 61
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    mul-float/2addr p0, v2

    .line 72
    invoke-static {p0, v1, v2}, La/l1e0;->c(FFF)F

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    :goto_2
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_2
    check-cast p0, La/rv2;

    .line 82
    .line 83
    iget-object p0, p0, La/rv2;->f:La/agk0;

    .line 84
    .line 85
    invoke-virtual {p0}, La/agk0;->l()F

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    move p0, v1

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    invoke-virtual {p0}, La/agk0;->l()F

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    :goto_3
    div-float/2addr p0, v2

    .line 102
    const/high16 v0, 0x3f800000    # 1.0f

    .line 103
    .line 104
    sub-float p0, v0, p0

    .line 105
    .line 106
    invoke-static {p0, v1, v0}, La/l1e0;->c(FFF)F

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    goto :goto_2

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
