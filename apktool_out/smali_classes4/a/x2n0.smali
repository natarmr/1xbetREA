.class public final La/x2n0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/fnu;

.field public j:Ljava/lang/String;

.field public k:Z

.field public final synthetic l:La/a3n0;


# direct methods
.method public constructor <init>(La/a3n0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x2n0;->l:La/a3n0;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/x2n0;

    .line 2
    .line 3
    iget-object p0, p0, La/x2n0;->l:La/a3n0;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/x2n0;-><init>(La/a3n0;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/x2n0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/x2n0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/x2n0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/x2n0;->k:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/x2n0;->l:La/a3n0;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, La/x2n0;->j:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p0, p0, La/x2n0;->i:La/fnu;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v3, La/a3n0;->z:La/fnu;

    .line 31
    .line 32
    iget-object v1, v3, La/a3n0;->A:La/ntu;

    .line 33
    .line 34
    invoke-virtual {v1}, La/ntu;->a()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v4, v3, La/a3n0;->B:La/bot;

    .line 39
    .line 40
    iput-object p1, p0, La/x2n0;->i:La/fnu;

    .line 41
    .line 42
    iput-object v1, p0, La/x2n0;->j:Ljava/lang/String;

    .line 43
    .line 44
    iput-boolean v2, p0, La/x2n0;->k:Z

    .line 45
    .line 46
    iget-object v2, v4, La/bot;->a:La/uqe;

    .line 47
    .line 48
    invoke-virtual {v2, p0}, La/uqe;->d(La/zje;)Ljava/io/Serializable;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-ne p0, v0, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    move-object v0, p1

    .line 56
    move-object p1, p0

    .line 57
    move-object p0, v0

    .line 58
    move-object v0, v1

    .line 59
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 60
    .line 61
    invoke-virtual {p0, v0, p1}, La/fnu;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    new-instance p0, La/u0n0;

    .line 65
    .line 66
    new-instance p1, Lorg/xplatform/picker/api/presentation/PickerParams$Country;

    .line 67
    .line 68
    iget-object v0, v3, La/a3n0;->L:La/cre;

    .line 69
    .line 70
    iget v0, v0, La/cre;->a:I

    .line 71
    .line 72
    new-instance v1, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p1, v1}, Lorg/xplatform/picker/api/presentation/PickerParams$Country;-><init>(Ljava/lang/Integer;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0, p1}, La/u0n0;-><init>(Lorg/xplatform/picker/api/presentation/PickerParams$Country;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, v3, La/a3n0;->p:La/ctf0;

    .line 87
    .line 88
    iget-object p1, v3, La/a3n0;->L:La/cre;

    .line 89
    .line 90
    iget-object p1, p1, La/cre;->b:Ljava/lang/String;

    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    new-array v0, v0, [Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {p0, p1, v0}, La/ctf0;->e(La/ctf0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0
.end method
