.class public final La/r450;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tf40;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(La/tf40;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/r450;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/r450;->b:La/tf40;

    .line 8
    .line 9
    iput-object p2, p0, La/r450;->c:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;La/tf40;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/r450;->a:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/r450;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/r450;->b:La/tf40;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/r450;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/r450;->b:La/tf40;

    .line 4
    .line 5
    iget-object p0, p0, La/r450;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v1, La/gf40;

    .line 11
    .line 12
    iget-object v0, v1, La/gf40;->a:La/ozh;

    .line 13
    .line 14
    instance-of v1, v0, La/kzh;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v1, La/m350;

    .line 19
    .line 20
    check-cast v0, La/kzh;

    .line 21
    .line 22
    iget-wide v2, v0, La/kzh;->o:J

    .line 23
    .line 24
    invoke-direct {v1, v2, v3}, La/m350;-><init>(J)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    instance-of v1, v0, La/izh;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    check-cast v0, La/izh;

    .line 36
    .line 37
    iget-object v1, v0, La/izh;->s:La/qll;

    .line 38
    .line 39
    sget-object v2, La/qll;->c:La/qll;

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    new-instance v1, La/n350;

    .line 44
    .line 45
    iget v2, v0, La/izh;->q:I

    .line 46
    .line 47
    iget-wide v3, v0, La/izh;->t:J

    .line 48
    .line 49
    invoke-direct {v1, v2, v3, v4}, La/n350;-><init>(IJ)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    sget-object v0, La/o350;->a:La/o350;

    .line 57
    .line 58
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    new-instance v0, La/i350;

    .line 65
    .line 66
    check-cast v1, La/jf40;

    .line 67
    .line 68
    iget-object v1, v1, La/jf40;->a:La/mqv;

    .line 69
    .line 70
    invoke-direct {v0, v1}, La/i350;-><init>(La/mqv;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
