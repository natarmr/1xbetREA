.class public final synthetic La/clb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/c5n0;IFFLa/ugd;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput-byte v0, p0, La/clb;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/clb;->e:Ljava/lang/Object;

    iput p2, p0, La/clb;->d:I

    iput p3, p0, La/clb;->b:F

    iput p4, p0, La/clb;->c:F

    iput-object p5, p0, La/clb;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/flb;FFI)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/clb;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/clb;->e:Ljava/lang/Object;

    iput-object p2, p0, La/clb;->f:Ljava/lang/Object;

    iput p3, p0, La/clb;->b:F

    iput p4, p0, La/clb;->c:F

    iput p5, p0, La/clb;->d:I

    return-void
.end method

.method public synthetic constructor <init>(La/qa00;FFLkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/clb;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/clb;->e:Ljava/lang/Object;

    iput p2, p0, La/clb;->b:F

    iput p3, p0, La/clb;->c:F

    iput-object p4, p0, La/clb;->f:Ljava/lang/Object;

    iput p5, p0, La/clb;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/clb;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/clb;->f:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, La/clb;->d:I

    .line 7
    .line 8
    iget-object v4, p0, La/clb;->e:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v4, La/c5n0;

    .line 14
    .line 15
    check-cast v2, La/ugd;

    .line 16
    .line 17
    check-cast p1, La/fet;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    and-int/lit8 v0, p2, 0x3

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    if-eq v0, v5, :cond_0

    .line 30
    .line 31
    move v0, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v6

    .line 34
    :goto_0
    and-int/2addr p2, v1

    .line 35
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    sget-object p2, La/qmk;->a:La/zcl;

    .line 42
    .line 43
    invoke-interface {v4, v3}, La/w6k;->r0(I)F

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    iget v0, p0, La/clb;->b:F

    .line 48
    .line 49
    iget p0, p0, La/clb;->c:F

    .line 50
    .line 51
    mul-float/2addr v0, p0

    .line 52
    sub-float/2addr p2, v0

    .line 53
    const/4 p0, 0x0

    .line 54
    invoke-static {p0, p2}, Ljava/lang/Math;->max(FF)F

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    const/16 v0, 0xd

    .line 59
    .line 60
    invoke-static {p0, p2, p0, p0, v0}, La/s5x0;->u(FFFFI)La/lh80;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {v2, p0, p1, p2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 73
    .line 74
    .line 75
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_0
    move-object v0, v4

    .line 79
    check-cast v0, La/qa00;

    .line 80
    .line 81
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 82
    .line 83
    move-object v4, p1

    .line 84
    check-cast v4, La/fet;

    .line 85
    .line 86
    check-cast p2, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    or-int/lit8 p1, v3, 0x1

    .line 92
    .line 93
    invoke-static {p1}, La/x8x;->L(I)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    iget v1, p0, La/clb;->b:F

    .line 98
    .line 99
    move-object v3, v2

    .line 100
    iget v2, p0, La/clb;->c:F

    .line 101
    .line 102
    invoke-static/range {v0 .. v5}, La/g8x;->s(La/qa00;FFLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 103
    .line 104
    .line 105
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_1
    move-object v0, v4

    .line 109
    check-cast v0, La/mm40;

    .line 110
    .line 111
    check-cast v2, La/flb;

    .line 112
    .line 113
    move-object v4, p1

    .line 114
    check-cast v4, La/fet;

    .line 115
    .line 116
    check-cast p2, Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    or-int/lit8 p1, v3, 0x1

    .line 122
    .line 123
    invoke-static {p1}, La/x8x;->L(I)I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    move-object v1, v2

    .line 128
    iget v2, p0, La/clb;->b:F

    .line 129
    .line 130
    iget v3, p0, La/clb;->c:F

    .line 131
    .line 132
    invoke-static/range {v0 .. v5}, La/ntr;->j(La/mm40;La/flb;FFLa/fet;I)V

    .line 133
    .line 134
    .line 135
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
