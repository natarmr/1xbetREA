.class public final La/tsa;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public synthetic i:Ljava/util/List;

.field public synthetic j:I

.field public synthetic k:I

.field public final synthetic l:La/wsa;


# direct methods
.method public constructor <init>(La/wsa;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/tsa;->l:La/wsa;

    .line 2
    .line 3
    const/4 p1, 0x4

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v4, p0, La/tsa;->i:Ljava/util/List;

    .line 2
    .line 3
    iget v5, p0, La/tsa;->j:I

    .line 4
    .line 5
    iget v6, p0, La/tsa;->k:I

    .line 6
    .line 7
    sget-object v0, La/wne;->a:La/wne;

    .line 8
    .line 9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v7, p0, La/tsa;->l:La/wsa;

    .line 13
    .line 14
    iget-object v8, v7, La/wsa;->u:La/hjd;

    .line 15
    .line 16
    new-instance v9, La/did;

    .line 17
    .line 18
    invoke-direct {v9, v4}, La/did;-><init>(Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x6

    .line 23
    const/4 v10, 0x0

    .line 24
    invoke-static/range {v7 .. v12}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 25
    .line 26
    .line 27
    iget-object p0, v7, La/i3t0;->i:La/ocj;

    .line 28
    .line 29
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-object v0, p1

    .line 39
    check-cast v0, La/gsa;

    .line 40
    .line 41
    const/4 v10, 0x0

    .line 42
    const/16 v11, 0xf83

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    invoke-static/range {v0 .. v11}, La/gsa;->a(La/gsa;La/rra;La/om5;ZLjava/util/List;IILa/dta;ZZLjava/lang/String;I)La/gsa;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    check-cast p4, La/yje;

    .line 16
    .line 17
    new-instance v0, La/tsa;

    .line 18
    .line 19
    iget-object p0, p0, La/tsa;->l:La/wsa;

    .line 20
    .line 21
    invoke-direct {v0, p0, p4}, La/tsa;-><init>(La/wsa;La/yje;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, v0, La/tsa;->i:Ljava/util/List;

    .line 25
    .line 26
    iput p2, v0, La/tsa;->j:I

    .line 27
    .line 28
    iput p3, v0, La/tsa;->k:I

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, La/tsa;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
