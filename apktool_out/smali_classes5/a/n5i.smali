.class public final synthetic La/n5i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w9n;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/w9n;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/n5i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n5i;->b:La/w9n;

    iput-object p2, p0, La/n5i;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/w9n;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput-byte p3, p0, La/n5i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n5i;->b:La/w9n;

    iput-object p2, p0, La/n5i;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/n5i;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/n5i;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/n5i;->b:La/w9n;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/16 p2, 0x181

    .line 18
    .line 19
    invoke-static {p2}, La/x8x;->L(I)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-static {p0, v1, p1, p2}, La/jar0;->M(La/w9n;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    move-object v5, p1

    .line 30
    check-cast v5, La/fet;

    .line 31
    .line 32
    check-cast p2, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    and-int/lit8 p2, p1, 0x3

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    const/4 v2, 0x1

    .line 42
    if-eq p2, v0, :cond_0

    .line 43
    .line 44
    move p2, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p2, 0x0

    .line 47
    :goto_0
    and-int/2addr p1, v2

    .line 48
    invoke-virtual {v5, p1, p2}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    invoke-interface {p0}, La/w9n;->r()La/o0x;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object p1, v1

    .line 59
    invoke-interface {p0}, La/w9n;->w()La/o0x;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v5, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-nez p2, :cond_1

    .line 72
    .line 73
    sget-object p2, La/ukd;->a:La/cl5;

    .line 74
    .line 75
    if-ne v2, p2, :cond_2

    .line 76
    .line 77
    :cond_1
    new-instance v2, La/olh;

    .line 78
    .line 79
    const/16 p2, 0x8

    .line 80
    .line 81
    invoke-direct {v2, p1, p2}, La/olh;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 88
    .line 89
    sget-object v3, La/phu0;->b:La/ugd;

    .line 90
    .line 91
    new-instance p1, La/tx;

    .line 92
    .line 93
    const/16 p2, 0x11

    .line 94
    .line 95
    invoke-direct {p1, p0, p2}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 96
    .line 97
    .line 98
    const p0, 0x6655badb

    .line 99
    .line 100
    .line 101
    invoke-static {p0, p1, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const/16 v6, 0x6c00

    .line 106
    .line 107
    invoke-static/range {v0 .. v6}, La/ibm0;->e(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;La/xdr;La/ugd;La/fet;I)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    invoke-virtual {v5}, La/fet;->X()V

    .line 112
    .line 113
    .line 114
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
