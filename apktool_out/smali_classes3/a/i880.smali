.class public final La/i880;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/gnu;

.field public j:Z

.field public final synthetic k:La/n880;


# direct methods
.method public constructor <init>(La/n880;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/i880;->k:La/n880;

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
    new-instance p1, La/i880;

    .line 2
    .line 3
    iget-object p0, p0, La/i880;->k:La/n880;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/i880;-><init>(La/n880;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/i880;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/i880;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/i880;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/i880;->j:Z

    .line 4
    .line 5
    iget-object v2, p0, La/i880;->k:La/n880;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/i880;->i:La/gnu;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v2, La/n880;->F:La/chf0;

    .line 29
    .line 30
    iget-object v1, p1, La/chf0;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, La/zg;

    .line 33
    .line 34
    iget-object v1, v1, La/zg;->a:La/kt2;

    .line 35
    .line 36
    const-string v4, "call_back_country_call"

    .line 37
    .line 38
    invoke-interface {v1, v4}, La/kt2;->c(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, La/chf0;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, La/au0;

    .line 44
    .line 45
    iget-object p1, p1, La/au0;->a:La/s1p;

    .line 46
    .line 47
    const-wide/16 v4, 0x2a64

    .line 48
    .line 49
    sget-object v1, La/xun;->a:La/xun;

    .line 50
    .line 51
    invoke-virtual {p1, v1, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 52
    .line 53
    .line 54
    iget-object p1, v2, La/n880;->r:La/gnu;

    .line 55
    .line 56
    iget-object v1, v2, La/n880;->s:La/ali;

    .line 57
    .line 58
    iput-object p1, p0, La/i880;->i:La/gnu;

    .line 59
    .line 60
    iput-boolean v3, p0, La/i880;->j:Z

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-virtual {v1, v4, p0}, La/ali;->r(ZLa/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, v0, :cond_2

    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_2
    move-object v6, p1

    .line 71
    move-object p1, p0

    .line 72
    move-object p0, v6

    .line 73
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, La/gnu;->c(Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    new-instance p0, La/v780;

    .line 79
    .line 80
    new-instance p1, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 81
    .line 82
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, La/y780;

    .line 87
    .line 88
    iget-object v0, v0, La/y780;->f:Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-direct {p1, v0, v3, v3}, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;-><init>(Ljava/lang/Integer;ZZ)V

    .line 91
    .line 92
    .line 93
    invoke-direct {p0, p1}, La/v780;-><init>(Lorg/xplatform/picker/api/presentation/PickerParams$Phone;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0
.end method
