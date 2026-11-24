.class public final synthetic La/j9q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qy6;


# direct methods
.method public synthetic constructor <init>(La/qy6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j9q;->a:B

    iput-object p1, p0, La/j9q;->b:La/qy6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/j9q;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/j9q;->b:La/qy6;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    check-cast p1, La/y5d;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
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
    iget-object p0, p0, La/qy6;->a:La/vf40;

    .line 40
    .line 41
    iget-object p0, p0, La/vf40;->a:La/pgs;

    .line 42
    .line 43
    check-cast p0, La/igs;

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-static {p1, p0, p2, v2}, La/qcc;->r(La/mm40;La/igs;La/fet;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 51
    .line 52
    .line 53
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_0
    move-object v8, p2

    .line 57
    check-cast v8, La/fet;

    .line 58
    .line 59
    check-cast p3, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    and-int/lit8 p1, p2, 0x11

    .line 69
    .line 70
    if-eq p1, v1, :cond_2

    .line 71
    .line 72
    move v2, v3

    .line 73
    :cond_2
    and-int/lit8 p1, p2, 0x1

    .line 74
    .line 75
    invoke-virtual {v8, p1, v2}, La/fet;->U(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    sget-object p1, La/qmk;->a:La/zcl;

    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    const/4 p2, 0x2

    .line 85
    sget-object p3, La/jm40;->b:La/jm40;

    .line 86
    .line 87
    const/high16 v0, 0x41400000    # 12.0f

    .line 88
    .line 89
    invoke-static {p3, v0, p1, p2}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iget-object p1, p0, La/qy6;->a:La/vf40;

    .line 94
    .line 95
    iget-object v5, p1, La/vf40;->b:La/j43;

    .line 96
    .line 97
    new-instance p1, La/j9q;

    .line 98
    .line 99
    invoke-direct {p1, p0, v3}, La/j9q;-><init>(La/qy6;B)V

    .line 100
    .line 101
    .line 102
    const p0, 0x672913fe

    .line 103
    .line 104
    .line 105
    invoke-static {p0, p1, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    const/16 v9, 0xd80

    .line 110
    .line 111
    const/4 v6, 0x0

    .line 112
    invoke-static/range {v4 .. v9}, La/q8x;->i(La/mm40;La/j43;La/xdr;La/ugd;La/fet;I)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    invoke-virtual {v8}, La/fet;->X()V

    .line 117
    .line 118
    .line 119
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
