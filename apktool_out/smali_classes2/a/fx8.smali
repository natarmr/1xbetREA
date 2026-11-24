.class public final synthetic La/fx8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FFLa/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/fx8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/fx8;->b:F

    iput p2, p0, La/fx8;->c:F

    iput-object p3, p0, La/fx8;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/o2s;FF)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/fx8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fx8;->d:Ljava/lang/Object;

    iput p2, p0, La/fx8;->b:F

    iput p3, p0, La/fx8;->c:F

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/fx8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, La/fx8;->c:F

    .line 5
    .line 6
    iget v3, p0, La/fx8;->b:F

    .line 7
    .line 8
    iget-object p0, p0, La/fx8;->d:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, La/o2s;

    .line 14
    .line 15
    iget-object v0, p0, La/o2s;->c:La/t33;

    .line 16
    .line 17
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    cmpg-float v0, v0, v1

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    sub-float/2addr v2, v3

    .line 32
    iget-object p0, p0, La/o2s;->d:La/t33;

    .line 33
    .line 34
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    mul-float/2addr p0, v2

    .line 45
    add-float/2addr v3, p0

    .line 46
    :cond_0
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_0
    check-cast p0, La/l7m0;

    .line 56
    .line 57
    sub-float/2addr v3, v2

    .line 58
    cmpg-float v0, v3, v1

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    mul-float/2addr p0, v3

    .line 84
    add-float/2addr p0, v2

    .line 85
    invoke-static {p0}, La/si30;->b(F)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    int-to-float p0, p0

    .line 90
    sub-float/2addr p0, v2

    .line 91
    div-float/2addr p0, v3

    .line 92
    :goto_0
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
        :pswitch_0
    .end packed-switch
.end method
