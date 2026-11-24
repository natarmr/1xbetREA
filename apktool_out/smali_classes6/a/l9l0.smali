.class public final synthetic La/l9l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h3n;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/h3n;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l9l0;->a:B

    iput-object p1, p0, La/l9l0;->b:La/h3n;

    iput-object p2, p0, La/l9l0;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/l9l0;->a:B

    .line 2
    .line 3
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 4
    .line 5
    .line 6
    const-string v2, "invalid weight; must be greater than zero"

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    const/high16 v5, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x2

    .line 14
    const/4 v8, 0x1

    .line 15
    iget-object v9, p0, La/l9l0;->c:Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    iget-object p0, p0, La/l9l0;->b:La/h3n;

    .line 18
    .line 19
    check-cast p1, La/fet;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    and-int/lit8 v0, p2, 0x3

    .line 31
    .line 32
    if-eq v0, v7, :cond_0

    .line 33
    .line 34
    move v6, v8

    .line 35
    :cond_0
    and-int/2addr p2, v8

    .line 36
    invoke-virtual {p1, p2, v6}, La/fet;->U(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_3

    .line 41
    .line 42
    float-to-double v6, v5

    .line 43
    cmpl-double p2, v6, v3

    .line 44
    .line 45
    if-lez p2, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-static {v2}, La/vcx;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    new-instance p2, La/x7z;

    .line 52
    .line 53
    cmpl-float v0, v5, v1

    .line 54
    .line 55
    if-lez v0, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v1, v5

    .line 59
    :goto_1
    invoke-direct {p2, v1, v8}, La/x7z;-><init>(FZ)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, La/h3n;->f:La/ial0;

    .line 63
    .line 64
    invoke-static {p2, p0, v9, p1}, La/azw;->v(La/mm40;La/ial0;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 69
    .line 70
    .line 71
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 75
    .line 76
    if-eq v0, v7, :cond_4

    .line 77
    .line 78
    move v6, v8

    .line 79
    :cond_4
    and-int/2addr p2, v8

    .line 80
    invoke-virtual {p1, p2, v6}, La/fet;->U(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-eqz p2, :cond_7

    .line 85
    .line 86
    float-to-double v6, v5

    .line 87
    cmpl-double p2, v6, v3

    .line 88
    .line 89
    if-lez p2, :cond_5

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    invoke-static {v2}, La/vcx;->a(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :goto_3
    new-instance p2, La/x7z;

    .line 96
    .line 97
    cmpl-float v0, v5, v1

    .line 98
    .line 99
    if-lez v0, :cond_6

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    move v1, v5

    .line 103
    :goto_4
    invoke-direct {p2, v1, v8}, La/x7z;-><init>(FZ)V

    .line 104
    .line 105
    .line 106
    iget-object p0, p0, La/h3n;->e:La/ial0;

    .line 107
    .line 108
    invoke-static {p2, p0, v9, p1}, La/azw;->v(La/mm40;La/ial0;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 109
    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 113
    .line 114
    .line 115
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
