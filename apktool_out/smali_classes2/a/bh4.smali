.class public final La/bh4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:La/fh4;


# direct methods
.method public constructor <init>(La/fh4;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/bh4;->i:La/fh4;

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
    new-instance p1, La/bh4;

    .line 2
    .line 3
    iget-object p0, p0, La/bh4;->i:La/fh4;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/bh4;-><init>(La/fh4;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/bh4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/bh4;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/bh4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget p1, La/fh4;->c0:I

    .line 7
    .line 8
    iget-object p0, p0, La/bh4;->i:La/fh4;

    .line 9
    .line 10
    iget-object p1, p0, La/fh4;->x:La/i1w0;

    .line 11
    .line 12
    new-instance v0, La/qg4;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, La/qg4;-><init>(La/fh4;B)V

    .line 16
    .line 17
    .line 18
    const-string v1, "PICKER_DIALOG_SHOWN_KEY"

    .line 19
    .line 20
    invoke-virtual {p1, v1, v0}, La/i1w0;->f(Ljava/lang/String;La/t2g0;)La/uq;

    .line 21
    .line 22
    .line 23
    new-instance v0, La/qg4;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, p0, v1}, La/qg4;-><init>(La/fh4;B)V

    .line 27
    .line 28
    .line 29
    const-string v1, "PICKER_DIALOG_ITEM_SELECTED_KEY"

    .line 30
    .line 31
    invoke-virtual {p1, v1, v0}, La/i1w0;->f(Ljava/lang/String;La/t2g0;)La/uq;

    .line 32
    .line 33
    .line 34
    new-instance v0, La/qg4;

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    invoke-direct {v0, p0, v1}, La/qg4;-><init>(La/fh4;B)V

    .line 38
    .line 39
    .line 40
    const-string v1, "PICKER_DIALOG_PHONE_CODE_BY_MANUALLY_KEY"

    .line 41
    .line 42
    invoke-virtual {p1, v1, v0}, La/i1w0;->f(Ljava/lang/String;La/t2g0;)La/uq;

    .line 43
    .line 44
    .line 45
    new-instance v0, La/rg4;

    .line 46
    .line 47
    const/4 v1, 0x6

    .line 48
    invoke-direct {v0, p0, v1}, La/rg4;-><init>(La/fh4;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0
.end method
