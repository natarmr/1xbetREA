.class public final synthetic La/hke0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kke0;


# direct methods
.method public synthetic constructor <init>(La/kke0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/hke0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hke0;->b:La/kke0;

    return-void
.end method

.method public synthetic constructor <init>(La/kke0;I)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput-byte p2, p0, La/hke0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hke0;->b:La/kke0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/hke0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/hke0;->b:La/kke0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, La/x8x;->L(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-static {p0, p1, p2}, La/rq8;->j(La/kke0;La/fet;I)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    move-object v3, p1

    .line 27
    check-cast v3, La/fet;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    and-int/lit8 p2, p1, 0x3

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    if-eq p2, v0, :cond_0

    .line 39
    .line 40
    move p2, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p2, 0x0

    .line 43
    :goto_0
    and-int/2addr p1, v1

    .line 44
    invoke-virtual {v3, p1, p2}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_4

    .line 49
    .line 50
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 51
    .line 52
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/16 p2, 0x1b

    .line 57
    .line 58
    sget-object v0, La/ukd;->a:La/cl5;

    .line 59
    .line 60
    if-ne p1, v0, :cond_1

    .line 61
    .line 62
    new-instance p1, La/bod0;

    .line 63
    .line 64
    invoke-direct {p1, p2}, La/bod0;-><init>(B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 71
    .line 72
    invoke-virtual {v3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    if-nez v2, :cond_2

    .line 81
    .line 82
    if-ne v4, v0, :cond_3

    .line 83
    .line 84
    :cond_2
    new-instance v4, La/v6d0;

    .line 85
    .line 86
    invoke-direct {v4, p0, p2}, La/v6d0;-><init>(Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    move-object v2, v4

    .line 93
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 94
    .line 95
    const/16 v4, 0x36

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    move-object v0, p1

    .line 99
    invoke-static/range {v0 .. v5}, La/dwi0;->b(Lkotlin/jvm/functions/Function1;La/mm40;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    invoke-virtual {v3}, La/fet;->X()V

    .line 104
    .line 105
    .line 106
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
