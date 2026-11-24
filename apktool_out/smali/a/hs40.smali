.class public final La/hs40;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hs40;->a:B

    iput-object p1, p0, La/hs40;->b:Ljava/lang/Object;

    iput-object p2, p0, La/hs40;->c:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/hs40;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/hs40;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/hs40;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    and-int/lit8 p2, p2, 0x3

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    if-ne p2, v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, La/fet;->D()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-nez p2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, La/fet;->X()V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    check-cast p0, La/ugd;

    .line 35
    .line 36
    check-cast v1, La/nt40;

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p0, v1, p1, p2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    check-cast p1, La/dpa0;

    .line 50
    .line 51
    check-cast p2, La/ne60;

    .line 52
    .line 53
    iget-wide v4, p2, La/ne60;->a:J

    .line 54
    .line 55
    check-cast p0, La/j6u0;

    .line 56
    .line 57
    invoke-static {p0, p1}, La/dqm0;->l(La/j6u0;La/dpa0;)V

    .line 58
    .line 59
    .line 60
    check-cast v1, La/htb;

    .line 61
    .line 62
    new-instance v2, La/js40;

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    const-wide/16 v6, 0x0

    .line 66
    .line 67
    invoke-direct/range {v2 .. v7}, La/js40;-><init>(ZJJ)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1, v2}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
