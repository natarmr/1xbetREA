.class public final synthetic La/kjk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ljk;


# direct methods
.method public synthetic constructor <init>(La/ljk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kjk;->a:B

    iput-object p1, p0, La/kjk;->b:La/ljk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/kjk;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/kjk;->b:La/ljk;

    .line 7
    .line 8
    check-cast p1, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    and-int/lit8 v0, p2, 0x3

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    move v0, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v3

    .line 26
    :goto_0
    and-int/2addr p2, v2

    .line 27
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    iget-object p0, p0, La/ljk;->b:La/ob50;

    .line 34
    .line 35
    invoke-virtual {p0, v3, p1}, La/ob50;->a(ILa/fet;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 40
    .line 41
    .line 42
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 46
    .line 47
    if-eq v0, v1, :cond_2

    .line 48
    .line 49
    move v3, v2

    .line 50
    :cond_2
    and-int/2addr p2, v2

    .line 51
    invoke-virtual {p1, p2, v3}, La/fet;->U(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_3

    .line 56
    .line 57
    const/4 p2, 0x0

    .line 58
    const/4 v0, 0x3

    .line 59
    invoke-static {p2, p1, v0}, La/r8x;->V(La/lkz;La/fet;I)La/wjd;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    iget-object v0, p0, La/ljk;->f:La/rip;

    .line 64
    .line 65
    iget-object v1, p0, La/ljk;->e:La/fjk;

    .line 66
    .line 67
    new-instance v2, La/cxj;

    .line 68
    .line 69
    const/4 v3, 0x6

    .line 70
    invoke-direct {v2, p2, p0, v3}, La/cxj;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    const p0, -0x277e92aa

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const/16 p2, 0x180

    .line 81
    .line 82
    invoke-static {v0, v1, p0, p1, p2}, La/y9a;->q(Lkotlin/jvm/functions/Function0;La/fjk;La/ugd;La/fet;I)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 87
    .line 88
    .line 89
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
