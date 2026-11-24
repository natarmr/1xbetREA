.class public final synthetic La/lfe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ehm0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/ehm0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lfe;->a:B

    iput-object p1, p0, La/lfe;->b:La/ehm0;

    iput-object p2, p0, La/lfe;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/lfe;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/lfe;->c:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iget-object p0, p0, La/lfe;->b:La/ehm0;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    check-cast p1, La/zdz;

    .line 12
    .line 13
    check-cast p2, La/fet;

    .line 14
    .line 15
    check-cast p3, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    and-int/lit8 p1, p3, 0x11

    .line 25
    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    if-eq p1, v1, :cond_0

    .line 30
    .line 31
    move p1, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move p1, v4

    .line 34
    :goto_0
    and-int/2addr p3, v2

    .line 35
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    sget-object p1, La/qmk;->a:La/zcl;

    .line 42
    .line 43
    const/high16 v9, 0x41000000    # 8.0f

    .line 44
    .line 45
    const/4 v10, 0x7

    .line 46
    sget-object v5, La/jm40;->b:La/jm40;

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    const/4 v8, 0x0

    .line 51
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1, p0, v3, p2, v4}, La/jeb;->w(La/mm40;La/ehm0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 60
    .line 61
    .line 62
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_0
    if-eq p1, v1, :cond_2

    .line 66
    .line 67
    move p1, v2

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    move p1, v4

    .line 70
    :goto_2
    and-int/2addr p3, v2

    .line 71
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    sget-object p1, La/qmk;->a:La/zcl;

    .line 78
    .line 79
    const/high16 v9, 0x41000000    # 8.0f

    .line 80
    .line 81
    const/4 v10, 0x7

    .line 82
    sget-object v5, La/jm40;->b:La/jm40;

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v8, 0x0

    .line 87
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1, p0, v3, p2, v4}, La/jeb;->w(La/mm40;La/ehm0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 96
    .line 97
    .line 98
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
