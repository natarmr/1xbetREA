.class public final synthetic La/lno0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:F

.field public final synthetic d:La/zyn;


# direct methods
.method public synthetic constructor <init>(FLa/zyn;La/ugd;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/lno0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/lno0;->c:F

    iput-object p2, p0, La/lno0;->d:La/zyn;

    iput-object p3, p0, La/lno0;->b:La/ugd;

    return-void
.end method

.method public synthetic constructor <init>(La/ugd;FLa/zyn;I)V
    .locals 0

    .line 2
    const/4 p4, 0x1

    iput-byte p4, p0, La/lno0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lno0;->b:La/ugd;

    iput p2, p0, La/lno0;->c:F

    iput-object p3, p0, La/lno0;->d:La/zyn;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/lno0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/lno0;->d:La/zyn;

    .line 4
    .line 5
    iget v2, p0, La/lno0;->c:F

    .line 6
    .line 7
    iget-object p0, p0, La/lno0;->b:La/ugd;

    .line 8
    .line 9
    check-cast p1, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x7

    .line 20
    invoke-static {p2}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p0, v2, v1, p1, p2}, La/y0x0;->l(La/ugd;FLa/zyn;La/fet;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    and-int/lit8 v0, p2, 0x3

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x1

    .line 39
    if-eq v0, v3, :cond_0

    .line 40
    .line 41
    move v0, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v0, v4

    .line 44
    :goto_0
    and-int/2addr p2, v5

    .line 45
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_3

    .line 50
    .line 51
    sget-object p2, La/jm40;->b:La/jm40;

    .line 52
    .line 53
    invoke-static {p2}, La/lgb;->K(La/mm40;)La/mm40;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-static {p2, v0, v2, v5}, La/o7k0;->g(La/mm40;FFI)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p1, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    sget-object v0, La/ukd;->a:La/cl5;

    .line 73
    .line 74
    if-ne v2, v0, :cond_2

    .line 75
    .line 76
    :cond_1
    new-instance v2, La/mno0;

    .line 77
    .line 78
    invoke-direct {v2, v1}, La/mno0;-><init>(La/zyn;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    check-cast v2, La/mno0;

    .line 85
    .line 86
    invoke-static {p2, v2, p0, p1, v4}, La/y0x0;->B(La/mm40;La/mno0;La/ugd;La/fet;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 91
    .line 92
    .line 93
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
