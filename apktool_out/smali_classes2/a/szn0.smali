.class public final synthetic La/szn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xcz;

.field public final synthetic c:La/xcz;


# direct methods
.method public synthetic constructor <init>(La/xcz;La/xcz;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/szn0;->a:B

    iput-object p1, p0, La/szn0;->b:La/xcz;

    iput-object p2, p0, La/szn0;->c:La/xcz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/szn0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/szn0;->c:La/xcz;

    .line 4
    .line 5
    iget-object p0, p0, La/szn0;->b:La/xcz;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    neg-float p1, p1

    .line 17
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/ywj;->e(F)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {v1, p1}, La/xcz;->e(F)F

    .line 24
    .line 25
    .line 26
    :goto_0
    neg-float p0, p0

    .line 27
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_0
    neg-float p1, p1

    .line 33
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ywj;->e(F)F

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    iget-object v0, v1, La/xcz;->j:La/ywj;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, La/ywj;->e(F)F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    cmpl-float v0, v0, v1

    .line 54
    .line 55
    if-ltz v0, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move p0, p1

    .line 59
    goto :goto_0

    .line 60
    :pswitch_1
    neg-float p1, p1

    .line 61
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, La/ywj;->e(F)F

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    iget-object v0, v1, La/xcz;->j:La/ywj;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, La/ywj;->e(F)F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    cmpl-float v0, v0, v1

    .line 82
    .line 83
    if-ltz v0, :cond_0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
