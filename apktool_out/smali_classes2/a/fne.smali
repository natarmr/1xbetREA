.class public final La/fne;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fne;->a:B

    iput-object p1, p0, La/fne;->b:Ljava/lang/Object;

    iput-object p2, p0, La/fne;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/fne;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/fne;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/fne;->c:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/ou90;

    .line 11
    .line 12
    check-cast p0, La/b3w0;

    .line 13
    .line 14
    check-cast v1, La/pu90;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iget p0, p0, La/b3w0;->o:F

    .line 18
    .line 19
    invoke-virtual {p1, v1, v0, v0, p0}, La/ou90;->g(La/pu90;IIF)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p1, Lkotlin/text/MatchResult;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast v1, La/dw00;

    .line 31
    .line 32
    iget-object v0, v1, La/dw00;->h:La/n0o0;

    .line 33
    .line 34
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 39
    .line 40
    check-cast p0, La/pls0;

    .line 41
    .line 42
    invoke-virtual {p0}, La/pls0;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {v0, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Ljava/lang/CharSequence;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_1
    check-cast p1, La/j;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    check-cast v1, La/d0x;

    .line 59
    .line 60
    check-cast p0, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v1, p1, p0}, La/d0x;->e(La/j;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 68
    .line 69
    check-cast v1, La/tu9;

    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    instance-of p0, p1, Ljava/util/concurrent/CancellationException;

    .line 74
    .line 75
    if-eqz p0, :cond_0

    .line 76
    .line 77
    invoke-virtual {v1}, La/tu9;->c()V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {v1, p1}, La/tu9;->d(Ljava/lang/Throwable;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    check-cast p0, La/kzj;

    .line 86
    .line 87
    invoke-virtual {p0}, La/pby;->B()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {v1, p0}, La/tu9;->b(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
