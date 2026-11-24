.class public final La/v5e;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/c6e;

.field public final synthetic k:Ljava/io/File;


# direct methods
.method public constructor <init>(La/c6e;Ljava/io/File;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/v5e;->j:La/c6e;

    .line 2
    .line 3
    iput-object p2, p0, La/v5e;->k:Ljava/io/File;

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
    new-instance p1, La/v5e;

    .line 2
    .line 3
    iget-object v0, p0, La/v5e;->j:La/c6e;

    .line 4
    .line 5
    iget-object p0, p0, La/v5e;->k:Ljava/io/File;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/v5e;-><init>(La/c6e;Ljava/io/File;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/v5e;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/v5e;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/v5e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-boolean v1, p0, La/v5e;->i:Z

    .line 4
    .line 5
    iget-object v2, p0, La/v5e;->k:Ljava/io/File;

    .line 6
    .line 7
    iget-object v3, p0, La/v5e;->j:La/c6e;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v4, :cond_0

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
    iget-object p1, v3, La/c6e;->h:La/h03;

    .line 29
    .line 30
    iput-boolean v4, p0, La/v5e;->i:Z

    .line 31
    .line 32
    invoke-virtual {p1, v2, p0}, La/h03;->C(Ljava/io/File;La/zje;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-ne p1, v0, :cond_2

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    :goto_0
    check-cast p1, La/a2c;

    .line 40
    .line 41
    sget-object p0, La/x1c;->a:La/x1c;

    .line 42
    .line 43
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    new-instance p0, La/r5e;

    .line 50
    .line 51
    invoke-direct {p0, p1}, La/r5e;-><init>(La/a2c;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, p0}, La/c6e;->y(La/s5e;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    new-instance p0, La/o5e;

    .line 59
    .line 60
    new-instance p1, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$FileResult;

    .line 61
    .line 62
    invoke-direct {p1, v2}, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$FileResult;-><init>(Ljava/io/File;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0, p1}, La/o5e;-><init>(Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, p0}, La/c6e;->y(La/s5e;)V

    .line 69
    .line 70
    .line 71
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0
.end method
