.class public final synthetic La/hla0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ola0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/ola0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/hla0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hla0;->b:La/ola0;

    iput-object p2, p0, La/hla0;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/ola0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput-byte p3, p0, La/hla0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hla0;->b:La/ola0;

    iput-object p2, p0, La/hla0;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/hla0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/hla0;->c:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iget-object p0, p0, La/hla0;->b:La/ola0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/fet;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {p0, v2, p1, p2}, La/knx;->q(La/ola0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    move-object v5, p1

    .line 29
    check-cast v5, La/fet;

    .line 30
    .line 31
    check-cast p2, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    and-int/lit8 p2, p1, 0x3

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    const/4 v8, 0x0

    .line 41
    if-eq p2, v0, :cond_0

    .line 42
    .line 43
    move p2, v1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move p2, v8

    .line 46
    :goto_0
    and-int/2addr p1, v1

    .line 47
    invoke-virtual {v5, p1, p2}, La/fet;->U(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    iget-boolean p1, p0, La/ola0;->f:Z

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    const p1, -0x7f4e34a6

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, p1}, La/fet;->e0(I)V

    .line 61
    .line 62
    .line 63
    sget-object p1, La/jm40;->b:La/jm40;

    .line 64
    .line 65
    const/high16 p2, 0x3f800000    # 1.0f

    .line 66
    .line 67
    invoke-static {p1, p2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, p0, La/ola0;->g:La/fyl;

    .line 72
    .line 73
    move-object p0, v2

    .line 74
    sget-object v2, La/vxl;->b:La/vxl;

    .line 75
    .line 76
    invoke-virtual {v5, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-nez p1, :cond_1

    .line 85
    .line 86
    sget-object p1, La/ukd;->a:La/cl5;

    .line 87
    .line 88
    if-ne p2, p1, :cond_2

    .line 89
    .line 90
    :cond_1
    new-instance p2, La/hs80;

    .line 91
    .line 92
    const/16 p1, 0x17

    .line 93
    .line 94
    invoke-direct {p2, p0, p1}, La/hs80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_2
    move-object v3, p2

    .line 101
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 102
    .line 103
    const/16 v6, 0x186

    .line 104
    .line 105
    const/16 v7, 0x28

    .line 106
    .line 107
    const/4 v4, 0x0

    .line 108
    invoke-static/range {v0 .. v7}, La/ebc;->r(La/mm40;La/hyl;La/vxl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    const p0, -0x7f4887e3

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, p0}, La/fet;->e0(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    invoke-virtual {v5}, La/fet;->X()V

    .line 126
    .line 127
    .line 128
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
