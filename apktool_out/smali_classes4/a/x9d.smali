.class public final synthetic La/x9d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h9d;


# direct methods
.method public synthetic constructor <init>(La/h9d;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x9d;->a:B

    iput-object p1, p0, La/x9d;->b:La/h9d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/x9d;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object p0, p0, La/x9d;->b:La/h9d;

    .line 8
    .line 9
    check-cast p1, La/yhg0;

    .line 10
    .line 11
    check-cast p2, La/fet;

    .line 12
    .line 13
    check-cast p3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
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
    const/high16 p1, 0x42500000    # 52.0f

    .line 42
    .line 43
    const/high16 p3, 0x40800000    # 4.0f

    .line 44
    .line 45
    sget-object v0, La/jm40;->b:La/jm40;

    .line 46
    .line 47
    const/high16 v1, 0x40c00000    # 6.0f

    .line 48
    .line 49
    invoke-static {v0, p1, v1, p3, v1}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p0, p0, La/h9d;->b:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v2, v2, p2, p1, p0}, La/x2x;->u(IILa/fet;La/mm40;Ljava/lang/String;)V

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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    and-int/lit8 p1, p3, 0x11

    .line 69
    .line 70
    if-eq p1, v1, :cond_2

    .line 71
    .line 72
    move p1, v3

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move p1, v2

    .line 75
    :goto_2
    and-int/2addr p3, v3

    .line 76
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    sget-object p1, La/qmk;->a:La/zcl;

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    const/4 v8, 0x1

    .line 86
    sget-object v3, La/jm40;->b:La/jm40;

    .line 87
    .line 88
    const/high16 v5, 0x40c00000    # 6.0f

    .line 89
    .line 90
    const/high16 v6, 0x40800000    # 4.0f

    .line 91
    .line 92
    const/high16 v7, 0x40c00000    # 6.0f

    .line 93
    .line 94
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const/high16 p3, 0x41c00000    # 24.0f

    .line 99
    .line 100
    invoke-static {p1, p3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object p0, p0, La/h9d;->a:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v2, v2, p2, p1, p0}, La/x2x;->u(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 111
    .line 112
    .line 113
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
