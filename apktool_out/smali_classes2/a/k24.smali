.class public final La/k24;
.super La/ir20;
.source "SourceFile"


# instance fields
.field public final f:La/ar20;


# direct methods
.method public constructor <init>(La/v9d;La/y78;Lkotlin/ranges/IntRange;II)V
    .locals 7

    .line 1
    sget-object v0, La/wb;->P:La/ar20;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, La/y78;

    .line 7
    .line 8
    invoke-direct {v1, p2}, La/y78;-><init>(La/y78;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v1, p1}, La/ir20;-><init>(La/y78;La/v9d;)V

    .line 12
    .line 13
    .line 14
    iget p1, p2, La/y78;->b:I

    .line 15
    .line 16
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, La/sgi0;

    .line 21
    .line 22
    new-instance v3, Lkotlin/ranges/IntRange;

    .line 23
    .line 24
    iget v4, p3, Lkotlin/ranges/a;->a:I

    .line 25
    .line 26
    add-int v5, p1, v4

    .line 27
    .line 28
    iget p3, p3, Lkotlin/ranges/a;->b:I

    .line 29
    .line 30
    add-int/2addr p1, p3

    .line 31
    const/4 v6, 0x1

    .line 32
    add-int/2addr p1, v6

    .line 33
    invoke-direct {v3, v5, p1, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 34
    .line 35
    .line 36
    sget-object v5, La/cy2;->O:La/ar20;

    .line 37
    .line 38
    invoke-direct {v2, v3, v5}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    if-eq p1, p4, :cond_0

    .line 45
    .line 46
    new-instance v2, La/sgi0;

    .line 47
    .line 48
    new-instance v3, Lkotlin/ranges/IntRange;

    .line 49
    .line 50
    invoke-direct {v3, p1, p4, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 51
    .line 52
    .line 53
    sget-object p1, La/cy2;->P:La/ar20;

    .line 54
    .line 55
    invoke-direct {v2, v3, p1}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    :cond_0
    if-eq p4, p5, :cond_1

    .line 62
    .line 63
    new-instance p1, La/sgi0;

    .line 64
    .line 65
    new-instance v2, Lkotlin/ranges/IntRange;

    .line 66
    .line 67
    invoke-direct {v2, p4, p5, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p1, v2, v5}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p2, p1}, La/y78;->b(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    sub-int/2addr p3, v4

    .line 84
    add-int/2addr p3, v6

    .line 85
    packed-switch p3, :pswitch_data_0

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_0
    sget-object v0, La/wb;->O:La/ar20;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :pswitch_1
    sget-object v0, La/wb;->N:La/ar20;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_2
    sget-object v0, La/wb;->M:La/ar20;

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :pswitch_3
    sget-object v0, La/wb;->L:La/ar20;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :pswitch_4
    sget-object v0, La/wb;->K:La/ar20;

    .line 102
    .line 103
    :goto_0
    :pswitch_5
    iput-object v0, p0, La/k24;->f:La/ar20;

    .line 104
    .line 105
    return-void

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public final d()La/ar20;
    .locals 0

    .line 1
    iget-object p0, p0, La/k24;->f:La/ar20;

    .line 2
    .line 3
    return-object p0
.end method
