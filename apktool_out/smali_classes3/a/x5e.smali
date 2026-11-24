.class public final La/x5e;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/c6e;

.field public j:Ljava/util/Iterator;

.field public k:Z

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:La/c6e;


# direct methods
.method public constructor <init>(Ljava/util/List;La/c6e;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x5e;->l:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, La/x5e;->m:La/c6e;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, La/x5e;

    .line 2
    .line 3
    iget-object v0, p0, La/x5e;->l:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, La/x5e;->m:La/c6e;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/x5e;-><init>(Ljava/util/List;La/c6e;La/yje;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, La/x5e;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/x5e;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/x5e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/x5e;->k:Z

    .line 4
    .line 5
    iget-object v2, p0, La/x5e;->m:La/c6e;

    .line 6
    .line 7
    iget-object v3, p0, La/x5e;->l:Ljava/util/List;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v4, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, La/x5e;->j:Ljava/util/Iterator;

    .line 16
    .line 17
    iget-object v6, p0, La/x5e;->i:La/c6e;

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v5

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    move-object v1, p1

    .line 37
    move-object v6, v2

    .line 38
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_5

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/io/File;

    .line 49
    .line 50
    iget-object v7, v6, La/c6e;->h:La/h03;

    .line 51
    .line 52
    iput-object v6, p0, La/x5e;->i:La/c6e;

    .line 53
    .line 54
    iput-object v1, p0, La/x5e;->j:Ljava/util/Iterator;

    .line 55
    .line 56
    iput-boolean v4, p0, La/x5e;->k:Z

    .line 57
    .line 58
    invoke-virtual {v7, p1, p0}, La/h03;->C(Ljava/io/File;La/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_3
    :goto_0
    check-cast p1, La/a2c;

    .line 66
    .line 67
    sget-object v7, La/x1c;->a:La/x1c;

    .line 68
    .line 69
    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-nez v7, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    move-object p1, v5

    .line 77
    :goto_1
    if-eqz p1, :cond_2

    .line 78
    .line 79
    move-object v5, p1

    .line 80
    :cond_5
    if-eqz v5, :cond_6

    .line 81
    .line 82
    new-instance p0, La/r5e;

    .line 83
    .line 84
    invoke-direct {p0, v5}, La/r5e;-><init>(La/a2c;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, p0}, La/c6e;->y(La/s5e;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_6
    new-instance p0, La/o5e;

    .line 92
    .line 93
    new-instance p1, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$ImageResult;

    .line 94
    .line 95
    invoke-direct {p1, v3}, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$ImageResult;-><init>(Ljava/util/List;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p0, p1}, La/o5e;-><init>(Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, p0}, La/c6e;->y(La/s5e;)V

    .line 102
    .line 103
    .line 104
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0
.end method
