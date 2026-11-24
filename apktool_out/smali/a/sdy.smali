.class public final La/sdy;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public j:Z

.field public synthetic k:La/jrj;

.field public final synthetic l:La/u3u0;


# direct methods
.method public constructor <init>(La/u3u0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/sdy;->l:La/u3u0;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, La/zzf0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/jrj;

    .line 2
    .line 3
    check-cast p2, Lkotlin/Unit;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    new-instance p2, La/sdy;

    .line 8
    .line 9
    iget-object p0, p0, La/sdy;->l:La/u3u0;

    .line 10
    .line 11
    invoke-direct {p2, p0, p3}, La/sdy;-><init>(La/u3u0;La/yje;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p2, La/sdy;->k:La/jrj;

    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p2, p0}, La/sdy;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/sdy;->l:La/u3u0;

    .line 2
    .line 3
    iget-object v1, v0, La/u3u0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/fp;

    .line 6
    .line 7
    iget-object v2, p0, La/sdy;->k:La/jrj;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-boolean v4, p0, La/sdy;->j:Z

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x1

    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    if-ne v4, v6, :cond_0

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
    invoke-virtual {v1}, La/fp;->F()B

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-ne p1, v6, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, v6}, La/u3u0;->k(Z)La/jdy;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_2
    const/4 v4, 0x0

    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0, v4}, La/u3u0;->k(Z)La/jdy;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_3
    const/4 v7, 0x6

    .line 52
    if-ne p1, v7, :cond_5

    .line 53
    .line 54
    iput-object v5, p0, La/sdy;->k:La/jrj;

    .line 55
    .line 56
    iput-boolean v6, p0, La/sdy;->j:Z

    .line 57
    .line 58
    invoke-virtual {v0, v2, p0}, La/u3u0;->i(La/jrj;La/zw5;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v3, :cond_4

    .line 63
    .line 64
    return-object v3

    .line 65
    :cond_4
    :goto_0
    check-cast p1, La/mcy;

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_5
    const/16 p0, 0x8

    .line 69
    .line 70
    if-ne p1, p0, :cond_6

    .line 71
    .line 72
    invoke-virtual {v0}, La/u3u0;->h()La/yby;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_6
    const-string p0, "Can\'t begin reading element, unexpected token"

    .line 78
    .line 79
    invoke-static {v1, p0, v4, v5, v7}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    throw v5
.end method
