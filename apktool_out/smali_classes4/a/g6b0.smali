.class public final La/g6b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j6b0;


# direct methods
.method public synthetic constructor <init>(La/j6b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g6b0;->a:B

    iput-object p1, p0, La/g6b0;->b:La/j6b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/g6b0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p1, La/pnf0;->c:La/pnf0;

    .line 15
    .line 16
    sget p2, La/j6b0;->F:I

    .line 17
    .line 18
    iget-object p0, p0, La/g6b0;->b:La/j6b0;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, La/j6b0;->M(La/pnf0;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, La/g6b0;->b(Ljava/util/List;La/yje;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/util/List;La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/f6b0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/f6b0;

    .line 7
    .line 8
    iget v1, v0, La/f6b0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/f6b0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/f6b0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/f6b0;-><init>(La/g6b0;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/f6b0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/f6b0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    iget-object p0, p0, La/g6b0;->b:La/j6b0;

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, La/f6b0;->i:Ljava/util/List;

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p2, p0, La/j6b0;->C:La/bby;

    .line 55
    .line 56
    invoke-static {p2}, La/v3c;->N(La/bby;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, La/j6b0;->o:La/z7z;

    .line 60
    .line 61
    invoke-interface {p2}, La/z7z;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    check-cast p2, La/hjd;

    .line 66
    .line 67
    new-instance v2, La/did;

    .line 68
    .line 69
    invoke-direct {v2, p1}, La/did;-><init>(Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, v0, La/f6b0;->i:Ljava/util/List;

    .line 73
    .line 74
    iput v3, v0, La/f6b0;->l:I

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v2, v0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-ne p2, v1, :cond_3

    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_3
    :goto_1
    new-instance p2, La/bdt;

    .line 87
    .line 88
    invoke-direct {p2, p1}, La/bdt;-><init>(Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    sget p1, La/j6b0;->F:I

    .line 92
    .line 93
    invoke-virtual {p0, p2}, La/j6b0;->N(La/pdt;)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0
.end method
