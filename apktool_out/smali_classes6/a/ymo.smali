.class public final synthetic La/ymo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ehm0;


# direct methods
.method public synthetic constructor <init>(La/ehm0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ymo;->a:B

    iput-object p1, p0, La/ymo;->b:La/ehm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ymo;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object p0, p0, La/ymo;->b:La/ehm0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/g9z;

    .line 13
    .line 14
    check-cast p2, La/fet;

    .line 15
    .line 16
    check-cast p3, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    and-int/lit8 p1, p3, 0x11

    .line 26
    .line 27
    if-eq p1, v1, :cond_0

    .line 28
    .line 29
    move p1, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, v2

    .line 32
    :goto_0
    and-int/2addr p3, v3

    .line 33
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    sget-object p1, La/qmk;->a:La/zcl;

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    const/16 v8, 0xd

    .line 43
    .line 44
    sget-object v3, La/jm40;->b:La/jm40;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const/high16 v5, 0x41400000    # 12.0f

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1, p0, p2, v2}, La/rq8;->x(La/mm40;La/ehm0;La/fet;I)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 59
    .line 60
    .line 61
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    check-cast p1, La/y5d;

    .line 65
    .line 66
    check-cast p2, La/fet;

    .line 67
    .line 68
    check-cast p3, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    and-int/lit8 p1, p3, 0x11

    .line 78
    .line 79
    if-eq p1, v1, :cond_2

    .line 80
    .line 81
    move p1, v3

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    move p1, v2

    .line 84
    :goto_2
    and-int/2addr p3, v3

    .line 85
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    invoke-static {p1, p0, p2, v2, v3}, La/efx;->l(La/mm40;La/ehm0;La/fet;II)V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 97
    .line 98
    .line 99
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
