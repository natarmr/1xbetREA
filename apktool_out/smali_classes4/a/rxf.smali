.class public final synthetic La/rxf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/rxf;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rxf;->b:La/l7m0;

    iput-object p2, p0, La/rxf;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/rxf;->a:B

    iput-object p1, p0, La/rxf;->b:La/l7m0;

    iput-object p2, p0, La/rxf;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/rxf;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/rxf;->c:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    iget-object p0, p0, La/rxf;->b:La/l7m0;

    .line 7
    .line 8
    check-cast p1, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
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
    invoke-static {p0, v2, p1, p2}, La/yqm0;->d(La/l7m0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    and-int/lit8 v0, p2, 0x3

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    if-eq v0, v3, :cond_0

    .line 36
    .line 37
    move v0, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    :goto_0
    and-int/2addr p2, v1

    .line 41
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    new-instance p2, La/nhl0;

    .line 48
    .line 49
    const/16 v0, 0x16

    .line 50
    .line 51
    invoke-direct {p2, p0, v2, v0}, La/nhl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    const p0, -0x5e8be8ec

    .line 55
    .line 56
    .line 57
    invoke-static {p0, p2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const/16 p2, 0x30

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-static {v0, p0, p1, p2}, La/nia0;->o(La/mm40;La/ugd;La/fet;I)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 69
    .line 70
    .line 71
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v1}, La/x8x;->L(I)I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    invoke-static {p0, v2, p1, p2}, La/j2e;->n(La/l7m0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
