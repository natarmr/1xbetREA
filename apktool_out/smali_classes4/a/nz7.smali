.class public final synthetic La/nz7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yy7;


# direct methods
.method public synthetic constructor <init>(La/yy7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nz7;->a:B

    iput-object p1, p0, La/nz7;->b:La/yy7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nz7;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/nz7;->b:La/yy7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/yy7;->a:La/w08;

    .line 9
    .line 10
    iget-object v0, p0, La/w08;->b:La/t33;

    .line 11
    .line 12
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p0, p0, La/w08;->a:F

    .line 23
    .line 24
    div-float/2addr v0, p0

    .line 25
    const/high16 p0, 0x3f800000    # 1.0f

    .line 26
    .line 27
    sub-float/2addr p0, v0

    .line 28
    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_0
    iget-object p0, p0, La/yy7;->a:La/w08;

    .line 34
    .line 35
    iget-object p0, p0, La/w08;->d:La/t33;

    .line 36
    .line 37
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    goto :goto_0

    .line 48
    :pswitch_1
    iget-object p0, p0, La/yy7;->a:La/w08;

    .line 49
    .line 50
    iget-object p0, p0, La/w08;->c:La/t33;

    .line 51
    .line 52
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/lang/Number;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    goto :goto_0

    .line 63
    :pswitch_2
    iget-object p0, p0, La/yy7;->f:La/t33;

    .line 64
    .line 65
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    goto :goto_0

    .line 76
    :pswitch_3
    iget-object p0, p0, La/yy7;->a:La/w08;

    .line 77
    .line 78
    iget-object p0, p0, La/w08;->b:La/t33;

    .line 79
    .line 80
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    goto :goto_0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
