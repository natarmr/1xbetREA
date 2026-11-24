.class public final synthetic La/fcr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jcr0;


# direct methods
.method public synthetic constructor <init>(La/jcr0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/fcr0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fcr0;->b:La/jcr0;

    return-void
.end method

.method public synthetic constructor <init>(La/jcr0;I)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput-byte p2, p0, La/fcr0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fcr0;->b:La/jcr0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/fcr0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/fcr0;->b:La/jcr0;

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
    invoke-static {p0, p1, p2}, La/ju70;->G(La/jcr0;La/fet;I)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    move-object v9, p1

    .line 27
    check-cast v9, La/fet;

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
    const/4 v2, 0x0

    .line 39
    if-eq p2, v0, :cond_0

    .line 40
    .line 41
    move p2, v1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move p2, v2

    .line 44
    :goto_0
    and-int/2addr p1, v1

    .line 45
    invoke-virtual {v9, p1, p2}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    const/4 p1, 0x3

    .line 52
    invoke-static {v2, v2, v9, v2, p1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 57
    .line 58
    invoke-virtual {v9, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    sget-object p1, La/ukd;->a:La/cl5;

    .line 69
    .line 70
    if-ne p2, p1, :cond_2

    .line 71
    .line 72
    :cond_1
    new-instance p2, La/nop0;

    .line 73
    .line 74
    const/16 p1, 0x1d

    .line 75
    .line 76
    invoke-direct {p2, p0, p1}, La/nop0;-><init>(Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    move-object v8, p2

    .line 83
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 84
    .line 85
    const/4 v10, 0x6

    .line 86
    const/16 v11, 0x1fc

    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    const/4 v3, 0x0

    .line 90
    const/4 v4, 0x0

    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    invoke-static/range {v0 .. v11}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-virtual {v9}, La/fet;->X()V

    .line 99
    .line 100
    .line 101
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
